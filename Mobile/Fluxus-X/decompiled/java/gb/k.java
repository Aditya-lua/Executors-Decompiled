package gb;

import android.app.Application;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicReference f17638c = new AtomicReference();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f17639a;
    public final n b;

    public k(Application application, n nVar) {
        this.f17639a = new j(this, application, null);
        this.b = nVar;
    }

    public static k a(Application application) {
        AtomicReference atomicReference = f17638c;
        k kVar = (k) atomicReference.get();
        if (kVar != null) {
            return kVar;
        }
        p1.t.a(atomicReference, null, new k(application, p.a(application)));
        return (k) o9.s.l((k) atomicReference.get());
    }

    public final void b() {
        t0.a("AutomaticGamesAuthenticator", "startWatching()");
        this.f17639a.a();
    }

    public final /* synthetic */ n c() {
        return this.b;
    }
}
