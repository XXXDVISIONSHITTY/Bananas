package group3.form;

import group3.component.Chat_Body;
import group3.component.Chat_Bottom;
import group3.event.EventChat;
import group3.event.PublicEvent;
import group3.model.Model_Receive_Message;
import group3.model.Model_Send_Message;
import group3.model.Model_User_Account;
import net.miginfocom.swing.MigLayout;

public class Menu_Right extends javax.swing.JPanel {
    private Chat_Body chatBody;
    private Chat_Bottom chatBottom;

    public Menu_Right() {
        initComponents();
        init();
        setUser(new Model_User_Account(0, "NULL","","",true));
    }

    private void init() {
        setLayout(new MigLayout("fillx", "[fill]", "[100%, fill]0[shrink 0]0"));
        chatBody = new Chat_Body();
        chatBottom = new Chat_Bottom();
        PublicEvent.getInstance().addEventGroup(new EventChat() {
            @Override
            public void sendMessage(Model_Send_Message data) {
                if (data.getToUserID() == 0) {
                    chatBody.addItemRight(data);
                }
            }

            @Override
            public void receiveMessage(Model_Receive_Message data) {
                if (chatBottom.getUser().getUserID() == data.getFromUserID()) {
                    chatBody.addItemLeft(data);
                }
            }
        });
        add(chatBody, "wrap");
        add(chatBottom, "h ::50%");
    }

    public void setUser(Model_User_Account user) {
        chatBottom.setUser(user);
        chatBody.clearChat();
    }

    public void updateUser(Model_User_Account user) {
        // Update user information if needed
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        setBackground(new java.awt.Color(245, 207, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 727, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 681, Short.MAX_VALUE)
        );
    }
}
