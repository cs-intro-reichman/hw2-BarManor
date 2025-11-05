public class TimeCalc { // a function that adds a given number of minutes to a given time in "HH:MM" format
    public static void main(String[] args) {
        String givenTime = args[0]; // e.g., "14:30"
        short addedMinutes = Short.parseShort(args[1]); // e.g., 90
        String[] parts = givenTime.split(":");
        byte hours = Byte.parseByte(parts[0]);
        byte minutes = Byte.parseByte(parts[1]);
        short totalMinutes = (short)((hours * 60 + minutes) + addedMinutes); //limiting to short range, summing up the minutes
        short totalHours = (short)((totalMinutes / 60)%24);// wrap around after 24 hours
        totalMinutes = (short)(totalMinutes % 60);//remaining minutes after hours are calculated
        if (totalHours < 10 && totalMinutes < 10) { // a set of conditions to format the output correctly
            System.out.println("0" + totalHours + ":0" + totalMinutes);
        } else if (totalHours < 10) {
            System.out.println("0" + totalHours + ":" + totalMinutes);
        } else if (totalMinutes < 10) {
            System.out.println(totalHours + ":0" + totalMinutes);
        } else {
            System.out.println(totalHours + ":" + totalMinutes);
            
        }
        
    }
}
