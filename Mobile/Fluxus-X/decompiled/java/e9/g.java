package e9;

import android.content.Context;
import android.util.Log;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class g extends o4.a implements m9.r {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Semaphore f13246o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Set f13247p;

    public g(Context context, Set set) {
        super(context);
        this.f13246o = new Semaphore(0);
        this.f13247p = set;
    }

    @Override // o4.a
    public final /* bridge */ /* synthetic */ Object C() {
        Iterator it = this.f13247p.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (((l9.h) it.next()).d(this)) {
                i10++;
            }
        }
        try {
            this.f13246o.tryAcquire(i10, 5L, TimeUnit.SECONDS);
            return null;
        } catch (InterruptedException e10) {
            Log.i("GACSignInLoader", "Unexpected InterruptedException", e10);
            Thread.currentThread().interrupt();
            return null;
        }
    }

    @Override // o4.b
    public final void p() {
        this.f13246o.drainPermits();
        h();
    }
}
