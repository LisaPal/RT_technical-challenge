package rallyteam;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Owner implements Observer {
	private boolean employmentStatus;
	private boolean joinStatus;
	List<User> users = new ArrayList<User>() ;
	static List<Project> projects = new ArrayList<Project>();
	
	Owner(List<User> allUsers){
		users = allUsers;
	}
	
	// Getters
	public List<User> getUsers(){return users;}
	public List<Project> getProjects(){ return projects;}
	
	// Creates a new project
	public Project createProject(List<String> skillReqs) {
		Project newProj = new Project(skillReqs); 
		projects.addAll( (Collection<Project>) new java.lang.ref.WeakReference<Project>(newProj)); 
		return newProj;
	}
	
	
	
	// Respond to a user's joinRequest. Either accept or deny it based on TalentMarketingApp's match analysis.
	public boolean respondJoinRequest() {
		return true;  
	}
	
	// Endorse, rate or give feedback after being notified that the user is employed with one of the owner's project.
	public void endorse() {}
	
	public void rate() {}
	
	public void feedback() {}

	@Override
	public void update(boolean employmentStatus, boolean joinStatus) {
		this.employmentStatus = employmentStatus;
		this.joinStatus = joinStatus; 
		
	}

}
