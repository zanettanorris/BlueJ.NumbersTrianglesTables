


public class NumberUtilities {

    public static String getRange(int stop) {
        String str ="";
        for (int i = 0; i < stop; i++){
        str = str + i;}
        return str;
    }

    public static String getRange(int start, int stop) {
        String str ="";
        for (int i = start; i < stop; i++){
        str += i;}
        return str;
    }


    public static String getRange(int start, int stop, int step) {
        String str = "";
        for (int i = start; i<stop; i+=step){
        str += i;}
        return str;
    }

    public static String getEvenNumbers(int start, int stop) {
        String str ="";
        if (start % 2 == 0){
        for (int i = start; i < stop; i+= 2)
            str += i;
            return str;}
        else {for (int i=start + 1; i<stop; i +=2)
            str += i;
            return str;}
    }


    public static String getOddNumbers(int start, int stop) {
        String str ="";
        if (start % 2 == 1);{
        for (int i = start; i < stop; i+= 2){
            str += i;}
            return str;}
    }


    public static String getExponentiations(int start, int stop, int exponent) {
        String str ="";
        for (int i = start; i <= stop; i++){
        str += (int)Math.pow(i, exponent);}
        return str;}
    }
