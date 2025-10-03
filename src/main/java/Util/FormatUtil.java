/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Util;

/**
 *
 * @author msi
 */

import java.text.NumberFormat;
import java.util.Locale;

public class FormatUtil {
    public static String formatRupiah(double value) {
        Locale id = new Locale("id", "ID");
        NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(id);
        return formatRupiah.format(value);
    }
}

