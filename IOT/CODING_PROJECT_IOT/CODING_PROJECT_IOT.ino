#include <LiquidCrystal_I2C.h>

LiquidCrystal_I2C lcd(0x27, 16, 2);

void setup() {
  Serial.begin(9600);    // Memulai komunikasi ke laptop
  pinMode(2, INPUT);     // Pin sensor PIR
  pinMode(13, OUTPUT);   // Pin LED
  pinMode(12, OUTPUT);   // Pin LED
  lcd.init();
  lcd.backlight();
}

void loop() {
  int statusPIR = digitalRead(2); // Baca sensor (1 atau 0)
  Serial.println(statusPIR);      // Munculkan di Serial Monitor

  digitalWrite(13, statusPIR); 
  digitalWrite(12, statusPIR);    // LED nyala jika ada gerakan

  lcd.setCursor(0, 0);
  if (statusPIR == 1) {
    lcd.print("GERAKAN ADA     ");
    lcd.setCursor(0, 1);
    lcd.print("LAMPU: NYALA    ");
  } else {
    lcd.print("TIDAK ADA ORANG ");
    lcd.setCursor(0, 1);
    lcd.print("LAMPU: MATI     ");
  }
  
  delay(500); // Biar nggak terlalu cepat kedipnya
}