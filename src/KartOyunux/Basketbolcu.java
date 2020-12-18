package KartOyunux;


public class Basketbolcu extends Sporcu {
		
	private int ikilik;
	private int ucluk;
	private int serbest_atis;
	public Basketbolcu(String sporcu_Isim, String sporcu_Takim) {
		super(sporcu_Isim, sporcu_Takim);
		// TODO Auto-generated constructor stub
	}
	public Basketbolcu(String sporcu_Isim, String sporcu_Takim, int ikilik, int ucluk, int serbest_atis) {
		super(sporcu_Isim, sporcu_Takim);
		this.ikilik = ikilik;
		this.ucluk = ucluk;
		this.serbest_atis = serbest_atis;
	}
	public int getIkilik() {
		return ikilik;
	}
	public void setIkilik(int ikilik) {
		this.ikilik = ikilik;
	}
	public int getUcluk() {
		return ucluk;
	}
	public void setUcluk(int ucluk) {
		this.ucluk = ucluk;
	}
	public int getSerbest_atis() {
		return serbest_atis;
	}
	public void setSerbest_atis(int serbest_atis) {
		this.serbest_atis = serbest_atis;
	}
	
	
	
	
	
	
	
	
	
}
