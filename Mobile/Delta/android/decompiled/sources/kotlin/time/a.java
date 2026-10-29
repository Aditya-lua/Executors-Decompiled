package kotlin.time;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.internal.http2.Http2Connection;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b&\b\u0087@\u0018\u0000 Y2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u00017B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0011\u0010\u0005J\u0018\u0010\u0012\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0018\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0018\u0010\u0013J\u0018\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001cH\u0086\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u000b¢\u0006\u0004\b\u001f\u0010\u000fJ\r\u0010 \u001a\u00020\u000b¢\u0006\u0004\b \u0010\u000fJ\r\u0010!\u001a\u00020\u000b¢\u0006\u0004\b!\u0010\u000fJ\r\u0010\"\u001a\u00020\u000b¢\u0006\u0004\b\"\u0010\u000fJ\u0018\u0010#\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b#\u0010$J\u0015\u0010'\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\u0015\u0010)\u001a\u00020\u00022\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b)\u0010*J\u000f\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b,\u0010-J?\u00105\u001a\u000204*\u00060.j\u0002`/2\u0006\u00100\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u00062\u0006\u00102\u001a\u00020\u00062\u0006\u0010&\u001a\u00020+2\u0006\u00103\u001a\u00020\u000bH\u0002¢\u0006\u0004\b5\u00106R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010\u001fR\u0014\u00109\u001a\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b8\u0010\u0005R\u0014\u0010<\u001a\u00020%8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0011\u0010>\u001a\u00020\u00008F¢\u0006\u0006\u001a\u0004\b=\u0010\u0005R\u001a\u0010C\u001a\u00020\u00068@X\u0081\u0004¢\u0006\f\u0012\u0004\bA\u0010B\u001a\u0004\b?\u0010@R\u001a\u0010F\u001a\u00020\u00068@X\u0081\u0004¢\u0006\f\u0012\u0004\bE\u0010B\u001a\u0004\bD\u0010@R\u001a\u0010I\u001a\u00020\u00068@X\u0081\u0004¢\u0006\f\u0012\u0004\bH\u0010B\u001a\u0004\bG\u0010@R\u001a\u0010L\u001a\u00020\u00068@X\u0081\u0004¢\u0006\f\u0012\u0004\bK\u0010B\u001a\u0004\bJ\u0010@R\u0011\u0010N\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bM\u0010\u0005R\u0011\u0010P\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bO\u0010\u0005R\u0011\u0010R\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bQ\u0010\u0005R\u0011\u0010T\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bS\u0010\u0005R\u0011\u0010V\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bU\u0010\u0005R\u0011\u0010X\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bW\u0010\u0005\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006Z"}, d2 = {"Lkotlin/time/a;", "", "", "rawValue", "l", "(J)J", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "H", "(J)Z", "G", "S", "M", "(JJ)J", "thisMillis", "otherNanos", "c", "(JJJ)J", "L", "scale", "O", "(JI)J", "", "N", "(JD)J", "J", "K", "I", "F", "j", "(JJ)I", "Lju/b;", "unit", "P", "(JLju/b;)D", "Q", "(JLju/b;)J", "", "R", "(J)Ljava/lang/String;", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "whole", "fractional", "fractionalSize", "isoZeroes", "", "d", "(JLjava/lang/StringBuilder;IIILjava/lang/String;Z)V", "a", "D", "value", "C", "(J)Lju/b;", "storageUnit", "q", "absoluteValue", "r", "(J)I", "getHoursComponent$annotations", "()V", "hoursComponent", "z", "getMinutesComponent$annotations", "minutesComponent", "B", "getSecondsComponent$annotations", "secondsComponent", "A", "getNanosecondsComponent$annotations", "nanosecondsComponent", "s", "inWholeDays", "u", "inWholeHours", "x", "inWholeMinutes", "y", "inWholeSeconds", "w", "inWholeMilliseconds", "v", "inWholeMicroseconds", "b", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements Comparable<a> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f22679c = l(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f22680d = b.i(4611686018427387903L);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f22681e = b.i(-4611686018427387903L);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final long rawValue;

    /* JADX INFO: renamed from: kotlin.time.a$a, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Lkotlin/time/a$a;", "", "<init>", "()V", "Lkotlin/time/a;", "ZERO", "J", "b", "()J", "INFINITE", "a", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return a.f22680d;
        }

        public final long b() {
            return a.f22679c;
        }

        public Companion() {
        }
    }

    public /* synthetic */ a(long j10) {
        this.rawValue = j10;
    }

    public static final int A(long j10) {
        if (I(j10)) {
            return 0;
        }
        return (int) (G(j10) ? b.m(D(j10) % ((long) 1000)) : D(j10) % ((long) Http2Connection.DEGRADED_PONG_TIMEOUT_NS));
    }

    public static final int B(long j10) {
        if (I(j10)) {
            return 0;
        }
        return (int) (y(j10) % ((long) 60));
    }

    public static final ju.b C(long j10) {
        return H(j10) ? ju.b.NANOSECONDS : ju.b.MILLISECONDS;
    }

    public static final long D(long j10) {
        return j10 >> 1;
    }

    public static int E(long j10) {
        return Long.hashCode(j10);
    }

    public static final boolean F(long j10) {
        return !I(j10);
    }

    public static final boolean G(long j10) {
        return (((int) j10) & 1) == 1;
    }

    public static final boolean H(long j10) {
        return (((int) j10) & 1) == 0;
    }

    public static final boolean I(long j10) {
        return j10 == f22680d || j10 == f22681e;
    }

    public static final boolean J(long j10) {
        return j10 < 0;
    }

    public static final boolean K(long j10) {
        return j10 > 0;
    }

    public static final long L(long j10, long j11) {
        return M(j10, S(j11));
    }

    public static final long M(long j10, long j11) {
        if (I(j10)) {
            if (F(j11) || (j11 ^ j10) >= 0) {
                return j10;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (I(j11)) {
            return j11;
        }
        if ((((int) j10) & 1) != (((int) j11) & 1)) {
            return G(j10) ? c(j10, D(j10), D(j11)) : c(j10, D(j11), D(j10));
        }
        long jD = D(j10) + D(j11);
        return H(j10) ? b.l(jD) : b.j(jD);
    }

    public static final long N(long j10, double d10) {
        int iC = cu.b.c(d10);
        if (iC == d10) {
            return O(j10, iC);
        }
        ju.b bVarC = C(j10);
        return b.o(P(j10, bVarC) * d10, bVarC);
    }

    public static final long O(long j10, int i10) {
        if (I(j10)) {
            if (i10 != 0) {
                return i10 > 0 ? j10 : S(j10);
            }
            throw new IllegalArgumentException("Multiplying infinite duration by zero yields an undefined result.");
        }
        if (i10 == 0) {
            return f22679c;
        }
        long jD = D(j10);
        long j11 = i10;
        long j12 = jD * j11;
        if (!H(j10)) {
            if (j12 / j11 == jD) {
                return b.i(kotlin.ranges.d.l(j12, new kotlin.ranges.c(-4611686018427387903L, 4611686018427387903L)));
            }
            return cu.b.b(jD) * cu.b.a(i10) > 0 ? f22680d : f22681e;
        }
        if (-2147483647L <= jD && jD < 2147483648L) {
            return b.k(j12);
        }
        if (j12 / j11 == jD) {
            return b.l(j12);
        }
        long jN = b.n(jD);
        long j13 = jN * j11;
        long jN2 = b.n((jD - b.m(jN)) * j11) + j13;
        if (j13 / j11 != jN || (jN2 ^ j13) < 0) {
            return cu.b.b(jD) * cu.b.a(i10) > 0 ? f22680d : f22681e;
        }
        return b.i(kotlin.ranges.d.l(jN2, new kotlin.ranges.c(-4611686018427387903L, 4611686018427387903L)));
    }

    public static final double P(long j10, @NotNull ju.b unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (j10 == f22680d) {
            return Double.POSITIVE_INFINITY;
        }
        if (j10 == f22681e) {
            return Double.NEGATIVE_INFINITY;
        }
        return ju.c.a(D(j10), C(j10), unit);
    }

    public static final long Q(long j10, @NotNull ju.b unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (j10 == f22680d) {
            return Long.MAX_VALUE;
        }
        if (j10 == f22681e) {
            return Long.MIN_VALUE;
        }
        return ju.c.b(D(j10), C(j10), unit);
    }

    @NotNull
    public static String R(long j10) {
        if (j10 == 0) {
            return "0s";
        }
        if (j10 == f22680d) {
            return "Infinity";
        }
        if (j10 == f22681e) {
            return "-Infinity";
        }
        boolean zJ = J(j10);
        StringBuilder sb2 = new StringBuilder();
        if (zJ) {
            sb2.append('-');
        }
        long jQ = q(j10);
        long jS = s(jQ);
        int iR = r(jQ);
        int iZ = z(jQ);
        int iB = B(jQ);
        int iA = A(jQ);
        int i10 = 0;
        boolean z10 = jS != 0;
        boolean z11 = iR != 0;
        boolean z12 = iZ != 0;
        boolean z13 = (iB == 0 && iA == 0) ? false : true;
        if (z10) {
            sb2.append(jS);
            sb2.append('d');
            i10 = 1;
        }
        if (z11 || (z10 && (z12 || z13))) {
            int i11 = i10 + 1;
            if (i10 > 0) {
                sb2.append(' ');
            }
            sb2.append(iR);
            sb2.append('h');
            i10 = i11;
        }
        if (z12 || (z13 && (z11 || z10))) {
            int i12 = i10 + 1;
            if (i10 > 0) {
                sb2.append(' ');
            }
            sb2.append(iZ);
            sb2.append('m');
            i10 = i12;
        }
        if (z13) {
            int i13 = i10 + 1;
            if (i10 > 0) {
                sb2.append(' ');
            }
            if (iB != 0 || z10 || z11 || z12) {
                d(j10, sb2, iB, iA, 9, "s", false);
            } else if (iA >= 1000000) {
                d(j10, sb2, iA / 1000000, iA % 1000000, 6, "ms", false);
            } else if (iA >= 1000) {
                d(j10, sb2, iA / 1000, iA % 1000, 3, "us", false);
            } else {
                sb2.append(iA);
                sb2.append("ns");
            }
            i10 = i13;
        }
        if (zJ && i10 > 1) {
            sb2.insert(1, '(').append(')');
        }
        return sb2.toString();
    }

    public static final long S(long j10) {
        return b.h(-D(j10), ((int) j10) & 1);
    }

    public static final long c(long j10, long j11, long j12) {
        long jN = b.n(j12);
        long j13 = j11 + jN;
        if (-4611686018426L > j13 || j13 >= 4611686018427L) {
            return b.i(kotlin.ranges.d.k(j13, -4611686018427387903L, 4611686018427387903L));
        }
        return b.k(b.m(j13) + (j12 - b.m(jN)));
    }

    public static final void d(long j10, StringBuilder sb2, int i10, int i11, int i12, String str, boolean z10) {
        sb2.append(i10);
        if (i11 != 0) {
            sb2.append('.');
            String strY0 = StringsKt.y0(String.valueOf(i11), i12, '0');
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

    public static final /* synthetic */ a e(long j10) {
        return new a(j10);
    }

    public static int j(long j10, long j11) {
        long j12 = j10 ^ j11;
        if (j12 < 0 || (((int) j12) & 1) == 0) {
            return Intrinsics.g(j10, j11);
        }
        int i10 = (((int) j10) & 1) - (((int) j11) & 1);
        return J(j10) ? -i10 : i10;
    }

    public static long l(long j10) {
        if (!ju.a.a()) {
            return j10;
        }
        if (H(j10)) {
            long jD = D(j10);
            if (-4611686018426999999L <= jD && jD < 4611686018427000000L) {
                return j10;
            }
            throw new AssertionError(D(j10) + " ns is out of nanoseconds range");
        }
        long jD2 = D(j10);
        if (-4611686018427387903L > jD2 || jD2 >= 4611686018427387904L) {
            throw new AssertionError(D(j10) + " ms is out of milliseconds range");
        }
        long jD3 = D(j10);
        if (-4611686018426L > jD3 || jD3 >= 4611686018427L) {
            return j10;
        }
        throw new AssertionError(D(j10) + " ms is denormalized");
    }

    public static boolean n(long j10, Object obj) {
        return (obj instanceof a) && j10 == ((a) obj).getRawValue();
    }

    public static final boolean o(long j10, long j11) {
        return j10 == j11;
    }

    public static final long q(long j10) {
        return J(j10) ? S(j10) : j10;
    }

    public static final int r(long j10) {
        if (I(j10)) {
            return 0;
        }
        return (int) (u(j10) % ((long) 24));
    }

    public static final long s(long j10) {
        return Q(j10, ju.b.DAYS);
    }

    public static final long u(long j10) {
        return Q(j10, ju.b.HOURS);
    }

    public static final long v(long j10) {
        return Q(j10, ju.b.MICROSECONDS);
    }

    public static final long w(long j10) {
        return (G(j10) && F(j10)) ? D(j10) : Q(j10, ju.b.MILLISECONDS);
    }

    public static final long x(long j10) {
        return Q(j10, ju.b.MINUTES);
    }

    public static final long y(long j10) {
        return Q(j10, ju.b.SECONDS);
    }

    public static final int z(long j10) {
        if (I(j10)) {
            return 0;
        }
        return (int) (x(j10) % ((long) 60));
    }

    /* JADX INFO: renamed from: T, reason: from getter */
    public final /* synthetic */ long getRawValue() {
        return this.rawValue;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(a aVar) {
        return h(aVar.getRawValue());
    }

    public boolean equals(Object other) {
        return n(this.rawValue, other);
    }

    public int h(long j10) {
        return j(this.rawValue, j10);
    }

    public int hashCode() {
        return E(this.rawValue);
    }

    @NotNull
    public String toString() {
        return R(this.rawValue);
    }
}
