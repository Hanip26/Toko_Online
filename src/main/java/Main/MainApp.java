/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author msi
 */

import java.util.Scanner;
import java.util.InputMismatchException;
import Model.Produk;
import Service.Cart;
import Service.Store;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Store store = new Store();
        Cart cart = new Cart();
        int pilihan = -1;

        do {
            try {
                System.out.println("\n=== Menu Toko Online ===\n");
                System.out.println("1. Lihat Daftar Produk");
                System.out.println("2. Tambah ke Keranjang");
                System.out.println("3. Lihat Keranjang");
                System.out.println("4. Hapus dari Keranjang");
                System.out.println("5. Checkout");
                System.out.println("6. Keluar");
                System.out.print("Pilih menu: ");
                pilihan = sc.nextInt();

                switch (pilihan) {
                    case 1:
                        store.tampilkanProduk();
                        break;
                    case 2:
                        store.tampilkanProduk();
                        System.out.print("Pilih nomor produk untuk ditambahkan ke keranjang: ");
                        int beli = sc.nextInt();
                        Produk p = store.getProduk(beli - 1);
                        if (p != null) {
                            cart.tambahKeCart(p);
                        } else {
                            System.out.println("Produk tidak tersedia.");
                        }
                        break;
                    case 3:
                        cart.tampilkanCart();
                        break;
                    case 4:
                        cart.tampilkanCart();
                        System.out.print("Pilih nomor produk di keranjang untuk dihapus: ");
                        int delCart = sc.nextInt();
                        cart.hapusDariCart(delCart - 1);
                        break;
                    case 5:
                        if (cart.isEmpty()) {
                            System.out.println("Keranjang masih kosong, tidak bisa checkout.");
                        } else {
                            System.out.print("Apakah Anda yakin ingin checkout? (y/n): ");
                            String konfirmasi = sc.next();
                            if (konfirmasi.equalsIgnoreCase("y")) {
                                cart.checkout();
                            } else {
                                System.out.println("Checkout dibatalkan.");
                            }
                        }
                        break;
                    case 6:
                        System.out.println("Terima kasih sudah menggunakan Toko Online Kami.");
                        break;
                    default:
                        System.out.println("Pilihan tidak valid.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Input harus berupa angka!");
                sc.nextLine(); // clear buffer
            }
        } while (pilihan != 0);

        sc.close();
    }
}
