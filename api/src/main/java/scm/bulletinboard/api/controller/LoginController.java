package scm.bulletinboard.api.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.JsonNode;

import scm.bulletinboard.api.model.entity.User;
import scm.bulletinboard.api.services.LoginService;

@RestController
public class LoginController {
	@Autowired
	LoginService loginService;

	@RequestMapping(value = "/login", method = RequestMethod.POST, headers = "Accept=application/json")
	public List<User> doLogin(@RequestBody JsonNode node) throws IOException {

		System.out.println(node.path("userName").textValue());
		User user = loginService.doLogin(node.path("userName").textValue(), node.path("password").textValue());
		List<User> slist = new ArrayList<User>();
		slist.add(user);
//		slist.add(user);
//		slist.add(user);
		return slist;
	}

}
