import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.util.*;
public class EncryptAndDecryptMessage {
	public static void main(String[] args)
	{

		try {
			// Generating objects of KeyGenerator &
			// SecretKey
			KeyGenerator keygenerator
				= KeyGenerator.getInstance("DES");
			SecretKey myDesKey = keygenerator.generateKey();

			// Creating object of Cipher
			Cipher desCipher;
			desCipher = Cipher.getInstance("DES");
			System.out.print("Enter the Message : ");
			Scanner sc = new Scanner (System.in);
			String S=sc.nextLine();
			byte[]text=S.getBytes("UTF8");
			// Encrypting Message
			desCipher.init(Cipher.ENCRYPT_MODE, myDesKey);
			byte[] textEncrypted = desCipher.doFinal(text);

			// Converting encrypted byte array to Message
			String s = new String(textEncrypted);
			System.out.println("Encrypted Message : "+s);

			// Decrypting Message
			desCipher.init(Cipher.DECRYPT_MODE, myDesKey);
			byte[] textDecrypted
				= desCipher.doFinal(textEncrypted);

			// Converting decrypted byte array to Message
			s = new String(textDecrypted);
			System.out.println("Decrypted Message : "+s);
		}
		catch (Exception e) {
			System.out.println("Exception");
		}
	}
}
