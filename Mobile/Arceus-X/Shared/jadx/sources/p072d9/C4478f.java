package p072d9;

import android.content.Context;
import android.util.Log;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import p242k9.AbstractC7496f;
import p268l9.InterfaceC8069r;
import p300n4.AbstractC8881a;

/* JADX INFO: renamed from: d9.f */
/* JADX INFO: loaded from: classes.dex */
public final class C4478f extends AbstractC8881a implements InterfaceC8069r {

    /* JADX INFO: renamed from: o */
    public final Semaphore f18519o;

    /* JADX INFO: renamed from: p */
    public final Set f18520p;

    public C4478f(Context context, Set set) {
        super(context);
        this.f18519o = new Semaphore(0);
        this.f18520p = set;
    }

    @Override // p300n4.AbstractC8881a
    /* JADX INFO: renamed from: C */
    public final /* bridge */ /* synthetic */ Object mo22436C() {
        Iterator it = this.f18520p.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (((AbstractC7496f) it.next()).m31157d(this)) {
                i10++;
            }
        }
        try {
            this.f18519o.tryAcquire(i10, 5L, TimeUnit.SECONDS);
            return null;
        } catch (InterruptedException e10) {
            Log.i("GACSignInLoader", "Unexpected InterruptedException", e10);
            Thread.currentThread().interrupt();
            return null;
        }
    }

    @Override // p300n4.C8882b
    /* JADX INFO: renamed from: p */
    public final void mo22437p() {
        this.f18519o.drainPermits();
        m35724h();
    }
}
