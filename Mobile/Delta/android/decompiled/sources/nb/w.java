package nb;

import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public abstract class w {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile Handler f26869d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l8 f26870a;
    public final Runnable b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile long f26871c;

    public w(l8 l8Var) {
        n9.m.l(l8Var);
        this.f26870a = l8Var;
        this.b = new v(this, l8Var);
    }

    public abstract void a();

    public final void b(long j10) {
        d();
        if (j10 >= 0) {
            l8 l8Var = this.f26870a;
            this.f26871c = l8Var.e().a();
            if (f().postDelayed(this.b, j10)) {
                return;
            }
            l8Var.a().o().b("Failed to schedule delayed post. time", Long.valueOf(j10));
        }
    }

    public final boolean c() {
        return this.f26871c != 0;
    }

    public final void d() {
        this.f26871c = 0L;
        f().removeCallbacks(this.b);
    }

    public final /* synthetic */ void e(long j10) {
        this.f26871c = 0L;
    }

    public final Handler f() {
        Handler handler;
        if (f26869d != null) {
            return f26869d;
        }
        synchronized (w.class) {
            try {
                if (f26869d == null) {
                    f26869d = new com.google.android.gms.internal.measurement.q1(this.f26870a.d().getMainLooper());
                }
                handler = f26869d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }
}
