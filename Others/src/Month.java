import java.util.*;
public class Month {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte month = sc.nextByte();
        switch (month){
            case 1:
                System.out.println("tháng một có ba mươi mốt ngày.");
                break;
            case 2:
                System.out.println("tháng hai có hai mươi tám ngày hoặc hai mươi chín ngày.");
                break;
            case 3:
                System.out.println("tháng ba có ba mươi mốt ngày.");
                break;
            case 4:
                System.out.println("tháng tư có ba mươi ngày.");
                break;
            case 5:
                System.out.println("tháng năm có ba mươi mốt ngày.");
                break;
            case 6:
                System.out.println("tháng sáu có ba mươi ngày.");
                break;
            case 7:
                System.out.println("tháng bảy có ba mươi mốt ngày.");
                break;
            case 8:
                System.out.println("tháng tám có ba mươi mốt ngày.");
                break;
            case 9:
                System.out.println("tháng chín có ba mươi ngày.");
                break;
            case 10:
                System.out.println("tháng mười có ba mươi mốt ngày.");
                break;
            case 11:
                System.out.println("tháng mười một có ba mươi ngày.");
                break;
            case 12:
                System.out.println("tháng mười hai có ba mươi mốt ngày.");
                break;
            default:
                System.out.println("tháng không hợp lệ");
        }
    }
}
