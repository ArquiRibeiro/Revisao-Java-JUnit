package arquiribeiro;

public class Basics {
    public int sum(int n1, int n2) {
        return n1+n2;
    }

    public int fibonacci(int n){
        int result = 0;
        int last = 1;
        int temp = result;

        for(int i = 0; i < n; i++){
            temp = result; //0
            result = result + last; //1
            last = temp; //0
        }
        
        return result;
    }

    public int[] reverseArray(int[] originalArray){
        int[] reversedArray = new int[originalArray.length];

        for(int i = 0; i < originalArray.length; i++){
            reversedArray[i] = originalArray[(originalArray.length -1) - i];
        }

        return reversedArray;
    }
}
