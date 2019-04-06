class Animal{
private int lions = 18;
private int man =100;
void getlions(){
this.lions;
}
void getman(){
this.man;
}
class New{
public static void main(String[] args)
{
Animal obj = new Animal();
int sum = obj.getlions()+obj.getman();

System.out.println(sum);
}
}