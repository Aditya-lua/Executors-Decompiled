package p125fb;

import android.app.Application;
import java.util.concurrent.atomic.AtomicReference;
import p305n9.C8953m;
import p348p1.C10146t;

/* JADX INFO: renamed from: fb.j */
/* JADX INFO: loaded from: classes.dex */
public final class C5532j {

    /* JADX INFO: renamed from: c */
    public static final AtomicReference f21312c = new AtomicReference();

    /* JADX INFO: renamed from: a */
    public final C5528i f21313a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5541m f21314b;

    public C5532j(Application application, InterfaceC5541m interfaceC5541m) {
        this.f21313a = new C5528i(this, application, null);
        this.f21314b = interfaceC5541m;
    }

    /* JADX INFO: renamed from: a */
    public static C5532j m25199a(Application application) {
        AtomicReference atomicReference = f21312c;
        C5532j c5532j = (C5532j) atomicReference.get();
        if (c5532j != null) {
            return c5532j;
        }
        C10146t.m39085a(atomicReference, null, new C5532j(application, C5547o.m25217a(application)));
        return (C5532j) C8953m.m36047l((C5532j) atomicReference.get());
    }

    /* JADX INFO: renamed from: b */
    public final void m25200b() {
        C5560s0.m25220a("AutomaticGamesAuthenticator", "startWatching()");
        this.f21313a.m25193a();
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC5541m m25201c() {
        return this.f21314b;
    }
}
