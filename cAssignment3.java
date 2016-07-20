public class cAssignment3 {

    /**
     * @param args
     */
    public static void main(String[] args) {
       
        // ANSWER = float , double & long
        int x = 3;
       
        // Cannot convert direct.
        float y = 3.3f;
        long z = 3l;
        double p = 3.2;
       
        //double
        x =  (int)p;
        System.out.println(x);
       
        //float
        x = (int) y;
        System.out.println(x);
       
        //long
        x = (int) z;
        System.out.println(x);
   
   
       
       
       
       
    }

}