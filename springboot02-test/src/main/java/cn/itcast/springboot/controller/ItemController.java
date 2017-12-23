package cn.itcast.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ItemController {
	
	@GetMapping("/item")
	public String itemList(Model model){
		model.addAttribute("itemArr",new String[]{"小米","华为","苹果"});
		return "item";
	}
}
