class Primesum{
public static void main(String args[]){
int count=0;
int sum=0;
int i=2;
int c=0;
while(c!=100)
{
for(int j=1;j<=i;j++)
{
if(i%j==0)
count=count+1;
}
if(count==2)
{
sum=sum+i;
c++;
}
i++;
count=0;
}
System.out.println("Sum of first 100 prime numbers is : "+sum);
}
}