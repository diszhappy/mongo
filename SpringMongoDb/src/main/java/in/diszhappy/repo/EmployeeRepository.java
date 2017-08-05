/**
 * 
 */
package in.diszhappy.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import in.diszhappy.document.Employee;

/**
 * @author Saumm
 * Created on 30-Jul-2017 1:33:09 AM
 */
public interface EmployeeRepository extends MongoRepository<Employee, String> {

}
