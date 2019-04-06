import java.util.Scanner;
class Scs{
void teaching(){
System.out.println("parent1 process1 executed");
System.out.println("EVERYONE IN THE COLLEGE TEACH ATLEAST THREE SUBJECTS");
System.out.println("The Teachers allocated in scs are: "+"\n"+ "name : " +"\n"+ "phone no: "+"\n"+ "sapid :"+"\n"+"Teaches :");
}
void branch(){
System.out.println("parent1 process2 executed");
System.out.println("The branches inside scs department are"+"\n"+"1. Systematics"+"\n"+"2. Cybernetics"+"\n"+"3. Virtualization");
}
}

class Cybernetics extends Scs{
void teach(){
System.out.println("child1 process1 executed");
System.out.println("The teachers in cybernetics department are: "+"\n"+ "name: ");
}
void branch2(){
System.out.println("child1 process2 executed");
System.out.println("the faculty teaches Java is :"+"\n"+ "name :");
System.out.println("the faculty teaches Oss is :"+"\n"+ "name :");
System.out.println("the faculty teaches Devops is :"+"\n"+ "name :");
}
}
class Systematics extends Scs{

void teach1(){
System.out.println("child2 process1 executed");
System.out.println("The teachers in systematics department are: "+"\n"+ "name: ");
}
void branch3(){
System.out.println("child2 process2 executed");
System.out.println("the faculty teaches Ads is :"+"\n"+ "name :");
System.out.println("the faculty teaches Csf is :"+"\n"+ "name :");
System.out.println("the faculty teaches Bao is :"+"\n"+ "name :");
}
}
class Virtualization extends Scs{
void teach2(){
System.out.println("child3 process1 executed");
System.out.println("The teachers in virtualization department are: "+"\n"+ "name: ");
}
void branch4(){
System.out.println("child3 process2 executed");
System.out.println("the faculty teaches Cloud is :"+"\n"+ "name :");
System.out.println("the faculty teaches gaming is :"+"\n"+ "name :");
System.out.println("the faculty teaches ecom is :"+"\n"+ "name :");
}
}


public class Final1{
public static void main(String[] args){
Cybernetics obj = new Cybernetics();
Systematics obj2 = new Systematics();
Virtualization obj3 =new Virtualization();
System.out.println("To display teachers in scs press1"+ "\n" +"press 2 for teachers of cyber"+"\n"+"press 3 for systematics"+"\n"+"4 for virtual");
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
switch(a)
{
case 1:{
obj.teaching();
obj.branch();
}
break;
case 2: {
obj.teach();
obj.branch2();
}
break;
case 3:
{
obj2.teach1();
obj2.branch3();
}
break;
case 4:
{
obj3.teach2();
obj3.branch4();
}
break;
default:
{
System.out.println("press 1 to 4");
}
}
}
}

