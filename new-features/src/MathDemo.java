

interface Add<T>{
	T sum(T a,T b);
}
public class MathDemo {
	public static void main(String[] args) {
		Add<Interger> ai = (a,b)->a+b;
		System.out.println(ai.sum(10,20));
	}

}
