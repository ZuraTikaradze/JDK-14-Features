package jdk14;

enum Month {
    JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC
}

public class Demo2 {
    public static void main(String[] args) {
        Month month = Month.APR;
        String result;

        result = switch (month) {
            case JAN -> "იანვარი";
            case FEB -> "თებერვალი";
            case MAR -> "მარტი";
            case APR -> "აპრილი";
            case MAY -> "მაისი";
            case JUN -> "ივნისი";
            case JUL -> "ივლისი";
            case AUG -> "აგვისტო";
            case SEP -> "სექტემბერი";
            case OCT -> "ოქტომბერი";
            case NOV -> "ნოემბერი";
            case DEC -> "დეკემბერი";
            default -> "მსგავსი თვე არ არსებობს";
        };
        System.out.println(result);


        switch (month) {
            case DEC, JAN, FEB -> {result = "ზამთარი"; }
            case MAR, APR, MAY -> {result = "გაზაფხული";}
            case JUN, JUL, AUG -> {result = "ზაფხული";}
            case SEP, OCT, NOV -> {result = "შემოდგომა";}
            default -> {result = "მსგავსი სეზონი არ არსებობს";}
        }
        System.out.println(result);

    }
}
