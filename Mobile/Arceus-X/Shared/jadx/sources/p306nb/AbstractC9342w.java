package p306nb;

import android.os.Handler;
import com.google.android.gms.internal.measurement.HandlerC2257q1;
import p305n9.C8953m;

/* JADX INFO: renamed from: nb.w */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9342w {

    /* JADX INFO: renamed from: d */
    public static volatile Handler f33582d;

    /* JADX INFO: renamed from: a */
    public final InterfaceC9175l8 f33583a;

    /* JADX INFO: renamed from: b */
    public final Runnable f33584b;

    /* JADX INFO: renamed from: c */
    public volatile long f33585c;

    public AbstractC9342w(InterfaceC9175l8 interfaceC9175l8) {
        C8953m.m36047l(interfaceC9175l8);
        this.f33583a = interfaceC9175l8;
        this.f33584b = new RunnableC9326v(this, interfaceC9175l8);
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo36270a();

    /* JADX INFO: renamed from: b */
    public final void m36990b(long j10) {
        m36992d();
        if (j10 >= 0) {
            InterfaceC9175l8 interfaceC9175l8 = this.f33583a;
            this.f33585c = interfaceC9175l8.mo36325e().mo44175a();
            if (m36994f().postDelayed(this.f33584b, j10)) {
                return;
            }
            interfaceC9175l8.mo36321a().m37003o().m36912b("Failed to schedule delayed post. time", Long.valueOf(j10));
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m36991c() {
        return this.f33585c != 0;
    }

    /* JADX INFO: renamed from: d */
    public final void m36992d() {
        this.f33585c = 0L;
        m36994f().removeCallbacks(this.f33584b);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m36993e(long j10) {
        this.f33585c = 0L;
    }

    /* JADX INFO: renamed from: f */
    public final Handler m36994f() {
        Handler handler;
        if (f33582d != null) {
            return f33582d;
        }
        synchronized (AbstractC9342w.class) {
            try {
                if (f33582d == null) {
                    f33582d = new HandlerC2257q1(this.f33583a.mo36324d().getMainLooper());
                }
                handler = f33582d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }
}
