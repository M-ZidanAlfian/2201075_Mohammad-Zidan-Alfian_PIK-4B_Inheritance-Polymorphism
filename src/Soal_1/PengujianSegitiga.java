/*
 Inheritance,	 Superclasses	 dan	 Subclasses,	 Penggunaan	 Keyword	 Supper,	
Overriding	Methods
(Kelas	 Segitiga)	 Rancang	 kelas	 bernama	 Segitiga	 yang	 memanjang	 Objek	 Geometris.	
Kelas	berisi:	
1) Tiga	bidang	data	ganda	bernama	side1,	side2,	dan	side3	dengan	default	nilai	1.0	
untuk	menunjukkan	tiga	sisi	segitiga.	
2) Konstruktor	tanpa	argumen	yang	membuat	segitiga	default.	
3) Konstruktor	yang	membuat	segitiga	dengan	sisi1	yang	ditentukan,	sisi2,	dan	sisi3.	
Metode	pengakses	untuk	ketiga	bidang	data.	
4) Metode	 bernama	 getArea()	 yang	 mengembalikan	 luas	 segitiga	 ini.	 Metode	
bernama	getPerimeter()	yang	mengembalikan	perimeter	segitiga	ini.	
5) Metode	bernama	toString()	yang	mengembalikan	deskripsi	string	untuk	segitiga.	
Untuk	rumus	menghitung	luas	segitiga,	lihat	Latihan	Pemrograman	2.19.	
6) Metode	toString()	diimplementasikan	sebagai	berikut:	return	"Segitiga:	sisi1	=	"	
+	sisi1	+	"	sisi2	=	"	+	sisi2	+	"	sisi3	=	"	+	sisi3;	
Tulis	program	pengujian	yang	meminta	pengguna	memasukkan	tiga	sisi	segitiga,	warna,	
dan	nilai	Boolean	untuk	menunjukkan	apakah	segitiga	terisi.	Program	harus	membuat	
objek	 Segitiga	 dengan	 sisi-sisi	 ini	 dan	 mengatur	 warna	 dan	 properti	 yang	 diisi	
menggunakan input.	Program	harus	menampilkan	luas,	keliling,	warna,	dan	benar	atau	
salah	untuk	menunjukkan	apakah	diisi	atau	tidak
 */
package Soal_1;

import java.util.Scanner;

public class PengujianSegitiga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan sisi1 segitiga: ");
        double side1 = input.nextDouble();
        System.out.print("Masukkan sisi2 segitiga: ");
        double side2 = input.nextDouble();
        System.out.print("Masukkan sisi3 segitiga: ");
        double side3 = input.nextDouble();
        System.out.print("Masukkan warna segitiga: ");
        String color = input.next();
        System.out.print("Apakah segitiga terisi (true/false): ");
        boolean filled = input.nextBoolean();

        Segitiga segitiga = new Segitiga(side1, side2, side3);
        segitiga.setColor(color);
        segitiga.setFilled(filled);
        System.out.println(segitiga.toString());
        System.out.println("Luas segitiga       :  " + segitiga.getArea());
        System.out.println("Keliling segitiga   :  " + segitiga.getPerimeter());
        System.out.println("Warna segitiga      :  " + segitiga.getColor());
        System.out.println("Apakah segitiga terisi: " + segitiga.isFilled());
        
    }
}

