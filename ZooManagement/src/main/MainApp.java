package src.main;

import java.util.Scanner;
import src.service.ManajemenHewan;

public class MainApp {
    public static void main(String[] args) {
        ManajemenHewan manajemen = new ManajemenHewan();
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("===============================================");
            System.out.println(" APLIKASI MANAJEMEN HEWAN KEBUN BINATANG ");
            System.out.println("===============================================");
            System.out.println("1. Tambah Data Hewan");
            System.out.println("2. Tampilkan Data Hewan");
            System.out.println("3. Ubah Data Hewan");
            System.out.println("4. Hapus Data Hewan");
            System.out.println("5. Cari Data Hewan");
            System.out.println("6. Hitung Total Hewan");
            System.out.println("7. Keluar");
            System.out.print("Pilih menu [1-7]: ");

            while (!input.hasNextInt()) {
                System.out.println("Masukkan angka antara 1-7!");
                input.next();
                System.out.print("Pilih menu [1-7]: ");
            }

            pilihan = input.nextInt();
            input.nextLine(); // konsumsi newline

            switch (pilihan) {
                case 1 -> manajemen.tambahData();
                case 2 -> manajemen.tampilkanData();
                case 3 -> manajemen.ubahData();
                case 4 -> manajemen.hapusData();
                case 5 -> manajemen.cariData();
                case 6 -> manajemen.hitungTotal();
                case 7 -> System.out.println("👋 Terima kasih telah menggunakan aplikasi!");
                default -> System.out.println("❌ Pilihan tidak valid.\n");
            }
        } while (pilihan != 7);

        input.close();
    }
}
