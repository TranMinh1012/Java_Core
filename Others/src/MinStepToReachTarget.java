import java.util.*;
public class MinStepToReachTarget {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int startRow = sc.nextInt(); int startColumn = sc.nextInt();
        int endRow = sc.nextInt(); int endColumn = sc.nextInt();
        int minStep = 0;
        if(startRow == endRow) minStep = Math.abs(startColumn - endColumn);
        if(startColumn == endColumn) minStep = Math.abs(startRow - endRow);
        if(startRow > endRow){
            if(startColumn > endColumn){
                for(int i = startColumn; i >= endColumn; i--){
                    minStep++; startColumn--;
                    if(i == endColumn) minStep = minStep + (startColumn-endColumn);
                }
            }
            if(startColumn < endColumn){
                for(int i = startColumn; i <= endColumn; i++){
                    minStep++; startColumn++;
                    if(i == endColumn) minStep = minStep + (endColumn - startColumn);
                }
            }
        }
        if(startRow < endRow){
            if(startColumn > endColumn){
                for(int i = startColumn; i >= endColumn; i--){
                    minStep++; startColumn--;
                    if(i == endColumn) minStep = minStep + (startColumn-endColumn);
                }
            }
            if(startColumn < endColumn){
                for(int i = startColumn; i <= endColumn; i++){
                    minStep++; startColumn++;
                    if(i == endColumn) minStep = minStep + (endColumn - startColumn);
                }
            }
        }
        System.out.println(minStep);
    }
}
