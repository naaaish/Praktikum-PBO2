/* Nama File        : Dosen.java
 * Deskripsi        : berisi atribut, method dan detail dari class dosen
 * Pembuat          : 24060123120031 / Elvina Neila Samas
 * Tanggal          : 26 Febuari 2025
 */


public class Dosen {
    /* ATRIBUT */
    private String nip;
    private String nama;
    private String Prodi;


    /* KONSTRUKTOR TANPA PARAMETER */
    public Dosen(){
        this.nip = "";
        this.nama = "";
        this.Prodi = "";

    }

    /* KONSTRUKTOR DENGAN PARAMETER */
    public Dosen(String nip, String nama, String Prodi){

        this.nip = nip;
        this.nama = nama;
        this.Prodi = Prodi; 
    }

    /* SELEKTOR */
    
    public String getNip(){
        return this.nip;
    }

    public String getNamaDosen(){
        return this.nama;
    }

    public String getProdi(){
        return this.Prodi;
    }

    /* MUTATOR */

    public void setNip(String nip){
        this.nip = nip;
    }

    public void setNamaDosen(String nama){
        this.nama = nama;
    }

    public void setProdi(String Prodi){
        this.Prodi = Prodi;
    }

    public void printDosen(){
        System.out.println("Detail Dosen Wali: ");
        System.out.println("Nama Dosen: " + getNamaDosen());
        System.out.println(" NIP: " + getNip() );
        System.out.println(" Prodi: " + getProdi());
    }
}

