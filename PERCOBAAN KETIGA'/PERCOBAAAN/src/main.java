public class main {
    public static void main(String[] args) {
        System.out.println("==> LIVE CODING PERBANKAN <==");

        BNI bni = new BNI(1000000);
        bni.sukubunga();
        bni.transferUang(100000, "847845873287", "MANDIRI");
        System.out.println();

        BCA bca = new BCA(1000000);
        bca.sukubunga();
        bca.transferUang(100000,"22303948", "SEABANK");
    }
}
