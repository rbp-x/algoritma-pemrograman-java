import java.util.Scanner;
public class Array9{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int data_lulus[] [] = new int[2][3];
		int tahun, jurusan;
		data_lulus [0] [0] = 110;
		data_lulus [0] [1] = 125;
		data_lulus [0] [2] = 135;
		data_lulus [1] [0] = 56;
		data_lulus [1] [1] = 75;
		data_lulus [1] [2] = 80;
		System.out.print("Jurusan (0 = TI, 1= SI) = ");
jurusan = input.nextInt();
		if ((jurusan == 0)|| (jurusan == 1))
		{
		System.out.print("Tahun (2006 - 2008) : ");
			tahun=input.nextInt();
			tahun -=2006;
		}
		else tahun = -1;
		if ((tahun >=0) && (tahun <=2))
		{
			System.out.println("Jumlah Lulusan = "+
			data_lulus[jurusan][tahun]);
		}
		else System.out.println("Salah inputan");	
	}
}

