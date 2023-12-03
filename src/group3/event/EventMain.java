package group3.event;

import group3.model.Model_User_Account;

public interface EventMain {

    public void showLoading(boolean show);

    public void initChat();
    public void selectUser(Model_User_Account user);

    public void updateUser(Model_User_Account user);
}
