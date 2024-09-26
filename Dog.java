public class Dog{
  string name;
  boolean isMale;
  int NoOfPuppies;
  Dog[] listOfPuppies;

  public int addPuppies(Dog x){
     listOfPuppies[NoOfPuppies] = x;
     return NoOfPuppies;
  }

  public void SetName(String names){
     name = names;
  }
  
  public string ShowName(){
    System.out.println("My name is "+ name);
    return name;
  }

  public void NoOfPuppies(int x){
    listOfPuppies = new Dog[x];
  }

  public void bark(){
    System.out.println(name + " Woof! woof!");
  }

  public void ShowNoOfPuppies(){
    System.out.println("Number of puppies " + NoOfPuppies);
  
  }

  public void ShowAllPuppies(){
    for(int i = 0; i < NoOfPuppies; ++i){
      System.out.println(" " + "index:" + i);
      System.out.println("Name:"+ listOfPuppies[i].name);
      System.out.println("Is male:"+ listOfPuppies[i].name);
    }
  }

 }      