package sinifGecmeDurumuHesapla;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int mat,fizik,turkce,kimya,muzik,dersSay=0;
		double avarage=0;
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Matematik notunuz: ");
		mat=scan.nextInt();
		if(mat>=0&&mat<=100) {
			avarage+=mat;
			dersSay++;
		}
		
		System.out.print("T�rk�e notunuz: ");
		turkce=scan.nextInt();
		if(turkce>=0&&turkce<=100) {
			avarage+=turkce;
			dersSay++;
		}
		
		System.out.print("Fizik notunuz: ");
		fizik=scan.nextInt();
		if(fizik>=0&&fizik<=100) {
			avarage+=fizik;
			dersSay++;
		}
		
		System.out.print("Kimya notunuz: ");
		kimya=scan.nextInt();
		if(kimya>=0&&kimya<=100) {
			avarage+=kimya;
			dersSay++;
		}
		
		System.out.print("M�zik notunuz: ");
		muzik=scan.nextInt();
		if(muzik>=0&&muzik<=100) {
			avarage+=muzik;
			dersSay++;
		}
		avarage=avarage/dersSay;
		if(avarage<=55) {
			System.out.println("S�n�fta kald�n�z, senete tekrar g�r��mek �zere!");
		}else {
			System.out.println("Tebrikler, s�n�f� ge�tiniz!");
		}
		
		System.out.println("Ortalaman�z: "+avarage);
	}

}
