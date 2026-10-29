package kotlin.text;

import com.google.mlkit.vision.barcode.common.Barcode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\t\n\u0002\u0010\u0019\n\u0002\b\u0011\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u0016\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a1\u0010\t\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\t\u0010\n\u001a3\u0010\u000f\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a3\u0010\u0011\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0010\u001a3\u0010\u0012\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0010\u001a3\u0010\u0013\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0010\u001aC\u0010\u001a\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001a3\u0010\u001c\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001a/\u0010\"\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\"\u0010#\u001aG\u0010'\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u0006H\u0000¢\u0006\u0004\b'\u0010(\u001a\u0017\u0010+\u001a\u00020\u00062\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b+\u0010,\u001a#\u0010-\u001a\u00020\u0006*\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0006H\u0002¢\u0006\u0004\b-\u0010.\"\u001a\u00102\u001a\u00020\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b+\u0010/\u001a\u0004\b0\u00101\"\u0014\u00103\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010/\"\u0014\u00104\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010/\"\u0014\u00107\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u00106¨\u00068"}, d2 = {"", "Lkotlin/text/f;", "format", "", "h", "([BLkotlin/text/f;)Ljava/lang/String;", "", "startIndex", "endIndex", "g", "([BIILkotlin/text/f;)Ljava/lang/String;", "Lkotlin/text/f$a;", "bytesFormat", "", "byteToDigits", "j", "([BIILkotlin/text/f$a;[I)Ljava/lang/String;", "l", "k", "m", "index", "bytePrefix", "byteSuffix", "", "destination", "destinationOffset", "b", "([BILjava/lang/String;Ljava/lang/String;[I[CI)I", "c", "([BI[I[CI)I", "numberOfBytes", "byteSeparatorLength", "bytePrefixLength", "byteSuffixLength", "d", "(IIII)I", "bytesPerLine", "bytesPerGroup", "groupSeparatorLength", "e", "(IIIIIII)I", "", "formatLength", "a", "(J)I", "f", "(Ljava/lang/String;[CI)I", "[I", "getBYTE_TO_LOWER_CASE_HEX_DIGITS", "()[I", "BYTE_TO_LOWER_CASE_HEX_DIGITS", "BYTE_TO_UPPER_CASE_HEX_DIGITS", "HEX_DIGITS_TO_DECIMAL", "", "[J", "HEX_DIGITS_TO_LONG_DECIMAL", "kotlin-stdlib"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final int[] f22629a;

    @NotNull
    public static final int[] b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final int[] f22630c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final long[] f22631d;

    static {
        int[] iArr = new int[Barcode.FORMAT_QR_CODE];
        int i10 = 0;
        for (int i11 = 0; i11 < 256; i11++) {
            iArr[i11] = "0123456789abcdef".charAt(i11 & 15) | ("0123456789abcdef".charAt(i11 >> 4) << '\b');
        }
        f22629a = iArr;
        int[] iArr2 = new int[Barcode.FORMAT_QR_CODE];
        for (int i12 = 0; i12 < 256; i12++) {
            iArr2[i12] = "0123456789ABCDEF".charAt(i12 & 15) | ("0123456789ABCDEF".charAt(i12 >> 4) << '\b');
        }
        b = iArr2;
        int[] iArr3 = new int[Barcode.FORMAT_QR_CODE];
        for (int i13 = 0; i13 < 256; i13++) {
            iArr3[i13] = -1;
        }
        int i14 = 0;
        int i15 = 0;
        while (i14 < "0123456789abcdef".length()) {
            iArr3["0123456789abcdef".charAt(i14)] = i15;
            i14++;
            i15++;
        }
        int i16 = 0;
        int i17 = 0;
        while (i16 < "0123456789ABCDEF".length()) {
            iArr3["0123456789ABCDEF".charAt(i16)] = i17;
            i16++;
            i17++;
        }
        f22630c = iArr3;
        long[] jArr = new long[Barcode.FORMAT_QR_CODE];
        for (int i18 = 0; i18 < 256; i18++) {
            jArr[i18] = -1;
        }
        int i19 = 0;
        int i20 = 0;
        while (i19 < "0123456789abcdef".length()) {
            jArr["0123456789abcdef".charAt(i19)] = i20;
            i19++;
            i20++;
        }
        int i21 = 0;
        while (i10 < "0123456789ABCDEF".length()) {
            jArr["0123456789ABCDEF".charAt(i10)] = i21;
            i10++;
            i21++;
        }
        f22631d = jArr;
    }

    public static final int a(long j10) {
        if (0 <= j10 && j10 <= 2147483647L) {
            return (int) j10;
        }
        throw new IllegalArgumentException("The resulting string length is too big: " + ((Object) jt.y.e(jt.y.b(j10))));
    }

    public static final int b(byte[] bArr, int i10, String str, String str2, int[] iArr, char[] cArr, int i11) {
        return f(str2, cArr, c(bArr, i10, iArr, cArr, f(str, cArr, i11)));
    }

    public static final int c(byte[] bArr, int i10, int[] iArr, char[] cArr, int i11) {
        int i12 = iArr[bArr[i10] & 255];
        cArr[i11] = (char) (i12 >> 8);
        cArr[i11 + 1] = (char) (i12 & 255);
        return i11 + 2;
    }

    public static final int d(int i10, int i11, int i12, int i13) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        long j10 = i11;
        return a((((long) i10) * (((((long) i12) + 2) + ((long) i13)) + j10)) - j10);
    }

    public static final int e(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int i17 = i10 - 1;
        int i18 = i17 / i11;
        int i19 = (i11 - 1) / i12;
        int i20 = i10 % i11;
        if (i20 != 0) {
            i11 = i20;
        }
        int i21 = (i19 * i18) + ((i11 - 1) / i12);
        return a(((long) i18) + (((long) i21) * ((long) i13)) + (((long) ((i17 - i18) - i21)) * ((long) i14)) + (((long) i10) * (((long) i15) + 2 + ((long) i16))));
    }

    public static final int f(String str, char[] cArr, int i10) {
        int length = str.length();
        if (length != 0) {
            if (length != 1) {
                int length2 = str.length();
                Intrinsics.d(str, "null cannot be cast to non-null type java.lang.String");
                str.getChars(0, length2, cArr, i10);
            } else {
                cArr[i10] = str.charAt(0);
            }
        }
        return i10 + str.length();
    }

    @NotNull
    public static final String g(@NotNull byte[] bArr, int i10, int i11, @NotNull HexFormat format) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        kotlin.collections.d.INSTANCE.a(i10, i11, bArr.length);
        if (i10 == i11) {
            return "";
        }
        int[] iArr = format.getUpperCase() ? b : f22629a;
        HexFormat.BytesHexFormat bytes = format.getBytes();
        return bytes.getNoLineAndGroupSeparator() ? j(bArr, i10, i11, bytes, iArr) : m(bArr, i10, i11, bytes, iArr);
    }

    @NotNull
    public static final String h(@NotNull byte[] bArr, @NotNull HexFormat format) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return g(bArr, 0, bArr.length, format);
    }

    public static /* synthetic */ String i(byte[] bArr, HexFormat hexFormat, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            hexFormat = HexFormat.INSTANCE.a();
        }
        return h(bArr, hexFormat);
    }

    public static final String j(byte[] bArr, int i10, int i11, HexFormat.BytesHexFormat bytesHexFormat, int[] iArr) {
        return bytesHexFormat.getShortByteSeparatorNoPrefixAndSuffix() ? l(bArr, i10, i11, bytesHexFormat, iArr) : k(bArr, i10, i11, bytesHexFormat, iArr);
    }

    public static final String k(byte[] bArr, int i10, int i11, HexFormat.BytesHexFormat bytesHexFormat, int[] iArr) {
        String bytePrefix = bytesHexFormat.getBytePrefix();
        String byteSuffix = bytesHexFormat.getByteSuffix();
        String byteSeparator = bytesHexFormat.getByteSeparator();
        char[] cArr = new char[d(i11 - i10, byteSeparator.length(), bytePrefix.length(), byteSuffix.length())];
        int iB = b(bArr, i10, bytePrefix, byteSuffix, iArr, cArr, 0);
        for (int i12 = i10 + 1; i12 < i11; i12++) {
            iB = b(bArr, i12, bytePrefix, byteSuffix, iArr, cArr, f(byteSeparator, cArr, iB));
        }
        return x.v(cArr);
    }

    public static final String l(byte[] bArr, int i10, int i11, HexFormat.BytesHexFormat bytesHexFormat, int[] iArr) {
        int length = bytesHexFormat.getByteSeparator().length();
        if (length > 1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int i12 = i11 - i10;
        int iC = 0;
        if (length == 0) {
            char[] cArr = new char[a(((long) i12) * 2)];
            while (i10 < i11) {
                iC = c(bArr, i10, iArr, cArr, iC);
                i10++;
            }
            return x.v(cArr);
        }
        char[] cArr2 = new char[a((((long) i12) * 3) - 1)];
        char cCharAt = bytesHexFormat.getByteSeparator().charAt(0);
        int iC2 = c(bArr, i10, iArr, cArr2, 0);
        for (int i13 = i10 + 1; i13 < i11; i13++) {
            cArr2[iC2] = cCharAt;
            iC2 = c(bArr, i13, iArr, cArr2, iC2 + 1);
        }
        return x.v(cArr2);
    }

    public static final String m(byte[] bArr, int i10, int i11, HexFormat.BytesHexFormat bytesHexFormat, int[] iArr) {
        int i12;
        int i13;
        int bytesPerLine = bytesHexFormat.getBytesPerLine();
        int bytesPerGroup = bytesHexFormat.getBytesPerGroup();
        String bytePrefix = bytesHexFormat.getBytePrefix();
        String byteSuffix = bytesHexFormat.getByteSuffix();
        String byteSeparator = bytesHexFormat.getByteSeparator();
        String groupSeparator = bytesHexFormat.getGroupSeparator();
        int iE = e(i11 - i10, bytesPerLine, bytesPerGroup, groupSeparator.length(), byteSeparator.length(), bytePrefix.length(), byteSuffix.length());
        char[] cArr = new char[iE];
        int i14 = i10;
        int iF = 0;
        int i15 = 0;
        int i16 = 0;
        while (i14 < i11) {
            if (i15 == bytesPerLine) {
                cArr[iF] = '\n';
                iF++;
                i12 = 0;
                i13 = 0;
            } else if (i16 == bytesPerGroup) {
                iF = f(groupSeparator, cArr, iF);
                i12 = i15;
                i13 = 0;
            } else {
                i12 = i15;
                i13 = i16;
            }
            if (i13 != 0) {
                iF = f(byteSeparator, cArr, iF);
            }
            String str = bytePrefix;
            int iB = b(bArr, i14, str, byteSuffix, iArr, cArr, iF);
            i14++;
            i16 = i13 + 1;
            iF = iB;
            bytePrefix = str;
            i15 = i12 + 1;
        }
        if (iF == iE) {
            return x.v(cArr);
        }
        throw new IllegalStateException("Check failed.");
    }
}
