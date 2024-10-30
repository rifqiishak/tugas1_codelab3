import tugas.tgs4.info;

import java.util.Scanner;

/**
 * Class Siswa untuk merepresentasikan data dan aktivitas siswa.
 * Berisi informasi nama, nilai, dan rata-rata nilai siswa.
 */
class Siswa {
    private String nama;
    private double[] nilai;
    private double rataRata;

    /**
     * Konstruktor untuk inisialisasi data siswa.
     * @param info objek yang berisi informasi nama dan jumlah mata pelajaran siswa.
     */
    public Siswa(info info) {
        this.setNama(info.nama());
        this.setNilai(new double[info.jumlahMataPelajaran()]);
    }

    /**
     * Method untuk memasukkan nilai siswa dari input pengguna.
     */
    public void masukkanNilai() {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < getNilai().length; i++) {
            System.out.print("Masukkan nilai mata pelajaran ke-" + (i + 1) + ": ");
            getNilai()[i] = input.nextDouble();
        }
    }

    /**
     * Method untuk menghitung rata-rata nilai siswa.
     */
    public void hitungRataRata() {
        double total = calculateBonus();
        for (double n : getNilai()) {
            total += n;
        }
        setRataRata(total / getNilai().length);
    }

    /**
     * Method untuk menghitung bonus. Saat ini mengembalikan 0 sebagai default.
     * @return nilai bonus
     */
    private static double calculateBonus() {
        double total = 0;
        return total;
    }

    /**
     * Method untuk menampilkan hasil akhir: nama siswa, rata-rata nilai, dan status kelulusan.
     */
    public void tampilkanHasil() {
        hitungRataRata();
        System.out.println("\nNama Siswa: " + getNama());
        System.out.println("Rata-rata Nilai: " + getRataRata());

        if (getRataRata() >= 75) {
            System.out.println("Status: Lulus");
        } else {
            System.out.println("Status: Tidak Lulus");
        }
    }

    /**
     * Getter untuk mendapatkan nama siswa.
     * @return nama siswa
     */
    public String getNama() {
        return nama;
    }

    /**
     * Setter untuk mengatur nama siswa.
     * @param nama nama siswa
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * Getter untuk mendapatkan array nilai siswa.
     * @return array nilai siswa
     */
    public double[] getNilai() {
        return nilai;
    }

    /**
     * Setter untuk mengatur array nilai siswa.
     * @param nilai array nilai siswa
     */
    public void setNilai(double[] nilai) {
        this.nilai = nilai;
    }

    /**
     * Getter untuk mendapatkan rata-rata nilai siswa.
     * @return rata-rata nilai siswa
     */
    public double getRataRata() {
        return rataRata;
    }

    /**
     * Setter untuk mengatur rata-rata nilai siswa.
     * @param rataRata rata-rata nilai siswa
     */
    public void setRataRata(double rataRata) {
        this.rataRata = rataRata;
    }
}
