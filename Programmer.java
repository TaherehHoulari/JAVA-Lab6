
// LAB 6: YOU ARE REQUIRED TO MODIFY THIS CODE!!!

//Programmer.java

//Programmer - This is an abstract superclass that IMPLEMENTS the Payme interface.

//SOME MODIFICATION ARE REQUIRED IN THIS SECTION OF YOUR HERE - LOOK CLOSELY!!!

//public class Programmer  {
public abstract class Programmer implements Payme{//we need to defined this class in this way because this
	//is what exactly the explanation of the code mentioned above.

private String firstName;
private String lastName;
private String socialSecurityNumber;



//three-argument constructor
public Programmer(String first, String last, String ssn) {
 firstName = first;
 lastName = last;
 socialSecurityNumber = ssn;

}

/** CHANGES ARE REQUIRED IN THIS SECTION. 
* THINK OF THE BEST WAY TO ACCESS PRIVATE VARIABLES.
* IN THIS PORTION OF YOUR CODE INCLUDE ALL OF SUCH THAT APPLIES.
*/

// Start my code from here.


/**
 * first Name will be get.
 * @return the first Name for Programmer.
 */
public String getFirstName() {
	return firstName;
}


/**
 * setting the first Name
 * @param first  the first Name is set.
 */
public void setFirstName(String first) {
	 firstName = first;
}



/**
 * setting the last Name
 * @param last  the first Name is set.
 */

public void setLastName(String last) {
	 lastName = last;
}

/**
 * last Name will be get.
 * @return the last Name for Programmer.
 */

public String getLastName() {
	return lastName;
}


/**
 * setting the Social Security Number.
 * @param ssn the Social Security Number is set.
 */

public void setSocialSecurityNumber(String ssn) {
	socialSecurityNumber = ssn;
}

/**
 * Social Security Number will be get.
 * @return the Social Security Number for Programmer.
 */

public String getSocialSecurityNumber() {
	return socialSecurityNumber;
}

//End my code here.



//return String representation of Programmer object
@Override
public String toString() {
return String.format( "%s %s\nsocial security number: %s", 
  getFirstName(), getLastName(), getSocialSecurityNumber());
} 


//Note: We do NOT implement Payme method getPaymentAmount() here. 
// THEREFORE, TO AVOID A COMPILATION ERROR, YOU SHOULD DECLARE THIS CLASS AS....??
//Answer: We should declare this class as an abstract class to avoid a compilation error.


//public abstract double earnings(); /** No implementation here. DO YOU KNOW WHY? What should this method be?*/
public abstract double getPaymentAmount();
//Answer:Because the abstract method can only defined in abstract class.If we delete the abstract from this part of
// the code then it will works.Or from the first we should define the Programmer class as an abstract class.
//We can't have an abstract method in a concrete class. If we want an abstract method, the class must also be abstract.
} 


