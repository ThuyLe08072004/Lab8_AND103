package fpoly.thuyltph35992.lab8.Serives;


import java.util.ArrayList;

import fpoly.thuyltph35992.lab8.Models.District;
import fpoly.thuyltph35992.lab8.Models.DistrictRequest;
import fpoly.thuyltph35992.lab8.Models.Province;
import fpoly.thuyltph35992.lab8.Models.ResponseGHN;
import fpoly.thuyltph35992.lab8.Models.Ward;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface GHNServices {
    public static String GHN_URL = "https://dev-online-gateway.ghn.vn/";

    @GET("/shiip/public-api/master-data/province")
    Call<ResponseGHN<ArrayList<Province>>> getListProvince();

    @POST("/shiip/public-api/master-data/district")
    Call<ResponseGHN<ArrayList<District>>> getListDistrict(@Body DistrictRequest districtRequest);

    @GET("/shiip/public-api/master-data/ward")
    Call<ResponseGHN<ArrayList<Ward>>> getListWard(@Query("district_id") int district_id);
}
