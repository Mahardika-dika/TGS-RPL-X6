
import java.util.Scanner;

public class TestGuru {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Nama :");
        int id = in.nextInt();
        String Nama = in.nextLine();
        System.out.println("Mapel :");
        String Mapel = in.nextLine();
        System.out.println("Alamat:");
        String Alamat = in.nextLine();
        System.out.println("ID :");

        // Membuat objek
        GURU PashataniaFitriIndahLestari = new GURU(1, "Pashatania Fitri Indah Lestari", "Malang", "Produktif RPL");
        PashataniaFitriIndahLestari.id = 1;
        PashataniaFitriIndahLestari.Nama = "Pashatania Fitri Indah Lestari ";
        PashataniaFitriIndahLestari.Mapel = "Produktif RPL ";
        PashataniaFitriIndahLestari.Alamat = "Malang";

        System.out.println("DAFTAR NAMA GURU: ");
        System.out.println("DATA BU PASHA: ");
        System.out.println(PashataniaFitriIndahLestari.id);
        System.out.println(PashataniaFitriIndahLestari.Nama);
        System.out.println(PashataniaFitriIndahLestari.Mapel);
        System.out.println(PashataniaFitriIndahLestari.Alamat);

        GURU AuliaMasadah = new GURU(2, "Aulia Mas'adah", "Malang", "Produktif RPL");
        AuliaMasadah.id = 2;
        AuliaMasadah.Nama = "Aulia Mas'adah ";
        AuliaMasadah.Mapel = "Produktif RPL";
        AuliaMasadah.Alamat = "Malang";

        System.out.println("DATA BU AULIA: ");
        System.out.println(AuliaMasadah.id);
        System.out.println(AuliaMasadah.Nama);
        System.out.println(AuliaMasadah.Mapel);
        System.out.println(AuliaMasadah.Alamat);

        GURU DiaurRahman = new GURU(3, "Diaur Rahman", "Malang", "IPAS, Pendidikan Jasmani");
        DiaurRahman.id = 3;
        DiaurRahman.Nama = "Diaur Rahman";
        DiaurRahman.Mapel = "IPAS, Pendidikan Jasmani";
        DiaurRahman.Alamat = "Malang";

        System.out.println("DATA PAK DIAUR: ");
        System.out.println(DiaurRahman.id);
        System.out.println(DiaurRahman.Nama);
        System.out.println(DiaurRahman.Mapel);
        System.out.println(DiaurRahman.Alamat);

        GURU FirmansyahAyatullah = new GURU(4, "Firmansyah Ayatullah", "Malang", "Informatika (ui/ux design)");
        FirmansyahAyatullah.id = 4;
        FirmansyahAyatullah.Nama = "Firmansyah Ayatullah";
        FirmansyahAyatullah.Mapel = "Informatika (ui/ux design)";
        FirmansyahAyatullah.Alamat = "Malang";

        System.out.println("DATA PAK FIRMAN: ");
        System.out.println(FirmansyahAyatullah.id);
        System.out.println(FirmansyahAyatullah.Nama);
        System.out.println(FirmansyahAyatullah.Mapel);
        System.out.println(FirmansyahAyatullah.Alamat);

        GURU AgusHariPurwanto = new GURU(5, "Agus Hari Purwanto", "Malang", "Bahasa Indonesia");
        AgusHariPurwanto.id = 5;
        AgusHariPurwanto.Nama = "Agus Hari Purwanto";
        AgusHariPurwanto.Mapel = "Bahasa Indonesia";
        AgusHariPurwanto.Alamat = "Malang";

        System.out.println("DATA PAK AGUS: ");
        System.out.println(AgusHariPurwanto.id);
        System.out.println(AgusHariPurwanto.Nama);
        System.out.println(AgusHariPurwanto.Mapel);
        System.out.println(AgusHariPurwanto.Alamat);

        PashataniaFitriIndahLestari.print();
        AuliaMasadah.print();
        DiaurRahman.print();
        FirmansyahAyatullah.print();
        AgusHariPurwanto.print();
    }

}
