import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class BinaryTreeUnitTest {
	
	@Test
	public void givenABinaryTree_WhenAddingElements_ThenTreeNotEmpty() {
		BinaryTree bt = createBinaryTree();

		assertTrue(!bt.isEmpty());
	}
	
	@Test
    public void givenABinaryTree_WhenLookingForNonExistingElement_ThenReturnsFalse() {
        BinaryTree bt = createBinaryTree();

        assertFalse(bt.containsLeaf(99));
    }
	
	@Test
    public void givenABinaryTree_WhenAddingElements_ThenTreeContainsThoseElements() {
        BinaryTree bt = createBinaryTree();
        
        assertTrue(bt.containsLeaf(4));
        assertFalse(bt.containsLeaf(15));
    }
	
	private BinaryTree createBinaryTree() {
		BinaryTree bt = new BinaryTree();
		bt.addElements();
		return bt;
	}
}
