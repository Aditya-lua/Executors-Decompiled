package dv;

import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f15430a = new i();
    public final c b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f15431c;

    public b(c cVar) {
        this.b = cVar;
    }

    public void a(n nVar, Object obj) {
        h hVarA = h.a(nVar, obj);
        synchronized (this) {
            try {
                this.f15430a.a(hVarA);
                if (!this.f15431c) {
                    this.f15431c = true;
                    this.b.e().execute(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        while (true) {
            try {
                try {
                    h hVarC = this.f15430a.c(1000);
                    if (hVarC == null) {
                        synchronized (this) {
                            hVarC = this.f15430a.b();
                            if (hVarC == null) {
                                this.f15431c = false;
                                this.f15431c = false;
                                return;
                            }
                        }
                    }
                    this.b.g(hVarC);
                } catch (InterruptedException e10) {
                    Log.w("Event", Thread.currentThread().getName() + " was interruppted", e10);
                    this.f15431c = false;
                    return;
                }
            } catch (Throwable th2) {
                this.f15431c = false;
                throw th2;
            }
        }
    }
}
