package business.rule.engine.serviceprovider;

import business.rule.engine.model.Order;
import business.rule.engine.service.IUserService;

public class CommissionPaymentBusinessRuleProvider implements IBusinessRuleProvider {
	 private IUserService userService;

     public CommissionPaymentBusinessRuleProvider(IUserService userService)
     {
         this.userService = userService;
     }

     public String NameRequirement = "Commission";

     public boolean Process(Order order)
     {
         if (order.Product.GetType() == typeof(Book) ||
             order.Product.GetType() == typeof(Video))
         {
             var agent = new Agent{ Name = order.SoldBy, Commission = 10 };
             var result = this.userService.UpdateAgent(agent);

             return result;
         }

         return false;
     }
}
