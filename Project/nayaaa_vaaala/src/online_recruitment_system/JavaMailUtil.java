package online_recruitment_system;

import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;


public class JavaMailUtil {
    public static void sendmail(String recipient,String s) throws Exception{
    int i= JOptionPane.showConfirmDialog(null,"Want to send an Email \n If yes, Please wait for a while...");    
        if (i==0){
    Properties properties = new Properties();
    
    properties.put("mail.smtp.auth","true");
    properties.put("mail.smtp.starttls.enable","true");
    properties.put("mail.smtp.host","smtp.gmail.com");
    properties.put("mail.smtp.port","587");
    
    String AccountEmail="recrsystem@gmail.com";
    String AccountPassword="recrsystem@08";
    
    Session session=Session.getInstance(properties,new Authenticator() {
        @Override
        protected PasswordAuthentication getPasswordAuthentication() {
            return new PasswordAuthentication(AccountEmail,AccountPassword); //To change body of generated methods, choose Tools | Templates.
        } 
    });
    
    Message message = prepareMessage(session,AccountEmail,recipient,s);
    
        Transport.send(message);
        JOptionPane.showMessageDialog(null,"Email Sent Successfully!!");
        }
        else{
            JOptionPane.showMessageDialog(null,"Messaeg not sent!!");
        }
    }
    private static Message prepareMessage(Session session, String AccountEmail, String recipient,String messagebody) {
        try {
            Message message=new MimeMessage(session);
            message.setFrom(new InternetAddress(AccountEmail));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(recipient));
            message.setSubject("Mail regarding your JOB Application");
            message.setText(messagebody);
            return message;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
            Logger.getLogger(JavaMailUtil.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        return null;
    }    
}
