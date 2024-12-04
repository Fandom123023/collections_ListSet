import java.util.Objects;

public class Employee {
    private String fullName;
    private int salery;
    private int department;

    public Employee(String fullName, int salery, int department) {
        this.fullName = fullName;
        this.salery = salery;
        this.department = department;
    }

    public String getFullName() {return fullName;
    }

    public int getSalery() {return salery;
    }

    public int getDepartment() {return department;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return salery == employee.salery && department == employee.department && Objects.equals(fullName, employee.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, salery, department);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fullName='" + fullName + '\'' +
                ", salery=" + salery +
                ", department=" + department +
                '}';
    }
}
