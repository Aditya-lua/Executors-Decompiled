package ib;

import android.os.IBinder;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class k extends e {
    public final /* synthetic */ IBinder b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f20455c;

    public k(m mVar, IBinder iBinder) {
        this.b = iBinder;
        Objects.requireNonNull(mVar);
        this.f20455c = mVar;
    }

    @Override // ib.e
    public final void b() {
        pd.a aVarS2 = pd.a.AbstractBinderC0496a.s2(this.b);
        o oVar = this.f20455c.f20456a;
        oVar.f20469m = aVarS2;
        o.r(oVar);
        oVar.f20463g = false;
        Iterator it = oVar.f20460d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        oVar.f20460d.clear();
    }
}
