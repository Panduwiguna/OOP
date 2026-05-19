// =========================================================================
// MASUKKAN 3 BARIS KODE DARI BLYNK KAMU DI SINI (GANTI ISI TANDA PETIKNYA)
// =========================================================================
#define BLYNK_TEMPLATE_ID   "TMPL6erUr8cix"
#define BLYNK_TEMPLATE_NAME "percobaan"
#define BLYNK_AUTH_TOKEN    "zroRNRwKtML1EdmKJqFDCJ_iVvtDppJ4"

#define BLYNK_PRINT Serial
#include <WiFi.h>
#include <WiFiClient.h>
#include <BlynkSimpleEsp32.h>

// Definisi Pin ESP32 sesuai rangkaianmu
const int pinLED1 = 22;
const int pinLED2 = 23;
const int pinBuzzer = 19;

// Informasi Wi-Fi khusus untuk Simulasi Wokwi
char auth[] = BLYNK_AUTH_TOKEN;
char ssid[] = "realme C11"; // Tetap gunakan ini agar terhubung ke internet Wokwi
char pass[] = "pandu123";            // Kosongkan untuk simulasi Wokwi

// Fungsi Blynk untuk mengontrol LED 1 dari Virtual Pin V1
BLYNK_WRITE(V1) {
  int value = param.asInt();
  digitalWrite(pinLED1, value);
}

// Fungsi Blynk untuk mengontrol LED 2 dari Virtual Pin V2
BLYNK_WRITE(V2) {
  int value = param.asInt();
  digitalWrite(pinLED2, value);
}

// Fungsi Blynk untuk mengontrol Buzzer dari Virtual Pin V3
BLYNK_WRITE(V3) {
  int value = param.asInt();
  digitalWrite(pinBuzzer, value);
}

void setup() {
  Serial.begin(115200);
  
  // Atur pin-pin sebagai OUTPUT
  pinMode(pinLED1, OUTPUT);
  pinMode(pinLED2, OUTPUT);
  pinMode(pinBuzzer, OUTPUT);
  
  // Memulai koneksi ke Blynk menggunakan jaringan virtual Wokwi
  Blynk.begin(auth, ssid, pass);
}

void loop() {
  Blynk.run();
}