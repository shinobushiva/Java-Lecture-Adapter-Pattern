package patterned;

import java.util.Arrays;

public class BMISortTest {

	public static void main(String[] args) {

		BMISortablePerson[] people = new BMISortablePerson[] {
				new BMISortablePerson("FatPerson", 100, 160),
				new BMISortablePerson("ThinPerson", 65, 180),
				new BMISortablePerson("MiddlePerson", 75, 170) };

		// 配列の中身を全部表示
		Arrays.stream(people).forEach((x) -> {
			System.out.println(x);
		});
		System.out.println("=========");

		Arrays.sort(people);

		// 配列の中身を全部表示
		Arrays.stream(people).forEach((x) -> {
			System.out.println(x);
		});
		System.out.println("=========");

	}
}
