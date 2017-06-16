package jdk8.xuexi.sec01;

import java.time.Duration;
import java.time.Instant;

public class Test01 {
	public static void main(String[] args) {
		Instant start=Instant.now();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
		}
		Instant end=Instant.now();
		System.out.println( Duration.between(start, end).toMillis());
	}

}
