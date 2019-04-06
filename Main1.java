import java.util.Scanner;
class Country{
void capital(){
System.out.println("The capital of India is Delhi");
}
}

class State extends Country{
void capital2(){
System.out.println("The capital of the state UP is Lucknow");
}
}

class Sum extends State{
void sum1(){
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();
int res =a +b;
System.out.println("the sum is "+res);
}
}
public class Main1{
public static void main(String args[])
{
Sum obj = new Sum();
obj.sum1();
obj.capital();
obj.capital2();
}
}