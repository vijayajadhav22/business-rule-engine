package business.rule.engine.serviceprovider;

import business.rule.engine.model.Order;
import business.rule.engine.service.IUserService;

public class DefaultBusinessRuleProvider implements IBusinessRuleProvider
    {
        private IUserService userService;

        public DefaultBusinessRuleProvider(IUserService userService)
        {
            this.userService = userService;
        }

        public String NameRequirement = String.Empty;

        public boolean isSatisfied Process(Order order)
        {
            return true;
        }
    }

