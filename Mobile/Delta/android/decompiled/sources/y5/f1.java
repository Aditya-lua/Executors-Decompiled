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
    public static final String f36470m = x5.w.i("WorkManagerImpl");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static f1 f36471n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static f1 f36472o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Object f36473p = new Object();
    public Context b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public androidx.work.a f36474c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public WorkDatabase f36475d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public h6.b f36476e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List<u> f36477f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public s f36478g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public g6.w f36479h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f36480i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public BroadcastReceiver.PendingResult f36481j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final d6.n f36482k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final iu.p0 f36483l;

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
        this.f36476e = bVar;
        this.f36475d = workDatabase;
        this.f36478g = sVar;
        this.f36482k = nVar;
        this.f36474c = aVar;
        this.f36477f = list;
        iu.p0 p0VarF = androidx.work.impl.a.f(bVar);
        this.f36483l = p0VarF;
        this.f36479h = new g6.w(this.f36475d);
        x.e(list, this.f36478g, bVar.c(), this.f36475d, aVar);
        this.f36476e.d(new ForceStopRunnable(applicationContext, this));
        d0.c(p0VarF, this.b, aVar, workDatabase);
    }

    public static void i(Context context, androidx.work.a aVar) {
        synchronized (f36473p) {
            try {
                f1 f1Var = f36471n;
                if (f1Var != null && f36472o != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
                if (f1Var == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (f36472o == null) {
                        f36472o = androidx.work.impl.a.c(applicationContext, aVar);
                    }
                    f36471n = f36472o;
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
        return Unit.f22938a;
    }

    @Deprecated
    public static f1 o() {
        synchronized (f36473p) {
            try {
                f1 f1Var = f36471n;
                if (f1Var != null) {
                    return f1Var;
                }
                return f36472o;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static f1 p(Context context) {
        f1 f1VarO;
        synchronized (f36473p) {
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
        return this.f36474c;
    }

    public g6.w q() {
        return this.f36479h;
    }

    public s r() {
        return this.f36478g;
    }

    public List<u> s() {
        return this.f36477f;
    }

    public d6.n t() {
        return this.f36482k;
    }

    public WorkDatabase u() {
        return this.f36475d;
    }

    public h6.b v() {
        return this.f36476e;
    }

    public void w() {
        synchronized (f36473p) {
            try {
                this.f36480i = true;
                BroadcastReceiver.PendingResult pendingResult = this.f36481j;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.f36481j = null;
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
                return f1.j(this.f36459a);
            }
        });
    }

    public void y(BroadcastReceiver.PendingResult pendingResult) {
        synchronized (f36473p) {
            try {
                BroadcastReceiver.PendingResult pendingResult2 = this.f36481j;
                if (pendingResult2 != null) {
                    pendingResult2.finish();
                }
                this.f36481j = pendingResult;
                if (this.f36480i) {
                    pendingResult.finish();
                    this.f36481j = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void z(WorkGenerationalId workGenerationalId, int i10) {
        this.f36476e.d(new g6.z(this.f36478g, new y(workGenerationalId), true, i10));
    }
}
