package jo_basic_day8.hr;

public class DEPARTMENTS {

    private String department_id;        //int 다른 클래스에서도 사용주잉므로 둘이 int로 꼭같이
    private String department_name;
    private String manager_id;      //int
    private String iocation_id;     //id 는 번호임

    public DEPARTMENTS() {
    }

    public DEPARTMENTS(String department_id, String department_name, String manager_id, String iocation_id) {
        this.department_id = department_id;
        this.department_name = department_name;
        this.manager_id = manager_id;
        this.iocation_id = iocation_id;
    }

    public String getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(String department_id) {
        this.department_id = department_id;
    }

    public String getDepartment_name() {
        return department_name;
    }

    public void setDepartment_name(String department_name) {
        this.department_name = department_name;
    }

    public String getManager_id() {
        return manager_id;
    }

    public void setManager_id(String manager_id) {
        this.manager_id = manager_id;
    }

    public String getIocation_id() {
        return iocation_id;
    }

    public void setIocation_id(String iocation_id) {
        this.iocation_id = iocation_id;
    }
}
