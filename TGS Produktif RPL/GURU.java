// Object Class

public class GURU {
    String Nama, Mapel, Alamat;
    int id;

    // Constuctor Name same as Class Name
    public GURU() {
        Nama = "";
        Mapel = "";
        Alamat = "";
        id = 0;
    }

    // constructor parameter
    public GURU(int id, String Nama, String Alamat, String Mapel) {
        this.id = id;
        this.Mapel = Mapel;
        this.Alamat = Alamat;
        this.Nama = Nama;
    }

    // Method
    public void print() {
        System.out.println("|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|");
        System.out.println("ID: " + id);
        System.out.println("NAMA: " + Nama);
        System.out.println("MAPEL: " + Mapel);
        System.out.println("ALAMAT: " + Alamat);
        System.out.println("|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|");
<<<<<<< HEAD

        System.out.println()
=======

>>>>>>> 589d61cff9e241adb0bd19464492627c3470a90c
    }

}
