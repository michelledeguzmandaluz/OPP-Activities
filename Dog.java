class Dog {
    String name;
    boolean isMale;
    int numPuppies;
    Dog[] listPuppies;

    public Dog setName(String name) {
        this.name = name;
        return this;
    }
    public String showName() {
        return name;
    }
    public void setNumPuppies(int numPuppies) {
        this.numPuppies = numPuppies;
    }
    public int showPuppies() {
        return numPuppies;
    }
    public void setPuppies(Dog[] puppies) {
        this.listPuppies = puppies;
        this.numPuppies = puppies.length;
    }
    public void showPuppyNames() {
        for (Dog puppy : listPuppies) {
            System.out.println("Puppy name: " + puppy.showName());
        }
    }
}