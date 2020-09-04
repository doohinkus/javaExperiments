public class Chick {
  private String name = "overWriteMe";
  { System.out.println("Setting field from instance initializer" + " value of default name " + name); }
  // constructor
  public Chick(){
    name = "New Name";
    System.out.println("Setting constructor" + " " + " value of name " + name);
  }
  { System.out.println("***Instance name: " + name); }
  public static void main (String [] Args){
    Chick chick = new Chick();
    System.out.println("Instance name: " + chick.name);
    chick.name = "Even newer name";
    
    System.out.println("Instance name: " + chick.name);
  }
}