// Superclass
class Karyawan {
    private String nama;
    private double gajiPokok;

    // Getter dan Setter
    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }

    public double getGajiPokok() { return gajiPokok; }
    public void setGajiPokok(double gajiPokok) { this.gajiPokok = gajiPokok; }

    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Gaji Pokok: Rp" + gajiPokok);
    }
}

// Subclass (Inheritance)
class Manager extends Karyawan {
    private double tunjangan;

    // Getter dan Setter untuk Tunjangan
    public double getTunjangan() { return tunjangan; }
    public void setTunjangan(double tunjangan) { this.tunjangan = tunjangan; }

    // Overriding Method
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Tunjangan: Rp" + tunjangan);
        System.out.println("Total Gaji: Rp" + (getGajiPokok() + tunjangan));
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        Manager mng = new Manager();
        
        // Menggunakan Setter
        mng.setNama("Budi Santoso");
        mng.setGajiPokok(5000000);
        mng.setTunjangan(2000000);

        // Menampilkan Output
        System.out.println("=== Data Manager ===");
        mng.tampilkanInfo();
    }
}