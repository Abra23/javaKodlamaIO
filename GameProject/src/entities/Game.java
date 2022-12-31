package entities;

public class Game {
	private String gameName;
	private int gamePrice;
	private int gameStock;
	private int gameDiscount;
	
	
	public Game() {
		
	}


	public Game(String gameName, int gamePrice, int gameStock, int gameDiscount) {
		super();
		this.gameName = gameName;
		this.gamePrice = gamePrice;
		this.gameStock = gameStock;
		this.gameDiscount = gameDiscount;

	}


	public String getGameName() {
		return gameName;
	}


	public void setGameName(String gameName) {
		this.gameName = gameName;
	}


	public int getGamePrice() {
		return gamePrice;
	}


	public void setGamePrice(int gamePrice) {
		this.gamePrice = gamePrice;
	}


	public int getGameStock() {
		return gameStock;
	}


	public void setGameStock(int gameStock) {
		this.gameStock = gameStock;
	}


	public int getGameDiscount() {
		return gameDiscount;
	}


	public void setGameDiscount(int gameDiscount) {
		this.gameDiscount = gameDiscount;
	}


	public int getGamePriceAfterDiscount() {
		return gamePrice - (gamePrice *gameDiscount/100);
	}



	
	
	

}
