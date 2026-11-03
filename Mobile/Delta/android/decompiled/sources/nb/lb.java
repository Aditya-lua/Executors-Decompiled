package nb;

import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class lb extends f5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f26551a;

    public lb(tc tcVar, AtomicReference atomicReference) {
        this.f26551a = atomicReference;
        Objects.requireNonNull(tcVar);
    }

    @Override // nb.g5
    public final void x0(List list) {
        AtomicReference atomicReference = this.f26551a;
        synchronized (atomicReference) {
            atomicReference.set(list);
            atomicReference.notifyAll();
        }
    }
}
