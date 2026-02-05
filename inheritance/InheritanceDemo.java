
package basics.inheritance;

 class Person {
    String name;
    int age;

    void printPersonInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
    int marks;

    void setMarks(int marks) {
        this.marks = marks;
    }

    void printStudentInfo() {
        printPersonInfo();
        System.out.println("Marks: " + marks);
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {

        Student s = new Student();
        s.name = "KD";
        s.age = 22;
        s.setMarks(85);
        s.printStudentInfo();

        System.out.println();

        Person p = new Person();
        p.name = "DFGNM";
        p.age = 18;
        p.printPersonInfo();
    }
}