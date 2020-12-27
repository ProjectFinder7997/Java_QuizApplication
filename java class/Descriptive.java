
import javax.swing.JOptionPane;


public class Descriptive extends javax.swing.JFrame {

    
    int count=0,current=0,x=1,y=1,now=0;
    int m[]=new int[10];
    public Descriptive() {
        initComponents();
        set();
    }
    void set()  
    {  
        
        if(current==0)  
        {  
            l.setText("Que1: Which one among these is not a primitive datatype?");  
               
        }  
        if(current==1)  
        {  
            l.setText("Que2: Which class is available to all the class automatically?");  
            ans.setText("");  
        }  
        if(current==2)  
        {  
            l.setText("Que3: Which package is directly available to our class without importing it?");  
             ans.setText("");
        }  
        if(current==3)  
        {  
            l.setText("Que4: String class is defined in which package?");  
            ans.setText("");
        }  
        if(current==4)  
        {  
            l.setText("Que5: Which institute is best for java coaching?");  
            ans.setText("");
        }  
        if(current==5)  
        {  
            l.setText("Que6: Which one among these is not a keyword?");  
            ans.setText(""); 
        }  
        if(current==6)  
        {  
            l.setText("Que7: Which one among these is not a class? ");  
            ans.setText(""); 
        }  
        if(current==7)  
        {  
            l.setText("Que8: which one among these is not a function of Object class?");  
            ans.setText("");        
        }  
        if(current==8)  
        {  
            l.setText("Que9: which function is not present in Applet class?");  
            ans.setText("");
        }  
        if(current==9)  
        {  
            l.setText("Que10: Which one among these is not a valid component?");  
            ans.setText(""); 
        }  
          
          
    }
    boolean check()  
    {  
        if(current==0)  
            return(ans.getText().equals("Float"));  
        if(current==1)  
            return(ans.getText().equals("Float"));  
        if(current==2)  
            return(ans.getText().equals("Float"));  
        if(current==3)  
            return(ans.getText().equals("Float"));  
        if(current==4)  
            return(ans.getText().equals("Float"));  
        if(current==5)  
            return(ans.getText().equals("Float"));  
        if(current==6)  
            return(ans.getText().equals("Float")); 
        if(current==7)  
            return(ans.getText().equals("Float"));  
        if(current==8)  
            return(ans.getText().equals("Float"));  
        if(current==9)  
            return(ans.getText().equals("Float"));
        return false;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        l = new javax.swing.JLabel();
        ans = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        b1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        l.setBackground(new java.awt.Color(51, 51, 51));
        l.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        l.setForeground(new java.awt.Color(204, 204, 255));
        l.setText("jLabel1");

        ans.setBackground(new java.awt.Color(51, 51, 51));
        ans.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        ans.setForeground(new java.awt.Color(204, 204, 204));
        ans.setBorder(null);
        ans.setPreferredSize(new java.awt.Dimension(20, 17));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        b1.setText("Next");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(51, 51, 51));
        jLabel2.setForeground(new java.awt.Color(204, 204, 255));
        jLabel2.setText("Note : Enter first letter as capital and remaining letters must be small.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(l, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(b1))
                .addGap(68, 68, 68))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ans, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(l)
                .addGap(78, 78, 78)
                .addComponent(ans, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jLabel2)
                .addGap(37, 37, 37)
                .addComponent(b1)
                .addGap(46, 46, 46))
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
        // TODO add your handling code here:
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
                new Descriptive().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ans;
    private javax.swing.JButton b1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel l;
    // End of variables declaration//GEN-END:variables
}
