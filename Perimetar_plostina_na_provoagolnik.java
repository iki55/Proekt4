package proekt_4;

import java.util.Scanner;

public class Perimetar_plostina_na_provoagolnik {

	public static void main(String[] args) {
	double str1,str2,povrsina,perimetar;
	Scanner tastatura= new Scanner (System.in);
	System.out.println("Programata presmetuva povrsina i perimetar na pravoagolnik");
	System.out.println("Vnesete ja vrednosta na ednata strana");
	str1=tastatura.nextDouble();
	System.out.println("Vnesete ja vrednosta za drugata strana");
	str2=tastatura.nextDouble();
	povrsina=str1*str2;
	perimetar=2*str1+2*str2;
	System.out.println();
	System.out.println("Perietarot e :"+perimetar);
	//System.out.printl(Plastinata e:"+povrsina);
	System.out.println("plostinata e:"+povrsina);
	//System.out.println(povrsina);

}

}
