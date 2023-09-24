import java.util.Scanner; 
public class Frequencias {
 public static void main(String[] args) {
	 Scanner ler = new Scanner(System.in);
	 // este programa encontra o valor da frequência absoluta (FA)
	 int fa, totFa; 
	 double fr, calculo; 
	 
	 totFa = 50;
	 
	 System.out.println("Digite a FR para encontrar a FA:");
	 fr = ler.nextDouble(); 
	 
	 calculo =  fr*totFa; 
	 
	 
	 
	 System.out.println("FA: " +calculo);
ler.close();
	 
 }
}
