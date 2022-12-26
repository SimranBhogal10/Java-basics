class Vehicle {
  private String name;

  // constructor
  Vehicle() {
    System.out.println("No-args constructor Called:");
    name = "Thar";
  }
  Vehicle(String name) {
      System.out.println("Parameterized constructor called:");
      this.name=name;
  }

  public static void main(String[] args) {

    Vehicle obj = new Vehicle();
    System.out.println("The vehicle is " + obj.name);
    Vehicle obj1= new Vehicle("BMW");
    System.out.println("The vehicle is " + obj1.name);
  }
}