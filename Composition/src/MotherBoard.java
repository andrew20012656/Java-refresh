
public class MotherBoard {
	private String model;
	private String manufactuer;
	private int ramSlots;
	private int cardSlots;
	private String bios;

	public MotherBoard(String model, String manufactuer, int ramSlots, int cardSlots, String bios) {
		super();
		this.model = model;
		this.manufactuer = manufactuer;
		this.ramSlots = ramSlots;
		this.cardSlots = cardSlots;
		this.bios = bios;
	}
	
	public void loadProgram(String programName) {
		System.out.println("Program" + programName + "is now loading....");
	}
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getManufactuer() {
		return manufactuer;
	}

	public void setManufactuer(String manufactuer) {
		this.manufactuer = manufactuer;
	}

	public int getRamSlots() {
		return ramSlots;
	}

	public void setRamSlots(int ramSlots) {
		this.ramSlots = ramSlots;
	}

	public int getCardSlots() {
		return cardSlots;
	}

	public void setCardSlots(int cardSlots) {
		this.cardSlots = cardSlots;
	}

	public String getBios() {
		return bios;
	}

	public void setBios(String bios) {
		this.bios = bios;
	}
}
