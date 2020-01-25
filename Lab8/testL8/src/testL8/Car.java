package testL8;

public class Car {
	private Engine engine;
	private String carId;
	private String owmer;
	
	public Car() {
		this.engine = null;
	}
	public Car(String id,String series,String description,String carId,String owner) {
		this.engine = new Engine(id,series,description);
		this.carId = carId;
		this.owmer = owner;
	}
	public Engine getEngine() {
		return this.engine; 
	}
	public String getEngineInfo() {
		String info = String.format(" Engine ID : %s\n Sreies : %s\n Descrition : %s"
				, this.engine.getId(),this.engine.getSeries(),this.engine.getDecrip());
		return info;
	}

}
