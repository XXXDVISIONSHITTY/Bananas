package group3;

import com.formdev.flatlaf.intellijthemes.FlatArcIJTheme;
import group3.event.EventImageView;
import group3.event.EventMain;
import group3.event.PublicEvent;
import group3.form.View_Image;
import group3.swing.ComponentResizer;
import group3.service.Service;
import group3.model.Model_User_Account;
import javax.swing.*;
import java.awt.*;

public class Main extends javax.swing.JFrame {

    private group3.swing.PictureBox pic;
    public Main() {
        initComponents();
        init();
    }

    private void init() {
        setIconImage(new ImageIcon("src/group3/icon/icon.png").getImage());
        ComponentResizer com = new ComponentResizer();
        com.registerComponent();
        com.setMinimumSize(new Dimension(900, 500));
        com.setMaximumSize(Toolkit.getDefaultToolkit().getScreenSize());
        com.setSnapSize(new Dimension(10,10));
        login.setVisible(true);
        loading.setVisible(false);
        vIew_Image.setVisible(false);
        home.setVisible(false);
        initEvent();
        Service.getInstance().startServer();

    }

    private void initEvent() {
        PublicEvent.getInstance().addEventMain(new EventMain() {
            @Override
            public void showLoading(boolean show) {
                loading.setVisible(show);
            }

            @Override
            public void initChat() {
                home.setVisible(true);
                login.setVisible(false);
                Service.getInstance().getClient().emit("list_user", Service.getInstance().getUser().getUserID());
            }
            @Override
            public void selectUser(Model_User_Account user) {
                home.setUser(user);
            }
            @Override
            public void updateUser(Model_User_Account user) {
                home.updateUser(user);
            }
        });
        PublicEvent.getInstance().addEventImageView(new EventImageView() {
            @Override
            public void viewImage(Icon image) {
                vIew_Image.viewImage(image);
            }

            @Override
            public void saveImage(Icon image) {
                System.out.println("Save Image next update");
            }

        });
    }

    @SuppressWarnings("unchecked")

    private void initComponents() {

        pic = new group3.swing.PictureBox();
        border = new javax.swing.JPanel();
        background = new javax.swing.JPanel();
        title = new javax.swing.JPanel();
        cmdMinimize = new javax.swing.JButton();
        cmdClose = new javax.swing.JButton();
        body = new javax.swing.JLayeredPane();
        loading = new group3.form.Loading();
        login = new group3.form.Login();
        vIew_Image = new View_Image();
        home = new group3.form.Home();


        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        border.setBackground(new java.awt.Color(93, 173, 226  ));

        background.setBackground(new java.awt.Color(241, 196, 15 ));

        title.setBackground(new java.awt.Color(212, 172, 13 ));
        title.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                titleMouseDragged(evt);
            }
        });
        title.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                titleMousePressed(evt);
            }
        });

        cmdMinimize.setIcon(new javax.swing.ImageIcon("src/group3/icon/minimize.png")); // NOI18N
        cmdMinimize.setBorder(null);
        cmdMinimize.setContentAreaFilled(false);
        cmdMinimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmdMinimize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdMinimizeActionPerformed(evt);
            }
        });
        cmdClose.setIcon(new javax.swing.ImageIcon("src/group3/icon/close.png")); // NOI18N
        cmdClose.setBorder(null);
        cmdClose.setContentAreaFilled(false);
        cmdClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmdClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout titleLayout = new javax.swing.GroupLayout(title);
        title.setLayout(titleLayout);
        titleLayout.setHorizontalGroup(
            titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, titleLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cmdMinimize)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmdClose)
                .addContainerGap())
        );
        titleLayout.setVerticalGroup(
            titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titleLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmdClose, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                    .addComponent(cmdMinimize, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        body.setLayout(new java.awt.CardLayout());
        body.add(loading, "card5");
        body.add(login, "card4");
        body.setLayer(vIew_Image, javax.swing.JLayeredPane.POPUP_LAYER);
        body.add(vIew_Image, "card3");
        body.add(home, "card2");

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(title, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, 1210, Short.MAX_VALUE)
                .addContainerGap())
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout borderLayout = new javax.swing.GroupLayout(border);
        border.setLayout(borderLayout);
        borderLayout.setHorizontalGroup(
            borderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(borderLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1, 1, 1))
        );
        borderLayout.setVerticalGroup(
            borderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(borderLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1, 1, 1))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(border, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(border, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }

    private int pX;
    private int pY;
    private void titleMouseDragged(java.awt.event.MouseEvent evt) {
        this.setLocation(this.getLocation().x + evt.getX() - pX, this.getLocation().y + evt.getY() - pY);
    }

    private void titleMousePressed(java.awt.event.MouseEvent evt) {
        pX = evt.getX();
        pY = evt.getY();
    }

    private void cmdCloseActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }

    private void cmdMinimizeActionPerformed(java.awt.event.ActionEvent evt) {
        this.setState(JFrame.ICONIFIED);
    }

    public static void main(String args[]) {
        FlatArcIJTheme.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Main().setVisible(true);
            }
        });
    }


    private javax.swing.JPanel background;
    private javax.swing.JLayeredPane body;
    private javax.swing.JPanel border;
    private javax.swing.JButton cmdClose;
    private javax.swing.JButton cmdMinimize;
    private group3.form.Home home;
    private group3.form.Loading loading;
    private group3.form.Login login;
    private javax.swing.JPanel title;
    private View_Image vIew_Image;
}
