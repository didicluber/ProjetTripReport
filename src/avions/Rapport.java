/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avions;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author Moussa
 */
public class Rapport extends javax.swing.JFrame {

    /**
     * Creates new form Mouvement
     */
    public Rapport() {
        
        // <editor-fold defaultstate="collapsed" desc="Interface de la fenetre"> 
         initComponents();
         this.setTitle("Gestion des retards");
         this.setLocationRelativeTo(null);
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         this.setSize(680,470);
         
         nomAdmin.setText("Administrateur ["+id.getNdc()+"]");
         nomAdmin.setHorizontalAlignment(SwingConstants.CENTER);
         nomAdmin.setForeground(new java.awt.Color(102, 0, 0));
         Modele.setHorizontalAlignment(SwingConstants.CENTER);
         Modele.setForeground(new java.awt.Color(102, 0, 0));
         Pilote.setHorizontalAlignment(SwingConstants.CENTER);
         Pilote.setForeground(new java.awt.Color(102, 0, 0));
         CoPilote.setHorizontalAlignment(SwingConstants.CENTER);
         CoPilote.setForeground(new java.awt.Color(102, 0, 0));
         depart.setHorizontalAlignment(SwingConstants.CENTER);
         depart.setForeground(new java.awt.Color(102, 0, 0));
         arriver.setHorizontalAlignment(SwingConstants.CENTER);
         arriver.setForeground(new java.awt.Color(102, 0, 0));
         minutesRetard.setHorizontalAlignment(SwingConstants.CENTER);
         minutesRetard.setForeground(new java.awt.Color(102, 0, 0));
         raisonRetard.setHorizontalAlignment(SwingConstants.CENTER);
         raisonRetard.setForeground(new java.awt.Color(102, 0, 0));
         aeroportD.setHorizontalAlignment(SwingConstants.CENTER);
         aeroportD.setForeground(new java.awt.Color(102, 0, 0));
         aeroportA.setHorizontalAlignment(SwingConstants.CENTER);
         aeroportA.setForeground(new java.awt.Color(102, 0, 0));
         // </editor-fold>
         
        // <editor-fold defaultstate="collapsed" desc="Récupère les vols"> 
   try {

Statement state1 = CO.com.createStatement();
ResultSet resultP = state1.executeQuery("SELECT numeroVol FROM mouvement");
while(resultP.next()){
    nVol.addItem(resultP.getString(1));
}

resultP.close();
state1.close();
   }
   catch (Exception e){
       e.printStackTrace();
   }
    // </editor-fold> 
         
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nVol = new javax.swing.JComboBox();
        nomAdmin = new javax.swing.JLabel();
        Vol = new javax.swing.JLabel();
        Avion = new javax.swing.JLabel();
        Depart = new javax.swing.JLabel();
        Arrivee = new javax.swing.JLabel();
        envoieMail = new javax.swing.JButton();
        image = new javax.swing.JLabel();
        titre = new javax.swing.JLabel();
        avionRet = new javax.swing.JLabel();
        tRetard = new javax.swing.JLabel();
        Séparateur = new javax.swing.JSeparator();
        image2 = new javax.swing.JLabel();
        tPilote = new javax.swing.JLabel();
        tCoPilote = new javax.swing.JLabel();
        tAeroportA = new javax.swing.JLabel();
        tAeroportD = new javax.swing.JLabel();
        Trait6 = new javax.swing.JLabel();
        Titre4 = new javax.swing.JLabel();
        aeroportD = new javax.swing.JTextField();
        aeroportA = new javax.swing.JTextField();
        tRetardType = new javax.swing.JLabel();
        tMail = new javax.swing.JLabel();
        Cadre2 = new javax.swing.JLabel();
        Cadre3 = new javax.swing.JLabel();
        CoPilote = new javax.swing.JTextField();
        Pilote = new javax.swing.JTextField();
        Modele = new javax.swing.JTextField();
        raisonRetard = new javax.swing.JTextField();
        depart = new javax.swing.JTextField();
        minutesRetard = new javax.swing.JTextField();
        arriver = new javax.swing.JTextField();
        Mail = new javax.swing.JTextField();
        Cadr4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nVol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nVolActionPerformed(evt);
            }
        });
        getContentPane().add(nVol, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 50, 30));

        nomAdmin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(nomAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, 180, 20));

        Vol.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Vol.setText("Modèle :");
        getContentPane().add(Vol, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 70, 20));

        Avion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Avion.setText("Numéro du Vol :");
        getContentPane().add(Avion, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 110, 60));

        Depart.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Depart.setText("Départ :");
        getContentPane().add(Depart, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 70, 40));

        Arrivee.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Arrivee.setText("Arrivée :");
        getContentPane().add(Arrivee, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 60, 40));

        envoieMail.setText("Envoyer le Mail");
        envoieMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                envoieMailActionPerformed(evt);
            }
        });
        getContentPane().add(envoieMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 360, 140, 30));

        image.setIcon(new javax.swing.ImageIcon("C:\\Users\\Moussa\\Pictures\\BTS SIO 2\\JAVA\\AVIONS\\logo-avion.png")); // NOI18N
        getContentPane().add(image, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 100, 70));

        titre.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        titre.setText("Trip Report : Gestion des retards");
        getContentPane().add(titre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 420, 30));

        avionRet.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        avionRet.setText("Envoyer un rapport par mail");
        getContentPane().add(avionRet, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 230, 20));

        tRetard.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tRetard.setText("Minutes de Retard :");
        getContentPane().add(tRetard, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 140, 30));
        getContentPane().add(Séparateur, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 710, -1));

        image2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Moussa\\Pictures\\BTS SIO 2\\JAVA\\AVIONS\\mail.png")); // NOI18N
        getContentPane().add(image2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, 210, 220));

        tPilote.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tPilote.setText("Pilote :");
        getContentPane().add(tPilote, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 60, 20));

        tCoPilote.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tCoPilote.setText("Co-pilote :");
        getContentPane().add(tCoPilote, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 80, 20));

        tAeroportA.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tAeroportA.setText("Aéroport d'arrivé :");
        getContentPane().add(tAeroportA, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 160, 40));

        tAeroportD.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tAeroportD.setText("Aéroport de départ :");
        getContentPane().add(tAeroportD, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 310, 160, 40));

        Trait6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(Trait6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, -1, 310));

        Titre4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(Titre4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 344, 220, -1));

        aeroportD.setEditable(false);
        aeroportD.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(aeroportD, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, 60, 20));

        aeroportA.setEditable(false);
        aeroportA.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(aeroportA, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, 60, 20));

        tRetardType.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tRetardType.setText("Raison du retard :");
        getContentPane().add(tRetardType, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 130, 30));

        tMail.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tMail.setText("Adresse mail  :");
        getContentPane().add(tMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, 110, 40));

        Cadre2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(Cadre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 380, 100));

        Cadre3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(Cadre3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, 220, 310));

        CoPilote.setEditable(false);
        CoPilote.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        CoPilote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CoPiloteActionPerformed(evt);
            }
        });
        getContentPane().add(CoPilote, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 110, 20));

        Pilote.setEditable(false);
        Pilote.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(Pilote, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 110, 20));

        Modele.setEditable(false);
        Modele.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(Modele, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 110, 20));

        raisonRetard.setEditable(false);
        raisonRetard.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(raisonRetard, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 140, 20));

        depart.setEditable(false);
        depart.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(depart, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 110, 20));

        minutesRetard.setEditable(false);
        minutesRetard.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        minutesRetard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minutesRetardActionPerformed(evt);
            }
        });
        getContentPane().add(minutesRetard, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 140, 20));

        arriver.setEditable(false);
        arriver.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(arriver, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 110, 20));
        getContentPane().add(Mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, 140, 30));

        Cadr4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(Cadr4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 380, 210));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void envoieMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_envoieMailActionPerformed

       String expression = "^[_a-z0-9-]+(\\.[_a-z0-9-]+)*@[a-z0-9-]+(\\.[a-z0-9-]+)+$";
Pattern p = Pattern.compile(expression);
Matcher m = p.matcher(Mail.getText());
if(!m.matches())
{
JOptionPane.showMessageDialog(null, "L'adresse mail "+Mail.getText()+" n'est pas conforme, veuillez saisir une autre adresse mail.");
}
else {
    
    
     // <editor-fold defaultstate="collapsed" desc="Envoi de l'email">
            // Proprietés de l'email
        Properties props = new Properties();
	props.put("mail.smtp.host", "smtp.gmail.com");
	props.put("mail.smtp.socketFactory.port", "465");
	props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
	props.put("mail.smtp.auth", "true");
	props.put("mail.smtp.port", "465");
                
        Authenticator auth;
        auth = new Authenticator() {
        // Email du compte d'envoi
        @Override
        protected PasswordAuthentication getPasswordAuthentication() {
            return new PasswordAuthentication("moussa.iskounene@gmail.com", "Oh5Luui?");        
        }
       
    };
// Récupération des valeurs a ajouter dans le recap
Session session = Session.getInstance(props, auth);		
Message msg = new MimeMessage(session);

        // <editor-fold defaultstate="collapsed" desc="Message HTML">
String VolM = nVol.getSelectedItem().toString();
String ModeleM = Modele.getText();
String PiloteM = Pilote.getText();
String CoPiloteM = CoPilote.getText();
String DepartM = depart.getText();
String ArriverM = arriver.getText();
String AeroportDepartM = aeroportD.getText();
String AeroportArriverM = aeroportA.getText();
String RetardM = minutesRetard.getText();
String RaisonRetardM = raisonRetard.getText();

 try {
    String message= "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional //EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n" +
"<html xmlns=\"http://www.w3.org/1999/xhtml\" xmlns:v=\"urn:schemas-microsoft-com:vml\" xmlns:o=\"urn:schemas-microsoft-com:office:office\">\n" +
"<head>\n" +
"<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" /> \n" +
"<style type=\"text/css\">\n" +
"  body, .mainTable { height:100% !important; width:100% !important; margin:0; padding:0; }\n" +
"  img, a img { border:0; outline:none; text-decoration:none; }\n" +
"  .imageFix { display:block; }\n" +
"  table, td { border-collapse:collapse; mso-table-lspace:0pt; mso-table-rspace:0pt;}\n" +
"  p {margin:0; padding:0; margin-bottom:0;}\n" +
"  .ReadMsgBody{width:100%;} .ExternalClass{width:100%;}\n" +
"  .ExternalClass, .ExternalClass p, .ExternalClass span, .ExternalClass font, .ExternalClass td, .ExternalClass div{line-height:100%;}\n" +
"  img{-ms-interpolation-mode: bicubic;}\n" +
"  body, table, td, p, a, li, blockquote{-ms-text-size-adjust:100%; -webkit-text-size-adjust:100%;}\n" +
"</style>\n" +
"<!--[if gte mso 9]>\n" +
"<xml>\n" +
"  <o:OfficeDocumentSettings>\n" +
"    <o:AllowPNG/>\n" +
"    <o:PixelsPerInch>96</o:PixelsPerInch>\n" +
"  </o:OfficeDocumentSettings>\n" +
"</xml>\n" +
"<![endif]-->\n" +
"</head>\n" +
"<body scroll=\"auto\" style=\"padding:0; margin:0; FONT-SIZE: 12px; FONT-FAMILY: Arial, Helvetica, sans-serif; cursor:auto; background:#65707A\">\n" +
"<TABLE class=mainTable cellSpacing=0 cellPadding=0 width=\"100%\" bgColor=#65707a>\n" +
"<TR>\n" +
"<TD style=\"FONT-SIZE: 0px; HEIGHT: 20px; LINE-HEIGHT: 0\">&#160;</TD></TR>\n" +
"<TR>\n" +
"<TD vAlign=top>\n" +
"<TABLE style=\"WIDTH: 651px; MARGIN: 0px auto\" cellSpacing=0 cellPadding=0 width=651 align=center border=0>\n" +
"<TR>\n" +
"<TD style=\"BORDER-TOP: transparent 3px dashed; BORDER-RIGHT: medium none; BORDER-BOTTOM: transparent 3px solid; PADDING-BOTTOM: 5px; PADDING-TOP: 5px; PADDING-LEFT: 10px; BORDER-LEFT: medium none; PADDING-RIGHT: 10px; BACKGROUND-COLOR: #fffefd\">\n" +
"<TABLE style=\"WIDTH: 100%\" cellSpacing=0 cellPadding=0 align=left>\n" +
"<TR style=\"HEIGHT: 10px\">\n" +
"<TD style=\"BORDER-TOP: medium none; BORDER-RIGHT: medium none; WIDTH: 1%; VERTICAL-ALIGN: top; BORDER-BOTTOM: medium none; PADDING-BOTTOM: 5px; TEXT-ALIGN: center; PADDING-TOP: 5px; PADDING-LEFT: 20px; BORDER-LEFT: medium none; PADDING-RIGHT: 20px; BACKGROUND-COLOR: transparent\">\n" +
"<TABLE cellSpacing=0 cellPadding=0 align=center border=0>\n" +
"<TR>\n" +
"<TD style=\"PADDING-BOTTOM: 2px; PADDING-TOP: 2px; PADDING-LEFT: 2px; PADDING-RIGHT: 2px\" align=center>\n" +
"<TABLE cellSpacing=0 cellPadding=0 border=0>\n" +
"<TR>\n" +
"<TD style=\"BORDER-TOP: medium none; BORDER-RIGHT: medium none; BORDER-BOTTOM: medium none; BORDER-LEFT: medium none; BACKGROUND-COLOR: transparent\"><IMG style=\"BORDER-TOP: medium none; BORDER-RIGHT: medium none; BORDER-BOTTOM: medium none; BORDER-LEFT: medium none; DISPLAY: block; BACKGROUND-COLOR: transparent\" border=0 src=\"https://mailchef.s3.amazonaws.com/uploads/mailstyler/images/A981CD43-77C6-4023-5E2A-8F053837A1DF_Image_1.png\" width=70 height=70 hspace=\"0\" vspace=\"0\"></TD></TR></TABLE></TD></TR></TABLE></TD>\n" +
"<TD style=\"BORDER-TOP: medium none; BORDER-RIGHT: medium none; WIDTH: 99%; VERTICAL-ALIGN: middle; BORDER-BOTTOM: medium none; PADDING-BOTTOM: 5px; TEXT-ALIGN: center; PADDING-TOP: 5px; PADDING-LEFT: 20px; BORDER-LEFT: medium none; PADDING-RIGHT: 20px; BACKGROUND-COLOR: transparent\">\n" +
"<P style=\"FONT-SIZE: 18px; MARGIN-BOTTOM: 1em; FONT-FAMILY: Arial, Helvetica, sans-serif; MARGIN-TOP: 0px; COLOR: #303030; TEXT-ALIGN: justify; LINE-HEIGHT: 155%; BACKGROUND-COLOR: transparent; mso-line-height-rule: exactly\" align=justify><STRONG>&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160; TRIP REPORT</STRONG></P>\n" +
"<P style=\"FONT-SIZE: 14px; MARGIN-BOTTOM: 1em; FONT-FAMILY: Arial, Helvetica, sans-serif; MARGIN-TOP: 0px; COLOR: #303030; LINE-HEIGHT: 125%; BACKGROUND-COLOR: transparent; mso-line-height-rule: exactly\" align=left>&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160; Gestion des retards dans les a&#233;roports</P></TD></TR></TABLE></TD></TR>\n" +
"<TR>\n" +
"<TD style=\"BORDER-TOP: medium none; BORDER-RIGHT: medium none; BORDER-BOTTOM: medium none; PADDING-BOTTOM: 0px; PADDING-TOP: 0px; PADDING-LEFT: 0px; BORDER-LEFT: medium none; PADDING-RIGHT: 0px; BACKGROUND-COLOR: transparent\">\n" +
"<TABLE style=\"WIDTH: 100%\" cellSpacing=0 cellPadding=0 align=left>\n" +
"<TR style=\"HEIGHT: 20px\">\n" +
"<TD style=\"BORDER-TOP: medium none; BORDER-RIGHT: medium none; WIDTH: 100%; VERTICAL-ALIGN: top; BORDER-BOTTOM: medium none; PADDING-BOTTOM: 0px; TEXT-ALIGN: center; PADDING-TOP: 0px; PADDING-LEFT: 0px; BORDER-LEFT: medium none; PADDING-RIGHT: 0px; BACKGROUND-COLOR: transparent\">\n" +
"<DIV></DIV></TD></TR></TABLE></TD></TR>\n" +
"<TR>\n" +
"<TD style=\"BORDER-TOP: transparent 3px solid; BORDER-RIGHT: medium none; BORDER-BOTTOM: transparent 3px solid; PADDING-BOTTOM: 5px; PADDING-TOP: 5px; PADDING-LEFT: 10px; BORDER-LEFT: medium none; PADDING-RIGHT: 10px; BACKGROUND-COLOR: #fffefd\">\n" +
"<TABLE style=\"WIDTH: 100%\" cellSpacing=0 cellPadding=0 align=left>\n" +
"<TR style=\"HEIGHT: 216px\">\n" +
"<TD style=\"BORDER-TOP: medium none; BORDER-RIGHT: medium none; WIDTH: 100%; VERTICAL-ALIGN: top; BORDER-BOTTOM: medium none; PADDING-BOTTOM: 10px; TEXT-ALIGN: center; PADDING-TOP: 10px; PADDING-LEFT: 20px; BORDER-LEFT: medium none; PADDING-RIGHT: 20px; BACKGROUND-COLOR: transparent\">\n" +
"<TABLE cellSpacing=0 cellPadding=0 align=center border=0>\n" +
"<TR>\n" +
"<TD style=\"PADDING-BOTTOM: 2px; PADDING-TOP: 2px; PADDING-LEFT: 2px; PADDING-RIGHT: 2px\" align=center>\n" +
"<TABLE cellSpacing=0 cellPadding=0 border=0>\n" +
"<TR>\n" +
"<TD style=\"BORDER-TOP: medium none; BORDER-RIGHT: medium none; BORDER-BOTTOM: medium none; BORDER-LEFT: medium none; BACKGROUND-COLOR: transparent\"><IMG style=\"BORDER-TOP: medium none; BORDER-RIGHT: medium none; BORDER-BOTTOM: medium none; BORDER-LEFT: medium none; DISPLAY: block; BACKGROUND-COLOR: transparent\" border=0 src=\"https://mailchef.s3.amazonaws.com/uploads/mailstyler/images/EEDE37FE-EFAF-74EC-BD58-E40FA1BD99F7_Image_2.jpg\" width=486 height=192 hspace=\"0\" vspace=\"0\"></TD></TR></TABLE></TD></TR></TABLE></TD></TR></TABLE></TD></TR>\n" +
"<TR>\n" +
"<TD style=\"BORDER-TOP: transparent 3px solid; BORDER-RIGHT: medium none; BORDER-BOTTOM: transparent 3px solid; PADDING-BOTTOM: 5px; PADDING-TOP: 5px; PADDING-LEFT: 10px; BORDER-LEFT: medium none; PADDING-RIGHT: 10px; BACKGROUND-COLOR: #fffefd\">\n" +
"<TABLE style=\"WIDTH: 100%\" cellSpacing=0 cellPadding=0 align=left>\n" +
"<TR style=\"HEIGHT: 383px\">\n" +
"<TD style=\"BORDER-TOP: medium none; BORDER-RIGHT: medium none; WIDTH: 50%; VERTICAL-ALIGN: top; BORDER-BOTTOM: medium none; PADDING-BOTTOM: 10px; TEXT-ALIGN: center; PADDING-TOP: 10px; PADDING-LEFT: 20px; BORDER-LEFT: medium none; PADDING-RIGHT: 20px; BACKGROUND-COLOR: transparent\">\n" +
"<P style=\"FONT-SIZE: 15px; MARGIN-BOTTOM: 1em; FONT-FAMILY: Arial, Helvetica, sans-serif; MARGIN-TOP: 0px; COLOR: #191919; LINE-HEIGHT: 155%; BACKGROUND-COLOR: transparent; mso-line-height-rule: exactly\" align=left><BR><FONT style=\"FONT-SIZE: 18px\"><STRONG><FONT style=\"COLOR: #800000\">Vol num&#233;ro "+VolM+"</FONT><BR></STRONG>&#160;</FONT><BR><STRONG>Mod&#232;le&#160; :&#160;</STRONG>&#160;"+ModeleM+"&#160;&#160;<STRONG>&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;<BR>Pilote :&#160; </STRONG>"+PiloteM+"<BR><STRONG>Co-Pilote : </STRONG>"+CoPiloteM+"<BR><STRONG>Date de d&#233;part : </STRONG>"+DepartM+"<BR><STRONG>Date d'arriv&#233;e : </STRONG>"+ArriverM+"<BR><STRONG>A&#233;roport de d&#233;part : </STRONG>"+AeroportDepartM+"<BR><STRONG>A&#233;ropot d'arriv&#233;e : </STRONG>"+AeroportArriverM+"<BR><STRONG>Minutes de retard : </STRONG>"+RetardM+"<BR><STRONG>Raison du retard : </STRONG>"+RaisonRetardM+"</P>\n" +
"<TABLE cellSpacing=0 cellPadding=5 width=\"100%\" border=0>\n" +
"<TR>\n" +
"<TD width=\"50%\"></TD>\n" +
"<TD width=\"50%\">\n" +
"<P style=\"FONT-SIZE: 12px; MARGIN-BOTTOM: 1em; FONT-FAMILY: Arial, Helvetica, sans-serif; MARGIN-TOP: 0px; COLOR: #89898b; LINE-HEIGHT: 155%; BACKGROUND-COLOR: transparent; mso-line-height-rule: exactly\" align=left>&#160;</P></TD></TR></TABLE></TD>\n" +
"<TD style=\"BORDER-TOP: medium none; BORDER-RIGHT: medium none; WIDTH: 50%; VERTICAL-ALIGN: top; BORDER-BOTTOM: medium none; PADDING-BOTTOM: 10px; TEXT-ALIGN: center; PADDING-TOP: 10px; PADDING-LEFT: 20px; BORDER-LEFT: medium none; PADDING-RIGHT: 20px; BACKGROUND-COLOR: transparent\">\n" +
"<TABLE cellSpacing=0 cellPadding=0 align=center border=0>\n" +
"<TR>\n" +
"<TD style=\"PADDING-BOTTOM: 2px; PADDING-TOP: 2px; PADDING-LEFT: 2px; PADDING-RIGHT: 2px\" align=center>\n" +
"<TABLE cellSpacing=0 cellPadding=0 border=0>\n" +
"<TR>\n" +
"<TD style=\"BORDER-TOP: medium none; BORDER-RIGHT: medium none; BORDER-BOTTOM: medium none; BORDER-LEFT: medium none; BACKGROUND-COLOR: transparent\"><IMG style=\"BORDER-TOP: medium none; BORDER-RIGHT: medium none; BORDER-BOTTOM: medium none; BORDER-LEFT: medium none; DISPLAY: block; BACKGROUND-COLOR: transparent\" border=0 src=\"https://mailchef.s3.amazonaws.com/uploads/mailstyler/images/176AE5DC-140F-0FFA-3C79-8AA93F36B8B8_Image_3.png\" width=280 height=280 hspace=\"0\" vspace=\"0\"></TD></TR></TABLE></TD></TR></TABLE></TD></TR></TABLE></TD></TR>\n" +
"<TR>\n" +
"<TD style=\"BORDER-TOP: medium none; BORDER-RIGHT: medium none; BORDER-BOTTOM: medium none; PADDING-BOTTOM: 0px; PADDING-TOP: 0px; PADDING-LEFT: 0px; BORDER-LEFT: medium none; PADDING-RIGHT: 0px; BACKGROUND-COLOR: transparent\">\n" +
"<TABLE style=\"WIDTH: 100%\" cellSpacing=0 cellPadding=0 align=left>\n" +
"<TR style=\"HEIGHT: 20px\">\n" +
"<TD style=\"BORDER-TOP: medium none; BORDER-RIGHT: medium none; WIDTH: 100%; VERTICAL-ALIGN: top; BORDER-BOTTOM: medium none; PADDING-BOTTOM: 0px; TEXT-ALIGN: center; PADDING-TOP: 0px; PADDING-LEFT: 0px; BORDER-LEFT: medium none; PADDING-RIGHT: 0px; BACKGROUND-COLOR: transparent\">\n" +
"<DIV></DIV></TD></TR></TABLE></TD></TR>\n" +
"<TR>\n" +
"<TD style=\"BORDER-TOP: transparent 3px solid; BORDER-RIGHT: medium none; BORDER-BOTTOM: transparent 3px solid; PADDING-BOTTOM: 5px; PADDING-TOP: 5px; PADDING-LEFT: 10px; BORDER-LEFT: medium none; PADDING-RIGHT: 10px; BACKGROUND-COLOR: #fffefd\">\n" +
"<TABLE style=\"WIDTH: 100%\" cellSpacing=0 cellPadding=0 align=left>\n" +
"<TR style=\"HEIGHT: 10px\">\n" +
"<TD style=\"BORDER-TOP: medium none; BORDER-RIGHT: medium none; WIDTH: 100%; VERTICAL-ALIGN: middle; BORDER-BOTTOM: medium none; PADDING-BOTTOM: 10px; TEXT-ALIGN: center; PADDING-TOP: 10px; PADDING-LEFT: 20px; BORDER-LEFT: medium none; PADDING-RIGHT: 20px; BACKGROUND-COLOR: #f8f8f9\">\n" +
"<P style=\"FONT-SIZE: 23px; MARGIN-BOTTOM: 0px; FONT-FAMILY: Arial, Helvetica, sans-serif; MARGIN-TOP: 0px; COLOR: #303031; LINE-HEIGHT: 155%; BACKGROUND-COLOR: transparent; mso-line-height-rule: exactly\" align=left><STRONG>Site internet du d&#233;veloppeur</STRONG></P></TD>\n" +
"<TD style=\"BORDER-TOP: medium none; BORDER-RIGHT: medium none; WIDTH: 50%; VERTICAL-ALIGN: middle; BORDER-BOTTOM: medium none; PADDING-BOTTOM: 0px; TEXT-ALIGN: center; PADDING-TOP: 0px; PADDING-LEFT: 20px; BORDER-LEFT: medium none; PADDING-RIGHT: 20px; BACKGROUND-COLOR: #f8f8f9\">\n" +
"<DIV style=\"TEXT-ALIGN: right; MARGIN: 18px 10px 18px 18px\"><A href=\"http://moussa.isk.free.fr\"><IMG title=\"\" border=none alt=\"Moussa Iskounene\" src=\"https://mailchef.s3.amazonaws.com/uploads/mailstyler/images/16ADA380-277D-8696-C85D-D799DD0EE6C6_Image_4.png\"> </A></DIV></TD></TR></TABLE></TD></TR></TABLE></TD></TR>\n" +
"<TR>\n" +
"<TD style=\"FONT-SIZE: 0px; HEIGHT: 8px; LINE-HEIGHT: 0\">&#160;</TD></TR></TABLE>\n" +
"</body>\n" +
"</html>";
 
msg.setContent(message, "text/html");
InternetAddress toAddress = new InternetAddress(Mail.getText());
msg.addRecipient(Message.RecipientType.TO, toAddress);
msg.setFrom(new InternetAddress("moussa.iskounene@gmail.com"));
msg.setSubject("Récapitulatif des retards du Vol numéro "+VolM+"");

// envoi du message
Transport.send(msg);



// </editor-fold>

 }
 catch (MessagingException ex) {  
     Logger.getLogger(Rapport.class.getName()).log(Level.SEVERE, null, ex);            
        }
        JOptionPane.showMessageDialog(null,"Message envoyer à l'adresse "+Mail.getText()+" ! ","Message réussi",JOptionPane.INFORMATION_MESSAGE);
        this.dispose();
        new Accueil().setVisible(true);
        }
        // </editor-fold>
 

        
    }//GEN-LAST:event_envoieMailActionPerformed

    private void CoPiloteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CoPiloteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CoPiloteActionPerformed

    private void minutesRetardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minutesRetardActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_minutesRetardActionPerformed

    private void nVolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nVolActionPerformed
        
        // <editor-fold defaultstate="collapsed" desc="Récupère les vols"> 
   try {
String numeroVol = nVol.getSelectedItem().toString();
Statement state1 = CO.com.createStatement();
ResultSet resultP = state1.executeQuery("SELECT modele, pilote, coPilote, dateHeureDepart, dateHeureArrivee, AeroportDepart, AeroportArriver, retard, raisonRetard  FROM mouvement WHERE numeroVol='"+numeroVol+"'");
while(resultP.next()){
    Modele.setText(resultP.getString(1));
    Pilote.setText(resultP.getString(2));
    CoPilote.setText(resultP.getString(3));
    depart.setText(resultP.getString(4));
    arriver.setText(resultP.getString(5));
    aeroportD.setText(resultP.getString(6));
    aeroportA.setText(resultP.getString(7));
    minutesRetard.setText(resultP.getString(8));
    raisonRetard.setText(resultP.getString(9));
}

resultP.close();
state1.close();
   }
   catch (Exception e){
       e.printStackTrace();
   }
    // </editor-fold> 
   
    }//GEN-LAST:event_nVolActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Rapport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Rapport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Rapport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Rapport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Rapport().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Arrivee;
    private javax.swing.JLabel Avion;
    private javax.swing.JLabel Cadr4;
    private javax.swing.JLabel Cadre2;
    private javax.swing.JLabel Cadre3;
    private javax.swing.JTextField CoPilote;
    private javax.swing.JLabel Depart;
    private javax.swing.JTextField Mail;
    private javax.swing.JTextField Modele;
    private javax.swing.JTextField Pilote;
    private javax.swing.JSeparator Séparateur;
    private javax.swing.JLabel Titre4;
    private javax.swing.JLabel Trait6;
    private javax.swing.JLabel Vol;
    private javax.swing.JTextField aeroportA;
    private javax.swing.JTextField aeroportD;
    private javax.swing.JTextField arriver;
    private javax.swing.JLabel avionRet;
    private javax.swing.JTextField depart;
    private javax.swing.JButton envoieMail;
    private javax.swing.JLabel image;
    private javax.swing.JLabel image2;
    private javax.swing.JTextField minutesRetard;
    private javax.swing.JComboBox nVol;
    private javax.swing.JLabel nomAdmin;
    private javax.swing.JTextField raisonRetard;
    private javax.swing.JLabel tAeroportA;
    private javax.swing.JLabel tAeroportD;
    private javax.swing.JLabel tCoPilote;
    private javax.swing.JLabel tMail;
    private javax.swing.JLabel tPilote;
    private javax.swing.JLabel tRetard;
    private javax.swing.JLabel tRetardType;
    private javax.swing.JLabel titre;
    // End of variables declaration//GEN-END:variables
}