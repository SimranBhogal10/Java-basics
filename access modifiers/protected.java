class Fruit{
    protected void display(){
     System.out.println("Hello, this is a fruit");
    }
}
//import Fruits;
class Apples extends Fruit{
    public static void main(String[] args){

        Fruit obj = new Fruit();
        obj.display();
    }
}
