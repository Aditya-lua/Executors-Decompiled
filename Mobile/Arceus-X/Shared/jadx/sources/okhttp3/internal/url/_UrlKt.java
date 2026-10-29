package okhttp3.internal.url;

import java.io.EOFException;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import okhttp3.internal._UtilCommonKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p560xu.C12924e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u0019\n\u0002\b\u0011\u001a]\u0010\u000f\u001a\u00020\u000e*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001ac\u0010\u0011\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a3\u0010\u0014\u001a\u00020\u000e*\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001aW\u0010\u0016\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a1\u0010\u0018\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a#\u0010\u001a\u001a\u00020\u0007*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u001a\u0010\u001b\"\u001a\u0010\u001d\u001a\u00020\u001c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0014\u0010!\u001a\u00020\u00018\u0000X\u0080T¢\u0006\u0006\n\u0004\b!\u0010\"\"\u0014\u0010#\u001a\u00020\u00018\u0000X\u0080T¢\u0006\u0006\n\u0004\b#\u0010\"\"\u0014\u0010$\u001a\u00020\u00018\u0000X\u0080T¢\u0006\u0006\n\u0004\b$\u0010\"\"\u0014\u0010%\u001a\u00020\u00018\u0000X\u0080T¢\u0006\u0006\n\u0004\b%\u0010\"\"\u0014\u0010&\u001a\u00020\u00018\u0000X\u0080T¢\u0006\u0006\n\u0004\b&\u0010\"\"\u0014\u0010'\u001a\u00020\u00018\u0000X\u0080T¢\u0006\u0006\n\u0004\b'\u0010\"\"\u0014\u0010(\u001a\u00020\u00018\u0000X\u0080T¢\u0006\u0006\n\u0004\b(\u0010\"\"\u0014\u0010)\u001a\u00020\u00018\u0000X\u0080T¢\u0006\u0006\n\u0004\b)\u0010\"\"\u0014\u0010*\u001a\u00020\u00018\u0000X\u0080T¢\u0006\u0006\n\u0004\b*\u0010\"\"\u0014\u0010+\u001a\u00020\u00018\u0000X\u0080T¢\u0006\u0006\n\u0004\b+\u0010\"\"\u0014\u0010,\u001a\u00020\u00018\u0000X\u0080T¢\u0006\u0006\n\u0004\b,\u0010\"¨\u0006-"}, m31665d2 = {"Lxu/e;", "", "input", "", "pos", "limit", "encodeSet", "", "alreadyEncoded", "strict", "plusIsSpace", "unicodeAllowed", "Ljava/nio/charset/Charset;", "charset", "", "writeCanonicalized", "(Lxu/e;Ljava/lang/String;IILjava/lang/String;ZZZZLjava/nio/charset/Charset;)V", "canonicalizeWithCharset", "(Ljava/lang/String;IILjava/lang/String;ZZZZLjava/nio/charset/Charset;)Ljava/lang/String;", "encoded", "writePercentDecoded", "(Lxu/e;Ljava/lang/String;IIZ)V", "canonicalize", "(Ljava/lang/String;IILjava/lang/String;ZZZZ)Ljava/lang/String;", "percentDecode", "(Ljava/lang/String;IIZ)Ljava/lang/String;", "isPercentEncoded", "(Ljava/lang/String;II)Z", "", "HEX_DIGITS", "[C", "getHEX_DIGITS", "()[C", "USERNAME_ENCODE_SET", "Ljava/lang/String;", "PASSWORD_ENCODE_SET", "PATH_SEGMENT_ENCODE_SET", "PATH_SEGMENT_ENCODE_SET_URI", "QUERY_ENCODE_SET", "QUERY_COMPONENT_REENCODE_SET", "QUERY_COMPONENT_ENCODE_SET", "QUERY_COMPONENT_ENCODE_SET_URI", "FORM_ENCODE_SET", "FRAGMENT_ENCODE_SET", "FRAGMENT_ENCODE_SET_URI", "okhttp"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class _UrlKt {

    @NotNull
    public static final String FORM_ENCODE_SET = " !\"#$&'()+,/:;<=>?@[\\]^`{|}~";

    @NotNull
    public static final String FRAGMENT_ENCODE_SET = "";

    @NotNull
    public static final String FRAGMENT_ENCODE_SET_URI = " \"#<>\\^`{|}";

    @NotNull
    private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    @NotNull
    public static final String PASSWORD_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";

    @NotNull
    public static final String PATH_SEGMENT_ENCODE_SET = " \"<>^`{}|/\\?#";

    @NotNull
    public static final String PATH_SEGMENT_ENCODE_SET_URI = "[]";

    @NotNull
    public static final String QUERY_COMPONENT_ENCODE_SET = " !\"#$&'(),/:;<=>?@[]\\^`{|}~";

    @NotNull
    public static final String QUERY_COMPONENT_ENCODE_SET_URI = "\\^`{|}";

    @NotNull
    public static final String QUERY_COMPONENT_REENCODE_SET = " \"'<>#&=";

    @NotNull
    public static final String QUERY_ENCODE_SET = " \"'<>#";

    @NotNull
    public static final String USERNAME_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";

    @NotNull
    public static final String canonicalize(@NotNull String str, int i10, int i11, @NotNull String encodeSet, boolean z10, boolean z11, boolean z12, boolean z13) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(encodeSet, "encodeSet");
        return canonicalizeWithCharset$default(str, i10, i11, encodeSet, z10, z11, z12, z13, null, 128, null);
    }

    public static /* synthetic */ String canonicalize$default(String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, boolean z13, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        if ((i12 & 8) != 0) {
            z10 = false;
        }
        if ((i12 & 16) != 0) {
            z11 = false;
        }
        if ((i12 & 32) != 0) {
            z12 = false;
        }
        if ((i12 & 64) != 0) {
            z13 = false;
        }
        return canonicalize(str, i10, i11, str2, z10, z11, z12, z13);
    }

    @NotNull
    public static final String canonicalizeWithCharset(@NotNull String str, int i10, int i11, @NotNull String encodeSet, boolean z10, boolean z11, boolean z12, boolean z13, @Nullable Charset charset) throws EOFException {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(encodeSet, "encodeSet");
        int iCharCount = i10;
        while (iCharCount < i11) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z13) || StringsKt.m32150Z(encodeSet, (char) iCodePointAt, false, 2, null) || ((iCodePointAt == 37 && (!z10 || (z11 && !isPercentEncoded(str, iCharCount, i11)))) || (iCodePointAt == 43 && z12)))) {
                C12924e c12924e = new C12924e();
                c12924e.mo48001K0(str, i10, iCharCount);
                writeCanonicalized(c12924e, str, iCharCount, i11, encodeSet, z10, z11, z12, z13, charset);
                return c12924e.mo48008R2();
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        String strSubstring = str.substring(i10, i11);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ String canonicalizeWithCharset$default(String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        if ((i12 & 8) != 0) {
            z10 = false;
        }
        if ((i12 & 16) != 0) {
            z11 = false;
        }
        if ((i12 & 32) != 0) {
            z12 = false;
        }
        if ((i12 & 64) != 0) {
            z13 = false;
        }
        if ((i12 & 128) != 0) {
            charset = null;
        }
        return canonicalizeWithCharset(str, i10, i11, str2, z10, z11, z12, z13, charset);
    }

    @NotNull
    public static final char[] getHEX_DIGITS() {
        return HEX_DIGITS;
    }

    public static final boolean isPercentEncoded(@NotNull String str, int i10, int i11) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int i12 = i10 + 2;
        return i12 < i11 && str.charAt(i10) == '%' && _UtilCommonKt.parseHexDigit(str.charAt(i10 + 1)) != -1 && _UtilCommonKt.parseHexDigit(str.charAt(i12)) != -1;
    }

    @NotNull
    public static final String percentDecode(@NotNull String str, int i10, int i11, boolean z10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        for (int i12 = i10; i12 < i11; i12++) {
            char cCharAt = str.charAt(i12);
            if (cCharAt == '%' || (cCharAt == '+' && z10)) {
                C12924e c12924e = new C12924e();
                c12924e.mo48001K0(str, i10, i12);
                writePercentDecoded(c12924e, str, i12, i11, z10);
                return c12924e.mo48008R2();
            }
        }
        String strSubstring = str.substring(i10, i11);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ String percentDecode$default(String str, int i10, int i11, boolean z10, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        return percentDecode(str, i10, i11, z10);
    }

    public static final void writeCanonicalized(@NotNull C12924e c12924e, @NotNull String input, int i10, int i11, @NotNull String encodeSet, boolean z10, boolean z11, boolean z12, boolean z13, @Nullable Charset charset) throws EOFException {
        Intrinsics.checkNotNullParameter(c12924e, "<this>");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(encodeSet, "encodeSet");
        C12924e c12924e2 = null;
        while (i10 < i11) {
            int iCodePointAt = input.codePointAt(i10);
            if (z10 && (iCodePointAt == 9 || iCodePointAt == 10 || iCodePointAt == 12 || iCodePointAt == 13)) {
                Unit unit = Unit.f29331a;
            } else {
                if (iCodePointAt == 32 && encodeSet == FORM_ENCODE_SET) {
                    c12924e.mo47992C0("+");
                } else if (iCodePointAt == 43 && z12) {
                    c12924e.mo47992C0(z10 ? "+" : "%2B");
                } else if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z13) || StringsKt.m32150Z(encodeSet, (char) iCodePointAt, false, 2, null) || (iCodePointAt == 37 && (!z10 || (z11 && !isPercentEncoded(input, i10, i11)))))) {
                    if (c12924e2 == null) {
                        c12924e2 = new C12924e();
                    }
                    if (charset == null || Intrinsics.m31980c(charset, Charsets.UTF_8)) {
                        c12924e2.mo48009T(iCodePointAt);
                    } else {
                        c12924e2.m47990A0(input, i10, Character.charCount(iCodePointAt) + i10, charset);
                    }
                    while (!c12924e2.mo48016Z1()) {
                        byte b = c12924e2.readByte();
                        c12924e.writeByte(37);
                        char[] cArr = HEX_DIGITS;
                        c12924e.writeByte(cArr[((b & 255) >> 4) & 15]);
                        c12924e.writeByte(cArr[b & 15]);
                    }
                    Unit unit2 = Unit.f29331a;
                } else {
                    c12924e.mo48009T(iCodePointAt);
                }
            }
            i10 += Character.charCount(iCodePointAt);
        }
    }

    public static final void writePercentDecoded(@NotNull C12924e c12924e, @NotNull String encoded, int i10, int i11, boolean z10) {
        int i12;
        Intrinsics.checkNotNullParameter(c12924e, "<this>");
        Intrinsics.checkNotNullParameter(encoded, "encoded");
        while (i10 < i11) {
            int iCodePointAt = encoded.codePointAt(i10);
            if (iCodePointAt == 37 && (i12 = i10 + 2) < i11) {
                int hexDigit = _UtilCommonKt.parseHexDigit(encoded.charAt(i10 + 1));
                int hexDigit2 = _UtilCommonKt.parseHexDigit(encoded.charAt(i12));
                if (hexDigit == -1 || hexDigit2 == -1) {
                    c12924e.mo48009T(iCodePointAt);
                    i10 += Character.charCount(iCodePointAt);
                } else {
                    c12924e.writeByte((hexDigit << 4) + hexDigit2);
                    i10 = Character.charCount(iCodePointAt) + i12;
                }
            } else if (iCodePointAt == 43 && z10) {
                c12924e.writeByte(32);
                i10++;
            } else {
                c12924e.mo48009T(iCodePointAt);
                i10 += Character.charCount(iCodePointAt);
            }
        }
    }
}
