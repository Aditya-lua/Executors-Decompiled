package be;

import android.os.IBinder;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends r1 {
    public final /* synthetic */ IBinder b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f3990c;

    public c(f fVar, IBinder iBinder) {
        this.f3990c = fVar;
        this.b = iBinder;
    }

    @Override // be.r1
    public final void c() {
        this.f3990c.f3992a.f4007m = j0.s2(this.b);
        g.q(this.f3990c.f3992a);
        this.f3990c.f3992a.f4001g = false;
        Iterator it = this.f3990c.f3992a.f3998d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.f3990c.f3992a.f3998d.clear();
    }
}
