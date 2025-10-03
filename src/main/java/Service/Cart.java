/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

/**
 *
 * @author msi
 */

import Model.Produk;
import Util.FormatUtil;
import java.util.ArrayList;
import java.util.List;


public class Cart {
    private List<Produk> items = new ArrayList<>();

    public void tambahKeCart(Produk p) {
        items.add(p);
        System.out.println(p.getNama() + " berhasil ditambahkan ke keranjang.");
    }

    public void hapusDariCart(int index) {
        if (index >= 0 && index < items.size()) {
            Produk p = items.remove(index);
            System.out.println(p.getNama() + " berhasil dihapus dari keranjang.");
        } else {
            System.out.println("Produk tidak ditemukan di keranjang.");
        }
    }

    public void tampilkanCart() {
        System.out.println("\n=== Isi Keranjang ===\n");
        if (items.isEmpty()) {
            System.out.println("Keranjang masih kosong.");
            return;
        }
        double total = 0;
        System.out.printf("%-5s %-20s %-20s\n", "No", "Nama Produk", "Harga");
        System.out.println("---------------------------------------------------");
        for (int i = 0; i < items.size(); i++) {
            Produk p = items.get(i);
            System.out.printf("%-5d %-20s %-20s\n",
                    (i + 1), p.getNama(), FormatUtil.formatRupiah(p.getHarga()));
            total += p.getHarga();
        }
        System.out.println("---------------------------------------------------");
        System.out.println("Total Belanja: " + FormatUtil.formatRupiah(total));
    }

    public double getTotal() {
        return items.stream().mapToDouble(Produk::getHarga).sum();
    }

    public void checkout() {
        System.out.println("\n=== NOTA PEMBAYARAN ===");
        tampilkanCart();
        if (!items.isEmpty()) {
            System.out.println("Total Bayar: " + FormatUtil.formatRupiah(getTotal()));
            items.clear();
            System.out.println("Checkout selesai. Terima kasih sudah belanja!");
        }
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }
}
