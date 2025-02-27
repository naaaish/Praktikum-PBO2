/* Nama File        : Mahasiswa.java
 * Deskripsi        : berisi atribut, method dan detail dari class mahasiswa
 * Pembuat          : 24060123120031 / Elvina Neila Samas
 * Tanggal          : 26 Febuari 2025
 */

import java.util.ArrayList;

public class Mahasiswa {

    /* ATRIBUT */
    private String nim;
    private String nama;
    private String prodi;
    private ArrayList<MataKuliah> listMatkul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    /* KONSTRUKTOR TANPA PARAMETER */

    public Mahasiswa(){
        this.nim = "";
        this.nama = "";
        this.prodi = "";
        this.listMatkul = new ArrayList<>();

    }

    /* KONSTRUKTOR DENGAN PARAMETER */

    public Mahasiswa(String nim, String nama, String prodi){
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatkul = new ArrayList<>();
    }


    /* SELEKTOR */
    public String getNamaMhs(){
        return this.nama;
    }

    public String getNimMhs(){
        return this.nim;
    }

    public String getProdiMhs(){
        return this.prodi;
    }

    /* MUTATOR */
    public void setNamaMhs(String nama){
        this.nama = nama;
    }

    public void setNimMhs(String nim){
        this.nim = nim;
    }

    public void setProdiMhs(String prodi){
        this.prodi = prodi;
    }

    public void setDosenWali(Dosen dosenWali){
        this.dosenWali = dosenWali;
    }

    public void setKendaraanMhs(Kendaraan kendaraan){
        this.kendaraan = kendaraan;
    }

    /*  METHOD LAINNYA */
    public void addMatkul(MataKuliah Matkul){
        if(listMatkul.size() < 50){
            listMatkul.add(Matkul);
        } else {
            System.out.println("Maksimal 50 Mata Kuliah");
        }
    }

    public int getJumlahSks(){
        int total = 0;
        for(MataKuliah Matkul : listMatkul){
            total += Matkul.getSks();
        }
        return total;
    }

    public int getJumlahMatkul(){
        return listMatkul.size();
    }

    public void printMahasiswa(){
        System.out.println("Nama Mahasiswa: " + getNamaMhs() + " NIM: " + getNimMhs() + " (Prodi: " + getProdiMhs() + ")");
    }


    public void printDetailMhs(){
        System.out.println("_________________________________");
        printMahasiswa();
        System.out.println("Jumlah Mata Kuliah: " + getJumlahMatkul());
        System.out.println("Total SKS diambil: " + getJumlahSks());
        System.out.println("Daftar Mata Kuliah: ");
        for (MataKuliah Matkul: listMatkul){
            Matkul.printMatkul();
        }
        dosenWali.printDosen();
        if (kendaraan != null){
            kendaraan.printKendaraan();
        } else {
            System.out.println("Detail kendaraan: Mahasiswa tidak menggunakan kendaraan");
        }

        System.out.println("_______________________________");
    }

}


