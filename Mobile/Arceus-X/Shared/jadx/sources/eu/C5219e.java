package eu;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: eu.e */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0017\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u001b\u0010\n\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001f\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m31665d2 = {"Leu/d;", "Lkotlin/ranges/IntRange;", "range", "", "e", "(Leu/d;Lkotlin/ranges/IntRange;)I", "value", "d", "(I)I", "bitCount", "f", "(II)I", "from", "until", "", "c", "(II)V", "", "b", "(DD)V", "", "", "a", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;", "kotlin-stdlib"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C5219e {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final String m24181a(@NotNull Object from, @NotNull Object until) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(until, "until");
        return "Random range is empty: [" + from + ", " + until + ").";
    }

    /* JADX INFO: renamed from: b */
    public static final void m24182b(double d10, double d11) {
        if (d11 <= d10) {
            throw new IllegalArgumentException(m24181a(Double.valueOf(d10), Double.valueOf(d11)).toString());
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m24183c(int i10, int i11) {
        if (i11 <= i10) {
            throw new IllegalArgumentException(m24181a(Integer.valueOf(i10), Integer.valueOf(i11)).toString());
        }
    }

    /* JADX INFO: renamed from: d */
    public static final int m24184d(int i10) {
        return 31 - Integer.numberOfLeadingZeros(i10);
    }

    /* JADX INFO: renamed from: e */
    public static final int m24185e(@NotNull AbstractC5218d abstractC5218d, @NotNull IntRange range) {
        Intrinsics.checkNotNullParameter(abstractC5218d, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        if (!range.isEmpty()) {
            if (range.getLast() < Integer.MAX_VALUE) {
                return abstractC5218d.mo24180h(range.getFirst(), range.getLast() + 1);
            }
            return range.getFirst() > Integer.MIN_VALUE ? abstractC5218d.mo24180h(range.getFirst() - 1, range.getLast()) + 1 : abstractC5218d.mo24172f();
        }
        throw new IllegalArgumentException("Cannot get random in empty range: " + range);
    }

    /* JADX INFO: renamed from: f */
    public static final int m24186f(int i10, int i11) {
        return (i10 >>> (32 - i11)) & ((-i11) >> 31);
    }
}
