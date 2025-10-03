<h1>TOKO ONLINE</h1>

<h2>Penjelasan Singkat Tema Project</h2>
<div align="justify">Program Toko Belanja Online yang telah dibuat adalah merupakan sebuah aplikasi sederhana berbasis Java yang menerapkan konsep Object-Oriented Programming (OOP) dan pembagian kode ke dalam beberapa package agar lebih terstruktur.
Program ini dirancang untuk meniru alur belanja online pada umumnya, mulai dari melihat daftar produk, menambahkan barang ke keranjang, hingga melakukan proses checkout. Dalam implementasinya, program dibagi ke dalam empat package utama, yaitu model, service, view, dan main, di mana masing-masing package memiliki peran tersendiri.
</div>
<br>

<h3>Berikut ini adalah diagram struktur program</h3>
<pre>toko_online
│
├── main
│   └── MainApp.java
│
├── model
│   └── Produk.java
│
├── service
│   ├── Cart.java
│   └── Store.java
│
└── util
    └── FormatUtil.java </pre>

<h3>Contoh Penggunaan Fitur Utama</h3>
<h4>1. Tambah Keranjang</h4>
<img width="450" height="490" alt="image" src="https://github.com/user-attachments/assets/a9b07fd3-a34b-4c37-9e0f-c31fba20edc0" />

<p><div align="justify">Output pada saat pengguna memilih menu ke-1 yaitu “Lihat Daftar Produk” akan menampilkan seluruh produk yang tersedia di toko online beserta harganya. Pada tampilan tersebut, ditunjukkan sebuah tabel dengan kolom Nomor (No), Nama Produk, dan Harga. Produk yang ditampilkan terdiri dari tujuh item, yaitu Laptop dengan harga Rp7.500.000,00, Smartphone Rp3.000.000,00, Headphone Rp500.000,00, Keyboard Rp250.000,00, Mouse Rp150.000,00, Speaker Rp175.000,00, serta Smart Watch Rp1.500.000,00. Dengan tampilan ini, pengguna dapat melihat daftar lengkap produk beserta harga masing-masing sebelum memutuskan untuk menambahkannya ke keranjang belanja.</p></div>

<h4>2. Tambah Ke Keranjang</h4>
<img width="450" height="490" alt="image" src="https://github.com/user-attachments/assets/74287387-f830-4c38-a7b5-8ccf9ffef07f" />

<p><div align="justify">Ketika pengguna memilih menu ke-2 yaitu “Tambah ke Keranjang”, program akan menampilkan daftar produk beserta nomor, nama produk, dan harga yang tersedia di toko online. Setelah itu, pengguna diminta untuk memilih nomor produk yang ingin ditambahkan ke keranjang belanja. Pada contoh output, pengguna memilih nomor produk 1, yaitu Laptop dengan harga Rp7.500.000,00. Program kemudian memberikan konfirmasi dengan menampilkan pesan “Laptop berhasil ditambahkan ke keranjang”. Hal ini menunjukkan bahwa produk yang dipilih telah masuk ke daftar belanja pengguna, sehingga nantinya bisa dilihat atau diproses lebih lanjut pada menu lihat keranjang maupun saat checkout.</p></div>

<h4>3. Lihat Keranjang</h4>
<img width="450" height="490" alt="image" src="https://github.com/user-attachments/assets/d0672bc7-2f48-488b-8343-b197dd4551f8" />

<p><div align="justify">Ketika pengguna memilih menu ke-3 yaitu “Lihat Keranjang”, program akan menampilkan daftar produk yang sudah ditambahkan ke dalam keranjang belanja. Pada output ini terlihat bahwa terdapat dua produk di dalam keranjang, yaitu Laptop dengan harga Rp7.500.000,00 dan Smartphone dengan harga Rp3.000.000,00. Di bagian bawah tabel, program juga menghitung dan menampilkan Total Belanja, yaitu Rp10.500.000,00 sebagai akumulasi harga dari seluruh produk dalam keranjang. Dengan fitur ini, pengguna dapat mengetahui isi keranjang beserta total biaya yang harus dibayar sebelum melanjutkan ke proses checkout.</p></div>

<h4>4. Hapus Dari Keranjang</h4>
<img width="450" height="490" alt="image" src="https://github.com/user-attachments/assets/f9f4d127-f324-439d-a64a-bb93f401333c" />

<p><div align="justify">Ketika pengguna memilih menu ke-4 yaitu “Hapus dari Keranjang”, program akan menampilkan isi keranjang yang berisi daftar produk beserta harga dan total belanja. Pada output ini, keranjang berisi dua produk yaitu Laptop seharga Rp7.500.000,00 dan Smartphone seharga Rp3.000.000,00 dengan total belanja Rp10.500.000,00. Selanjutnya, program meminta pengguna untuk memilih nomor produk yang ingin dihapus. Dalam contoh, pengguna memilih nomor 2, yaitu Smartphone. Setelah itu, program memberikan konfirmasi dengan menampilkan pesan “Smartphone berhasil dihapus dari keranjang”, yang berarti produk tersebut sudah tidak lagi termasuk dalam daftar belanja pengguna.</p></div>

<h4>5. Checkout</h4>
<img width="450" height="490" alt="image" src="https://github.com/user-attachments/assets/240b0083-6835-4feb-839a-5a1c82bdcd53" />

<p><div align="justify">Ketika pengguna memilih menu ke-5 yaitu “Checkout”, program akan menampilkan konfirmasi terlebih dahulu dengan pertanyaan “Apakah Anda yakin ingin checkout? (y/n)”. Jika pengguna menjawab dengan “y”, maka program akan memproses checkout dan menampilkan Nota Pembayaran. Pada output ini, isi keranjang hanya terdapat satu produk yaitu Laptop dengan harga Rp7.500.000,00. Program kemudian menampilkan rincian Total Belanja sebesar Rp7.500.000,00 sekaligus menjadi Total Bayar yang harus dilunasi. Setelah itu, sistem memberikan pesan “Checkout selesai. Terima kasih sudah belanja!” sebagai tanda bahwa proses pembelian berhasil diselesaikan.</p></div>

<h4>6. Keluar</h4>
<img width="450" height="490" alt="image" src="https://github.com/user-attachments/assets/b320f34e-d0f1-459d-bb98-7d6a16abb1fd" />

<p><div align="justify">Ketika pengguna memilih menu ke-6 yaitu “Keluar”, program akan langsung menghentikan proses belanja online dan menampilkan pesan perpisahan. Pada output terlihat bahwa setelah pengguna memilih angka 6, sistem menampilkan tulisan “Terima kasih sudah menggunakan Toko Online Kami.”. Pesan ini berfungsi sebagai ucapan terima kasih sekaligus penutup, menandakan bahwa aplikasi telah selesai dijalankan dan interaksi pengguna dengan sistem berakhir dengan baik.</p></div>

<h3>Link Video YouTube</h3>
