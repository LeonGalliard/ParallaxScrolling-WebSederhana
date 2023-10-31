class Animal {
    public void makeSound() {
      System.out.println("The animal makes a sound");
    }
  }
  
  class Dog extends Animal {
    public void makeSound() {
      System.out.println("The dog barks");
    }
  }
  
  class Cat extends Animal {
    public void makeSound() {
      System.out.println("The cat meows");
    }
  }
  
  public class Main {
    public static void main(String[] args) {
      Animal myAnimal = new Animal();
      Animal myDog = new Dog();
      Animal myCat = new Cat();
  
      myAnimal.makeSound(); // Output: The animal makes a sound
      myDog.makeSound(); // Output: The dog barks
      myCat.makeSound(); // Output: The cat meows
    }
  }  