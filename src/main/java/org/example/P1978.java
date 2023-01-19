package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer N = Integer.parseInt(br.readLine());

        // 소수의 개수
        int count = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            boolean isPrimeNumber = addPrimeNumber(st);
            if (isPrimeNumber) {
                count++;
            }
        }
        System.out.println(count);
    }

    private static boolean addPrimeNumber(StringTokenizer st) {
        int num = Integer.parseInt(st.nextToken());
        // 0, 1은 소수에 포함되지 않는다.
        if (num == 1) {
            return false;
        }

        for (int j = 2; j < num; j++) {
            // j와 나누었을 때 0으로 떨어지면 공약수 존재한다.
            if (num % j == 0) {
                return false;
            }
        }
        // 공약수가 존재하지 않기 때문에 소수이다.
        return true;
    }
}
