package p;

import java.util.ArrayList;

public class tugas1soal3 {
    public static void main(String[] args) {
        ArrayList<String> nama = new ArrayList<String>();
        nama.add("D");
        nama.add("H");
        nama.add("A");
        nama.add("N");

        System.out.println("Data pada Index 0 adalah " + nama.get(0));
        System.out.println("Data pada Index 2 adalah " + nama.get(2));
        System.out.println("Data pada Index 6 adalah " + nama.get(6));
        System.out.println("Data pada Index -3 adalah " + nama.get(-3));
        }

}
