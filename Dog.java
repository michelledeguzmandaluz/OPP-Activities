public class Dog {
        String name;
        boolean isMale;
        int numberOfPuppies;
        string[] listofPuppies;

public void setName(String name){
            this.name = name;
        }
    
public String showName(){
            return name;
        }
    
public static void bark(){
            System.out.println("Woof! Woof!");
        }
    
public void setNumberOfPuppies(int numberOfPuppies){
            this.numberOfPuppies = numberOfPuppies;
        }
    
public void setPuppies(String[] puppy) {
            listofPuppies = puppy;
        }
    
public void showPuppies() {
            for (int i=0; i< listofPuppies.length; i++){
                System.out.println("Puppie's Name:" + listofPuppies.length);
        }
    }
}       