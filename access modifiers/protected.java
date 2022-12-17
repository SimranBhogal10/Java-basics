class Fruits{
    protected void display(){
     System.out.println("Hello, this is a fruit");
    }
}

class Apple extends Fruits{
    public static void main(String[] args){

        Fruits obj = new Fruits();
        obj.display();
    }
}
