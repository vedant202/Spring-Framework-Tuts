package sF_test;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MediaTek implements Processor{

	public void process() {
		// TODO Auto-generated method stub
		System.out.println("2nd best processor");
	}
	
}
