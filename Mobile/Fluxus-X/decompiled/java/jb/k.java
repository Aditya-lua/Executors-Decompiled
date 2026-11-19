package jb;

import android.os.IBinder;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class k extends e {
    public final /* synthetic */ IBinder b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f20259c;

    public k(m mVar, IBinder iBinder) {
        this.b = iBinder;
        Objects.requireNonNull(mVar);
        this.f20259c = mVar;
    }

    @Override // jb.e
    public final void b() {
        sd.a aVarS2 = sd.a.AbstractBinderC0619a.s2(this.b);
        o oVar = this.f20259c.f20260a;
        oVar.f20273m = aVarS2;
        o.r(oVar);
        oVar.f20267g = false;
        Iterator it = oVar.f20264d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        oVar.f20264d.clear();
    }
}
