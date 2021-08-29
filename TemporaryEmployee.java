public class TemporaryEmployee extends Employee {
    private long hrs;
    public long getHrs() {
        return hrs;
    }

    public void setHrs(long hrs) {
        this.hrs = hrs;
    }

    public void getPer_hrs_sal() {
        this.setSalary(per_hrs_sal * hrs);
    }

    public void setPer_hrs_sal(long per_hrs_sal) {
        this.per_hrs_sal = per_hrs_sal;
    }

    private long per_hrs_sal;

    public void getempSalary(){
        this.setSalary(hrs*per_hrs_sal);
    }

    public TemporaryEmployee(int empId, String empName, String city , long per_hrs_sal , long hrs) {
        super(empId, empName, city);
        this.per_hrs_sal = per_hrs_sal;
        this.hrs = hrs;
        //TODO Auto-generated constructor stub
    }
    
}
