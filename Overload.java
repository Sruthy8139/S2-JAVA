import java.util.*;
class Shapes
{
void area_rectangle(int l,int b)
{
int area=l*b;
System.out.println("Area of rectangle is : "+area);
}
void area_circle(int r)
{
double area=(3.14*r*r);
System.out.println("Area of circle is : "+area);
}
void area_square(int side)
{
double area=side*side;
System.out.println("Area of square is : "+area);
}
}
class Overload
{
public static void main(String args[])
{
        Scanner sc=new Scanner(System.in);
        System.out.println("enter radius of circle : ");
        int r=sc.nextInt();
        System.out.println("enter side of square : ");
        int side=sc.nextInt();
        System.out.println("enter length  : ");
        int l=sc.nextInt();
        System.out.println("enter breadth : ");
        int b=sc.nextInt();
Shapes obj=new Shapes();
        obj.area_circle(r);
        obj.area_square(side);
        obj.area_rectangle(l,b);
}
}

