package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double vnd = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập usd : ");
        usd = sc.nextDouble();
        double chuyenDoi = usd*vnd;
        System.out.print("giá trị USD : "+ chuyenDoi+" vnđ");
    }
}
