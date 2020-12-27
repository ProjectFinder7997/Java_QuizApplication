
import java.awt.*;  
import java.awt.event.*;  
import javax.swing.*;  
public class True_False extends javax.swing.JFrame {

   
    ButtonGroup bg;  
    int count=0,current=0,x=1,y=1,now=0;
    int m[]=new int[10];
    public True_False() {
        initComponents();
        bg=new ButtonGroup();
        bg.add(jb0);
        bg.add(jb1);
        bg.add(jb2);
        bg.add(jb3);
        bg.add(jb4);
        
          
        set();
         
        
    }
   
    void set()  
    {  
        jb4.setSelected(true);
        jb4.setVisible(false);
        if(current==0)  
        {  
            l.setText("Que1: Which one among these is not a primitive datatype?");  
            jb0.setText("int");jb1.setText("Float");jb2.setText("boolean");jb3.setText("char");   
        }  
        if(current==1)  
        {  
            l.setText("Que2: Which class is available to all the class automatically?");  
            jb0.setText("Swing");jb1.setText("Applet");jb2.setText("Object");jb3.setText("ActionEvent");  
        }  
        if(current==2)  
        {  
            l.setText("Que3: Which package is directly available to our class without importing it?");  
            jb0.setText("swing");jb1.setText("applet");jb2.setText("net");jb3.setText("lang");  
        }  
        if(current==3)  
        {  
            l.setText("Que4: String class is defined in which package?");  
            jb0.setText("lang");jb1.setText("Swing");jb2.setText("Applet");jb3.setText("awt");  
        }  
        if(current==4)  
        {  
            l.setText("Que5: Which institute is best for java coaching?");  
            jb0.setText("Utek");jb1.setText("Aptech");jb2.setText("SSS IT");jb3.setText("jtek");  
        }  
        if(current==5)  
        {  
            l.setText("Que6: Which one among these is not a keyword?");  
            jb0.setText("class");jb1.setText("int");jb2.setText("get");jb3.setText("if");  
        }  
        if(current==6)  
        {  
            l.setText("Que7: Which one among these is not a class? ");  
            jb0.setText("Swing");jb1.setText("Actionperformed");jb2.setText("ActionEvent");jb3.setText("Button");  
        }  
        if(current==7)  
        {  
            l.setText("Que8: which one among these is not a function of Object class?");  
            jb0.setText("toString");jb1.setText("finalize");jb2.setText("equals");  
                        jb3.setText("getDocumentBase");         
        }  
        if(current==8)  
        {  
            l.setText("Que9: which function is not present in Applet class?");  
            jb0.setText("init");jb1.setText("main");jb2.setText("start");jb3.setText("destroy");  
        }  
        if(current==9)  
        {  
            l.setText("Que10: Which one among these is not a valid component?");  
            jb0.setText("JButton");jb1.setText("JList");jb2.setText("JButtonGroup");  
                        jb3.setText("JTextArea");  
        }  
          
          
    }  
    boolean check()  
    {  
        if(current==0)  
            return(jb1.isSelected());  
        if(current==1)  
            return(jb2.isSelected());  
        if(current==2)  
            return(jb3.isSelected());  
        if(current==3)  
            return(jb0.isSelected());  
        if(current==4)  
            return(jb2.isSelected());  
        if(current==5)  
            return(jb2.isSelected());  
        if(current==6)  
            return(jb1.isSelected());  
        if(current==7)  
            return(jb3.isSelected());  
        if(current==8)  
            return(jb1.isSelected());  
        if(current==9)  
            return(jb2.isSelected());  
        return false;  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        l = new javax.swing.JLabel();
        jb0 = new javax.swing.JRadioButton();
        jb1 = new javax.swing.JRadioButton();
        jb2 = new javax.swing.JRadioButton();
        jb3 = new javax.swing.JRadioButton();
        b1 = new javax.swing.JButton();
        jb4 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        l.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        l.setForeground(new java.awt.Color(204, 204, 204));
        l.setText("jLabel1");

        jb0.setBackground(new java.awt.Color(51, 51, 51));
        jb0.setForeground(new java.awt.Color(204, 204, 255));
        jb0.setBorder(null);

        jb1.setBackground(new java.awt.Color(51, 51, 51));
        jb1.setForeground(new java.awt.Color(204, 204, 255));
        jb1.setBorder(null);

        jb2.setBackground(new java.awt.Color(51, 51, 51));
        jb2.setForeground(new java.awt.Color(204, 204, 255));
        jb2.setBorder(null);

        jb3.setBackground(new java.awt.Color(51, 51, 51));
        jb3.setForeground(new java.awt.Color(204, 204, 255));
        jb3.setBorder(null);

        b1.setText("Next");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        jb4.setBackground(new java.awt.Color(51, 51, 51));
        jb4.setForeground(new java.awt.Color(204, 204, 255));
        jb4.setBorder(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(l, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jb0, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                            .addComponent(jb2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jb1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jb3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(167, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(b1)
                .addGap(83, 83, 83))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jb4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(l)
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jb1)
                    .addComponent(jb0))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jb3)
                    .addComponent(jb2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(jb4)
                .addGap(30, 30, 30)
                .addComponent(b1)
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        if(evt.getSource()==b1)  
        {  
            if(check())  
                count=count+1;  
            current++;  
            set();    
            if(current==9)  
            {  
                  
                b1.setText("Result");  
            }  
        }
        if(evt.getActionCommand().equals("Result"))  
        {  
            if(check())  
                count=count+1;  
            current++;  
            //System.out.println("correct ans="+count);  
            JOptionPane.showMessageDialog(this,"correct ans="+count);  
            System.exit(0);  
        }
    }//GEN-LAST:event_b1ActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new True_False().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jb0;
    private javax.swing.JRadioButton jb1;
    private javax.swing.JRadioButton jb2;
    private javax.swing.JRadioButton jb3;
    private javax.swing.JRadioButton jb4;
    private javax.swing.JLabel l;
    // End of variables declaration//GEN-END:variables
}
