public class Test {
	double delta = 0.000001;
	public void test001() {
		Cashier c = new Cashier();
		double start = 114.0 - delta;
		double finish = 114.0 + delta;
		double total = c.getTotal(120.0);
		assert start <= total && total <= finish;
	}
	public void test002() {
		Cashier c = new Cashier();
		double start = 90.0 - delta;
		double finish = 90.0 + delta;
		double total = c.getTotal(90.0);
		assert start <= total && total <= finish;
	}
	public void test003() {
		Cashier c = new Cashier();
		double start = 0.0 - delta;
		double finish = 0.0 + delta;
		double total = c.getTotal(-5);
		assert start <= total && total <= finish;
	}
	public void testNear100() {
		Cashier c = new Cashier();
		double start = 99.0 - delta;
		double finish = 99.0 + delta;
		double total = c.getTotal(99.0);
		assert start <= total && total <= finish;
	}
	public void testExactly100() {
		Cashier c = new Cashier();
		double start = 95.0 - delta;
		double finish = 95.0 + delta;
		double total = c.getTotal(100);
		assert start <= total && total <= finish;
	}
	public void test006() {
		Cashier c = new Cashier();
		double start = 95.95 - delta;
		double finish = 95.95 + delta;
		double total = c.getTotal(101.0);
		assert start <= total && total <= finish;
	}
}
