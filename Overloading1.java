class Overloading{
int add(int a, int b){
return (a+b);
}
int add(int a, int b, int c)
{
return(a+b+c);
}
float add(float a, float b){
x=b;
return a/b;
}
public static void main(String[] args){
float x=0;
Overloading obj = new Overloading();
System.out.println(obj.add(4,5)+" the first sum");
System.out.println(obj.add(2,3,6)+" the second sum");
try{

if(b==0)
throw new Exception ("Thrown");
System.out.println(obj.add(2,1)+" the third code");
}
catch(Exception e){
System.out.print("b cannot be 0");
}
}
}