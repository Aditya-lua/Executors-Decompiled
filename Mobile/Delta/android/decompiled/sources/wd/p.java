package wd;

import android.os.IBinder;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class p extends j {
    public final /* synthetic */ IBinder b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f34172c;

    public p(r rVar, IBinder iBinder) {
        this.b = iBinder;
        this.f34172c = rVar;
    }

    @Override // wd.j
    public final void a() {
        this.f34172c.f34173a.f34186m = e.s2(this.b);
        t.q(this.f34172c.f34173a);
        this.f34172c.f34173a.f34180g = false;
        Iterator it = this.f34172c.f34173a.f34177d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.f34172c.f34173a.f34177d.clear();
    }
}
