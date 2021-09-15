import java.util.*;
public class CheckTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstEdge = sc.nextInt();
        int secondEdge = sc.nextInt();
        int thirdEdge = sc.nextInt();
        if( (firstEdge>0) && (secondEdge>0) && (thirdEdge>0) && (firstEdge+secondEdge>thirdEdge) &&
            (firstEdge+thirdEdge>secondEdge) && (secondEdge+thirdEdge>firstEdge) ){
            if( (firstEdge==secondEdge) && (secondEdge==thirdEdge) ){
                System.out.println("This is an Equilateral triangle");
            } else if ( (firstEdge==secondEdge) || (firstEdge==thirdEdge) || (secondEdge==thirdEdge) ){
                System.out.println("This is an Isosceles Triangle");
            } else {
                System.out.println("This is a Scalene Triangle ");
            }
        } else {
            System.out.println("This is not a triangle");
        }
    }
}
