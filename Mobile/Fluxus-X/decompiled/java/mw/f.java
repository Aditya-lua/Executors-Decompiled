package mw;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes2.dex */
public final class f extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f24849a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f24850c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f24851d;

    public f(c cVar, Looper looper, int i10) {
        super(looper);
        this.f24850c = cVar;
        this.b = i10;
        this.f24849a = new i();
    }

    public void a(n nVar, Object obj) {
        h hVarA = h.a(nVar, obj);
        synchronized (this) {
            try {
                this.f24849a.a(hVarA);
                if (!this.f24851d) {
                    this.f24851d = true;
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
                h hVarB = this.f24849a.b();
                if (hVarB == null) {
                    synchronized (this) {
                        hVarB = this.f24849a.b();
                        if (hVarB == null) {
                            this.f24851d = false;
                            return;
                        }
                    }
                }
                this.f24850c.g(hVarB);
            } while (SystemClock.uptimeMillis() - jUptimeMillis < this.b);
            if (!sendMessage(obtainMessage())) {
                throw new e("Could not send handler message");
            }
            this.f24851d = true;
        } catch (Throwable th2) {
            this.f24851d = false;
            throw th2;
        }
    }
}
