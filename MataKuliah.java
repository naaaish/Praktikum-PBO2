/* Nama File        : MataKuliah.java
 * Deskripsi        : berisi atribut, method dan detail dari class MataKuliah
 * Pembuat          : 24060123120031 / Elvina Neila Samas
 * Tanggal          : 26 Febuari 2025
 */


public class MataKuliah {
    private String idMatkul;
    private String nama;
    private int sks;

    /* KONSTRUKTOR TANPA PARAMETER */
    public MataKuliah(){
        this.idMatkul = "";
        this.nama = "";
        this.sks = 0;
    }

    /* KONSTRUKTOR DENGAN PARAMETER */
    public MataKuliah(String idMatkul, String nama, int sks){
        this.idMatkul = idMatkul;
        this.nama = nama;
        this.sks = sks;
    }

    /* SELEKTOR */
    public String getIdMatkul(){
        return this.idMatkul;
    }

    public String getNamaMK(){
        return this.nama;
    }

    public int getSks(){
        return this.sks;
    }


    /* MUTATOR */
    public void setIdMatkul(String idMatkul){
        this.idMatkul = idMatkul;
    }

    public void setNamaMatkul(String nama){
        this.nama = nama;
    }

    public void setSks(int sks){
        this.sks = sks;
    }

    public void printMatkul(){
        System.out.println(getIdMatkul() + " - " + getNamaMK() + " (" + getSks() + ")");
    }
}
