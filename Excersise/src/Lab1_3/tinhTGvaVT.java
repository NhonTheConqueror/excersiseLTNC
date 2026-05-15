package Lab1_3;

import java.util.Scanner;

public class tinhTGvaVT {
	public static void main(String[] args) {
		final int g = 10;
		Scanner scanner = new Scanner(System.in);
		double height = scanner.nextDouble();
		System.out.print("Thoi gian: ");
		System.out.println(Math.sqrt(height*2/g));
		System.out.print("Van toc: ");
		System.out.println(g*Math.sqrt(height*2/g));
	}
}
