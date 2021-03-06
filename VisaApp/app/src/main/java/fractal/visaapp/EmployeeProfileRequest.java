package fractal.visaapp;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;
public class EmployeeProfileRequest  extends StringRequest  {

    private static final String REGISTER_REQUEST_URL = "http://server1.miteshshah.com/api/get/employeeDetails";

    private Map<String, String> params;

    public EmployeeProfileRequest(String emp_code, Response.Listener<String> listener, Response.ErrorListener errorListener) {
        super(Method.GET, REGISTER_REQUEST_URL+"?empCode="+emp_code, listener, errorListener);
    }

    @Override
    public Map<String, String> getParams() {
        return params;
    }

}
