
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;


public class True_Fal extends javax.swing.JFrame {

    ButtonGroup bg;  
    int count=0,current=0,x=1,y=1,now=0;
    int m[]=new int[10];
    public True_Fal() {
        initComponents();
        bg=new ButtonGroup();
        bg.add(jb0);
        bg.add(jb1);
        bg.add(jb2);
                
          
        set();
    }
    void set()  
    {  
        jb2.setSelected(true);
        jb2.setVisible(false);
        if(current==0)  
        {  
            l.setText("Que1: Which one among these is not a primitive datatype?");  
            jb0.setText("True");jb1.setText("False");   
        }  
        if(current==1)  
        {  
            l.setText("Que2: Which class is available to all the class automatically?");  
            jb0.setText("True");jb1.setText("False");  
        }  
        if(current==2)  
        {  
            l.setText("Que3: Which package is directly available to our class without importing it?");  
            jb0.setText("True");jb1.setText("False"); 
        }  
        if(current==3)  
        {  
            l.setText("Que4: String class is defined in which package?");  
            jb0.setText("True");jb1.setText("False");
        }  
        if(current==4)  
        {  
            l.setText("Que5: Which institute is best for java coaching?");  
            jb0.setText("True");jb1.setText("False"); 
        }  
        if(current==5)  
        {  
            l.setText("Que6: Which one among these is not a keyword?");  
            jb0.setText("True");jb1.setText("False");  
        }  
        if(current==6)  
        {  
            l.setText("Que7: Which one among these is not a class? ");  
            jb0.setText("True");jb1.setText("False");  
        }  
        if(current==7)  
        {  
            l.setText("Que8: which one among these is not a function of Object class?");  
            jb0.setText("True");jb1.setText("False");        
        }  
        if(current==8)  
        {  
            l.setText("Que9: which function is not present in Applet class?");  
            jb0.setText("True");jb1.setText("False");
        }  
        if(current==9)  
        {  
            l.setText("Que10: Which one among these is not a valid component?");  
            jb0.setText("True");jb1.setText("False"); 
        }  
          
          
    }  
    boolean check()  
    {  
        if(current==0)  
            return(jb1.isSelected());  
        if(current==1)  
            return(jb0.isSelected());  
        if(current==2)  
            return(jb1.isSelected());  
        if(current==3)  
            return(jb0.isSelected());  
        if(current==4)  
            return(jb1.isSelected());  
        if(current==5)  
            return(jb0.isSelected());  
        if(current==6)  
            return(jb1.isSelected());  
        if(current==7)  
            return(jb0.isSelected());  
        if(current==8)  
            return(jb1.isSelected());  
        if(current==9)  
            return(jb1.isSelected());
        return false;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        l = new javax.swing.JLabel();
        jb0 = new javax.swing.JRadioButton();
        jb1 = new javax.swing.JRadioButton();
        b1 = new javax.swing.JButton();
        jb2 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        l.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        l.setForeground(new java.awt.Color(204, 204, 255));
        l.setText("jLabel1");

        jb0.setBackground(new java.awt.Color(51, 51, 51));
        jb0.setForeground(new java.awt.Color(204, 204, 204));
        jb0.setBorder(null);

        jb1.setBackground(new java.awt.Color(51, 51, 51));
        jb1.setForeground(new java.awt.Color(204, 204, 204));
        jb1.setBorder(null);

        b1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        b1.setText("Next");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        jb2.setBackground(new java.awt.Color(51, 51, 51));
        jb2.setBorder(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(b1)
                .addGap(70, 70, 70))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(l, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jb0, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                        .addComponent(jb1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(212, 212, 212))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(jb2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(l)
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jb1)
                    .addComponent(jb0))
                .addGap(35, 35, 35)
                .addComponent(jb2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
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
                new True_Fal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jb0;
    private javax.swing.JRadioButton jb1;
    private javax.swing.JRadioButton jb2;
    private javax.swing.JLabel l;
    // End of variables declaration//GEN-END:variables
}
