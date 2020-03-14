package com.example.demo.web;

import java.util.LinkedHashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Main {final static Logger logger = LoggerFactory.getLogger(Main.class);

private Map<String, String> getSelectedItems() {
	Map<String, String> selectMap = new LinkedHashMap<String, String>();
	selectMap.put("key_A", "選択肢Ａは、これですよ");
	selectMap.put("key_B", "選択肢Ｂは、これですよ");
	selectMap.put("key_C", "選択肢Ｃは、これですよ");
	selectMap.put("key_D", "選択肢Ｄは、これですよ");
	selectMap.put("key_E", "選択肢Ｅは、これですよ");
	return selectMap;

}


	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public String helloWorld(Model model) {
		model.addAttribute("message", "Mainの画面");
		model.addAttribute("selectItems", getSelectedItems());
		return "main";
	}

}



//コードをコピーした後は、使うとこを抜き取り改造を心がける