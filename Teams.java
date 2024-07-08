public class Teams {

    public static void main(String[]args){
       
        String teamName = "Development Team";
        int numberOfMembers = 10;
        double budget = 15000.50;
        boolean isRemote = true;
        String teamLead = "John Doe";
        String teamEmail = "devteam@company.com";
        int weeklyMeetings = 3;
		int monthlyplan =580;
		int yearlyplan=6960;

	   
		if(monthlyplan<=yearlyplan){
			System.out.println("Monthlyplan is:"+monthlyplan);
		
		
		}else{
			System.out.println("Yearlyplan is:"+yearlyplan);
		}
        System.out.println("Team Name: " + teamName);
        System.out.println("Number of Members: " + numberOfMembers);
        System.out.println("Budget: $" + budget);
        System.out.println("Is Remote: " + isRemote);
        System.out.println("Team Lead: " + teamLead);
        System.out.println("Team Email: " + teamEmail);
        System.out.println("Weekly Meetings: " + weeklyMeetings);
		System.out.println("Monthly plan is:"+monthlyplan);
		System.out.println("Yearly plan is:"+yearlyplan);
    }

    
}