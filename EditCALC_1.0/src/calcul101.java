import java.util.Scanner;
import java.util.*;


public class calcul101 {
	
	private int i;
	private int j;
	
	public calcul101() {
		this.i = (int)(Math.random()*(10-2)+1);
		this.j = (int)(Math.random()*(10-(i+1))+1);
		System.out.println(this.i + " plus " + this.j);
	}
	
	public int Addition() {
		int k = this.i + this.j;
		return k;
	}
	
	public int utilres(){
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		sc.close();
		return l;
	}
		
	/*public void comparaison() {
		
		int n;
		int o;
		int m = 0;
		
		if (Addition.n != utilres.o) {
			
		}
	}*/
	
	
}