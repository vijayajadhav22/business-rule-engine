package business.rule.engine.application;

import business.rule.engine.model.Membership;
import business.rule.engine.model.MembershipType;
import business.rule.engine.model.MembershipUpgrade;
import business.rule.engine.model.Order;
import business.rule.engine.serviceimpl.EmailService;
import business.rule.engine.serviceimpl.OrderProcessingService;
import business.rule.engine.serviceimpl.UserService;

public class BusinessRuleEngine {
	
	 public static void Main(String[] args){
		 OrderProcessingService service = new OrderProcessingService(new UserService(), new EmailService());
		 Order order = new Order("",new Membership(true,"test@test.com","BasicMembership",100,"foo", MembershipType.Basic));
         service.Process(order);
         Order order2 = new Order("",new MembershipUpgrade(true,"test@test.com","BasicMembership",200,"foo",MembershipType.VIP));
         
         service.Process(order2); 
    }
}
