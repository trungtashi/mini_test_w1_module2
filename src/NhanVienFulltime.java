public class NhanVienFulltime extends NhanVien {
    public float hardSalary;
    public float salaryBonus;
    public float wage;
    public NhanVienFulltime(){}
    public NhanVienFulltime(int maNv, String name, int age,int phone, String email,float hardSalary, float salaryBonus, float wage){
        super(maNv,name,age,phone,email);
        this.hardSalary = hardSalary;
        this.salaryBonus = salaryBonus;
        this.wage = wage;
    }

    public float getHardSalary() {
        return hardSalary;
    }

    public void setHardSalary(float hardSalary) {
        this.hardSalary = hardSalary;
    }

    public float getSalaryBonus() {
        return salaryBonus;
    }

    public void setSalaryBonus(float salaryBonus) {
        this.salaryBonus = salaryBonus;
    }

    public float getWage() {
        return wage;
    }

    public void setWage(float wage) {
        this.wage = wage;
    }

    @Override
    public String toString() {
        return "NhanVienFulltime{" +
                "hardSalary=" + hardSalary +
                ", salaryBonus=" + salaryBonus +
                ", wage=" + wage +
                '}';
    }
}
