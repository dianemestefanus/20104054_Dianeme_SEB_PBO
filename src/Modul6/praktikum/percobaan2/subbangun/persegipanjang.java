package Modul6.praktikum.percobaan2.subbangun;

import Modul6.praktikum.percobaan2.bangundatar;

public class persegipanjang extends bangundatar {
    double panjang;
    double lebar;


    @Override
    public double luas() {
        return panjang * lebar;
    }

    @Override
    public double keliling() {
        return 2 * (panjang + lebar);
    }

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }
}
