using Raymaker.RulesEngine.Application.Model;

namespace Raymaker.RulesEngine.Application.BusinessRuleProviders
{
    public interface IBusinessRuleProvider
    {
        public boolean isSatisfied Process(Order order);
        public string NameRequirement;
    }
}
