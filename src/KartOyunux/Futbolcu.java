package KartOyunux;


public class Futbolcu extends Sporcu{
		
	private int penalti;
	private int karsi_karsiya;
	private int serbest_vurus;
	boolean kartKullanildiMi=false;
	
	
	
	




	public Futbolcu(String sporcu_Isim, String sporcu_Takim) {
		super(sporcu_Isim, sporcu_Takim);
		// TODO Auto-generated constructor stub
	}




	public Futbolcu(String sporcu_Isim, String sporcu_Takim, int penalti, int karsi_karsiya, int serbest_vurus) {
		super(sporcu_Isim, sporcu_Takim);
		this.penalti = penalti;
		this.karsi_karsiya = karsi_karsiya;
		this.serbest_vurus = serbest_vurus;
	}




	public int getPenalti() {
		return penalti;
	}




	public void setPenalti(int penalti) {
		this.penalti = penalti;
	}




	public int getKarsi_karsiya() {
		return karsi_karsiya;
	}




	public void setKarsi_karsiya(int karsi_karsiya) {
		this.karsi_karsiya = karsi_karsiya;
	}




	public int getSerbest_vurus() {
		return serbest_vurus;
	}




	public void setSerbest_vurus(int serbest_vurus) {
		this.serbest_vurus = serbest_vurus;
	}

	public void sporcuPuaniGoster(Futbolcu futbolcu) {
		
		System.out.println(futbolcu.penalti);	
		System.out.println(futbolcu.karsi_karsiya);
		System.out.println(futbolcu.serbest_vurus);


	}


	
	
	


}
