#include <LiquidCrystal_I2C.h>

LiquidCrystal_I2C lcd(0x27, 16, 2);

void setup() {
  Serial.begin(9600);       
  pinMode(A0, INPUT_PULLUP); 
  pinMode(13, OUTPUT); 
  pinMode(12, OUTPUT); 
  lcd.init();
  lcd.backlight();
}

void loop() {
  int sensor = analogRead(A0); 
  Serial.println(sensor);      
  
  bool gelap = (sensor > 500); 

  digitalWrite(13, gelap);
  digitalWrite(12, gelap);     
  
  lcd.setCursor(0, 0);
  lcd.print(gelap ? "Lampu Menyala   " : "Lampu Mati      ");
  lcd.setCursor(0, 1);
  lcd.print(gelap ? "Kondisi: Gelap  " : "Kondisi: Terang ");
  
  delay(2000);
}