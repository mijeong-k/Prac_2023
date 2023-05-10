package threeTypes;

import java.util.Scanner;

public class Threeifs {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char cha = sc.next().charAt(0);
		int num = sc.nextInt();
		sc.close();

		String judge1 = (cha == 'M') ? "MAN" : "WOMAN";
		String judge2 = (num >= 18) ? "adult" : "child";

		if (judge1.equals("MAN")) {
			if (judge2.equals("adult")) {
				System.out.println(judge1);
			} else {
				System.out.println("BOY");
			}
		} else {
			if (judge2.equals("adult")) {
				System.out.println(judge1);
			} else {
				System.out.println("GIRL");
			}
		}

	}

}
