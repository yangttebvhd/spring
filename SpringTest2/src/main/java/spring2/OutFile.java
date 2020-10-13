package spring2;

import java.io.IOException;

//문자열을 입력 받아서 파일로 출력시켜주는 공통의 추상메서드
public interface OutFile {
	public void out(String message) throws IOException;
}
