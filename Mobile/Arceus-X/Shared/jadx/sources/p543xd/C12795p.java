package p543xd;

import android.os.IBinder;
import java.util.Iterator;

/* JADX INFO: renamed from: xd.p */
/* JADX INFO: loaded from: classes2.dex */
public final class C12795p extends AbstractRunnableC12789j {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ IBinder f45528b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ServiceConnectionC12797r f45529c;

    public C12795p(ServiceConnectionC12797r serviceConnectionC12797r, IBinder iBinder) {
        this.f45528b = iBinder;
        this.f45529c = serviceConnectionC12797r;
    }

    @Override // p543xd.AbstractRunnableC12789j
    /* JADX INFO: renamed from: a */
    public final void mo46218a() {
        this.f45529c.f45531a.f45545m = AbstractBinderC12784e.m47648s2(this.f45528b);
        C12799t.m47670q(this.f45529c.f45531a);
        this.f45529c.f45531a.f45539g = false;
        Iterator it = this.f45529c.f45531a.f45536d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.f45529c.f45531a.f45536d.clear();
    }
}
