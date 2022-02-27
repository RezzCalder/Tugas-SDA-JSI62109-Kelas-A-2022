package p;

import java.util.ArrayList;

public class tugas1soal4 {
    public static void main(String[] args) {
        ArrayList<String> nama = new ArrayList<String>();
        nama.add("D");
        nama.add("H");
        nama.add("A");
        nama.add("N");

        System.out.println("Huruf A pada nama D,H,A,N berada di index " + nama.indexOf("A"));
        System.out.println("Huruf C pada nama D,H,A,N berada di index " + nama.indexOf("C"));
        System.out.println("Huruf Q pada nama D,H,A,N berada di index " + nama.indexOf("Q"));
    }

}