package scm.bulletinboard.api.services;

import scm.bulletinboard.api.model.entity.User;

public interface LoginService {

	User doLogin(String userName, String password);

}
