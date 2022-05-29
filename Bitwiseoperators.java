import java.util.*;
public class Bitwiseoperators{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int a,b,c;
	a=sc.nextInt();
	b=sc.nextInt();
	c=sc.nextInt();
	System.out.println(a & b);
	System.out.println(a | b);
	System.out.println(a ^ c);
	System.out.println(~c);
}
}
/*Representaion of negative numbers in binary - convert the number to binary and then compliment it 
and then add 1 to it
*/
