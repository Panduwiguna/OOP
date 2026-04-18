public class Main {
    public static void main(String[] args) {
        System.out.println("==> LIVE CODING PERBANKAN <==");

        BNI bni = new BNI(1000000);
        bni.sukubunga();
        bni.transferUang(200000, "753879234879352879", "MANDIRI");
        System.out.println();

        BCA bca = new BCA(1000000);
        bca.sukubunga();
        bca.transferUang(200000, "83429821389", "BCA");
    }
}
