package p138fv;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;

/* JADX INFO: renamed from: fv.f */
/* JADX INFO: loaded from: classes2.dex */
public final class HandlerC5843f extends Handler {

    /* JADX INFO: renamed from: a */
    public final C5846i f22284a;

    /* JADX INFO: renamed from: b */
    public final int f22285b;

    /* JADX INFO: renamed from: c */
    public final C5840c f22286c;

    /* JADX INFO: renamed from: d */
    public boolean f22287d;

    public HandlerC5843f(C5840c c5840c, Looper looper, int i10) {
        super(looper);
        this.f22286c = c5840c;
        this.f22285b = i10;
        this.f22284a = new C5846i();
    }

    /* JADX INFO: renamed from: a */
    public void m26221a(C5851n c5851n, Object obj) {
        C5845h c5845hM26222a = C5845h.m26222a(c5851n, obj);
        synchronized (this) {
            try {
                this.f22284a.m26224a(c5845hM26222a);
                if (!this.f22287d) {
                    this.f22287d = true;
                    if (!sendMessage(obtainMessage())) {
                        throw new C5842e("Could not send handler message");
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
                C5845h c5845hM26225b = this.f22284a.m26225b();
                if (c5845hM26225b == null) {
                    synchronized (this) {
                        c5845hM26225b = this.f22284a.m26225b();
                        if (c5845hM26225b == null) {
                            this.f22287d = false;
                            return;
                        }
                    }
                }
                this.f22286c.m26209g(c5845hM26225b);
            } while (SystemClock.uptimeMillis() - jUptimeMillis < this.f22285b);
            if (!sendMessage(obtainMessage())) {
                throw new C5842e("Could not send handler message");
            }
            this.f22287d = true;
        } catch (Throwable th2) {
            this.f22287d = false;
            throw th2;
        }
    }
}
