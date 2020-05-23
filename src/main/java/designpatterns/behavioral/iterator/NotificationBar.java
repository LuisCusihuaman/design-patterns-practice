package designpatterns.behavioral.iterator;

// Contains collection of notificactions as an object of NOtificationCollection
public class NotificationBar {
	NotificationCollection notifications;
	public NotificationBar(NotificationCollection notifications){
		this.notifications = notifications;
	}
	public void printNotifications(){
		Iterator iterator = notifications.createIterator();
		System.out.println("----- NOTIFICACTION BAR -------");
		while ( iterator.hasNext()){
			Notification n = (Notification) iterator.next();
			System.out.println(n.getNotificaction());
		}
	}
}
