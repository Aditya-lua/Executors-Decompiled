package fb;

import android.app.Application;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicReference f17140c = new AtomicReference();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f17141a;
    public final m b;

    public j(Application application, m mVar) {
        this.f17141a = new i(this, application, null);
        this.b = mVar;
    }

    public static j a(Application application) {
        AtomicReference atomicReference = f17140c;
        j jVar = (j) atomicReference.get();
        if (jVar != null) {
            return jVar;
        }
        p1.t.a(atomicReference, null, new j(application, o.a(application)));
        return (j) n9.m.l((j) atomicReference.get());
    }

    public final void b() {
        s0.a("AutomaticGamesAuthenticator", "startWatching()");
        this.f17141a.a();
    }

    public final /* synthetic */ m c() {
        return this.b;
    }
}
