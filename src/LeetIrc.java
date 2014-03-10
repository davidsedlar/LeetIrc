import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.javaparts.dde.DDE;
import com.javaparts.dde.DDEException;



@SuppressWarnings("serial")
public class LeetIrc extends javax.swing.JFrame {
	DDE mirc;
    
    public LeetIrc() 
    {
		mirc = new DDE();
        initComponents();
    }
    
    public void dde(String command)
	{
		try {
		    mirc.connect("mIRC", "COMMAND");
		    mirc.poke("COMMAND",command.getBytes());
		    mirc.disconnect();
		} catch (DDEException e) {
		    System.out.println(e);
		}
	}
	
	public String nick()
	{
		String a=null;
		byte[] b;
		try {
		    mirc.connect("mIRC", "NICKNAME");
		    b=mirc.request("NICKNAME");
		    a=new String(b);
		    mirc.disconnect();
		} catch (DDEException e) {
		    System.out.println(e);
		}
		return a;
	}
	
	public String users()
	{
		String a=null;
		byte[] b;
		try {
		    mirc.connect("mIRC", "USERS");
		    b=mirc.request("#kabl");
		    a=new String(b,6,b.length-6);
		    mirc.disconnect();
		} catch (DDEException e) {
		    System.out.println(e);
		}
		return a;
	}
    
    public void initComponents() 
    {
    	JPanel tabla=new JPanel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton14 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        	
	    Toolkit tk=Toolkit.getDefaultToolkit();
		Dimension d=tk.getScreenSize();
		Container vsebina=getContentPane();
		int sirina=d.width;
		int visina=d.height;

        vsebina.add(tabla);
		tabla.setBackground(Color.white);
		tabla.setLayout(null);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("l33t IRCAR");
		setSize(600,440);
		setResizable(false);
        setLocation((sirina-450)/2,(visina-370)/2);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.TitledBorder("LOL-mands"));
        jButton1.setText("LOL");
        jButton1.setMaximumSize(new java.awt.Dimension(70, 23));
        jButton1.setMinimumSize(new java.awt.Dimension(70, 23));
        jButton1.setPreferredSize(new java.awt.Dimension(100, 23));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel1.add(jButton1);

        jButton2.setText("ROTFL");
        jButton2.setPreferredSize(new java.awt.Dimension(100, 23));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel1.add(jButton2);

        jButton3.setText("OMG");
        jButton3.setPreferredSize(new java.awt.Dimension(100, 23));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jPanel1.add(jButton3);

        jButton4.setText("WTF");
        jButton4.setPreferredSize(new java.awt.Dimension(100, 23));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jPanel1.add(jButton4);

        jButton5.setText("GAY");
        jButton5.setPreferredSize(new java.awt.Dimension(100, 23));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jPanel1.add(jButton5);

        jButton6.setText("COD");
        jButton6.setPreferredSize(new java.awt.Dimension(100, 23));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jPanel1.add(jButton6);

        jButton7.setText("BOSANAC");
        jButton7.setPreferredSize(new java.awt.Dimension(100, 23));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jPanel1.add(jButton7);

        jButton8.setText("GOVEJK");
        jButton8.setPreferredSize(new java.awt.Dimension(100, 23));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jPanel1.add(jButton8);

        tabla.add(jPanel1);
        jPanel1.setBounds(20, 30, 130, 270);

        jLabel1.setText("NAJPOGOSTEJSI MIRC UKAZI");
        tabla.add(jLabel1);
        jLabel1.setBounds(180, 10, 180, 10);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.TitledBorder("BILLZ"));
        jPanel2.setPreferredSize(new java.awt.Dimension(387, 63));
        jButton9.setText("SLAP");
        jButton9.setPreferredSize(new java.awt.Dimension(80, 23));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jPanel2.add(jButton9);

        jButton10.setText("KICK");
        jButton10.setPreferredSize(new java.awt.Dimension(80, 23));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jPanel2.add(jButton10);

        jButton11.setText("INSULT");
        jButton11.setPreferredSize(new java.awt.Dimension(80, 23));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jPanel2.add(jButton11);

        jButton12.setText("GEEK");
        jButton12.setPreferredSize(new java.awt.Dimension(80, 23));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jPanel2.add(jButton12);

        jButton13.setText("QUIET");
        jButton13.setPreferredSize(new java.awt.Dimension(80, 23));
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jPanel2.add(jButton13);

        tabla.add(jPanel2);
        jPanel2.setBounds(160, 30, 100, 180);

        jLabel2.setIcon(new javax.swing.ImageIcon(this.getClass().getResource("billz.jpg")));
        tabla.add(jLabel2);
        jLabel2.setBounds(170, 210, 90, 140);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(new javax.swing.border.TitledBorder("COMBO"));
        jButton14.setText("SLAP");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        
        

        jPanel3.add(jButton14);

        tabla.add(jPanel3);
        jPanel3.setBounds(20, 300, 130, 60);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(new javax.swing.border.TitledBorder("DAMI"));
        jButton15.setText("KICK");
        jButton15.setPreferredSize(new java.awt.Dimension(80, 23));
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jPanel4.add(jButton15);

        jButton16.setText("SLAP");
        jButton16.setPreferredSize(new java.awt.Dimension(80, 23));
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jPanel4.add(jButton16);

        jButton17.setText("INSULT");
        jButton17.setPreferredSize(new java.awt.Dimension(80, 23));
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jPanel4.add(jButton17);

        jButton18.setText("MB");
        jButton18.setPreferredSize(new java.awt.Dimension(80, 23));
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jPanel4.add(jButton18);

        jButton19.setText("GAY");
        jButton19.setPreferredSize(new java.awt.Dimension(80, 23));
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jPanel4.add(jButton19);

        tabla.add(jPanel4);
        jPanel4.setBounds(280, 30, 100, 180);

        jLabel3.setIcon(new javax.swing.ImageIcon(this.getClass().getResource("fredy_avatar.gif")));
        tabla.add(jLabel3);
        jLabel3.setBounds(300, 200, 70, 110);

        jLabel4.setIcon(new javax.swing.ImageIcon(this.getClass().getResource("nindza.jpg")));
        tabla.add(jLabel4);
        jLabel4.setBounds(420, 210, 90, 90);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(new javax.swing.border.TitledBorder("KVAK"));
        jLabel5.setIcon(new javax.swing.ImageIcon(this.getClass().getResource("lequack01.gif")));
        jPanel5.add(jLabel5);

        tabla.add(jPanel5);
        jPanel5.setBounds(420, 290, 110, 100);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(new javax.swing.border.TitledBorder("NINDZA"));
        jButton20.setText("KICK");
        jButton20.setPreferredSize(new java.awt.Dimension(80, 23));
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jPanel6.add(jButton20);

        jButton21.setText("BAN");
        jButton21.setPreferredSize(new java.awt.Dimension(80, 23));
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jPanel6.add(jButton21);

        jButton22.setText("IGNORE");
        jButton22.setPreferredSize(new java.awt.Dimension(80, 23));
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jPanel6.add(jButton22);

        jButton23.setText("SLAP");
        jButton23.setPreferredSize(new java.awt.Dimension(80, 23));
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        jPanel6.add(jButton23);

        jButton24.setText("INSULT");
        jButton24.setPreferredSize(new java.awt.Dimension(80, 23));
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        jPanel6.add(jButton24);

        tabla.add(jPanel6);
        jPanel6.setBounds(410, 30, 100, 180);

    }//GEN-END:initComponents

    public void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
       dde("/say nindza: Da bi te majka prepoznala u bureku.");
    }//GEN-LAST:event_jButton24ActionPerformed

    public void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        dde("/mode #kabl +b nindza Poduvas mi auspuh papcino");
    }//GEN-LAST:event_jButton21ActionPerformed

    public void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
         dde("/action slaps nindza, Ko te sisa?");
    }//GEN-LAST:event_jButton23ActionPerformed

    public void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        dde("/ignore nindza");
    }//GEN-LAST:event_jButton22ActionPerformed

    public void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        dde("/kick nindza Seva mi levo jaje");
    }//GEN-LAST:event_jButton20ActionPerformed

    public void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
         dde("/say Dami: 00,05G03,03a14,01Y02,06 05,01g13,15A02,13y03,07 05,15G00,06A14,12Y");
    }//GEN-LAST:event_jButton19ActionPerformed

    public void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        dde("/say Dami: Kje je maribor ?");
    }//GEN-LAST:event_jButton18ActionPerformed

    public void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        dde("/say Dami: Debela si kao krmaca");
    }//GEN-LAST:event_jButton17ActionPerformed

    public void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        dde("/action slaps Dami with an Eve manual");
    }//GEN-LAST:event_jButton16ActionPerformed

    public void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
    	dde("/kick Dami kam pa kam");
    }//GEN-LAST:event_jButton15ActionPerformed

    public void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        dde("/say BillzKid: Tiho");
        dde("/mode #kabl +m");
    }//GEN-LAST:event_jButton13ActionPerformed

    public void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        dde("/say BillzKid: Neh se ucit geek");
    }//GEN-LAST:event_jButton12ActionPerformed

    public void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        dde("/say BillzKid: Govedo");
    }//GEN-LAST:event_jButton11ActionPerformed

    public void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        dde("/kick BillzKid odmah");
        dde("/kick Billz odmah");
    }//GEN-LAST:event_jButton10ActionPerformed

    public void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
         dde("/action slaps BillZKid, behave tanker boy");
    }//GEN-LAST:event_jButton9ActionPerformed

    public void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        dde("/action slaps "+users());
    }//GEN-LAST:event_jButton14ActionPerformed

    public void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
         dde("/say Bosananc bosanac, imao bi tvoj lanac...");
    }//GEN-LAST:event_jButton7ActionPerformed

    public void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        dde("/say kdor ne gre COD bo tepen tak oda kar res ni, pravi vam "+nick());
    }//GEN-LAST:event_jButton6ActionPerformed

    public void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        dde("/say da bi bili bolj GAY, mogli bi bit nindza");
    }//GEN-LAST:event_jButton5ActionPerformed

    public void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        dde("/say WTF fuck fuck fuck...");
    }//GEN-LAST:event_jButton4ActionPerformed

    public void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dde("/say OMG OMG OMG");
    }//GEN-LAST:event_jButton3ActionPerformed

    public void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dde("/say LOL jebem vas");
    }//GEN-LAST:event_jButton1ActionPerformed

    public void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        dde("/say ufuranc GOVEJK en");
    }//GEN-LAST:event_jButton8ActionPerformed

    public void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dde("/say ROTFL kaj vas bi tepo");
    }//GEN-LAST:event_jButton2ActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
    	JFrame.setDefaultLookAndFeelDecorated(true);
    	JFrame okvir=new LeetIrc();
    	okvir.setSize(560,440);
		okvir.setVisible(true);
    }
    
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButton1;
    public javax.swing.JButton jButton10;
    public javax.swing.JButton jButton11;
    public javax.swing.JButton jButton12;
    public javax.swing.JButton jButton13;
    public javax.swing.JButton jButton14;
    public javax.swing.JButton jButton15;
    public javax.swing.JButton jButton16;
    public javax.swing.JButton jButton17;
    public javax.swing.JButton jButton18;
    public javax.swing.JButton jButton19;
    public javax.swing.JButton jButton2;
    public javax.swing.JButton jButton20;
    public javax.swing.JButton jButton21;
    public javax.swing.JButton jButton22;
    public javax.swing.JButton jButton23;
    public javax.swing.JButton jButton24;
    public javax.swing.JButton jButton3;
    public javax.swing.JButton jButton4;
    public javax.swing.JButton jButton5;
    public javax.swing.JButton jButton6;
    public javax.swing.JButton jButton7;
    public javax.swing.JButton jButton8;
    public javax.swing.JButton jButton9;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPanel2;
    public javax.swing.JPanel jPanel3;
    public javax.swing.JPanel jPanel4;
    public javax.swing.JPanel jPanel5;
    public javax.swing.JPanel jPanel6;
    // End of variables declaration//GEN-END:variables
    
}
