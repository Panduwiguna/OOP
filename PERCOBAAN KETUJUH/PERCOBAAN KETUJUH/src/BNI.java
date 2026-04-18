public class BNI extends Bank {
    public BNI(double saldo){
        super(saldo);
        this.nama = "BNI";
        this.biayaadmin = 6500;
    }
    @Override
    public void sukubunga(){
        System.out.println("Suku Bunga dari BNI adalah : 4%");
    }
}
