package u2;

import android.os.CancellationSignal;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f32034a;
    public a b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f32035c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f32036d;

    public interface a {
        void onCancel();
    }

    public void a() {
        synchronized (this) {
            try {
                if (this.f32034a) {
                    return;
                }
                this.f32034a = true;
                this.f32036d = true;
                a aVar = this.b;
                Object obj = this.f32035c;
                if (aVar != null) {
                    try {
                        aVar.onCancel();
                    } catch (Throwable th2) {
                        synchronized (this) {
                            this.f32036d = false;
                            notifyAll();
                            throw th2;
                        }
                    }
                }
                if (obj != null) {
                    ((CancellationSignal) obj).cancel();
                }
                synchronized (this) {
                    this.f32036d = false;
                    notifyAll();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public void b(a aVar) {
        synchronized (this) {
            try {
                c();
                if (this.b == aVar) {
                    return;
                }
                this.b = aVar;
                if (this.f32034a && aVar != null) {
                    aVar.onCancel();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c() {
        while (this.f32036d) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }
}
