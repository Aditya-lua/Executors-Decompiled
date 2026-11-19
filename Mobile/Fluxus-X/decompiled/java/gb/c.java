package gb;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f17597a = new AtomicReference();

    public final void a() {
        b bVar = (b) this.f17597a.get();
        if (bVar != null) {
            bVar.b();
        }
    }
}
