import java.util.Scanner;
class Triangleexcep{
public static void main(String[] args){

Scanner sc = new Scanner(System.in);
try{

System.out.println("enter the first side of the triangle");
int a = sc.nextInt();

System.out.println("enter the second side of the triangle");
int b = sc.nextInt();

System.out.println("enter the third side of the triangle");
int c = sc.nextInt();
if(c<=a+b)
throw new Exception("thrown");
int s = (a+b+c)/2;
float area =(float)(Math.pow(s*(s-a)*(s-b)*(s-c),1/2));
System.out.println("the AREA is "+area);
}
catch(Exception e){
System.out.println("third side should be greater than the sum of first two"+e);
}
}
}
