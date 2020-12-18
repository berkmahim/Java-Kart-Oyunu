package KartOyunux;

import java.awt.Dimension;

import javax.swing.JFrame;

public class Pencere extends JFrame{

	Pencere(OyunAlani oyunAlani){
		oyunAlani.setPreferredSize(new Dimension(1280, 720)); // Panel boyutunu ayarladýk
		this.add(oyunAlani); //Paneli pencereye ekledik
		this.pack(); // Boyutu en fazla olan komponent panel, pencereyi panele gore boyutlandiriyoruz.
		this.setResizable(false); // Boyutlandirmayi kapattik
		this.setVisible(true); // Pencereyi görünür hale getirdik
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Varsayýlan kapatma iþlemi
		this.setLocationRelativeTo(null); //Pencereyi ekranýn ortasýna aldýk
		
	}
	
	
}
