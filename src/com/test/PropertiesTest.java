package com.test;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Properties;

public class PropertiesTest {
	public static void main(String[] args) throws IOException {
		Properties pp = new Properties();
		InputStream in = new BufferedInputStream(new FileInputStream("E://a.txt"));
		pp.load(in);
//		System.out.println(pp);
		Iterator<String> it = pp.stringPropertyNames().iterator();
		HashMap<String, String> has = new HashMap<String, String>();
		while (it.hasNext()) {
			String key = (String) it.next();
			String value = pp.getProperty(key);
			has.put(key, value);
//			System.out.println(key+"--------------"+has.get(key));
			
//			System.out.println(key);
			
		}
		Iterator<?> iii = has.entrySet().iterator();
		while (iii.hasNext()) {
			Object object = (Object) iii.next();
			System.out.println(object.toString());
		}
	}
}
