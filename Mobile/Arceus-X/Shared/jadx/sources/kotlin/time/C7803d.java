package kotlin.time;

import backtraceio.library.services.BacktraceMetrics;
import com.appsflyer.sdk_base.referrer.Payload;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.C7803d;
import okhttp3.internal.http2.Http2Connection;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: kotlin.time.d */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u00002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0015\n\u0002\b\n\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\b\u0010\t\u001a\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u001b\u0010\u0010\u001a\u00020\n*\u00020\n2\u0006\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001b\u0010\u0013\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0012\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\u0014\"\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017\"\u0014\u0010\u001a\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017\"\u0014\u0010\u001c\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0017\"\u0014\u0010\u001e\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0017¨\u0006\u001f"}, m31665d2 = {"", "isoString", "Lkotlin/time/e;", "n", "(Ljava/lang/CharSequence;)Lkotlin/time/e;", "Lkotlin/time/c;", Payload.INSTANT, "", "j", "(Lkotlin/time/c;)Ljava/lang/String;", "", "year", "", "l", "(I)Z", "isLeapYear", "m", "(IZ)I", "maxLength", "x", "(Ljava/lang/CharSequence;I)Ljava/lang/String;", "", "a", "[I", "POWERS_OF_TEN", "b", "asciiDigitPositionsInIsoStringAfterYear", "c", "colonsInIsoOffsetString", "d", "asciiDigitsInIsoOffsetString", "kotlin-stdlib"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C7803d {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final int[] f29594a = {1, 10, 100, 1000, BacktraceMetrics.defaultTimeBetweenRetriesMs, 100000, 1000000, 10000000, 100000000, Http2Connection.DEGRADED_PONG_TIMEOUT_NS};

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final int[] f29595b = {1, 2, 4, 5, 7, 8, 10, 11, 13, 14};

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final int[] f29596c = {3, 6};

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final int[] f29597d = {1, 2, 4, 5, 7, 8};

    /* JADX INFO: renamed from: j */
    public static final String m32392j(C7802c c7802c) throws IOException {
        int[] iArr;
        StringBuilder sb2 = new StringBuilder();
        C7805f c7805fM32414a = C7805f.INSTANCE.m32414a(c7802c);
        int iM32413g = c7805fM32414a.getYear();
        int i10 = 0;
        if (Math.abs(iM32413g) < 1000) {
            StringBuilder sb3 = new StringBuilder();
            if (iM32413g >= 0) {
                sb3.append(iM32413g + BacktraceMetrics.defaultTimeBetweenRetriesMs);
                Intrinsics.checkNotNullExpressionValue(sb3.deleteCharAt(0), "deleteCharAt(...)");
            } else {
                sb3.append(iM32413g - BacktraceMetrics.defaultTimeBetweenRetriesMs);
                Intrinsics.checkNotNullExpressionValue(sb3.deleteCharAt(1), "deleteCharAt(...)");
            }
            sb2.append((CharSequence) sb3);
        } else {
            if (iM32413g >= 10000) {
                sb2.append('+');
            }
            sb2.append(iM32413g);
        }
        sb2.append('-');
        m32393k(sb2, sb2, c7805fM32414a.getMonth());
        sb2.append('-');
        m32393k(sb2, sb2, c7805fM32414a.getDay());
        sb2.append('T');
        m32393k(sb2, sb2, c7805fM32414a.getHour());
        sb2.append(':');
        m32393k(sb2, sb2, c7805fM32414a.getMinute());
        sb2.append(':');
        m32393k(sb2, sb2, c7805fM32414a.getSecond());
        if (c7805fM32414a.getNanosecond() != 0) {
            sb2.append('.');
            while (true) {
                int iM32411e = c7805fM32414a.getNanosecond();
                iArr = f29594a;
                int i11 = i10 + 1;
                if (iM32411e % iArr[i11] != 0) {
                    break;
                }
                i10 = i11;
            }
            int i12 = i10 - (i10 % 3);
            String strValueOf = String.valueOf((c7805fM32414a.getNanosecond() / iArr[i12]) + iArr[9 - i12]);
            Intrinsics.m31981d(strValueOf, "null cannot be cast to non-null type java.lang.String");
            String strSubstring = strValueOf.substring(1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            sb2.append(strSubstring);
        }
        sb2.append('Z');
        return sb2.toString();
    }

    /* JADX INFO: renamed from: k */
    public static final void m32393k(Appendable appendable, StringBuilder sb2, int i10) throws IOException {
        if (i10 < 10) {
            appendable.append('0');
        }
        sb2.append(i10);
    }

    /* JADX INFO: renamed from: l */
    public static final boolean m32394l(int i10) {
        if ((i10 & 3) == 0) {
            return i10 % 100 != 0 || i10 % 400 == 0;
        }
        return false;
    }

    /* JADX INFO: renamed from: m */
    public static final int m32395m(int i10, boolean z10) {
        if (i10 != 2) {
            return (i10 == 4 || i10 == 6 || i10 == 9 || i10 == 11) ? 30 : 31;
        }
        return z10 ? 29 : 28;
    }

    /* JADX INFO: renamed from: n */
    public static final InterfaceC7804e m32396n(CharSequence charSequence) {
        int i10;
        int i11;
        int i12;
        int i13;
        char cCharAt;
        char cCharAt2;
        if (charSequence.length() == 0) {
            return new InterfaceC7804e.a("An empty string is not a valid Instant", charSequence);
        }
        char cCharAt3 = charSequence.charAt(0);
        if (cCharAt3 == '+' || cCharAt3 == '-') {
            i10 = 1;
        } else {
            i10 = 0;
            cCharAt3 = ' ';
        }
        int iCharAt = 0;
        int i14 = i10;
        while (i14 < charSequence.length() && '0' <= (cCharAt2 = charSequence.charAt(i14)) && cCharAt2 < ':') {
            iCharAt = (iCharAt * 10) + (charSequence.charAt(i14) - '0');
            i14++;
        }
        int i15 = i14 - i10;
        if (i15 > 10) {
            return m32404v(charSequence, "Expected at most 10 digits for the year number, got " + i15 + " digits");
        }
        if (i15 == 10 && Intrinsics.m31983f(charSequence.charAt(i10), 50) >= 0) {
            return m32404v(charSequence, "Expected at most 9 digits for the year number or year 1000000000, got " + i15 + " digits");
        }
        if (i15 < 4) {
            return m32404v(charSequence, "The year number must be padded to 4 digits, got " + i15 + " digits");
        }
        if (cCharAt3 == '+' && i15 == 4) {
            return m32404v(charSequence, "The '+' sign at the start is only valid for year numbers longer than 4 digits");
        }
        if (cCharAt3 == ' ' && i15 != 4) {
            return m32404v(charSequence, "A '+' or '-' sign is required for year numbers longer than 4 digits");
        }
        if (cCharAt3 == '-') {
            iCharAt = -iCharAt;
        }
        int i16 = iCharAt;
        int i17 = i14 + 16;
        if (charSequence.length() < i17) {
            return m32404v(charSequence, "The input string is too short");
        }
        InterfaceC7804e.a aVarM32397o = m32397o(charSequence, "'-'", i14, new Function1() { // from class: ju.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(C7803d.m32398p(((Character) obj).charValue()));
            }
        });
        if (aVarM32397o != null) {
            return aVarM32397o;
        }
        InterfaceC7804e.a aVarM32397o2 = m32397o(charSequence, "'-'", i14 + 3, new Function1() { // from class: ju.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(C7803d.m32400r(((Character) obj).charValue()));
            }
        });
        if (aVarM32397o2 != null) {
            return aVarM32397o2;
        }
        InterfaceC7804e.a aVarM32397o3 = m32397o(charSequence, "'T' or 't'", i14 + 6, new Function1() { // from class: ju.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(C7803d.m32401s(((Character) obj).charValue()));
            }
        });
        if (aVarM32397o3 != null) {
            return aVarM32397o3;
        }
        InterfaceC7804e.a aVarM32397o4 = m32397o(charSequence, "':'", i14 + 9, new Function1() { // from class: ju.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(C7803d.m32402t(((Character) obj).charValue()));
            }
        });
        if (aVarM32397o4 != null) {
            return aVarM32397o4;
        }
        InterfaceC7804e.a aVarM32397o5 = m32397o(charSequence, "':'", i14 + 12, new Function1() { // from class: ju.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(C7803d.m32403u(((Character) obj).charValue()));
            }
        });
        if (aVarM32397o5 != null) {
            return aVarM32397o5;
        }
        for (int i18 : f29595b) {
            InterfaceC7804e.a aVarM32397o6 = m32397o(charSequence, "an ASCII digit", i18 + i14, new Function1() { // from class: ju.j
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(C7803d.m32399q(((Character) obj).charValue()));
                }
            });
            if (aVarM32397o6 != null) {
                return aVarM32397o6;
            }
        }
        int iM32405w = m32405w(charSequence, i14 + 1);
        int iM32405w2 = m32405w(charSequence, i14 + 4);
        int iM32405w3 = m32405w(charSequence, i14 + 7);
        int iM32405w4 = m32405w(charSequence, i14 + 10);
        int iM32405w5 = m32405w(charSequence, i14 + 13);
        int i19 = i14 + 15;
        if (charSequence.charAt(i19) == '.') {
            i19 = i17;
            int iCharAt2 = 0;
            while (i19 < charSequence.length() && '0' <= (cCharAt = charSequence.charAt(i19)) && cCharAt < ':') {
                iCharAt2 = (iCharAt2 * 10) + (charSequence.charAt(i19) - '0');
                i19++;
            }
            int i20 = i19 - i17;
            if (1 > i20 || i20 >= 10) {
                return m32404v(charSequence, "1..9 digits are supported for the fraction of the second, got " + i20 + " digits");
            }
            i11 = iCharAt2 * f29594a[9 - i20];
        } else {
            i11 = 0;
        }
        if (i19 >= charSequence.length()) {
            return m32404v(charSequence, "The UTC offset at the end of the string is missing");
        }
        char cCharAt4 = charSequence.charAt(i19);
        if (cCharAt4 == '+' || cCharAt4 == '-') {
            int length = charSequence.length() - i19;
            if (length > 9) {
                return m32404v(charSequence, "The UTC offset string \"" + m32406x(charSequence.subSequence(i19, charSequence.length()).toString(), 16) + "\" is too long");
            }
            if (length % 3 != 0) {
                return m32404v(charSequence, "Invalid UTC offset string \"" + charSequence.subSequence(i19, charSequence.length()).toString() + '\"');
            }
            for (int i21 : f29596c) {
                int i22 = i19 + i21;
                if (i22 >= charSequence.length()) {
                    break;
                }
                if (charSequence.charAt(i22) != ':') {
                    return m32404v(charSequence, "Expected ':' at index " + i22 + ", got '" + charSequence.charAt(i22) + '\'');
                }
            }
            int[] iArr = f29597d;
            int length2 = iArr.length;
            int i23 = 0;
            while (i23 < length2) {
                int i24 = iArr[i23] + i19;
                if (i24 >= charSequence.length()) {
                    break;
                }
                char cCharAt5 = charSequence.charAt(i24);
                int[] iArr2 = iArr;
                if ('0' > cCharAt5 || cCharAt5 >= ':') {
                    return m32404v(charSequence, "Expected an ASCII digit at index " + i24 + ", got '" + charSequence.charAt(i24) + '\'');
                }
                i23++;
                iArr = iArr2;
            }
            int iM32405w6 = m32405w(charSequence, i19 + 1);
            i12 = 3;
            int iM32405w7 = length > 3 ? m32405w(charSequence, i19 + 4) : 0;
            int iM32405w8 = length > 6 ? m32405w(charSequence, i19 + 7) : 0;
            if (iM32405w7 > 59) {
                return m32404v(charSequence, "Expected offset-minute-of-hour in 0..59, got " + iM32405w7);
            }
            if (iM32405w8 > 59) {
                return m32404v(charSequence, "Expected offset-second-of-minute in 0..59, got " + iM32405w8);
            }
            if (iM32405w6 > 17 && (iM32405w6 != 18 || iM32405w7 != 0 || iM32405w8 != 0)) {
                return m32404v(charSequence, "Expected an offset in -18:00..+18:00, got " + charSequence.subSequence(i19, charSequence.length()).toString());
            }
            i13 = (cCharAt4 == '-' ? -1 : 1) * ((iM32405w6 * 3600) + (iM32405w7 * 60) + iM32405w8);
        } else {
            if (cCharAt4 != 'Z' && cCharAt4 != 'z') {
                return m32404v(charSequence, "Expected the UTC offset at position " + i19 + ", got '" + cCharAt4 + '\'');
            }
            int i25 = i19 + 1;
            if (charSequence.length() != i25) {
                return m32404v(charSequence, "Extra text after the instant at position " + i25);
            }
            i13 = 0;
            i12 = 3;
        }
        if (1 > iM32405w || iM32405w >= 13) {
            return m32404v(charSequence, "Expected a month number in 1..12, got " + iM32405w);
        }
        if (1 > iM32405w2 || iM32405w2 > m32395m(iM32405w, m32394l(i16))) {
            return m32404v(charSequence, "Expected a valid day-of-month for month " + iM32405w + " of year " + i16 + ", got " + iM32405w2);
        }
        if (iM32405w3 > 23) {
            return m32404v(charSequence, "Expected hour in 0..23, got " + iM32405w3);
        }
        if (iM32405w4 > 59) {
            return m32404v(charSequence, "Expected minute-of-hour in 0..59, got " + iM32405w4);
        }
        if (iM32405w5 > 59) {
            return m32404v(charSequence, "Expected second-of-minute in 0..59, got " + iM32405w5);
        }
        C7805f c7805f = new C7805f(i16, iM32405w, iM32405w2, iM32405w3, iM32405w4, iM32405w5, i11);
        long jM32413g = c7805f.getYear();
        long j10 = ((long) 365) * jM32413g;
        long jM32410d = (jM32413g >= 0 ? j10 + (((((long) i12) + jM32413g) / ((long) 4)) - ((((long) 99) + jM32413g) / ((long) 100))) + ((jM32413g + ((long) 399)) / ((long) 400)) : j10 - (((jM32413g / ((long) (-4))) - (jM32413g / ((long) (-100)))) + (jM32413g / ((long) (-400))))) + ((long) (((c7805f.getMonth() * 367) - 362) / 12)) + ((long) (c7805f.getDay() - 1));
        if (c7805f.getMonth() > 2) {
            jM32410d = !m32394l(c7805f.getYear()) ? jM32410d - 2 : (-1) + jM32410d;
        }
        return new InterfaceC7804e.b((((jM32410d - ((long) 719528)) * ((long) 86400)) + ((long) (((c7805f.getHour() * 3600) + (c7805f.getMinute() * 60)) + c7805f.getSecond()))) - ((long) i13), c7805f.getNanosecond());
    }

    /* JADX INFO: renamed from: o */
    public static final InterfaceC7804e.a m32397o(CharSequence charSequence, String str, int i10, Function1<? super Character, Boolean> function1) {
        char cCharAt = charSequence.charAt(i10);
        if (function1.invoke(Character.valueOf(cCharAt)).booleanValue()) {
            return null;
        }
        return m32404v(charSequence, "Expected " + str + ", but got '" + cCharAt + "' at position " + i10);
    }

    /* JADX INFO: renamed from: p */
    public static final boolean m32398p(char c10) {
        return c10 == '-';
    }

    /* JADX INFO: renamed from: q */
    public static final boolean m32399q(char c10) {
        return '0' <= c10 && c10 < ':';
    }

    /* JADX INFO: renamed from: r */
    public static final boolean m32400r(char c10) {
        return c10 == '-';
    }

    /* JADX INFO: renamed from: s */
    public static final boolean m32401s(char c10) {
        return c10 == 'T' || c10 == 't';
    }

    /* JADX INFO: renamed from: t */
    public static final boolean m32402t(char c10) {
        return c10 == ':';
    }

    /* JADX INFO: renamed from: u */
    public static final boolean m32403u(char c10) {
        return c10 == ':';
    }

    /* JADX INFO: renamed from: v */
    public static final InterfaceC7804e.a m32404v(CharSequence charSequence, String str) {
        return new InterfaceC7804e.a(str + " when parsing an Instant from \"" + m32406x(charSequence, 64) + '\"', charSequence);
    }

    /* JADX INFO: renamed from: w */
    public static final int m32405w(CharSequence charSequence, int i10) {
        return ((charSequence.charAt(i10) - '0') * 10) + (charSequence.charAt(i10 + 1) - '0');
    }

    /* JADX INFO: renamed from: x */
    public static final String m32406x(CharSequence charSequence, int i10) {
        if (charSequence.length() <= i10) {
            return charSequence.toString();
        }
        return charSequence.subSequence(0, i10).toString() + "...";
    }
}
