public class Time {
    int hour;
    int minute;

    Time(String hourAndMinute) {
        String[] abc = hourAndMinute.split(":", 2);
        this.hour = Integer.parseInt(abc[0]);
        this.minute = Integer.parseInt(abc[1]);

    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    @Override
    public String toString() {
        return hour + ":" + minute;

    }

    public void convert() {
        if (this.hour >= 12 && this.hour != 24)
           System.out.println(hour - 12+":" + minute + "p.m.");
        else if (this.hour == 24)
            System.out.println("0"+":" + minute + "a.m.");
        else
            System.out.println(hour+":"+ minute + "a.m.") ;

    }

}
