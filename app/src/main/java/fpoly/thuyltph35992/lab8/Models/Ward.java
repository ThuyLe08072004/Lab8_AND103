package fpoly.thuyltph35992.lab8.Models;

public class Ward {
    private String WardCode;
    private int DistrictID;
    private String WardName;

    public Ward() {
    }

    public Ward(String wardCode, int districtID, String wardName) {
        WardCode = wardCode;
        DistrictID = districtID;
        WardName = wardName;
    }

    public String getWardCode() {
        return WardCode;
    }

    public void setWardCode(String wardCode) {
        WardCode = wardCode;
    }

    public int getDistrictID() {
        return DistrictID;
    }

    public void setDistrictID(int districtID) {
        DistrictID = districtID;
    }

    public String getWardName() {
        return WardName;
    }

    public void setWardName(String wardName) {
        WardName = wardName;
    }
}
