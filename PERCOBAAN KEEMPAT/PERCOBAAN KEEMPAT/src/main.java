public class main {
    public static void main(String[] args) {
        System.out.println("==> LIVE CODING PERBANKAN <==");

        BNI bni = new BNI(1000000);
        bni.sukubunga();
        bni.transferUang(100000, "7482947384783", "SEABANK");
        System.out.println();

        BCA bca = new BCA(1000000);
        bca.sukubunga();
        bca.transferUang(100000, "8292748204", "BCA");

    }
}
