package kr.crypt.demo;

import kr.crypt.demo.aes.AESCrypt;
import kr.crypt.demo.model.DecryptData;
import kr.crypt.demo.model.EncryptData;
import kr.crypt.demo.rsa.RSACrypt;
import kr.crypt.demo.rsa.RSAKeyObject;
import kr.crypt.demo.utils.MD5Utils;

public class DataCrypt {

	// IV 사이즈는 16바이트 (128비트) 고정이다
	private static final int ivSize = 16;

	/**
	 * @methodName: encryptData
	 * @author: rojae
	 * @date: 2022. 1. 18.
	 * @Description: AES + RSA 암호화
	 */
	public EncryptData encryptData(String planinText, RSAKeyObject rsaKey) throws Exception {
		// 0. AES 생성
		AESCrypt aesCrypt = new AESCrypt(MD5Utils.digestToString(rsaKey.getRsaPublicKey(), ivSize));

		// 1. AES를 통해서 데이터 암호화 ==============================================
		String encryptData = aesCrypt.encrypt(planinText);
		String aesKey = aesCrypt.getKey();

		// 2. RSA를 통해서 AES 키를 암호화 ==============================================
		String encryptAesKey = RSACrypt.encryptRSA(aesKey, rsaKey);

		return new EncryptData(encryptAesKey, encryptData);
	}

	/**
	 * @methodName: decryptData
	 * @author: rojae
	 * @date: 2022. 1. 18.
	 * @Description: AES + RSA 복호화
	 */
	public DecryptData decryptData(EncryptData encryptData, RSAKeyObject rsaKey) throws Exception {
		// 1. RSA 복호화를 통해서 AES 키를 얻음 ==============================================
		String aesKey = RSACrypt.decryptRSA(encryptData.getEncryptAesKey(), rsaKey);

		// 2. AES 복호화를 통해서 전송된 데이터를 얻음 ==============================================
		String data = AESCrypt.decrypt(encryptData.getEncryptData(), aesKey,
				MD5Utils.digestToString(rsaKey.getRsaPublicKey(), ivSize));

		return new DecryptData(aesKey, data);
	}

}
