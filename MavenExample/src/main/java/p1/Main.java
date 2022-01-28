package p1;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext spring = new ClassPathXmlApplicationContext("spring.xml");
		
		/*Stock stock1 = (Stock)spring.getBean("stock1");
		System.out.println(stock1);
		
		Stock stock2 = (Stock)spring.getBean("stock2");
		System.out.println(stock2);
		*/
		Account account1 = (Account)spring.getBean("account1");
		//System.out.println(account1);
		Account account2 = (Account)spring.getBean("account2");
		//System.out.println(account2);
		Account account3 = (Account)spring.getBean("account3");
		//System.out.println(account3);
		
		TreeMap<String,List<Stock>> map = new TreeMap<String,List<Stock>>(); 
		map.put(account1.getAccountName(), account1.getStock());
		map.put(account2.getAccountName(), account2.getStock());
		map.put(account3.getAccountName(), account3.getStock());
		//System.out.println(map);
		
		for(Map.Entry m:map.entrySet()){    
		       System.out.println(m.getKey()+" "+m.getValue());    
		      }    
	}
}
