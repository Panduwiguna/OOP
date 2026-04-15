public class Smartphone extends Elektronik implements Kamera {
    
    // Mewarisi merk dari Elektronik
    Smartphone(String merk) {
        super(merk);
    }

    // Mengisi aturan dari Gadget (Abstract)
 
    public void nyalakan() {
        System.out.println("Smartphone " + getMerk() + " sedang loading sistem...");
    }

    // Mengisi aturan dari Kamera (Interface)
    
    public void ambilFoto() {
        System.out.println("Cekrek! Foto berhasil diambil menggunakan " + getMerk());
    }
}