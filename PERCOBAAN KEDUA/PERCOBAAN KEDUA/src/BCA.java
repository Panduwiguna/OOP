public class BCA extends Bank {
    public BCA(int saldo){
        super(saldo);
        this.nama = "BCA";
        this.biayaadmin = 2500;
    }
    @Override
    public void sukubunga(){
        System.out.println("Suku Bunga dari BCA adalah : 4.5%");
    }
}
