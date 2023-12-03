package group3.component;

import group3.model.Model_Receive_Image;

import java.awt.Color;
<<<<<<< HEAD
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
=======
>>>>>>> refs/remotes/origin/main
import javax.swing.Icon;

public class Chat_Left extends javax.swing.JLayeredPane {
    private Chat_Item txt;
    public Chat_Left() {
        initComponents();
        txt.setBackground(new Color(242, 242, 242));
    }

    public void setText(String text) {
        if (text.equals("")) {
            txt.hideText();
        } else {
            txt.setText(text);
        }

    }

    public void setImage(Icon... image) {
        //txt.setImage(false, image); some error
    }

    public void setImage(Model_Receive_Image dataImage) {
        txt.setImage(false, dataImage);
    }

    public void setFile(String fileName, String fileSize) {
        txt.setFile(fileName, fileSize);
    }
    public void setEmoji(Icon icon) {
        txt.hideText();
        txt.setEmoji(false, icon);
    }
    public void setTime() {
<<<<<<< HEAD
        String currentTime = LocalTime.now().format(DateTimeFormatter.ofPattern("h:mm a"));
        txt.setTime(currentTime);//Test
=======
        txt.setTime("10:30 PM");//Test
>>>>>>> refs/remotes/origin/main
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        txt = new group3.component.Chat_Item();

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents

}
