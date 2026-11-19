package wv;

import com.github.luben.zstd.BuildConfig;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import ew.e;
import ew.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;
import p001kotlin.text.StringsKt;
import p001kotlin.text.x;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\u0007J/\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J'\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0017\u001a\u00020\u000e*\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\u0019*\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001f\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010$\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010#R\u0018\u0010'\u001a\u00020\t*\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006("}, d2 = {"Lwv/d;", BuildConfig.FLAVOR, "<init>", "()V", BuildConfig.FLAVOR, InquiryField.StringField.TYPE, "e", "(Ljava/lang/String;)Ljava/lang/String;", "c", BuildConfig.FLAVOR, "pos", "limit", "Lew/e;", "result", BuildConfig.FLAVOR, "f", "(Ljava/lang/String;IILew/e;)Z", "d", "delta", "numpoints", "first", "a", "(IIZ)I", "h", "(Ljava/lang/String;II)Z", BuildConfig.FLAVOR, "b", "(Ljava/lang/String;II)Ljava/util/List;", "Ljava/lang/String;", "getPREFIX_STRING", "()Ljava/lang/String;", "PREFIX_STRING", "Lew/h;", "Lew/h;", "getPREFIX", "()Lew/h;", "PREFIX", "g", "(I)I", "punycodeDigit", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final d f36016a = new d();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final String PREFIX_STRING = "xn--";

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final h PREFIX = h.INSTANCE.d("xn--");

    public final int a(int delta, int numpoints, boolean first) {
        int i10 = first ? delta / 700 : delta / 2;
        int i11 = i10 + (i10 / numpoints);
        int i12 = 0;
        while (i11 > 455) {
            i11 /= 35;
            i12 += 36;
        }
        return i12 + ((i11 * 36) / (i11 + 38));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [char] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v6, types: [int] */
    public final List<Integer> b(String str, int i10, int i11) {
        ArrayList arrayList = new ArrayList();
        while (i10 < i11) {
            int iCharAt = str.charAt(i10);
            if (p001kotlin.text.b.e(iCharAt)) {
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

    @Nullable
    public final String c(@NotNull String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        int length = string.length();
        e eVar = new e();
        int i10 = 0;
        while (i10 < length) {
            String str = string;
            int iM0 = StringsKt.m0(str, '.', i10, false, 4, null);
            if (iM0 == -1) {
                iM0 = length;
            }
            if (!d(str, i10, iM0, eVar)) {
                return null;
            }
            if (iM0 >= length) {
                break;
            }
            eVar.writeByte(46);
            i10 = iM0 + 1;
            string = str;
        }
        return eVar.V2();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean d(String string, int pos, int limit, e result) {
        int i10;
        int i11;
        int i12;
        int i13 = 1;
        if (!x.H(string, pos, PREFIX_STRING, 0, 4, true)) {
            result.L0(string, pos, limit);
            return true;
        }
        int i14 = pos + 4;
        ArrayList arrayList = new ArrayList();
        int iS0 = StringsKt.s0(string, '-', limit, false, 4, null);
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
        int i17 = Barcode.FORMAT_ITF;
        int iA = 72;
        int i18 = 0;
        while (i14 < limit) {
            int i19 = i13;
            boolean z10 = i15;
            p001kotlin.ranges.a aVarP = p001kotlin.ranges.d.p(p001kotlin.ranges.d.q(36, Integer.MAX_VALUE), 36);
            int first = aVarP.getFirst();
            int last = aVarP.getLast();
            int step = aVarP.getStep();
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
                    if (first <= iA) {
                        i12 = i19;
                    } else {
                        i12 = first >= iA + 26 ? 26 : first - iA;
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
            iA = a(i10 - i18, arrayList.size() + 1, i18 == 0 ? i19 : z10 ? 1 : 0);
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
            result.X(((Number) obj).intValue());
        }
        return z11;
    }

    @Nullable
    public final String e(@NotNull String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        int length = string.length();
        e eVar = new e();
        int i10 = 0;
        while (i10 < length) {
            String str = string;
            int iM0 = StringsKt.m0(str, '.', i10, false, 4, null);
            if (iM0 == -1) {
                iM0 = length;
            }
            if (!f(str, i10, iM0, eVar)) {
                return null;
            }
            if (iM0 >= length) {
                break;
            }
            eVar.writeByte(46);
            i10 = iM0 + 1;
            string = str;
        }
        return eVar.V2();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean f(String string, int pos, int limit, e result) {
        int i10;
        int i11;
        int i12;
        int i13 = 1;
        if (!h(string, pos, limit)) {
            result.L0(string, pos, limit);
            return true;
        }
        result.z1(PREFIX);
        List<Integer> listB = b(string, pos, limit);
        Iterator<Integer> it = listB.iterator();
        int i14 = 0;
        while (true) {
            boolean zHasNext = it.hasNext();
            i10 = Barcode.FORMAT_ITF;
            if (!zHasNext) {
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
        int iA = 72;
        int i15 = 0;
        int i16 = i14;
        while (i16 < listB.size()) {
            Iterator<T> it2 = listB.iterator();
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
            Iterator<Integer> it3 = listB.iterator();
            while (it3.hasNext()) {
                int iIntValue5 = it3.next().intValue();
                if (iIntValue5 < iIntValue4) {
                    if (i18 == Integer.MAX_VALUE) {
                        return false;
                    }
                    i18++;
                } else if (iIntValue5 == iIntValue4) {
                    p001kotlin.ranges.a aVarP = p001kotlin.ranges.d.p(p001kotlin.ranges.d.q(36, Integer.MAX_VALUE), 36);
                    int first = aVarP.getFirst();
                    int last = aVarP.getLast();
                    int step = aVarP.getStep();
                    if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
                        i12 = i18;
                        while (true) {
                            if (first <= iA) {
                                i11 = i13;
                            } else {
                                i11 = i13;
                                i13 = first >= iA + 26 ? 26 : first - iA;
                            }
                            if (i12 < i13) {
                                break;
                            }
                            int i19 = i12 - i13;
                            int i20 = 36 - i13;
                            result.writeByte(g(i13 + (i19 % i20)));
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
                    result.writeByte(g(i12));
                    int i21 = i16 + 1;
                    iA = a(i18, i21, i16 == i14 ? i11 : false);
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

    public final int g(int i10) {
        if (i10 < 26) {
            return i10 + 97;
        }
        if (i10 < 36) {
            return i10 + 22;
        }
        throw new IllegalStateException(("unexpected digit: " + i10).toString());
    }

    public final boolean h(String str, int i10, int i11) {
        while (i10 < i11) {
            if (str.charAt(i10) >= 128) {
                return true;
            }
            i10++;
        }
        return false;
    }
}
