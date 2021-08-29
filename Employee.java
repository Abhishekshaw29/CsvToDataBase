public abstract class Employee{
    private  int empId;
    private String empName;
    private String City;
    private Long Salary;


    public Employee(int empId, String empName, String city) {
        this.empId = empId;
        this.empName = empName;
        City = city;
    }
    public int getEmpId() {
        return empId;
    }
    public void setEmpId(int empId) {
        this.empId = empId;
    }
    public String getEmpName() {
        return empName;
    }
    public void setEmpName(String empName) {
        this.empName = empName;
    }
    public String getCity() {
        return City;
    }
    public void setCity(String city) {
        City = city;
    }
    public Long getSalary() {
        return Salary;
    }
    public void setSalary(Long salary) {
        Salary = salary;
    }

    public abstract void getempSalary();
}
