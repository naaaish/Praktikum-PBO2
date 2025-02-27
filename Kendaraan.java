/* Nama File        : Kendaraan.java
 * Deskripsi        : berisi atribut, method dan detail dari class kendaraan
 * Pembuat          : 24060123120031 / Elvina Neila Samas
 * Tanggal          : 26 Febuari 2025
 */


public class Kendaraan {
    /* ATRIBUT */

    public String noPlat;
    public String jenis;

    /* KONSTRUKTOR TANPA PARAMETER */

    public Kendaraan(){
        this.noPlat = "";
        this.jenis = "";
    }

    /* KONSTRUKTOR DENGAN PARAMETER */

    public Kendaraan(String noPlat, String jenis){
        this.noPlat = noPlat;
        this.jenis = jenis;
    }


    /* SELEKTOR */
    public String getNoPlat(){
        return this.noPlat;
    }

    public String getJenis(){
        return this.jenis;
    }

    /* MUTATOR */
    public void setNoPlat(String noPlat){
        this.noPlat = noPlat;
    }

    public void setJenis(String jenis){
        this.jenis = jenis;
    }

    public void printKendaraan(){
        System.out.println("Detail Kendaraan:");
        System.out.println(" Plat Kendaraan: " + getNoPlat());
        System.out.println(" Jenis Kendaraan: " + getJenis());
    }
}
