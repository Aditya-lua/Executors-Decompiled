package p456u2;

import android.os.CancellationSignal;

/* JADX INFO: renamed from: u2.e */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class C11776e {

    /* JADX INFO: renamed from: a */
    public boolean f41496a;

    /* JADX INFO: renamed from: b */
    public a f41497b;

    /* JADX INFO: renamed from: c */
    public Object f41498c;

    /* JADX INFO: renamed from: d */
    public boolean f41499d;

    /* JADX INFO: renamed from: u2.e$a */
    public interface a {
        void onCancel();
    }

    /* JADX INFO: renamed from: a */
    public void m44058a() {
        synchronized (this) {
            try {
                if (this.f41496a) {
                    return;
                }
                this.f41496a = true;
                this.f41499d = true;
                a aVar = this.f41497b;
                Object obj = this.f41498c;
                if (aVar != null) {
                    try {
                        aVar.onCancel();
                    } catch (Throwable th2) {
                        synchronized (this) {
                            this.f41499d = false;
                            notifyAll();
                            throw th2;
                        }
                    }
                }
                if (obj != null) {
                    ((CancellationSignal) obj).cancel();
                }
                synchronized (this) {
                    this.f41499d = false;
                    notifyAll();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m44059b(a aVar) {
        synchronized (this) {
            try {
                m44060c();
                if (this.f41497b == aVar) {
                    return;
                }
                this.f41497b = aVar;
                if (this.f41496a && aVar != null) {
                    aVar.onCancel();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m44060c() {
        while (this.f41499d) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }
}
