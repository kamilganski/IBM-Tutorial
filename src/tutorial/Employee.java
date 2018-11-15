package tutorial;

import java.math.BigDecimal;

public class Employee extends Person {

    private String taxpayerIdentificationNumber;
    private String employeeNumber;
    private BigDecimal salary;

    public Employee () {
        super();
    }

    public Employee(String name, int age, int height, int weight, String eyeColor, String gender) {
        super();
    }

    public String getTaxpayerIdentificationNumber() {
        return taxpayerIdentificationNumber;
    }

    public void setTaxpayerIdentificationNumber(String taxpayerIdentificationNumber) {
        this.taxpayerIdentificationNumber = taxpayerIdentificationNumber;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    @Override
    public void printAudit(StringBuilder buffer) {
        buffer.append(toString());
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "taxpayerIdentificationNumber='" + taxpayerIdentificationNumber + '\'' +
                ", employeeNumber='" + employeeNumber + '\'' +
                ", salary=" + salary +
                '}';
    }
}
