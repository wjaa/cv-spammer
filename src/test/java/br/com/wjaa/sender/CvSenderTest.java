package br.com.wjaa.sender;

import org.junit.Test;

public class CvSenderTest {

	@Test
	public void testMain() {
		String file = this.getClass().getResource("/cvmail.json").getFile();
		CvSender.main(new String[]{file}); 
	}

}
