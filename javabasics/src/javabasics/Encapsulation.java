package javabasics;
//Encapsulation is the mechanism for restricting access to an object’s components.
/*the encapsulation
mechanism protects the members of a class from external access, in order to be
protected against unauthorized access.Also, encapsulation
provides the ability to modify our implemented code without breaking the code of
others who use our code. Thus, using encapsulation we can achieve maintainability,
flexibility and extensibility of our code.
 * 
 * 
 * A private member or method is accessible only within its own
class. Finally, a protected member is accessible within its class, its sub-classes and in all classes that reside in the same package.
by using encapsulation while coding our applications, we
.Combine the data of our application and its manipulation in one place.
.Allow the state of an object to be accessed and modified through behaviors.
.Hide the implementation details of an object.
.Reduce the coupling of modules and increase the cohesion inside them.
.Create immutable classes that can be used in multi-threaded environments.
 */
public class Encapsulation {
	private String username = null;
 private String password = null;
	private String firstname = null;
	private String lastname = null;
	 private String email = null;
	 public Encapsulation(String username, String password, String firstname, String lastname,
			String email) {
		 this.username = username;
			this.password = password;
			this.firstname = firstname;
			 this.lastname = lastname;
			this.email = email;
			}
	 //For each member we provide a setter and a getter method, in order to change and retrieve the value of a
	 //member respectively.
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
@Override
public String toString(){
	return "<"+username+","+password+", " + email + ", "
			 + firstname + ", " + lastname + ">";
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*A very important feature of encapsulation is the ability to change the
implementation of a method, without changing the provided API. Also, if we want to alter or extend the functionality of a User, all changes will
be applied in this class only. Thus, the extensibility and maintainability of our code increase.
 * 
 */
		Encapsulation user = new Encapsulation("Albin","Denil","Manu","Shebin","Jithin");
		System.out.println("User:"+user.toString()+"\n");
		user.setUsername("sen");
		System.out.println("My new username is "+user.getUsername()+"\n");
		System.out.println("My password is: " + user.getPassword());
		 System.out.println("I am about to change my password...\n");
		
		 user.setPassword("JavaCodeGeeks!");
		 System.out.println("My new password is: " + user.getPassword());
	}

}
