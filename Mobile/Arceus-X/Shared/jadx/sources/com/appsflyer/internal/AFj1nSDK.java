package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.LogTag;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class AFj1nSDK {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String AFLogger(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(str.getBytes(StandardCharsets.UTF_8));
            return m8933d(messageDigest.digest());
        } catch (Exception e10) {
            AFLogger.INSTANCE.m8961e(LogTag.GENERAL, "Error turning data to SHA-256 string", e10);
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static String m8931d(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(str.getBytes(Charset.defaultCharset()));
            return m8933d(messageDigest.digest());
        } catch (Exception e10) {
            AFLogger.INSTANCE.m8961e(LogTag.GENERAL, "Error turning data to SHA-256 string", e10);
            return null;
        }
    }

    public static byte[] unregisterClient(@NonNull String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(str.getBytes(Charset.defaultCharset()));
            return messageDigest.digest();
        } catch (Exception e10) {
            AFLogger.INSTANCE.m8961e(LogTag.GENERAL, "Error turning string to SHA-256 byte array", e10);
            return null;
        }
    }

    public static long AFLogger(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return -1L;
        }
        if (bArr.length > 8) {
            bArr = Arrays.copyOfRange(bArr, 0, 8);
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.put(bArr);
        byteBufferAllocate.flip();
        return byteBufferAllocate.getLong();
    }

    /* JADX INFO: renamed from: d */
    private static String m8933d(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder();
        for (byte b : bArr) {
            sb2.append(Integer.toString((b & 255) + 256, 16).substring(1));
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: d */
    public static String m8932d(String str, String str2) {
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(new SecretKeySpec(str2.getBytes(Charset.defaultCharset()), "HmacSHA256"));
            return m8933d(mac.doFinal(str.getBytes(Charset.defaultCharset()))).toLowerCase(Locale.ROOT);
        } catch (InvalidKeyException | NoSuchAlgorithmException e10) {
            AFLogger.INSTANCE.m8961e(LogTag.GENERAL, e10.getMessage() != null ? e10.getMessage() : "Error computing HMAC SHA-256", e10);
            return e10.getMessage();
        }
    }

    public static boolean AFLogger(Map<String, Object> map, String[] strArr, AFc1iSDK aFc1iSDK) {
        if (map == null || map.isEmpty()) {
            return false;
        }
        for (String str : strArr) {
            if (!map.containsKey(str)) {
                return false;
            }
        }
        String str2 = (String) map.remove("sig");
        if (str2 == null) {
            return false;
        }
        String strM8768d = AFc1iSDK.m8768d();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(new JSONObject(map));
        sb2.append(strM8768d);
        return m8932d(sb2.toString(), AFb1jSDK.AFLogger(aFc1iSDK.AFKeystoreWrapper)).equals(str2);
    }
}
