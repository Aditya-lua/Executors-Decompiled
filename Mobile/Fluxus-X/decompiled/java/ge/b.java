package ge;

import android.os.IBinder;
import android.os.IInterface;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends u0 {
    public final /* synthetic */ IBinder b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f17698c;

    public b(e eVar, IBinder iBinder) {
        this.b = iBinder;
        this.f17698c = eVar;
    }

    @Override // ge.u0
    public final void b() {
        this.f17698c.f17699a.f17713n = (IInterface) this.f17698c.f17699a.f17708i.a(this.b);
        f.r(this.f17698c.f17699a);
        this.f17698c.f17699a.f17706g = false;
        Iterator it = this.f17698c.f17699a.f17703d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.f17698c.f17699a.f17703d.clear();
    }
}
