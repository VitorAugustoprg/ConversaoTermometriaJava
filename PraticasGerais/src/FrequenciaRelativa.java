import java.util.Scanner;  
public class FrequenciaRelativa {
 public static void main(String[] args) {
	 Scanner ler = new Scanner(System.in); 
	 // este programa calcula a frequência relativa (Fr/total) 
	 double fa, calculo, fr;
	 int total;
	 
	 total = 50; 
	 
	 System.out.println("Digite a FA para encontrar a FR:");
	 fa = ler.nextDouble(); 
	 
	 calculo = fa/total;  
	 fr = calculo;
	 
	 System.out.println("FR: "+fr);
	 
	 ler.close(); 
 }
}
