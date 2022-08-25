package employeemanager;


public class EmployeesParttime extends Employees {
    public long timeWork;

    public EmployeesParttime(){}

    public EmployeesParttime(String maNv, String name, int age,String phone, String email, long timeWork){
        super(maNv,name,age,phone,email);
        this.timeWork = timeWork;
    }

    public long getTimeWork() {
        return timeWork;
    }

    public void setTimeWork(long timeWork) {
        this.timeWork = timeWork;
    }

    @Override
    long getSalary() {
        long salary = timeWork * 100000;
        return salary;
    }
}
