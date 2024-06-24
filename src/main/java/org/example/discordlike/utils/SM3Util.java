package org.example.discordlike.utils;
import org.bouncycastle.crypto.digests.SM3Digest;
import org.bouncycastle.util.encoders.Hex;

public class SM3Util {
    public static String encryptSM3(String input) {
        SM3Digest digest = new SM3Digest();
        byte[] inputData = input.getBytes();
        digest.update(inputData, 0, inputData.length);
        byte[] result = new byte[digest.getDigestSize()];
        digest.doFinal(result, 0);
        return Hex.toHexString(result);
    }

    // 测试SM3
    public static void main(String[] args) {
        System.out.println(encryptSM3("password1"));
        System.out.println(encryptSM3("password2"));
        System.out.println(encryptSM3("password3"));
        System.out.println(encryptSM3("password4"));
        System.out.println(encryptSM3("password5"));
    }
}
