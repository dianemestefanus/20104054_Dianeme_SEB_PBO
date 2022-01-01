package Modul2;

import Modul2.protec.ModifierSubClass;

public class MainSub extends ModifierSubClass {
    public static void main(String[] args) {
        MainSub mainSub = new MainSub();

        System.out.println( mainSub.teksPublic );
        System.out.println( mainSub.teksProtect );

        // System.out.println( mainSub.teksPrivate );
        // System.out.println( mainSub.teks );

    }
}
