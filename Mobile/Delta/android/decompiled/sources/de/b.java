package de;

import android.os.IBinder;
import android.os.IInterface;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends u0 {
    public final /* synthetic */ IBinder b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f14575c;

    public b(e eVar, IBinder iBinder) {
        this.b = iBinder;
        this.f14575c = eVar;
    }

    @Override // de.u0
    public final void b() {
        this.f14575c.f14576a.f14590n = (IInterface) this.f14575c.f14576a.f14585i.a(this.b);
        f.r(this.f14575c.f14576a);
        this.f14575c.f14576a.f14583g = false;
        Iterator it = this.f14575c.f14576a.f14580d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.f14575c.f14576a.f14580d.clear();
    }
}
