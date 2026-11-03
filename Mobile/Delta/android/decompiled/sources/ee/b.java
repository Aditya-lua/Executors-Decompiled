package ee;

import android.os.IBinder;
import android.os.IInterface;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends u0 {
    public final /* synthetic */ IBinder b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f16071c;

    public b(e eVar, IBinder iBinder) {
        this.b = iBinder;
        this.f16071c = eVar;
    }

    @Override // ee.u0
    public final void b() {
        this.f16071c.f16072a.f16086n = (IInterface) this.f16071c.f16072a.f16081i.a(this.b);
        f.r(this.f16071c.f16072a);
        this.f16071c.f16072a.f16079g = false;
        Iterator it = this.f16071c.f16072a.f16076d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.f16071c.f16072a.f16076d.clear();
    }
}
