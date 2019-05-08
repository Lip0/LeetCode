import java.util.HashMap;

public class RomanToInteger {
    private HashMap<Character,Integer> romanMap=new HashMap<Character,Integer>();
    public int romanToInt(String s) {
        romanMap.put('I', 1);
        romanMap.put('V',5);
        romanMap.put('X',10);
        romanMap.put('L',50);
        romanMap.put('C',100);
        romanMap.put('D',500);
        romanMap.put('M',1000);
        int result =0;
        int currentNum=0;
        int beforeNum=0;
        int twoNumSum=0;
        for(int i=s.length()-1;i>=0;i--){
            currentNum=romanMap.get(s.charAt(i));
            beforeNum = i!=0 ? romanMap.get(s.charAt(i-1)):0;
            twoNumSum=currentNum+beforeNum;
            if((twoNumSum%6==0 || twoNumSum%11==0)&&(currentNum>beforeNum)){
                twoNumSum=currentNum-beforeNum;
                result=result+twoNumSum;
                i--;
            }else{
                result=result+currentNum;
            }
        }
        return result;
    }

}
class Main {
    public static void main(String[] args) {
        // Create a new Solution instance
        RomanToInteger solution = new RomanToInteger();
        int answer = solution.romanToInt("LVIII");
        // Print the answer
        System.out.println(answer);
    }
}
