package kotlin.ranges;

import gu.e;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001c\u0010\b\u001a\u00020\u0007*\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\u0086\u0004¢\u0006\u0004\b\b\u0010\t\u001a\u001c\u0010\u000b\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\n\u001a\u00020\u0003H\u0086\u0004¢\u0006\u0004\b\u000b\u0010\f\u001a\u001c\u0010\r\u001a\u00020\u0000*\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\u0086\u0004¢\u0006\u0004\b\r\u0010\u000e\u001a\u0019\u0010\u0010\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0003¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0019\u0010\u0013\u001a\u00020\u0012*\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0019\u0010\u0016\u001a\u00020\u0015*\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0019\u0010\u0019\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0003¢\u0006\u0004\b\u0019\u0010\u0011\u001a\u0019\u0010\u001a\u001a\u00020\u0012*\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0012¢\u0006\u0004\b\u001a\u0010\u0014\u001a\u0019\u0010\u001c\u001a\u00020\u001b*\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001d\u001a!\u0010\u001e\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0003¢\u0006\u0004\b\u001e\u0010\u001f\u001a!\u0010 \u001a\u00020\u0012*\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0012¢\u0006\u0004\b \u0010!\u001a!\u0010\"\u001a\u00020\u0015*\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0015¢\u0006\u0004\b\"\u0010#\u001a!\u0010$\u001a\u00020\u001b*\u00020\u001b2\u0006\u0010\u000f\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u001b¢\u0006\u0004\b$\u0010%\u001a1\u0010*\u001a\u00028\u0000\"\u000e\b\u0000\u0010'*\b\u0012\u0004\u0012\u00028\u00000&*\u00028\u00002\f\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000(H\u0007¢\u0006\u0004\b*\u0010+\u001a\u001f\u0010-\u001a\u00020\u0012*\u00020\u00122\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00120,¢\u0006\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lkotlin/ranges/IntRange;", "Leu/d;", "random", "", "o", "(Lkotlin/ranges/IntRange;Leu/d;)I", "to", "Lkotlin/ranges/a;", "n", "(II)Lkotlin/ranges/a;", "step", "p", "(Lkotlin/ranges/a;I)Lkotlin/ranges/a;", "q", "(II)Lkotlin/ranges/IntRange;", "minimumValue", "c", "(II)I", "", "d", "(JJ)J", "", "b", "(FF)F", "maximumValue", "f", "g", "", "e", "(DD)D", "j", "(III)I", "k", "(JJJ)J", "i", "(FFF)F", "h", "(DDD)D", "", "T", "Lgu/a;", "range", "m", "(Ljava/lang/Comparable;Lgu/a;)Ljava/lang/Comparable;", "Lgu/b;", "l", "(JLgu/b;)J", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/ranges/RangesKt")
public class d extends e {
    public static float b(float f10, float f11) {
        return f10 < f11 ? f11 : f10;
    }

    public static int c(int i10, int i11) {
        return i10 < i11 ? i11 : i10;
    }

    public static long d(long j10, long j11) {
        return j10 < j11 ? j11 : j10;
    }

    public static double e(double d10, double d11) {
        return d10 > d11 ? d11 : d10;
    }

    public static int f(int i10, int i11) {
        return i10 > i11 ? i11 : i10;
    }

    public static long g(long j10, long j11) {
        return j10 > j11 ? j11 : j10;
    }

    public static double h(double d10, double d11, double d12) {
        if (d11 <= d12) {
            if (d10 < d11) {
                return d11;
            }
            return d10 > d12 ? d12 : d10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d12 + " is less than minimum " + d11 + '.');
    }

    public static float i(float f10, float f11, float f12) {
        if (f11 <= f12) {
            if (f10 < f11) {
                return f11;
            }
            return f10 > f12 ? f12 : f10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f12 + " is less than minimum " + f11 + '.');
    }

    public static int j(int i10, int i11, int i12) {
        if (i11 <= i12) {
            if (i10 < i11) {
                return i11;
            }
            return i10 > i12 ? i12 : i10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i12 + " is less than minimum " + i11 + '.');
    }

    public static long k(long j10, long j11, long j12) {
        if (j11 <= j12) {
            if (j10 < j11) {
                return j11;
            }
            return j10 > j12 ? j12 : j10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j12 + " is less than minimum " + j11 + '.');
    }

    public static long l(long j10, @NotNull gu.b<Long> range) {
        Intrinsics.checkNotNullParameter(range, "range");
        if (range instanceof gu.a) {
            return ((Number) m(Long.valueOf(j10), (gu.a) range)).longValue();
        }
        if (!range.isEmpty()) {
            if (j10 < ((Number) range.b()).longValue()) {
                return ((Number) range.b()).longValue();
            }
            return j10 > ((Number) range.c()).longValue() ? ((Number) range.c()).longValue() : j10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
    }

    @NotNull
    public static final <T extends Comparable<? super T>> T m(@NotNull T t8, @NotNull gu.a<T> range) {
        Intrinsics.checkNotNullParameter(t8, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        if (!range.isEmpty()) {
            if (!range.a(t8, range.b()) || range.a(range.b(), t8)) {
                return (!range.a(range.c(), t8) || range.a(t8, range.c())) ? t8 : range.c();
            }
            return range.b();
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
    }

    @NotNull
    public static a n(int i10, int i11) {
        return a.INSTANCE.a(i10, i11, -1);
    }

    public static int o(@NotNull IntRange intRange, @NotNull eu.d random) {
        Intrinsics.checkNotNullParameter(intRange, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        try {
            return eu.e.e(random, intRange);
        } catch (IllegalArgumentException e10) {
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    @NotNull
    public static a p(@NotNull a aVar, int i10) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        e.a(i10 > 0, Integer.valueOf(i10));
        a.Companion companion = a.INSTANCE;
        int first = aVar.getFirst();
        int last = aVar.getLast();
        if (aVar.getStep() <= 0) {
            i10 = -i10;
        }
        return companion.a(first, last, i10);
    }

    @NotNull
    public static IntRange q(int i10, int i11) {
        return i11 <= Integer.MIN_VALUE ? IntRange.INSTANCE.a() : new IntRange(i10, i11 - 1);
    }
}
