package business.rule.engine.serviceprovider;

import business.rule.engine.model.Order;
import business.rule.engine.service.IUserService;

public class SafetyBusinessRuleProvider implements IBusinessRuleProvider
    {
        private IUserService userService;

        public SafetyBusinessRuleProvider(IUserService userService)
        {
            this.userService = userService;
        }

        public String NameRequirement = "Safety";

        public boolean Process(Order order)
        {
            if (order.Product.GetType() == typeof(Video) &&
                order.Product?.Name == "Learning to Ski")
            {
                order.PackingSlip += "First Aid";
                return true;
            }
            return false;
        }
    }
