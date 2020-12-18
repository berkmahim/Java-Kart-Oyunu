package KartOyunux;


public  class Sporcu {
	private	String sporcu_Isim;
	private	String sporcu_Takim;
	public Sporcu(String sporcu_Isim, String sporcu_Takim) {
		super();
		this.sporcu_Isim = sporcu_Isim;
		this.sporcu_Takim = sporcu_Takim;
	}
	public String getSporcu_Isim() {
		return sporcu_Isim;
	}
	public void setSporcu_Isim(String sporcu_Isim) {
		this.sporcu_Isim = sporcu_Isim;
	}
	public String getSporcu_Takim() {
		return sporcu_Takim;
	}
	public void setSporcu_Takim(String sporcu_Takim) {
		this.sporcu_Takim = sporcu_Takim;
	}
	
		
}