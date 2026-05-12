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
	
	
	
	
	public static CD addCD(int id,String name,String singer, int songs, double price, CD[] list) {
		for(CD c:list) {
			
		}
		return new CD(id,name,singer,songs,price);
	}
	
	

	
}

