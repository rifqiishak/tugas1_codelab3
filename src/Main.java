import tugas.tgs4.info;

import java.util.Scanner;

/**
 * Kelas Main sebagai titik masuk program untuk menerima input data siswa
 * dan mengelola objek siswa untuk menampilkan hasilnya.
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama siswa: ");
        String nama = input.nextLine();

        System.out.print("Masukkan jumlah mata pelajaran: ");
        int jumlahMataPelajaran = input.nextInt();

        Siswa siswa = new Siswa(new info(nama, jumlahMataPelajaran));

        siswa.masukkanNilai();
        siswa.tampilkanHasil();
    }
}