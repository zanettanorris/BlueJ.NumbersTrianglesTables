 

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
        String str = "";
        int i = 1;
        for (i = 1; i <= numberOfStars; i++)
        str = str + "*";
        return str;
    }
    
    public static String getTriangle(int numberOfRows) {
        String str = "";
        int i = 1;
        int j;
        for (i = 1; i <= numberOfRows; i++){
         for (j= 1; j<=i; j++){
         str = str + "*";}
         str = str + "\n";}
        return str;
    }


    public static String getSmallTriangle() {
        String str = "";
        int i = 1;
        int j;
        for (i = 1; i <= 4; i++){
         for (j= 1; j<=i; j++){
         str = str + "*";}
         str = str + "\n";}
        return str;
    }

    public static String getLargeTriangle() {
        String str = "";
        int i = 1;
        int j;
        for (i = 1; i <= 9; i++){
         for (j= 1; j<=i; j++){
         str = str + "*";}
         str = str + "\n";}
        return str;    }
}
