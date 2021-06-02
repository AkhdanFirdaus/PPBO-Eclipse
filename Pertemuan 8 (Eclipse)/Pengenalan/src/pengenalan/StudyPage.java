package pengenalan;

import java.util.Scanner;

public class StudyPage {
	public static void main(String args[]) {
		Scanner scanterm = new Scanner(System.in);
		String termvar;
		System.out.print("Enter a study term: ");
		termvar = scanterm.nextLine();
		
		Scanner scandef = new Scanner(System.in);
		String termdef;
		System.out.print("Enter a study term: ");
		termdef = scandef.nextLine();
		
		System.out.print(termvar + ": " + termdef);
		scanterm.close();
		scandef.close();
	}
}
