package Modul7.Tugas.Percobaan2;

public class Overload {
    void myMethod(short s)
    {
        System.out.println("short");
    }
    void myMethod(int i)
    {
        System.out.println("int");
    }
    void myMethod(long l)
    {
        System.out.println("long");
    }
    public static void main(String[] args)
    {
        byte b = 1;

        Overload o = new Overload();
        o.myMethod(b);
    }
}
