package com.example.finalprojectkotlin

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val list = findViewById<RecyclerView>(R.id.list)

        val items = listOf<ContentModel>(
            ContentModel("Supporting Student Advancement, ITS Signs MoU with PT RINA Indonesia",R.drawable.photo3,"Institut Teknologi Sepuluh Nopember (ITS) has signed a Memorandum of Understanding (MoU) with PT RINA Indonesia to provide internship opportunities for ITS students. The President of PT RINA Indonesia, Enzo di Capua, emphasized the importance of human resource development in the industrial world, particularly in relation to technological innovation and decarbonization efforts in the maritime sector.",readFile(R.raw.description1)),
            ContentModel("ITS Kenalkan Autonomous Bathymetric Survey Vehicle untuk Pemetaan Perairan",R.drawable.photo2,"Institut Teknologi Sepuluh Nopember (ITS) telah memperkenalkan perahu otonom inovatif, Autonomous Bathymetric Survey Vehicle, yang dirancang untuk survei hidrografi. Perahu ini beroperasi secara otonom dan terintegrasi dengan instrumen survei batimetri, memungkinkan surveyor melakukan pengukuran tanpa harus bekerja langsung di lapangan. Perahu ini dapat digunakan untuk berbagai kebutuhan, seperti pemetaan kedalaman di area pelabuhan untuk menentukan lokasi pendangkalan. Inovasi ini secara resmi diperkenalkan pada acara Demoday dan merupakan bagian dari program Higher Education for Technology and Innovation (HETI) yang didukung oleh Asian Development Bank (ADB).",readFile(R.raw.description2)),
            ContentModel("Pentingnya Perawatan Eksterior dan Interior Mobil",R.drawable.photo4,"Institut Teknologi Sepuluh Nopember (ITS) telah memperkenalkan perahu otonom inovatif, Autonomous Bathymetric Survey Vehicle, yang dirancang untuk survei hidrografi. Perahu ini beroperasi secara otonom dan terintegrasi dengan instrumen survei batimetri, memungkinkan surveyor melakukan pengukuran tanpa harus bekerja langsung di lapangan. Perahu ini dapat digunakan untuk berbagai kebutuhan, seperti pemetaan kedalaman di area pelabuhan untuk menentukan lokasi pendangkalan. Inovasi ini secara resmi diperkenalkan pada acara Demoday dan merupakan bagian dari program Higher Education for Technology and Innovation (HETI) yang didukung oleh Asian Development Bank (ADB).",readFile(R.raw.description3)),
            ContentModel("PS5 Slim Sudah Bisa Dibeli di Indonesia, Ini Link dan Daftar Toko yang Menjual",R.drawable.photo5,"Sony telah merilis PS5 Slim, sebuah desain baru dari konsol PS5 yang lebih ramping dibandingkan model sebelumnya. PS5 Slim menawarkan beberapa perbedaan penting, termasuk laci cakram yang dapat dilepas, membuatnya lebih portabel. Model ini juga memiliki kapasitas penyimpanan yang diperluas menjadi 1 TB, peningkatan dari 825 GB pada model PS5 sebelumnya. Selain itu, PS5 Slim dilengkapi dengan dua port USB-C dan fitur Ray Tracing Acceleration untuk mempercepat proses rendering efek pantulan cahaya yang realistis. PS5 Slim tersedia dalam dua edisi: Standard Edition dengan laci cakram Ultra HD Blu-ray Disc Drive seharga Rp 9.699.000, dan Digital Edition tanpa laci cakram seharga Rp 8.199.000. Laci cakram juga dijual secara terpisah seharga Rp 1.839.000. Produk ini dapat dibeli di berbagai toko offline dan online di Indonesia.",readFile(R.raw.description4)),
            ContentModel("Nikon Bikin Kamera Mirrorless Khusus untuk Memotret di Bulan",R.drawable.photo6,"NASA dan Nikon bekerja sama untuk mengembangkan kamera modern yang dapat bertahan di kondisi ekstrim luar angkasa, bernama Handheld Universal Lunar Camera (HULC). Kamera ini, yang berbasis pada mirrorless full-frame Nikon Z9, sedang diuji dan dimodifikasi agar mudah dioperasikan oleh astronot saat mengenakan sarung tangan. HULC dilengkapi dengan thermal blanket khusus dan komponen elektronik khusus untuk melindungi kamera dari debu, temperatur ekstrim, dan radiasi di bulan. Nikon dan NASA juga bekerja sama untuk mengembangkan solusi agar kamera dapat beroperasi di bulan, yang jaraknya 383.000 kilometer dari bumi. Dalam misi Artemis III, yang dijadwalkan meluncur pada September 2026, astronot NASA akan membawa kamera mirrorless Nikon ini untuk memotret dan merekam video di bulan.",readFile(R.raw.description5)),
            ContentModel("Kelebihan dan Kekurangan Topologi Tree dalam Jaringan Komputer yang Perlu Diketahui",R.drawable.photo7,"Topologi tree adalah konfigurasi jaringan komputer di mana setiap komputer saling terhubung dalam sebuah hierarki. Topologi ini menggabungkan fitur dari topologi star dan bus, dan biasa digunakan untuk mengatur transfer data antara node atau komputer server dan workstation di jaringan perusahaan. Kelebihan topologi tree adalah fleksibilitasnya dalam menambahkan node ke jaringan hanya dengan memperluas jaringan di setiap cabang. Namun, kekurangannya adalah jika node utama mengalami gangguan atau rusak, semua sistem jaringan akan mengalami gangguan karena semua node terhubung dengan node utama.",readFile(R.raw.description6)),
            ContentModel("Nvidia Rilis RTX 500 dan RTX 1000, Kartu Grafis Bertenaga AI untuk Laptop Tipis",R.drawable.photo8,"Nvidia, pabrikan chip asal Amerika Serikat, baru saja meluncurkan dua kartu pengolah grafis (GPU) terbarunya, RTX 500 ADA dan RTX 1000 ADA. GPU ini dirancang untuk mobile workstation dan laptop tipis dan ringan, namun tetap memiliki kekuatan akselerasi AI. GPU ini dibuat dengan arsitektur Nvidia ADA Lovelace, yang dirancang untuk kinerja pemrosesan visual yang mumpuni, termasuk ray tracing dan neural engine untuk AI. Meskipun kedua GPU ini memiliki beberapa kesamaan, seperti komponen inti AD107, mereka memiliki perbedaan dalam jumlah inti CUDA, Tensor Cores, RT Cores, VRAM, Total Graphics Power (TGP), dan TOPS.",readFile(R.raw.description7)),
            ContentModel("MediaTek Pamer Kemampuan Chip Dimensity 9300, Bikin Video AI dari Teks Lebih Mudah dan Cepat",R.drawable.photo9,"MediaTek, pabrikan chipset, telah memperkenalkan System-on-Chip (SoC) terbarunya, Dimensity 9300, di Mobile World Congress (MWC) Barcelona 2024. Dimensity 9300, yang dirilis pada Oktober 2023, mampu membuat video berbasis kecerdasan buatan (AI) secara lokal atau on-device. AI generatif on-device memungkinkan pembuatan video berbasis AI secara lokal dan offline di perangkat, menawarkan berbagai kelebihan dibandingkan pengolahan AI berbasis cloud, seperti performa yang lebih mulus, privasi yang lebih baik, keamanan yang lebih tinggi, latensi rendah, dan biaya operasional yang lebih murah. Pembuatan video AI on-device ini dapat dilakukan dengan cepat dan mudah, dengan pengguna hanya perlu memberikan perintah berupa teks yang mendeskripsikan video yang diinginkan.",readFile(R.raw.description8)),
            ContentModel("Asus Rilis ROG Swift PG32UCDM, Monitor Gaming QD-OLED 32 Inci",R.drawable.photo10,"Asus telah mulai memasarkan monitor gaming 32 inci ROG Swift PG32UCDM yang ditujukan untuk gamer dan kreator konten. Monitor ini menggunakan panel Quantum Dot (QD) OLED generasi ketiga dari Samsung, menjanjikan tingkat kontras tinggi dan warna yang cerah. Dengan konstruksi yang lebih sederhana dibandingkan LCD konvensional, layar QD-OLED ini bisa dibuat lebih tipis dan memiliki brightness lebih tinggi. Monitor ini mendukung resolusi 4K, refresh rate hingga 240 Hz, dan response time Grey-to-Grey hanya 0,03 ms. Monitor ini juga dilengkapi dengan konektor DisplayPort 1.4, HDMI 2.1, headphone jack, dan USB C dengan dukungan Power Delivery hingga 90 watt. Meski memiliki spesifikasi tinggi, monitor ini dibanderol dengan harga yang cukup mahal, yaitu 1.299 dollar AS atau lebih dari Rp 20 juta di pasaran internasional.",readFile(R.raw.description9)),
            ContentModel("Konsol Game Windows Lenovo Legion Go Punya \"FPS Mode\", Sulap Controller Jadi Mouse",R.drawable.photo1,"Lenovo Legion Go adalah konsol game Windows yang memiliki bentuk serupa dengan Nintendo Switch, dengan controller yang bisa dilepas dan digunakan sebagai mouse untuk bermain game bergenre First-person Shooter (FPS). Untuk mengubah fungsi controller menjadi mouse, gamer harus mengaktifkan “FPS Mode” di dalam perangkat. Dalam mode ini, controller berfungsi seperti mouse, memberikan presisi yang lebih baik untuk membidik dalam game FPS. Controller bagian kanan digunakan dalam mode FPS, sementara controller sebelah kiri berfungsi sebagai keyboard. Untuk mengaktifkan mode FPS, pengguna harus melepas controller dengan menekan tombol “Release Button”, kemudian menggeser tombol dari “Off” ke “FPS”. Ketika mode FPS diaktifkan, layar konsol akan menampilkan informasi bahwa pengguna sedang menggunakan mode ini, dan kursor mouse akan muncul di layar.",readFile(R.raw.description10))
        )

        list.adapter = ContentAdapter(items) { content ->
            val intent = Intent(this, DetailActivity::class.java).apply {
                putExtra("title", content.title)
                putExtra("image", content.image)
                putExtra("description", content.detail)
            }
            startActivity(intent)
        }

        val fab = findViewById<FloatingActionButton>(R.id.action_share)
        fab.setOnClickListener {
            val intent = Intent(this, AboutActivity::class.java)
            startActivity(intent)
        }
    }

    private fun readFile(resourceId: Int): String {
        return resources.openRawResource(resourceId).bufferedReader().use { it.readText() }
    }
}
