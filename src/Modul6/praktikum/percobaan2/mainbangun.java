package Modul6.praktikum.percobaan2;

import Modul6.praktikum.percobaan2.subbangun.lingkaran;
import Modul6.praktikum.percobaan2.subbangun.persegi;
import Modul6.praktikum.percobaan2.subbangun.persegipanjang;
import Modul6.praktikum.percobaan2.subbangun.segitiga;
public class mainbangun {
    public static void main(String[] args) {
        persegi persegi = new persegi ();
        persegi.setSisi(5);
        persegi.luas();
        persegi.keliling();

        lingkaran lingkaran = new lingkaran();
        lingkaran.setJariJari(14);
        lingkaran.luas();
        lingkaran.keliling();

        persegipanjang persegiPanjang = new persegipanjang();
        persegiPanjang.setPanjang(11);
        persegiPanjang.setLebar(6);
        System.out.println("PP Luas\t: " + persegiPanjang.luas());
        System.out.println("PP Kel\t: " + persegiPanjang.keliling());

        segitiga segitiga = new segitiga();
        segitiga.setAlas(7);
        segitiga.setTinggi(10);
        segitiga.luas();
        segitiga.keliling();


    }
}
