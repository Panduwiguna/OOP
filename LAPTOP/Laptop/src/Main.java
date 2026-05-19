import java.util.Scanner;

interface Laptop {
    void powerOn(); void powerOff(); void volumeUp(); void volumeDown();
}

class Toshiba implements Laptop {
    int vol = 50; boolean on;
    public void powerOn() { on = true; System.out.println("Toshiba ON"); }
    public void powerOff() { on = false; System.out.println("Toshiba OFF"); }
    public void volumeUp() { if(on) System.out.println("Vol: " + (++vol)); else System.out.println("Nyalakan dulu!"); }
    public void volumeDown() { if(on) System.out.println("Vol: " + (--vol)); else System.out.println("Nyalakan dulu!"); }
}

class MacBook implements Laptop {
    int vol = 50; boolean on;
    public void powerOn() { on = true; System.out.println("MacBook ON"); }
    public void powerOff() { on = false; System.out.println("MacBook OFF"); }
    public void volumeUp() { if(on) System.out.println("Vol: " + (++vol)); else System.out.println("Nyalakan dulu!"); }
    public void volumeDown() { if(on) System.out.println("Vol: " + (--vol)); else System.out.println("Nyalakan dulu!"); }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Laptop lp; 

        System.out.print("Pilih Laptop (1.Toshiba / 2.MacBook): ");
        int pilih = sc.nextInt();
        sc.nextLine();

    
        lp = (pilih == 1) ? new Toshiba() : new MacBook();

        System.out.println("Perintah: ON, OFF, UP, DOWN, EXIT");
        while (true) {
            System.out.print("> ");
            String cmd = sc.nextLine().toUpperCase();
            if (cmd.equals("EXIT")) break;
            
            switch (cmd) {
                case "ON" -> lp.powerOn();
                case "OFF" -> lp.powerOff();
                case "UP" -> lp.volumeUp();
                case "DOWN" -> lp.volumeDown();
                default -> System.out.println("Salah!");
            }
        }
        sc.close();
    }
}