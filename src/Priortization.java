import org.testng.annotations.Test;

public class Priortization {
	@Test(priority=1)
	public void bmethod() {
		System.out.println("method 1");
	}
	@Test(priority=3)
	public void cmethod() {
		System.out.println("method 1");
	}
	@Test(priority=4)
	public void dmethod() {
		System.out.println("method 1");
	}
	@Test
	public void amethod() {
		System.out.println("method 1");
	}

}


