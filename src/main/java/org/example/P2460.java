package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2460 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 현재 열차에 있는 최대 인원
        int max = 0;
        // 기차 안에 있는 인원
        int people = 0;

        for (int i = 0; i < 10; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            // 이번 열차 내린 사람
            int out = Integer.parseInt(st.nextToken());
            // 이번 열차 탄 사람
            int in = Integer.parseInt(st.nextToken());

            people -= out;
            people += in;

            // 현재 인원이 최대 인원보다 클 때
            if (people > max) {
                max = people;
            }
        }
        System.out.println(max);

    }
}
