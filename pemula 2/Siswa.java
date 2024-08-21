// Object Class

public class Siswa {
    int id;
    String nama;
    double ipk;

    // Constructor nama sama dengan nama Class
    public Siswa () {
        id = 130909;
        nama = "";
        ipk = 12.9;
    }
    // constructor parameter
    public Siswa (int id, String nama, double ipk) {
        this.id = id;
        this.nama = nama;
        this.ipk = ipk;
    }

    // Method
    public void print() {
        System.out.println("|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|");
        System.out.println("ID: " + id);
        System.out.println("NAMA: " + nama);
        System.out.println("IPK: " + ipk);
        System.out.println("|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|");
    }
}