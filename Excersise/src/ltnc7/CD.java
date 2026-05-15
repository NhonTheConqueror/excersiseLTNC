package ltnc7;

public class CD {
	protected int id;
	protected String title, singer;
	protected int songs_num;
	protected double price;
	
	public CD(int id, String title, String singer, int songs_num, double price) {
		super();
		this.id = id;
		this.title = title;
		this.singer = singer;
		this.songs_num = songs_num;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return String.format("[ " + "Id: %s ," + "Title: %s ," 
	+ "Singer: %s ," + "Songs: %s ," + "Price: %s ]",
	this.id, this.title, this.singer, this.songs_num, this.price);
	}
	
}
