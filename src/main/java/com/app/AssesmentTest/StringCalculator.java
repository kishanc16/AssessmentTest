package com.app.AssesmentTest;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class StringCalculator 
{
    public static void main( String[] args )
    {
        String str = "//[**][%%]\n1**2%%3”";
        int ans = add(str);
        System.out.println(ans);
    }

	public static int add(String str) {
		int ans = 0;
		if(str.length() == 0)
			return ans;
		
		if(str.length() > 0){
			if(str.length() == 1){
				int num = Integer.parseInt(str.trim());
				ans = num;
			}else{
				//String s[] =str.split("[,]|[\n]");
				
				String filterStr = str.replaceAll("[^0-9 -]+", ";");
				String s[] = filterStr.trim().split(";");
				//System.out.println(Arrays.toString(s));
				for(int i=0; i<s.length; i++){
					if(s[i].length() > 0){
						int x = Integer.parseInt(s[i]);
						if(x < 0)
							throw new ArithmeticException("negatives not allowed : " + x);
						if(x <= 1000)
							ans += x;
					}
				}
			}
				
		}
		return ans;
	}	
}

