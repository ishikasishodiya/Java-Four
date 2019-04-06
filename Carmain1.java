
package p1;
class Car{
private String model;
private String colour;
private int price;

public String getModel(){
return ("the model is "+model+"the color is"+colour);

}
public int getPrice(){
return price;
}
public void setModel(String Model, String Colour){
this.model=Model;
this.colour=Colour;
}
public void setPrice(int Price){
this.price= Price;
}
}
 class Carmain{
public static void main(String[] args){
Car obj= new Car();
obj.setModel("honda","white");
obj.setPrice(19873);
System.out.println(obj.getModel());

System.out.println(obj.getPrice());
}
}


