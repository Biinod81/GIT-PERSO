import java.util.Scanner;

public class ResolutionEquation {

	public static void main(String[] args) {
		Scanner entr�e = new Scanner(System.in);
		System.out.println("Coefficient a :");
		float a = entr�e.nextInt();
		System.out.println("Coefficient b :");
		float b = entr�e.nextInt();
		System.out.println("Coefficient c :");
		float c = entr�e.nextInt();
		System.out.println("R�solution de l'�quation : "+a+"x^2 + "+b+"x + "+c+" = 0");
		float delta=(b*b)-(4*a*c);
		System.out.println("discriminant: "+delta);
		if (delta < 0) {
			System.out.println("Aucune solution r�elle");
		}
		else if (delta == 0){
			float resultat= (-b)/(2*a);
			System.out.println("1 solution : "+resultat);
		}
		else {
			float res1= (-b+sqrt(delta))/(2*a);
			float res2= (-b-sqrt(delta))/(2*a);
		}
	
	}

}
