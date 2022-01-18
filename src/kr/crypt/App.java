package kr.crypt;

import java.util.Scanner;

import kr.crypt.demo.DataCrypt;
import kr.crypt.demo.model.DecryptData;
import kr.crypt.demo.model.EncryptData;
import kr.crypt.demo.rsa.RSACrypt;
import kr.crypt.demo.rsa.RSAKeyObject;

// Main Class For Test
public class App {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		DataCrypt dataCrypt = new DataCrypt();
		
		String str = "";
		str = sc.next();
		
		System.out.println("1. RSA 생성 ==============================================");
		RSAKeyObject rsaKey = RSACrypt.generateRsaKeyPair();
		System.out.println("RSA 공개키 B64: " + rsaKey.getRsaPublicKey());
		System.out.println("RSA 개인키 B64: " + rsaKey.getRsaPrivateKey());
		
		System.out.println("2. AES+RSA 암호화 ==============================================");
		EncryptData cryptData = dataCrypt.encryptData(str, rsaKey);
		System.out.println("RSA 공개키로 AES 키를 암호화 : " + cryptData.getEncryptAesKey());
		System.out.println("AES 로 데이터 암호화 : " + cryptData.getEncryptData());
		
		System.out.println("3. AES+RSA 복호화 ==============================================");
		DecryptData decryptData = dataCrypt.decryptData(cryptData, rsaKey);
		System.out.println("복호하된 AES 키 : " + decryptData.getAesKey());
		System.out.println("복호화된 데이터 : " + decryptData.getData());

		sc.close();
	}

}
