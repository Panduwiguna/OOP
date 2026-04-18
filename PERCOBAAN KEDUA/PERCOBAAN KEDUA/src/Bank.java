public class Bank{
    int saldo;
    String nama = "umum";
    int biayaadmin;

public Bank(int saldo){
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
        System.out.println("Transfer berhasil!, dari bank " + this.nama + " ke rekening " + rekeningTujuan + berita);
        System.out.println("Nominal transfer Rp " + jumlah);
        System.out.println("Biaya admin Rp " + biaya + " sisa saldo anda " + this.saldo);
        
    } else {
        System.out.println("Gagal!! saldo anda tidak cukup!,  udah jelas jelas saldo anda cuma Rp" + this.saldo + " segala pengen transfer " + jumlah + " hadeh ");
    }
}

public void sukubunga(){
    System.out.println("Suku Bunga standar adalah 3%");
}
}