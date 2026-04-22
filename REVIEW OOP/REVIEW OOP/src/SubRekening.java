//SOAL NOMOR 2 DAN 4: INHERITANCE, OVERRIDING DAN DEPOSITO

class Tabungan extends Rekening {
    double bungaTahunan;

    public Tabungan(String nama, String nomor, double saldoAwal, double bunga) {
        super(nama, nomor, saldoAwal);
        this.bungaTahunan = bunga;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("   (Bunga: " + bungaTahunan + "%)");
    }
}

class Giro extends Rekening {
    double limitPinjaman = 2000000;

    public Giro(String nama, String nomor, double saldoAwal) {
        super(nama, nomor, saldoAwal);
    }

    @Override
    public void tarik(double jumlah) {
        if (jumlah <= (saldo + limitPinjaman)) {
            this.saldo -= jumlah;
            System.out.println("Berhasil tarik (Giro): Rp" + jumlah);
        }
    }
}

class Deposito extends Rekening {
    public Deposito(String nama, String nomor, double saldoAwal) {
        super(nama, nomor, saldoAwal);
    }

    @Override
    public void tarik(double jumlah) {
        double denda = 0.10 * saldo; 
        this.saldo -= (jumlah + denda);
        System.out.printf("Tarik Deposito! Denda 10%%: Rp%,.0f\n", denda);
    }
}