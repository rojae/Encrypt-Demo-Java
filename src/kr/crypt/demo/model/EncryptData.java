/** 
* @fileName: EncryptData.java
* @author: rojae 
* @date: 2022. 1. 18.
* @description: AES + RSA 암호화 데이터 클래
* =========================================================== 
* DATE 			AUTHOR 		NOTE
* ----------------------------------------------------------- 
* 2022. 1. 18. 	rojae 		최초작성
*/

package kr.crypt.demo.model;

public class EncryptData {
	
	private final String encryptAesKey;
	private final String encryptData;
	
	public EncryptData(String encryptAesKey, String encryptData) {
		this.encryptAesKey = encryptAesKey;
		this.encryptData = encryptData;
	}
	
	public String getEncryptAesKey() {
		return encryptAesKey;
	}
	public String getEncryptData() {
		return encryptData;
	}

	
}
