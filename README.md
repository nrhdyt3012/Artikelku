# Artikelku

Artikelku adalah sebuah aplikasi Android yang dikembangkan menggunakan Kotlin. Proyek ini tampaknya berfungsi sebagai aplikasi daftar artikel dengan tampilan berbasis RecyclerView, serta berbagai fitur modern Android.


## View APK
![View1](https://github.com/nrhdyt3012/Artikelku/blob/main/Screenshot_20250527_100207_Screenshot_20250527_100303.jpeg)
![View2](https://github.com/nrhdyt3012/Artikelku/blob/main/Screenshot_20250527_100326_Screenshot_20250527_100402_Screenshot_20250527_100345.jpeg)
## Fitur Utama

- **Dibangun dengan Kotlin**
- **Menggunakan ViewBinding**
- **Mendukung minimum SDK 24, target SDK 34**
- **Mengimplementasikan berbagai library populer seperti:**
  - AndroidX (Core, AppCompat, Activity, ConstraintLayout)
  - Material Design Components
  - CircleImageView untuk tampilan gambar profil bundar
  - Glide untuk pemrosesan dan pemuatan gambar
  - SplashScreen API
- **Konfigurasi Proguard untuk rilis**
- **Dukungan pengujian dengan JUnit dan Espresso**

## Struktur Proyek

```
Artikelku/
├── app/
│   └── build.gradle.kts
├── build.gradle.kts
├── gradle/
├── gradle.properties
├── gradlew
├── gradlew.bat
├── settings.gradle.kts
└── .idea/
```

## Cara Build & Menjalankan

1. **Clone repository ini:**
   ```bash
   git clone https://github.com/nrhdyt3012/Artikelku.git
   ```
2. **Buka folder proyek di Android Studio.**
3. **Build dan jalankan aplikasi pada emulator atau perangkat Android.**

## Konfigurasi Build

- **Namespace:** `com.example.myrecyclerview`
- **Minimum SDK:** 24
- **Target SDK:** 34
- **Versi Aplikasi:** 1.0

## Dependensi Utama

- AndroidX Core, AppCompat, Activity, ConstraintLayout
- Material Design Components
- CircleImageView
- Glide
- SplashScreen

## Kontribusi

Kontribusi sangat terbuka! Silakan buat pull request atau laporkan masalah melalui issue.
