package designpatterns.behavioral.iterator;

public interface Iterator {
	// indicates wheter there are more elements to iterator over
	boolean hasNext();

	// returns the next element
	Object next();
}
