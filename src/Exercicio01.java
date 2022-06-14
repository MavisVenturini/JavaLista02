import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		int a, b, c, maior;
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
		
		System.out.println("O maior numero eh: "+maior);
		
	}	
	

}