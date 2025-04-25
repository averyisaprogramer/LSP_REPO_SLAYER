package org.howard.edu.lspfinal.question1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

public class ShoppingCartTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	private ShoppingCart cart;
	
	@BeforeEach
	void setup() {
		cart = new ShoppingCart();
	}
	
	@Test 
	@DisplayName("Test adding a valid item")
	void testAddValidItem(){
		cart.addItem("Apple", 1.0);
		assertEquals(1, cart.getItemCount());
		assertEquals(1.0, cart.getTotalCost());
	}
	
	@Test
	@DisplayName("Test adding item with 0 price")
	void testAddItemZeroPrice() {
		cart.addItem("FreeItem", 0.0);
		assertEquals(1, cart.getItemCount());
		assertEquals(0.0, cart.getTotalCost());
	}
	
	@Test
	@DisplayName("Test adding item with negative price (except exception")
	void testAddNegativePrice() {
		assertThrows(IllegalArgumentException.class, () -> cart.addItem("BadItem", -5.0));
	}
	
	@Test
	@DisplayName("Test applying 'SAVE10' discount")
	void testApplySave10() {
		cart.addItem("Apple", 10.0);
		cart.applyDiscountCode("SAVE10");
		assertEquals(9.0, cart.getTotalCost());
	}
	
	@Test
	@DisplayName("Test applying 'SAVE20' discount")
	void testApplySave20() {
		cart.addItem("Apple", 10.0);
		cart.applyDiscountCode("SAVE20");
		assertEquals(8.0, cart.getTotalCost());
	}
	
	@Test
	@DisplayName("Test applying invalid discount code (except exception)")
	void testInvalidDiscountCode() {
		assertThrows(IllegalArgumentException.class, () -> cart.applyDiscountCode("INVALIDCODE"));
	}
	
	@Test
	@DisplayName("Test total cost without any discount")
	void testTotalWithoutDiscount() {
		cart.addItem("Apple", 10.0);
		cart.addItem("Banana", 5.0);
		assertEquals(15.0, cart.getTotalCost());
	}
	
	@Test
	@DisplayName("Test total cost with discount")
	void testTotalWithDiscount() {
		cart.addItem("Apple", 10.0);
		cart.addItem("Banana", 5.0);
		cart.applyDiscountCode("SAVE10");
		assertEquals(13.5, cart.getTotalCost());
	}
	
	@Test
	@DisplayName("Test total cost with empty cart")
	void testEmptyCart() {
		assertEquals(0.0,  cart.getTotalCost());
	}
	
	@Test 
	@DisplayName("Test removing an existing item")
	void testRemoveExistingItem() {
		cart.addItem("Apple", 10.0);
		cart.removeItem("Apple");
		assertEquals(0, cart.getItemCount());
	}
	
	@Test
	@DisplayName("Test removing a non-existent item")
	public void testRemoveNonExistentItem() {
	    ShoppingCart cart = new ShoppingCart();
	    
	    // Try removing an item that doesn't exist
	    IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
	        cart.removeItem("NonExistentItem");
	    });
	    
	    // Verify the exception message
	    assertEquals("Item 'NonExistentItem' does not exist in the cart.", exception.getMessage());
	}

}

/* code taken from chat gpt and 
 * https://stackoverflow.com/questions/27446136/unordered-execution-of-tests-in-junit-for-shoppingcart 
 */

