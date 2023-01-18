package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.SimpleTimeZone;
import java.util.StringTokenizer;

public class P2693 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 테스트 케이스 개수
        int T = Integer.parseInt(br.readLine());

        // 테스트 케이스 시작
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            Integer[] arr = new Integer[10];

            // 배열에 10개 자연수 담기
            for (int j = 0; j < 10; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }
            // 내림차순으로 정렬
            Arrays.sort(arr, Comparator.reverseOrder());
            // 3번째 큰수 출력
            System.out.println(arr[2]);

        }

    }
}
