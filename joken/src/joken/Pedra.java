package joken;

import java.util.Random;
import java.util.Scanner;

public class Pedra {

	public static void main(String[] args) {
/*
 1= Pedra(Stone); 2= Papel(Paper); 3= Tesoura(scissors) 
 */		
		
	Scanner key=new Scanner(System.in);
	Random pcOp =new Random();
	int pc=pcOp.nextInt(3) + 1;
	System.out.println("seu nome:");
	String nome=key.next();
	System.out.println("escolha entre:");
	System.out.println("1 = pedra.");
	System.out.println("2 = papel.");
	System.out.println("3 = tesoura.");
	int opi=key.nextInt();
	
	if(pc==1) {
		
		switch(opi){
				case 1:
					System.out.println("Pedra, Papel, Tesoura ...");
					System.out.println("PC escolhe: Pedra.");
					System.out.println(nome+" você escolheu: Pedra.");
					System.out.println("vocês empatam -_-");
					break;
				case 2:
					System.out.println("Pedra, Papel, Tesoura ...");
					System.out.println("PC escolhe: Pedra.");
					System.out.println(nome+" você escolheu: Papel.");
					System.out.println("PARABENS VITORIA @-@");
					break;
				case 3:
					System.out.println("Pedra, Papel, Tesoura ...");
					System.out.println("PC escolhe: Pedra.");
					System.out.println(nome+" você escolheu: Tesoura.");
					System.out.println("você perdeu ;-;");
					break;
				}
	}else if(pc==2) {
		switch(opi){
		case 1:
			System.out.println("Pedra, Papel, Tesoura ...");
			System.out.println("PC escolhe: Pedra.");
			System.out.println(nome+" você escolheu: Papel.");
			System.out.println("PARABENS VITORIA @-@");
			break;
		case 2:
			System.out.println("Pedra, Papel, Tesoura ...");
			System.out.println("PC escolhe: Papel.");
			System.out.println(nome+" você escolheu: Papel.");
			System.out.println("vocês empatam -_-");
			break;
		case 3:
			System.out.println("Pedra, Papel, Tesoura ...");
			System.out.println("PC escolhe: Tesoura.");
			System.out.println(nome+" você escolheu: Papel.");
			System.out.println("você perdeu ;-;");
			break;	
		}
			}else {
				switch(opi) {
				case 1:
					System.out.println("Pedra, Papel, Tesoura ...");
					System.out.println("PC escolhe: Pedra.");
					System.out.println(nome+" você escolheu: Tesoura.");
					System.out.println("você perdeu ;-;");
					break;
				case 2:
					System.out.println("Pedra, Papel, Tesoura ...");
					System.out.println("PC escolhe: Papel.");
					System.out.println(nome+" você escolheu: Tesoura.");
					System.out.println("PARABENS VITORIA @-@");
					break;
				case 3:
					System.out.println("Pedra, Papel, Tesoura ...");
					System.out.println("PC escolhe: Tesoura.");
					System.out.println(nome+" você escolheu: Tesoura.");
					System.out.println("vocês empatam -_-");
					break;
				
				}
			}
	System.out.println(pc);
		key.close();
	}/*BY:Silas Souza(ShirasuSouza)*/

}
