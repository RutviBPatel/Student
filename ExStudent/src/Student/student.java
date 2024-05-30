package Student;

public class student {
	String name;

    student() {
        this.name = "Unknown";
    }

    student(String name) {
        this.name = name;
    }

    void display() {
        System.out.println(this.name);
    }

    public static void main(String[] args) {
        student ob1 = new student("Rutvi");
        student ob2 = new student("Hina");
        student ob3 = new student();

        ob1.display();  
        ob2.display();  
        ob3.display();  
    }
}
