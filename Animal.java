//~ Create a class Animal having three data members eats, noOfLegs, isVeg.Based on requirement create setter-getter methods for each member. Class Cat extends Animal, this class also contains data member skin colour, make use of super keyword and print all the four values.

class Animal {
    private String eats;
    private int noOfLegs;
    private boolean isVeg;

    public Animal(String eats, int noOfLegs, boolean isVeg) {
        this.eats = eats;
        this.noOfLegs = noOfLegs;
        this.isVeg = isVeg;
    }

    public String getEats() {
        return eats;
    }

    public void setEats(String eats) {
        this.eats = eats;
    }

    public int getNoOfLegs() {
        return noOfLegs;
    }

    public void setNoOfLegs(int noOfLegs) {
        this.noOfLegs = noOfLegs;
    }

    public boolean getIsVeg() {
        return isVeg;
    }

    public void setIsVeg(boolean isVeg) {
        this.isVeg = isVeg;
    }
}

class Cat extends Animal {
    private String skinColour;

    public Cat(String eats, int noOfLegs, boolean isVeg, String skinColour) {
        super(eats, noOfLegs, isVeg);
        this.skinColour = skinColour;
    }

    public String getSkinColour() {
        return skinColour;
    }

    public void setSkinColour(String skinColour) {
        this.skinColour = skinColour;
    }
}

public class chit23 {
    public static void main(String[] args) {
        Cat cat = new Cat("meat", 4, false, "black");
        cat.setEats("fish");
        cat.setNoOfLegs(4);
        cat.setIsVeg(false);
        cat.setSkinColour("white");

        System.out.println("The cat eats: " + cat.getEats());
        System.out.println("The cat has: " + cat.getNoOfLegs() + " legs");
        System.out.println("Is the cat vegetarian? " + cat.getIsVeg());
        System.out.println("The cat has a skin colour of: " + cat.getSkinColour());

    }

}