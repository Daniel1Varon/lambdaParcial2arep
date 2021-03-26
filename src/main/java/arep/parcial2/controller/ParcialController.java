package arep.parcial2.controller;

import arep.parcial2.service.ParcialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
public class ParcialController {

    @Autowired
    ParcialService parcialService;

    @RequestMapping(value="/sqrt", method = RequestMethod.GET)
    public ResponseEntity<?> getSqrt(@RequestParam(value = "value", defaultValue="0.0") Double value){
        try {
            return new ResponseEntity<>(parcialService.sqrt(value),HttpStatus.ACCEPTED);
        } catch (Exception e) {
            Logger.getLogger(ParcialController.class.getName()).log(Level.SEVERE, null, e);
            return new ResponseEntity<>(e.getMessage(),HttpStatus.PRECONDITION_FAILED);
        }
    }

}
