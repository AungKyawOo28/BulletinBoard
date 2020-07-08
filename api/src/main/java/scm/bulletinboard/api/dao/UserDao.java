package scm.bulletinboard.api.dao;

import scm.bulletinboard.api.model.entity.User;

public interface UserDao {

	User searchUserByName(String userName);

}
