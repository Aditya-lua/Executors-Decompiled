package p563y1;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: y1.b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C12996b {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m48310a(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, Object obj2, Object obj3) {
        while (!atomicReferenceFieldUpdater.compareAndSet(obj, obj2, obj3)) {
            if (atomicReferenceFieldUpdater.get(obj) != obj2) {
                return false;
            }
        }
        return true;
    }
}
