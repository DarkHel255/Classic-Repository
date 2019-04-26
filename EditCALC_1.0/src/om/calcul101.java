package om;
import java.util.Scanner;

public class calcul101 {
	
	private int i;
	private int j;
	
	public calcul101() {
		this.i = (int)(Math.random()*(10-2)+1);
		this.j = (int)(Math.random()*(10-(i+1))+1);
		System.out.println(this.i + " plus " + this.j);
	}
	
	public static int addition(int m, int n) {
		int k = m + n;
		return k;
	}
	
	public static int soustraction(int m, int n) {
		int k = m - n;
		return k;
	}
	
	public static int utilres(int o){
		Scanner sc = new Scanner(System.in);
		o = sc.nextInt();
		sc.close();
		return o;
	}

	public static void comparaison(int k, int l) {
		// TODO Auto-generated method stub
		
	}
		
	/*public void comparaison() {
		
		int n;
		int o;
		int m = 0;
		
		if (Addition.n != utilres.o) {
			
		}
	}*/
	
	
}




















































//Scanner sc = new Scanner(System.in);