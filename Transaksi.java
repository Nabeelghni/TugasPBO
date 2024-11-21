import java.text.DecimalFormat;
import java.util.Scanner;

public class Transaksi {
    // Variabel untuk menyimpan data barang dan transaksi
    private String noFaktur;
    private String kodeBarang;
    private String namaBarang;
    private double hargaBarang;

    // Konstruktor untuk Transaksi
    public Transaksi(String noFaktur, String kodeBarang, String namaBarang, double hargaBarang) {
        this.noFaktur = noFaktur;
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.hargaBarang = hargaBarang;
    }

    // Metode untuk menghitung total harga berdasarkan jumlah beli
    public double hitungTotal(int jumlahBeli) {
        return jumlahBeli * hargaBarang;
    }

    // Metode untuk format harga dengan pemisah ribuan
    public String formatHarga(double harga) {
        DecimalFormat df = new DecimalFormat("#,###");
        return df.format(harga);
    }

    // Menampilkan detail transaksi
    public void tampilkanTransaksi(int jumlahBeli) {
        double total = hitungTotal(jumlahBeli);
        System.out.println("\n==== Struk Transaksi =====");
        System.out.println("No Faktur   : " + noFaktur);
        System.out.println("Kode Barang : " + kodeBarang);
        System.out.println("Nama Barang : " + namaBarang);
        System.out.println("Harga Barang: Rp " + formatHarga(hargaBarang));
        System.out.println("Jumlah Beli : " + jumlahBeli);
        System.out.println("Total Harga : Rp " + formatHarga(total));
        System.out.println("\nMANTAP");
    }

    // Main method untuk menjalankan program dan menerima input dari pengguna
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input data dari pengguna
        System.out.print("Masukkan No Faktur: ");
        String noFaktur = scanner.nextLine();

        System.out.print("Masukkan Kode Barang: ");
        String kodeBarang = scanner.nextLine();

        System.out.print("Masukkan Nama Barang: ");
        String namaBarang = scanner.nextLine();

        System.out.print("Masukkan Harga Barang: Rp ");
        double hargaBarang = 0;
        try {
            hargaBarang = scanner.nextDouble();
        } catch (Exception e) {
            System.out.println("Harga Barang tidak valid.");
            scanner.close();
            return;
        }

        System.out.print("Masukkan Jumlah Beli: ");
        int jumlahBeli = scanner.nextInt();

        // Cek apakah semua input tidak kosong
        if (noFaktur.isEmpty() || kodeBarang.isEmpty() || namaBarang.isEmpty() || hargaBarang <= 0) {
            System.out.println("Semua kolom harus diisi dan harga barang harus lebih dari 0.");
            scanner.close();
            return; // Menghentikan program jika ada input kosong atau harga tidak valid
        }

        // Cek apakah jumlah beli valid
        if (jumlahBeli <= 0) {
            System.out.println("Jumlah beli tidak boleh 0 atau kurang.");
            scanner.close();
            return; // Menghentikan program jika jumlah beli tidak valid
        }

        // Membuat objek transaksi dan menampilkan detail transaksi
        Transaksi transaksi = new Transaksi(noFaktur, kodeBarang, namaBarang, hargaBarang);
        transaksi.tampilkanTransaksi(jumlahBeli);

        // Menutup scanner
        scanner.close();
    }
}

