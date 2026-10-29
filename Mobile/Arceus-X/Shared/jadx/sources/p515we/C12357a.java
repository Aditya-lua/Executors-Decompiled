package p515we;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: renamed from: we.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C12357a {
    /* JADX INFO: renamed from: a */
    public static BigInteger m46223a(byte[] bArr) {
        return new BigInteger(1, bArr);
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m46224b(BigInteger bigInteger) {
        if (bigInteger.signum() != -1) {
            return bigInteger.toByteArray();
        }
        throw new IllegalArgumentException("n must not be negative");
    }

    /* JADX INFO: renamed from: c */
    public static byte[] m46225c(BigInteger bigInteger, int i10) throws GeneralSecurityException {
        if (bigInteger.signum() == -1) {
            throw new IllegalArgumentException("integer must be nonnegative");
        }
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length == i10) {
            return byteArray;
        }
        int i11 = i10 + 1;
        if (byteArray.length > i11) {
            throw new GeneralSecurityException("integer too large");
        }
        if (byteArray.length == i11) {
            if (byteArray[0] == 0) {
                return Arrays.copyOfRange(byteArray, 1, byteArray.length);
            }
            throw new GeneralSecurityException("integer too large");
        }
        byte[] bArr = new byte[i10];
        System.arraycopy(byteArray, 0, bArr, i10 - byteArray.length, byteArray.length);
        return bArr;
    }
}
