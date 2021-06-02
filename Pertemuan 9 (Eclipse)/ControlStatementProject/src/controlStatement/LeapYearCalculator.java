package controlStatement;

import java.util.Scanner;

public class LeapYearCalculator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int bulan, tahun, jmlHari;
		
		System.out.print("Masukkan bulan = ");
		bulan = input.nextInt();
		
		System.out.print("Masukkan tahun = ");
		tahun = input.nextInt();
		
		String ganjilGenap = bulan % 2 == 1 ? "Ganjil" : "Genap";
		Boolean tahunKabisat = tahun % 4 == 0 || tahun % 400 == 0;
		
		switch (bulan) {
		case 1:
			jmlHari = 31;
			break;
		case 2:
			if (tahunKabisat) {
				jmlHari = 29;
			} else {
				jmlHari = 28;
			}
			break;
		case 3:
			jmlHari = 31;
			break;
		case 4:
			jmlHari = 30;
			break;
		case 5:
			jmlHari = 31;
			break;
		case 6:
			jmlHari = 30;
			break;
		case 7:
			jmlHari = 31;
			break;
		case 8:
			jmlHari = 31;
			break;
		case 9:
			jmlHari = 30;
			break;
		case 10:
			jmlHari = 31;
			break;
		case 11:
			jmlHari = 30;
			break;
		case 12:
			jmlHari = 31;
			break;
		default:
			jmlHari = -1;
			break;
		}
		
		input.close();

		if (jmlHari == -1) {
			System.out.println("Invalid Input");
		} else {
			System.out.println("Bulan " + bulan + " adalah bulan " + ganjilGenap);
			System.out.println("Jumlah hari adalah " + jmlHari);
			System.out.println("Tahun " + tahun + (tahunKabisat ? " adalah" : " bukan") + " tahun kabisat");
		}
	}
}
