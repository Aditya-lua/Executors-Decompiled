package kotlin.ranges;

import eu.AbstractC5218d;
import eu.C5219e;
import gu.C6245e;
import gu.InterfaceC6241a;
import gu.InterfaceC6242b;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: kotlin.ranges.d */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001c\u0010\b\u001a\u00020\u0007*\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\u0086\u0004¢\u0006\u0004\b\b\u0010\t\u001a\u001c\u0010\u000b\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\n\u001a\u00020\u0003H\u0086\u0004¢\u0006\u0004\b\u000b\u0010\f\u001a\u001c\u0010\r\u001a\u00020\u0000*\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\u0086\u0004¢\u0006\u0004\b\r\u0010\u000e\u001a\u0019\u0010\u0010\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0003¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0019\u0010\u0013\u001a\u00020\u0012*\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0019\u0010\u0016\u001a\u00020\u0015*\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0019\u0010\u0019\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0003¢\u0006\u0004\b\u0019\u0010\u0011\u001a\u0019\u0010\u001a\u001a\u00020\u0012*\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0012¢\u0006\u0004\b\u001a\u0010\u0014\u001a\u0019\u0010\u001c\u001a\u00020\u001b*\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001d\u001a!\u0010\u001e\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0003¢\u0006\u0004\b\u001e\u0010\u001f\u001a!\u0010 \u001a\u00020\u0012*\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0012¢\u0006\u0004\b \u0010!\u001a!\u0010\"\u001a\u00020\u0015*\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0015¢\u0006\u0004\b\"\u0010#\u001a!\u0010$\u001a\u00020\u001b*\u00020\u001b2\u0006\u0010\u000f\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u001b¢\u0006\u0004\b$\u0010%\u001a1\u0010*\u001a\u00028\u0000\"\u000e\b\u0000\u0010'*\b\u0012\u0004\u0012\u00028\u00000&*\u00028\u00002\f\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000(H\u0007¢\u0006\u0004\b*\u0010+\u001a\u001f\u0010-\u001a\u00020\u0012*\u00020\u00122\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00120,¢\u0006\u0004\b-\u0010.¨\u0006/"}, m31665d2 = {"Lkotlin/ranges/IntRange;", "Leu/d;", "random", "", "o", "(Lkotlin/ranges/IntRange;Leu/d;)I", "to", "Lkotlin/ranges/a;", "n", "(II)Lkotlin/ranges/a;", "step", "p", "(Lkotlin/ranges/a;I)Lkotlin/ranges/a;", "q", "(II)Lkotlin/ranges/IntRange;", "minimumValue", "c", "(II)I", "", "d", "(JJ)J", "", "b", "(FF)F", "maximumValue", "f", "g", "", "e", "(DD)D", "j", "(III)I", "k", "(JJJ)J", "i", "(FFF)F", "h", "(DDD)D", "", "T", "Lgu/a;", "range", "m", "(Ljava/lang/Comparable;Lgu/a;)Ljava/lang/Comparable;", "Lgu/b;", "l", "(JLgu/b;)J", "kotlin-stdlib"}, m31666k = 5, m31667mv = {2, 2, 0}, m31669xi = 49, m31670xs = "kotlin/ranges/RangesKt")
public class C7764d extends C6245e {
    /* JADX INFO: renamed from: b */
    public static float m32077b(float f10, float f11) {
        return f10 < f11 ? f11 : f10;
    }

    /* JADX INFO: renamed from: c */
    public static int m32078c(int i10, int i11) {
        return i10 < i11 ? i11 : i10;
    }

    /* JADX INFO: renamed from: d */
    public static long m32079d(long j10, long j11) {
        return j10 < j11 ? j11 : j10;
    }

    /* JADX INFO: renamed from: e */
    public static double m32080e(double d10, double d11) {
        return d10 > d11 ? d11 : d10;
    }

    /* JADX INFO: renamed from: f */
    public static int m32081f(int i10, int i11) {
        return i10 > i11 ? i11 : i10;
    }

    /* JADX INFO: renamed from: g */
    public static long m32082g(long j10, long j11) {
        return j10 > j11 ? j11 : j10;
    }

    /* JADX INFO: renamed from: h */
    public static double m32083h(double d10, double d11, double d12) {
        if (d11 <= d12) {
            if (d10 < d11) {
                return d11;
            }
            return d10 > d12 ? d12 : d10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d12 + " is less than minimum " + d11 + '.');
    }

    /* JADX INFO: renamed from: i */
    public static float m32084i(float f10, float f11, float f12) {
        if (f11 <= f12) {
            if (f10 < f11) {
                return f11;
            }
            return f10 > f12 ? f12 : f10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f12 + " is less than minimum " + f11 + '.');
    }

    /* JADX INFO: renamed from: j */
    public static int m32085j(int i10, int i11, int i12) {
        if (i11 <= i12) {
            if (i10 < i11) {
                return i11;
            }
            return i10 > i12 ? i12 : i10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i12 + " is less than minimum " + i11 + '.');
    }

    /* JADX INFO: renamed from: k */
    public static long m32086k(long j10, long j11, long j12) {
        if (j11 <= j12) {
            if (j10 < j11) {
                return j11;
            }
            return j10 > j12 ? j12 : j10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j12 + " is less than minimum " + j11 + '.');
    }

    /* JADX INFO: renamed from: l */
    public static long m32087l(long j10, @NotNull InterfaceC6242b<Long> range) {
        Intrinsics.checkNotNullParameter(range, "range");
        if (range instanceof InterfaceC6241a) {
            return ((Number) m32088m(Long.valueOf(j10), (InterfaceC6241a) range)).longValue();
        }
        if (!range.isEmpty()) {
            if (j10 < ((Number) range.mo27446b()).longValue()) {
                return ((Number) range.mo27446b()).longValue();
            }
            return j10 > ((Number) range.mo27447c()).longValue() ? ((Number) range.mo27447c()).longValue() : j10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public static final <T extends Comparable<? super T>> T m32088m(@NotNull T t8, @NotNull InterfaceC6241a<T> range) {
        Intrinsics.checkNotNullParameter(t8, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        if (!range.isEmpty()) {
            if (!range.m27445a(t8, range.mo27446b()) || range.m27445a(range.mo27446b(), t8)) {
                return (!range.m27445a(range.mo27447c(), t8) || range.m27445a(t8, range.mo27447c())) ? t8 : range.mo27447c();
            }
            return range.mo27446b();
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public static C7761a m32089n(int i10, int i11) {
        return C7761a.INSTANCE.m32071a(i10, i11, -1);
    }

    /* JADX INFO: renamed from: o */
    public static int m32090o(@NotNull IntRange intRange, @NotNull AbstractC5218d random) {
        Intrinsics.checkNotNullParameter(intRange, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        try {
            return C5219e.m24185e(random, intRange);
        } catch (IllegalArgumentException e10) {
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public static C7761a m32091p(@NotNull C7761a c7761a, int i10) {
        Intrinsics.checkNotNullParameter(c7761a, "<this>");
        C6245e.m27448a(i10 > 0, Integer.valueOf(i10));
        C7761a.Companion companion = C7761a.INSTANCE;
        int first = c7761a.getFirst();
        int last = c7761a.getLast();
        if (c7761a.getStep() <= 0) {
            i10 = -i10;
        }
        return companion.m32071a(first, last, i10);
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public static IntRange m32092q(int i10, int i11) {
        return i11 <= Integer.MIN_VALUE ? IntRange.INSTANCE.m32066a() : new IntRange(i10, i11 - 1);
    }
}
