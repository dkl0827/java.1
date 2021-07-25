package clockzuoye;

import java.util.Calendar;

class Clock {
	private int hour;
	private int min;
	private int sec;

	public Clock(){
		Calendar cal=Calendar.getInstance();
		hour=cal.get(Calendar.HOUR_OF_DAY);
		min=cal.get(Calendar.MINUTE);
		sec=cal.get(Calendar.SECOND);
	}
	public void go(){
		sec++;
		if(sec==60){
			sec=0;
			min++;
			if(min==60){
				min=0;
				hour++;
				if(hour==24)
					hour=0;
			}
		}
		
 
	}
	public void showtime(){
		String time="";
		if(hour<10){
			time=time+"0";
		}
		time=time+hour+":";
		if(min<10)
			time=time+"0";
		time=time+min+":";
		if(sec<10)
			time=time+"0";
		time=time+sec;
		System.out.println(time);
	}
}


public class clockrun {
	public static void main(String[] args) throws Throwable {
		
		
		Clock p1=new Clock();
		while(true){
			p1.go();
			p1.showtime();
			Thread.sleep(1000);
		}
	}

}
