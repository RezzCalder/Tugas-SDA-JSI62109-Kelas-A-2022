package p;

import java.util.ArrayList;

public class tugas1soal6 {
    public static void main(String[] args) {
        ArrayList<String> nama = new ArrayList<String>();
        nama.add("D");
        nama.add("H");
        nama.add("A");
        nama.add("N");

        System.out.println("Nama saya adalah D,H,A,N");
        nama.add(0,"E");
        System.out.println("Ketika ditambahkan e pada index ke-0 maka nama menjadi " + nama);

        nama.add(2,"F");
        System.out.println("Ketika ditambahkan f pada index ke-2 maka nama menjadi " + nama);

        nama.add(3,"G");
        System.out.println("Ketika ditambahkan g pada index ke-3 maka nama menjadi " + nama);

        nama.add(4,"H");
        System.out.println("Ketika ditambahkan h pada index ke-4 maka nama menjadi " + nama);

        nama.add(6,"H");
        System.out.println("Ketika ditambahkan h pada index ke-6 maka nama menjadi " + nama);

        nama.add(-3,"J");
        System.out.println("Ketika ditambahkan j pada index ke-(-3) maka nama menjadi " + nama);
        }
}