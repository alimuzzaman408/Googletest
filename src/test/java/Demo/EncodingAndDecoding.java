package Demo;

import org.apache.commons.codec.binary.Base64;

public class EncodingAndDecoding {

	public static void main(String[] args) {
	String str="mercury";
	
	       byte[]encodestr=Base64.encodeBase64(str.getBytes());
	       System.out.println("Encode string:"+new String(encodestr));
	       
	       byte[]decodestr=Base64.decodeBase64(encodestr);
	       System.out.println("Decode string:"+new String(decodestr));
	
	
	
	

	}

}
