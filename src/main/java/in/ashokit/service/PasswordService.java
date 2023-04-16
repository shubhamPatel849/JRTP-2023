package in.ashokit.service;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class PasswordService {

	private static String decode;
    int j=20;

	int x=10;

	public static String encode(String txt) {
		Encoder encoder = Base64.getEncoder();
		return encoder.encodeToString(txt.getBytes());
	}

	public static String Decode(String encodertxt) {
		Decoder decoder = Base64.getDecoder();
		byte[] decode = decoder.decode(encodertxt);
		return new String(decode);
	}

}
