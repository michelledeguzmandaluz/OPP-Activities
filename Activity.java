public class Main {
    public static void main(String args[]) {

    Dog dog = new Dog();
        dog.setName("Harvey");
    System.out.println("Dog name: " + dog.showName());

        dog.setNumPuppies(3);
    System.out.println("Number of puppies: " + dog.showPuppies());

    System.out.println(dog.isMale = true);

    Dog[] puppies = {
        new Dog().setName("Whitey"),
        new Dog().setName("Bubby"),
        new Dog().setName("Brownie"),
    };

        dog.setPuppies(puppies);
        dog.showPuppyNames();
        
    }
}