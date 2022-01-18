# Crypt Java Demo (AES+RSA)
- AES와 RSA를 혼용 데모 프로그램
- 자바 서버개발 참고용 소스
- (구상 프로세스에서 서버 라이브러리만 해당)
- (아래 샘플 참고)

## 구상 프로세스 
- 클라이언트는 트랜잭션을 위한 데이터를 준비한 다음 서버에 RSA 공개 키를 요청합니다.
- 서버는 RSA 키 쌍(공개 및 개인 키)을 생성하고 RSA 공개 키를 클라이언트와 공유합니다.
- 클라이언트는 AES 비밀 키를 생성하고 거래를 암호화합니다.
- 클라이언트는 RSA 공개 키로 AES 비밀 키를 암호화하고,
- 클라이언트는 AES 암호화된 트랜잭션과 RSA 암호화된 비밀 키를 서버에 보내고,
- 서버는 RSA 개인 키로 AES 비밀 키를 해독하고,
- 서버는 복호화된 AES 비밀 키를 사용하여 트랜잭션을 복호화합니다.


## 참고용 샘플
- https://github.com/rojae/Spring-Encrypted-Sample
- https://github.com/rojae/react-encrypted-sample
