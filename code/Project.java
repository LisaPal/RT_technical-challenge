package rallyteam;
import java.util.*;

public class Project {
	// The skill requirements of the project
	private List<String> projectReqs = new ArrayList<String>(); 
	
	Project(List<String> allreqs){
		projectReqs = allreqs; 
	}
	
	// Getters
	public List<String> getProjectReqs(){ return projectReqs;  }

}
