package business.rule.engine.service;

import business.rule.engine.model.Agent;
import business.rule.engine.model.User;

public interface IUserRepository {
	 User GetUser(String userName);
     boolean AddUser(User user);
     boolean UpdateUser(User user);
     boolean UpdateAgent(Agent agent);
}
