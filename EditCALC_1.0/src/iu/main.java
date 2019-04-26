package iu;
import java.util.*;
import om.calcul101;
public class main {
	
	public static void main(String[] args) {
		int i = (int)(Math.random()*(10-2)+1);
		int j = (int)(Math.random()*(10-(i+1))+1);
		int a = (int)(Math.random()*3);
		int l = 0;
		int k = 0;
		if (a > 1) {
			System.out.println("résolvez ce calcul: " + i + " plus " + j);
		}
		else if (j >= i) {
			System.out.println("résolvez ce calcul: " + j + " moins " + i);
		}
		else {
			System.out.println("résolvez ce calcul: " + i + " moins " + j);
		}
		
		Scanner sc = new Scanner(System.in);
		
		l = calcul101.utilres(l);
		
		if (a > 1) {
			k = calcul101.addition(i, j);
		}
		else if (j >= i) {
			k = calcul101.soustraction(j, i);
		}
		else {
			k = calcul101.soustraction(i, j);
		}
		
		calcul101.comparaison(k, l);
		
		System.out.println("résultat attendu: " + k + ", résultat utilisateur: " + l);
		if (k == l) {
			System.out.println("Bravo! vous avez trouvé la bonne réponse.");
			sc.close();
		}
		else {
			System.out.println("Perdu, essayez encore!");
			sc.close();
		}
		
	}
	
	
}
