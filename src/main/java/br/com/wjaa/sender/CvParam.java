package br.com.wjaa.sender;

import java.util.List;

/**
 * 
 * @author wagner
 * {	
 * 		emails:[a@a.com.br,b@b.com.br,c@c.com.br], name:'Wagner Araujo', from:'wagner.wjaa@gmail.com',title:'titulo do email',body:'corpo do email',
 * 		serverConfig:{smtp:'smtp.gmail.com',port:25,user:'wagner.wjaa@gmail.com',pass:'****', ssl: true}
 * }
 */
public class CvParam {

	private List<String> emails;
	private String name;
	private String from;
	private String title;
	private String body;
	private String cvPath;
	private String cvName;
	private ServerConfig serverConfig;
	
	
	public List<String> getEmails() {
		return emails;
	}
	public void setEmails(List<String> emails) {
		this.emails = emails;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public ServerConfig getServerConfig() {
		return serverConfig;
	}
	public void setServerConfig(ServerConfig serverConfig) {
		this.serverConfig = serverConfig;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCvPath() {
		return cvPath;
	}
	public void setCvPath(String cvPath) {
		this.cvPath = cvPath;
	}
	public String getCvName() {
		return cvName;
	}
	public void setCvName(String cvName) {
		this.cvName = cvName;
	}
	
}
