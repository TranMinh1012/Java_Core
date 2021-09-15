import java.util.*;
class Point{
    private double startPoint;
    private double endPoint;

    public Point(double startPoint, double endPoint){
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }
    public double getStartPoint(){
        return startPoint;
    }
    public double getEndPoint(){
        return endPoint;
    }
    public double distanceEuclidean(double startPoint, double endPoint){
        return Math.sqrt((this.startPoint-startPoint)*(this.startPoint-startPoint)+(this.endPoint-endPoint)*(this.endPoint-endPoint));
    }
    public double distanceEuclidean(Point anotherPoint){
        return distanceEuclidean(anotherPoint.getStartPoint(), anotherPoint.getEndPoint());
    }
}
public class FindDistanceEuclidean {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Point firstPoint = new Point(sc.nextDouble(), sc.nextDouble());
        Point secondPoint = new Point(sc.nextDouble(), sc.nextDouble());
        System.out.println(firstPoint.distanceEuclidean(secondPoint));
    }
}
