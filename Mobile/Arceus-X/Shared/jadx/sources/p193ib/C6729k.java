package p193ib;

import android.os.IBinder;
import java.util.Iterator;
import java.util.Objects;
import p378qd.InterfaceC10503a;

/* JADX INFO: renamed from: ib.k */
/* JADX INFO: loaded from: classes.dex */
public final class C6729k extends AbstractRunnableC6723e {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ IBinder f25836b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ServiceConnectionC6731m f25837c;

    public C6729k(ServiceConnectionC6731m serviceConnectionC6731m, IBinder iBinder) {
        this.f25836b = iBinder;
        Objects.requireNonNull(serviceConnectionC6731m);
        this.f25837c = serviceConnectionC6731m;
    }

    @Override // p193ib.AbstractRunnableC6723e
    /* JADX INFO: renamed from: b */
    public final void mo28824b() {
        InterfaceC10503a interfaceC10503aM40333s2 = InterfaceC10503a.a.m40333s2(this.f25836b);
        C6733o c6733o = this.f25837c.f25839a;
        c6733o.f25853m = interfaceC10503aM40333s2;
        C6733o.m28841r(c6733o);
        c6733o.f25847g = false;
        Iterator it = c6733o.f25844d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        c6733o.f25844d.clear();
    }
}
