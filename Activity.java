public class Activity{

public static void main(String[] args) {
    Dog fatherDog = new Dog();
    fatherDog.setName("Aron");
    fatherDog.bark();
    
    Dog puppy1 = new Dog();
    puppy1.setName("Manuel");
    
    Dog puppy2 = new Dog();
    puppy2.setName("Elise");

    fatherDog.addPuppy(puppy1);
    fatherDog.addPuppy(puppy2);

    fatherDog.showPuppies();
    }
}
