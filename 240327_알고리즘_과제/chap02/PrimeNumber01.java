package chap02;

public class PrimeNumber01 {
  public static void main(String[] args) {
    int[] primeArr = new int[50];
    int numPrime = 0;

    for (int num = 2; num <= 50; num++) {
      if(isPrimeNumber(num, primeArr, numPrime)) {
        primeArr[numPrime++] = num;
        System.out.print(num + " ");
      }
    }
  }

  static boolean isPrimeNumber(int num, int[] primeArr, int numPrime) {
    for (int i = 0; i <= numPrime - 1; i++) {
      if(num % primeArr[i] == 0) {
        return false;
      }
    }
    return true;
  }

  static boolean isPrimeNumber(int num) {
    for (int i = 1; i <= num - 1; i++) {
      if(num % i == 0) {
        return false;
      }
    }
    return true;
  }
}
