public class permanentEmployee extends Employee {
    private long basic;
    public long getBasic() {
        return basic;
    }
    public void setBasic(long basic) {
        this.basic = basic;
    }
    public int getDays() {
        return days;
    }
    public void setDays(int days) {
        this.days = days;
    }
    private int days;

    public void getempSalary(){
        this.setSalary(basic * days);
    }
    public permanentEmployee(int empId, String empName, String city, long basic, int days) {
        super(empId, empName, city);
        this.basic = basic;
        this.days = days;
    }

    
}
