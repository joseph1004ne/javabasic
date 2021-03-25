package jo_basic_day8.hr;

public class COUNTRIES {
    public static void main(String[] args) {

    }



    private String country_id;
    private String country_name;
    private String region_id;    //int

    public COUNTRIES() {
    }

    public String getCountry_id() {
        return country_id;
    }

    public void setCountry_id(String country_id) {
        this.country_id = country_id;
    }

    public String getCountry_name() {
        return country_name;
    }

    public void setCountry_name(String country_name) {
        this.country_name = country_name;
    }

    public String getRegion_id() {
        return region_id;
    }

    public void setRegion_id(String region_id) {
        this.region_id = region_id;
    }

    public COUNTRIES(String country_id, String country_name, String region_id) {
        this.country_id = country_id;
        this.country_name = country_name;
        this.region_id = region_id;
    }

}

