//~Create a class Android, iOS and BlackBerry which implements interface OS having method void spec(). Using factory design pattern create a class which will create instances of above classes and based on nature of OS respective class method should get called.

// Interface for operating system
interface OS {
    void spec();
}

// Class for Android operating system
class Android implements OS {
    public void spec() {
        System.out.println("I am an Android operating system.");
    }
}

// Class for iOS operating system
class iOS implements OS {
    public void spec() {
        System.out.println("I am an iOS operating system.");
    }
}

// Class for BlackBerry operating system
class BlackBerry implements OS {

    public void spec() {
        System.out.println("I am a BlackBerry operating system.");
    }
}

// Factory class for creating instances of operating system classes
class OSFactory {
    static OS getInstance(String osType) {
        if (osType.equals("Android")) {
            return new Android();
        } else if (osType.equals("iOS")) {
            return new iOS();
        } else if (osType.equals("BlackBerry")) {
            return new BlackBerry();
        } else {
            return null;
        }
    }
}

public class chit18 {
    public static void main(String[] args) {
        OS android = OSFactory.getInstance("Android");
        android.spec(); // Output: "I am an Android operating system."

        OS iOS = OSFactory.getInstance("iOS");
        iOS.spec(); // Output: "I am an iOS operating system."

        OS blackberry = OSFactory.getInstance("BlackBerry");
        blackberry.spec(); // Output: "I am a BlackBerry operating system."

    }
}
