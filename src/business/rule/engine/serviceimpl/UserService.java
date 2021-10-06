package business.rule.engine.serviceimpl;

import business.rule.engine.model.Agent;
import business.rule.engine.model.User;
import business.rule.engine.service.IUserRepository;
import business.rule.engine.service.IUserService;

public class UserService implements IUserService
{
    private IUserRepository userRepository;
    private UserValidator userValidator;

    public UserService() {
    	this(new UserRepository());
    }

    public UserService(IUserRepository userRepository)
    {
        this.userRepository = userRepository;
        this.userValidator = new UserValidator();
    }

    public User GetUser(String userName)
    {
        return this.userRepository.GetUser(userName);
    }

    public boolean UpdateAgent(Agent agent)
    {
        return this.userRepository.UpdateAgent(agent);
    }

    public boolean UpdateUser(User user)
    {
        if (!userValidator.HasValidEmail(user.Email)) return false;

        return this.userRepository.UpdateUser(user);
    }   

}
