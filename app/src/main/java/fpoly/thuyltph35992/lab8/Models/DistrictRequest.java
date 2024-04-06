package fpoly.thuyltph35992.lab8.Models;

public class DistrictRequest {
    private int province_id;

    public DistrictRequest() {
    }

    public DistrictRequest(int province_id) {
        this.province_id = province_id;
    }

    public int getProvince_id() {
        return province_id;
    }

    public void setProvince_id(int province_id) {
        this.province_id = province_id;
    }
}
