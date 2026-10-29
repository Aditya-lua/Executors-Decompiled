package fv;

import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f17234a = new i();
    public final c b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f17235c;

    public b(c cVar) {
        this.b = cVar;
    }

    public void a(n nVar, Object obj) {
        h hVarA = h.a(nVar, obj);
        synchronized (this) {
            try {
                this.f17234a.a(hVarA);
                if (!this.f17235c) {
                    this.f17235c = true;
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
                    h hVarC = this.f17234a.c(1000);
                    if (hVarC == null) {
                        synchronized (this) {
                            hVarC = this.f17234a.b();
                            if (hVarC == null) {
                                this.f17235c = false;
                                this.f17235c = false;
                                return;
                            }
                        }
                    }
                    this.b.g(hVarC);
                } catch (InterruptedException e10) {
                    Log.w("Event", Thread.currentThread().getName() + " was interruppted", e10);
                    this.f17235c = false;
                    return;
                }
            } catch (Throwable th2) {
                this.f17235c = false;
                throw th2;
            }
        }
    }
}
