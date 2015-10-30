package nopattern;

public class Person {

	private String name;

	private double weight;
	private double height;

	public Person(String n, double w, double h) {
		this.name = n;
		this.weight = w;
		this.height = h;
	}

	/**
	 * 引数で受け取った相手より自分のほうがBMIが大きければtrue
	 * 
	 * @param other
	 * @return
	 */
	public boolean isFatter(Person other) {
		return getBMI() > other.getBMI();
	}

	/**
	 * 引数で受け取った相手より自分のほうがBMIが小さければtrue
	 * 
	 * @param other
	 * @return
	 */
	public boolean isThinner(Person other) {
		return getBMI() < other.getBMI();
	}

	@Override
	public String toString() {
		return name + ": h=" + height + ",w=" + weight + ",BMI=" + getBMI();
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getBMI() {
		double h = height / 100;
		return weight / h * h;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
