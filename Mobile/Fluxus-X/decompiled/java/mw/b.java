package mw;

import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f24811a = new i();
    public final c b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f24812c;

    public b(c cVar) {
        this.b = cVar;
    }

    public void a(n nVar, Object obj) {
        h hVarA = h.a(nVar, obj);
        synchronized (this) {
            try {
                this.f24811a.a(hVarA);
                if (!this.f24812c) {
                    this.f24812c = true;
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
                    h hVarC = this.f24811a.c(1000);
                    if (hVarC == null) {
                        synchronized (this) {
                            hVarC = this.f24811a.b();
                            if (hVarC == null) {
                                this.f24812c = false;
                                this.f24812c = false;
                                return;
                            }
                        }
                    }
                    this.b.g(hVarC);
                } catch (InterruptedException e10) {
                    Log.w("Event", Thread.currentThread().getName() + " was interruppted", e10);
                    this.f24812c = false;
                    return;
                }
            } catch (Throwable th2) {
                this.f24812c = false;
                throw th2;
            }
        }
    }
}
