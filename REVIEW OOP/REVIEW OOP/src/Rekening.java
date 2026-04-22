//SOAL NOMOR 1 CLASS DAN OBJECT
public class Rekening {
    String namaPemilik;
    String nomorRekening;
    double saldo;

    public Rekening(String nama, String nomor, double saldoAwal) {
        this.namaPemilik = nama;
        this.nomorRekening = nomor;
        this.saldo = saldoAwal;
    }

    public void setor(double jumlah) {
        this.saldo += jumlah;
    }

    // Overloading: Versi dengan transfer
    public void setor(double jumlah, boolean viaTransfer) {
        if (viaTransfer) {
            this.saldo += (jumlah - 2500); 
        } else {
            this.setor(jumlah);
        }
    }

    public void tarik(double jumlah) {
        if (jumlah <= saldo) {
            this.saldo -= jumlah;
        }
    }

    public void tampilkanInfo() {
        System.out.printf("Nama: %-10s | Rek: %-5s | Saldo: Rp%,.0f\n", namaPemilik, nomorRekening, saldo);
    }
}