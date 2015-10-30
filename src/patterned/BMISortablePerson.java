package patterned;

import nopattern.Person;

/**
 * 継承を用いてPersonクラスのインタフェースをComparableに一致するように変更するアダプタ
 * 
 * @author shiva
 *
 */
public class BMISortablePerson extends Person implements
		Comparable<BMISortablePerson> {

	public BMISortablePerson(String n, double w, double h) {
		super(n, w, h);
	}

	@Override
	public int compareTo(BMISortablePerson o) {

		// 自分のほうがBMIが大きい場合
		if (isFatter(o))
			return 1;

		// 自分のほうがBMIが小さい場合
		if (isThinner(o))
			return -1;

		return 0;
	}

}
