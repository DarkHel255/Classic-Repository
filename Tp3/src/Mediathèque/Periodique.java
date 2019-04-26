//import java.util.Date;
package Mediathèque;

public class Periodique extends Document {
	
	protected String frequence;			
	protected int page;
	
	public Periodique (){	
		super.setTitre("Del");
	}
	
	public void setFrequence (String frequence) {
		this.frequence = frequence;
	}
	
	
	public void setPage (int page) {
		this.page = page;
	}
	
	public String toString() {
		return super.titre +" "+ page + "" +" "+ frequence +" "+ super.creationDate + "";
	}
	
	
}