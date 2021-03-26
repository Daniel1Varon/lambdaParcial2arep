package arep.parcial2.service;

import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class ParcialService {
    public java.util.Map<String, Object> acos(double value){
        JSONObject json=new JSONObject();
        json.put("operation","acos");
        json.put("input",value);
        Double res=Math.acos(value);
        if(res.isNaN()) json.put("output", "Error");
        else json.put("output", res);
        return json.toMap();
    }
}
