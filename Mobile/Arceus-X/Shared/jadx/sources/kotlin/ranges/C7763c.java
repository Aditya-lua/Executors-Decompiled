package kotlin.ranges;

import gu.InterfaceC6242b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: kotlin.ranges.c */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 \u00182\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00020\u00030\u0004:\u0001\u0019B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0006\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0016¨\u0006\u001a"}, m31665d2 = {"Lkotlin/ranges/c;", "Lkotlin/ranges/b;", "Lgu/b;", "", "", "start", "endInclusive", "<init>", "(JJ)V", "", "isEmpty", "()Z", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "i", "()Ljava/lang/Long;", "g", "e", "a", "kotlin-stdlib"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C7763c extends C7762b implements InterfaceC6242b<Long> {

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final C7763c f29458f = new C7763c(1, 0);

    public C7763c(long j10, long j11) {
        super(j10, j11, 1L);
    }

    public boolean equals(@Nullable Object other) {
        if (!(other instanceof C7763c)) {
            return false;
        }
        if (isEmpty() && ((C7763c) other).isEmpty()) {
            return true;
        }
        C7763c c7763c = (C7763c) other;
        return getFirst() == c7763c.getFirst() && getLast() == c7763c.getLast();
    }

    /* JADX DEBUG: Method merged with bridge method: c()Ljava/lang/Comparable; */
    @Override // gu.InterfaceC6242b
    @NotNull
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public Long mo27447c() {
        return Long.valueOf(getLast());
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (int) ((((long) 31) * (getFirst() ^ (getFirst() >>> 32))) + (getLast() ^ (getLast() >>> 32)));
    }

    /* JADX DEBUG: Method merged with bridge method: b()Ljava/lang/Comparable; */
    @Override // gu.InterfaceC6242b
    @NotNull
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Long mo27446b() {
        return Long.valueOf(getFirst());
    }

    @Override // gu.InterfaceC6242b
    public boolean isEmpty() {
        return getFirst() > getLast();
    }

    @NotNull
    public String toString() {
        return getFirst() + ".." + getLast();
    }
}
