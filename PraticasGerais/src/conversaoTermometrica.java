import java.util.Scanner; 
public class conversaoTermometrica {
 public static void main(String[] args) {
	 Scanner ler = new Scanner(System.in); 
	 double tetaF, fahrenhit, tk; 
	 System.out.println("Digite um valor em Fahrenhit: ");
	 tetaF = ler.nextDouble(); 
	 
	 fahrenhit = (tetaF-32)/9;
	 fahrenhit = fahrenhit*5;
	 tk = fahrenhit+273.15; 
	 
	 System.out.println("O resultado da conversão fica: "+tk); 
	 
	 
	 ler.close();
	 
 }
}
