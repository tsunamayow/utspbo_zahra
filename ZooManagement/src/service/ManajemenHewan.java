package src.service;

import java.util.ArrayList;
import java.util.Scanner;
import src.model.Hewan;

public class ManajemenHewan {
    private ArrayList<Hewan> daftarHewan = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void tambahData() {
        System.out.println("\n=== TAMBAH DATA HEWAN BARU ===");
        System.out.print("Masukkan ID Hewan: ");
        String id = scanner.nextLine();
        System.out.print("Masukkan Nama Hewan: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan Jenis Hewan: ");
        String jenis = scanner.nextLine();
        System.out.print("Masukkan Habitat: ");
        String habitat = scanner.nextLine();
        System.out.print("Masukkan Kondisi Kesehatan: ");
        String kondisi = scanner.nextLine();

        daftarHewan.add(new Hewan(id, nama, jenis, habitat, kondisi));
        System.out.println("✅ Data berhasil disimpan!\n");
    }

    public void tampilkanData() {
        if (daftarHewan.isEmpty()) {
            System.out.println("⚠️ Belum ada data hewan.\n");
            return;
        }
        System.out.println("\n=== DAFTAR HEWAN ===");
        System.out.println("---------------------------------------------------------------");
        System.out.printf("%-5s %-20s %-15s %-10s %-10s\n", "ID", "Nama Hewan", "Jenis", "Habitat", "Kesehatan");
        System.out.println("---------------------------------------------------------------");
        for (Hewan h : daftarHewan) {
            System.out.println(h);
        }
        System.out.println("---------------------------------------------------------------");
        System.out.println("Total data: " + daftarHewan.size() + "\n");
    }

    public void ubahData() {
        System.out.print("\nMasukkan ID Hewan yang akan diubah: ");
        String id = scanner.nextLine();
        Hewan hewan = cariById(id);

        if (hewan != null) {
            System.out.print("Nama Baru: ");
            hewan.setNama(scanner.nextLine());
            System.out.print("Jenis Baru: ");
            hewan.setJenis(scanner.nextLine());
            System.out.print("Habitat Baru: ");
            hewan.setHabitat(scanner.nextLine());
            System.out.print("Kondisi Kesehatan Baru: ");
            hewan.setKondisiKesehatan(scanner.nextLine());
            System.out.println("✅ Data berhasil diperbarui!\n");
        } else {
            System.out.println("❌ Data dengan ID tersebut tidak ditemukan.\n");
        }
    }

    public void hapusData() {
        System.out.print("\nMasukkan ID hewan yang ingin dihapus: ");
        String id = scanner.nextLine();
        Hewan hewan = cariById(id);

        if (hewan != null) {
            System.out.print("Yakin ingin menghapus data ini? (Y/N): ");
            String konfirmasi = scanner.nextLine();
            if (konfirmasi.equalsIgnoreCase("Y")) {
                daftarHewan.remove(hewan);
                System.out.println("🗑️ Data berhasil dihapus!\n");
            } else {
                System.out.println("❎ Penghapusan dibatalkan.\n");
            }
        } else {
            System.out.println("⚠️ Data tidak ditemukan.\n");
        }
    }

    public void cariData() {
        System.out.print("\nMasukkan Nama atau ID Hewan: ");
        String keyword = scanner.nextLine().toLowerCase();
        boolean ditemukan = false;

        System.out.println("\n=== HASIL PENCARIAN ===");
        System.out.println("---------------------------------------------------------------");
        System.out.printf("%-5s %-20s %-15s %-10s %-10s\n", "ID", "Nama Hewan", "Jenis", "Habitat", "Kesehatan");
        System.out.println("---------------------------------------------------------------");

        for (Hewan h : daftarHewan) {
            if (h.getNama().toLowerCase().contains(keyword) || h.getIdHewan().toLowerCase().contains(keyword)) {
                System.out.println(h);
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Data tidak ditemukan.");
        }

        System.out.println("---------------------------------------------------------------\n");
    }

    public void hitungTotal() {
        System.out.println("\nJumlah total hewan yang terdaftar: " + daftarHewan.size() + "\n");
    }

    private Hewan cariById(String id) {
        for (Hewan h : daftarHewan) {
            if (h.getIdHewan().equalsIgnoreCase(id)) {
                return h;
            }
        }
        return null;
    }
}
