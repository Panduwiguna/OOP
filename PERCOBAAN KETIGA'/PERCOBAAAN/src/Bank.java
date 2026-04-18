public class Bank{
    double saldo;
    String nama = "pandu wiguna ruswandi";
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
        System.out.println("Transfer Berhasil!! dari bank " + this.nama + " dengan rekening " + rekeningTujuan + berita);
        System.out.println("Nominal transfer Rp " + jumlah);
        System.out.println("Dengan biaya Rp " + biaya + " dan sisa saldo anda Rp " + this.saldo);
    } else {
        System.out.println("Gagal transfer!! karena saldo tidak mencukupi, saldo anda Rp " + this.saldo);
    }
}

public void sukubunga(){
    System.out.println("Suku Bunga standar adalah 3%");
}
}