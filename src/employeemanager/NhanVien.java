package employeemanager;

public abstract class NhanVien implements Interface {
    public String maNv;
    public String name;
    public int age;
    public String phone;
    public String email;

    public NhanVien(){}

    public NhanVien(String maNv, String name, int age, String phone, String email){
        this.maNv = maNv;
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.email = email;

    }

    public String getMaNv() {
        return maNv;
    }

    public void setMaNv(String maNv) {
        this.maNv = maNv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    abstract long getSalary();
    public static double getAverageSalary(NhanVien[] employees){
        double sum =0;
        for (int i = 0; i < employees.length; i++) {
            sum += employees[i].getSalary();
        }
        return sum/ employees.length;
    }
    public static String showEmployeeHasSalaryLessThanAvgSalary(NhanVien[] employees, double avgSalary){
        String str ="Các nhân viên có mức lương thấp hơn trung bình là: ";
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < avgSalary){
                str += (employees[i].getName()) + " ";
            }
        }
        return str;
    }
    public static long sumOfSalaryOfEmployeePartTime(NhanVien[] employees){
        long sumOfEmployeeParttime =0;
        for (int i = 0; i < employees.length; i++){
            if (employees[i] instanceof NhanVienParttime){
                NhanVienParttime employeeParttime = (NhanVienParttime) employees[i];
                sumOfEmployeeParttime+= employeeParttime.getSalary();
            }
        }
        return sumOfEmployeeParttime;
    }

    @Override
    public int compareTo(NhanVien o) {
        if (this.getSalary() < o.getSalary())
            return -1;
        else if (this.getSalary() > o.getSalary())
            return 1;
        else return 0;
    }
}
