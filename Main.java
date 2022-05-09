package lp2com;

public class Main {
	 public static void main(String[] args)
	 {
	     // Create String variables
	     String originalString = "Advanced Encryption Standard";
	     
	     // Call encryption method
	     String encryptedString
	         = AESW.encrypt(originalString);
	     
	     // Call decryption method
	     String decryptedString
	         = AESW.decrypt(encryptedString);

	     // Print all strings
	     System.out.println(originalString);
	     System.out.println(encryptedString);
	     System.out.println(decryptedString);
	 }
	}