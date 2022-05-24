
public class HelloDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hello h=()->"Hello World";
		System.out.println(h.sayHello());
		
		Hello h2= () -> {
			String msg="Hola Monda";
			return msg;
		};
		System.out.println(h2.sayHello());
		
		h2.sayBye();
		System.out.println(Hello.random());

	}

}
