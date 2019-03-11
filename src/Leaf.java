public class Leaf {

	int value;
	
	String name, formattedNameWithParents;
	
	Leaf left, right;
	
	public Leaf(int value) {
		this.value = value;
		this.name = Character.toString((char) (value + 64));
		left = right = null;
	}
	
}
