class Fruits {
  private String name;

  // constructor
  Fruits() {
    System.out.println("No-args constructor Called:");
    name = "Apple";
  }
  Fruits(String name) {
      System.out.println("Parameterized constructor called:");
      this.name=name;
  }

  public static void main(String[] args) {

    Fruits obj = new Fruits();
    System.out.println("The fruit is " + obj.name);
    Fruits obj1= new Fruits("Mango");
    System.out.println("The fruit is " + obj1.name);
  }
}