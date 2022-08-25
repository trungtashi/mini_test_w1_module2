package employeemanager;

public class TestEmployees {
    public static void main(String[] args) {
        Employees Ronaldo = new EmployeesFulltime("1K42TS","Ronaldo",23,"05645648945","adsf@gmail.com",1000000,0,5000000);
        Employees Messi = new EmployeesFulltime("2BKHN","Messi",23,"515616","sdfgsd@gmail.com",500000,500000,5000000);
        Employees Kaka = new EmployeesFulltime("3DGDSD","Kaka",23,"054985621","yujrt@gmail.com",1500000,200000,5000000);
        Employees Neymar = new EmployeesFulltime("6GHRD","Neymar",21,"54456541253","sfg@gmail.com",1500000,0,3000000);
        Employees Thor =  new EmployeesParttime("HHJD5S","Thor",28,"151535153","mdg@gmail.com",30);
        Employees Captian =  new EmployeesParttime("GDFD465h","Captian",28,"0251554334","rgwsh@gmail.com",40);
        Employees Hulk =  new EmployeesParttime("8CGM322I1","Hulk",22,"05614654","srge@gmail.com",25);
        Employees Spiderman =  new EmployeesParttime("9CHFĐRFC","Spiderman",24,"054154","sdggshrfghsf@gmail.com",50);
        Employees[] employees = {Ronaldo,Messi,Kaka,Neymar,Thor,Captian,Hulk,Spiderman};
//        Lương trung bình
        double avgSalary = Employees.getAverageSalary(employees);
        System.out.println("Lương trung bình của tất cả nhân viên là: "+ avgSalary );
//        Lương thấp hơn trung bình
        System.out.println(Employees.showEmployeeHasSalaryLessThanAvgSalary(employees,avgSalary));
////        Lương fulltime tăng dần
//        Arrays.sort(employees);

        for (int i = 0; i < employees.length; i++) {
            System.out.println("Sắp xếp thứ tự lương tăng dần của nhân viên  là: " +  (7 - i) +"  " + employees[i].getName() +" " + employees[i].getSalary());
        }
//        Lương nv parttime
        System.out.println("Lương của nhân viên parttime là: " + Employees.sumOfSalaryOfEmployeePartTime(employees));
    }
}
