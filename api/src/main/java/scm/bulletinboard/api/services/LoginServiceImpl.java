package scm.bulletinboard.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import scm.bulletinboard.api.dao.UserDao;
import scm.bulletinboard.api.model.entity.User;

@Transactional(propagation = Propagation.REQUIRED)
@Service
@Primary
public class LoginServiceImpl implements LoginService {
	@Autowired
	UserDao userDao;

	@Override
	public User doLogin(String userName, String password) {
		User user = userDao.searchUserByName(userName);
		return user;
	}

}
