 

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
       String str = "";
        int i = 1;
        int j = 1;
        for  (i= 1; i<=5; i++){
            for  (j= 1; j<=5; j++){
            str = str + String.format("%5s", (j*i) +" |");}
        str = str + "\n";}
    return str;}

    public static String getLargeMultiplicationTable() {
           String str = "";
        int i = 1;
        int j = 1;
        for  (i= 1; i<=10; i++){
            for  (j= 1; j<=10; j++){
            str = str + String.format("%5s", (j*i) +" |");}
        str = str + "\n";}
    return str;}

    public static String getMultiplicationTable(int tableSize) {
        String str = "";
        int i = 1;
        int j = 1;
        for  (i= 1; i<=tableSize; i++){
            for  (j= 1; j<=tableSize; j++){
            str = str + String.format("%5s", (j*i) +" |");}
        str = str + "\n";}
    return str;}}
    
