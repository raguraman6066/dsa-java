package HashMap;

public class Employee {
    int empId;

    public Employee(int empId) {
        this.empId = empId;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + empId;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Employee other = (Employee) obj;
        if (empId != other.empId)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Employee [empId=" + empId + "]";
    }

}
