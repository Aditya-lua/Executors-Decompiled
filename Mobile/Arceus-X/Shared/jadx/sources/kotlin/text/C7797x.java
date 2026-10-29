package kotlin.text;

import java.nio.ByteBuffer;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.collections.AbstractC7675d;
import kotlin.jvm.internal.C7737g0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C7764d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: kotlin.text.x */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000F\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\f\n\u0002\b\t\n\u0002\u0010\u0019\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\r\n\u0002\u0010\r\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0004\u001a\u00020\u0002*\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a+\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\n\u001a+\u0010\r\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a+\u0010\u000f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u000e\u001a\u0013\u0010\u0011\u001a\u00020\u0000*\u00020\u0010H\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a'\u0010\u0016\u001a\u00020\u0000*\u00020\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0013\u0010\u0019\u001a\u00020\u0000*\u00020\u0018H\u0007¢\u0006\u0004\b\u0019\u0010\u001a\u001a1\u0010\u001c\u001a\u00020\u0000*\u00020\u00182\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u001b\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0013\u0010\u001e\u001a\u00020\u0018*\u00020\u0000H\u0007¢\u0006\u0004\b\u001e\u0010\u001f\u001a#\u0010!\u001a\u00020\u0002*\u00020\u00002\u0006\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b!\u0010\u0005\u001a+\u0010\"\u001a\u00020\u0002*\u00020\u00002\u0006\u0010 \u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\"\u0010#\u001a#\u0010%\u001a\u00020\u0002*\u00020\u00002\u0006\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b%\u0010\u0005\u001a \u0010'\u001a\u00020\u0002*\u0004\u0018\u00010&2\b\u0010\u0001\u001a\u0004\u0018\u00010&H\u0087\u0004¢\u0006\u0004\b'\u0010(\u001a;\u0010,\u001a\u00020\u0002*\u00020\u00002\u0006\u0010)\u001a\u00020\u00132\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010*\u001a\u00020\u00132\u0006\u0010+\u001a\u00020\u00132\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b,\u0010-\u001a\u0019\u0010/\u001a\u00020\u0000*\u00020&2\u0006\u0010.\u001a\u00020\u0013¢\u0006\u0004\b/\u00100\"%\u00106\u001a\u0012\u0012\u0004\u0012\u00020\u000002j\b\u0012\u0004\u0012\u00020\u0000`3*\u0002018F¢\u0006\u0006\u001a\u0004\b4\u00105¨\u00067"}, m31665d2 = {"", "other", "", "ignoreCase", "E", "(Ljava/lang/String;Ljava/lang/String;Z)Z", "", "oldChar", "newChar", "K", "(Ljava/lang/String;CCZ)Ljava/lang/String;", "oldValue", "newValue", "L", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;", "O", "", "v", "([C)Ljava/lang/String;", "", "startIndex", "endIndex", "w", "([CII)Ljava/lang/String;", "", "y", "([B)Ljava/lang/String;", "throwOnInvalidSequence", "z", "([BIIZ)Ljava/lang/String;", "B", "(Ljava/lang/String;)[B", "prefix", "R", "Q", "(Ljava/lang/String;Ljava/lang/String;IZ)Z", "suffix", "C", "", "x", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z", "thisOffset", "otherOffset", "length", "H", "(Ljava/lang/String;ILjava/lang/String;IIZ)Z", "n", "J", "(Ljava/lang/CharSequence;I)Ljava/lang/String;", "Lkotlin/String$Companion;", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "G", "(Lkotlin/jvm/internal/g0;)Ljava/util/Comparator;", "CASE_INSENSITIVE_ORDER", "kotlin-stdlib"}, m31666k = 5, m31667mv = {2, 2, 0}, m31669xi = 49, m31670xs = "kotlin/text/StringsKt")
public class C7797x extends StringsKt__StringNumberConversionsKt {
    /* JADX INFO: renamed from: A */
    public static /* synthetic */ String m32290A(byte[] bArr, int i10, int i11, boolean z10, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = bArr.length;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        return m32314z(bArr, i10, i11, z10);
    }

    @NotNull
    /* JADX INFO: renamed from: B */
    public static byte[] m32291B(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return bytes;
    }

    /* JADX INFO: renamed from: C */
    public static boolean m32292C(@NotNull String str, @NotNull String suffix, boolean z10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        return !z10 ? str.endsWith(suffix) : m32297H(str, str.length() - suffix.length(), suffix, 0, suffix.length(), true);
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ boolean m32293D(String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return m32292C(str, str2, z10);
    }

    /* JADX INFO: renamed from: E */
    public static boolean m32294E(@Nullable String str, @Nullable String str2, boolean z10) {
        if (str == null) {
            return str2 == null;
        }
        return !z10 ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ boolean m32295F(String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return m32294E(str, str2, z10);
    }

    @NotNull
    /* JADX INFO: renamed from: G */
    public static Comparator<String> m32296G(@NotNull C7737g0 c7737g0) {
        Intrinsics.checkNotNullParameter(c7737g0, "<this>");
        Comparator<String> CASE_INSENSITIVE_ORDER = String.CASE_INSENSITIVE_ORDER;
        Intrinsics.checkNotNullExpressionValue(CASE_INSENSITIVE_ORDER, "CASE_INSENSITIVE_ORDER");
        return CASE_INSENSITIVE_ORDER;
    }

    /* JADX INFO: renamed from: H */
    public static boolean m32297H(@NotNull String str, int i10, @NotNull String other, int i11, int i12, boolean z10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return !z10 ? str.regionMatches(i10, other, i11, i12) : str.regionMatches(z10, i10, other, i11, i12);
    }

    /* JADX INFO: renamed from: I */
    public static /* synthetic */ boolean m32298I(String str, int i10, String str2, int i11, int i12, boolean z10, int i13, Object obj) {
        if ((i13 & 16) != 0) {
            z10 = false;
        }
        return m32297H(str, i10, str2, i11, i12, z10);
    }

    @NotNull
    /* JADX INFO: renamed from: J */
    public static String m32299J(@NotNull CharSequence charSequence, int i10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i10 + '.').toString());
        }
        if (i10 == 0) {
            return "";
        }
        int i11 = 1;
        if (i10 == 1) {
            return charSequence.toString();
        }
        int length = charSequence.length();
        if (length == 0) {
            return "";
        }
        if (length == 1) {
            char cCharAt = charSequence.charAt(0);
            char[] cArr = new char[i10];
            for (int i12 = 0; i12 < i10; i12++) {
                cArr[i12] = cCharAt;
            }
            return new String(cArr);
        }
        StringBuilder sb2 = new StringBuilder(charSequence.length() * i10);
        if (1 <= i10) {
            while (true) {
                sb2.append(charSequence);
                if (i11 == i10) {
                    break;
                }
                i11++;
            }
        }
        String string = sb2.toString();
        Intrinsics.checkNotNull(string);
        return string;
    }

    @NotNull
    /* JADX INFO: renamed from: K */
    public static final String m32300K(@NotNull String str, char c10, char c11, boolean z10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (!z10) {
            String strReplace = str.replace(c10, c11);
            Intrinsics.checkNotNullExpressionValue(strReplace, "replace(...)");
            return strReplace;
        }
        StringBuilder sb2 = new StringBuilder(str.length());
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (C7773b.m32200d(cCharAt, c10, z10)) {
                cCharAt = c11;
            }
            sb2.append(cCharAt);
        }
        return sb2.toString();
    }

    @NotNull
    /* JADX INFO: renamed from: L */
    public static final String m32301L(@NotNull String str, @NotNull String oldValue, @NotNull String newValue, boolean z10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(oldValue, "oldValue");
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        int i10 = 0;
        int iM32170j0 = StringsKt__StringsKt.m32170j0(str, oldValue, 0, z10);
        if (iM32170j0 < 0) {
            return str;
        }
        int length = oldValue.length();
        int iM32078c = C7764d.m32078c(length, 1);
        int length2 = (str.length() - length) + newValue.length();
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb2 = new StringBuilder(length2);
        do {
            sb2.append((CharSequence) str, i10, iM32170j0);
            sb2.append(newValue);
            i10 = iM32170j0 + length;
            if (iM32170j0 >= str.length()) {
                break;
            }
            iM32170j0 = StringsKt__StringsKt.m32170j0(str, oldValue, iM32170j0 + iM32078c, z10);
        } while (iM32170j0 > 0);
        sb2.append((CharSequence) str, i10, str.length());
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    /* JADX INFO: renamed from: M */
    public static /* synthetic */ String m32302M(String str, char c10, char c11, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return m32300K(str, c10, c11, z10);
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ String m32303N(String str, String str2, String str3, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return m32301L(str, str2, str3, z10);
    }

    /* JADX DEBUG: Class process forced to load method for inline: kotlin.text.StringsKt__StringsKt.n0(java.lang.CharSequence, java.lang.String, int, boolean, int, java.lang.Object):int */
    @NotNull
    /* JADX INFO: renamed from: O */
    public static final String m32304O(@NotNull String str, @NotNull String oldValue, @NotNull String newValue, boolean z10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(oldValue, "oldValue");
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        int iM32178n0 = StringsKt__StringsKt.m32178n0(str, oldValue, 0, z10, 2, null);
        return iM32178n0 < 0 ? str : StringsKt__StringsKt.m32130K0(str, iM32178n0, oldValue.length() + iM32178n0, newValue).toString();
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ String m32305P(String str, String str2, String str3, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return m32304O(str, str2, str3, z10);
    }

    /* JADX INFO: renamed from: Q */
    public static boolean m32306Q(@NotNull String str, @NotNull String prefix, int i10, boolean z10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return !z10 ? str.startsWith(prefix, i10) : m32297H(str, i10, prefix, 0, prefix.length(), z10);
    }

    /* JADX INFO: renamed from: R */
    public static boolean m32307R(@NotNull String str, @NotNull String prefix, boolean z10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return !z10 ? str.startsWith(prefix) : m32297H(str, 0, prefix, 0, prefix.length(), z10);
    }

    /* JADX INFO: renamed from: S */
    public static /* synthetic */ boolean m32308S(String str, String str2, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return m32306Q(str, str2, i10, z10);
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ boolean m32309T(String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return m32307R(str, str2, z10);
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public static String m32310v(@NotNull char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return new String(cArr);
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public static String m32311w(@NotNull char[] cArr, int i10, int i11) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        AbstractC7675d.INSTANCE.m31749a(i10, i11, cArr.length);
        return new String(cArr, i10, i11 - i10);
    }

    /* JADX INFO: renamed from: x */
    public static boolean m32312x(@Nullable CharSequence charSequence, @Nullable CharSequence charSequence2) {
        return (!(charSequence instanceof String) || charSequence2 == null) ? StringsKt__StringsKt.m32154b0(charSequence, charSequence2) : ((String) charSequence).contentEquals(charSequence2);
    }

    @NotNull
    /* JADX INFO: renamed from: y */
    public static String m32313y(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return new String(bArr, Charsets.UTF_8);
    }

    @NotNull
    /* JADX INFO: renamed from: z */
    public static final String m32314z(@NotNull byte[] bArr, int i10, int i11, boolean z10) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        AbstractC7675d.INSTANCE.m31749a(i10, i11, bArr.length);
        if (!z10) {
            return new String(bArr, i10, i11 - i10, Charsets.UTF_8);
        }
        CharsetDecoder charsetDecoderNewDecoder = Charsets.UTF_8.newDecoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
        String string = charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).decode(ByteBuffer.wrap(bArr, i10, i11 - i10)).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
