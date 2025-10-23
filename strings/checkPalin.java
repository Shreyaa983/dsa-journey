package strings;

public class checkPalin {
    public static boolean checkPalin(String str) {
        StringBuilder sb = new StringBuilder(str);

        int l = 0;
        int r = sb.length() - 1;

        while (l < r) {
            while (l < r && !Character.isLetterOrDigit(sb.charAt(l))) {
                l++;
            }
            while (l < r && !Character.isLetterOrDigit(sb.charAt(r))) {
                r--;
            }

            if (l < r && Character.toLowerCase(sb.charAt(l)) != Character.toLowerCase(sb.charAt(r)))
                return false;

            l++;
            r--;
        }

        return true;
    }

    public static void main(String[] args) {
        String str = "c1 O$d@eeD o1c";
        System.out.println(checkPalin(str));
    }
}