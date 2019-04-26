package iu;
import java.util.*;
import om.calcul101;
import ig.EDITCalcFen;
public class main {
	
	public static void main(String[] args) {
		
		/*Timer publi = new Timer();
		
		publi.schedule(new TimerTask() {
			  @Override
			  public void run() {
			    // Your database code here
			  }
			}, 10000);*/
		
		int i = 10;
		int j = 10;
		int l = 0;
		while (i > 5 && j > 5) {
			i = (int)(Math.random()*(10-2)+1);
			j = (int)(Math.random()*(10-2)+1);
		}
		int k = 0;
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Addition: 1, Soustraction: 0");*/
		int add = (int)(Math.random()*(3-1)+0);
		//sc.close();
		if (add == 0) {
			
			if (i-j < 0) {
			
				k = calcul101.soustraction(j, i);
				System.out.println("résolvez ce calcul: " + j + " moins " + i);
			
				Scanner sc = new Scanner(System.in);
				l = calcul101.utilres(l);
				sc.close();
				
				System.out.println("résultat attendu: " + k + ", résultat utilisateur: " + l);
				if (k == l) {
					System.out.println("Bravo! vous avez trouvé la bonne réponse.");
					
				}
				else {
					System.out.println("Perdu, essayez encore!");
				}
			}else {
				k = calcul101.soustraction(i, j);
				System.out.println("résolvez ce calcul: " + i + " moins " + j);
			
				Scanner sc = new Scanner(System.in);
				
				l = calcul101.utilres(l);
				sc.close();
				System.out.println("résultat attendu: " + k + ", résultat utilisateur: " + l);
				if (k == l) {
					System.out.println("Bravo! vous avez trouvé la bonne réponse.");	
				}
				else {
					System.out.println("Perdu, essayez encore!");
				}
			}
		}else {
			
			System.out.println("résolvez ce calcul: "+i+" plus "+j);
			
			k=calcul101.addition(i,j);
			
			Scanner sc=new Scanner(System.in);
		
			l=calcul101.utilres(l);
			sc.close();
			System.out.println("résultat attendu: "+k+", résultat utilisateur: "+l);
			if (k == l) {
				System.out.println("Bravo! vous avez trouvé la bonne réponse.");
			}
			else {
				System.out.println("Perdu, essayez encore!");
			}
		}
	}
	
	
}