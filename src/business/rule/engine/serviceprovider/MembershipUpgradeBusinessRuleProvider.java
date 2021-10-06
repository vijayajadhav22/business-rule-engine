package business.rule.engine.serviceprovider;

import business.rule.engine.model.MembershipUpgrade;
import business.rule.engine.model.Order;
import business.rule.engine.service.IUserService;

public class MembershipUpgradeBusinessRuleProvider implements IBusinessRuleProvider
    {
        private IUserService userService;

        public MembershipUpgradeBusinessRuleProvider(IUserService userService)
        {
            this.userService = userService;
        }

        public String NameRequirement = "MembershipUpgrade";

        // If the payment is an upgrade to a membership, apply the upgrade
        public boolean Process(Order order)
        {
            if (order.Product.GetType() == typeof(MembershipUpgrade))
            {
                // Process upgrade
                var product = (MembershipUpgrade)order.Product;
                var user = userService.GetUser(product.MemberName);
                user.MembershipType = product.MembershipType;

                var result = userService.UpdateUser(user);   

                return result;
            }

            return false;
        }
}
