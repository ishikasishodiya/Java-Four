abstract class Bike{
abstract void run();
}
class Honda extends Bike{
public void run()
{
System.out.println("run safely");
}
public static void main(String[] args)
{
Bike obj = new Honda();
obj.run();
}
}