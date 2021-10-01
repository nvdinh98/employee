package Employee;

public class FullTimeEmployee extends  Employee{
    private double bonus;
    private double fine;
    private double money;

    public FullTimeEmployee(double bonus, double fine, double money) {
        this.bonus = bonus;
        this.fine = fine;
        this.money = money;
    }

    public FullTimeEmployee(String code, String name, int age, String phone, String mail, double bonus, double fine, double money) {
        super(code, name, age, phone, mail);
        this.bonus = bonus;
        this.fine = fine;
        this.money = money;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getFine() {
        return fine;
    }

    public void setFine(double fine) {
        this.fine = fine;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
    public double getSalary(){
        return money + ( bonus - fine);
    }

    @Override
    public String toString() {
        return "FullTimeEmployee{" +
                super.toString() +
                "bonus=" + bonus +
                ", fine=" + fine +
                ", money=" + money  +
                ", salary = " + getSalary() +
                '}';
    }
}
