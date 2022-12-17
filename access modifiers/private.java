class Fruits{
    private String name;

    public String getName(){
        return this.name;
     }
    public void setName(String name){
       this.name = name;
     }
}

class Main {
    public static void main(String[] args){

        Fruits obj = new Fruits();
        obj.setName("Apple");
        System.out.println(obj.getName());
    }
}

//Output- Apple