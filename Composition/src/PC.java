
public class PC {
	private Case theCase;
	private Monitor monitor;
	private MotherBoard motherboard;
	/**
	 * @param theCase
	 * @param monitor
	 * @param motherboard
	 */
	public PC(Case theCase, Monitor monitor, MotherBoard motherboard) {
		super();
		this.theCase = theCase;
		this.monitor = monitor;
		this.motherboard = motherboard;
	}
	public void powerUp() {
		theCase.pressButton();
		drawLogo();
	}
	
	public void drawLogo() {
		monitor.drawPixelAt(1200, 50, "Yellow");
	}
	
	public void setTheCase(Case theCase) {
		this.theCase = theCase;
	}

	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}
	public MotherBoard getMotherboard() {
		return motherboard;
	}
	public void setMotherboard(MotherBoard motherboard) {
		this.motherboard = motherboard;
	}
	
	
	
}
