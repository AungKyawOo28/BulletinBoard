package scm.bulletinboard.api.dao;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import scm.bulletinboard.api.model.entity.User;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public User searchUserByName(String userName) {
		String userHqlQuery = "SELECT u FROM User u where u.name = :name";
		Query queryUserById = this.sessionFactory.getCurrentSession().createQuery(userHqlQuery);
		queryUserById.setParameter("name", userName);
		User resultUser = (User) queryUserById.uniqueResult();
		return resultUser;
	}

}
