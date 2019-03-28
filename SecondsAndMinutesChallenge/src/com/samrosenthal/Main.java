package com.samrosenthal;

public class Main {

    public static void main(String[] args) {
	    getDurationString(100);
    }

    public static void getDurationString(int min, int sec) {

        if (min < 0 || sec < 0 || sec > 59) {
            System.out.println("Invalid value");
            return ;
        }

        int hours = min / 60;
        int minutes = min % 60;
        String returnHours;
        String returnMinutes;
        String returnSeconds;

        if (hours < 10 && hours > 0) {
            returnHours = "0" + hours;
        } else if ( hours == 0 ) {
            returnHours = "00";
        } else {
            returnHours = Integer.toString(hours);
        }

        if (minutes < 10 && minutes > 0) {
            returnMinutes = "0" + minutes;
        } else if ( minutes == 0 ) {
            returnMinutes = "00";
        } else {
            returnMinutes = Integer.toString(minutes);
        }

        if (sec < 10 && sec > 0) {
            returnSeconds = "0" + sec;
        } else if ( sec == 0 ) {
            returnSeconds = "00";
        } else {
            returnSeconds = Integer.toString(sec);
        }

        System.out.println(returnHours + "h " + returnMinutes + "m " + returnSeconds + "s");
        return ;
    }

    public static void getDurationString(int sec) {
        if (sec < 0) {
            System.out.println("Invalid value");
            return ;
        }

        int minutes = sec / 60;
        int seconds = sec % 60;

        getDurationString(minutes, seconds);
    }
}
