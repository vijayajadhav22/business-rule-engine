package business.rule.engine.serviceimpl;

import business.rule.engine.model.Agent;
import business.rule.engine.model.MembershipType;
import business.rule.engine.model.User;
import business.rule.engine.service.IUserRepository;

public class UserRepository implements IUserRepository
{
    public boolean AddUser(User user)
    {
        return true;
    }

    public User GetUser(String userName)
    {
    	String email = "test@test.com";
    	return new User(email,userName,MembershipType.Basic);        
    }

    public boolean UpdateAgent(Agent agent)
    {
        return true;
    }

    public boolean UpdateUser(User user)
    {
        return true;
    } 
}
