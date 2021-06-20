package com.javaex.ex03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoodsApp {

    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);

		List<Goods> gList = new ArrayList<Goods>();

		System.out.println("상품을 입력해주세요(종료q)");

		String inputString;

		int allcount = 0;

		while (!(inputString = sc.next()).equals("q")) {
			String[] splitArray = inputString.split(",");

			Goods goods = new Goods(splitArray[0], Integer.parseInt(splitArray[1]), Integer.parseInt(splitArray[2]));

			allcount += Integer.parseInt(splitArray[2]);

			gList.add(goods);

		}

		
		System.out.println("=====================================");

		for (Goods ginfo : gList) {
			ginfo.showInfo();
		}

		System.out.println("모든 상품의 갯수는 " + allcount + " 입니다.");

		sc.close();  	
    	
       
    }

}
