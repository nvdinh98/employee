package Employee;

public class PartTimeEmployee extends Employee {
    private  int hour;

    public PartTimeEmployee() {
    }

    public PartTimeEmployee(int hour) {
        this.hour = hour;
    }

    public PartTimeEmployee(String code, String name, int age, String phone, String mail, int hour) {
        super(code, name, age, phone, mail);
        this.hour = hour;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    @Override
    public double getSalary() {
        return hour*100;
    }

    @Override
    public String toString() {
        return "PartTimeEmployee{" +
                super.toString() +

                "hour=" + hour +
                ", salary = " + getSalary() +
                '}';
    }
}
