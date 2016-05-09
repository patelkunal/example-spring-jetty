package org.coderearth.kitchens.embjetty.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * Created by kunal_patel on 09/02/16.
 */
@RestController
public class ArticleController {

	@RequestMapping(value = "/article", method = RequestMethod.PUT)
	@ResponseBody
	public HashMap<String, String> saveArticle() {
		HashMap<String, String> map = new HashMap<>(1);
		map.put("msg", "hello world");
		return map;
	}

	@RequestMapping(value = "/article", method = RequestMethod.GET)
	@ResponseBody
	public HashMap<String, String> searchArticle() {
		HashMap<String, String> map = new HashMap<>(1);
		map.put("msg", "hello world");
		return map;
	}

}
