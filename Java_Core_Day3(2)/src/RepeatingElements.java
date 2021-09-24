import java.util.*;
public class RepeatingElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstNumberSequence = sc.nextLine();
        String secondNumberSequence = sc.nextLine();
        Map<String, Integer> map = new HashMap<String, Integer>();
        Set<String> set = new HashSet<String>();
        for(String numbers : firstNumberSequence.split("\\s")){
            if(map.containsKey(numbers)){
                int count = map.get(numbers) + 1;
                map.put(numbers, count);
            } else {
                map.put(numbers, 1);
            }
        }
        for(String key : map.keySet()){
            if(map.get(key) > 1){
                set.add(key);
            }
        }
        for(String numbers : secondNumberSequence.split("\\s")){
            if(set.contains(numbers)){
                set.remove(numbers);
            }
        }
        for(String res : set){
            System.out.print(res + " ");
        }
    }
}
