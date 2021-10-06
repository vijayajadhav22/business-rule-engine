package business.rule.engine.model;

public class Product {
	 public String Name;
	 public float UnitPrice;
     public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public float getUnitPrice() {
		return UnitPrice;
	}
	public void setUnitPrice(float unitPrice) {
		UnitPrice = unitPrice;
	}
}
