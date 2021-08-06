
public class CommandProcessor {

	private final String delimiter;

	public CommandProcessor(String delimiter) {
		this.delimiter = delimiter;
	}

	public String[] processCommand(String command) {
		return command.split(delimiter);
	}

}
