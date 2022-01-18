/** 
* @fileName: RSAKeyObject.java 
* @author: rojae 
* @date: 2022. 1. 18. 
* @description: RSA 키 관리 객체.
* =========================================================== 
* DATE 			AUTHOR 		NOTE
* ----------------------------------------------------------- 
* 2022. 1. 18. 	rojae 		최초작성
*/

package kr.crypt.demo.rsa;

public class RSAKeyObject {
	
	private final String rsaPublicKey;
	private final String rsaPrivateKey;
	
	public RSAKeyObject(String rsaPublicKey, String rsaPrivateKey) {
		this.rsaPublicKey = rsaPublicKey;
		this.rsaPrivateKey = rsaPrivateKey;
	}
	
	public String getRsaPublicKey() {
		return rsaPublicKey;
	}
	public String getRsaPrivateKey() {
		return rsaPrivateKey;
	}

}
