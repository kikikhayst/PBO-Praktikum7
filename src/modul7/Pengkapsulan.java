/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul7;

import java.util.*;

/**
 *
 * @author ASUS
 */
class lingkaran {

    private int jari;

    public void setJari(int i) {
        jari = i;
    }

    private double getLuas() {
        double luas = jari * jari * 3.14;
        return luas;
    }

    public void display() {
        System.out.println("Luas lingkaran dengan jari-jari " + jari + " = " + getLuas());
    }
}

public class Pengkapsulan {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Jari-jari: ");
        int jejari = input.nextInt();
        lingkaran a = new lingkaran();
        a.setJari(jejari);
        a.display();
    }
}
