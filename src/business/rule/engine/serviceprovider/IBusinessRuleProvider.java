package business.rule.engine.serviceprovider;

import business.rule.engine.model.Order;

public interface IBusinessRuleProvider {
	public boolean Process(Order order);
    public String NameRequirement="";
}
