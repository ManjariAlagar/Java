import java.util.*;
public class Shiftoperators{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int a;
	a=4;
	//<< left shift value inceases 
	//a<<30 will give 0 as value
	//a>> right shift // value decrease, will fill rightmost to 1
	//a>>>1 fill right most to 1;
	System.out.println(a<<1);
	System.out.println(a>>1);
	System.out.println(a>>>1);
	
}
}