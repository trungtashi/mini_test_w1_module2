public class NhanVienParttime extends NhanVien{
    public float timeWork;

    public NhanVienParttime(){}

    public NhanVienParttime(int maNv, String name, int age,int phone, String email, float timeWork){
        super(maNv,name,age,phone,email);
        this.timeWork = timeWork;
    }

    public float getTimeWork() {
        return timeWork;
    }

    public void setTimeWork(float timeWork) {
        this.timeWork = timeWork;
    }

    @Override
    public String toString() {
        return "NhanVienParttime{" +
                "hourWork=" + timeWork +
                '}';
    }
}
