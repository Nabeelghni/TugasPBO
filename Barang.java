// Kelas Barang sebagai superclass
public class Barang {
    protected String kodeBarang;
    protected String namaBarang;
    protected double hargaBarang;

    // Konstruktor untuk kelas Barang
    public Barang(String kodeBarang, String namaBarang, double hargaBarang) {
        if (hargaBarang <= 0) {
            throw new IllegalArgumentException("Harga barang harus lebih dari 0.");
        }
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.hargaBarang = hargaBarang;
    }

    // Getter dan setter untuk kodeBarang, namaBarang, hargaBarang
    public String getKodeBarang() {
        return kodeBarang;
    }

    public void setKodeBarang(String kodeBarang) {
        this.kodeBarang = kodeBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public double getHargaBarang() {
        return hargaBarang;
    }

    public void setHargaBarang(double hargaBarang) {
        if (hargaBarang <= 0) {
            throw new IllegalArgumentException("Harga barang harus lebih dari 0.");
        }
        this.hargaBarang = hargaBarang;
    }
}
