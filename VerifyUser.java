/**
 * @Author : Ali Demir
 *
 * @email : gsalidemir@gmail.com
 * 
 * Date : 18 October 2017
 *
 */

// importing necessary classes
import java.util.Optional;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.scene.control.TextInputDialog;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class VerifyUser extends Application {
	
	// initializing admin username and pasword
	String adminusername = "alidemir";
	String adminpassword = "123456";

	public void start(Stage primaryStage) {
		// getting username	
		TextInputDialog inputdialog = new TextInputDialog();
		inputdialog.setContentText("Enter your username");
		inputdialog.setHeaderText(null);
		inputdialog.setTitle("User verification");
		Optional<String> username = inputdialog.showAndWait();
		String stringusername = username.get();

		// getting password
		TextInputDialog inputdialog2 = new TextInputDialog();
		inputdialog2.setContentText("Enter your password");
		inputdialog2.setHeaderText(null);
		inputdialog2.setTitle("User Verification");
		Optional<String> password = inputdialog2.showAndWait();
		String stringpassword = password.get();

		// verification message
		if (stringpassword.equals(adminpassword) && stringusername.equals(adminusername)) 
		{
			Alert informationalert = new Alert(AlertType.INFORMATION);
			informationalert.setTitle("User Verification");
			informationalert.setHeaderText(null);
			informationalert.setContentText("Welcome \t" + stringusername);
			informationalert.showAndWait();
		}
		// error message
		else
		{
			Alert erroralert = new Alert(AlertType.ERROR);
			erroralert.setTitle("User Verification");
			erroralert.setHeaderText(null);
			erroralert.setContentText("Your username or password has not been confirmed");
			erroralert.showAndWait();
		}
	}
}
