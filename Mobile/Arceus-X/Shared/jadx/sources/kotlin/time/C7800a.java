package kotlin.time;

import cu.C4366b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C7763c;
import kotlin.ranges.C7764d;
import kotlin.text.StringsKt;
import okhttp3.internal.http2.Http2Connection;
import org.jetbrains.annotations.NotNull;
import p230ju.C7360a;
import p230ju.C7362c;
import p230ju.EnumC7361b;

/* JADX INFO: renamed from: kotlin.time.a */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b&\b\u0087@\u0018\u0000 Y2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u00017B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0011\u0010\u0005J\u0018\u0010\u0012\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0018\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0018\u0010\u0013J\u0018\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001cH\u0086\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u000b¢\u0006\u0004\b\u001f\u0010\u000fJ\r\u0010 \u001a\u00020\u000b¢\u0006\u0004\b \u0010\u000fJ\r\u0010!\u001a\u00020\u000b¢\u0006\u0004\b!\u0010\u000fJ\r\u0010\"\u001a\u00020\u000b¢\u0006\u0004\b\"\u0010\u000fJ\u0018\u0010#\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b#\u0010$J\u0015\u0010'\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\u0015\u0010)\u001a\u00020\u00022\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b)\u0010*J\u000f\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b,\u0010-J?\u00105\u001a\u000204*\u00060.j\u0002`/2\u0006\u00100\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u00062\u0006\u00102\u001a\u00020\u00062\u0006\u0010&\u001a\u00020+2\u0006\u00103\u001a\u00020\u000bH\u0002¢\u0006\u0004\b5\u00106R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010\u001fR\u0014\u00109\u001a\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b8\u0010\u0005R\u0014\u0010<\u001a\u00020%8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0011\u0010>\u001a\u00020\u00008F¢\u0006\u0006\u001a\u0004\b=\u0010\u0005R\u001a\u0010C\u001a\u00020\u00068@X\u0081\u0004¢\u0006\f\u0012\u0004\bA\u0010B\u001a\u0004\b?\u0010@R\u001a\u0010F\u001a\u00020\u00068@X\u0081\u0004¢\u0006\f\u0012\u0004\bE\u0010B\u001a\u0004\bD\u0010@R\u001a\u0010I\u001a\u00020\u00068@X\u0081\u0004¢\u0006\f\u0012\u0004\bH\u0010B\u001a\u0004\bG\u0010@R\u001a\u0010L\u001a\u00020\u00068@X\u0081\u0004¢\u0006\f\u0012\u0004\bK\u0010B\u001a\u0004\bJ\u0010@R\u0011\u0010N\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bM\u0010\u0005R\u0011\u0010P\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bO\u0010\u0005R\u0011\u0010R\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bQ\u0010\u0005R\u0011\u0010T\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bS\u0010\u0005R\u0011\u0010V\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bU\u0010\u0005R\u0011\u0010X\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bW\u0010\u0005\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006Z"}, m31665d2 = {"Lkotlin/time/a;", "", "", "rawValue", "l", "(J)J", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "H", "(J)Z", "G", "S", "M", "(JJ)J", "thisMillis", "otherNanos", "c", "(JJJ)J", "L", "scale", "O", "(JI)J", "", "N", "(JD)J", "J", "K", "I", "F", "j", "(JJ)I", "Lju/b;", "unit", "P", "(JLju/b;)D", "Q", "(JLju/b;)J", "", "R", "(J)Ljava/lang/String;", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "whole", "fractional", "fractionalSize", "isoZeroes", "", "d", "(JLjava/lang/StringBuilder;IIILjava/lang/String;Z)V", "a", "D", "value", "C", "(J)Lju/b;", "storageUnit", "q", "absoluteValue", "r", "(J)I", "getHoursComponent$annotations", "()V", "hoursComponent", "z", "getMinutesComponent$annotations", "minutesComponent", "B", "getSecondsComponent$annotations", "secondsComponent", "A", "getNanosecondsComponent$annotations", "nanosecondsComponent", "s", "inWholeDays", "u", "inWholeHours", "x", "inWholeMinutes", "y", "inWholeSeconds", "w", "inWholeMilliseconds", "v", "inWholeMicroseconds", "b", "kotlin-stdlib"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C7800a implements Comparable<C7800a> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c */
    public static final long f29585c = m32340l(0);

    /* JADX INFO: renamed from: d */
    public static final long f29586d = C7801b.m32364i(4611686018427387903L);

    /* JADX INFO: renamed from: e */
    public static final long f29587e = C7801b.m32364i(-4611686018427387903L);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final long rawValue;

    /* JADX INFO: renamed from: kotlin.time.a$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, m31665d2 = {"Lkotlin/time/a$a;", "", "<init>", "()V", "Lkotlin/time/a;", "ZERO", "J", "b", "()J", "INFINITE", "a", "kotlin-stdlib"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: kotlin.time.a.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final long m32354a() {
            return C7800a.f29586d;
        }

        /* JADX INFO: renamed from: b */
        public final long m32355b() {
            return C7800a.f29585c;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
        }
    }

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [kotlin.time.a.e(long):kotlin.time.a] */
    public /* synthetic */ C7800a(long j10) {
        this.rawValue = j10;
    }

    /* JADX INFO: renamed from: A */
    public static final int m32315A(long j10) {
        if (m32323I(j10)) {
            return 0;
        }
        return (int) (m32321G(j10) ? C7801b.m32368m(m32318D(j10) % ((long) 1000)) : m32318D(j10) % ((long) Http2Connection.DEGRADED_PONG_TIMEOUT_NS));
    }

    /* JADX INFO: renamed from: B */
    public static final int m32316B(long j10) {
        if (m32323I(j10)) {
            return 0;
        }
        return (int) (m32350y(j10) % ((long) 60));
    }

    /* JADX INFO: renamed from: C */
    public static final EnumC7361b m32317C(long j10) {
        return m32322H(j10) ? EnumC7361b.NANOSECONDS : EnumC7361b.MILLISECONDS;
    }

    /* JADX INFO: renamed from: D */
    public static final long m32318D(long j10) {
        return j10 >> 1;
    }

    /* JADX INFO: renamed from: E */
    public static int m32319E(long j10) {
        return Long.hashCode(j10);
    }

    /* JADX INFO: renamed from: F */
    public static final boolean m32320F(long j10) {
        return !m32323I(j10);
    }

    /* JADX INFO: renamed from: G */
    public static final boolean m32321G(long j10) {
        return (((int) j10) & 1) == 1;
    }

    /* JADX INFO: renamed from: H */
    public static final boolean m32322H(long j10) {
        return (((int) j10) & 1) == 0;
    }

    /* JADX INFO: renamed from: I */
    public static final boolean m32323I(long j10) {
        return j10 == f29586d || j10 == f29587e;
    }

    /* JADX INFO: renamed from: J */
    public static final boolean m32324J(long j10) {
        return j10 < 0;
    }

    /* JADX INFO: renamed from: K */
    public static final boolean m32325K(long j10) {
        return j10 > 0;
    }

    /* JADX INFO: renamed from: L */
    public static final long m32326L(long j10, long j11) {
        return m32327M(j10, m32333S(j11));
    }

    /* JADX INFO: renamed from: M */
    public static final long m32327M(long j10, long j11) {
        if (m32323I(j10)) {
            if (m32320F(j11) || (j11 ^ j10) >= 0) {
                return j10;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (m32323I(j11)) {
            return j11;
        }
        if ((((int) j10) & 1) != (((int) j11) & 1)) {
            return m32321G(j10) ? m32336c(j10, m32318D(j10), m32318D(j11)) : m32336c(j10, m32318D(j11), m32318D(j10));
        }
        long jM32318D = m32318D(j10) + m32318D(j11);
        return m32322H(j10) ? C7801b.m32367l(jM32318D) : C7801b.m32365j(jM32318D);
    }

    /* JADX INFO: renamed from: N */
    public static final long m32328N(long j10, double d10) {
        int iM22015c = C4366b.m22015c(d10);
        if (iM22015c == d10) {
            return m32329O(j10, iM22015c);
        }
        EnumC7361b enumC7361bM32317C = m32317C(j10);
        return C7801b.m32370o(m32330P(j10, enumC7361bM32317C) * d10, enumC7361bM32317C);
    }

    /* JADX INFO: renamed from: O */
    public static final long m32329O(long j10, int i10) {
        if (m32323I(j10)) {
            if (i10 != 0) {
                return i10 > 0 ? j10 : m32333S(j10);
            }
            throw new IllegalArgumentException("Multiplying infinite duration by zero yields an undefined result.");
        }
        if (i10 == 0) {
            return f29585c;
        }
        long jM32318D = m32318D(j10);
        long j11 = i10;
        long j12 = jM32318D * j11;
        if (!m32322H(j10)) {
            if (j12 / j11 == jM32318D) {
                return C7801b.m32364i(C7764d.m32087l(j12, new C7763c(-4611686018427387903L, 4611686018427387903L)));
            }
            return C4366b.m22014b(jM32318D) * C4366b.m22013a(i10) > 0 ? f29586d : f29587e;
        }
        if (-2147483647L <= jM32318D && jM32318D < 2147483648L) {
            return C7801b.m32366k(j12);
        }
        if (j12 / j11 == jM32318D) {
            return C7801b.m32367l(j12);
        }
        long jM32369n = C7801b.m32369n(jM32318D);
        long j13 = jM32369n * j11;
        long jM32369n2 = C7801b.m32369n((jM32318D - C7801b.m32368m(jM32369n)) * j11) + j13;
        if (j13 / j11 != jM32369n || (jM32369n2 ^ j13) < 0) {
            return C4366b.m22014b(jM32318D) * C4366b.m22013a(i10) > 0 ? f29586d : f29587e;
        }
        return C7801b.m32364i(C7764d.m32087l(jM32369n2, new C7763c(-4611686018427387903L, 4611686018427387903L)));
    }

    /* JADX INFO: renamed from: P */
    public static final double m32330P(long j10, @NotNull EnumC7361b unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (j10 == f29586d) {
            return Double.POSITIVE_INFINITY;
        }
        if (j10 == f29587e) {
            return Double.NEGATIVE_INFINITY;
        }
        return C7362c.m30535a(m32318D(j10), m32317C(j10), unit);
    }

    /* JADX INFO: renamed from: Q */
    public static final long m32331Q(long j10, @NotNull EnumC7361b unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (j10 == f29586d) {
            return Long.MAX_VALUE;
        }
        if (j10 == f29587e) {
            return Long.MIN_VALUE;
        }
        return C7362c.m30536b(m32318D(j10), m32317C(j10), unit);
    }

    @NotNull
    /* JADX INFO: renamed from: R */
    public static String m32332R(long j10) {
        if (j10 == 0) {
            return "0s";
        }
        if (j10 == f29586d) {
            return "Infinity";
        }
        if (j10 == f29587e) {
            return "-Infinity";
        }
        boolean zM32324J = m32324J(j10);
        StringBuilder sb2 = new StringBuilder();
        if (zM32324J) {
            sb2.append('-');
        }
        long jM32343q = m32343q(j10);
        long jM32345s = m32345s(jM32343q);
        int iM32344r = m32344r(jM32343q);
        int iM32351z = m32351z(jM32343q);
        int iM32316B = m32316B(jM32343q);
        int iM32315A = m32315A(jM32343q);
        int i10 = 0;
        boolean z10 = jM32345s != 0;
        boolean z11 = iM32344r != 0;
        boolean z12 = iM32351z != 0;
        boolean z13 = (iM32316B == 0 && iM32315A == 0) ? false : true;
        if (z10) {
            sb2.append(jM32345s);
            sb2.append('d');
            i10 = 1;
        }
        if (z11 || (z10 && (z12 || z13))) {
            int i11 = i10 + 1;
            if (i10 > 0) {
                sb2.append(' ');
            }
            sb2.append(iM32344r);
            sb2.append('h');
            i10 = i11;
        }
        if (z12 || (z13 && (z11 || z10))) {
            int i12 = i10 + 1;
            if (i10 > 0) {
                sb2.append(' ');
            }
            sb2.append(iM32351z);
            sb2.append('m');
            i10 = i12;
        }
        if (z13) {
            int i13 = i10 + 1;
            if (i10 > 0) {
                sb2.append(' ');
            }
            if (iM32316B != 0 || z10 || z11 || z12) {
                m32337d(j10, sb2, iM32316B, iM32315A, 9, "s", false);
            } else if (iM32315A >= 1000000) {
                m32337d(j10, sb2, iM32315A / 1000000, iM32315A % 1000000, 6, "ms", false);
            } else if (iM32315A >= 1000) {
                m32337d(j10, sb2, iM32315A / 1000, iM32315A % 1000, 3, "us", false);
            } else {
                sb2.append(iM32315A);
                sb2.append("ns");
            }
            i10 = i13;
        }
        if (zM32324J && i10 > 1) {
            sb2.insert(1, '(').append(')');
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: S */
    public static final long m32333S(long j10) {
        return C7801b.m32363h(-m32318D(j10), ((int) j10) & 1);
    }

    /* JADX INFO: renamed from: c */
    public static final long m32336c(long j10, long j11, long j12) {
        long jM32369n = C7801b.m32369n(j12);
        long j13 = j11 + jM32369n;
        if (-4611686018426L > j13 || j13 >= 4611686018427L) {
            return C7801b.m32364i(C7764d.m32086k(j13, -4611686018427387903L, 4611686018427387903L));
        }
        return C7801b.m32366k(C7801b.m32368m(j13) + (j12 - C7801b.m32368m(jM32369n)));
    }

    /* JADX INFO: renamed from: d */
    public static final void m32337d(long j10, StringBuilder sb2, int i10, int i11, int i12, String str, boolean z10) {
        sb2.append(i10);
        if (i11 != 0) {
            sb2.append('.');
            String strY0 = StringsKt.m32195y0(String.valueOf(i11), i12, '0');
            int i13 = -1;
            int length = strY0.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i14 = length - 1;
                    if (strY0.charAt(length) != '0') {
                        i13 = length;
                        break;
                    } else if (i14 < 0) {
                        break;
                    } else {
                        length = i14;
                    }
                }
            }
            int i15 = i13 + 1;
            if (z10 || i15 >= 3) {
                sb2.append((CharSequence) strY0, 0, ((i13 + 3) / 3) * 3);
                Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            } else {
                sb2.append((CharSequence) strY0, 0, i15);
                Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            }
        }
        sb2.append(str);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR (r1v0 long) A[MD:(long):void (m)] call: kotlin.time.a.<init>(long):void type: CONSTRUCTOR */
    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ C7800a m32338e(long j10) {
        return new C7800a(j10);
    }

    /* JADX INFO: renamed from: j */
    public static int m32339j(long j10, long j11) {
        long j12 = j10 ^ j11;
        if (j12 < 0 || (((int) j12) & 1) == 0) {
            return Intrinsics.m31984g(j10, j11);
        }
        int i10 = (((int) j10) & 1) - (((int) j11) & 1);
        return m32324J(j10) ? -i10 : i10;
    }

    /* JADX INFO: renamed from: l */
    public static long m32340l(long j10) {
        if (!C7360a.m30532a()) {
            return j10;
        }
        if (m32322H(j10)) {
            long jM32318D = m32318D(j10);
            if (-4611686018426999999L <= jM32318D && jM32318D < 4611686018427000000L) {
                return j10;
            }
            throw new AssertionError(m32318D(j10) + " ns is out of nanoseconds range");
        }
        long jM32318D2 = m32318D(j10);
        if (-4611686018427387903L > jM32318D2 || jM32318D2 >= 4611686018427387904L) {
            throw new AssertionError(m32318D(j10) + " ms is out of milliseconds range");
        }
        long jM32318D3 = m32318D(j10);
        if (-4611686018426L > jM32318D3 || jM32318D3 >= 4611686018427L) {
            return j10;
        }
        throw new AssertionError(m32318D(j10) + " ms is denormalized");
    }

    /* JADX INFO: renamed from: n */
    public static boolean m32341n(long j10, Object obj) {
        return (obj instanceof C7800a) && j10 == ((C7800a) obj).getRawValue();
    }

    /* JADX INFO: renamed from: o */
    public static final boolean m32342o(long j10, long j11) {
        return j10 == j11;
    }

    /* JADX INFO: renamed from: q */
    public static final long m32343q(long j10) {
        return m32324J(j10) ? m32333S(j10) : j10;
    }

    /* JADX INFO: renamed from: r */
    public static final int m32344r(long j10) {
        if (m32323I(j10)) {
            return 0;
        }
        return (int) (m32346u(j10) % ((long) 24));
    }

    /* JADX INFO: renamed from: s */
    public static final long m32345s(long j10) {
        return m32331Q(j10, EnumC7361b.DAYS);
    }

    /* JADX INFO: renamed from: u */
    public static final long m32346u(long j10) {
        return m32331Q(j10, EnumC7361b.HOURS);
    }

    /* JADX INFO: renamed from: v */
    public static final long m32347v(long j10) {
        return m32331Q(j10, EnumC7361b.MICROSECONDS);
    }

    /* JADX INFO: renamed from: w */
    public static final long m32348w(long j10) {
        return (m32321G(j10) && m32320F(j10)) ? m32318D(j10) : m32331Q(j10, EnumC7361b.MILLISECONDS);
    }

    /* JADX INFO: renamed from: x */
    public static final long m32349x(long j10) {
        return m32331Q(j10, EnumC7361b.MINUTES);
    }

    /* JADX INFO: renamed from: y */
    public static final long m32350y(long j10) {
        return m32331Q(j10, EnumC7361b.SECONDS);
    }

    /* JADX INFO: renamed from: z */
    public static final int m32351z(long j10) {
        if (m32323I(j10)) {
            return 0;
        }
        return (int) (m32349x(j10) % ((long) 60));
    }

    /* JADX INFO: renamed from: T, reason: from getter */
    public final /* synthetic */ long getRawValue() {
        return this.rawValue;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(C7800a c7800a) {
        return m32353h(c7800a.getRawValue());
    }

    public boolean equals(Object other) {
        return m32341n(this.rawValue, other);
    }

    /* JADX INFO: renamed from: h */
    public int m32353h(long j10) {
        return m32339j(this.rawValue, j10);
    }

    public int hashCode() {
        return m32319E(this.rawValue);
    }

    @NotNull
    public String toString() {
        return m32332R(this.rawValue);
    }
}
