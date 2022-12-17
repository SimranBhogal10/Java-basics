interface Fruits{
abstract void eat();}

class Apple implements Fruits{
public void eat(){
System.out.println("Eating apple");
}
}

class Main{
public static void main(String []args){
Apple obj= new Apple();
obj.eat();
}
}