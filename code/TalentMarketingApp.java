package rallyteam;
import java.util.*;

public class TalentMarketingApp implements Observer {
	private boolean employmentStatus;
	private boolean joinStatus;
	List<User> users = new ArrayList<User>() ;  
	List<Project> projects = new ArrayList<Project>(); 
	
	TalentMarketingApp(List<User> allUsers, List<Project> allProjects){
		users = allUsers;
		projects = allProjects; 
			
		
	}
	
	// Gets skills and interests of all users in the system with user.getSkills() and user.getInterests().
	// Gets the skills required for all projects in the system with project.getProjectReqs()
	public void analyzeMatch(List<User> users, List<Project> projects) {
		for(User u: users) { u.getInterests();}
		for(User u: users) { u.getSkills();}
		for(Project p: projects) { p.getProjectReqs();}
		
		// return a match analysis based on user skills/interests and project skill requirements
	}

	@Override
	public void update(boolean employmentStatus, boolean joinStatus) {
		this.employmentStatus = employmentStatus;
		this.joinStatus = joinStatus;
		
	}
	
}
