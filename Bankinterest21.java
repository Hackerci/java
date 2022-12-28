//~Consider a scenario where Bank is a class that provides functionality to get the rate of interest. However, the rate of interest varies according to banks. For example, SBI, ICICI and AXIS banks could provide 8%, 7%, and 9% rate of interest.

abstract class Bank {
    public abstract float getRateOfInterest();
}

class SBI extends Bank {

    public float getRateOfInterest() {
        return 8.0f;
    }
}

class ICICI extends Bank {

    public float getRateOfInterest() {
        return 7.0f;
    }
}

class AXIS extends Bank {

    public float getRateOfInterest() {
        return 9.0f;
    }
}

public class chit21 {
    public static void main(String[] args) {

        Bank sbi = new SBI();
        System.out.println("SBI: " + sbi.getRateOfInterest());

        Bank icici = new ICICI();
        System.out.println("ICICI: " + icici.getRateOfInterest());

        Bank axis = new AXIS();
        System.out.println("AXIS: " + axis.getRateOfInterest());

    }
}
