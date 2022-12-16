import java.util.Scanner;
abstract class shape
{
int x,y;

abstract void printArea();
void set()
{Scanner ss=new Scanner(System.in);
System.out.println("enter the height and breadth:");
x=ss.nextInt();
y=ss.nextInt();
}
}
class rectangle extends shape
{void printArea()

{
    System.out.println("the area of rectangle is:"+(x*y));}}


class triangle extends shape
{void printArea()

{

System.out.println("the area of triangle is:"+(x*y*0.5));}}


class circle extends shape
{void printArea()
{Scanner ss=new Scanner(System.in);
System.out.println("enter the radius:");
x=ss.nextInt();
System.out.println("the area of circle is:"+(3.14*x*x));
}}


class Main
{
public static void main(String xx[])
{
System.out.println("For Rectangle");
rectangle rec=new rectangle();
rec.set();
rec.printArea();
System.out.println("For Triangle");
triangle tri=new triangle();
tri.set();
tri.printArea();
System.out.println("For Circle");
circle cir=new circle();
cir.printArea();

}
}
