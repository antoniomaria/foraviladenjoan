import org.junit.*;

import java.util.*;
import play.test.*;
import models.*;

public class BasicTest extends UnitTest {

	@Before
    public void setup() {
        Fixtures.deleteAll();
    }
	
	@Test
	public void createAndRetrieveProduct() {
		// Create a new Product and save it
		Product product = new Product("Test lechuga", "vegetable", 3.4, "Kg", true, "aubergine.jpg");
		product.insert();
		assertTrue("Id must not be null", product.id  > 0);
		System.out.println("the generated key is available: " + product.id); // the generated key is available
	}
	
	@Test
	public void loadDataTest(){
		Fixtures.load("data.yml");
		assertTrue ("Product list size is 2" , Product.all().count() == 2);
	}

}
