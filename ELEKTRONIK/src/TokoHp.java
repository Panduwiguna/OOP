public class TokoHp {
    public static void main(String[] args) {
        // Membuat objek Smartphone
        Smartphone hpSaya = new Smartphone("Infinix hot");

        hpSaya.nyalakan();    // Menjalankan fungsi Gadget
        hpSaya.ambilFoto();   // Menjalankan fungsi Kamera
        
        // Mengambil data dari Kelas Dasar Elektronik
        System.out.println("Merk HP ini adalah: " + hpSaya.getMerk());
    }
}