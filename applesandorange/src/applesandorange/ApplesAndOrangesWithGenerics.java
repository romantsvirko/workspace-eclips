package applesandorange;
import java.util.ArrayList;

class Apple {
	private static long counter;
	private final long id = counter++;
	public long id() { return id; }
}

class Orange{}

public class ApplesAndOrangesWithGenerics {
	public static void main(String[] args) {
		ArrayList<Apple> apples = new ArrayList<Apple>();
		for(int i = 0; i < 3; i++)
			apples.add(new Apple());
		// Добавляем Orange в apples:
		for(int i = 0; i < apples.size(); i++);
		System.out.println(apples.get(2).id());
		for(Apple c : apples)
			System.out.println(c.id());
	}
}
