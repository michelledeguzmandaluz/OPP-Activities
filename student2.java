public class student2 extends inheritance2{
    protected String name;
    protected String address;
    protected int year;
    protected String program;

    public student2(String name, String address, Integer year, String program) {
        this.name = name;
        this.address = address;
        this.year = year;
        this.program = program;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setYear(int year){
        this.year = year;
    }

    public void setProgram(String program){
        this.program = program;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getYear(){
        return year;
    }

    public String getProgram(){
        return program;
    }

    public String toString(){
        return "Hello I am" + name + "and" + "i live in" + address + ". I am " + year + "program"+ ".";
}

}