class Animal { // Superclass (parent)
    int age;
    public void animalSound() {
      System.out.println("The animal makes a sound");
    }
  }
  
  class Dog extends Animal { // Subclass (child)
    @Override //Method Override
    public void animalSound() {
      System.out.println("The dog says: bow wow");
    }
  }
  
  public class test {
    public static void main(String args[]) {
      Dog myDog = new Dog(); // Create a Dog object
      myDog.age=10;
      myDog.animalSound(); // Call the method on the Dog object
    }
  }
  