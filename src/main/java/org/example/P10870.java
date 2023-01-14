package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P10870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 입력 받은 값
        int n = Integer.parseInt(br.readLine());
        // n번째 피보나치 수
        System.out.println(fivo(n));
    }

    private static int fivo(int n) {
        if (n <= 1) return n;
        return fivo(n - 1) + fivo(n - 2);
    }

}
