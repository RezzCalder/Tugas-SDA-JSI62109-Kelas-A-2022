package p;

import java.util.ArrayList;

public class tugas1soal5 {
    public static void main(String[] args) {
        ArrayList<String> nama = new ArrayList<String>();
        nama.add("D");
        nama.add("H");
        nama.add("A");
        nama.add("N");

        nama.remove(3);
        nama.remove(2);
        nama.remove(0);
        System.out.println("Ketika Index 0, 2 dan 3 dihapus, nama berubah menjadi " + nama);
    }

}