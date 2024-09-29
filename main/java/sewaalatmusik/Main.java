package sewaalatmusik;

import model.AlatMusik;  // Mengimpor kelas dari package model
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Daftar untuk menyimpan alat musik yang disewa
        ArrayList<AlatMusik> daftarSewa = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean keluar = false;

        while (!keluar) {
            System.out.println("=== Sistem Sewa Alat Musik ===");
            System.out.println("1. Tambah Alat Musik");
            System.out.println("2. Hapus Alat Musik");
            System.out.println("3. Lihat Daftar Alat Musik yang Disewa");
            System.out.println("4. Total Alat Musik yang Disewa");
            System.out.println("5. Update Alat Musik");
            System.out.println("6. Keluar");
            System.out.print("Pilih opsi: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();  // Konsumsi newline

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama alat musik: ");
                    String namaAlat = scanner.nextLine();
                    System.out.print("Masukkan jenis alat musik: ");
                    String jenisAlat = scanner.nextLine();
                    System.out.print("Masukkan harga sewa: ");
                    double hargaSewa = scanner.nextDouble();
                    AlatMusik alat = new AlatMusik(namaAlat, jenisAlat, hargaSewa);
                    daftarSewa.add(alat);
                    System.out.println("Alat musik " + namaAlat + " berhasil ditambahkan.");
                    break;
                case 2:
                    System.out.print("Masukkan nama alat musik yang ingin dihapus: ");
                    String namaHapus = scanner.nextLine();
                    boolean ditemukanHapus = false;
                    for (AlatMusik alatMusik : daftarSewa) {
                        if (alatMusik.getNamaAlat().equalsIgnoreCase(namaHapus)) {
                            daftarSewa.remove(alatMusik);
                            System.out.println("Alat musik " + namaHapus + " berhasil dihapus.");
                            ditemukanHapus = true;
                            break;
                        }
                    }
                    if (!ditemukanHapus) {
                        System.out.println("Alat musik tidak ditemukan.");
                    }
                    break;
                case 3:
                    if (daftarSewa.isEmpty()) {
                        System.out.println("Tidak ada alat musik yang disewa.");
                    } else {
                        for (AlatMusik alatMusik : daftarSewa) {
                            alatMusik.tampilkanDetail();
                            System.out.println("--------------------");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Total alat musik yang disewa: " + daftarSewa.size());
                    break;
                case 5:
                    System.out.print("Masukkan nama alat musik yang ingin di-update: ");
                    String namaUpdate = scanner.nextLine();
                    boolean ditemukanUpdate = false;
                    for (AlatMusik alatMusik : daftarSewa) {
                        if (alatMusik.getNamaAlat().equalsIgnoreCase(namaUpdate)) {
                            System.out.print("Masukkan nama baru: ");
                            String namaBaru = scanner.nextLine();
                            System.out.print("Masukkan jenis baru: ");
                            String jenisBaru = scanner.nextLine();
                            System.out.print("Masukkan harga sewa baru: ");
                            double hargaBaru = scanner.nextDouble();
                            scanner.nextLine();  // Konsumsi newline

                            // Update data alat musik
                            alatMusik.setNamaAlat(namaBaru);
                            alatMusik.setJenisAlat(jenisBaru);
                            alatMusik.setHargaSewa(hargaBaru);

                            System.out.println("Alat musik " + namaUpdate + " berhasil di-update.");
                            ditemukanUpdate = true;
                            break;
                        }
                    }
                    if (!ditemukanUpdate) {
                        System.out.println("Alat musik tidak ditemukan.");
                    }
                    break;
                case 6:
                    keluar = true;
                    System.out.println("Terima kasih telah menggunakan sistem sewa alat musik.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
            System.out.println();
        }
        scanner.close();
    }
}
