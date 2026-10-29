package nb;

import com.google.android.gms.measurement.internal.zzoq;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class mb extends i5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f25750a;
    public final /* synthetic */ tc b;

    public mb(tc tcVar, AtomicReference atomicReference) {
        this.f25750a = atomicReference;
        Objects.requireNonNull(tcVar);
        this.b = tcVar;
    }

    @Override // nb.j5
    public final void M1(zzoq zzoqVar) {
        AtomicReference atomicReference = this.f25750a;
        synchronized (atomicReference) {
            this.b.f25625a.a().w().b("[sgtm] Got upload batches from service. count", Integer.valueOf(zzoqVar.f7437f.size()));
            atomicReference.set(zzoqVar);
            atomicReference.notifyAll();
        }
    }
}
