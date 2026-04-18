public class main {
    public static void main(String[] args) {
        System.out.println("===TUGAS LIVE KODING PERBANKAN===");

        BNI bni = new BNI(1000000);
        bni.sukubunga();
        bni.transferUang(200000, "657474747", "BSI");
        System.out.println();

        BCA bca = new BCA(1000000);
        bca.sukubunga();
        bca.transferUang(200000, "747474848", "BCA");

        
    }
}
