package kotlin.time;

import backtraceio.library.services.BacktraceMetrics;
import com.appsflyer.sdk_base.referrer.Payload;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2Connection;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0015\n\u0002\b\n\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\b\u0010\t\u001a\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u001b\u0010\u0010\u001a\u00020\n*\u00020\n2\u0006\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001b\u0010\u0013\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0012\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\u0014\"\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017\"\u0014\u0010\u001a\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017\"\u0014\u0010\u001c\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0017\"\u0014\u0010\u001e\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0017¨\u0006\u001f"}, d2 = {"", "isoString", "Lkotlin/time/e;", "n", "(Ljava/lang/CharSequence;)Lkotlin/time/e;", "Lkotlin/time/c;", Payload.INSTANT, "", "j", "(Lkotlin/time/c;)Ljava/lang/String;", "", "year", "", "l", "(I)Z", "isLeapYear", "m", "(IZ)I", "maxLength", "x", "(Ljava/lang/CharSequence;I)Ljava/lang/String;", "", "a", "[I", "POWERS_OF_TEN", "b", "asciiDigitPositionsInIsoStringAfterYear", "c", "colonsInIsoOffsetString", "d", "asciiDigitsInIsoOffsetString", "kotlin-stdlib"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final int[] f22687a = {1, 10, 100, 1000, BacktraceMetrics.defaultTimeBetweenRetriesMs, 100000, 1000000, 10000000, 100000000, Http2Connection.DEGRADED_PONG_TIMEOUT_NS};

    @NotNull
    public static final int[] b = {1, 2, 4, 5, 7, 8, 10, 11, 13, 14};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final int[] f22688c = {3, 6};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final int[] f22689d = {1, 2, 4, 5, 7, 8};

    public static final String j(c cVar) throws IOException {
        int[] iArr;
        StringBuilder sb2 = new StringBuilder();
        f fVarA = f.INSTANCE.a(cVar);
        int iG = fVarA.getYear();
        int i10 = 0;
        if (Math.abs(iG) < 1000) {
            StringBuilder sb3 = new StringBuilder();
            if (iG >= 0) {
                sb3.append(iG + BacktraceMetrics.defaultTimeBetweenRetriesMs);
                Intrinsics.checkNotNullExpressionValue(sb3.deleteCharAt(0), "deleteCharAt(...)");
            } else {
                sb3.append(iG - BacktraceMetrics.defaultTimeBetweenRetriesMs);
                Intrinsics.checkNotNullExpressionValue(sb3.deleteCharAt(1), "deleteCharAt(...)");
            }
            sb2.append((CharSequence) sb3);
        } else {
            if (iG >= 10000) {
                sb2.append('+');
            }
            sb2.append(iG);
        }
        sb2.append('-');
        k(sb2, sb2, fVarA.getMonth());
        sb2.append('-');
        k(sb2, sb2, fVarA.getDay());
        sb2.append('T');
        k(sb2, sb2, fVarA.getHour());
        sb2.append(':');
        k(sb2, sb2, fVarA.getMinute());
        sb2.append(':');
        k(sb2, sb2, fVarA.getSecond());
        if (fVarA.getNanosecond() != 0) {
            sb2.append('.');
            while (true) {
                int iE = fVarA.getNanosecond();
                iArr = f22687a;
                int i11 = i10 + 1;
                if (iE % iArr[i11] != 0) {
                    break;
                }
                i10 = i11;
            }
            int i12 = i10 - (i10 % 3);
            String strValueOf = String.valueOf((fVarA.getNanosecond() / iArr[i12]) + iArr[9 - i12]);
            Intrinsics.d(strValueOf, "null cannot be cast to non-null type java.lang.String");
            String strSubstring = strValueOf.substring(1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            sb2.append(strSubstring);
        }
        sb2.append('Z');
        return sb2.toString();
    }

    public static final void k(Appendable appendable, StringBuilder sb2, int i10) throws IOException {
        if (i10 < 10) {
            appendable.append('0');
        }
        sb2.append(i10);
    }

    public static final boolean l(int i10) {
        if ((i10 & 3) == 0) {
            return i10 % 100 != 0 || i10 % 400 == 0;
        }
        return false;
    }

    public static final int m(int i10, boolean z10) {
        if (i10 != 2) {
            return (i10 == 4 || i10 == 6 || i10 == 9 || i10 == 11) ? 30 : 31;
        }
        return z10 ? 29 : 28;
    }

    public static final e n(CharSequence charSequence) {
        int i10;
        int i11;
        int i12;
        int i13;
        char cCharAt;
        char cCharAt2;
        if (charSequence.length() == 0) {
            return new e.a("An empty string is not a valid Instant", charSequence);
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
            return v(charSequence, "Expected at most 10 digits for the year number, got " + i15 + " digits");
        }
        if (i15 == 10 && Intrinsics.f(charSequence.charAt(i10), 50) >= 0) {
            return v(charSequence, "Expected at most 9 digits for the year number or year 1000000000, got " + i15 + " digits");
        }
        if (i15 < 4) {
            return v(charSequence, "The year number must be padded to 4 digits, got " + i15 + " digits");
        }
        if (cCharAt3 == '+' && i15 == 4) {
            return v(charSequence, "The '+' sign at the start is only valid for year numbers longer than 4 digits");
        }
        if (cCharAt3 == ' ' && i15 != 4) {
            return v(charSequence, "A '+' or '-' sign is required for year numbers longer than 4 digits");
        }
        if (cCharAt3 == '-') {
            iCharAt = -iCharAt;
        }
        int i16 = iCharAt;
        int i17 = i14 + 16;
        if (charSequence.length() < i17) {
            return v(charSequence, "The input string is too short");
        }
        e.a aVarO = o(charSequence, "'-'", i14, new Function1() { // from class: ju.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(kotlin.time.d.p(((Character) obj).charValue()));
            }
        });
        if (aVarO != null) {
            return aVarO;
        }
        e.a aVarO2 = o(charSequence, "'-'", i14 + 3, new Function1() { // from class: ju.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(kotlin.time.d.r(((Character) obj).charValue()));
            }
        });
        if (aVarO2 != null) {
            return aVarO2;
        }
        e.a aVarO3 = o(charSequence, "'T' or 't'", i14 + 6, new Function1() { // from class: ju.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(kotlin.time.d.s(((Character) obj).charValue()));
            }
        });
        if (aVarO3 != null) {
            return aVarO3;
        }
        e.a aVarO4 = o(charSequence, "':'", i14 + 9, new Function1() { // from class: ju.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(kotlin.time.d.t(((Character) obj).charValue()));
            }
        });
        if (aVarO4 != null) {
            return aVarO4;
        }
        e.a aVarO5 = o(charSequence, "':'", i14 + 12, new Function1() { // from class: ju.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(kotlin.time.d.u(((Character) obj).charValue()));
            }
        });
        if (aVarO5 != null) {
            return aVarO5;
        }
        for (int i18 : b) {
            e.a aVarO6 = o(charSequence, "an ASCII digit", i18 + i14, new Function1() { // from class: ju.j
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(kotlin.time.d.q(((Character) obj).charValue()));
                }
            });
            if (aVarO6 != null) {
                return aVarO6;
            }
        }
        int iW = w(charSequence, i14 + 1);
        int iW2 = w(charSequence, i14 + 4);
        int iW3 = w(charSequence, i14 + 7);
        int iW4 = w(charSequence, i14 + 10);
        int iW5 = w(charSequence, i14 + 13);
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
                return v(charSequence, "1..9 digits are supported for the fraction of the second, got " + i20 + " digits");
            }
            i11 = iCharAt2 * f22687a[9 - i20];
        } else {
            i11 = 0;
        }
        if (i19 >= charSequence.length()) {
            return v(charSequence, "The UTC offset at the end of the string is missing");
        }
        char cCharAt4 = charSequence.charAt(i19);
        if (cCharAt4 == '+' || cCharAt4 == '-') {
            int length = charSequence.length() - i19;
            if (length > 9) {
                return v(charSequence, "The UTC offset string \"" + x(charSequence.subSequence(i19, charSequence.length()).toString(), 16) + "\" is too long");
            }
            if (length % 3 != 0) {
                return v(charSequence, "Invalid UTC offset string \"" + charSequence.subSequence(i19, charSequence.length()).toString() + '\"');
            }
            for (int i21 : f22688c) {
                int i22 = i19 + i21;
                if (i22 >= charSequence.length()) {
                    break;
                }
                if (charSequence.charAt(i22) != ':') {
                    return v(charSequence, "Expected ':' at index " + i22 + ", got '" + charSequence.charAt(i22) + '\'');
                }
            }
            int[] iArr = f22689d;
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
                    return v(charSequence, "Expected an ASCII digit at index " + i24 + ", got '" + charSequence.charAt(i24) + '\'');
                }
                i23++;
                iArr = iArr2;
            }
            int iW6 = w(charSequence, i19 + 1);
            i12 = 3;
            int iW7 = length > 3 ? w(charSequence, i19 + 4) : 0;
            int iW8 = length > 6 ? w(charSequence, i19 + 7) : 0;
            if (iW7 > 59) {
                return v(charSequence, "Expected offset-minute-of-hour in 0..59, got " + iW7);
            }
            if (iW8 > 59) {
                return v(charSequence, "Expected offset-second-of-minute in 0..59, got " + iW8);
            }
            if (iW6 > 17 && (iW6 != 18 || iW7 != 0 || iW8 != 0)) {
                return v(charSequence, "Expected an offset in -18:00..+18:00, got " + charSequence.subSequence(i19, charSequence.length()).toString());
            }
            i13 = (cCharAt4 == '-' ? -1 : 1) * ((iW6 * 3600) + (iW7 * 60) + iW8);
        } else {
            if (cCharAt4 != 'Z' && cCharAt4 != 'z') {
                return v(charSequence, "Expected the UTC offset at position " + i19 + ", got '" + cCharAt4 + '\'');
            }
            int i25 = i19 + 1;
            if (charSequence.length() != i25) {
                return v(charSequence, "Extra text after the instant at position " + i25);
            }
            i13 = 0;
            i12 = 3;
        }
        if (1 > iW || iW >= 13) {
            return v(charSequence, "Expected a month number in 1..12, got " + iW);
        }
        if (1 > iW2 || iW2 > m(iW, l(i16))) {
            return v(charSequence, "Expected a valid day-of-month for month " + iW + " of year " + i16 + ", got " + iW2);
        }
        if (iW3 > 23) {
            return v(charSequence, "Expected hour in 0..23, got " + iW3);
        }
        if (iW4 > 59) {
            return v(charSequence, "Expected minute-of-hour in 0..59, got " + iW4);
        }
        if (iW5 > 59) {
            return v(charSequence, "Expected second-of-minute in 0..59, got " + iW5);
        }
        f fVar = new f(i16, iW, iW2, iW3, iW4, iW5, i11);
        long jG = fVar.getYear();
        long j10 = ((long) 365) * jG;
        long jD = (jG >= 0 ? j10 + (((((long) i12) + jG) / ((long) 4)) - ((((long) 99) + jG) / ((long) 100))) + ((jG + ((long) 399)) / ((long) 400)) : j10 - (((jG / ((long) (-4))) - (jG / ((long) (-100)))) + (jG / ((long) (-400))))) + ((long) (((fVar.getMonth() * 367) - 362) / 12)) + ((long) (fVar.getDay() - 1));
        if (fVar.getMonth() > 2) {
            jD = !l(fVar.getYear()) ? jD - 2 : (-1) + jD;
        }
        return new e.b((((jD - ((long) 719528)) * ((long) 86400)) + ((long) (((fVar.getHour() * 3600) + (fVar.getMinute() * 60)) + fVar.getSecond()))) - ((long) i13), fVar.getNanosecond());
    }

    public static final e.a o(CharSequence charSequence, String str, int i10, Function1<? super Character, Boolean> function1) {
        char cCharAt = charSequence.charAt(i10);
        if (function1.invoke(Character.valueOf(cCharAt)).booleanValue()) {
            return null;
        }
        return v(charSequence, "Expected " + str + ", but got '" + cCharAt + "' at position " + i10);
    }

    public static final boolean p(char c10) {
        return c10 == '-';
    }

    public static final boolean q(char c10) {
        return '0' <= c10 && c10 < ':';
    }

    public static final boolean r(char c10) {
        return c10 == '-';
    }

    public static final boolean s(char c10) {
        return c10 == 'T' || c10 == 't';
    }

    public static final boolean t(char c10) {
        return c10 == ':';
    }

    public static final boolean u(char c10) {
        return c10 == ':';
    }

    public static final e.a v(CharSequence charSequence, String str) {
        return new e.a(str + " when parsing an Instant from \"" + x(charSequence, 64) + '\"', charSequence);
    }

    public static final int w(CharSequence charSequence, int i10) {
        return ((charSequence.charAt(i10) - '0') * 10) + (charSequence.charAt(i10 + 1) - '0');
    }

    public static final String x(CharSequence charSequence, int i10) {
        if (charSequence.length() <= i10) {
            return charSequence.toString();
        }
        return charSequence.subSequence(0, i10).toString() + "...";
    }
}
