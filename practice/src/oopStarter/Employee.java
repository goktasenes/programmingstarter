package oopStarter;

public class Employee {
    int salary, workHours, hireYear;
    String name;

    Employee(int salary, int workHours, int hireYear, String name) {
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
        this.name = name;
    }

    public double tax() {
        if (this.salary > 1000) {
            return this.salary * 0.03;
        } else {
            return 0.0;
        }
    }

    public double bonus() {
        int extraHours = this.workHours - 40;
        return extraHours * 30;
    }

    public double raiseSalary() {
        if (2023 - this.hireYear < 10) {
            return this.salary * 0.05;
        } else if (2023 - this.hireYear < 20) {
            return this.salary * 0.10;
        } else {
            return this.salary * 0.15;
        }
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", salary=" + salary + ", workHours=" + workHours + ", hireYear=" + hireYear
                + ", tax=" + tax() + ", bonus=" + bonus() + ", raise=" + raiseSalary() + "]";
    }


}
