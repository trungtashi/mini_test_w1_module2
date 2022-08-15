public class NhanVien {
    public int maNv;
    public String name;
    public int age;
    public int phone;
    public String email;

    public NhanVien(){}

    public NhanVien(int maNv, String name, int age, int phone, String email){
        this.maNv = maNv;
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.email = email;

    }

    public int getMaNv() {
        return maNv;
    }

    public void setMaNv(int maNv) {
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

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public String toString() {
        return "NhanVien{" +
                "maNv=" + maNv +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                '}';
    }
}
