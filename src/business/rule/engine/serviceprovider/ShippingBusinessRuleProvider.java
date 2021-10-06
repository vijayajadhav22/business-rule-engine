package business.rule.engine.serviceprovider;

import business.rule.engine.model.Order;
import business.rule.engine.service.IUserService;

public class ShippingBusinessRuleProvider implements IBusinessRuleProvider
    {
        private IUserService userService;

        public ShippingBusinessRuleProvider(IUserService userService)
        {
            this.userService = userService;
        }

        public String NameRequirement = "PhysicalProduct";

        // If the payment is for a physical product, generate a packing slip for shipping.
        public boolean Process(Order order)
        {
            if (order.Product.GetType() == typeof(Book) ||
               order.Product.GetType() == typeof(Video))
            {               
                if (!String.IsNullOrEmpty(order.PackingSlip) && 
                    order.PackingSlip.contains("shipping"))
                {
                    return true;
                }
                order.PackingSlip += "shipping";
                return true;
            }

            return false;
        }
}
