package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@RestController
public class RevController {


     @RequestMapping(value = "/reverse", method = RequestMethod.POST)
    public ResponseEntity<String> revString(@RequestBody String name) {
        String ans="";
        for (int i=0;i<name.length();i++){
            ans=name.charAt(i)+ans;
		}

        return new ResponseEntity<String>(ans,HttpStatus.OK);
    }
}

