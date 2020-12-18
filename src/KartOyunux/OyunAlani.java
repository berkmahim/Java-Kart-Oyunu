package KartOyunux;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

import javax.swing.JPanel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JTextField;

import KartOyunux.KartB;
import KartOyunux.KartF;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;






public class OyunAlani extends JFrame {

	private JPanel contentPane;

	
	
	
	
	
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OyunAlani frame = new OyunAlani();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	static ArrayList<Futbolcu> ortadakiKartlarF;
	static ArrayList<Basketbolcu> ortadakiKartlarB;
	static ArrayList<Futbolcu> bilgisayarKartlarF;
	static ArrayList<Basketbolcu> bilgisayarKartlarB;
	static ArrayList<Futbolcu> insanKartlarF;
	static ArrayList<Basketbolcu> insanKartlarB;
	static ArrayList<KartF> KartlarFpc;
	static ArrayList<KartB> KartlarBpc;
	static ArrayList<KartF> KartlarF;
	static ArrayList<KartB> KartlarB;
	static ArrayList<KartF> KullanilanKartlarF;
	static ArrayList<KartB> KullanilanKartlarB;
	Random random;
	Boolean oynananElFutbolCuMu = false;
	int dagitilacakKartSayisi;
//	private KartF bilbutton1;
	double oyuncuskor=0;
	double pcskor=0;
	
	
	
	
	
	
	public OyunAlani() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
	
		getContentPane().setLayout(null);
		//Ýlk açýlýþta çalýþacak fonksiyonum.
		ortadakiKartlarB = new ArrayList<Basketbolcu>();
		ortadakiKartlarF = new ArrayList<Futbolcu>();
		bilgisayarKartlarF = new ArrayList<Futbolcu>();
		bilgisayarKartlarB = new ArrayList<Basketbolcu>();
		insanKartlarF = new ArrayList<Futbolcu>();
		insanKartlarB = new ArrayList<Basketbolcu>();
		KartlarF = new ArrayList<KartF>();
		KartlarB = new ArrayList<KartB>();
		KartlarBpc = new ArrayList<KartB>();
		KartlarFpc = new ArrayList<KartF>();
		random = new Random(); 
		dagitilacakKartSayisi = 4;
		KullanilanKartlarF=new ArrayList<KartF>();
		KullanilanKartlarB=new ArrayList<KartB>();
		
		kartlariOrtadaTopla();

		
		//oynanacakEliBelirle();
		elDagit();
		
		boolean x=true;
		contentPane.setLayout(null);
		
		
		
		
		
		
		
		KartF insanbutton1 = new KartF(insanKartlarF.get(0).getPenalti(),insanKartlarF.get(0).getKarsi_karsiya(),insanKartlarF.get(0).getSerbest_vurus());
		
		insanbutton1.setText(insanKartlarF.get(0).getSporcu_Isim());
		insanbutton1.setBounds(0, 431, 150, 250);
		contentPane.add(insanbutton1);
		getContentPane().add(insanbutton1);
		KartlarF.add(insanbutton1);
		Image insanbutton1img=new ImageIcon(this.getClass().getResource("/"+insanKartlarF.get(0).getSporcu_Isim() + ".png")).getImage();
		insanbutton1.setIcon(new ImageIcon(insanbutton1img));
		/*Image insanbutton1img=new ImageIcon(this.getClass().getResource("/deneme.png")).getImage();
		insanbutton1.setIcon(new ImageIcon(insanbutton1img));*/
		
		
		
		
		
		KartF insanbutton2 = new KartF(insanKartlarF.get(1).getPenalti(),insanKartlarF.get(1).getKarsi_karsiya(),insanKartlarF.get(1).getSerbest_vurus());
		insanbutton2.setText(insanKartlarF.get(1).getSporcu_Isim());
		insanbutton2.setBounds(160, 431, 150, 250);
		contentPane.add(insanbutton2);
		getContentPane().add(insanbutton2);
		KartlarF.add(insanbutton2);
		Image insanbutton2img=new ImageIcon(this.getClass().getResource("/"+insanKartlarF.get(1).getSporcu_Isim() + ".png")).getImage();
		insanbutton2.setIcon(new ImageIcon(insanbutton2img));

		
		KartF insanbutton3 = new KartF(insanKartlarF.get(2).getPenalti(),insanKartlarF.get(2).getKarsi_karsiya(),insanKartlarF.get(2).getSerbest_vurus());
		insanbutton3.setText(insanKartlarF.get(2).getSporcu_Isim());
        insanbutton3.setBounds(314, 431, 150, 250);
		getContentPane().add(insanbutton3);
		KartlarF.add(insanbutton3);
		Image insanbutton3img=new ImageIcon(this.getClass().getResource("/"+insanKartlarF.get(2).getSporcu_Isim() + ".png")).getImage();
		insanbutton3.setIcon(new ImageIcon(insanbutton3img));
		
		KartF insanbutton4 = new KartF(insanKartlarF.get(3).getPenalti(),insanKartlarF.get(3).getKarsi_karsiya(),insanKartlarF.get(3).getSerbest_vurus());
		insanbutton4.setText(insanKartlarF.get(3).getSporcu_Isim());
		insanbutton4.setBounds(474, 431, 150, 250);
		getContentPane().add(insanbutton4);
		KartlarF.add(insanbutton4);
		Image insanbutton4img=new ImageIcon(this.getClass().getResource("/"+insanKartlarF.get(3).getSporcu_Isim() + ".png")).getImage();
		insanbutton4.setIcon(new ImageIcon(insanbutton4img));
		
		
		
		
		KartB insanbutton5 = new KartB(insanKartlarB.get(0).getIkilik(),insanKartlarB.get(0).getUcluk(),insanKartlarB.get(0).getSerbest_atis());
		insanbutton5.setText(insanKartlarB.get(0).getSporcu_Isim());
		insanbutton5.setBounds(634, 431, 150, 250);
	    getContentPane().add(insanbutton5);
	    KartlarB.add(insanbutton5);
	    Image insanbutton5img=new ImageIcon(this.getClass().getResource("/"+insanKartlarB.get(0).getSporcu_Isim() + ".png")).getImage();
		insanbutton5.setIcon(new ImageIcon(insanbutton5img));
	
	    
	    
	    
	    KartB insanbutton6 = new KartB(insanKartlarB.get(1).getIkilik(),insanKartlarB.get(1).getUcluk(),insanKartlarB.get(1).getSerbest_atis());
		insanbutton6.setText(insanKartlarB.get(1).getSporcu_Isim());
		insanbutton6.setBounds(794, 431, 150, 250);
		getContentPane().add(insanbutton6);
	    KartlarB.add(insanbutton6);
	    Image insanbutton6img=new ImageIcon(this.getClass().getResource("/"+insanKartlarB.get(1).getSporcu_Isim() + ".png")).getImage();
		insanbutton6.setIcon(new ImageIcon(insanbutton6img));
		
		
		KartB insanbutton7 = new KartB(insanKartlarB.get(2).getIkilik(),insanKartlarB.get(2).getUcluk(),insanKartlarB.get(2).getSerbest_atis());
		insanbutton7.setText(insanKartlarB.get(2).getSporcu_Isim());
		insanbutton7.setBounds(954, 431, 150, 250);
		getContentPane().add(insanbutton7);
	    KartlarB.add(insanbutton7);
	    Image insanbutton7img=new ImageIcon(this.getClass().getResource("/"+insanKartlarB.get(2).getSporcu_Isim() + ".png")).getImage();
		insanbutton7.setIcon(new ImageIcon(insanbutton7img));
		
		
		KartB insanbutton8 = new KartB(insanKartlarB.get(3).getIkilik(),insanKartlarB.get(3).getUcluk(),insanKartlarB.get(3).getSerbest_atis());
		insanbutton8.setText(insanKartlarB.get(3).getSporcu_Isim());
		insanbutton8.setBounds(1114, 431, 150, 250);		
		getContentPane().add(insanbutton8);
	    KartlarB.add(insanbutton8);
	    Image insanbutton8img=new ImageIcon(this.getClass().getResource("/"+insanKartlarB.get(3).getSporcu_Isim() + ".png")).getImage();
		insanbutton8.setIcon(new ImageIcon(insanbutton8img));
		
		
		KartF bilbutton1 = new KartF(bilgisayarKartlarF.get(0).getPenalti(), bilgisayarKartlarF.get(0).getKarsi_karsiya(), bilgisayarKartlarF.get(0).getSerbest_vurus());
		bilbutton1.setBounds(0, 11, 150, 108);
	    getContentPane().add(bilbutton1);
		KartlarFpc.add(bilbutton1);
		Image bilbutton1img=new ImageIcon(this.getClass().getResource("/kapali.png")).getImage();
		bilbutton1.setIcon(new ImageIcon(bilbutton1img));
		
		
		
		KartF bilbutton2 = new KartF(bilgisayarKartlarF.get(1).getPenalti(), bilgisayarKartlarF.get(1).getKarsi_karsiya(), bilgisayarKartlarF.get(1).getSerbest_vurus());
		//JButton bilbutton2 = new JButton(bilgisayarKartlarF.get(1).getSporcu_Isim());
		bilbutton2.setBounds(157, 11, 150, 108);
		getContentPane().add(bilbutton2);
		KartlarFpc.add(bilbutton2);
		Image bilbutton2img=new ImageIcon(this.getClass().getResource("/kapali.png")).getImage();
		bilbutton2.setIcon(new ImageIcon(bilbutton2img));
		
		
		KartF bilbutton3 = new KartF(bilgisayarKartlarF.get(2).getPenalti(), bilgisayarKartlarF.get(2).getKarsi_karsiya(), bilgisayarKartlarF.get(2).getSerbest_vurus());
		//JButton bilbutton3 = new JButton(bilgisayarKartlarF.get(2).getSporcu_Isim());
		bilbutton3.setBounds(314, 11, 150, 108);
		getContentPane().add(bilbutton3);
		KartlarFpc.add(bilbutton3);
		Image bilbutton3img=new ImageIcon(this.getClass().getResource("/kapali.png")).getImage();
		bilbutton3.setIcon(new ImageIcon(bilbutton3img));
		
		
		KartF bilbutton4 = new KartF(bilgisayarKartlarF.get(3).getPenalti(), bilgisayarKartlarF.get(3).getKarsi_karsiya(), bilgisayarKartlarF.get(3).getSerbest_vurus());
		//JButton bilbutton4 = new JButton(bilgisayarKartlarF.get(3).getSporcu_Isim());
		bilbutton4.setBounds(474, 11, 150, 108);
		getContentPane().add(bilbutton4);
		KartlarFpc.add(bilbutton4);
		Image bilbutton4img=new ImageIcon(this.getClass().getResource("/kapali.png")).getImage();
		bilbutton4.setIcon(new ImageIcon(bilbutton4img));
		
		
		KartB bilbutton5 = new KartB(bilgisayarKartlarB.get(0).getIkilik(), bilgisayarKartlarB.get(0).getUcluk(), bilgisayarKartlarB.get(0).getSerbest_atis());
		//JButton bilbutton5 = new JButton(bilgisayarKartlarB.get(0).getSporcu_Isim());
		bilbutton5.setBounds(634, 11, 150, 108);
		getContentPane().add(bilbutton5);
		KartlarBpc.add(bilbutton5);
		Image bilbutton5img=new ImageIcon(this.getClass().getResource("/kapali.png")).getImage();
		bilbutton5.setIcon(new ImageIcon(bilbutton5img));
		
		
		
		KartB bilbutton6 = new KartB(bilgisayarKartlarB.get(1).getIkilik(), bilgisayarKartlarB.get(1).getUcluk(), bilgisayarKartlarB.get(1).getSerbest_atis());		//JButton bilbutton6 = new JButton(bilgisayarKartlarB.get(1).getSporcu_Isim());
		bilbutton6.setBounds(794, 11, 150, 108);
		getContentPane().add(bilbutton6);
		KartlarBpc.add(bilbutton6);
		Image bilbutton6img=new ImageIcon(this.getClass().getResource("/kapali.png")).getImage();
		bilbutton6.setIcon(new ImageIcon(bilbutton6img));

		KartB bilbutton7 = new KartB(bilgisayarKartlarB.get(2).getIkilik(), bilgisayarKartlarB.get(2).getUcluk(), bilgisayarKartlarB.get(2).getSerbest_atis());		//JButton bilbutton7 = new JButton(bilgisayarKartlarB.get(2).getSporcu_Isim());
		bilbutton7.setBounds(954, 11, 150, 108);
		getContentPane().add(bilbutton7);
		KartlarBpc.add(bilbutton7);
		Image bilbutton7img=new ImageIcon(this.getClass().getResource("/kapali.png")).getImage();
		bilbutton7.setIcon(new ImageIcon(bilbutton7img));
		
		
		

		KartB bilbutton8 = new KartB(bilgisayarKartlarB.get(3).getIkilik(), bilgisayarKartlarB.get(2).getUcluk(), bilgisayarKartlarB.get(3).getSerbest_atis());		//bilbutton8 = new JButton(bilgisayarKartlarB.get(3).getSporcu_Isim());
		bilbutton8.setBounds(1114, 11, 150, 108);	
		getContentPane().add(bilbutton8);
		KartlarBpc.add(bilbutton8);
		Image bilbutton8img=new ImageIcon(this.getClass().getResource("/kapali.png")).getImage();
		bilbutton8.setIcon(new ImageIcon(bilbutton8img));
		
	
		
		
		
		
		JLabel skor = new JLabel();
		skor.setBounds(67, 327, 46, 14);
		contentPane.add(skor);
		skor.setForeground(Color.RED);
		
		
		JLabel skorpc = new JLabel("");
		skorpc.setBounds(1010, 327, 46, 14);
		contentPane.add(skorpc);
		skorpc.setForeground(Color.RED);
		
		
		JButton oynabutton = new JButton("oyna");
		oynabutton.setIcon(new ImageIcon("C:\\Users\\berkm\\OneDrive\\Masa\u00FCst\u00FC\\1x\\1x\\devam.png"));
		oynabutton.setBounds(589, 300, 139, 59);
		contentPane.add(oynabutton);
		
		JLabel karsilastirilanpozisyon = new JLabel();
		karsilastirilanpozisyon.setBounds(583, 252, 165, 14);
		contentPane.add(karsilastirilanpozisyon);
		
		
		//	karsilastirilanpozisyon.setForeground(Color.RED);
		
		
		
		
		
		
		
		System.out.println("/////////////////**********//////////");

		System.out.println("denemeeeee");
		System.out.println(insanKartlarF.get(0).getSporcu_Isim());
		System.out.println(insanbutton1.penalti);
		
		JLabel kazanan = new JLabel("");
		kazanan.setBounds(608, 130, 176, 49);
		contentPane.add(kazanan);
		kazanan.setForeground(Color.RED);
		
		JButton sonucgoster = new JButton("sonuclari goster");
		
		sonucgoster.setBounds(589, 370, 139, 29);
		contentPane.add(sonucgoster);
		sonucgoster.setForeground(Color.RED);
		
		kazanan.setVisible(false);
		Image sonucimg=new ImageIcon(this.getClass().getResource("/sonuc.png")).getImage();
		sonucgoster.setIcon(new ImageIcon(sonucimg));
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 1264, 681);
		contentPane.add(lblNewLabel);
		
		System.out.println("/////////////////**********//////////");
		
		
		
		
	Integer[] arr = new Integer[4];
	    for (int i = 0; i < 4; i++) {
	        arr[i] = i;
	    }
	    Collections.shuffle(Arrays.asList(arr));
	    for (int i = 0; i < 4; i++) {
	       System.out.println(arr[i]);
		
	    }
	    Integer[] arr1 = new Integer[4];
	    for (int i = 0; i < 4; i++) {
	        arr1[i] = i;
	    }
	    Collections.shuffle(Arrays.asList(arr1));
	    
	    
	    System.out.println("*******************");
	    
	    
	    int i;
	    Integer[] array = new Integer[3];
	    for ( i = 0; i < 3; i++) {
	        array[i] = i;
	    }
	    Collections.shuffle(Arrays.asList(array));
	    for ( i = 0; i < 3; i++) {
	       System.out.println(array[i]);
		
	    }
		
		int bilgisayarskor=0;
		int kullaniciskor=0;
		
		 ArrayList<Integer> secim = new ArrayList<Integer>();
		   secim.add(1);
		   secim.add(0);
Collections.shuffle(secim);




///button1
insanbutton1.addMouseListener(new MouseAdapter() {
	@Override
	public void mouseClicked(MouseEvent arg0) {
		int pozisyon= ((int) (Math.random() * 3));
		KartlarFpc.get(arr1[0]).setBounds(794, 170, 150, 250);
		insanbutton1.setBounds(314, 170, 150, 250);
		KartlarFpc.get(arr1[0]).setText(bilgisayarKartlarF.get(arr1[0]).getSporcu_Isim());
		//savasbuton.setVisible(true);
		KullanilanKartlarF.add(insanbutton1);
		KullanilanKartlarF.add(KartlarFpc.get(arr1[0]));
		Image bilbutton11img=new ImageIcon(this.getClass().getResource("/"+bilgisayarKartlarF.get(arr1[0]).getSporcu_Isim() + ".png")).getImage();
		KartlarFpc.get(arr1[0]).setIcon(new ImageIcon(bilbutton11img));
		
		/*	pcbilgi.setText("penalti:" + KartlarFpc.get(arr1[0]).penalti + "\n" + "k. karsi karsiya:" + KartlarFpc.get(arr1[0]).karsi_karsiya + "\n" + "serbest vurus:"  + KartlarFpc.get(arr1[0]).serbest_vurus);
		bilgi1.setBounds(281, 362, 130, 79);*/
		for(int j=0;j<KartlarB.size();j++) {
			KartlarB.get(j).setEnabled(false);
		}


		
		

		if(pozisyon==0) {
			
			Image pozisyonimg=new ImageIcon(this.getClass().getResource("/penalti.png")).getImage();
			karsilastirilanpozisyon.setIcon(new ImageIcon(pozisyonimg));
			
			if (insanbutton1.penalti>KartlarFpc.get(arr1[0]).penalti) {
				
				oyuncuskor+=10;
				skor.setText(Double.toString(oyuncuskor));
				
			}
			else if(insanbutton1.penalti<KartlarFpc.get(arr1[0]).penalti) {
				pcskor+=10;
				skorpc.setText(Double.toString(pcskor));

				
			}
			
			
		}
	
		
		else if(pozisyon==1) {
			
			Image pozisyonimg=new ImageIcon(this.getClass().getResource("/karsýkarsýya.png")).getImage();
			karsilastirilanpozisyon.setIcon(new ImageIcon(pozisyonimg));
			if (insanbutton1.karsi_karsiya>KartlarFpc.get(arr1[0]).karsi_karsiya) {
				
				oyuncuskor+=10;
				skor.setText(Double.toString(oyuncuskor));
				
			}
			else if(insanbutton1.karsi_karsiya<KartlarFpc.get(arr1[0]).karsi_karsiya) {
				pcskor+=10;
				skorpc.setText(Double.toString(pcskor));	
			}
	      
			
		}
		
		else {
			
			Image pozisyonimg=new ImageIcon(this.getClass().getResource("/serbestvurus.png")).getImage();
			karsilastirilanpozisyon.setIcon(new ImageIcon(pozisyonimg));
			
			if (insanbutton1.serbest_vurus>KartlarFpc.get(arr1[0]).serbest_vurus) {
				
				oyuncuskor+=10;
				skor.setText(Double.toString(oyuncuskor));
				
			}
			else if(insanbutton1.serbest_vurus<KartlarFpc.get(arr1[0]).serbest_vurus) {
				pcskor+=10;
				skorpc.setText(Double.toString(pcskor));

				
			}
			
			
			
		}
		
		oynabutton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				for(int j=0;j<KullanilanKartlarB.size();j++) {
					KullanilanKartlarB.get(j).setVisible(false);
				}
				for(int j=0;j<KullanilanKartlarF.size();j++) {
					KullanilanKartlarF.get(j).setVisible(false);
				}
				for(int j=0;j<KartlarB.size();j++) {
					KartlarB.get(j).setEnabled(true);
				}
				
				for(int j=0;j<KartlarF.size();j++) {
					KartlarF.get(j).setEnabled(false);
				}
				karsilastirilanpozisyon.setText("");
			
			
			}
		});	
	
	
	
	}
	
	
	
});




////button2	
insanbutton2.addMouseListener(new MouseAdapter() {
	@Override
	public void mouseClicked(MouseEvent arg0) {
		int pozisyon= ((int) (Math.random() * 3));
		KartlarFpc.get(arr1[1]).setBounds(794, 170, 150, 250);
		insanbutton2.setBounds(314, 170, 150, 250);
		KartlarFpc.get(arr1[1]).setText(bilgisayarKartlarF.get(arr1[1]).getSporcu_Isim());
		//savasbuton.setVisible(true);
		KullanilanKartlarF.add(insanbutton2);
		KullanilanKartlarF.add(KartlarFpc.get(arr1[1]));
		
		
		Image bilbutton12img=new ImageIcon(this.getClass().getResource("/"+bilgisayarKartlarF.get(arr1[1]).getSporcu_Isim() + ".png")).getImage();
		KartlarFpc.get(arr1[1]).setIcon(new ImageIcon(bilbutton12img));
		
		
		
		for(int j=0;j<KartlarB.size();j++) {
			KartlarB.get(j).setEnabled(false);
		}

		
		
		
		if(pozisyon==0) {
			
			Image pozisyonimg=new ImageIcon(this.getClass().getResource("/penalti.png")).getImage();
			karsilastirilanpozisyon.setIcon(new ImageIcon(pozisyonimg));
			
			if (insanbutton2.penalti>KartlarFpc.get(arr1[1]).penalti) {
				
				oyuncuskor+=10;
				skor.setText(Double.toString(oyuncuskor));
				
			}
			else if(insanbutton2.penalti<KartlarFpc.get(arr1[1]).penalti) {
				pcskor+=10;
				skorpc.setText(Double.toString(pcskor));

				
			}
		
			
		}
	
		
		else if(pozisyon==1) {
			
			Image pozisyonimg=new ImageIcon(this.getClass().getResource("/karsýkarsýya.png")).getImage();
			karsilastirilanpozisyon.setIcon(new ImageIcon(pozisyonimg));
			
			if (insanbutton2.karsi_karsiya>KartlarFpc.get(arr1[1]).karsi_karsiya) {
				
				oyuncuskor+=10;
				skor.setText(Double.toString(oyuncuskor));
				
			}
			else if(insanbutton2.karsi_karsiya<KartlarFpc.get(arr1[1]).karsi_karsiya) {
				pcskor+=10;
				skorpc.setText(Double.toString(pcskor));

				
			}
		
			
		}
		
		else {
			
			Image pozisyonimg=new ImageIcon(this.getClass().getResource("/serbestvurus.png")).getImage();
			karsilastirilanpozisyon.setIcon(new ImageIcon(pozisyonimg));
			
			
			if (insanbutton2.serbest_vurus>KartlarFpc.get(arr1[1]).serbest_vurus) {
				
				oyuncuskor+=10;
				skor.setText(Double.toString(oyuncuskor));
				
			}
			else if(insanbutton2.serbest_vurus<KartlarFpc.get(arr1[1]).serbest_vurus) {
				pcskor+=10;
				skorpc.setText(Double.toString(pcskor));

				
			}
			
			
			
		}
		
		oynabutton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
				for(int j=0;j<KullanilanKartlarB.size();j++) {
					KullanilanKartlarB.get(j).setVisible(false);
				}
				for(int j=0;j<KullanilanKartlarF.size();j++) {
					KullanilanKartlarF.get(j).setVisible(false);
				}
				for(int j=0;j<KartlarB.size();j++) {
					KartlarB.get(j).setEnabled(true);
				}
				
				for(int j=0;j<KartlarF.size();j++) {
					KartlarF.get(j).setEnabled(false);
				}
				karsilastirilanpozisyon.setText("");

				
				
			}
		});	
	
	
	
	}
	
	
	
});		
		
////button3
insanbutton3.addMouseListener(new MouseAdapter() {
	@Override
	public void mouseClicked(MouseEvent arg0) {
		int pozisyon= ((int) (Math.random() * 3));
		KartlarFpc.get(arr1[2]).setBounds(794, 170, 150, 250);
		insanbutton3.setBounds(314, 170, 150, 250);
		KartlarFpc.get(arr1[2]).setText(bilgisayarKartlarF.get(arr1[2]).getSporcu_Isim());
		//savasbuton.setVisible(true);
		KullanilanKartlarF.add(insanbutton3);
		KullanilanKartlarF.add(KartlarFpc.get(arr1[2]));
		insanbutton3.setBounds(314, 170, 150, 250);
		Image bilbutton13img=new ImageIcon(this.getClass().getResource("/"+bilgisayarKartlarF.get(arr1[2]).getSporcu_Isim() + ".png")).getImage();
		KartlarFpc.get(arr1[2]).setIcon(new ImageIcon(bilbutton13img));

		for(int j=0;j<KartlarB.size();j++) {
			KartlarB.get(j).setEnabled(false);
		}

		
		
		
		if(pozisyon==0) {
			
			Image pozisyonimg=new ImageIcon(this.getClass().getResource("/penalti.png")).getImage();
			karsilastirilanpozisyon.setIcon(new ImageIcon(pozisyonimg));
			
			if (insanbutton3.penalti>KartlarFpc.get(arr1[2]).penalti) {
				
				oyuncuskor+=10;
				skor.setText(Double.toString(oyuncuskor));
				
			}
			else if(insanbutton3.penalti<KartlarFpc.get(arr1[2]).penalti) {
				pcskor+=10;
				skorpc.setText(Double.toString(pcskor));

				
			}
		
			
		}
	
		
		else if(pozisyon==1) {
			
			Image pozisyonimg=new ImageIcon(this.getClass().getResource("/karsýkarsýya.png")).getImage();
			karsilastirilanpozisyon.setIcon(new ImageIcon(pozisyonimg));
			
			
			if (insanbutton3.karsi_karsiya>KartlarFpc.get(arr1[2]).karsi_karsiya) {
				
				oyuncuskor+=10;
				skor.setText(Double.toString(oyuncuskor));
				
			}
			else if(insanbutton3.karsi_karsiya<KartlarFpc.get(arr1[2]).karsi_karsiya) {
				pcskor+=10;
				skorpc.setText(Double.toString(pcskor));

				
			}
		
			
		}
		
		else {
			
			
			Image pozisyonimg=new ImageIcon(this.getClass().getResource("/serbestvurus.png")).getImage();
			karsilastirilanpozisyon.setIcon(new ImageIcon(pozisyonimg));
			
			
			if (insanbutton3.serbest_vurus>KartlarFpc.get(arr1[2]).serbest_vurus) {
				
				oyuncuskor+=10;
				skor.setText(Double.toString(oyuncuskor));
				
			}
			else if(insanbutton3.serbest_vurus<KartlarFpc.get(arr1[2]).serbest_vurus) {
				pcskor+=10;
				skorpc.setText(Double.toString(pcskor));

				
			}
			
			
			
		}
		
		oynabutton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
				for(int j=0;j<KullanilanKartlarB.size();j++) {
					KullanilanKartlarB.get(j).setVisible(false);
				}
				for(int j=0;j<KullanilanKartlarF.size();j++) {
					KullanilanKartlarF.get(j).setVisible(false);
				}
				for(int j=0;j<KartlarB.size();j++) {
					KartlarB.get(j).setEnabled(true);
				}
				
				for(int j=0;j<KartlarF.size();j++) {
					KartlarF.get(j).setEnabled(false);
				}
				
				karsilastirilanpozisyon.setText("");

			}
		});	
	
	
	
	}
	
	
	
});
		
		
////button4		
		
insanbutton4.addMouseListener(new MouseAdapter() {
	@Override
	public void mouseClicked(MouseEvent arg0) {
		int pozisyon= ((int) (Math.random() * 3));
		KartlarFpc.get(arr1[3]).setBounds(794, 170, 150, 250);
		insanbutton4.setBounds(314, 170, 150, 250);
		KartlarFpc.get(arr1[3]).setText(bilgisayarKartlarF.get(arr1[3]).getSporcu_Isim());
		//savasbuton.setVisible(true);
		KullanilanKartlarF.add(insanbutton4);
		KullanilanKartlarF.add(KartlarFpc.get(arr1[3]));
		Image bilbutton14img=new ImageIcon(this.getClass().getResource("/"+bilgisayarKartlarF.get(arr1[3]).getSporcu_Isim() + ".png")).getImage();
		KartlarFpc.get(arr1[3]).setIcon(new ImageIcon(bilbutton14img));

		for(int j=0;j<KartlarB.size();j++) {
			KartlarB.get(j).setEnabled(false);
		}

				
		if(pozisyon==0) {
			

			Image pozisyonimg=new ImageIcon(this.getClass().getResource("/penalti.png")).getImage();
			karsilastirilanpozisyon.setIcon(new ImageIcon(pozisyonimg));
			
			if (insanbutton4.penalti>KartlarFpc.get(arr1[3]).penalti) {
				
				oyuncuskor+=10;
				skor.setText(Double.toString(oyuncuskor));
				
			}
			else if(insanbutton4.penalti<KartlarFpc.get(arr1[3]).penalti) {
				pcskor+=10;
				skorpc.setText(Double.toString(pcskor));

				
			}
		
			
		}
	
		
		else if(pozisyon==1) {
			
			Image pozisyonimg=new ImageIcon(this.getClass().getResource("/karsýkarsýya.png")).getImage();
			karsilastirilanpozisyon.setIcon(new ImageIcon(pozisyonimg));
			
			
			if (insanbutton4.karsi_karsiya>KartlarFpc.get(arr1[3]).karsi_karsiya) {
				
				oyuncuskor+=10;
				skor.setText(Double.toString(oyuncuskor));
				
			}
			else if(insanbutton4.karsi_karsiya<KartlarFpc.get(arr1[3]).karsi_karsiya) {
				pcskor+=10;
				skorpc.setText(Double.toString(pcskor));

				
			}
		
			
		}
		
		else {
		

			Image pozisyonimg=new ImageIcon(this.getClass().getResource("/serbestvurus.png")).getImage();
			karsilastirilanpozisyon.setIcon(new ImageIcon(pozisyonimg));
			
			if (insanbutton4.serbest_vurus>KartlarFpc.get(arr1[3]).serbest_vurus) {
				
				oyuncuskor+=10;
				skor.setText(Double.toString(oyuncuskor));
				
			}
			else if(insanbutton4.serbest_vurus<KartlarFpc.get(arr1[3]).serbest_vurus) {
				pcskor+=10;
				skorpc.setText(Double.toString(pcskor));

				
			}
			
			
			
		}
		
		oynabutton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
				for(int j=0;j<KullanilanKartlarB.size();j++) {
					KullanilanKartlarB.get(j).setVisible(false);
				}
				for(int j=0;j<KullanilanKartlarF.size();j++) {
					KullanilanKartlarF.get(j).setVisible(false);
				}
				for(int j=0;j<KartlarB.size();j++) {
					KartlarB.get(j).setEnabled(true);
				}
				
				for(int j=0;j<KartlarF.size();j++) {
					KartlarF.get(j).setEnabled(false);
				}
				karsilastirilanpozisyon.setText("");

			}
		});	
	
	
	
	}
	
	
	
});	
		
		
		
		
		
///basketbutton1	
insanbutton5.addMouseListener(new MouseAdapter() {
	@Override
	public void mouseClicked(MouseEvent e) {
		KartlarBpc.get(arr1[0]).setBounds(794, 170, 150, 250);
		insanbutton5.setBounds(314, 170, 150, 250);
		
		Image bilbutton15img=new ImageIcon(this.getClass().getResource("/"+bilgisayarKartlarB.get(arr1[0]).getSporcu_Isim() + ".png")).getImage();
		KartlarBpc.get(arr1[0]).setIcon(new ImageIcon(bilbutton15img));

		KullanilanKartlarB.add(insanbutton5);
	    KullanilanKartlarB.add(KartlarBpc.get(arr1[0]));

	    for(int j=0;j<KartlarF.size();j++) {
			KartlarF.get(j).setEnabled(false);
		}

	    int pozisyon= ((int) (Math.random() * 3));
		
		
	
        
		if(pozisyon==0) {
		

			Image pozisyonimg=new ImageIcon(this.getClass().getResource("/ikilik.png")).getImage();
			karsilastirilanpozisyon.setIcon(new ImageIcon(pozisyonimg));
			
			if (insanbutton5.ikilik>KartlarBpc.get(arr1[0]).ikilik) {
				
				oyuncuskor+=10;
				skor.setText(Double.toString(oyuncuskor));
				
			}
			else if(insanbutton5.ikilik<KartlarBpc.get(arr1[0]).ikilik) {
				pcskor+=10;
				skorpc.setText(Double.toString(pcskor));

				
			}
			
			
		}
	
		
		else if(pozisyon==1) {
			

			Image pozisyonimg=new ImageIcon(this.getClass().getResource("/ucluk.png")).getImage();
			karsilastirilanpozisyon.setIcon(new ImageIcon(pozisyonimg));
			
			if (insanbutton5.ucluk>KartlarBpc.get(arr1[0]).ucluk) {
				
				oyuncuskor+=10;
				skor.setText(Double.toString(oyuncuskor));
				
			}
			else if(insanbutton5.ucluk<KartlarBpc.get(arr1[0]).ucluk) {
				pcskor+=10;
				skorpc.setText(Double.toString(pcskor));

				
			}
			
			
			
			
		}
		
		else {
			
		
			Image pozisyonimg=new ImageIcon(this.getClass().getResource("/serbestatis.png")).getImage();
			karsilastirilanpozisyon.setIcon(new ImageIcon(pozisyonimg));
			
			
			if (insanbutton5.serbest_atis>KartlarBpc.get(arr1[0]).serbest_atis) {
				
				oyuncuskor+=10;
				skor.setText(Double.toString(oyuncuskor));
				
			}
			else if(insanbutton5.serbest_atis<KartlarBpc.get(arr1[0]).serbest_atis) {
				pcskor+=10;
				skorpc.setText(Double.toString(pcskor));

				
			}
			
			
			
		}
		
		oynabutton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
				for(int j=0;j<KullanilanKartlarB.size();j++) {
					KullanilanKartlarB.get(j).setVisible(false);
				}
				for(int j=0;j<KullanilanKartlarF.size();j++) {
					KullanilanKartlarF.get(j).setVisible(false);
				}
				for(int j=0;j<KartlarB.size();j++) {
					KartlarB.get(j).setEnabled(false);
				}
				
				for(int j=0;j<KartlarF.size();j++) {
					KartlarF.get(j).setEnabled(true);
				}
				karsilastirilanpozisyon.setText("");

			}
		});	
	
	
	
	}
});		
		
		

////basketbutton2

insanbutton6.addMouseListener(new MouseAdapter() {
	@Override
	public void mouseClicked(MouseEvent e) {
		KartlarBpc.get(arr1[1]).setBounds(794, 170, 150, 250);
		insanbutton6.setBounds(314, 170, 150, 250);
		
		Image bilbutton16img=new ImageIcon(this.getClass().getResource("/"+bilgisayarKartlarB.get(arr1[1]).getSporcu_Isim() + ".png")).getImage();
		KartlarBpc.get(arr1[1]).setIcon(new ImageIcon(bilbutton16img));
		
		KullanilanKartlarB.add(insanbutton6);
	    KullanilanKartlarB.add(KartlarBpc.get(arr1[1]));
	

	    for(int j=0;j<KartlarF.size();j++) {
			KartlarF.get(j).setEnabled(false);
		}

	    int pozisyon= ((int) (Math.random() * 3));
		
		
	
        
		if(pozisyon==0) {
		
			
			Image pozisyonimg=new ImageIcon(this.getClass().getResource("/ikilik.png")).getImage();
			karsilastirilanpozisyon.setIcon(new ImageIcon(pozisyonimg));
			
			if (insanbutton6.ikilik>KartlarBpc.get(arr1[1]).ikilik) {
		
				oyuncuskor+=10;
				skor.setText(Double.toString(oyuncuskor));
				
			}
			else if(insanbutton6.ikilik<KartlarBpc.get(arr1[1]).ikilik) {
				pcskor+=10;
				skorpc.setText(Double.toString(pcskor));

				
			}
			
			
		}
	
		
		else if(pozisyon==1) {
		
			
			Image pozisyonimg=new ImageIcon(this.getClass().getResource("/ucluk.png")).getImage();
			karsilastirilanpozisyon.setIcon(new ImageIcon(pozisyonimg));			
			if (insanbutton6.ucluk>KartlarBpc.get(arr1[1]).ucluk) {
		
				oyuncuskor+=10;
				skor.setText(Double.toString(oyuncuskor));
				
			}
			else if(insanbutton6.ucluk<KartlarBpc.get(arr1[1]).ucluk) {
				pcskor+=10;
				skorpc.setText(Double.toString(pcskor));

				
			}
			
			
			
			
		}
		
		else {
			
		
			Image pozisyonimg=new ImageIcon(this.getClass().getResource("/serbestatis.png")).getImage();
			karsilastirilanpozisyon.setIcon(new ImageIcon(pozisyonimg));			
			if (insanbutton6.serbest_atis>KartlarBpc.get(arr1[1]).serbest_atis) {
				
				oyuncuskor+=10;
				skor.setText(Double.toString(oyuncuskor));
				
			}
			else if(insanbutton6.serbest_atis<KartlarBpc.get(arr1[1]).serbest_atis) {
				pcskor+=10;
				skorpc.setText(Double.toString(pcskor));

				
			}
			
			
			
		}
		
		oynabutton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
				for(int j=0;j<KullanilanKartlarB.size();j++) {
					KullanilanKartlarB.get(j).setVisible(false);
				}
				for(int j=0;j<KullanilanKartlarF.size();j++) {
					KullanilanKartlarF.get(j).setVisible(false);
				}
				for(int j=0;j<KartlarB.size();j++) {
					KartlarB.get(j).setEnabled(false);
				}
				
				for(int j=0;j<KartlarF.size();j++) {
					KartlarF.get(j).setEnabled(true);
				}
				karsilastirilanpozisyon.setText("");

			}
		});	
	
	
	
	}
});	
		
	
	


////basketbutton3

insanbutton7.addMouseListener(new MouseAdapter() {
	@Override
	public void mouseClicked(MouseEvent e) {
		KartlarBpc.get(arr1[2]).setBounds(794, 170, 150, 250);
		insanbutton7.setBounds(314, 170, 150, 250);
		
		Image bilbutton17img=new ImageIcon(this.getClass().getResource("/"+bilgisayarKartlarB.get(arr1[2]).getSporcu_Isim() + ".png")).getImage();
		KartlarBpc.get(arr1[2]).setIcon(new ImageIcon(bilbutton17img));
		

		KullanilanKartlarB.add(insanbutton7);
	    KullanilanKartlarB.add(KartlarBpc.get(arr1[2]));
	    for(int j=0;j<KartlarF.size();j++) {
			KartlarF.get(j).setEnabled(false);
		}

	    int pozisyon= ((int) (Math.random() * 3));
		
		
	
        
		if(pozisyon==0) {
		
			Image pozisyonimg=new ImageIcon(this.getClass().getResource("/ikilik.png")).getImage();
			karsilastirilanpozisyon.setIcon(new ImageIcon(pozisyonimg));
			
			if (insanbutton7.ikilik>KartlarBpc.get(arr1[2]).ikilik) {
		
				oyuncuskor+=10;
				skor.setText(Double.toString(oyuncuskor));
				
			}
			else if(insanbutton7.ikilik<KartlarBpc.get(arr1[2]).ikilik) {
				pcskor+=10;
				skorpc.setText(Double.toString(pcskor));

				
			}
			
			
		}
	
		
		else if(pozisyon==1) {
			

			Image pozisyonimg=new ImageIcon(this.getClass().getResource("/ucluk.png")).getImage();
			karsilastirilanpozisyon.setIcon(new ImageIcon(pozisyonimg));
			if (insanbutton7.ucluk>KartlarBpc.get(arr1[2]).ucluk) {
				
				oyuncuskor+=10;
				skor.setText(Double.toString(oyuncuskor));
				
			}
			else if(insanbutton7.ucluk<KartlarBpc.get(arr1[2]).ucluk) {
				pcskor+=10;
				skorpc.setText(Double.toString(pcskor));

				
			}
			
			
			
			
		}
		
		else {
			
		
			Image pozisyonimg=new ImageIcon(this.getClass().getResource("/serbestatis.png")).getImage();
			karsilastirilanpozisyon.setIcon(new ImageIcon(pozisyonimg));
			
			if (insanbutton7.serbest_atis>KartlarBpc.get(arr1[2]).serbest_atis) {
				
				oyuncuskor+=10;
				skor.setText(Double.toString(oyuncuskor));
				
			}
			else if(insanbutton7.serbest_atis<KartlarBpc.get(arr1[2]).serbest_atis) {
				pcskor+=10;
				skorpc.setText(Double.toString(pcskor));

				
			}
			
			
			
		}
		
		oynabutton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
				for(int j=0;j<KullanilanKartlarB.size();j++) {
					KullanilanKartlarB.get(j).setVisible(false);
				}
				for(int j=0;j<KullanilanKartlarF.size();j++) {
					KullanilanKartlarF.get(j).setVisible(false);
				}
				for(int j=0;j<KartlarB.size();j++) {
					KartlarB.get(j).setEnabled(false);
				}
				
				for(int j=0;j<KartlarF.size();j++) {
					KartlarF.get(j).setEnabled(true);
				}
				karsilastirilanpozisyon.setText("");

			}
		});	
	
	
	
	}
});	
	
	
////basketbutton4

insanbutton8.addMouseListener(new MouseAdapter() {
	@Override
	public void mouseClicked(MouseEvent e) {
		KartlarBpc.get(arr1[3]).setBounds(794, 170, 150, 250);
		insanbutton8.setBounds(314, 170, 150, 250);
		
		Image bilbutton18img=new ImageIcon(this.getClass().getResource("/"+bilgisayarKartlarB.get(arr1[3]).getSporcu_Isim() + ".png")).getImage();
		KartlarBpc.get(arr1[3]).setIcon(new ImageIcon(bilbutton18img));
		

		KullanilanKartlarB.add(insanbutton8);
	    KullanilanKartlarB.add(KartlarBpc.get(arr1[3]));
	    for(int j=0;j<KartlarF.size();j++) {
			KartlarF.get(j).setEnabled(false);
		}

	    int pozisyon= ((int) (Math.random() * 3));
		
		
	
        
		if(pozisyon==0) {
			
			Image pozisyonimg=new ImageIcon(this.getClass().getResource("/ikilik.png")).getImage();
			karsilastirilanpozisyon.setIcon(new ImageIcon(pozisyonimg));			
			if (insanbutton8.ikilik>KartlarBpc.get(arr1[3]).ikilik) {
				
				oyuncuskor+=10;
				skor.setText(Double.toString(oyuncuskor));
				
			}
			else if(insanbutton8.ikilik<KartlarBpc.get(arr1[3]).ikilik) {
				pcskor+=10;
				skorpc.setText(Double.toString(pcskor));

				
			}
			
			
		}
	
		
		else if(pozisyon==1) {
			
			Image pozisyonimg=new ImageIcon(this.getClass().getResource("/ucluk.png")).getImage();
			karsilastirilanpozisyon.setIcon(new ImageIcon(pozisyonimg));			
			if (insanbutton8.ucluk>KartlarBpc.get(arr1[3]).ucluk) {
				
				oyuncuskor+=10;
				skor.setText(Double.toString(oyuncuskor));
				
			}
			else if(insanbutton8.ucluk<KartlarBpc.get(arr1[3]).ucluk) {
				pcskor+=10;
				skorpc.setText(Double.toString(pcskor));

				
			}
			
			
			
			
		}
		
		else {
			
		
			Image pozisyonimg=new ImageIcon(this.getClass().getResource("/serbestatis.png")).getImage();
			karsilastirilanpozisyon.setIcon(new ImageIcon(pozisyonimg));			
			if (insanbutton8.serbest_atis>KartlarBpc.get(arr1[3]).serbest_atis) {
				
				oyuncuskor+=10;
				skor.setText(Double.toString(oyuncuskor));
				
			}
			else if(insanbutton8.serbest_atis<KartlarBpc.get(arr1[3]).serbest_atis) {
				pcskor+=10;
				skorpc.setText(Double.toString(pcskor));

				
			}
			
			
			
		}
		
		oynabutton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
				for(int j=0;j<KullanilanKartlarB.size();j++) {
					KullanilanKartlarB.get(j).setVisible(false);
				}
				for(int j=0;j<KullanilanKartlarF.size();j++) {
					KullanilanKartlarF.get(j).setVisible(false);
				}
				for(int j=0;j<KartlarB.size();j++) {
					KartlarB.get(j).setEnabled(false);
				}
				
				for(int j=0;j<KartlarF.size();j++) {
					KartlarF.get(j).setEnabled(true);
				}
			}
		});	
	
	
	
	}
});	

sonucgoster.addMouseListener(new MouseAdapter() {
	@Override
	public void mouseClicked(MouseEvent arg0) {
	for(int i=0;i<4;i++) {
		KartlarB.get(i).setVisible(false);
		KartlarBpc.get(i).setVisible(false);
		KartlarF.get(i).setVisible(false);
		KartlarFpc.get(i).setVisible(false);
		karsilastirilanpozisyon.setVisible(false);
	
	}
	if(oyuncuskor>pcskor) {
		kazanan.setVisible(true);
		kazanan.setText("kazanan oyuncu");
		
		
	}
	else if(oyuncuskor<pcskor) {
		kazanan.setVisible(true);
		kazanan.setText("kazanan pc");
		
		
	}
	else  {
		kazanan.setVisible(true);
		kazanan.setText("berabere");
		
		
	}	
		
		
		
	
	
	
	}
});	




		
		


		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
	

	
		

	
	

		
	
	
	
	
	
	
	}
	

	public void kartlariOrtadaTopla() {
		ortadakiKartlarF.add(Test.messi);
		ortadakiKartlarF.add(Test.lewandowski);
		ortadakiKartlarF.add(Test.aguero);
		ortadakiKartlarF.add(Test.mbappe);
		ortadakiKartlarF.add(Test.neymar);
		ortadakiKartlarF.add(Test.perotti);
		ortadakiKartlarF.add(Test.ronaldo);
		ortadakiKartlarF.add(Test.sosa);
		
		ortadakiKartlarB.add(Test.curry);
		ortadakiKartlarB.add(Test.harden);
		ortadakiKartlarB.add(Test.davis);
		ortadakiKartlarB.add(Test.doncic);
		ortadakiKartlarB.add(Test.durant);
		ortadakiKartlarB.add(Test.kobe);
		ortadakiKartlarB.add(Test.klay);
		ortadakiKartlarB.add(Test.lebron);
		//... hepsini ekledik
	}
	
/*	public void oynanacakEliBelirle() {
		if(random.nextInt(2) == 0) {
			oynananElFutbolCuMu = true;
		}else {
			oynananElFutbolCuMu = false;
		} // 0 ya da 1
	}*/
	
	
	public void elDagit() {
	
	
			
		//Ýnsana dagitma
		for(int i  = 0; i < dagitilacakKartSayisi; i++) {
				//4 tane futbolcu bilgisayara verilcek
			Collections.shuffle(ortadakiKartlarF);	
			for(Futbolcu futbolcu : ortadakiKartlarF) {
			
						//sporcu 1 tane futbolcu kartý
						insanKartlarF.add(futbolcu);
						ortadakiKartlarF.remove(futbolcu);
						Collections.shuffle(ortadakiKartlarF);
						break;
					
				}
			}
			
			for(int i  = 0; i < dagitilacakKartSayisi; i++) {
				//4 tane futbolcu bilgisayara verilcek
				for(Futbolcu futbolcu : ortadakiKartlarF) {
					
						//sporcu 1 tane futbolcu kartý
						bilgisayarKartlarF.add(futbolcu);
						ortadakiKartlarF.remove(futbolcu);
						Collections.shuffle(ortadakiKartlarF);
						break;
					
				}
			}
			
	//	}
			
			
			
//		else {
			//basketbol eli
			//if(oynananElFutbolCuMu == true) {
			for(int i  = 0; i < dagitilacakKartSayisi; i++) {
				//4 tane basketbolcu bilgisayara verilcek
				Collections.shuffle(ortadakiKartlarB);
				for(Basketbolcu basketbolcu : ortadakiKartlarB) {
				       //sporcu 1 tane basketbolcu kartý
						insanKartlarB.add(basketbolcu);
						ortadakiKartlarB.remove(basketbolcu);
						Collections.shuffle(ortadakiKartlarB);
						break;
					
				}
			}

			//}
			for(int i  = 0; i < dagitilacakKartSayisi; i++) {
				//4 tane basketbolcu bilgisayara verilcek
				for(Basketbolcu basketbolcu : ortadakiKartlarB) {
					
						//sporcu 1 tane Basketbolcu kartý
						bilgisayarKartlarB.add(basketbolcu);
						ortadakiKartlarB.remove(basketbolcu);
						Collections.shuffle(ortadakiKartlarB);
						break;
					
				}
			}
		

	
			
			
			
			
			
			
			
			




		
	}
	}


