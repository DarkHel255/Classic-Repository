//import java.util.Date;
package Mediath�que;

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
	
	
	public void setDur�e (int duration) {
		duree = duration;
	}
	
/*	public String getAuteur() {
		return auteur;
	}
	
	
	public int getDur�e() {
		return duree;	
	}
	
*/	
	public String toString() {
		
		return super.titre + " " + auteur +" "+ duree + "" +" "+ super.creationDate + "";
	}
	

}
