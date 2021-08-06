/*
 * -----------------
 * Copyright © 2020 ACK Cyfronet AGH, Poland.
 *
 * This work was partially funded by EPOS Project funded in frame of PL-POIR4.2
 * -----------------
 */

public class ProcessorFactory {

	public static final String GREATEST_COMMON_FACTOR_COMMAND = "gcf";
	public static final String UNIQUE_WORDS_COUNT_COMMAND = "uwc";
	public static final String LINE_COUNT_COMMAND = "lc";

	public InputProcessor createProcessor(String command) {
		if (command.equals(GREATEST_COMMON_FACTOR_COMMAND)) {
			return new GreatestCommonFactorProcessor();
		}
		return null;
	}
}
