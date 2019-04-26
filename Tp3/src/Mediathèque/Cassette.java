//import java.util.Date;
package Mediathèque;

public class Cassette extends Document{
	
	protected String auteur;			
	protected int duree;
	
	public Cassette (){	
		//super.getTitre();
		super.setTitre("Secsrs");//rend le code statique
	}
	
	public void setAuteur (String author) {
		auteur = author;
	}
	
	
	public void setDurée (int duration) {
		duree = duration;
	}
	
/*	public String getAuteur() {
		return auteur;
	}
	
	
	public int getDurée() {
		return duree;	
	}
	
*/	
	public String toString() {
		
		return super.titre + " " + auteur +" "+ duree + "" +" "+ super.creationDate + "";
	}
	

}
