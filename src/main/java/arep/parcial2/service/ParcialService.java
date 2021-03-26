package arep.parcial2.service;

import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class ParcialService {
    public java.util.Map<String, Object> sqrt(double value){
        JSONObject json=new JSONObject();
        json.put("operation","sqrt");
        json.put("input",value);
        if(value<0) json.put("output", "Error");
        else json.put("output", Math.sqrt(value));
        return json.toMap();
    }
}
