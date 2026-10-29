package p515we;

import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.Objects;
import p102ef.C5109a;

/* JADX INFO: renamed from: we.s0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C12394s0 {

    /* JADX INFO: renamed from: a */
    public static final Charset f44345a = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a */
    public static final byte m46448a(char c10) throws GeneralSecurityException {
        if (c10 >= '!' && c10 <= '~') {
            return (byte) c10;
        }
        throw new GeneralSecurityException("Not a printable ASCII character: " + c10);
    }

    /* JADX INFO: renamed from: b */
    public static final C5109a m46449b(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i10 = 0; i10 < str.length(); i10++) {
            bArr[i10] = m46448a(str.charAt(i10));
        }
        return C5109a.m23847a(bArr);
    }

    /* JADX INFO: renamed from: c */
    public static Integer m46450c() {
        if (m46451d()) {
            return C12359b.m46232a();
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m46451d() {
        return Objects.equals(System.getProperty("java.vendor"), "The Android Project");
    }

    /* JADX INFO: renamed from: e */
    public static boolean m46452e(byte[] bArr, byte[] bArr2) {
        if (bArr2.length < bArr.length) {
            return false;
        }
        for (int i10 = 0; i10 < bArr.length; i10++) {
            if (bArr2[i10] != bArr[i10]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public static int m46453f() {
        SecureRandom secureRandom = new SecureRandom();
        byte[] bArr = new byte[4];
        int i10 = 0;
        while (i10 == 0) {
            secureRandom.nextBytes(bArr);
            i10 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        }
        return i10;
    }

    /* JADX INFO: renamed from: g */
    public static final byte m46454g(char c10) {
        if (c10 >= '!' && c10 <= '~') {
            return (byte) c10;
        }
        throw new C12392r0("Not a printable ASCII character: " + c10);
    }

    /* JADX INFO: renamed from: h */
    public static final C5109a m46455h(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i10 = 0; i10 < str.length(); i10++) {
            bArr[i10] = m46454g(str.charAt(i10));
        }
        return C5109a.m23847a(bArr);
    }
}
