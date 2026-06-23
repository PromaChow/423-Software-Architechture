package notification;

class EmailNotification extends Notification{
        public void provide_notification(String msg){
         System.out.println("EMAIL: " + msg);
    }

    @Override
    public void provide_priority_notification(String msg) {

    }

}