import java.util.Scanner;
public class Contoh_Method {
public static Scanner input = new Scanner(System.in);

public static void persegi()
{
double sisi,luas;
System.out.println("===Menghitung Luas Persegi===");
System.out.print("Masukkan sisi = ");
sisi = input.nextDouble();
luas = sisi * sisi;
System.out.println("luas persegi = "+luas);
}

public static void persegipanjang()
{
double panjang,lebar,luas;
System.out.println("===Menghitung Luas Persegi Panjang===");
System.out.print("Masukkan panjang = ");
panjang = input.nextDouble();
System.out.print("Masukkan lebar = ");
lebar = input.nextDouble();
luas = panjang * lebar;
System.out.println("luas persegi panjang = "+luas);
}

public static void segitiga()
{
double alas,tinggi,luas;
System.out.println("===Menghitung Luas Segitiga===");
System.out.print("Masukkan alas = ");
alas = input.nextDouble();
System.out.print("Masukkan tinggi = ");
tinggi = input.nextDouble();
luas = (alas * tinggi)/2;
System.out.println("luas persegi segitiga = "+luas);
}

public static void lingkaran()
{
double r,luas;
System.out.println("===Menghitung Luas Lingkaran===");
System.out.print("Masukkan Jari - Jari = ");
r = input.nextDouble();
System.out.println("Luas lingkaran = "+3.14 * r * r);
}

public static void bujursangkar()
{
	Scanner input = new Scanner(System.in);
    int sisi, luas;
	System.out.println("===Menghitung Luas Bujursangkar===");
	System.out.print("Masukan Sisi Bujursangkar = ");
	sisi = input.nextInt();
	             luas = sisi*sisi;
	System.out.println("Luas Bujur Sangkar = " + luas);
}

public static void balok()
{
    int panjang, lebar, tinggi, hasil;
	System.out.println("===Menghitung Luas Balok===");
	System.out.print("Masukan Panjang Balok = ");
	 panjang = input.nextInt();
	System.out.print("Masukan Lebar Balok = ");
	 lebar = input.nextInt();
	System.out.print("Masukan Tinggi Balok = ");
     tinggi = input.nextInt();
     hasil =  2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
	System.out.println("Luas Balok tersebut adalah = " + hasil);

}

public static void main(String[] args) {
int pilih;
do
{
System.out.println("\nMENU");
System.out.println("1.Luas Persegi");
System.out.println("2.Luas Persegi Panjang");
System.out.println("3.Luas Segitiga");
System.out.println("Tambahan Tugas");
System.out.println("4.Luas Lingkaran");
System.out.println("5.Luas Bujursangkar");
System.out.println("6.Luas Balok");

System.out.println("0.Keluar");
System.out.println("Masukkan Pilihan Anda = ");
pilih =input.nextInt();
switch(pilih)
{
case 1 : persegi();
break;
case 2 : persegipanjang();
break;
case 3 : segitiga();
break;
case 4 : lingkaran();
break;
case 5 : bujursangkar();
break;
case 6 : balok();
break;
}
}
while ((pilih!=0)||(pilih>6));
System.out.println("Selamat Belajar,tetep semangat!!!");
}
}