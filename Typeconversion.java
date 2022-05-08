import java.util.*;
public class Typeconversion{
public static void main(String args[])
{
int n;
byte b;
n=10;
//b=n;//will throw error because int is bigger than byte and cannot be typecasted with implicit method
b=(byte)n;
System.out.println(b);
}
}
