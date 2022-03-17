public class Validate{

    static boolean isInterleaved (String A, String B, String C)
    {
        int i = 0, j = 0, k = 0;

        while (k != C.length())
        {
            if (i<A.length()&&A.charAt(i) == C.charAt(k))
                i++;
            else if (j<B.length()&&B.charAt(j) == C.charAt(k))
                j++;
            else
                return false;
            k++;
        }
        if (i < A.length() || j < B.length())
            return false;
        return true;
    }
    public static void main(String []args){
        String A = "gid";
        String B = "Hash";
        String C = "Hgaisdh";
        if (isInterleaved(A, B, C) == true)
            System.out.printf(C+" is a "+"Valid Shuffle", C, A, B);
        else
            System.out.printf(C+" is a "+"Invalid Shuffle", C, A, B);
    }
}