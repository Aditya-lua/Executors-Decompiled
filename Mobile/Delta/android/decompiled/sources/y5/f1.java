package y5;

import android.content.BroadcastReceiver;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.ForceStopRunnable;
import f6.WorkGenerationalId;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public class f1 extends x5.p0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f35613m = x5.w.i("WorkManagerImpl");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static f1 f35614n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static f1 f35615o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Object f35616p = new Object();
    public Context b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public androidx.work.a f35617c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public WorkDatabase f35618d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public h6.b f35619e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List<u> f35620f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public s f35621g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public g6.w f35622h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f35623i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public BroadcastReceiver.PendingResult f35624j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final d6.n f35625k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ku.p0 f35626l;

    public static class a {
        public static boolean a(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    public f1(Context context, androidx.work.a aVar, h6.b bVar, WorkDatabase workDatabase, List<u> list, s sVar, d6.n nVar) {
        Context applicationContext = context.getApplicationContext();
        if (a.a(applicationContext)) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        x5.w.h(new x5.w.a(aVar.getMinimumLoggingLevel()));
        this.b = applicationContext;
        this.f35619e = bVar;
        this.f35618d = workDatabase;
        this.f35621g = sVar;
        this.f35625k = nVar;
        this.f35617c = aVar;
        this.f35620f = list;
        ku.p0 p0VarF = androidx.work.impl.a.f(bVar);
        this.f35626l = p0VarF;
        this.f35622h = new g6.w(this.f35618d);
        x.e(list, this.f35621g, bVar.c(), this.f35618d, aVar);
        this.f35619e.d(new ForceStopRunnable(applicationContext, this));
        d0.c(p0VarF, this.b, aVar, workDatabase);
    }

    public static void i(Context context, androidx.work.a aVar) {
        synchronized (f35616p) {
            try {
                f1 f1Var = f35614n;
                if (f1Var != null && f35615o != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
                if (f1Var == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (f35615o == null) {
                        f35615o = androidx.work.impl.a.c(applicationContext, aVar);
                    }
                    f35614n = f35615o;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static /* synthetic */ Unit j(f1 f1Var) {
        a6.f.d(f1Var.m());
        f1Var.u().c0().p();
        x.f(f1Var.n(), f1Var.u(), f1Var.s());
        return Unit.f22483a;
    }

    @Deprecated
    public static f1 o() {
        synchronized (f35616p) {
            try {
                f1 f1Var = f35614n;
                if (f1Var != null) {
                    return f1Var;
                }
                return f35615o;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static f1 p(Context context) {
        f1 f1VarO;
        synchronized (f35616p) {
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

    @Override // x5.p0
    public x5.a0 a(String str) {
        return g6.h.o(str, this);
    }

    @Override // x5.p0
    public x5.a0 b(String str) {
        return g6.h.k(str, this);
    }

    @Override // x5.p0
    public x5.a0 c(List<? extends x5.q0> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
        }
        return new f0(this, list).b();
    }

    @Override // x5.p0
    public x5.a0 e(String str, x5.i iVar, x5.g0 g0Var) {
        return iVar == x5.i.UPDATE ? m1.e(this, str, g0Var) : l(str, iVar, g0Var).b();
    }

    @Override // x5.p0
    public x5.a0 f(String str, x5.j jVar, List<x5.z> list) {
        return new f0(this, str, jVar, list).b();
    }

    public x5.a0 k(UUID uuid) {
        return g6.h.h(uuid, this);
    }

    public f0 l(String str, x5.i iVar, x5.g0 g0Var) {
        return new f0(this, str, iVar == x5.i.KEEP ? x5.j.KEEP : x5.j.REPLACE, Collections.singletonList(g0Var));
    }

    public Context m() {
        return this.b;
    }

    public androidx.work.a n() {
        return this.f35617c;
    }

    public g6.w q() {
        return this.f35622h;
    }

    public s r() {
        return this.f35621g;
    }

    public List<u> s() {
        return this.f35620f;
    }

    public d6.n t() {
        return this.f35625k;
    }

    public WorkDatabase u() {
        return this.f35618d;
    }

    public h6.b v() {
        return this.f35619e;
    }

    public void w() {
        synchronized (f35616p) {
            try {
                this.f35623i = true;
                BroadcastReceiver.PendingResult pendingResult = this.f35624j;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.f35624j = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void x() {
        x5.m0.a(n().getTracer(), "ReschedulingWork", new Function0() { // from class: y5.e1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return f1.j(this.f35602a);
            }
        });
    }

    public void y(BroadcastReceiver.PendingResult pendingResult) {
        synchronized (f35616p) {
            try {
                BroadcastReceiver.PendingResult pendingResult2 = this.f35624j;
                if (pendingResult2 != null) {
                    pendingResult2.finish();
                }
                this.f35624j = pendingResult;
                if (this.f35623i) {
                    pendingResult.finish();
                    this.f35624j = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void z(WorkGenerationalId workGenerationalId, int i10) {
        this.f35619e.d(new g6.z(this.f35621g, new y(workGenerationalId), true, i10));
    }
}
