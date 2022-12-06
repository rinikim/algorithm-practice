package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P3460 {
    public static void main(String[] args) throws IOException {
        // 성능 향상을 위해 Scanner 대신 BufferedReader 를 사용한다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // T의 값을 구한다. (T 는 반복문을 실행할 횟수이다.) readLine 은 String 값이기 때문에 int 로 변환한다.
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {   // T 번 반복한다.
            int index = 0; // 인덱스 값을 구하기 위한 변수
            int n = Integer.parseInt(br.readLine());    // 정수 n을 입력받는다.

            while (true) { // 나누는 수가 0 이상이면 실행
                if (n == 1) {
                    System.out.println(index);
                    break;
                }

                if (n % 2 == 1) {   // 나머지가 1이면 이진수로 나타냈을 때 1이 됨
                    System.out.print(index + " ");
                }
                index++;    // 인덱스 값을 +1 해준다.
                n/=2;   // n은 n을 2로 나눈 몫
            }
        }
    }
}
