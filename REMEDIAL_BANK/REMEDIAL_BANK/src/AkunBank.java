public class AkunBank {
    private String nomorRekening;
    private double saldo;

public AkunBank(String nomorRekening, double saldo){
    this.nomorRekening = nomorRekening;
    setSaldo(saldo);
}
public String getNomorRekening(){
    return nomorRekening;
}
public double getSaldo(){
    return saldo;
}
public void setSaldo(double saldo){
    if (saldo >= 0){
        this.saldo = saldo;
    } else {
        System.out.println("Peringatan : saldo tidak boleh negatif");
    }
}

public void infoAkun(){
    System.out.println("No rekening : " + nomorRekening);
    System.out.printf("Saldo : Rp%.0f%n", saldo);
}
}

class TabunganHaji extends AkunBank{
    private double syaratDaftar = 25000000;

    public TabunganHaji(String nomorRekening, double saldo){
        super(nomorRekening, saldo);
    }

    @Override
    public void infoAkun(){
        super.infoAkun();
        if (getSaldo() >= syaratDaftar){
            System.out.println("Status : sudah memenuhi syarat haji. ");
        } else {
            double kurang = syaratDaftar - getSaldo();
            System.out.printf("Status : belum cukup. kurang : ", kurang);
        }
    }
}

