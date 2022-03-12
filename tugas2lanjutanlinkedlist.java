package tugas2;

import java.util.LinkedList;

public class tugas2lanjutanlinkedlist {
    public static void main(String[] args) {

        LinkedList <String> Nama_Mahasiswa = new LinkedList<>();
        LinkedList <String> Nomor_BP = new LinkedList<>();
        LinkedList <String> Alamat = new LinkedList<>();

        Nama_Mahasiswa.add("Ali The Chipmunk");
        Nama_Mahasiswa.add("Carberus");
        Nama_Mahasiswa.add("Babak The Builder");

        Nomor_BP.add("2148");
        Nomor_BP.add("2150");
        Nomor_BP.add("2151");

        Alamat.add("Chernobyl");
        Alamat.add("Area 51");
        Alamat.add("Sumbar Empire");

        System.out.println(" ");
        System.out.println("DATA MAHASISWA");
        System.out.println("--------------");
        System.out.println("Nama\t: " + Nama_Mahasiswa);
        System.out.println("No BP\t: " + Nomor_BP);
        System.out.println("Alamat\t: " + Alamat);
        System.out.println(" ");

        //add
        Nama_Mahasiswa.addLast("Dararari");
        Nomor_BP.addLast("2161");
        Alamat.addLast("Perkampungan Preman");

        System.out.println("ADD");
        System.out.println("---");
        System.out.println("Tambahkan AddLast Pada Nama_Mahasiswa, Nomor_BP, dan Alamat");
        System.out.println(" "); 
        System.out.println("Nama\t: " + Nama_Mahasiswa);
        System.out.println("Nomor_BP\t: " + Nomor_BP);
        System.out.println("Alamat\t: " + Alamat);
        System.out.println(" ");

        //set
        Nama_Mahasiswa.set(2, "Epos Galang");
        Nomor_BP.set(2, "2158");
        Alamat.set(2, "GH Evos");

        System.out.println("SET");
        System.out.println("---");
        System.out.println("Set atau menumpukkan pada index ke-2 pada Nama_Mahasiswa, Nomor_BP, dan Alamat");
        System.out.println(" ");
        System.out.println("Nama\t: " + Nama_Mahasiswa);
        System.out.println("Nomor_BP\t: " + Nomor_BP);
        System.out.println("Alamat\t: " + Alamat);
        System.out.println(" ");
 
        //remove
        Nama_Mahasiswa.removeLast();
        Nama_Mahasiswa.remove(1);
        
        Nomor_BP.removeLast();
        Nomor_BP.remove(1);

        Alamat.removeLast();
        Alamat.remove(1);

        System.out.println("REMOVE");
        System.out.println("------");
        System.out.println("Hapus index ke-1 dan terakhir pada Nama, Nomor_BP, dan Alamat");
        System.out.println(" ");
        System.out.println("Nama\t: " + Nama_Mahasiswa);
        System.out.println("Nomor_BP\t: " + Nomor_BP);
        System.out.println("Alamat\t: " + Alamat);
        System.out.println(" ");
        
        //push
        Nama_Mahasiswa.push("Garox-kun");
        Nomor_BP.push("2111");
        Alamat.push("Bandung");

        Nama_Mahasiswa.push("Mas Agus");
        Nomor_BP.push("2133");
        Alamat.push("Indihome Tanggerang");

        System.out.println("PUSH");
        System.out.println("----");
        System.out.println("Push dua data baru berupa Nama, Nomor_BP, dan Alamat");
        System.out.println(" ");
        System.out.println("Nama\t: " + Nama_Mahasiswa);
        System.out.println("Nomor_BP\t: " + Nomor_BP);
        System.out.println("Alamat\t: " + Alamat);
        System.out.println(" ");

        //pop
        Nama_Mahasiswa.pop();
        Nomor_BP.pop();
        Alamat.pop();

        System.out.println("POP");
        System.out.println("---");
        System.out.println("Pop data Nama, Nomor_BP, dan Alamat");
        System.out.println(" ");
        System.out.println("Nama\t: " + Nama_Mahasiswa);
        System.out.println("Nomor_BP\t: " + Nomor_BP);
        System.out.println("Alamat\t: " + Alamat);
        System.out.println(" ");

        //get 
        System.out.println("GET");
        System.out.println("---");
        System.out.println("Tampilkan data mahasiswa di index ke-1");
        System.out.println(" ");
        System.out.println(Nama_Mahasiswa.get(1));
        System.out.println(Nomor_BP.get(1));
        System.out.println(Alamat.get(1));
        System.out.println(" ");

        //size
        System.out.println("SIZE");
        System.out.println("----");
        System.out.println("Jumlah Akhir Data Mahasiswa: " + Nama_Mahasiswa.size());
        System.out.println(" ");


    }
    
}
