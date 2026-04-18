public class Bank{
    double saldo;
    String nama = "umum";
    int biayaadmin;

public Bank(double saldo){
    this.saldo = saldo;
}

public void transferUang(int jumlah, String rekeningTujuan){
    transferUang(jumlah, rekeningTujuan, this.nama);
}
public void transferUang(int jumlah, String rekeningTujuan, String bankTujuan){
    transferUang(jumlah, rekeningTujuan, bankTujuan, "");
}
public void transferUang(int jumlah, String rekeningTujuan, String bankTujuan, String berita){
    int biaya = bankTujuan.equalsIgnoreCase(this.nama) ? 0 : this.biayaadmin;

    if (saldo >= jumlah + biaya){
        saldo -= jumlah + biaya;
        System.out.println("Transfer berhasil!!, dari rekening " + this.nama + " ke rekekening " + rekeningTujuan + berita);
        System.out.println("Nominal Rp " + jumlah);
        System.out.println("Biaya admin Rp " + biaya + " dan sisa saldo anda Rp " + this.saldo);
    } else {
        System.out.println("Gagagl!!, saldo anda tidak mencukupi!, saldo anda Rp " + this.saldo);
    }
}
public void sukubunga(){
    System.out.println("Suku Bunga standar adalah 3%");
}
}