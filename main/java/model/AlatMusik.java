package model;

public class AlatMusik {
    private String namaAlat;
    private String jenisAlat;
    private double hargaSewa;

    public static int jumlahAlat = 0;

    public AlatMusik(String namaAlat, String jenisAlat, double hargaSewa) {
        this.namaAlat = namaAlat;
        this.jenisAlat = jenisAlat;
        this.hargaSewa = hargaSewa;
        jumlahAlat++;
    }

    public void tampilkanDetail() {
        System.out.println("Nama Alat Musik: " + namaAlat);
        System.out.println("Jenis Alat Musik: " + jenisAlat);
        System.out.println("Harga Sewa: Rp" + hargaSewa);
    }

    public String getNamaAlat() {
        return namaAlat;
    }

    public void setNamaAlat(String namaAlat) {
        this.namaAlat = namaAlat;
    }

    public String getJenisAlat() {
        return jenisAlat;
    }

    public void setJenisAlat(String jenisAlat) {
        this.jenisAlat = jenisAlat;
    }

    public double getHargaSewa() {
        return hargaSewa;
    }

    public void setHargaSewa(double hargaSewa) {
        this.hargaSewa = hargaSewa;
    }
}
