package ob;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class rb extends n5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f27766a;
    public final /* synthetic */ yc b;

    public rb(yc ycVar, AtomicReference atomicReference) {
        this.f27766a = atomicReference;
        Objects.requireNonNull(ycVar);
        this.b = ycVar;
    }

    @Override // ob.o5
    public final void H1(ee eeVar) {
        AtomicReference atomicReference = this.f27766a;
        synchronized (atomicReference) {
            this.b.f27641a.a().w().b("[sgtm] Got upload batches from service. count", Integer.valueOf(eeVar.f27308f.size()));
            atomicReference.set(eeVar);
            atomicReference.notifyAll();
        }
    }
}
