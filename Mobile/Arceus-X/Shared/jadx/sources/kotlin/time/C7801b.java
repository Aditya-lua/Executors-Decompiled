package kotlin.time;

import cu.C4366b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C7764d;
import org.jetbrains.annotations.NotNull;
import p230ju.C7362c;
import p230ju.EnumC7361b;

/* JADX INFO: renamed from: kotlin.time.b */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\"\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0012\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0007\u001a\u00020\u0003*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u001b\u0010\n\u001a\u00020\u0003*\u00020\t2\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u000e\u001a\u0017\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u000e\u001a\u0017\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u000e\u001a\u001f\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0017\u0010\u0019\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\u000e\u001a\u0017\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001a\u0010\u000e¨\u0006\u001b"}, m31665d2 = {"", "Lju/b;", "unit", "Lkotlin/time/a;", "p", "(ILju/b;)J", "", "q", "(JLju/b;)J", "", "o", "(DLju/b;)J", "nanos", "n", "(J)J", "millis", "m", "normalNanos", "k", "normalMillis", "i", "normalValue", "unitDiscriminator", "h", "(JI)J", "l", "j", "kotlin-stdlib"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C7801b {
    /* JADX INFO: renamed from: h */
    public static final long m32363h(long j10, int i10) {
        return C7800a.m32340l((j10 << 1) + ((long) i10));
    }

    /* JADX INFO: renamed from: i */
    public static final long m32364i(long j10) {
        return C7800a.m32340l((j10 << 1) + 1);
    }

    /* JADX INFO: renamed from: j */
    public static final long m32365j(long j10) {
        return (-4611686018426L > j10 || j10 >= 4611686018427L) ? m32364i(C7764d.m32086k(j10, -4611686018427387903L, 4611686018427387903L)) : m32366k(m32368m(j10));
    }

    /* JADX INFO: renamed from: k */
    public static final long m32366k(long j10) {
        return C7800a.m32340l(j10 << 1);
    }

    /* JADX INFO: renamed from: l */
    public static final long m32367l(long j10) {
        return (-4611686018426999999L > j10 || j10 >= 4611686018427000000L) ? m32364i(m32369n(j10)) : m32366k(j10);
    }

    /* JADX INFO: renamed from: m */
    public static final long m32368m(long j10) {
        return j10 * ((long) 1000000);
    }

    /* JADX INFO: renamed from: n */
    public static final long m32369n(long j10) {
        return j10 / ((long) 1000000);
    }

    /* JADX INFO: renamed from: o */
    public static final long m32370o(double d10, @NotNull EnumC7361b unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        double dM30535a = C7362c.m30535a(d10, unit, EnumC7361b.NANOSECONDS);
        if (Double.isNaN(dM30535a)) {
            throw new IllegalArgumentException("Duration value cannot be NaN.");
        }
        long jM22017e = C4366b.m22017e(dM30535a);
        return (-4611686018426999999L > jM22017e || jM22017e >= 4611686018427000000L) ? m32365j(C4366b.m22017e(C7362c.m30535a(d10, unit, EnumC7361b.MILLISECONDS))) : m32366k(jM22017e);
    }

    /* JADX INFO: renamed from: p */
    public static final long m32371p(int i10, @NotNull EnumC7361b unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return unit.compareTo(EnumC7361b.SECONDS) <= 0 ? m32366k(C7362c.m30537c(i10, unit, EnumC7361b.NANOSECONDS)) : m32372q(i10, unit);
    }

    /* JADX INFO: renamed from: q */
    public static final long m32372q(long j10, @NotNull EnumC7361b unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        EnumC7361b enumC7361b = EnumC7361b.NANOSECONDS;
        long jM30537c = C7362c.m30537c(4611686018426999999L, enumC7361b, unit);
        return ((-jM30537c) > j10 || j10 > jM30537c) ? m32364i(C7764d.m32086k(C7362c.m30536b(j10, unit, EnumC7361b.MILLISECONDS), -4611686018427387903L, 4611686018427387903L)) : m32366k(C7362c.m30537c(j10, unit, enumC7361b));
    }
}
