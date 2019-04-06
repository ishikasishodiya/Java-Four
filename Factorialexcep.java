import java.util.Scanner;
class Factorialexcep{
static int fact(int n)
{
if(n==1){
return 1;
}
int f;
f = n*fact(n-1);
return f;
}
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int num = sc.nextInt();
try{
if(num==0)
throw new Exception("thrown");
Factorialexcep obj = new Factorialexcep();
}
catch(Exception e){
System.out.println("n cannot be 0");
}
int result =  fact(num);
System.out.println(result);

}

}

