import java.util.Scanner;
class Factors extends Thread{
public void run(){
Scanner sc = new Scanner(System.in);
System.out.println("enter the number");
int n = sc.nextInt();

for(int i=1;i<=n;i++)
{
for(int j=1;j<=n;j++)
{
if(n== i*j &&  )
{
System.out.println(Thread.currentThread().getId()+"enter the number"+"the factor is "+i);
}
}
}}}
public class Factorsmain{
public static void main(String[] args){
Factors f = new Factors();
f.start();
Factors f1 = new Factors();
f1.start();
Factors f2 = new Factors();
f2.start();
}
}



//problem- output mai ek he thread ek time par run ho raha hai
//ven though three start() method are called.