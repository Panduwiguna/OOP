public class Main{
    public static void main(String[] args) {
        TabunganHaji tabunganku = new TabunganHaji("123-324-848", 10000000);

        System.out.println("== INFO DETAIL REKENING ==");
        tabunganku.infoAkun();

        System.out.println("\n --- UPDATE SALDO ---");
        tabunganku.setSaldo(300000000);
        tabunganku.infoAkun();
    }
}