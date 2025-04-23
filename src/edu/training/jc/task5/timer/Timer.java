package edu.training.jc.task5.timer;

/*Составьте описание класса для представления времени. Предусмотрте возможности установки времени и  изменения его 
отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В случае  недопустимых значений 
полей поле устанавливается в значение 0. Создать методы изменения времени на заданное  количество часов, минут и 
секунд. 
*/
public class Timer {
	
	private int hour;
	private int minute;
	private int second;
	
	private final int FROM_HOUR;
	private final int TO_HOUR;
	
	private final int FROM_MINUTE;
	private final int TO_MINUTE;
	
	private final int FROM_SECOND;
	private final int TO_SECOND;
	
	public Timer() {
		FROM_HOUR = 0;
		TO_HOUR = 23;
		
		FROM_MINUTE = 0;
		TO_MINUTE = 59;
		
		FROM_SECOND = 0;
		TO_SECOND = 59;
		
		hour = 0;
		minute = 0;
		second = 0;
		
	}
	
	public Timer(int startHour, int startMinute, int startSecond) {
		FROM_HOUR = 0;
		TO_HOUR = 23;
		
		FROM_MINUTE = 0;
		TO_MINUTE = 59;
		
		FROM_SECOND = 0;
		TO_SECOND = 59;
		
		if (startHour < FROM_HOUR || startHour > TO_HOUR || 
			startMinute < FROM_MINUTE || startMinute > TO_MINUTE || 
			startSecond < FROM_SECOND || startSecond > TO_SECOND) {
			
			throw new RuntimeException("Can't create the object!");
		}
		
		hour = startHour;
		minute = startMinute;
		second = startSecond;
	}
	
	public Timer(int fromHour, int toHour, int fromMinute, int toMinute, int fromSecond, int toSecond) {
		if (fromHour >= toHour || fromMinute >= toMinute || fromSecond >= toSecond) {
			throw new RuntimeException("Can't create the object!");
		}
		
		FROM_HOUR = fromHour;
		TO_HOUR = toHour;
		
		FROM_MINUTE = fromMinute;
		TO_MINUTE = toMinute;
		
		FROM_SECOND = fromSecond;
		TO_SECOND = toSecond;
		
		hour = fromHour;
		minute = fromMinute;
		second = fromSecond;
		
		
	}
	
	public int incHour() {
		hour++;
		
		if (hour > TO_HOUR) {
			hour = FROM_HOUR;
		}
		
		return hour;
	}
	
	public int decHour() {
		hour--;
		
		if (hour < FROM_HOUR) {
			hour = TO_HOUR;
		}
		
		return hour;
	}
	
	public int incMinute() {
		minute++;
		
		if (minute > TO_MINUTE) {
			minute = FROM_MINUTE;
		}
		
		return minute;
	}
	
	public int decMinute() {
		minute--;
		
		if (minute < FROM_MINUTE) {
			minute = TO_MINUTE;
		}
		
		return minute;
	}
	
	public int incSecond() {
		second++;
		
		if (second > TO_SECOND) {
			second = FROM_SECOND;
		}
		
		return second;
	}
	
	public int decSecond() {
		second--;
		
		if (second < FROM_SECOND) {
			second = TO_SECOND;
		}
		
		return second;
	}
	
	 public void addHours(int h) {
	        hour += h;
	        while (hour > TO_HOUR) {
	        	hour -= (TO_HOUR - FROM_HOUR + 1);
	        }
	        while (hour < FROM_HOUR) {
	        	hour += (TO_HOUR - FROM_HOUR + 1);
	        }
	    }

	    public void addMinutes(int m) {
	        minute += m;
	        while (minute > TO_MINUTE) {
	        	minute -= (TO_MINUTE - FROM_MINUTE + 1);
	        }
	        while (minute < FROM_MINUTE) {
	        	minute += (TO_MINUTE - FROM_MINUTE + 1);
	        }
	    }

	    public void addSeconds(int s) {
	        second += s;
	        while (second > TO_SECOND) {
	        	second -= (TO_SECOND - FROM_SECOND + 1);
	        }
	        while (second < FROM_SECOND) {
	        	second += (TO_SECOND - FROM_SECOND + 1);
	        }
	    }
	
	public void reset() {
		hour = FROM_HOUR;
		minute = FROM_MINUTE;
		second = FROM_SECOND;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		if (hour < FROM_HOUR || hour > TO_HOUR) {
			this.hour = 0;
		}
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		 if (minute < FROM_MINUTE || minute > TO_MINUTE) {
			 this.minute = 0;
		 }
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		 if (second < FROM_SECOND || second > TO_SECOND) {
			 this.second = 0;
		 }
		this.second = second;
	}

	public String getTime() {
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}
	
	
}
