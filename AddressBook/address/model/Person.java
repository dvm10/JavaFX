package address.model;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * Model class for a Person.
 *
 */
public class Person {
	
	private final IntegerProperty id; 
	private final StringProperty firstName;
    private final StringProperty lastName;
    private final StringProperty street;
    private final IntegerProperty postalCode;
    private final StringProperty city;
    private final DoubleProperty salary;

    /**
     * Default constructor.
     */
    public Person() {
        this(null, null, "0");
    }
    
    /**
     * Constructor with some initial data.
     * 
     * @param firstName
     * @param lastName
     */
    public Person(String firstName, String lastName, String id) {
       
    	this.id = new SimpleIntegerProperty(Integer.valueOf(id));
    	this.firstName = new SimpleStringProperty(firstName);
        this.lastName = new SimpleStringProperty(lastName);
        
        // Some initial dummy data, just for convenient testing.
        this.street = new SimpleStringProperty("some street");
        this.postalCode = new SimpleIntegerProperty(1234);
        this.city = new SimpleStringProperty("some city");      
        this.salary = new SimpleDoubleProperty(1000.00);
    }
    
    public Person(String id, String firstName, String lastName, String street, String postalcode, String city, String salary ) {
      
    	this.id = new SimpleIntegerProperty(Integer.valueOf(id));
    	this.firstName = new SimpleStringProperty(firstName);
        this.lastName = new SimpleStringProperty(lastName);
        
        this.street = new SimpleStringProperty(street);
        this.postalCode = new SimpleIntegerProperty(Integer.valueOf(postalcode));
        this.city = new SimpleStringProperty(city);
        this.salary = new SimpleDoubleProperty(Double.valueOf(salary));
    }
    
    public IntegerProperty IdProperty() {
		return id;
	}
    
    public int getId() {
		return id.get();
	}
    
    public String getFirstName() {
        return firstName.get();
    }

    public void setFirstName(String firstName) {
        this.firstName.set(firstName);
    }
    
    public StringProperty firstNameProperty() {
        return firstName;
    }

    public String getLastName() {
        return lastName.get();
    }

    public void setLastName(String lastName) {
        this.lastName.set(lastName);
    }
    
    public StringProperty lastNameProperty() {
        return lastName;
    }

    public String getStreet() {
        return street.get();
    }

    public void setStreet(String street) {
        this.street.set(street);
    }
    
    public StringProperty streetProperty() {
        return street;
    }
      

    public int getPostalCode() {
        return postalCode.get();
    }

    public void setPostalCode(int postalCode) {
        this.postalCode.set(postalCode);
    }
    
    public IntegerProperty postalCodeProperty() {
        return postalCode;
    }

    public String getCity() {
        return city.get();
    }

    public void setCity(String city) {
        this.city.set(city);
    }
    
    public StringProperty cityProperty() {
        return city;
    }
    
    public double getSalary() {
        return salary.get();
    }

    public void setSalary(double salary) {
        this.salary.set(salary);
    }
    
    public DoubleProperty salaryProperty() {
        return salary;
    }
    

  }