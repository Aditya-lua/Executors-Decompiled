package ee;

import android.os.IBinder;
import android.os.IInterface;
import java.util.Iterator;

/* JADX INFO: renamed from: ee.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C5059b extends AbstractRunnableC5098u0 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ IBinder f19879b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ServiceConnectionC5065e f19880c;

    public C5059b(ServiceConnectionC5065e serviceConnectionC5065e, IBinder iBinder) {
        this.f19879b = iBinder;
        this.f19880c = serviceConnectionC5065e;
    }

    @Override // ee.AbstractRunnableC5098u0
    /* JADX INFO: renamed from: b */
    public final void mo23771b() {
        this.f19880c.f19882a.f19897n = (IInterface) this.f19880c.f19882a.f19892i.mo23770a(this.f19879b);
        C5067f.m23789r(this.f19880c.f19882a);
        this.f19880c.f19882a.f19890g = false;
        Iterator it = this.f19880c.f19882a.f19887d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.f19880c.f19882a.f19887d.clear();
    }
}
