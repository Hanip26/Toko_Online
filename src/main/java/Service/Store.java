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


public class Store {
    private List<Produk> daftarProduk = new ArrayList<>();

    public Store() {
        // Produk default swalayan
        daftarProduk.add(new Produk("Laptop", 7500000));
        daftarProduk.add(new Produk("Smartphone", 3000000));
        daftarProduk.add(new Produk("Headphone", 500000));
        daftarProduk.add(new Produk("Keyboard", 250000));
        daftarProduk.add(new Produk("Mouse", 150000));
        daftarProduk.add(new Produk("Speaker", 175000));
        daftarProduk.add(new Produk("Smart Watch", 1500000));
    }

    public void tampilkanProduk() {
        System.out.println("\n=== Daftar Produk ===\n");
        System.out.printf("%-5s %-20s %-20s\n", "No", "Nama Produk", "Harga");
        System.out.println("--------------------------------------------------------");
        for (int i = 0; i < daftarProduk.size(); i++) {
            Produk p = daftarProduk.get(i);
            System.out.printf("%-5d %-20s %-20s\n",
                    (i + 1), p.getNama(), FormatUtil.formatRupiah(p.getHarga()));
        }
        System.out.println("--------------------------------------------------------");
    }

    public Produk getProduk(int index) {
        if (index >= 0 && index < daftarProduk.size()) {
            return daftarProduk.get(index);
        }
        return null;
    }

    public int getJumlahProduk() {
        return daftarProduk.size();
    }
}
