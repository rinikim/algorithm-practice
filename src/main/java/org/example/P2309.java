package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P2309 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 9명의 난쟁이 키 목록
        int[] arr = new int[9];
        // 난쟁이 키의 합
        int sum = 0;
        // 새로 들어온 난쟁이
        int spyA = 0, spyB = 0;

        for (int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            // 난쟁이 9명의 키의 합
            sum += arr[i];
        }

        // 브루트 포스
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (sum - arr[i] - arr[j] == 100) {
                    spyA = arr[i];
                    spyB = arr[j];
                    break;
                }
            }
        }

        // 난쟁이의 키 오름차순 정렬
        Arrays.sort(arr);
        // 진짜 난쟁이들의 키 출력
        for (int i = 0; i < 9; i++) {
            if (arr[i] == spyA || arr[i] == spyB) {
                continue;
            }
            System.out.println(arr[i]);
        }

    }
}
