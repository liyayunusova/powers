import java.lang.Math;

public class Kata{ public static long[] powersOfTwo(int n){

//TODO: Have fun
long[] pow = new long[n+1]; 
for(int i = 0; i < pow.length; i++){
  pow[i] = (long)Math.pow(2,i);
}
return pow;
} }
