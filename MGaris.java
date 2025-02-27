/* Nama File        : MGaris.java
 * Deskripsi        : aplikasi dari class Garis (file Garis.java)
 * Pembuat          : 24060123120031 / Elvina Neila Samas
 * Tanggal          : 18 Febuari 2025
 */

public class MGaris {
    public static void main(String[] args){
        
        Garis G1 = new Garis(); 
        Garis G2 = G1; 

        System.err.println("Koordinat garis G1 :");
        G1.printKoordinatGaris(); 
        G1.setKoordinatAwalGaris(new Titik(3, 4)); 
        System.err.println("Koordinat garis G1 setelah perubahan titik awal:");
        G1.printKoordinatGaris(); 


        System.err.println(" \n------------------------- ");
        Titik T1 = new Titik(4,5);
        G1.setKoordinatAkhirGaris(T1);
        System.err.println("Koordinat garis G1 setelah perubahan titik akhir:");
        G1.printKoordinatGaris(); 

        G1.setAbsisAwal(1);
        System.err.println("Koordinat garis G1 setelah perubahan absis titik awal:");
        G1.printKoordinatGaris();         


        System.err.println(" \n------------------------- ");
        System.err.println("Panjang garis G1 adalah " + G1.panjangGaris());
        System.err.println(("Gradien garis G1 adalah " + G1.gradienGaris()));
        System.err.println("Titik tengah garis G1 adalah ");
        G1.cariTengah();

        System.err.println(" \n------------------------- ");
        System.err.println("Koordinat garis G2 adalah");
        G2.printKoordinatGaris();
        System.out.println("Apakah garis G1 dan G2 sejajar? : " + G1.isSejajar(G2));

        Garis G3 = new Garis(new Titik(4,5), new Titik(3,8));
        System.err.println("Koordinat garis G3 adalah");
        G3.printKoordinatGaris();

        System.out.println("Apakah garis G1 dan G3 sejajar? : " + G1.isSejajar(G3));


        System.err.println(" \n------------------------- ");
        Garis G4 = new Garis(new Titik(5,2), new Titik(8,3));
        System.err.println("Koordinat garis G4 adalah");
        G4.printKoordinatGaris();
        System.out.println("Apakah garis G1 dan G3 tegak lurus? : " + G1.isTegakLurus(G3));
        System.out.println("Apakah garis G1 dan G2 tegak lurus? : " + G1.isTegakLurus(G2));

        System.err.println("Jumlah garis : " + Garis.getCounterGaris());
    


    }
}
