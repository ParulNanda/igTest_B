import junit.framework.TestCase;
import org.junit.Test;

public class GreatestCommonFactorProcessorTest {

	GreatestCommonFactorProcessor processor = new GreatestCommonFactorProcessor();


	@Test(expected = IllegalArgumentException.class)
	public void shouldThrowAnExceptionIfInputIsIncorrect() {
		String[] input = new String[1];
		input[0] = "tv";
		processor.processInput(input);
	}




}