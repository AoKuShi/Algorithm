package queue;

import java.util.Scanner;

public class IntQueueTester {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    IntQueue s = new IntQueue(64);

    while (true) {
      System.out.println();
      System.out.printf("현재 데이터 개수: %d / %d\n", s.getSize(), s.getCapacity());
      System.out.print("(1) 인큐  (2) 디큐  (3) 피크  (4) 덤프  (0) 종료: ");

      int menu = stdIn.nextInt();
      if (menu == 0) {
        break;
      }
      
      int x;
      switch (menu) {
        case 1: {
          if (s.isFull()) {
            System.out.println("큐가 가득 찼습니다.");
          } else {
            System.out.print("데이터: ");
            s.enqueue(stdIn.nextInt());
          }
          break;
        }

        case 2: {
          if (s.isEmpty()) {
            System.out.println("큐가 비어 있습니다.");
          } else {
            x = s.dequeue();
            System.out.println("디큐한 데이터는 " + x + "입니다.");  
          }
          break;
        }

        case 3: {
          if (s.isEmpty()) {
            System.out.println("큐가 비어 있습니다.");
          } else {
            x = s.getFront();
            System.out.println("피크한 데이터는 " + x + "입니다.");  
          }
          break;
        }

        case 4: {
          s.dump();
          break;
        }
        
      }


    }


  }
}


