package designpatterns.behavioral.command;

class FileInvoker {
	public Command command;

	public FileInvoker(Command c) {
		command = c;
	}

	public void execute() {
		command.execute();
	}
}
