package provatj;

import java.net.MalformedURLException;
import java.net.URL;

public class questao36 {

	public static void main(String[] args)
			throws MalformedURLException {
			URL url = new URL(“https://bloco13:trib@”+
			”www.tjms.jus.br/ws?id=0#A");
			String s1 = url.getRef(), s2 = url.getUserInfo(),
			s3 = url.getQuery(), s4 = url.getFile();
			Arrays.asList(s1,s2,s3,s4).stream()
			.map(s->s.concat(";"))
			.forEach(System.out::print);
			}

}
