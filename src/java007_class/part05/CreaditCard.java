package java007_class.part05;

public class CreaditCard {
	String cardName;
	String cardNum;
	int pay;
	
	public CreaditCard() {
		
	}

	public CreaditCard(String cardName, String cardNum, int pay) {
		super();
		this.cardName = cardName;
		this.cardNum = cardNum;
		this.pay = pay;
	}
	
	public String toString() {
		return String.format("%s %S %d", cardName, cardNum, pay);
	}
	

}
