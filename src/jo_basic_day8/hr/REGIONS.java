package jo_basic_day8.hr;

public class REGIONS {

    private int refion_id;
    private String refion_name;

    public REGIONS(int refion_id, String refion_name) {
        this.refion_id = refion_id;
        this.refion_name = refion_name;
    }

    public int getRefion_id() {
        return refion_id;
    }

    public void setRefion_id(int refion_id) {
        this.refion_id = refion_id;
    }

    public String getRefion_name() {
        return refion_name;
    }

    public void setRefion_name(String refion_name) {
        this.refion_name = refion_name;
    }

    public REGIONS() {
    }
}
