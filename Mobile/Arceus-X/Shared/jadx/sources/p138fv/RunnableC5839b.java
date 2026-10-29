package p138fv;

import android.util.Log;

/* JADX INFO: renamed from: fv.b */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC5839b implements Runnable {

    /* JADX INFO: renamed from: a */
    public final C5846i f22242a = new C5846i();

    /* JADX INFO: renamed from: b */
    public final C5840c f22243b;

    /* JADX INFO: renamed from: c */
    public volatile boolean f22244c;

    public RunnableC5839b(C5840c c5840c) {
        this.f22243b = c5840c;
    }

    /* JADX INFO: renamed from: a */
    public void m26201a(C5851n c5851n, Object obj) {
        C5845h c5845hM26222a = C5845h.m26222a(c5851n, obj);
        synchronized (this) {
            try {
                this.f22242a.m26224a(c5845hM26222a);
                if (!this.f22244c) {
                    this.f22244c = true;
                    this.f22243b.m26207e().execute(this);
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
                    C5845h c5845hM26226c = this.f22242a.m26226c(1000);
                    if (c5845hM26226c == null) {
                        synchronized (this) {
                            c5845hM26226c = this.f22242a.m26225b();
                            if (c5845hM26226c == null) {
                                this.f22244c = false;
                                this.f22244c = false;
                                return;
                            }
                        }
                    }
                    this.f22243b.m26209g(c5845hM26226c);
                } catch (InterruptedException e10) {
                    Log.w("Event", Thread.currentThread().getName() + " was interruppted", e10);
                    this.f22244c = false;
                    return;
                }
            } catch (Throwable th2) {
                this.f22244c = false;
                throw th2;
            }
        }
    }
}
