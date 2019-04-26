package Mediathèque;
import java.util.Date;

public class Document extends Bibliotheque {
	
	protected String titre;			
	protected Date creationDate;
			
			

	public String toString() {
		
		return super.toString() + titre +" "+ creationDate + "";
	}
	
	public Document() {	
		creationDate = new Date();
	}
	public Document (String titre){	
	}
	public String getTitre() {
		return "titre: "+ titre;	
	}
	public void setTitre(String titre){
		this.titre = titre;
	}
	public String getCreationDate() {
		return creationDate + "";
	}

}
