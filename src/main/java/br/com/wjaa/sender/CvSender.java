package br.com.wjaa.sender;

import java.util.ArrayList;
import java.util.Collection;

import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;

/**
 * 
 * @author wagner
 *
 */
public class CvSender {

	public static void main(String[] args) {
		
		try {
			CvParam param = CvParamBuilder.build(args[0]);
			send(param);
			System.out.println("fim");
		} catch (CvParamBuildException e) {
			e.printStackTrace();
		} catch (EmailException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void send(CvParam p) throws EmailException{
		HtmlEmail mail = new HtmlEmail();
		ServerConfig sc = p.getServerConfig();
		
		for (String email : p.getEmails()){
			mail.addTo(email);
			mail.setHostName(sc.getSmtp());
			mail.setSmtpPort(sc.getPort());
			mail.setAuthentication(sc.getUser(), sc.getPass());
			mail.setFrom(p.getFrom(), p.getName(), "UTF-8");
			mail.setBoolHasAttachments(true);
			mail.setHtmlMsg(p.getBody());
			mail.setSubject(p.getTitle());
			EmailAttachment ea = new EmailAttachment();
			ea.setPath(p.getCvPath());
			ea.setName(p.getCvName());
			mail.attach(ea);
			mail.setSSL(new Boolean (sc.getSsl()));
			
			mail.send();
		}
		
	}
	
}
