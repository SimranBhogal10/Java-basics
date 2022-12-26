class Flower{
    public String name;
    public void display(){
     System.out.println(name);
    }
}

class FlowerMain {
    public static void main(String[] args){

        Flower obj = new Flower();
        obj.name = "Rose";
        obj.display();
    }
}