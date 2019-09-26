package address.view;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.sql.Connection;
import java.sql.SQLException;

import address.model.Person;
import database.DBConnection;
import database.DBoperation;
import javafx.event.ActionEvent;

public class PersonEditDialogController {
	@FXML
	private TextField firstNameField;
	@FXML
	private TextField lastNameField;
	@FXML
	private TextField streetField;
	@FXML
	private TextField cityField;
	@FXML
	private TextField postalCodeField;
	
	
	
	 private Stage dialogStage;
	 private Person person;
	 private boolean okClicked = false;
	 
	 /**
	     * Sets the stage of this dialog.
	     * 
	     * @param dialogStage
	     */
	    public void setDialogStage(Stage dialogStage) {
	        this.dialogStage = dialogStage;
	    }
	    
	    
	    /**
	     * Sets the person to be edited in the dialog.
	     * 
	     * @param person
	     */
	    public void setPerson(Person person) {
	        this.person = person;
	        firstNameField.setText(person.getFirstName());
	        lastNameField.setText(person.getLastName());
	        streetField.setText(person.getStreet());
	        postalCodeField.setText(Integer.toString(person.getPostalCode()));
	        cityField.setText(person.getCity());
	    }

	// Event Listener on Button.onAction
	@FXML
	public void handleOk(ActionEvent event) throws SQLException {
		   if (isInputValid()) {
	            person.setFirstName(firstNameField.getText());
	            person.setLastName(lastNameField.getText());
	            person.setStreet(streetField.getText());
	            person.setPostalCode(Integer.parseInt(postalCodeField.getText()));
	            person.setCity(cityField.getText());
	           
	            
	            DBConnection database = new DBConnection();	           
	            DBoperation.addressBookUpdate(database, person);  
	                        
	            dialogStage.close();
	        }
	}
	// Event Listener on Button.onAction
	@FXML
	public void handleCancel(ActionEvent event) {
		  dialogStage.close();
	}
		
	 /**
     * Validates the user input in the text fields.
     * 
     * @return true if the input is valid
     */
    private boolean isInputValid() {
        String errorMessage = "";

        if (firstNameField.getText() == null || firstNameField.getText().length() == 0) {
            errorMessage += "No valid first name!\n"; 
        }
        if (lastNameField.getText() == null || lastNameField.getText().length() == 0) {
            errorMessage += "No valid last name!\n"; 
        }
        if (streetField.getText() == null || streetField.getText().length() == 0) {
            errorMessage += "No valid street!\n"; 
        }

        if (postalCodeField.getText() == null || postalCodeField.getText().length() == 0) {
            errorMessage += "No valid postal code!\n"; 
        } else {
            // try to parse the postal code into an int.
            try {
                Integer.parseInt(postalCodeField.getText());
            } catch (NumberFormatException e) {
                errorMessage += "No valid postal code (must be an integer)!\n"; 
            }
        }

        if (cityField.getText() == null || cityField.getText().length() == 0) {
            errorMessage += "No valid city!\n"; 
        }

      

        if (errorMessage.length() == 0) {
            return true;
        } else {
            // Show the error message.
            Alert alert = new Alert(AlertType.ERROR);
            alert.initOwner(dialogStage);
            alert.setTitle("Invalid Fields");
            alert.setHeaderText("Please correct invalid fields");
            alert.setContentText(errorMessage);
            
            alert.showAndWait();
            
            return false;
        }
    }
	
	
	
	
}
