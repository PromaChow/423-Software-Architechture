package notification;

class SMSNotification extends Notification{
    public void provide_notification(String msg){
         System.out.println("SMS: " + msg);
    }

    @Override
    public void provide_priority_notification(String msg) {

    }

}