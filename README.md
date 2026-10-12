# Absensi RDMKU Android

Proyek Android WebView untuk membuka `https://absensi.rdmku.cloud/index.html`.

## Fitur
- Dua varian APK yang dapat dipasang bersamaan:
  - **Absensi RDMKU** (`utama`)
  - **Absensi RDMKU Kedua** (`kedua`)
- Meminta izin lokasi Android dan meneruskan izin geolokasi ke situs melalui WebView.
- Build APK otomatis melalui GitHub Actions.

## Cara build APK melalui GitHub
1. Unggah semua isi folder proyek ini ke root repositori GitHub.
2. Buka tab **Actions**.
3. Pilih workflow **Build APK Absensi RDMKU** lalu tekan **Run workflow**, atau lakukan push ke branch `main`.
4. Setelah selesai, buka hasil workflow dan unduh artifact:
   - `Absensi-RDMKU-Utama`
   - `Absensi-RDMKU-Kedua`

APK hasil build ada di dalam ZIP artifact yang diunduh dari GitHub Actions.

## Catatan GPS
Saat pertama kali dibuka, pilih **Izinkan saat aplikasi digunakan** untuk akses lokasi. Pastikan layanan Lokasi/GPS HP aktif dan izin lokasi browser/situs tidak diblokir. Situs tujuan juga harus mendukung geolokasi dan berjalan melalui HTTPS. Aplikasi ini meneruskan permintaan lokasi dari halaman web; aplikasi tidak dapat menjamin bahwa sistem absensi di server akan menerima lokasi jika situs atau server menolaknya.

## Membuat dua APK
Kedua varian menggunakan `applicationId` berbeda sehingga dapat dipasang bersamaan. Nama dan ikon dasarnya sama; nama aplikasi yang tampil dibedakan.
