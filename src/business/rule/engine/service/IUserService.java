package business.rule.engine.service;

import business.rule.engine.model.Agent;
import business.rule.engine.model.User;

public interface IUserService {
	  User GetUser(String userName);
      boolean UpdateUser(User user);
      boolean UpdateAgent(Agent agent);
  
}
