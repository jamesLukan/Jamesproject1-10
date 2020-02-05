public class Runner {
    public static void main(String[] args) {

        int[] x = {1, 2, 3};


        System.out.println(makes10(10,56));
        System.out.println(greenTicket(12,13,14));
        System.out.println(sortaSum(13,15));
        System.out.println(teenSum(14,15));
        System.out.println(firstTwo("Hello"));
        System.out.println(sum3(x));
        System.out.println(array123(x));
        System.out.println(noTeenSum(1,4,7));
        System.out.println(repeatEnd("Hello",4));
        System.out.println(fizzArray(5));
        System.out.println(countTriple("XXXyyyyyyXXX"));
        System.out.println(maxSpan(x));

    }

    //
    public static boolean makes10(int a, int b) {
        if( a + b == 10 || a == 10 || b == 10){
            return true;
        }else{
            return false;
        }


    }

    //
    public static int sumDouble(int a, int b) {
        if(a==b){
            return (a + b) * 2;
        }else{
            return a + b;
        }
    }

    //
    public static int greenTicket(int a, int b, int c) {
        if(a==b && b==c){
            return 20;
        }else if(a==b || c==b || c==a){
            return 10;
        }else{
            return 0;
        }
    }

    //
    public static int sortaSum(int a, int b) {
        if(a+b<=19 && a+b>= 10){
            return 20;
        }else{
            return a+b;
        }
    }


    //
    public  static int teenSum(int a, int b) {
        if(a <=19 && a>= 13){
            return 19;
        }else if(b<=19 && b>=13){
            return 19;
        } else{
            return a+b;
        }
    }



    //
    public static String firstTwo(String str) {
        if(str.length() <= 2){
            return str;
        }
        return str.substring(0,2);
    }


    public static int sum3(int[] nums) {
        return nums[0] + nums[1] + nums[2];
    }




    //
    public static boolean array123(int[] nums) {
        for(int i=0; i<nums.length-2; i++){
            if(nums[i] == 1 && nums[i+1] == 2 && nums[i+2] == 3)
                return true;


        }
        return false;


    }




    //
    public static int noTeenSum(int a, int b, int c) {
        a =fixTeen(a);
        b =fixTeen(b);
        c =fixTeen(c);
        return a + b + c;
    }



    // fix teen made for noTeenSum
    public  static int  fixTeen(int n){
        if(n<=19 && n>=17){
            return 0;
        }else if(n>=13 && n<=14){
            return 0;
        }else{
            return n;
        }
    }






    //
    public static String repeatEnd(String str, int n) {
        String sub = str.substring(str.length() - n);
        String last = "";
        for( int i=0; i<n; i++){
            last += sub;
        }
        return last;

    }

    // array 2
    public static int[] fizzArray(int n) {

        int[] answer = new int[n];

        for(int i=0; i<n; i++){
            answer[i] = i;
        }
        return answer;
    }




    // string 3
    public static int countTriple(String str) {

        int n = 0;

        for(int i=0; i < str.length()-2; i++){
            if(str.substring(i,i+1).equals(str.substring(i+1,i+2))
                    && str.substring(i+2,i+3).equals(str.substring(i,i+1))){
                n = n += 1;
            }
        }
        return n;
    }


    // array 3
    public static int maxSpan(int[] nums) {
        int max = 0;
        for(int i=0; i<nums.length; i++){
            int length = nums.length-1;
            while(nums[i] != nums[length]){
                length -= 1;
            }
            int span = length - i +1;
            if(span >max){
                max = span;
            }
        }
        return max;
    }



}




