package Main;

public class StudentRequest {

    private float salary;
    private float prevGPA;
    private int programmingInterest;

    public StudentRequest(float salary, float prevGPA, int programmingInterest) {
        this.salary = salary;
        this.prevGPA = prevGPA;
        this.programmingInterest = programmingInterest;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public float getPrevGPA() {
        return prevGPA;
    }

    public void setPrevGPA(float prevGPA) {
        this.prevGPA = prevGPA;
    }

    public int getProgrammingInterest() {
        return programmingInterest;
    }

    public void setProgrammingInterest(int programmingInterest) {
        this.programmingInterest = programmingInterest;
    }

}
