class Fruits{
    public String name;
    public void display(){
     System.out.println(name);
    }
}

class Main {
    public static void main(String[] args){

        Fruits obj = new Fruits();
        obj.name = "Apple";
        obj.display();
    }
}