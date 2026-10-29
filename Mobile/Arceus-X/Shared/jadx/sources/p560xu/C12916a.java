package p560xu;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: xu.a */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0002\u0010\u0012\n\u0002\b\f\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001d\u0010\u0005\u001a\u00020\u0000*\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\"\u001a\u0010\n\u001a\u00020\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0002\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u001a\u0010\f\u001a\u00020\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0007\u001a\u0004\b\u000b\u0010\t¨\u0006\r"}, m31665d2 = {"", "", "a", "(Ljava/lang/String;)[B", "map", "b", "([B[B)Ljava/lang/String;", "[B", "getBASE64", "()[B", "BASE64", "getBASE64_URL_SAFE", "BASE64_URL_SAFE", "okio"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C12916a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final byte[] f45805a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final byte[] f45806b;

    static {
        C12930h.Companion companion = C12930h.INSTANCE;
        f45805a = companion.m48117d("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/").getData();
        f45806b = companion.m48117d("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_").getData();
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public static final byte[] m47942a(@NotNull String str) {
        int i10;
        char cCharAt;
        Intrinsics.checkNotNullParameter(str, "<this>");
        int length = str.length();
        while (length > 0 && ((cCharAt = str.charAt(length - 1)) == '=' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == ' ' || cCharAt == '\t')) {
            length--;
        }
        int i11 = (int) ((((long) length) * 6) / 8);
        byte[] bArr = new byte[i11];
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < length; i15++) {
            char cCharAt2 = str.charAt(i15);
            if ('A' <= cCharAt2 && cCharAt2 < '[') {
                i10 = cCharAt2 - 'A';
            } else if ('a' <= cCharAt2 && cCharAt2 < '{') {
                i10 = cCharAt2 - 'G';
            } else if ('0' <= cCharAt2 && cCharAt2 < ':') {
                i10 = cCharAt2 + 4;
            } else if (cCharAt2 == '+' || cCharAt2 == '-') {
                i10 = 62;
            } else {
                if (cCharAt2 == '/' || cCharAt2 == '_') {
                    i10 = 63;
                } else if (cCharAt2 != '\n' && cCharAt2 != '\r' && cCharAt2 != ' ' && cCharAt2 != '\t') {
                    return null;
                }
            }
            i13 = (i13 << 6) | i10;
            i12++;
            if (i12 % 4 == 0) {
                bArr[i14] = (byte) (i13 >> 16);
                int i16 = i14 + 2;
                bArr[i14 + 1] = (byte) (i13 >> 8);
                i14 += 3;
                bArr[i16] = (byte) i13;
            }
        }
        int i17 = i12 % 4;
        if (i17 == 1) {
            return null;
        }
        if (i17 == 2) {
            bArr[i14] = (byte) ((i13 << 12) >> 16);
            i14++;
        } else if (i17 == 3) {
            int i18 = i13 << 6;
            int i19 = i14 + 1;
            bArr[i14] = (byte) (i18 >> 16);
            i14 += 2;
            bArr[i19] = (byte) (i18 >> 8);
        }
        if (i14 == i11) {
            return bArr;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i14);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final String m47943b(@NotNull byte[] bArr, @NotNull byte[] map) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(map, "map");
        byte[] bArr2 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            byte b = bArr[i10];
            int i12 = i10 + 2;
            byte b10 = bArr[i10 + 1];
            i10 += 3;
            byte b11 = bArr[i12];
            bArr2[i11] = map[(b & 255) >> 2];
            bArr2[i11 + 1] = map[((b & 3) << 4) | ((b10 & 255) >> 4)];
            int i13 = i11 + 3;
            bArr2[i11 + 2] = map[((b10 & 15) << 2) | ((b11 & 255) >> 6)];
            i11 += 4;
            bArr2[i13] = map[b11 & 63];
        }
        int length2 = bArr.length - length;
        if (length2 == 1) {
            byte b12 = bArr[i10];
            bArr2[i11] = map[(b12 & 255) >> 2];
            bArr2[i11 + 1] = map[(b12 & 3) << 4];
            bArr2[i11 + 2] = 61;
            bArr2[i11 + 3] = 61;
        } else if (length2 == 2) {
            int i14 = i10 + 1;
            byte b13 = bArr[i10];
            byte b14 = bArr[i14];
            bArr2[i11] = map[(b13 & 255) >> 2];
            bArr2[i11 + 1] = map[((b13 & 3) << 4) | ((b14 & 255) >> 4)];
            bArr2[i11 + 2] = map[(b14 & 15) << 2];
            bArr2[i11 + 3] = 61;
        }
        return C12959v0.m48204c(bArr2);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ String m47944c(byte[] bArr, byte[] bArr2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bArr2 = f45805a;
        }
        return m47943b(bArr, bArr2);
    }
}
