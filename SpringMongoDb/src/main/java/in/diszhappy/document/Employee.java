package in.diszhappy.document;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
/**
 * 
 * @author Saumm
 * Created on 30-Jul-2017 1:20:01 AM
 */
@Document(collection = "employee")
public class Employee implements Serializable{

	private static final long serialVersionUID = 6093427082682116682L;

	@Id
    private long id;

    @Indexed(unique = true)
    private String name;
    private String email;
    private String department;
    private String address;

	/**
	 * Added By Saumm on 06-Aug-2017 1:17:14 AM
	 * @return the department
	 */
	public String getDepartment() {
		return department;
	}

	/**
	 * Added By Saumm on 06-Aug-2017 1:17:14 AM
	 * @param department the department to set
	 */
	public void setDepartment(String department) {
		this.department = department;
	}

	/**
	 * Added By Saumm on 06-Aug-2017 1:17:14 AM
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * Added By Saumm on 06-Aug-2017 1:17:14 AM
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * Added By Saumm on 30-Jul-2017 1:20:47 AM
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * Added By Saumm on 30-Jul-2017 1:20:47 AM
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * Added By Saumm on 30-Jul-2017 1:20:47 AM
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Added By Saumm on 30-Jul-2017 1:20:47 AM
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Added By Saumm on 30-Jul-2017 1:20:47 AM
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Added By Saumm on 30-Jul-2017 1:20:47 AM
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
    
    

    
}