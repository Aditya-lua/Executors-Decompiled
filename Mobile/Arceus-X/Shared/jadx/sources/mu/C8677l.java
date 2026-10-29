package mu;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: renamed from: mu.l */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C8677l {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m34942a(AtomicReferenceArray atomicReferenceArray, int i10, Object obj, Object obj2) {
        while (!atomicReferenceArray.compareAndSet(i10, obj, obj2)) {
            if (atomicReferenceArray.get(i10) != obj) {
                return false;
            }
        }
        return true;
    }
}
