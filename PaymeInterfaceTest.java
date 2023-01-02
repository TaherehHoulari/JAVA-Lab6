
// LAB 6: PaymeInterfaceTest.java

//This is the test for your interface Payme.

	/**
	 * Lab 6 Commission Based Programmer 
	 * @author SeyedehTahereh houlari 
	 * @see Payme
	 * @see Programmer
	 * @see SalariedProgrammer
	 * @see Invoice
	 * @see HourlyProgrammer
	 * @see CommissionProgrammer
	 * @see BasePlusCommissionProgrammer
	 * @version 1.0
	 * @since 11
	 */


public class PaymeInterfaceTest  {
	/**
	 * the main program of the interface Payme and the subclasses of the 
	 * superclass Programmer and their implementation.
	 * @param args no arguments 
	 */
	
public static void main(String[] args) {

	 
 //TO DO: IN THIS PORTION OF THE CODE, SEVERAL CHANGES SHOULD BE MADE:
// CREATE SIX-ELEMENTS Payme array HERE 
	
 //START CODE 
	Payme[] paymeObjects = new Payme[ 6 ];
//END CODE
 

// TO DO: POPULATE THE ARRAY YOU CREATED WITH OBJECTS THAT IMPLEMENT Payable
//CHECK THE OUTPUT FILE AND REUSE EXACTLY THE DETAILS PROVIDED SUCH AS FIRST NAME
// LAST NAME, SOCIAL INSURANCE NUMBER, ETC.

 // START CODE
	paymeObjects[ 0 ] = new Invoice( "22776", "brakes", 3, 300.00 );
	paymeObjects[ 1 ] = new Invoice( "33442", "gear", 5, 90.99 );
	paymeObjects[ 2 ] =new SalariedProgrammer( "Tahereh", "Houlari", "345-67-0001",320.00);
	paymeObjects[ 3 ] =new HourlyProgrammer( "Amara", "Houlari", "234-56-7770", 18.95, 40.00 );
	paymeObjects[ 4 ] =new CommissionProgrammer( "Peter", "Goodman", "123-45-6999", 16500.00, 0.44 );
	paymeObjects[ 5 ] =new BasePlusCommissionProgrammer( "Esther", "Patel", "102-34-5888", 1200.00, 0.04, 720.00);
// END CODE


 System.out.println(
    "Payment for Invoices and Programmers are processed polymorphically:\n"); 
 

 // generically process each element in array paymeObjects
 for (Payme currentPayme : paymeObjects) {
    // output currentPayme and its appropriate payment amount
	 				System.out.printf("%s \n", currentPayme.toString()); 
	 				
    if (currentPayme instanceof BasePlusCommissionProgrammer) {
       // downcast Payme reference to 
       // BasePlusCommissioProgrammer reference
       BasePlusCommissionProgrammer programmer = 
          (BasePlusCommissionProgrammer) currentPayme;

       double oldBaseSalary = programmer.getBaseSalary();
       programmer.setBaseSalary(1.10 * oldBaseSalary);
       System.out.printf(
         "new base salary with 10%%  increase is: $%,.2f\n",
         programmer.getBaseSalary());

    }
// TO DO: INSERT YOUR PRINT STATEMENT HERE: ENSURE THAT YOUR 
// OUTPUT FOLLOWS THE OUTPUT SAMPLE PROVIDED

// START CODE 
   // System.out.printf(currentPayme.toString());
   // System.out.printf( "%s \n%s: $%,.2f\n\n\n", currentPayme.toString(), "payment due", currentPayme.getPaymentAmount() );
    System.out.printf("payment due: $%,.2f\n\n", currentPayme.getPaymentAmount());
    // END CODE

 }
}
}



