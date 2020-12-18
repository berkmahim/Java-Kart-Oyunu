package KartOyunux;


public class Oyuncu {
	
	private int oyuncuID;
	private String oyuncuAdi;
	private int skor;
	public Oyuncu(int oyuncuID, String oyuncuAdi, int skor) {
		super();
		this.oyuncuID = oyuncuID;
		this.oyuncuAdi = oyuncuAdi;
		this.skor = skor;
	}
	
	
	public Oyuncu() {
		super();
	}



	public int getOyuncuID() {
		return oyuncuID;
	}
	public void setOyuncuID(int oyuncuID) {
		this.oyuncuID = oyuncuID;
	}
	public String getOyuncuAdi() {
		return oyuncuAdi;
	}
	public void setOyuncuAdi(String oyuncuAdi) {
		this.oyuncuAdi = oyuncuAdi;
	}
	public int getSkor() {
		return skor;
	}
	public void setSkor(int skor) {
		this.skor = skor;
	}
	
	//int kartSec();
	
	
}
