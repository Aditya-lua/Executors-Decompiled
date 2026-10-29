package ae;

import android.os.IBinder;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends r1 {
    public final /* synthetic */ IBinder b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f318c;

    public c(f fVar, IBinder iBinder) {
        this.f318c = fVar;
        this.b = iBinder;
    }

    @Override // ae.r1
    public final void c() {
        this.f318c.f320a.f335m = j0.s2(this.b);
        g.q(this.f318c.f320a);
        this.f318c.f320a.f329g = false;
        Iterator it = this.f318c.f320a.f326d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.f318c.f320a.f326d.clear();
    }
}
