//Soal 3 & 5: Overloading & ArrayList (Main Class)

import java.util.ArrayList;

public class MainBank {
    public static void main(String[] args) {
        ArrayList<Rekening> daftarNasabah = new ArrayList<>();
        
        daftarNasabah.add(new Tabungan("Budi", "18764", 10000000, 5));
        daftarNasabah.add(new Giro("Andi", "01473", 5000000));
        daftarNasabah.add(new Deposito("Cika", "83847", 20000000));

        // Simulasi
        daftarNasabah.get(0).setor(500000, true); 
        daftarNasabah.get(2).tarik(1000000);      

        System.out.println("\n===== DAFTAR NASABAH =====");
        for (Rekening rekening : daftarNasabah) {
            rekening.tampilkanInfo();
        }
    }
}