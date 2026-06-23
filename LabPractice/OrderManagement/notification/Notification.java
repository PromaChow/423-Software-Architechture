package notification;

abstract class Notification{
    public abstract void provide_notification(String msg);
    public abstract void provide_priority_notification(String msg);
}