public class Activity{
}

public class Main {
    public static void main(String[] args) {

      Dog edog = new Dog(); 
      edog.SetName("Harvey");
      edog.isMale = true;   
      edog.NoOfPuppies(3); 

      Dog edog1 = new Dog();
      edog1.SetName("Mike");
      edog1.isMale = true;

      Dog edog2 = new Dog();
      edog2.SetName("Ken");
      edog2.isMale = true;

      edog.addPuppies(edog1);
      edog.addPuppies(edog2);

      edog1.ShowName();
      edog2.ShowName();

      edog1.bark();
      edog2.bark();

      edog.ShowNoOfPuppies();
      edog.ShowAllPuppies();
       
  







    }       
    
}