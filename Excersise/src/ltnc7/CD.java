package ltnc7;

import java.util.ArrayList;
import java.util.Scanner;

public class CD {
	private int id;
	private String name, singer;
	private int songs;
	private double price;
	
	/**
	 * @param id
	 * @param name
	 * @param singer
	 * @param songs
	 * @param price
	 */
	public CD(int id, String name, String singer, int songs, double price) {
		super();
		this.id = id;
		this.name = name;
		this.singer = singer;
		this.songs = songs;
		this.price = price;
	}
	
	public CD() {
		// TODO Auto-generated constructor stub
	}

	public static CD addCD() {
		Scanner scanner = new Scanner(System.in);
		int id = scanner.nextInt();
		scanner.nextLine();
		String name = scanner.nextLine();
		scanner.nextLine();
		String singers = scanner.nextLine();
		scanner.nextLine();
		int songs = scanner.nextInt();
		scanner.nextLine();
		double price = scanner.nextDouble();
		return new CD(id,name,singers,songs,price);
	}
	
	

	
}

