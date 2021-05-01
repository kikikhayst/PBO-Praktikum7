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
class person {

    protected String nama;
    protected String alamat;

    public person(String namaku, String alamatku) {
        super();
        nama = namaku;
        alamat = alamatku;
    }

    protected void hello() {
        System.out.println("Saya Orang Indonesia");
    }
}

class mahasiswa extends person {

    protected String nim;

    public mahasiswa(String namaku, String alamatku) {
        super(namaku, alamatku);
    }

    void setNim(String nimku) {
        nim = nimku;
    }

    void dataaDiri() {
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("NIM: " + nim);
    }
}

class dosen extends person {

    protected String nip;

    public dosen(String namaku, String alamatku, String nip) {
        super(namaku, alamatku);
        this.nip = nip;
    }

    void setNip(String nipku) {
        nip = nipku;
    }

    void dataDosen() {
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("NIP: " + nip);
    }
}

class noctis extends dosen {

    public noctis(String a, String b, String c) {
        super(a, b, c);
    }

    void datanoctis() {
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("NIP: " + nip);
    }
}

public class Pewarisan {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("------ Data Mahasiswa ------");
        System.out.print("Masukkan nama mahasiswa: ");
        String namaMhs = input.nextLine();
        System.out.print("Masukkan alamat mahasiswa: ");
        String alamatMhs = input.nextLine();
        System.out.print("Masukkan NIM mahasiswa: ");
        String nimMhs = input.nextLine();
        System.out.println("");
        
        System.out.println("------ Data Dosen ------");
        System.out.print("Masukkan nama dosen: ");
        String namaDsn = input.nextLine();
        System.out.print("Masukkan alamat dosen: ");
        String alamatDsn = input.nextLine();
        System.out.print("Masukkan NIM dosen: ");
        String nipDsn = input.nextLine();
        System.out.println("");
        
        System.out.println("------ Data Noctis ------");
        System.out.print("Masukkan nama: ");
        String noctis1 = input.nextLine();
        System.out.print("Masukkan alamat: ");
        String noctis2 = input.nextLine();
        System.out.print("Masukkan NIP: ");
        String noctis3 = input.nextLine();
        System.out.println("");
        
        mahasiswa a = new mahasiswa(namaMhs, alamatMhs);
        a.setNim(nimMhs);
        a.hello();
        a.dataaDiri();
        System.out.println("");

        dosen b = new dosen(namaDsn, alamatDsn, "");
        b.setNip(nipDsn);
        b.hello();
        b.dataDosen();
        System.out.println("");

        noctis c = new noctis(noctis1, noctis2, noctis3);
        c.datanoctis();
        System.out.println("");
    }
}
