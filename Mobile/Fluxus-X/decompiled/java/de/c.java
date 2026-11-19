package de;

import android.os.IBinder;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends r1 {
    public final /* synthetic */ IBinder b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f12188c;

    public c(f fVar, IBinder iBinder) {
        this.f12188c = fVar;
        this.b = iBinder;
    }

    @Override // de.r1
    public final void c() {
        this.f12188c.f12190a.f12205m = j0.s2(this.b);
        g.q(this.f12188c.f12190a);
        this.f12188c.f12190a.f12199g = false;
        Iterator it = this.f12188c.f12190a.f12196d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.f12188c.f12190a.f12196d.clear();
    }
}
