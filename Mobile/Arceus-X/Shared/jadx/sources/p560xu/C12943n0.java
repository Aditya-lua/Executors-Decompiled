package p560xu;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: xu.n0 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u000bH\u0002¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0012\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\t\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u000fR\"\u0010\u001a\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u000b0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, m31665d2 = {"Lxu/n0;", "", "<init>", "()V", "Lxu/m0;", "c", "()Lxu/m0;", "segment", "", "b", "(Lxu/m0;)V", "Ljava/util/concurrent/atomic/AtomicReference;", "a", "()Ljava/util/concurrent/atomic/AtomicReference;", "", "I", "getMAX_SIZE", "()I", "MAX_SIZE", "Lxu/m0;", "LOCK", "d", "HASH_BUCKET_COUNT", "", "e", "[Ljava/util/concurrent/atomic/AtomicReference;", "hashBuckets", "okio"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C12943n0 {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C12943n0 f45880a = new C12943n0();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final int MAX_SIZE = 65536;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final C12941m0 LOCK = new C12941m0(new byte[0], 0, 0, false, false);

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public static final int HASH_BUCKET_COUNT;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public static final AtomicReference<C12941m0>[] hashBuckets;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        HASH_BUCKET_COUNT = iHighestOneBit;
        AtomicReference<C12941m0>[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i10 = 0; i10 < iHighestOneBit; i10++) {
            atomicReferenceArr[i10] = new AtomicReference<>();
        }
        hashBuckets = atomicReferenceArr;
    }

    /* JADX INFO: renamed from: b */
    public static final void m48178b(@NotNull C12941m0 segment) {
        AtomicReference<C12941m0> atomicReferenceM48180a;
        C12941m0 c12941m0;
        C12941m0 andSet;
        Intrinsics.checkNotNullParameter(segment, "segment");
        if (segment.next != null || segment.prev != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (segment.shared || (andSet = (atomicReferenceM48180a = f45880a.m48180a()).getAndSet((c12941m0 = LOCK))) == c12941m0) {
            return;
        }
        int i10 = andSet != null ? andSet.limit : 0;
        if (i10 >= MAX_SIZE) {
            atomicReferenceM48180a.set(andSet);
            return;
        }
        segment.next = andSet;
        segment.pos = 0;
        segment.limit = i10 + 8192;
        atomicReferenceM48180a.set(segment);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final C12941m0 m48179c() {
        AtomicReference<C12941m0> atomicReferenceM48180a = f45880a.m48180a();
        C12941m0 c12941m0 = LOCK;
        C12941m0 andSet = atomicReferenceM48180a.getAndSet(c12941m0);
        if (andSet == c12941m0) {
            return new C12941m0();
        }
        if (andSet == null) {
            atomicReferenceM48180a.set(null);
            return new C12941m0();
        }
        atomicReferenceM48180a.set(andSet.next);
        andSet.next = null;
        andSet.limit = 0;
        return andSet;
    }

    /* JADX INFO: renamed from: a */
    public final AtomicReference<C12941m0> m48180a() {
        return hashBuckets[(int) (Thread.currentThread().getId() & (((long) HASH_BUCKET_COUNT) - 1))];
    }
}
