package designpatterns.behavioral.iterator;

public interface Collection {
	public Iterator createIterator();
}

class NotificationCollection implements Collection {
	static final int MAX_ITEMS = 6;
	int            numberOfItems = 0;
	Notification[] notificationList;

	public NotificationCollection() {
		notificationList = new Notification[MAX_ITEMS];
		addItem("Notificaction 1");
		addItem("Notification 2");
		addItem("Notificacion 3");
	}

	public void addItem(String str) {
		Notification notification = new Notification(str);
		if (numberOfItems >= MAX_ITEMS) {
			System.err.println("Full");
		} else {
			notificationList[numberOfItems] = notification;
			numberOfItems = numberOfItems + 1;
		}
	}

	public Iterator createIterator() {
		return new NotificactionIterator(notificationList);
	}
}