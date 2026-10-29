package kotlin.ranges;

import kotlin.Metadata;
import kotlin.collections.f0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\b\u0016\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\f\u001a\u0004\b\u0014\u0010\u000e¨\u0006\u0015"}, d2 = {"Lkotlin/ranges/b;", "", "", "start", "endInclusive", "step", "<init>", "(JJJ)V", "Lkotlin/collections/f0;", "f", "()Lkotlin/collections/f0;", "a", "J", "d", "()J", "first", "b", "e", "last", "c", "getStep", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class b implements Iterable<Long>, au.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final long first;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final long last;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final long step;

    public b(long j10, long j11, long j12) {
        if (j12 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (j12 == Long.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
        this.first = j10;
        this.last = rt.c.d(j10, j11, j12);
        this.step = j12;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getFirst() {
        return this.first;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getLast() {
        return this.last;
    }

    @Override // java.lang.Iterable
    @NotNull
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public f0 iterator() {
        return new gu.d(this.first, this.last, this.step);
    }
}
