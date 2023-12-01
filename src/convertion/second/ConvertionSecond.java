package convertion.second;

public class ConvertionSecond {

    public static void main(String[] args) {
        long secondInput=3000;
        
        calculator(secondInput);

    }

    public static int calculator(long secondInput) {

        long hour = secondInput / 3600;
        long minute = (secondInput % 3600) / 60;
        long secondOutput = (secondInput % 3600) % 60;
        if (hour > 0) {
            System.out.print(hour + " saat ");
        }
        if (minute > 0) {
            System.out.print(minute + " dakika ");
        }
        if (secondOutput > 0) {
            System.out.print(secondOutput + " saniye ");

        }
        return 0;

    }
}
