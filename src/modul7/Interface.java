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
interface intLampu {

    public static final int keadaanHidup = 1;
    public static final int keadaanMati = 0;

    public abstract void hidupkan();

    public abstract void matikan();
}

class lampu implements intLampu {

    int statusLampu;

    public void hidupkan() {
        if (this.statusLampu == keadaanMati) {
            this.statusLampu = keadaanHidup;
            System.out.println("Lampu hidup");
        } else {
            System.out.println("Lampu sudah hidup");
        }
    }

    public void matikan() {
        if (this.statusLampu == keadaanHidup) {
            this.statusLampu = keadaanMati;
            System.out.println("Lampu mati");
        } else {
            System.out.println("Lampu sudah mati");
        }
    }
}

public class Interface {

    public static void main(String args[]) {
        lampu lampuKamar = new lampu();
        lampuKamar.hidupkan();
        lampuKamar.hidupkan();
        lampuKamar.matikan();
        lampuKamar.matikan();
    }
}
