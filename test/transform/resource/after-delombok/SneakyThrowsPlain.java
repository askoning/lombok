class SneakyThrowsPlain {
	public void test() {
		try {
			System.out.println("test1");
		} catch (final java.lang.Throwable $ex) {
			throw lombok.Lombok.sneakyThrow($ex);
		}
	}
	
	public void test2() {
		try {
			System.out.println("test2");
		} catch (final java.lang.Throwable $ex) {
			throw lombok.Lombok.sneakyThrow($ex);
		}
	}
}