package fv;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes2.dex */
public final class f extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f17272a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f17273c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f17274d;

    public f(c cVar, Looper looper, int i10) {
        super(looper);
        this.f17273c = cVar;
        this.b = i10;
        this.f17272a = new i();
    }

    public void a(n nVar, Object obj) {
        h hVarA = h.a(nVar, obj);
        synchronized (this) {
            try {
                this.f17272a.a(hVarA);
                if (!this.f17274d) {
                    this.f17274d = true;
                    if (!sendMessage(obtainMessage())) {
                        throw new e("Could not send handler message");
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        try {
            long jUptimeMillis = SystemClock.uptimeMillis();
            do {
                h hVarB = this.f17272a.b();
                if (hVarB == null) {
                    synchronized (this) {
                        hVarB = this.f17272a.b();
                        if (hVarB == null) {
                            this.f17274d = false;
                            return;
                        }
                    }
                }
                this.f17273c.g(hVarB);
            } while (SystemClock.uptimeMillis() - jUptimeMillis < this.b);
            if (!sendMessage(obtainMessage())) {
                throw new e("Could not send handler message");
            }
            this.f17274d = true;
        } catch (Throwable th2) {
            this.f17274d = false;
            throw th2;
        }
    }
}
