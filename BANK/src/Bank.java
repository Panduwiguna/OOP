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
        System.out.println("Transfer berhasil dari rekening " + this.nama + " ke nomor rekening " + rekeningTujuan + berita);
        System.out.println("Nominal Rp" + jumlah);
        System.out.println("Dengan biaya admin Rp" + biaya + " dan sisa saldo Rp" + this.saldo);
    } else {
        System.out.println("Gagal!! saldo tidak mencukupi, saldo anda :" + this.saldo);
    }
}

public void sukubunga(){
    System.out.println("Suku Bunga standar adalah 3%");
}
}