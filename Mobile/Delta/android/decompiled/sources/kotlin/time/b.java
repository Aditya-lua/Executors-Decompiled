package kotlin.time;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0012\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0007\u001a\u00020\u0003*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u001b\u0010\n\u001a\u00020\u0003*\u00020\t2\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u000e\u001a\u0017\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u000e\u001a\u0017\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u000e\u001a\u001f\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0017\u0010\u0019\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\u000e\u001a\u0017\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001a\u0010\u000e¨\u0006\u001b"}, d2 = {"", "Lju/b;", "unit", "Lkotlin/time/a;", "p", "(ILju/b;)J", "", "q", "(JLju/b;)J", "", "o", "(DLju/b;)J", "nanos", "n", "(J)J", "millis", "m", "normalNanos", "k", "normalMillis", "i", "normalValue", "unitDiscriminator", "h", "(JI)J", "l", "j", "kotlin-stdlib"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class b {
    public static final long h(long j10, int i10) {
        return a.l((j10 << 1) + ((long) i10));
    }

    public static final long i(long j10) {
        return a.l((j10 << 1) + 1);
    }

    public static final long j(long j10) {
        return (-4611686018426L > j10 || j10 >= 4611686018427L) ? i(kotlin.ranges.d.k(j10, -4611686018427387903L, 4611686018427387903L)) : k(m(j10));
    }

    public static final long k(long j10) {
        return a.l(j10 << 1);
    }

    public static final long l(long j10) {
        return (-4611686018426999999L > j10 || j10 >= 4611686018427000000L) ? i(n(j10)) : k(j10);
    }

    public static final long m(long j10) {
        return j10 * ((long) 1000000);
    }

    public static final long n(long j10) {
        return j10 / ((long) 1000000);
    }

    public static final long o(double d10, @NotNull ju.b unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        double dA = ju.c.a(d10, unit, ju.b.NANOSECONDS);
        if (Double.isNaN(dA)) {
            throw new IllegalArgumentException("Duration value cannot be NaN.");
        }
        long jE = cu.b.e(dA);
        return (-4611686018426999999L > jE || jE >= 4611686018427000000L) ? j(cu.b.e(ju.c.a(d10, unit, ju.b.MILLISECONDS))) : k(jE);
    }

    public static final long p(int i10, @NotNull ju.b unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return unit.compareTo(ju.b.SECONDS) <= 0 ? k(ju.c.c(i10, unit, ju.b.NANOSECONDS)) : q(i10, unit);
    }

    public static final long q(long j10, @NotNull ju.b unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        ju.b bVar = ju.b.NANOSECONDS;
        long jC = ju.c.c(4611686018426999999L, bVar, unit);
        return ((-jC) > j10 || j10 > jC) ? i(kotlin.ranges.d.k(ju.c.b(j10, unit, ju.b.MILLISECONDS), -4611686018427387903L, 4611686018427387903L)) : k(ju.c.c(j10, unit, bVar));
    }
}
