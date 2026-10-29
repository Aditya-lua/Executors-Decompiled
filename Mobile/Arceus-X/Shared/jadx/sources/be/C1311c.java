package be;

import android.os.IBinder;
import java.util.Iterator;

/* JADX INFO: renamed from: be.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C1311c extends AbstractRunnableC1358r1 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ IBinder f5346b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ServiceConnectionC1320f f5347c;

    public C1311c(ServiceConnectionC1320f serviceConnectionC1320f, IBinder iBinder) {
        this.f5347c = serviceConnectionC1320f;
        this.f5346b = iBinder;
    }

    @Override // be.AbstractRunnableC1358r1
    /* JADX INFO: renamed from: c */
    public final void mo534c() {
        this.f5347c.f5351a.f5368m = AbstractBinderC1333j0.m7175s2(this.f5346b);
        C1323g.m7148q(this.f5347c.f5351a);
        this.f5347c.f5351a.f5362g = false;
        Iterator it = this.f5347c.f5351a.f5359d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.f5347c.f5351a.f5359d.clear();
    }
}
