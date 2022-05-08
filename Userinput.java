import java.util.*;
public class Userinput{
public static void main(String args[])
{
	//system.in ->pre defined object in input stream
	Scanner sc=new Scanner(System.in);
	int getnumber=sc.nextInt();
	char getchar=sc.next().charAt(0);
	sc.nextLine();
	String getstring=sc.nextLine();//does'nt scan getstring because it takes enter as input so we are giving sc.nextLine() prior getting string input
	float flt=sc.nextFloat();
	double db=sc.nextDouble();	
	System.out.println("Iam getnumber "+getnumber);
	System.out.println("Iam getchar "+getchar);
	System.out.println("Iam getstring "+getstring);
	System.out.println("Iam flt "+flt);
	System.out.println("Iam db "+db);
	
}
}
