package zd;

import android.os.IBinder;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class p extends j {
    public final /* synthetic */ IBinder b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f39222c;

    public p(r rVar, IBinder iBinder) {
        this.b = iBinder;
        this.f39222c = rVar;
    }

    @Override // zd.j
    public final void a() {
        this.f39222c.f39223a.f39236m = e.s2(this.b);
        t.q(this.f39222c.f39223a);
        this.f39222c.f39223a.f39230g = false;
        Iterator it = this.f39222c.f39223a.f39227d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.f39222c.f39223a.f39227d.clear();
    }
}
