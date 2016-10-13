package MovieClassLayer;

public class Actor {


	public String ActorID;
	public String ActorName;
	public Actor(String DID, String DName)
	{
		this.ActorID= DID;
		this.ActorName= DName;
	}

	public Actor(){

		this.ActorID= null;
		this.ActorName= null;
	}
}
