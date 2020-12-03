package com.wtxcompsci;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
	    Scanner inf = new Scanner(new File(("input.dat")));

	    int treeCount = 0;

	    ArrayList<String> map = new ArrayList<>();

        while(inf.hasNext()){
            map.add(inf.nextLine());
        }

        int x = 0;
        for(int y = 1; y<map.size(); y++){
            x=((x+3)<map.get(y).length())? x+3 : (x+3)-map.get(y).length();
            if(map.get(y).charAt(x)=='#')
                treeCount++;
        }
        System.out.println(treeCount);
    }
}
