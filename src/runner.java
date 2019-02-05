public class runner {
   // warm up 1: has teen
    public boolean hasTeen(int a, int b, int c) {
        if(13<=a && a<20 || 13<=b && b<20 ||13<=c && c<20 ){
            return true;
        }else{
            return false;
        }
    }
    //warm up 2: count xx
    int countXX(String str) {
        int count=0;
        for(int i=0; i < (str.length()-1);i++){
            if(str.substring(i,i+2).equals("xx"))
                count++;
        }
        return count;
    }
    // string 1: hello name
    public String helloName(String name){
        return("Hello " + name +"!");
    }
    //array 1 start 1
    public int start1(int[] a, int[] b) {
        int count = 0;
        if (a.length != 0) {
            if (a[0]== 1)
                count++;
        }

        if (b.length != 0) {
            if (b[0]== 1)
                count++;
        }

        return count;
    }



    //logic 1 love 6

    public boolean love6(int a, int b) {
        if( a==6 || b==6){
            return true;
        }
        if(a+b==6){
            return true;
        }
        if(a-b==6){
            return true;
        }
        if(b+a==6){
            return true;
        }
        if(b-a==6){
            return true;
        }else{
            return false;
        }

    }


    //logic 2 evenly spaced

    public boolean evenlySpaced(int a, int b, int c) {
        int dif1=b-a;
        int dif2=c-b;
        if(dif1==dif2){
            return true;
        }else{
            return false;
        }
    }

    //string 2 : bob there
    public boolean bobThere(String str) {
        int x = str.length();
        for(int i=0; i < x-2; i++){
            if(str.substring(i,i+1).equals("b") && str.substring(i+2,i+3).equals("b")){
                return true;
            }
        }
        return false;
    }

    //string 3: count tripple

    public int countTriple(String str) {
        int count=0;
        int x=str.length();
        for(int i =0; i < x-2; i++){
            if(str.substring(i,i+1).equals(str.substring(i+1,i+2)) && str.substring(i+1,i+2).equals(str.substring(i+2,1+3))){
                count++;
            }
        }
        return count;
    }

    //array 2: lucky 13
    public boolean lucky13(int[] nums) {
        int x=nums.length;
        for(int i=0;i < x;i++){
            if(nums[i]==1|| nums[i]==3){
                return false;
            }
        }
        return true;
    }

    //array 3: CLUMPS
    public int countClumps(int[] nums) {
        int x=nums.length;
        int count=0;
        for(int i =0; i < x-1; i++){
            if(nums[i]==nums[i+1] && (i==0 || nums[i]!= nums[i-1])){
                count++;
            }
        }
        return count;
    }

    //ap-1: scores 100
    public boolean scores100(int[] scores) {
        boolean answer=false;
        int x=scores.length;
        for(int i=0; i < x-1;i++){
            if(scores[i]==100 && scores[i+1]==100){
                answer=true;
            }
        }
        return answer;
    }



}

