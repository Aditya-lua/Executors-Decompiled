package ob;

import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class qb extends k5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f27742a;

    public qb(yc ycVar, AtomicReference atomicReference) {
        this.f27742a = atomicReference;
        Objects.requireNonNull(ycVar);
    }

    @Override // ob.l5
    public final void D0(List list) {
        AtomicReference atomicReference = this.f27742a;
        synchronized (atomicReference) {
            atomicReference.set(list);
            atomicReference.notifyAll();
        }
    }
}
