
public class Car {
	private String model;
	private String[] features;
	public Car(String model, String... features) {
//		super();
		this.model = model;
		this.features = features;
	}
	
	public void specs() {
		System.out.println("Features of "+model);
		for(String f:features)
			System.out.println("-"+f);
	
	}
	public static void main(String[] args) {
		Car alto=new Car("Suzuki Alto","power window","remote key","power steering");
		Car punch=new Car("Tata Punch","Airbags","power steering","sunroof");
		
		alto.specs();
//		System.out.println("\n");
		punch.specs();

		
	}

}
