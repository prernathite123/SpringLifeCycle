package springcore.ConstructorInject;

public class Vehicle {

	private String name;
	private String vno;
	private int milage;
	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Vehicle(String name, String vno, int milage) {
		super();
		this.name = name;
		this.vno = vno;
		this.milage = milage;
	}
	
	//When there is constructor overloading we have write type of that variable in beans
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getVno() {
		return vno;
	}
	public void setVno(String vno) {
		this.vno = vno;
	}
	public int getMilage() {
		return milage;
	}
	public void setMilage(int milage) {
		this.milage = milage;
	}
	@Override
	public String toString() {
		return "Vehicle [name=" + name + ", vno=" + vno + ", milage=" + milage + "]";
	}
	
	
}
