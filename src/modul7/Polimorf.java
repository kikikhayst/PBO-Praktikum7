/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul7;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
class bentuk {

    protected double luas;

    protected void hitungLuas() {
    }
}

class segitiga extends bentuk {

    double alas, tinggi;

    public segitiga() {
        super();
    }

    public void hitungLuas() {
        luas = 0.5 * (alas * tinggi);
        System.out.println("Luas segitiga = " + luas);
        System.out.println("");
    }

    public void setAlas(int a) {
        alas = a;
    }

    public void setTinggi(int t) {
        tinggi = t;
    }
}

class persegi extends bentuk {

    double sisi;

    public persegi(int s) {
        super();
        sisi = s;
    }

    public void hitungLuas() {
        luas = sisi * sisi;
        System.out.println("Luas persegi = " + luas);
        System.out.println("");
    }

}

public class Polimorf {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("--- Luas Segitiga ---");
        System.out.print("Masukkan panjang alas: ");
        int alas = input.nextInt();
        System.out.print("Masukkan panjang tinggi: ");
        int tinggi = input.nextInt();
        segitiga a = new segitiga();
        a.setAlas(alas);
        a.setTinggi(tinggi);
        a.hitungLuas();

        System.out.println("--- Luas Persegi ---");
        System.out.print("Masukkan panjang sisi: ");
        int sisi = input.nextInt();
        persegi b = new persegi(sisi);
        b.hitungLuas();
    }
}
