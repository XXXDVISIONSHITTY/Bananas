package group3.form;

import group3.component.Item_People;
import group3.swing.ScrollBar;
import net.miginfocom.swing.MigLayout;

public class Menu_Left extends javax.swing.JPanel {

    public Menu_Left() {
        initComponents();
        init();
    }

    private void init() {
        sp.setVerticalScrollBar(new ScrollBar());
        menuList.setLayout(new MigLayout("fillx", "0[]0", "0[]0"));
        showMessage();
    }

    private void showMessage() {
        //test data
        menuList.removeAll();
        for (int i = 0; i < 20; i++) {
            menuList.add(new Item_People("People " + i), "wrap");
        }
        refreshMenuList();
    }

    private void showGroup() {
        //test data
        menuList.removeAll();
        for (int i = 0; i < 5; i++) {
            menuList.add(new Item_People("Group " + i), "wrap");
        }
        refreshMenuList();
    }

    private void showBlock() {
        //test data
        menuList.removeAll();
        for (int i = 0; i < 10; i++) {
            menuList.add(new Item_People("Block " + i), "wrap");
        }
        refreshMenuList();
    }

    private void refreshMenuList() {
        menuList.repaint();
        menuList.revalidate();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu = new javax.swing.JLayeredPane();
        menuMessage = new group3.component.MenuButton();
        menuGroup = new group3.component.MenuButton();
        menuBlock = new group3.component.MenuButton();
        sp = new javax.swing.JScrollPane();
        menuList = new javax.swing.JLayeredPane();

        setBackground(new java.awt.Color(249, 231, 159));

        menu.setBackground(new java.awt.Color(244, 208, 63 ));
        menu.setOpaque(true);
        menu.setLayout(new java.awt.GridLayout(1, 3));

        menuMessage.setIconSelected(new javax.swing.ImageIcon("src/group3/icon/message_selected.png")); // NOI18N
        menuMessage.setIconSimple(new javax.swing.ImageIcon("src/group3/icon/message.png"));
        menuMessage.setSelected(true);
        menuMessage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuMessageActionPerformed(evt);
            }
        });
        menu.add(menuMessage);

        menuGroup.setIcon(new javax.swing.ImageIcon("src/group3/icon/group.png"));
        menuGroup.setIconSelected(new javax.swing.ImageIcon("src/group3/icon/group_selected.png"));
        menuGroup.setIconSimple(new javax.swing.ImageIcon("src/group3/icon/group.png"));
        menuGroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuGroupActionPerformed(evt);
            }
        });
        menu.add(menuGroup);

        menuBlock.setIcon(new javax.swing.ImageIcon("src/group3/icon/Block.png")); // NOI18N
        menuBlock.setIconSelected(new javax.swing.ImageIcon("src/group3/icon/Block_selected.png")); // NOI18N
        menuBlock.setIconSimple(new javax.swing.ImageIcon("src/group3/icon/Block.png")); // NOI18N
        menuBlock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBlockActionPerformed(evt);
            }
        });
        menu.add(menuBlock);

        sp.setBackground(new java.awt.Color(255, 255, 255));
        sp.setBorder(null);
        sp.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        menuList.setBackground(new java.awt.Color(249, 231, 159));
        menuList.setOpaque(true);


        javax.swing.GroupLayout menuListLayout = new javax.swing.GroupLayout(menuList);
        menuList.setLayout(menuListLayout);
        menuListLayout.setHorizontalGroup(
            menuListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        menuListLayout.setVerticalGroup(
            menuListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 576, Short.MAX_VALUE)
        );

        sp.setViewportView(menuList);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sp)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sp)
                .addContainerGap())
        );
    }

    private void menuMessageActionPerformed(java.awt.event.ActionEvent evt) {
        if (!menuMessage.isSelected()) {
            menuMessage.setSelected(true);
            menuGroup.setSelected(false);
            menuBlock.setSelected(false);
            showMessage();
        }
    }

    private void menuGroupActionPerformed(java.awt.event.ActionEvent evt) {
        if (!menuGroup.isSelected()) {
            menuMessage.setSelected(false);
            menuGroup.setSelected(true);
            menuBlock.setSelected(false);
            showGroup();
        }
    }

    private void menuBlockActionPerformed(java.awt.event.ActionEvent evt) {
        if (!menuBlock.isSelected()) {
            menuMessage.setSelected(false);
            menuGroup.setSelected(false);
            menuBlock.setSelected(true);
            showBlock();
        }
    }


    private javax.swing.JLayeredPane menu;
    private group3.component.MenuButton menuBlock;
    private group3.component.MenuButton menuGroup;
    private javax.swing.JLayeredPane menuList;
    private group3.component.MenuButton menuMessage;
    private javax.swing.JScrollPane sp;

}
