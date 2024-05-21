/*
 Overriding	 vs.	 Overloading,	 Polymorphism,	 Protected	 Data	 dan	 Methods,	
Preventing	Extending	dan	Overriding
(Kelas	 Person,	 Student,	 Employee,	 Faculty,	 dan	 Staff)	 Rancang	 sebuah	 kelas	 bernama	
Person	 dan	 dua	 subclass-nya	 bernama	 Student	 dan	 Employee. Membuat	 subkelas	
Fakultas	dan	Staf	Pegawai. Seseorang	memiliki	nama,	alamat,	nomor	telepon,	dan	alamat	
email. Seorang	siswa	memiliki	status	kelas	(mahasiswa	baru,	mahasiswa	tahun	kedua,	
junior,	 atau	 senior). Tentukan	 status	 sebagai	 konstanta. Seorang	 karyawan	 memiliki	
kantor,	gaji,	dan	tanggal	dipekerjakan. Gunakan	kelas	MyDate	yang	dideYinisikan	dalam	
Latihan	Pemrograman	10.14	untuk	membuat	objek	untuk	tanggal	yang	disewa. Seorang	
anggota	fakultas	memiliki	jam	kerja	dan	pangkat. Seorang	anggota	staf	memiliki	gelar.
Ganti	metode	toString	di	setiap	kelas	untuk	menampilkan	nama	kelas	dan	nama	orang.	
Tulis	program	pengujian	yang	membuat	Person,	Student,	Employee,	Faculty,	dan	Staff,	
dan	memanggil	metode	toString()	mereka
 */
package Soal_2;

public class Pengujian {
    public static void main(String[] args) {
        MyDate dateHired = new MyDate(2020, 5, 15);

        Person person = new Person("Adit", "JL.Banjaran", "089675423145", "adit4@gmail.com");
        Student student = new Student("Dani", "JL. Baleendah", "08976542314", "dan881@gmail.com", Student.JUNIOR);
        Employee employee = new Employee("Juanda", "JL. Toha", "0881452675413", "Juan23@gmail.com.com", "Ruangan 2", 5000000, dateHired);
        Faculty faculty = new Faculty("Siti", "JL. Anfun", "087254132563", "siti@gmail.com", "ruangan 04", 6000000, dateHired, "09.00-07.00", "Professor");
        Staff staff = new Staff("Nuraini", "JL. Hijar", "085624315728", "Nur001@gmail.com", "ruangan 57", 4000000, dateHired, "Manager");

        System.out.println(person);
        System.out.println(student);
        System.out.println(employee);
        System.out.println(faculty);
        System.out.println(staff);
    }
}
