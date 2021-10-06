package business.rule.engine.serviceprovider;

import business.rule.engine.model.Membership;
import business.rule.engine.model.Order;
import business.rule.engine.model.Product;
import business.rule.engine.model.User;
import business.rule.engine.service.IUserService;

public class ActivateMembershipBusinessRuleProvider {
	private IUserService userService;

    public ActivateMembershipBusinessRuleProvider(IUserService userService)
    {
        this.userService = userService;
    }

    public String NameRequirement = "Membership";

    // If the payment is for a membership, activate that membership.
    public boolean Process(Order order)
    {
        if (order.Product.GetType() == typeof(Membership.class))
        {
            Product product = order.Product as Membership;
            product.IsActive = true;  
            User user = userService.GetUser((order.Product as Membership).MemberName);
            user.IsActive = true;
            User result = this.userService.UpdateUser(user);
            return result;
        }

        return false;
    }
}
