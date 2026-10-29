package p306nb;

import com.google.android.gms.measurement.internal.zzoq;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: nb.mb */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC9194mb extends AbstractBinderC9124i5 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AtomicReference f33211a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C9307tc f33212b;

    public BinderC9194mb(C9307tc c9307tc, AtomicReference atomicReference) {
        this.f33211a = atomicReference;
        Objects.requireNonNull(c9307tc);
        this.f33212b = c9307tc;
    }

    @Override // p306nb.InterfaceC9140j5
    /* JADX INFO: renamed from: M1 */
    public final void mo36344M1(zzoq zzoqVar) {
        AtomicReference atomicReference = this.f33211a;
        synchronized (atomicReference) {
            this.f33212b.f33067a.mo36321a().m37011w().m36912b("[sgtm] Got upload batches from service. count", Integer.valueOf(zzoqVar.f9517f.size()));
            atomicReference.set(zzoqVar);
            atomicReference.notifyAll();
        }
    }
}
