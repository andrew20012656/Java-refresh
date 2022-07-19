
public class Car {
	private int doors;
	private int wheels;
	private String model;
	private String engine;
	private String color;
	
	public void setModel(String model) {
		String validModel = model.toLowerCase();
		if(validModel.equals("porsche") || validModel.equals("holden")) {
			this.model = model;
		} else {
			this.model = "Unknown";
		}
	}
	
	public String getModel() {
		return this.model;
	}
	
	/**
	 * @return the doors
	 */
	public int getDoors() {
		return doors;
	}

	/**
	 * @param doors the doors to set
	 */
	public void setDoors(int doors) {
		this.doors = doors;
	}

	/**
	 * @return the wheels
	 */
	public int getWheels() {
		return wheels;
	}

	/**
	 * @param wheels the wheels to set
	 */
	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	/**
	 * @return the engine
	 */
	public String getEngine() {
		return engine;
	}

	/**
	 * @param engine the engine to set
	 */
	public void setEngine(String engine) {
		this.engine = engine;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	}

	/**
	 * @param doors
	 * @param wheels
	 * @param model
	 * @param engine
	 * @param color
	 */
	public Car() {
		this(1, 2,"s", "s", "s");
	}
	
	public Car(int doors, int wheels, String model, String engine, String color) {
		super();
		this.doors = doors;
		this.wheels = wheels;
		this.model = model;
		this.engine = engine;
		this.color = color;
	}

}
