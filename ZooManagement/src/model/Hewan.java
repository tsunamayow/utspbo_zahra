package src.model;

public class Hewan {
    private String idHewan;
    private String nama;
    private String jenis;
    private String habitat;
    private String kondisiKesehatan;

    public Hewan(String idHewan, String nama, String jenis, String habitat, String kondisiKesehatan) {
        this.idHewan = idHewan;
        this.nama = nama;
        this.jenis = jenis;
        this.habitat = habitat;
        this.kondisiKesehatan = kondisiKesehatan;
    }

    public String getIdHewan() {
        return idHewan;
    }

    public void setIdHewan(String idHewan) {
        this.idHewan = idHewan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getKondisiKesehatan() {
        return kondisiKesehatan;
    }

    public void setKondisiKesehatan(String kondisiKesehatan) {
        this.kondisiKesehatan = kondisiKesehatan;
    }

    @Override
    public String toString() {
        return String.format("%-5s %-20s %-15s %-10s %-10s", idHewan, nama, jenis, habitat, kondisiKesehatan);
    }
}
