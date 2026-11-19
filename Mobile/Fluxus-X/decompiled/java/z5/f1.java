package z5;

import android.content.BroadcastReceiver;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.ForceStopRunnable;
import g6.WorkGenerationalId;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public class f1 extends y5.p0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f39012m = y5.w.i("WorkManagerImpl");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static f1 f39013n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static f1 f39014o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Object f39015p = new Object();
    public Context b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public androidx.work.a f39016c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public WorkDatabase f39017d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public i6.b f39018e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List<u> f39019f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public s f39020g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public h6.w f39021h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f39022i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public BroadcastReceiver.PendingResult f39023j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final e6.n f39024k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final av.p0 f39025l;

    public static class a {
        public static boolean a(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    public f1(Context context, androidx.work.a aVar, i6.b bVar, WorkDatabase workDatabase, List<u> list, s sVar, e6.n nVar) {
        Context applicationContext = context.getApplicationContext();
        if (a.a(applicationContext)) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        y5.w.h(new y5.w.a(aVar.getMinimumLoggingLevel()));
        this.b = applicationContext;
        this.f39018e = bVar;
        this.f39017d = workDatabase;
        this.f39020g = sVar;
        this.f39024k = nVar;
        this.f39016c = aVar;
        this.f39019f = list;
        av.p0 p0VarF = androidx.work.impl.a.f(bVar);
        this.f39025l = p0VarF;
        this.f39021h = new h6.w(this.f39017d);
        x.e(list, this.f39020g, bVar.c(), this.f39017d, aVar);
        this.f39018e.d(new ForceStopRunnable(applicationContext, this));
        d0.c(p0VarF, this.b, aVar, workDatabase);
    }

    public static void i(Context context, androidx.work.a aVar) {
        synchronized (f39015p) {
            try {
                f1 f1Var = f39013n;
                if (f1Var != null && f39014o != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
                if (f1Var == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (f39014o == null) {
                        f39014o = androidx.work.impl.a.c(applicationContext, aVar);
                    }
                    f39013n = f39014o;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static /* synthetic */ Unit j(f1 f1Var) {
        b6.f.a(f1Var.m());
        f1Var.u().c0().n();
        x.f(f1Var.n(), f1Var.u(), f1Var.s());
        return Unit.f21506a;
    }

    @Deprecated
    public static f1 o() {
        synchronized (f39015p) {
            try {
                f1 f1Var = f39013n;
                if (f1Var != null) {
                    return f1Var;
                }
                return f39014o;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static f1 p(Context context) {
        f1 f1VarO;
        synchronized (f39015p) {
            try {
                f1VarO = o();
                if (f1VarO == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (!(applicationContext instanceof androidx.work.a.c)) {
                        throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                    }
                    i(applicationContext, ((androidx.work.a.c) applicationContext).b());
                    f1VarO = p(applicationContext);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f1VarO;
    }

    @Override // y5.p0
    public y5.a0 a(String str) {
        return h6.h.o(str, this);
    }

    @Override // y5.p0
    public y5.a0 b(String str) {
        return h6.h.k(str, this);
    }

    @Override // y5.p0
    public y5.a0 c(List<? extends y5.q0> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
        }
        return new f0(this, list).b();
    }

    @Override // y5.p0
    public y5.a0 e(String str, y5.i iVar, y5.g0 g0Var) {
        return iVar == y5.i.UPDATE ? m1.e(this, str, g0Var) : l(str, iVar, g0Var).b();
    }

    @Override // y5.p0
    public y5.a0 f(String str, y5.j jVar, List<y5.z> list) {
        return new f0(this, str, jVar, list).b();
    }

    public y5.a0 k(UUID uuid) {
        return h6.h.h(uuid, this);
    }

    public f0 l(String str, y5.i iVar, y5.g0 g0Var) {
        return new f0(this, str, iVar == y5.i.KEEP ? y5.j.KEEP : y5.j.REPLACE, Collections.singletonList(g0Var));
    }

    public Context m() {
        return this.b;
    }

    public androidx.work.a n() {
        return this.f39016c;
    }

    public h6.w q() {
        return this.f39021h;
    }

    public s r() {
        return this.f39020g;
    }

    public List<u> s() {
        return this.f39019f;
    }

    public e6.n t() {
        return this.f39024k;
    }

    public WorkDatabase u() {
        return this.f39017d;
    }

    public i6.b v() {
        return this.f39018e;
    }

    public void w() {
        synchronized (f39015p) {
            try {
                this.f39022i = true;
                BroadcastReceiver.PendingResult pendingResult = this.f39023j;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.f39023j = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void x() {
        y5.m0.a(n().getTracer(), "ReschedulingWork", new Function0() { // from class: z5.e1
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return f1.j(this.f39001a);
            }
        });
    }

    public void y(BroadcastReceiver.PendingResult pendingResult) {
        synchronized (f39015p) {
            try {
                BroadcastReceiver.PendingResult pendingResult2 = this.f39023j;
                if (pendingResult2 != null) {
                    pendingResult2.finish();
                }
                this.f39023j = pendingResult;
                if (this.f39022i) {
                    pendingResult.finish();
                    this.f39023j = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void z(WorkGenerationalId workGenerationalId, int i10) {
        this.f39018e.d(new h6.z(this.f39020g, new y(workGenerationalId), true, i10));
    }
}
