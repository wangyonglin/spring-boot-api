package com.wangyonglin;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController     //等同于同时加上了@Controller和@ResponseBody
public class BootController {
	@RequestMapping(value = {"/hello","/hi"},method = RequestMethod.GET)
    public String say(){
        return "hi you!!!";
    }
}
