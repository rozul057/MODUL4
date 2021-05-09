ackage modul4;
 

public class mainbilangan extends operasibilangan{
    public static void main (String [] args){
    
        mainbilangan bilangan = new mainbilangan();
        bilangan.setA(10.5);
        bilangan.setB(0.5);
        bilangan.setC();

        System.out.println("Aplikasi Aritmatika");
        System.out.println("Bilangan A : "+bilangan.getA());
        System.out.println("Bilangan B : "+bilangan.getB());

        bilangan.tampil();

        operasipenjumlahan tambah = new operasipenjumlahan();
        tambah.setA(10.5);
        tambah.setB(0.5);
        tambah.setC();

        System.out.println(" ");
        System.out.println("-- PENJUMLAHAN --");
        System.out.println("Bilangan A : "+bilangan.getA());
        System.out.println("Bilangan A : "+bilangan.getB());
        System.out.println("A + B : "+tambah.getC());

        tambah.tampil();

        operasipengurangan kurang = new operasipengurangan();
        kurang.setA(10.5);
        kurang.setB(0.5);
        kurang.setC();

        System.out.println(" ");
        System.out.println("-- PENGURANGAN --");
        System.out.println("Bilangan A : "+kurang.getA());
        System.out.println("Bilangan A : "+kurang.getB());
        System.out.println("A - B : "+kurang.getC());

        kurang.tampil();

        operasiperkalian per = new operasiperkalian();
        per.setA(10.5);
        per.setB(0.5);
        per.setC();

        System.out.println(" ");
        System.out.println("-- PERKALIAN --");
        System.out.println("Bilangan A : "+per.getA());
        System.out.println("Bilangan A : "+per.getB());
        System.out.println("A * B : "+per.getC());

        per.tampil();

        operasipembagian bag = new operasipembagian();
        bag.setA(10.5);
        bag.setB(0.5);
        bag.setC();

        System.out.println(" ");
        System.out.println("-- PEMBAGIAN --");
        System.out.println("Bilangan A : "+bag.getA());
        System.out.println("Bilangan A : "+bag.getB());
        System.out.println("A/B : "+bag.getC());

        bag.tampil();
   }
}
