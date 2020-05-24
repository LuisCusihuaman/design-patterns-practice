package designpatterns.behavioral.memento;

public class Client {
	public static void main(String[] args) {
		FileWriterCaretaker caretaker  = new FileWriterCaretaker();
		FileWriterUtil      fileWriter = new FileWriterUtil("data.txt");
		fileWriter.write("First Set of Data:\nLuis\nFlor\n");
		System.out.println(fileWriter + "\n\n");
		// lets save the file (caretaker == vigilante)
		caretaker.save(fileWriter);
		// now write something else
		fileWriter.write("Second set of data: \nPablo\n");
		// checking file contents
		System.out.println(fileWriter + "\n\n");
		// lets undo to last save
		caretaker.undo(fileWriter);
		// checking file content again
		System.out.println(fileWriter + "\n\n");
	}
}
