class Person{
    private String name;

    public String getName(){
        return this.name;
     }
    public void setName(String name){
       this.name = name;
     }
}

class PersonMain {
    public static void main(String[] args){

        Person obj = new Person();
        obj.setName("Simran");
        System.out.println(obj.getName());
    }
}

//Output- Apple