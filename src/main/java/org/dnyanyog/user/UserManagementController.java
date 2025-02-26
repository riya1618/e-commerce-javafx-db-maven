package org.dnyanyog.user;

import org.dnyanyog.add_user.AddUser;
import org.dnyanyog.delete_user.DeleteUser;
import org.dnyanyog.search_user.SearchUser;
import org.dnyanyog.update_user.UpdateUser;
import org.dnyanyog.welcome.WelcomeScreen;

public class UserManagementController {
	
	public void addUserButtonClick() throws Exception {
		new AddUser().show();
	}
	public void updateUserButtonClick() throws Exception {
		new UpdateUser().show();
	}
	public void seachUserButtonClick() throws Exception {
		new SearchUser().show();
	}
	public void deleteUserButtonClick() throws Exception {
		new DeleteUser().show();
	}
	public void backButtonClick() throws Exception {
		new WelcomeScreen().show();
	}

}
