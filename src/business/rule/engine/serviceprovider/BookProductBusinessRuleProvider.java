package business.rule.engine.serviceprovider;

import business.rule.engine.model.Order;
import business.rule.engine.service.IUserService;

public class BookProductBusinessRuleProvider implements IBusinessRuleProvider{
	private IUserService userService;

    public BookProductBusinessRuleProvider(IUserService userService)
    {
        this.userService = userService;
    }

    public String NameRequirement = "BookProduct";

    // If the payment is for a book, create a duplicate packing slip for the royalty department.
    public boolean Process(Order order)
    {
        if (order.Product.getName() == NameRequirement)
        {
            if (order.PackingSlip!=null && order.PackingSlip.contains("royalty"))
            {
                return true;
            }
            order.PackingSlip += "royalty";
            return true;
        }

        return false;
    }
}
