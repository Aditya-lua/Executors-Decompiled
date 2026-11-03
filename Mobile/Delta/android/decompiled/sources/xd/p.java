package xd;

import android.os.IBinder;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class p extends j {
    public final /* synthetic */ IBinder b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f35671c;

    public p(r rVar, IBinder iBinder) {
        this.b = iBinder;
        this.f35671c = rVar;
    }

    @Override // xd.j
    public final void a() {
        this.f35671c.f35672a.f35685m = e.s2(this.b);
        t.q(this.f35671c.f35672a);
        this.f35671c.f35672a.f35679g = false;
        Iterator it = this.f35671c.f35672a.f35676d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.f35671c.f35672a.f35676d.clear();
    }
}
