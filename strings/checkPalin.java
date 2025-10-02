package strings;

public class checkPalin {
    public static boolean checkPalin(String str){
        StringBuilder sb = new StringBuilder();
        for(char c : str.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                sb.append(Character.toLowerCase(c));
            }
        }

        int l = 0;
        int r = sb.length()-1;
        while(l < r){
            if(sb.charAt(r) != sb.charAt(l)) return false;

            l++;
            r--;
        }

        return true;
    }

    public static void main (String [] args){
        String str = "c1 O$d@eeD o1c";
        System.out.println(checkPalin(str));
    }
}