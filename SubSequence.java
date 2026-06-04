public class SubSequence {
    static void sequence(String str,int index, String result){
        if(str.length()==index){
            System.out.println(result);
            return;
        }
      //  sequence(str, index+1, result);
        sequence(str, index+1, result+str.charAt(index));
    }
public static void main(String[] args) {
    String str="abc";
    sequence(str, 0,"");
}
}
