//~There are 3 online courses available Python, Data Structures and Java for an online course. Create an interface OnlineCourse having method getDetails(). Using factory design pattern return the OS specific details.

import java.util.*;

interface OnlineCourse {
    public void getDetails();
}

class PythonCourse implements OnlineCourse {
    public void getDetails() {
        System.out.println("This is a Python online course.");
    }
}

class DataStructuresCourse implements OnlineCourse {
    public void getDetails() {
        System.out.println("This is a Data Structures online course.");
    }
}

class JavaCourse implements OnlineCourse {
    public void getDetails() {
        System.out.println("This is a Java online course.");
    }
}

class OnlineCourseFactory {
    private static final HashMap<String, OnlineCourse> onlineCourses = new HashMap<>();

    public static OnlineCourse getOnlineCourse(String courseType) {
        OnlineCourse onlineCourse = onlineCourses.get(courseType);

        if (onlineCourse == null) {
            switch (courseType) {
                case "Python":
                    onlineCourse = new PythonCourse();
                    break;
                case "Data Structures":
                    onlineCourse = new DataStructuresCourse();
                    break;
                case "Java":
                    onlineCourse = new JavaCourse();
                    break;
            }
            onlineCourses.put(courseType, onlineCourse);
        }
        return onlineCourse;
    }
}

public class chit19 {
    public static void main(String[] args) {
        OnlineCourse javaCourse = OnlineCourseFactory.getOnlineCourse("Java");
        javaCourse.getDetails();
    }
}
