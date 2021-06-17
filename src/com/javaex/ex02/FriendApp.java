package com.javaex.ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);	
    
    List<Friend> fList = new ArrayList<Friend>();
    
    System.out.println("친구를 3명 등록해 주세요");
    
    for(int i=0; i<3; i++) {
    	String[] friendInfo = (sc.nextLine()).split(" ");                            //확실하게 공부 필요 
		String[] friendArray = new String[3];
		friendArray = friendInfo;
		Friend f = new Friend(friendArray[0], friendArray[1], friendArray[2]);
		fList.add(f);
    }
    
    for( Friend f : fList ) {
    	f.showInfo();
    }
    
    
    
    
    
    
    sc.close();
    	
    }
    

}
