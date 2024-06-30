public class OTTSubscription {
    public static void main(String[] args) {
        String userId = "ganesh_043";
        String password = "Ganesh@043";
        int subscription = 1000; 

        int newSubscription = 4999; 
		System.out.println("OTT Subscription Details:");
            System.out.println("User ID: " + userId);
            System.out.println("Password: " + password);
        if (subscription< newSubscription) {
            System.out.println("New Subscription is: " + newSubscription);
        } else {
            System.out.println("No New Subscription");
        }
    }
}