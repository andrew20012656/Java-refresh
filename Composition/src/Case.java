
public class Case {
	private String model;
	private String manufacturer;
	private String powerSupply;
	private Dimensions demensions;
	
	public void pressButton() {
		System.out.println("Power button pressed");
	}
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getPowerSupply() {
		return powerSupply;
	}

	public void setPowerSupply(String powerSupply) {
		this.powerSupply = powerSupply;
	}

	public Dimensions getDemensions() {
		return demensions;
	}

	public void setDemensions(Dimensions demensions) {
		this.demensions = demensions;
	}

	public Case(String model, String manufacturer, String powerSupply, Dimensions demensions) {
		super();
		this.model = model;
		this.manufacturer = manufacturer;
		this.powerSupply = powerSupply;
		this.demensions = demensions;
	}
	
	
}
