// Driver Class

import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class TestSiswa {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("NAMA: ");
        String nama = in.nextLine();
        System.out.println("ID: ");
        int id = in.nextInt();
        System.out.println("IPK: ");
        double ipk = in.nextDouble();

        // membuat obyek
        Siswa ardi = new Siswa(130909, "nama", 12.9);
        Siswa nabil = new Siswa(192208, "nabil", 9.0);
        ardi.id = 130909;
        ardi.nama = "Mahardika Arfuri";
        ardi.ipk = 12.9;

        nabil.id = 192208;
        nabil.nama = "Muhammad Nabil Anwar Kencana";
        nabil.ipk = 9.0;

    }
}
