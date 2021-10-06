package business.rule.engine.model;

public class Agent {
	public String Name;
    public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public float getCommission() {
		return Commission;
	}
	public void setCommission(float commission) {
		Commission = commission;
	}
	public float Commission;

}
