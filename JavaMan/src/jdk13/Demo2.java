package jdk13;

enum Month {
    JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC
}

public class Demo2 {
    public static void main(String[] args) {

        Month month = Month.APR;

        /**
         *  Switch 1
         * */
        String result;

        switch (month) {
            case JAN:
                result = "იანვარი";
                break;
            case FEB:
                result = "თებერვალი";
                break;
            case MAR:
                result = "მარტი";
                break;
            case APR:
                result = "აპრილი";
                break;
            case MAY:
                result = "მაისი";
                break;
            case JUN:
                result = "ივნისი";
                break;
            case JUL:
                result = "ივლისი";
                break;
            case AUG:
                result = "აგვისტო";
                break;
            case SEP:
                result = "სექტემბერი";
                break;
            case OCT:
                result = "ოქტომბერი";
                break;
            case NOV:
                result = "ნოებერი";
                break;
            case DEC:
                result = "დეკემბერი";
                break;
            default:
                result = "მსგავსი თვე არ არსებობს";
        }
        System.out.println(result);

        /**
         *  Switch 2
         * */



        switch (month) {
            case DEC:
            case JAN:
            case FEB:
                result = "ზამთარი";
                break;
            case MAR:
            case APR:
            case MAY:
                result = "გაზაფხული";
                break;
            case JUN:
            case JUL:
            case AUG:
                result = "ზაფხული";
                break;
            case SEP:
            case OCT:
            case NOV:
                result = "შემოდგომა";
            default:
                result ="მსგავსი სეზონი არ არსებობს";
        }
        System.out.println(result);
    }
}
