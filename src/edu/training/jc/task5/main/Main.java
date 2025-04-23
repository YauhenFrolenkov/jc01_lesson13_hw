package edu.training.jc.task5.main;

import edu.training.jc.task5.timer.Timer;

public class Main {

	public static void main(String[] args) {
		Timer timer1 = new Timer();
		System.out.println(timer1.getTime());
		System.out.println();

		Timer timer2 = new Timer(11, 30, 10);
		System.out.println(timer2.getTime());
		System.out.println();

		Timer timer3 = new Timer(10, 23, 45, 59, 20, 59);
		System.out.println(timer3.getTime());
		System.out.println();

		timer3.incHour();
		timer3.incMinute();
		timer3.incSecond();
		System.out.println("После увеличения: " + timer3.getTime());
		
		timer3.decHour();
		timer3.decMinute();
		timer3.decSecond();
        System.out.println("После уменьшения: " + timer3.getTime());
        
        timer3.addHours(3);
        timer3.addMinutes(15);
        timer3.addSeconds(40);
        System.out.println("После установки произвольных значений: " + timer3.getTime());
        
        timer2.reset();
        System.out.println("После сброса: " + timer2.getTime());
		
		
	}

}
