package u2;

import android.os.CancellationSignal;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f32899a;
    public a b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f32900c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f32901d;

    public interface a {
        void onCancel();
    }

    public void a() {
        synchronized (this) {
            try {
                if (this.f32899a) {
                    return;
                }
                this.f32899a = true;
                this.f32901d = true;
                a aVar = this.b;
                Object obj = this.f32900c;
                if (aVar != null) {
                    try {
                        aVar.onCancel();
                    } catch (Throwable th2) {
                        synchronized (this) {
                            this.f32901d = false;
                            notifyAll();
                            throw th2;
                        }
                    }
                }
                if (obj != null) {
                    ((CancellationSignal) obj).cancel();
                }
                synchronized (this) {
                    this.f32901d = false;
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
                if (this.f32899a && aVar != null) {
                    aVar.onCancel();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c() {
        while (this.f32901d) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }
}
