package employeemanager;

public class EmployeesFulltime extends Employees {
    public long  hardSalary;
    public long  salaryBonus;
    public long  wage;
    public EmployeesFulltime(){}
    public EmployeesFulltime(String maNv, String name, int age,String phone, String email,long  salaryBonus,long  hardSalary, long  wage){
        super(maNv,name,age,phone,email);
        this.hardSalary = hardSalary;
        this.salaryBonus = salaryBonus;
        this.wage = wage;
    }

    public float getHardSalary() {
        return hardSalary;
    }

    public void setHardSalary(long  hardSalary) {
        this.hardSalary = hardSalary;
    }

    public float getSalaryBonus() {
        return salaryBonus;
    }

    public void setSalaryBonus(long  salaryBonus) {
        this.salaryBonus = salaryBonus;
    }

    public long  getWage() {
        return wage;
    }

    public void setWage(long  wage) {
        this.wage = wage;
    }

    @Override
    long getSalary() {
        long salary = wage + (salaryBonus - hardSalary);
        return salary;
    }
}
