package om;
import java.util.*;
import java.util.Scanner;

public class calcul101 {
	
	private int i;
	private int j;
	
	public calcul101() {
		this.i = (int)(Math.random()*(10-2)+1);
		this.j = (int)(Math.random()*(10-(i+1))+1);
		System.out.println(this.i + " plus " + this.j);
	}
	
	public void decision(int a, int b) {
		if (a-b<0) {
			soustraction(b, a);
		}
		else if (a+b>10 && a<b) {
			soustraction(a, b);
			}
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
		
	public void comparaison(int a, int b) {
		
		if (a == b) {
			System.out.println("Bravo! vous avez trouvé la bonne réponse.");
		}
		else {
			System.out.println("Perdu, essayez encore!");
		}
	
	
	}
}



















































//Scanner sc = new Scanner(System.in);