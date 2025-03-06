import java.util.*;
class string
{
public static void main(String args[])
{
String txt;
Scanner sc=new Scanner(System.in);
System.out.print("Enter a string:");
txt=sc.nextLine();
System.out.print("\nConverting string to uppercase:");
System.out.println(txt.toUpperCase());
System.out.print("\nConverting string to lowercase:");
System.out.println(txt.toLowerCase());
System.out.print("\nLength of the string:");
System.out.println(txt.length());
System.out.print("\nReplace the characters in the string :");
System.out.println(txt.replace('y', 'i'));
String txt1;
System.out.print("\nSubstring of the given string:");
System.out.println(txt.substring(0,5));
System.out.print("\nCheck the string is empty:");
System.out.println(txt.isEmpty());
System.out.print("\nEnter a second string to concat:");
txt1=sc.nextLine();
System.out.println(txt.concat(txt1));
}
}


