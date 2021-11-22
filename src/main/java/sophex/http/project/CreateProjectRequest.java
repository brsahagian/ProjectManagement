package sophex.http.project;

/** To work with AWS must not have final attributes, must have no-arg constructor, and all get/set methods. */
public class CreateProjectRequest {
	String name;

	public String getArg1() { return name; }
	public void setArg1(String name) { this.name = name; }
	

	public String toString() {
		return "Create(" + name + ")";
	}
	
	public CreateProjectRequest (String name) {
		this.name = name;
	}
	
	public CreateProjectRequest() {
	}
}