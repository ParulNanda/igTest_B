

import java.util.NoSuchElementException;
import java.util.Scanner;

public class CodingExercise {

	public static final String GREATEST_COMMON_FACTOR_COMMAND = "gcf";
	public static final String EXIT_COMMAND = "exit";
	public static final String UNIQUE_WORDS_COUNT_COMMAND = "uwc";
	public static final String LINE_COUNT_COMMAND = "lc";

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {
			while (true) {
				System.out.println("Please input command:\n");
				String line = scanner.nextLine().toLowerCase();
				System.out.println(line);
				String[] tokens = new CommandProcessor("[ ]+").processCommand(line);
				if (line.equals(EXIT_COMMAND)) {
					System.out.println("bye");
					scanner.close();
					System.exit(0);
				} else if (line.startsWith(GREATEST_COMMON_FACTOR_COMMAND)) {
					GreatestCommonFactorProcessor gcfp = new GreatestCommonFactorProcessor();
					System.out.println(gcfp.processInput(tokens));


				} else if (line.startsWith(UNIQUE_WORDS_COUNT_COMMAND)) {

				} else if (line.startsWith(LINE_COUNT_COMMAND)) {

				} else {
					System.out.println("Unknown input");
				}

			}
		} catch (IllegalStateException | NoSuchElementException e) {
			System.out.println("Interpreter was closed; exiting");
		}
	}
}
