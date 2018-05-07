package pan.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pan.main.properties.GirlProperties;

/**
 * @author pjp
 * @date 2018年4月23日18:40:12
 */
@RestController
@RequestMapping("/demo")
public class DemoController {
    @Autowired
    private GirlProperties girlProperties;

//    @GetMapping(value = "init")
    @PostMapping(value = "init")
    public String init(@RequestParam(value = "id",required = false,defaultValue = "0") Integer id){
//        return girlProperties.getCupSize();
        return "id:"+id;
    }
}
