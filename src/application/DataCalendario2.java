package application;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class DataCalendario2 {

	public static void main(String[] args) {
	
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date d = Date.from(Instant.parse("2008-06-25T15:42:07Z"));
		
		System.out.println(sdf.format(d));
		
		Calendar cal = Calendar.getInstance();
		//calendario com a data instanciada dentro dele
		cal.setTime(d);
		
		//pode adicionar min, hora, mes, dia...
		/*
		cal.add(Calendar.HOUR_OF_DAY, 4);
		d = cal.getTime();
		
		System.out.println(sdf.format(d));
		*/
		
		int min = cal.get(Calendar.MINUTE);
		int month = 1+cal.get(Calendar.MONTH);
		
		System.out.println("Minuto: " +min);
		System.out.println("Mês: " +month);
		
		
	}

}
