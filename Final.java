 class Override{
public void add(){
int res =4+5;
System.out.println("parent is "+res);
}
}
class Override2 extends Override
{
public void add()
{

int res =9+9;
System.out.println("child is "+res);
}
}
public class Final{
public static void main(String[] args)
{
Override obj = new Override();
obj.add();

Override obj2 = new Override2();
obj2.add();
}
}