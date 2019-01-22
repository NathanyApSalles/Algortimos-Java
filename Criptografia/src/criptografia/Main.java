package criptografia;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		OutputStream out = new BufferedOutputStream (System.out);

		byte[] arrayOfBytes;
		byte bFlag;
		int flag = Integer.parseInt(in.readLine());

		for (int j = 0; j < flag; j++) {

			arrayOfBytes = in.readLine().getBytes();

			for (int i = 0; i < arrayOfBytes.length; i++) {
				if (arrayOfBytes[i] > 64 && arrayOfBytes[i] < 123) {
					arrayOfBytes[i] += 3;
				}
			}

			for (int i = 0; i < arrayOfBytes.length / 2; i++) {
				bFlag = arrayOfBytes[arrayOfBytes.length - i - 1];
				arrayOfBytes[arrayOfBytes.length - i - 1] = arrayOfBytes[i];
				arrayOfBytes[i] = bFlag;
			}

			for (int i = arrayOfBytes.length / 2; i < arrayOfBytes.length; i++) {
				arrayOfBytes[i] -= 1;
			}
			
			out.write(arrayOfBytes);
			out.write(("\n").getBytes());
		}
		out.flush();

	}
}
