class AkunBank {
    private String nomorRekening;
    private double saldo;

    public AkunBank(String nomorRekening, double saldo) {
        this.nomorRekening = nomorRekening;
        setSaldo(saldo);
    }

    public String getNomorRekening() { 
        return nomorRekening;
    }
    public double getSaldo() {
         return saldo; 
    }

    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("Peringatan: Saldo tidak boleh negatif!");
        }
    }

    public void infoAkun() {
        System.out.println("No. Rekening: " + nomorRekening);
        System.out.printf("Saldo: Rp%.0f%n", saldo);
    }
}

class TabunganHaji extends AkunBank {
    private double syaratDaftar = 25000000;

    public TabunganHaji(String nomorRekening, double saldo) {
        super(nomorRekening, saldo);
    }

    @Override
    public void infoAkun() {
        super.infoAkun(); 
        if (getSaldo() >= syaratDaftar) {
            System.out.println("Status: Sudah memenuhi syarat pendaftaran haji.");
        } else {
            double kurang = syaratDaftar - getSaldo();
            // PERBAIKAN 2: Gunakan %.0f juga di sini
            System.out.printf("Status: Belum cukup. Kurang: Rp%.0f%n", kurang);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        TabunganHaji tabunganku = new TabunganHaji("123-456-789", 500000000);
        
        System.out.println("=== Detail Rekening ===");
        tabunganku.infoAkun();
        
        System.out.println("\n--- Update Saldo ---");
        tabunganku.setSaldo(30000000);
        tabunganku.infoAkun();
    }
}