package okhttp3.internal.idn;

import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C7761a;
import kotlin.ranges.C7764d;
import kotlin.text.C7773b;
import kotlin.text.C7797x;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p560xu.C12924e;
import p560xu.C12930h;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0010\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ/\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\rJ'\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0014\u001a\u00020\u000b*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0016*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u001b\u0010\u001aR\u001a\u0010\u001c\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010!\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b'\u0010&R\u0014\u0010(\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010&R\u0014\u0010)\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b)\u0010&R\u0014\u0010*\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b*\u0010&R\u0014\u0010+\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b+\u0010&R\u0014\u0010,\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b,\u0010&R\u0018\u0010/\u001a\u00020\u0006*\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u00060"}, m31665d2 = {"Lokhttp3/internal/idn/Punycode;", "", "<init>", "()V", "", InquiryField.StringField.TYPE, "", "pos", "limit", "Lxu/e;", "result", "", "encodeLabel", "(Ljava/lang/String;IILxu/e;)Z", "decodeLabel", "delta", "numpoints", "first", "adapt", "(IIZ)I", "requiresEncode", "(Ljava/lang/String;II)Z", "", "codePoints", "(Ljava/lang/String;II)Ljava/util/List;", "encode", "(Ljava/lang/String;)Ljava/lang/String;", "decode", "PREFIX_STRING", "Ljava/lang/String;", "getPREFIX_STRING", "()Ljava/lang/String;", "Lxu/h;", "PREFIX", "Lxu/h;", "getPREFIX", "()Lxu/h;", "BASE", "I", "TMIN", "TMAX", "SKEW", "DAMP", "INITIAL_BIAS", "INITIAL_N", "getPunycodeDigit", "(I)I", "punycodeDigit", "okhttp"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class Punycode {
    private static final int BASE = 36;
    private static final int DAMP = 700;
    private static final int INITIAL_BIAS = 72;
    private static final int INITIAL_N = 128;
    private static final int SKEW = 38;
    private static final int TMAX = 26;
    private static final int TMIN = 1;

    @NotNull
    public static final Punycode INSTANCE = new Punycode();

    @NotNull
    private static final String PREFIX_STRING = "xn--";

    @NotNull
    private static final C12930h PREFIX = C12930h.INSTANCE.m48117d("xn--");

    private Punycode() {
    }

    private final int adapt(int delta, int numpoints, boolean first) {
        int i10 = first ? delta / DAMP : delta / 2;
        int i11 = i10 + (i10 / numpoints);
        int i12 = 0;
        while (i11 > 455) {
            i11 /= 35;
            i12 += 36;
        }
        return i12 + ((i11 * 36) / (i11 + 38));
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:21:0x0036 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: int */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [char] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v6, types: [int] */
    private final List<Integer> codePoints(String str, int i10, int i11) {
        ArrayList arrayList = new ArrayList();
        while (i10 < i11) {
            int iCharAt = str.charAt(i10);
            if (C7773b.m32201e(iCharAt)) {
                int i12 = i10 + 1;
                char cCharAt = i12 < i11 ? str.charAt(i12) : (char) 0;
                if (Character.isLowSurrogate(iCharAt) || !Character.isLowSurrogate(cCharAt)) {
                    iCharAt = 63;
                } else {
                    iCharAt = 65536 + (((iCharAt & 1023) << 10) | (cCharAt & 1023));
                    i10 = i12;
                }
            }
            arrayList.add(Integer.valueOf(iCharAt));
            i10++;
        }
        return arrayList;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r16v0, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r23v2, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    private final boolean decodeLabel(String string, int pos, int limit, C12924e result) {
        int i10;
        int i11;
        int i12;
        int i13 = 1;
        if (!C7797x.m32297H(string, pos, PREFIX_STRING, 0, 4, true)) {
            result.mo48001K0(string, pos, limit);
            return true;
        }
        int i14 = pos + 4;
        ArrayList arrayList = new ArrayList();
        int iS0 = StringsKt.m32188s0(string, '-', limit, false, 4, null);
        char c10 = '0';
        char c11 = '[';
        char c12 = '{';
        int i15 = 0;
        if (iS0 >= i14) {
            while (i14 < iS0) {
                int i16 = i14 + 1;
                char cCharAt = string.charAt(i14);
                if (('a' > cCharAt || cCharAt >= '{') && (('A' > cCharAt || cCharAt >= '[') && (('0' > cCharAt || cCharAt >= ':') && cCharAt != '-'))) {
                    return false;
                }
                arrayList.add(Integer.valueOf(cCharAt));
                i14 = i16;
            }
            i14++;
        }
        int i17 = 128;
        int iAdapt = 72;
        int i18 = 0;
        while (i14 < limit) {
            int i19 = i13;
            boolean z10 = i15;
            C7761a c7761aM32091p = C7764d.m32091p(C7764d.m32092q(36, Integer.MAX_VALUE), 36);
            int first = c7761aM32091p.getFirst();
            int last = c7761aM32091p.getLast();
            int step = c7761aM32091p.getStep();
            if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
                i10 = i18;
                int i20 = i19;
                while (i14 != limit) {
                    int i21 = i14 + 1;
                    char cCharAt2 = string.charAt(i14);
                    if ('a' <= cCharAt2 && cCharAt2 < c12) {
                        i11 = cCharAt2 - 'a';
                    } else if ('A' <= cCharAt2 && cCharAt2 < c11) {
                        i11 = cCharAt2 - 'A';
                    } else {
                        if (c10 > cCharAt2 || cCharAt2 >= ':') {
                            return z10;
                        }
                        i11 = cCharAt2 - 22;
                    }
                    int i22 = i20;
                    int i23 = i11 * i22;
                    int i24 = i10;
                    if (i24 > Integer.MAX_VALUE - i23) {
                        return z10;
                    }
                    i10 = i24 + i23;
                    if (first <= iAdapt) {
                        i12 = i19;
                    } else {
                        i12 = first >= iAdapt + 26 ? 26 : first - iAdapt;
                    }
                    if (i11 >= i12) {
                        int i25 = 36 - i12;
                        if (i22 > Integer.MAX_VALUE / i25) {
                            return z10;
                        }
                        i20 = i22 * i25;
                        if (first != last) {
                            first += step;
                            i14 = i21;
                            c10 = '0';
                            c11 = '[';
                            c12 = '{';
                        }
                    }
                    i14 = i21;
                }
                return z10;
            }
            i10 = i18;
            iAdapt = adapt(i10 - i18, arrayList.size() + 1, i18 == 0 ? i19 : z10 ? 1 : 0);
            int size = i10 / (arrayList.size() + 1);
            if (i17 > Integer.MAX_VALUE - size) {
                return z10;
            }
            i17 += size;
            int size2 = i10 % (arrayList.size() + 1);
            if (i17 > 1114111) {
                return z10;
            }
            arrayList.add(size2, Integer.valueOf(i17));
            i18 = size2 + 1;
            i15 = z10 ? 1 : 0;
            i13 = i19;
            c10 = '0';
            c11 = '[';
            c12 = '{';
        }
        boolean z11 = i13;
        int size3 = arrayList.size();
        while (i15 < size3) {
            Object obj = arrayList.get(i15);
            i15++;
            result.mo48009T(((Number) obj).intValue());
        }
        return z11;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r16v0, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    private final boolean encodeLabel(String string, int pos, int limit, C12924e result) {
        int i10;
        int i11;
        int i12;
        int i13 = 1;
        if (!requiresEncode(string, pos, limit)) {
            result.mo48001K0(string, pos, limit);
            return true;
        }
        result.mo48023d0(PREFIX);
        List<Integer> listCodePoints = codePoints(string, pos, limit);
        Iterator<Integer> it = listCodePoints.iterator();
        int i14 = 0;
        while (true) {
            i10 = 128;
            if (!it.hasNext()) {
                break;
            }
            int iIntValue = it.next().intValue();
            if (iIntValue < 128) {
                result.writeByte(iIntValue);
                i14++;
            }
        }
        if (i14 > 0) {
            result.writeByte(45);
        }
        int iAdapt = 72;
        int i15 = 0;
        int i16 = i14;
        while (i16 < listCodePoints.size()) {
            Iterator<T> it2 = listCodePoints.iterator();
            if (!it2.hasNext()) {
                throw new NoSuchElementException();
            }
            Object next = it2.next();
            if (it2.hasNext()) {
                int iIntValue2 = ((Number) next).intValue();
                if (iIntValue2 < i10) {
                    iIntValue2 = Integer.MAX_VALUE;
                }
                do {
                    Object next2 = it2.next();
                    int iIntValue3 = ((Number) next2).intValue();
                    if (iIntValue3 < i10) {
                        iIntValue3 = Integer.MAX_VALUE;
                    }
                    if (iIntValue2 > iIntValue3) {
                        next = next2;
                        iIntValue2 = iIntValue3;
                    }
                } while (it2.hasNext());
            }
            int iIntValue4 = ((Number) next).intValue();
            int i17 = (iIntValue4 - i10) * (i16 + 1);
            if (i15 > Integer.MAX_VALUE - i17) {
                return false;
            }
            int i18 = i15 + i17;
            Iterator<Integer> it3 = listCodePoints.iterator();
            while (it3.hasNext()) {
                int iIntValue5 = it3.next().intValue();
                if (iIntValue5 < iIntValue4) {
                    if (i18 == Integer.MAX_VALUE) {
                        return false;
                    }
                    i18++;
                } else if (iIntValue5 == iIntValue4) {
                    C7761a c7761aM32091p = C7764d.m32091p(C7764d.m32092q(36, Integer.MAX_VALUE), 36);
                    int first = c7761aM32091p.getFirst();
                    int last = c7761aM32091p.getLast();
                    int step = c7761aM32091p.getStep();
                    if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
                        i12 = i18;
                        while (true) {
                            if (first <= iAdapt) {
                                i11 = i13;
                            } else {
                                i11 = i13;
                                i13 = first >= iAdapt + 26 ? 26 : first - iAdapt;
                            }
                            if (i12 < i13) {
                                break;
                            }
                            int i19 = i12 - i13;
                            int i20 = 36 - i13;
                            result.writeByte(getPunycodeDigit(i13 + (i19 % i20)));
                            i12 = i19 / i20;
                            if (first == last) {
                                break;
                            }
                            first += step;
                            i13 = i11;
                        }
                    } else {
                        i11 = i13;
                        i12 = i18;
                    }
                    result.writeByte(getPunycodeDigit(i12));
                    int i21 = i16 + 1;
                    iAdapt = adapt(i18, i21, i16 == i14 ? i11 : false);
                    i16 = i21;
                    i18 = 0;
                    i13 = i11;
                }
            }
            i15 = i18 + 1;
            i10 = iIntValue4 + 1;
        }
        return i13;
    }

    private final int getPunycodeDigit(int i10) {
        if (i10 < 26) {
            return i10 + 97;
        }
        if (i10 < 36) {
            return i10 + 22;
        }
        throw new IllegalStateException(("unexpected digit: " + i10).toString());
    }

    private final boolean requiresEncode(String str, int i10, int i11) {
        while (i10 < i11) {
            if (str.charAt(i10) >= 128) {
                return true;
            }
            i10++;
        }
        return false;
    }

    @Nullable
    public final String decode(@NotNull String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        int length = string.length();
        C12924e c12924e = new C12924e();
        int i10 = 0;
        while (i10 < length) {
            String str = string;
            int iM0 = StringsKt.m32176m0(str, '.', i10, false, 4, null);
            if (iM0 == -1) {
                iM0 = length;
            }
            if (!decodeLabel(str, i10, iM0, c12924e)) {
                return null;
            }
            if (iM0 >= length) {
                break;
            }
            c12924e.writeByte(46);
            i10 = iM0 + 1;
            string = str;
        }
        return c12924e.mo48008R2();
    }

    @Nullable
    public final String encode(@NotNull String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        int length = string.length();
        C12924e c12924e = new C12924e();
        int i10 = 0;
        while (i10 < length) {
            String str = string;
            int iM0 = StringsKt.m32176m0(str, '.', i10, false, 4, null);
            if (iM0 == -1) {
                iM0 = length;
            }
            if (!encodeLabel(str, i10, iM0, c12924e)) {
                return null;
            }
            if (iM0 >= length) {
                break;
            }
            c12924e.writeByte(46);
            i10 = iM0 + 1;
            string = str;
        }
        return c12924e.mo48008R2();
    }

    @NotNull
    public final C12930h getPREFIX() {
        return PREFIX;
    }

    @NotNull
    public final String getPREFIX_STRING() {
        return PREFIX_STRING;
    }
}
