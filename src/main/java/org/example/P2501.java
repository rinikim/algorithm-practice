package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2501 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        // 약수의 순서를 저정할 변수
        int count = 0;
        // K번째 약수를 저장할 변수
        int result = 0;

        for (int i = 1; i <= N; i++) {
            // 약수가 한 개 나올 때마다 count + 1
            if (N % i == 0) {
                count++;
            }

            if (count == K) {
                result = i;
                break;
            }
        }

        System.out.println(result);
    }
}
