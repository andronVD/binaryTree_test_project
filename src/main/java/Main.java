public class Main {

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.addElements();
		tree.goLeafDown();
		System.out.println("depth: " + tree.smallestValue + ", value: " + tree.resultLeaf.formattedNameWithParents);
	}

}
