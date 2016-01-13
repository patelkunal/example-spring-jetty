package org.coderearth.kitchens.embjetty.controller;

import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    @ResponseBody
    public HashMap<String, String> sayHello() {
        HashMap<String, String> map = new HashMap<>(1);
        map.put("msg", "hello world");
        return map;
    }

}
