public class Duplicate {
    public static String consectutivestring(String s){
        if(s.length()<=1){
            return s;
        }
        if(s.charAt(0)==s.charAt(1)){
            return consectutivestring(s.substring(1));
        }
        else{
            return s.charAt(0) + s.charAt(1);
        }
    }
    public static void main(String []args){
        String s1 = "veedant";
        System.out.println(consectutivestring(s1));
    }
}
