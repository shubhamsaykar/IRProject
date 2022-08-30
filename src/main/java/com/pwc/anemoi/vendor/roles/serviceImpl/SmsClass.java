package com.pwc.anemoi.vendor.roles.serviceImpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

public class SmsClass {

	public static void sendSms(String message, String number) throws IOException {
		System.out.println(message);
		System.out.println(number);
		try {
		String apiKey = "O8JyeLjzuXb5TvPFxRlnGpr61qIN2kKmEShaWcoVQti3DMB7AZOpLM7rzZSNCuJBDhsHmyU29b3kI1VF";
		String variables_values = "9921";
		String sendId = "FastSM";
		String language = "English";
		String route = "otp";
		
		
		String myUrl = "https://www.fast2sms.com/dev/bulkV2?authorization="+apiKey+"&variables_values="+variables_values+"&route="+route+"&numbers="+number;
//		System.out.println(myUrl);
		
		
		URL url = new URL(myUrl);
		
		HttpURLConnection con =(HttpURLConnection) url.openConnection();
		
		con.setRequestMethod("GET");
		con.setRequestProperty("User-Agent", "Mozilla/5.0");
		con.setRequestProperty("cache=control", "no-cache");
		System.out.println("wait ..........");
		int responseCode = con.getResponseCode();
		System.out.println("Response code: "+responseCode);
		
		StringBuffer response = new StringBuffer();
		BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
		while(true) {
			String line = br.readLine();
			if(line==null) {
				break;
			}else {
				response.append(line);
			}
		}
		
		System.out.println(response);
		
		
		
			message = URLEncoder.encode(message,"UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
