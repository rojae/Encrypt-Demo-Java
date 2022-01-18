/** 
* @fileName: DecryptData.java 
* @author: rojae 
* @date: 2022. 1. 18. 
* @description: AES + RSA ??? ??? ???
* =========================================================== 
* DATE 			AUTHOR 		NOTE
* ----------------------------------------------------------- 
* 2022. 1. 18. 	rojae 	?? ??
*/

package kr.crypt.demo.model;

public class DecryptData {
	
	private final String aesKey;
	private final String data;
	
	public DecryptData(String aesKey, String data) {
		this.aesKey = aesKey;
		this.data = data;
	}
	
	public String getAesKey() {
		return aesKey;
	}
	public String getData() {
		return data;
	}

	
}
