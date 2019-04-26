//import java.util.Date;
package Mediathèque;

public class Livre extends Document{
	
	protected String auteur;			
	protected int page;
	protected String editeur;
	
	public Livre (){	
		super.setTitre("LDAD");
	}
	
	public void setEditeur (String editeur) {
		this.editeur = editeur;
	}
	
	public void setAuteur (String auteur) {
		this.auteur = auteur;
	}
	
	public void setPage (int page) {
		this.page = page;
	}
	
	public String toString() {
		return super.titre +" "+ page + "" +" "+ auteur +" "+ editeur +" "+ super.creationDate + "";
	}

	
}
