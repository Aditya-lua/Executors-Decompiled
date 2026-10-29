package kotlin.p252io.encoding;

import com.appsflyer.sdk_base.referrer.Payload;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.collections.AbstractC7675d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import p394qt.C10708b;
import p394qt.InterfaceC10707a;
import p501vt.C12262a;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u0015\b\u0017\u0018\u0000 12\u00020\u0001:\u00022\"B)\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ7\u0010\u0011\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u0015\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001a\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ)\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u0005¢\u0006\u0004\b\u001c\u0010\u001dJ)\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u001e2\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u0005¢\u0006\u0004\b\u001f\u0010 J'\u0010!\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0005H\u0000¢\u0006\u0004\b!\u0010\u001bJ'\u0010\"\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u001e2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\"\u0010 J'\u0010$\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0005H\u0000¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\"\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010\u0004\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010&\u001a\u0004\b)\u0010(R\u001a\u0010\u0006\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b$\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010\b\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001f\u0010-\u001a\u0004\b.\u0010/R\u0014\u00100\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010*¨\u00063"}, m31665d2 = {"Lkotlin/io/encoding/Base64;", "", "", "isUrlSafe", "isMimeScheme", "", "mimeLineLength", "Lkotlin/io/encoding/Base64$PaddingOption;", "paddingOption", "<init>", "(ZZILkotlin/io/encoding/Base64$PaddingOption;)V", "", Payload.SOURCE, "destination", "destinationOffset", "startIndex", "endIndex", "h", "([B[BIII)I", "padIndex", "byteStart", "j", "([BIII)I", "", "b", "(I)V", "k", "([BII)I", "e", "([BII)[B", "", "d", "(Ljava/lang/CharSequence;II)[B", "i", "a", "sourceSize", "c", "(III)V", "Z", "isUrlSafe$kotlin_stdlib", "()Z", "isMimeScheme$kotlin_stdlib", "I", "getMimeLineLength$kotlin_stdlib", "()I", "Lkotlin/io/encoding/Base64$PaddingOption;", "getPaddingOption$kotlin_stdlib", "()Lkotlin/io/encoding/Base64$PaddingOption;", "mimeGroupsPerLine", "f", "PaddingOption", "kotlin-stdlib"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public class Base64 {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: g */
    @NotNull
    public static final byte[] f29399g = {13, 10};

    /* JADX INFO: renamed from: h */
    @NotNull
    public static final Base64 f29400h;

    /* JADX INFO: renamed from: i */
    @NotNull
    public static final Base64 f29401i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public static final Base64 f29402j;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final boolean isUrlSafe;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final boolean isMimeScheme;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final int mimeLineLength;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final PaddingOption paddingOption;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final int mimeGroupsPerLine;

    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m31665d2 = {"Lkotlin/io/encoding/Base64$PaddingOption;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "kotlin-stdlib"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public enum PaddingOption {
        PRESENT,
        ABSENT,
        PRESENT_OPTIONAL,
        ABSENT_OPTIONAL;


        /* JADX INFO: renamed from: f */
        public static final /* synthetic */ InterfaceC10707a f29413f = C10708b.m40805a(m31977a());
    }

    /* JADX INFO: renamed from: kotlin.io.encoding.Base64$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0005\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\n8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006¨\u0006\u000f"}, m31665d2 = {"Lkotlin/io/encoding/Base64$a;", "Lkotlin/io/encoding/Base64;", "<init>", "()V", "", "bitsPerByte", "I", "bitsPerSymbol", "bytesPerGroup", "symbolsPerGroup", "", "padSymbol", "B", "lineLengthMime", "lineLengthPem", "kotlin-stdlib"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Companion extends Base64 {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: kotlin.io.encoding.Base64.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
            super(false, false, -1, PaddingOption.PRESENT, null);
        }
    }

    static {
        PaddingOption paddingOption = PaddingOption.PRESENT;
        f29400h = new Base64(true, false, -1, paddingOption);
        f29401i = new Base64(false, true, 76, paddingOption);
        f29402j = new Base64(false, true, 64, paddingOption);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 boolean), (r2v0 boolean), (r3v0 int), (r4v0 kotlin.io.encoding.Base64$PaddingOption) A[MD:(boolean, boolean, int, kotlin.io.encoding.Base64$PaddingOption):void (m)] (LINE:1) call: kotlin.io.encoding.Base64.<init>(boolean, boolean, int, kotlin.io.encoding.Base64$PaddingOption):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ Base64(boolean z10, boolean z11, int i10, PaddingOption paddingOption, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, z11, i10, paddingOption);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ byte[] m31966f(Base64 base64, CharSequence charSequence, int i10, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decode");
        }
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = charSequence.length();
        }
        return base64.m31971d(charSequence, i10, i11);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ byte[] m31967g(Base64 base64, byte[] bArr, int i10, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decode");
        }
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = bArr.length;
        }
        return base64.m31972e(bArr, i10, i11);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final byte[] m31968a(@NotNull CharSequence source, int startIndex, int endIndex) {
        Intrinsics.checkNotNullParameter(source, "source");
        m31970c(source.length(), startIndex, endIndex);
        byte[] bArr = new byte[endIndex - startIndex];
        int i10 = 0;
        while (startIndex < endIndex) {
            char cCharAt = source.charAt(startIndex);
            if (cCharAt <= 255) {
                bArr[i10] = (byte) cCharAt;
                i10++;
            } else {
                bArr[i10] = 63;
                i10++;
            }
            startIndex++;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: b */
    public final void m31969b(int padIndex) {
        if (this.paddingOption != PaddingOption.ABSENT) {
            return;
        }
        throw new IllegalArgumentException("The padding option is set to ABSENT, but the input has a pad character at index " + padIndex);
    }

    /* JADX INFO: renamed from: c */
    public final void m31970c(int sourceSize, int startIndex, int endIndex) {
        AbstractC7675d.INSTANCE.m31749a(startIndex, endIndex, sourceSize);
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final byte[] m31971d(@NotNull CharSequence source, int startIndex, int endIndex) {
        byte[] bArrM31968a;
        Intrinsics.checkNotNullParameter(source, "source");
        if (source instanceof String) {
            String str = (String) source;
            m31970c(str.length(), startIndex, endIndex);
            String strSubstring = str.substring(startIndex, endIndex);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            Charset charset = Charsets.ISO_8859_1;
            Intrinsics.m31981d(strSubstring, "null cannot be cast to non-null type java.lang.String");
            bArrM31968a = strSubstring.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bArrM31968a, "getBytes(...)");
        } else {
            bArrM31968a = m31968a(source, startIndex, endIndex);
        }
        return m31967g(this, bArrM31968a, 0, 0, 6, null);
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final byte[] m31972e(@NotNull byte[] source, int startIndex, int endIndex) {
        Intrinsics.checkNotNullParameter(source, "source");
        m31970c(source.length, startIndex, endIndex);
        int iM31974i = m31974i(source, startIndex, endIndex);
        byte[] bArr = new byte[iM31974i];
        if (m31973h(source, bArr, 0, startIndex, endIndex) == iM31974i) {
            return bArr;
        }
        throw new IllegalStateException("Check failed.");
    }

    /* JADX INFO: renamed from: h */
    public final int m31973h(byte[] source, byte[] destination, int destinationOffset, int startIndex, int endIndex) {
        int i10;
        int i11;
        int i12;
        int[] iArr = this.isUrlSafe ? C12262a.f43401d : C12262a.f43399b;
        int i13 = -8;
        int i14 = destinationOffset;
        int iM31975j = startIndex;
        int i15 = -8;
        int i16 = 0;
        while (true) {
            if (iM31975j >= endIndex) {
                i10 = 8;
                i11 = 0;
                break;
            }
            if (i15 != i13 || iM31975j + 3 >= endIndex) {
                i10 = 8;
                i12 = 1;
            } else {
                i10 = 8;
                i12 = 1;
                int i17 = iM31975j + 4;
                int i18 = (iArr[source[iM31975j + 1] & 255] << 12) | (iArr[source[iM31975j] & 255] << 18) | (iArr[source[iM31975j + 2] & 255] << 6) | iArr[source[iM31975j + 3] & 255];
                if (i18 >= 0) {
                    destination[i14] = (byte) (i18 >> 16);
                    int i19 = i14 + 2;
                    destination[i14 + 1] = (byte) (i18 >> 8);
                    i14 += 3;
                    destination[i19] = (byte) i18;
                    iM31975j = i17;
                }
                i13 = -8;
            }
            int i20 = source[iM31975j] & 255;
            int i21 = iArr[i20];
            if (i21 >= 0) {
                iM31975j++;
                i16 = (i16 << 6) | i21;
                int i22 = i15 + 6;
                if (i22 >= 0) {
                    destination[i14] = (byte) (i16 >>> i22);
                    i16 &= (i12 << i22) - 1;
                    i15 -= 2;
                    i14++;
                } else {
                    i15 = i22;
                }
            } else {
                if (i21 == -2) {
                    iM31975j = m31975j(source, iM31975j, endIndex, i15);
                    i11 = i12;
                    break;
                }
                if (!this.isMimeScheme) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Invalid symbol '");
                    sb2.append((char) i20);
                    sb2.append("'(");
                    String string = Integer.toString(i20, CharsKt.checkRadix(i10));
                    Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                    sb2.append(string);
                    sb2.append(") at index ");
                    sb2.append(iM31975j);
                    throw new IllegalArgumentException(sb2.toString());
                }
                iM31975j++;
            }
            i13 = -8;
        }
        if (i15 == -2) {
            throw new IllegalArgumentException("The last unit of input does not have enough bits");
        }
        if (i15 != -8 && i11 == 0 && this.paddingOption == PaddingOption.PRESENT) {
            throw new IllegalArgumentException("The padding option is set to PRESENT, but the input is not properly padded");
        }
        if (i16 != 0) {
            throw new IllegalArgumentException("The pad bits must be zeros");
        }
        int iM31976k = m31976k(source, iM31975j, endIndex);
        if (iM31976k >= endIndex) {
            return i14 - destinationOffset;
        }
        int i23 = source[iM31976k] & 255;
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Symbol '");
        sb3.append((char) i23);
        sb3.append("'(");
        String string2 = Integer.toString(i23, CharsKt.checkRadix(i10));
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        sb3.append(string2);
        sb3.append(") at index ");
        sb3.append(iM31976k - 1);
        sb3.append(" is prohibited after the pad character");
        throw new IllegalArgumentException(sb3.toString());
    }

    /* JADX INFO: renamed from: i */
    public final int m31974i(@NotNull byte[] source, int startIndex, int endIndex) {
        Intrinsics.checkNotNullParameter(source, "source");
        int i10 = endIndex - startIndex;
        if (i10 == 0) {
            return 0;
        }
        if (i10 == 1) {
            throw new IllegalArgumentException("Input should have at least 2 symbols for Base64 decoding, startIndex: " + startIndex + ", endIndex: " + endIndex);
        }
        if (this.isMimeScheme) {
            while (startIndex < endIndex) {
                int i11 = C12262a.f43399b[source[startIndex] & 255];
                if (i11 < 0) {
                    if (i11 == -2) {
                        i10 -= endIndex - startIndex;
                        break;
                    }
                    i10--;
                }
                startIndex++;
            }
        } else if (source[endIndex - 1] == 61) {
            i10 = source[endIndex + (-2)] == 61 ? i10 - 2 : i10 - 1;
        }
        return (int) ((((long) i10) * ((long) 6)) / ((long) 8));
    }

    /* JADX INFO: renamed from: j */
    public final int m31975j(byte[] source, int padIndex, int endIndex, int byteStart) {
        if (byteStart == -8) {
            throw new IllegalArgumentException("Redundant pad character at index " + padIndex);
        }
        if (byteStart == -6) {
            m31969b(padIndex);
            return padIndex + 1;
        }
        if (byteStart != -4) {
            if (byteStart == -2) {
                return padIndex + 1;
            }
            throw new IllegalStateException("Unreachable");
        }
        m31969b(padIndex);
        int iM31976k = m31976k(source, padIndex + 1, endIndex);
        if (iM31976k != endIndex && source[iM31976k] == 61) {
            return iM31976k + 1;
        }
        throw new IllegalArgumentException("Missing one pad character at index " + iM31976k);
    }

    /* JADX INFO: renamed from: k */
    public final int m31976k(byte[] source, int startIndex, int endIndex) {
        if (!this.isMimeScheme) {
            return startIndex;
        }
        while (startIndex < endIndex) {
            if (C12262a.f43399b[source[startIndex] & 255] != -1) {
                break;
            }
            startIndex++;
        }
        return startIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public Base64(boolean z10, boolean z11, int i10, PaddingOption paddingOption) {
        this.isUrlSafe = z10;
        this.isMimeScheme = z11;
        this.mimeLineLength = i10;
        this.paddingOption = paddingOption;
        if (z10 && z11) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.mimeGroupsPerLine = i10 / 4;
    }
}
