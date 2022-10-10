

package Practical12;

class Bank {

    private String name;

    Bank(String name) {

        this.name = name;
    }

    public String getBankName() {
        return this.name;
    }
}

class Employee {
    private String name;

    Employee(String name) {
        this.name = name;
    }

    public String getEmployeeName() {
        return this.name;
    }
}

public class Association {
    public static void main(String[] args) {
        Bank bank = new Bank("HDFC");
        Employee emp = new Employee("Akshit Joshi");
        System.out.println(emp.getEmployeeName() + " is employee of " + bank.getBankName());
        System.out.println("21CE047-Akshit Joshi");
    }
}