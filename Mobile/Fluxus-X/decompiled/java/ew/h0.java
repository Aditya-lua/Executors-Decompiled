package ew;

import com.github.luben.zstd.BuildConfig;
import java.util.concurrent.atomic.AtomicReference;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u000bH\u0002¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0012\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\t\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u000fR\"\u0010\u001a\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u000b0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lew/h0;", BuildConfig.FLAVOR, "<init>", "()V", "Lew/g0;", "c", "()Lew/g0;", "segment", BuildConfig.FLAVOR, "b", "(Lew/g0;)V", "Ljava/util/concurrent/atomic/AtomicReference;", "a", "()Ljava/util/concurrent/atomic/AtomicReference;", BuildConfig.FLAVOR, "I", "getMAX_SIZE", "()I", "MAX_SIZE", "Lew/g0;", "LOCK", "d", "HASH_BUCKET_COUNT", BuildConfig.FLAVOR, "e", "[Ljava/util/concurrent/atomic/AtomicReference;", "hashBuckets", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final h0 f14809a = new h0();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final int MAX_SIZE = 65536;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final g0 LOCK = new g0(new byte[0], 0, 0, false, false);

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final int HASH_BUCKET_COUNT;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final AtomicReference<g0>[] hashBuckets;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        HASH_BUCKET_COUNT = iHighestOneBit;
        AtomicReference<g0>[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i10 = 0; i10 < iHighestOneBit; i10++) {
            atomicReferenceArr[i10] = new AtomicReference<>();
        }
        hashBuckets = atomicReferenceArr;
    }

    public static final void b(@NotNull g0 segment) {
        AtomicReference<g0> atomicReferenceA;
        g0 g0Var;
        g0 andSet;
        Intrinsics.checkNotNullParameter(segment, "segment");
        if (segment.next != null || segment.prev != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (segment.shared || (andSet = (atomicReferenceA = f14809a.a()).getAndSet((g0Var = LOCK))) == g0Var) {
            return;
        }
        int i10 = andSet != null ? andSet.limit : 0;
        if (i10 >= MAX_SIZE) {
            atomicReferenceA.set(andSet);
            return;
        }
        segment.next = andSet;
        segment.pos = 0;
        segment.limit = i10 + 8192;
        atomicReferenceA.set(segment);
    }

    @NotNull
    public static final g0 c() {
        AtomicReference<g0> atomicReferenceA = f14809a.a();
        g0 g0Var = LOCK;
        g0 andSet = atomicReferenceA.getAndSet(g0Var);
        if (andSet == g0Var) {
            return new g0();
        }
        if (andSet == null) {
            atomicReferenceA.set(null);
            return new g0();
        }
        atomicReferenceA.set(andSet.next);
        andSet.next = null;
        andSet.limit = 0;
        return andSet;
    }

    public final AtomicReference<g0> a() {
        return hashBuckets[(int) (Thread.currentThread().getId() & (((long) HASH_BUCKET_COUNT) - 1))];
    }
}
