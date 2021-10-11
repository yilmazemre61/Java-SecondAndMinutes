public class SecondAndMinutesChallenge {


    
    public static int getDurationString (int minutes, int seconds) {

        if ((minutes <0) || ((seconds <0) || (seconds >59))) {
            System.out.println("Invalid Value");
        } else {
            if (minutes > 59) {
                int hours = minutes / 60;
                minutes = minutes - (hours * 60);
                if (hours < 10 && minutes < 10 && seconds < 10) {
                    System.out.println("0" + hours + " h " + "0" + minutes + " m " + "0" + seconds + " s");
                } else if (hours < 10 && minutes < 10 && seconds >= 10) {
                    System.out.println("0" + hours + " h " + "0" + minutes + " m " + seconds + " s");
                } else if (hours >= 10 && minutes < 10 && seconds < 10) {
                    System.out.println(hours + " h " + "0" + minutes + " m " + "0" + seconds + " s");
                } else if (hours >= 10 && minutes >= 10 && seconds < 10) {
                    System.out.println(hours + " h " + minutes + " m " + "0" + seconds + " s");
                } else {
                    System.out.println(hours + " h " + minutes + " m " + seconds + " s");
                }
            } else {
                int hours = 0;
                if (minutes >= 10 && seconds >=10) {
                    System.out.println("0" + hours + " h " + minutes + " m " + seconds + " s");
                } else if (minutes < 10 && seconds >= 10) {
                    System.out.println("0" +hours + " h " + "0" + minutes + " m " + seconds + " s");
                } else if (minutes >= 10 && seconds < 10) {
                    System.out.println("0" + hours + " h " + minutes + " m " + "0" + seconds + " s");
                } else {
                    System.out.println("0" + hours + " h " + "0" + minutes + " m " + "0" + seconds + " s" );
                }

            }
        }
        return minutes;
    }

    public static int getDurationString (int seconds) {
        if (seconds <0) {
            System.out.println("Invalid Value");
        }
        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;

        return getDurationString(minutes,remainingSeconds);
    }

}
