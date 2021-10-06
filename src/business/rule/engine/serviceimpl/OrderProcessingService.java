package business.rule.engine.serviceimpl;

import business.rule.engine.model.Order;
import business.rule.engine.service.IEmailService;
import business.rule.engine.service.IUserService;
import business.rule.engine.serviceprovider.BusinessRuleProviderFactory;
import business.rule.engine.serviceprovider.IBusinessRuleProvider;

public class OrderProcessingService {
	 private IEnumerable<IBusinessRuleProvider> rules;
     private BusinessRuleProviderFactory businessRuleProviderFactory;

     public OrderProcessingService(IUserService userService, IEmailService emailService)
     {
         this.businessRuleProviderFactory = new BusinessRuleProviderFactory(userService, emailService);
         this.rules = businessRuleProviderFactory.GetProviders();
     }
    
     public void Process(Order order)
     {
         for each (IBusinessRuleProvider rule in rules)
         {
             var (isSatisfied, message) = rule.Process(order);
         }
     }
}
