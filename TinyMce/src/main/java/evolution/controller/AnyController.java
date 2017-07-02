package evolution.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnyController {
	@PostMapping("/post")
	public void post(@RequestParam("html") String html) {
		System.out.println(html);
	}
}
