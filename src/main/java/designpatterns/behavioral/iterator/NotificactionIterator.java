package designpatterns.behavioral.iterator;

public class NotificactionIterator implements Iterator {
	Notification[] notificationList;
	// maintains curr pos of iterator over the array
	int            pos = 0;

	// Constructor takes the array of notificactionList are going to iterate over
	public NotificactionIterator(Notification[] notificationList) {
		this.notificationList = notificationList;
	}

	public Object next() {
		Notification notification = notificationList[pos];
		pos += 1;
		return notification;
	}

	public boolean hasNext() {
		if (pos >= notificationList.length || notificationList[pos] == null) {
			return false;
		} else {
			return true;
		}
	}
}
