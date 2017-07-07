package commons;

public interface BaseTest {
	
	public static final String RESULT_ORIGINAL = "Javascript example no.2";
	
	public static final String RESULT_EXPECTED = "Nuevo Texto";
	
	public static final String RESULT_EXPECTED_FINAL = "Welcome GAP, Logout";
	
	//@BeforeClass
	abstract void setupPages();

}
