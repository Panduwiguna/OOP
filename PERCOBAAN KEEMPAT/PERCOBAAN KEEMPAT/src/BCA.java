public class BCA extends Bank {
    public BCA(double saldo){
        super(1000000);
        this.nama = "BCA";
        this.biayaadmin = 2500;
    }
    @Override
    public void sukubunga(){
        System.out.println("Suku Bunga dari BCA adalah : 4.5%");
    }
}
