package CreditCard;

public class CreditCard { 
 // Declarations of fields omitted (see part (a)). 
 /** 
 * Constructs a new CreditCard object with the specified card number, 
 * cardholder name, and credit limit. The initial balance is set to $0.00. 
 * The issue date is set to today, and the expiry date is set to 1095 days 
 * from today (approximately 3 years from now, ignoring leap years). 
 */ 
 public CreditCard(int cardNumber, String name, Money limit) {...} 
 /** 
 * Returns the name of the person who was issued this credit card. 
 * 
 * @return the cardholder's name. 
 */ 
 public String getName() {...} 
 /** 
 * Returns the number of this credit card. 
 * 
 * @return the card number. 
 */ 
 public int getNumber() {...} 
 /** 
 * Returns this credit card's balance. 
 * 
 * @return the balance owing on this card. 
 */ 
 public Money getBalance() {...} 
 /** 
 * Returns this credit card's credit limit. 
 * 
 * @return the credit limit. 
 */ 
 public Money getLimit() {...} 
 /** 
 * Changes this credit card's credit limit to the specified amount. 
 * 
 * @param newLimit the new credit limit. 
 */ 
 public void setLimit(Money newLimit) {...} 
 /** 
 * Returns this credit card's issue date. 
 * 
 * @return the issue date. 
 */ 
 public Date getIssueDate() {...} 
 
 
 /** 
 * Returns this credit card's expiry date. 
 * 
 * @return the expiry date. 
 */ 
 public Date getExpiryDate() {...} 

 /** 
 * Changes this credit card's expiry date to the specified date. 
 * 
 * @param newExpiry the new expiry date. 
 */ 
 public void setExpiryDate(Date newExpiry) {...} 
 
 /** 
 * Determines if this credit card has expired. 
 * 
 * @return true if this credit card has expired, otherwise returns false. 
 */ 
 public boolean hasExpired() {...} 
 /** 
 * Attempts to charge the specified amount on this credit card; that is, trys to 
 * increase the card's balance owing by that amount. If the new balance would 
 * exceed the card's credit limit, the current balance is not changed. 
 * 
 * @param amount the amount of Money to charge on this card. 
 * @return true if the specified amount was charged to this card, false if 
 * the amount could not be charged, because the credit limit would 
 * be exceeded. 
 */ 
 public boolean charge(Money amount) {...} 
 /** 
 * Credits the specified amount to this credit card; that is, decreases the 
 * card's balance by that amount. 
 * 
 * @param amount the amount of Money to credit to this card.. 
 */ 
 public void credit(Money amount) {...} 
 /** 
 * Sets the annual interest rate to the specified amount. 
 * 
 * @param annualRate the annual percentage interest rate. For example, if the 
 * annual interest rate is 17.3%, the argument will be 17.3. 
 */ 
 public void setInterestRate(double annualRate) {...} 
 /** 
 * Calculates the monthly interest and increases the card's balance owing 
 * by that amount. 
 */ 
 public void addInterest() {...} 
 
 /** 
 * Returns a String containing information about this credit card. 
 * 
 * @return a string representation of this CreditCard object containing the 
 * cardholder's name, the card number, the expiry date, the credit limit and 
 * the balance owing. 
 */ 
 public String toString() {...} 
} 
