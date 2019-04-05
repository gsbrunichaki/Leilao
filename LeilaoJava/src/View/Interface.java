package View;
import java.util.Scanner;
import Model.Compradores;
import Model.Lances;
public class Interface {
	public static void  main (String [] args) {
		Scanner in = new Scanner  (System.in);
		
		int sair = -1;
		do while(sair != 0) {
		
		System.out.println("Insira nome, idade, sexo e CPF:  ");
		Compradores p1 = new Compradores("Guilherme", 19, 'm', "02456465465");
			
		System.out.println("Insira seu lance: ");
		Lances l1 = new Lances();
			
		System.out.println("Vc deseja sair - digite 0");
		sair = in.nextInt();
		}
	}
}