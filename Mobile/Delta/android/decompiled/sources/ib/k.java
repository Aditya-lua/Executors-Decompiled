package ib;

import android.os.IBinder;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class k extends e {
    public final /* synthetic */ IBinder b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f20571c;

    public k(m mVar, IBinder iBinder) {
        this.b = iBinder;
        Objects.requireNonNull(mVar);
        this.f20571c = mVar;
    }

    @Override // ib.e
    public final void b() {
        qd.a aVarS2 = qd.a.AbstractBinderC0515a.s2(this.b);
        o oVar = this.f20571c.f20572a;
        oVar.f20585m = aVarS2;
        o.r(oVar);
        oVar.f20579g = false;
        Iterator it = oVar.f20576d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        oVar.f20576d.clear();
    }
}
