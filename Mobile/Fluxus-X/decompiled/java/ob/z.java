package ob;

import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public abstract class z {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile Handler f28021d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q8 f28022a;
    public final Runnable b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile long f28023c;

    public z(q8 q8Var) {
        o9.s.l(q8Var);
        this.f28022a = q8Var;
        this.b = new y(this, q8Var);
    }

    public abstract void a();

    public final void b(long j10) {
        d();
        if (j10 >= 0) {
            q8 q8Var = this.f28022a;
            this.f28023c = q8Var.e().a();
            if (f().postDelayed(this.b, j10)) {
                return;
            }
            q8Var.a().o().b("Failed to schedule delayed post. time", Long.valueOf(j10));
        }
    }

    public final boolean c() {
        return this.f28023c != 0;
    }

    public final void d() {
        this.f28023c = 0L;
        f().removeCallbacks(this.b);
    }

    public final /* synthetic */ void e(long j10) {
        this.f28023c = 0L;
    }

    public final Handler f() {
        Handler handler;
        if (f28021d != null) {
            return f28021d;
        }
        synchronized (z.class) {
            try {
                if (f28021d == null) {
                    f28021d = new com.google.android.gms.internal.measurement.q1(this.f28022a.d().getMainLooper());
                }
                handler = f28021d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }
}
