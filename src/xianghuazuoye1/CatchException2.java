package xianghuazuoye1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CatchException2 {

	public static void main(String[] args) {
		SimpleDateFormat dateformat=new SimpleDateFormat("yyyy-MM-dd");
		List<Date>list=new ArrayList<>(10);
        try {
        	for(int cnt=0;cnt<10;cnt++) {
        		Date date=dateformat.parse("09-12");
        		list.add(date);
        	}
        }catch(ParseException e) {
        	e.printStackTrace(); 
        }
	}

}
