public class main {
    public static void main(String[] args) {
        System.out.println("==> LIVE CODING PERBANKAN <==");

        BNI bni = new BNI(1000000);
        bni.sukubunga();
        bni.transferUang(3000000, "7876878776766565", "BNI");
        System.out.println();

        BCA bca = new BCA(1000000);
        bca.sukubunga();
        bca.transferUang(3000000, "675776778898909", "MANDIRI");
    }
}
