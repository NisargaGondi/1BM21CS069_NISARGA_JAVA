import java.util.*;
class books {
Scanner sc = new Scanner(System.in);
String name,author;
int price,num_pages;
String sname;
String susn;
books()
{}

books(String name,String author,int price,int num_pages) 
{
this.name = name;
this.author = author;
this.price = price;
this.num_pages = num_pages;
}

void getStudentDetails() 
	{   
		Scanner s = new Scanner(System.in);
		//subject = new Subject[9];
		System.out.print("Enter your Name: ");
		sname = s.next();
		System.out.print("Enter your USN: ");
		susn = s.next();
	}
	
void getdata() 
{
System.out.println("Enter the name of the book");
name = sc.nextLine();
System.out.println("Enter the name of the author");
author = sc.nextLine();
System.out.println("Enter the price");
price = sc.nextInt();
System.out.println("Enter the number of pages");
num_pages = sc.nextInt();
}
public String toString() 
{
return ("Name : "+name+"\nAuthor : "+author+"\nPrice : "+price+"\nNumber of pages : "+num_pages);
}
}

class Main 
{
public static void main(String args[]) 
{ 
    books s2 = new books();
    int i,n;
 Scanner s1 = new Scanner(System.in);
 System.out.print("Enter number of students: ");
		n = s1.nextInt();
		for(i=0;i<n;i++)
		{
		s2.getStudentDetails();
		
Scanner sc = new Scanner(System.in);
/*books b1 = new books("Mehta","neil",56,154);
System.out.println("Constructor values : \n"+b1);*/
System.out.println("Enter the number of books");
int m = sc.nextInt();
books s[] = new books[n];
for(int j = 0;j<m;j++) 
{
s[j] = new books();
System.out.println("Enter the details of "+(j+1)+"book");
s[j].getdata();
}
}
for(i=0;i<n;i++)
{
System.out.println("Name: "+s2.sname);
System.out.println("USN: "+s2.susn);
for(int k = 0;k<m;k++) 
{
System.out.println("\nDetails of the book"+(k+1));
System.out.println(s[k]);
}
}
}

}
