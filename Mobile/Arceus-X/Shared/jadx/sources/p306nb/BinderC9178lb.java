package p306nb;

import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: nb.lb */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC9178lb extends AbstractBinderC9076f5 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AtomicReference f33186a;

    public BinderC9178lb(C9307tc c9307tc, AtomicReference atomicReference) {
        this.f33186a = atomicReference;
        Objects.requireNonNull(c9307tc);
    }

    @Override // p306nb.InterfaceC9092g5
    /* JADX INFO: renamed from: x0 */
    public final void mo36288x0(List list) {
        AtomicReference atomicReference = this.f33186a;
        synchronized (atomicReference) {
            atomicReference.set(list);
            atomicReference.notifyAll();
        }
    }
}
