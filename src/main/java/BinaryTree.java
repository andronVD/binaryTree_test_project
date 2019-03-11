import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

	Leaf root;

	int smallestValue = 0;

	Leaf resultLeaf = null;

	void goLeafDown() {
		Queue<Leaf> nodes = new LinkedList<>();
		nodes.add(root);
		int depth = 0, minDepth = Integer.MAX_VALUE;
		while (!nodes.isEmpty()) {
			Leaf current = nodes.remove();

			if (depth == 0) {
				current.formattedNameWithParents = current.name;
			}

			if (current.left == null && current.right == null && minDepth > depth) {
				minDepth = depth;
				resultLeaf = current;
			}

			if (current.right != null) {
				current.right.formattedNameWithParents = current.formattedNameWithParents + "-" + current.right.name;
				nodes.add(current.right);
			}

			if (current.left != null) {
				current.left.formattedNameWithParents = current.formattedNameWithParents + "-" + current.left.name;
				nodes.add(current.left);
			}
			depth++;
		}
		smallestValue = minDepth;
	}

	void addElements() {
		// Let us create Binary Tree shown in above example
		this.root = new Leaf(1);
		this.root.left = new Leaf(2);
		this.root.right = new Leaf(3);

		this.root.left.left = new Leaf(4);
		this.root.left.right = new Leaf(5);

		this.root.right.left = new Leaf(6);
		this.root.right.right = new Leaf(7);

		this.root.left.left.left = new Leaf(8);
		this.root.left.left.right = new Leaf(9);

		this.root.left.right.left = new Leaf(10);
		/*
		 * this.root.left.right.right = new Leaf(11);
		 * 
		 * this.root.right.left.left = new Leaf(12); this.root.right.left.right = new
		 * Leaf(13);
		 * 
		 * this.root.right.right.left = new Leaf(14); this.root.right.right.right = new
		 * Leaf(15);
		 * 
		 * this.root.left.left.left.left = new Leaf(15); this.root.left.left.left.right
		 * = new Leaf(16);
		 * 
		 * this.root.left.left.right.left = new Leaf(17);
		 */
	}

	public boolean isEmpty() {
		return root == null;
	}
	
	public boolean containsLeaf(int value) {
        return containsLeafRecursive(root, value);
    }

    private boolean containsLeafRecursive(Leaf current, int value) {
        if (current == null) {
            return false;
        }

        if (value == current.value) {
            return true;
        }

        return value < current.value
          ? containsLeafRecursive(current.right, value)
          : containsLeafRecursive(current.left, value);
    }

}
