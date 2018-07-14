package rallyteam;
import java.util.*;


public class User implements Subject {
	private ArrayList<Observer> observers;
	private boolean employmentStatus; 
	private boolean joinStatus; 
	private List<String> skills = new ArrayList<String>() ;  
	private List<String> interests = new ArrayList<String>(); 
	
	User(ArrayList<String> myskills, ArrayList<String> myinterests){
		skills = myskills ; 
		interests = myinterests;
		// Creates array to hold all observers
		observers = new ArrayList<Observer>(); 
	}
	
	// Getters 
	public List<String> getSkills() { return skills; }
	public List<String> getInterests() {return interests;}
	
	public void joinRequest(Project project) {
		
	}

	@Override
	public void register(Observer newObserver) {
		observers.add(newObserver);
		
	}

	@Override
	public void unregister(Observer deleteObserver) {
		// Get index of observer to delete
		int observerIndex = observers.indexOf(deleteObserver);
		// Remove observer from ArrayList
		observers.remove(observerIndex);
		
	}

	@Override
	public void notifyObserver() {
		for (Observer observer : observers) {
			observer.update(employmentStatus, joinStatus);
		}
		
		
	} 
	
	// Changes employment status of the user and notifies observers of changes
	public void setEmploymentStatus(boolean newEmplStatus) {
		this.employmentStatus = newEmplStatus;
		notifyObserver();
	}
	
	// Changes join request status of the user and notifies observers of changes
		public void setJoinStatus(boolean newJoinStatus) {
			this.joinStatus = newJoinStatus;
			notifyObserver(); 
		}

}
