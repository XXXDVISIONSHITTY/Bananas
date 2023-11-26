/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group3.form;

import group3.component.Item_People;
import group3.swing.ScrollBar;
import net.miginfocom.swing.MigLayout;

public class Menu_Right extends javax.swing.JPanel {

    /*Creates new form Menu_Left*/
    public Menu_Right() {
        initComponents();
        init();
    }
    private void init() {
        sp.setVerticalScrollBar(new ScrollBar());
        menuList.setLayout(new MigLayout("fillx", "0[]0", "0[]0"));
        showBox();
    }
    private void showBox() {
        //test data
        menuList.removeAll();
        for (int i = 0; i < 10; i++) {
            menuList.add(new Item_People("Box " + i), "wrap");
        }
        refreshMenuList();
    }

    private void refreshMenuList() {
        menuList.repaint();
        menuList.revalidate();
    }

    @SuppressWarnings("unchecked")
    private void initComponents(){

        menu = new javax.swing.JLayeredPane();
        menuBox = new group3.component.MenuButton();
        sp = new javax.swing.JScrollPane();
        menuList = new javax.swing.JLayeredPane();

        setBackground(new java.awt.Color(249, 231, 159));

        menu.setBackground(new java.awt.Color(244, 208, 63 ));
        menu.setOpaque(true);
        menu.setLayout(new java.awt.GridLayout(1, 3));

        menuBox.setIcon(new javax.swing.ImageIcon("src/group3/icon/box.png")); // NOI18N
        menuBox.setIconSelected(new javax.swing.ImageIcon("src/group3/icon/box_selected.png")); // NOI18N
        menuBox.setIconSimple(new javax.swing.ImageIcon("src/group3/icon/box.png")); // NOI18N
        menuBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBoxActionPerformed(evt);
            }
        });
        menu.add(menuBox);

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
    private void menuBoxActionPerformed(java.awt.event.ActionEvent evt) {
        if (!menuBox.isSelected()) {
            menuBox.setSelected(true);
        }
    }


    private javax.swing.JLayeredPane menu;
    private group3.component.MenuButton menuBox;
    private javax.swing.JLayeredPane menuList;
    private javax.swing.JScrollPane sp;

}
