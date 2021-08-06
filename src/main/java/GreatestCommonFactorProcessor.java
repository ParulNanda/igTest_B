
public class GreatestCommonFactorProcessor implements InputProcessor {

	@Override
	public int processInput(String[] input) {
		if (input.length != 3) {
			throw new IllegalArgumentException("The input should be in form: gwc <int> <int>");
		}
		int firstArg = 0;
		int secondArg = 0;
		try {
			firstArg = Integer.parseInt(input[1]);
			secondArg = Integer.parseInt(input[2]);
		} catch (NumberFormatException e) {
			System.out.println("One of the inputs is not an int") ;
		}
		return countGreatestCommonFactor(firstArg, secondArg);
	}

	private int countGreatestCommonFactor(int first, int second) {
		if (second == 0) {
			return first;
		}
		return countGreatestCommonFactor(second, first % second);
	}
}
