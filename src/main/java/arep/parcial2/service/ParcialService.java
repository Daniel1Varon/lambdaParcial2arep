package arep.parcial2.service;


import java.util.HashMap;
import java.util.Map;

public class ParcialService {
    public static Map<String, Object> sqrt(double value){
        Map<String,Object> map= new HashMap<>();
        map.put("operation","sqrt");
        map.put("input",value);
        if(value<0) map.put("output", "Error");
        else map.put("output", Math.sqrt(value));
        return map;
    }
}
