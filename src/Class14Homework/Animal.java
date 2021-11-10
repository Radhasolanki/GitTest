package Class14Homework;

public class Animal {


    // field and method of the parent class(inheritance)


     String name;

     public void eat() {

         System.out.println("I can eat ");

     }

     }
      // inherit from Animal

     class Dog extends Animal{

    // new method in subclass

         public void display() {
             System.out.println(" My name is" + name);
         }
         }

        class Main {

            public static void main(String[] args) {

                //  create an object of the subclass

                Dog rocky = new Dog();

                // access field of superclass

                rocky.name = "Jex";

                rocky.display();


                // call method of superclass
                // using object of superclass

                rocky.eat();

            }

        }
































