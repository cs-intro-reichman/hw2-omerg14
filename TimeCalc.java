public class TimeCalc {
    public static void main(String[] args) {
      
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
	    int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int minutesToAdd = Integer.parseInt(args[1]);
        int totalHours;
        int totalMinutes;
        int newHours;
        int newMinutes;
    
        totalMinutes = (hours * 60) + minutes + minutesToAdd;
        totalHours = totalMinutes / 60;
        newHours = totalHours % 24; 
        newMinutes = totalMinutes - (totalHours * 60);
        
        String minutesStr;
	    if (newMinutes < 10) {
    	    minutesStr = "0" + newMinutes;
	    } else {
    	    minutesStr = "" + newMinutes;
	    }

        System.out.println(newHours + ":" + minutesStr);
    }
}
