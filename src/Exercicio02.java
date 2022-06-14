import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		int a, b, c, maior, medio, menor;
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Digite A: ");
		a=sc.nextInt();
		
		System.out.print("Digite B: ");
		b=sc.nextInt();
		
		System.out.print("Digite C: ");
		c=sc.nextInt();
		
		if(a>b && a>c){
			maior=a;
		}else if(b>c){
			maior=b;
		}else{
			maior=c;
		}
		
		if(a<b && a<c){
			menor=a;
		}else if(b<c){
			menor=b;
		}else{
			menor=c;
		}
		
		if(a>menor && a<maior){
			medio=a;
		}else if(b>menor && b<maior){
			medio=b;
		}else{
			medio=c;
		}
		
		System.out.println("A ordem crescente dos numeros eh: "+menor+" "+medio+" "+maior);
		
	}	
	

}
//Faça um programa que entre com três números e coloque em ordem crescente.