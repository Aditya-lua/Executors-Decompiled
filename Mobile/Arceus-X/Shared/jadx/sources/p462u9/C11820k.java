package p462u9;

import androidx.annotation.NonNull;

/* JADX INFO: renamed from: u9.k */
/* JADX INFO: loaded from: classes.dex */
public class C11820k {

    /* JADX INFO: renamed from: a */
    public static final char[] f41575a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: b */
    public static final char[] f41576b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    @NonNull
    /* JADX INFO: renamed from: a */
    public static String m44190a(@NonNull byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length + length];
        int i10 = 0;
        for (byte b : bArr) {
            char[] cArr2 = f41576b;
            cArr[i10] = cArr2[(b & 255) >>> 4];
            cArr[i10 + 1] = cArr2[b & 15];
            i10 += 2;
        }
        return new String(cArr);
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public static String m44191b(@NonNull byte[] bArr, boolean z10) {
        int length = bArr.length;
        StringBuilder sb2 = new StringBuilder(length + length);
        for (int i10 = 0; i10 < length && (!z10 || i10 != length - 1 || (bArr[i10] & 255) != 0); i10++) {
            char[] cArr = f41575a;
            sb2.append(cArr[(bArr[i10] & 240) >>> 4]);
            sb2.append(cArr[bArr[i10] & 15]);
        }
        return sb2.toString();
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static byte[] m44192c(@NonNull String str) {
        int length = str.length();
        if (length % 2 != 0) {
            throw new IllegalArgumentException("Hex string has odd number of characters");
        }
        byte[] bArr = new byte[length / 2];
        int i10 = 0;
        while (i10 < length) {
            int i11 = i10 + 2;
            bArr[i10 / 2] = (byte) Integer.parseInt(str.substring(i10, i11), 16);
            i10 = i11;
        }
        return bArr;
    }
}
