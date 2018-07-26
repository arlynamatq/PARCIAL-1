package problem4;
import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
float sumat=0, cant=0, neg=0, post=0, cont=0, max=-999999, min=999999, media=0;
		

		while (cont!=-1)
		{
			Scanner scan = new Scanner(System.in);
			System.out.println("Introduzca un cualquier numero entero:  ");
			System.out.println("Introduzca -1 si desea terminar: ");
			cont = scan.nextInt();
			sumat=sumat+cont;
			cant++;
			if (cont>=0)
			{
				post=post+cont;
			}
			else
			{
				neg=neg+cont;
			}
		
				if(min>cont && cont!=-1)
				{
					min=cont;
				}
				if(max<cont && cont!=-1)
				{
					max=cont;
				}
		}
		cant--;
		sumat++;
		media=sumat/cant;
		neg++;
		System.out.println("El numero mayor  : "+max);
		System.out.println("El numero menor : "+min);
		System.out.println("La suma total de los numeros positivos introducidos  : "+post);
		System.out.println("La suma total de los numeros negativos introducidos  : "+neg);
		System.out.println("La suma total de los numeros introducidos : "+sumat);
		System.out.println("La media de la suma total de los numeros introducidos : " +media);

	}

}


	


