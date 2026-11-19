package gb;

import android.app.Activity;
import android.app.Application;
import android.app.PendingIntent;
import android.content.pm.PackageInfo;
import android.os.Looper;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Locale;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class c0 implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f17598a = new AtomicReference(s.UNINITIALIZED);
    public final AtomicReference b = new AtomicReference(q.AUTOMATIC);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Queue f17599c = new ArrayDeque();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReference f17600d = new AtomicReference();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicReference f17601e = new AtomicReference();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Application f17602f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ha.o f17603g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d0 f17604h;

    public c0(Application application, ha.o oVar, ma.b bVar, d0 d0Var) {
        this.f17602f = application;
        this.f17603g = oVar;
        this.f17604h = d0Var;
    }

    public static boolean i() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static Task j(final v1 v1Var) {
        if (i()) {
            return (Task) v1Var.zza();
        }
        final tb.k kVar = new tb.k();
        tb.l.f32297a.execute(new Runnable() { // from class: gb.y
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                Task task = (Task) v1Var.zza();
                final tb.k kVar2 = kVar;
                task.addOnCompleteListener(new OnCompleteListener() { // from class: gb.a0
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final /* synthetic */ void onComplete(Task task2) {
                        tb.k kVar3 = kVar2;
                        if (task2.isSuccessful()) {
                            kVar3.e(task2.getResult());
                            return;
                        }
                        Exception exception = task2.getException();
                        c1.a(exception);
                        kVar3.d(exception);
                    }
                });
            }
        });
        return kVar.a();
    }

    public static l9.b k() {
        return new l9.b(new Status(4));
    }

    public static Task l(AtomicReference atomicReference, tb.k kVar) {
        int iOrdinal = ((s) atomicReference.get()).ordinal();
        if (iOrdinal == 0) {
            return tb.m.e(new l9.b(new Status(10)));
        }
        if (iOrdinal == 2) {
            return tb.m.f(ea.c.b);
        }
        if (iOrdinal != 3 && kVar != null) {
            Task taskA = kVar.a();
            if (taskA.isSuccessful()) {
                return ((Boolean) taskA.getResult()).booleanValue() ? tb.m.f(ea.c.b) : tb.m.f(ea.c.f13258c);
            }
            final tb.k kVar2 = new tb.k();
            taskA.c(u1.a(), new OnCompleteListener() { // from class: gb.z
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final /* synthetic */ void onComplete(Task task) {
                    tb.k kVar3 = kVar2;
                    if (task.isSuccessful() && ((Boolean) task.getResult()).booleanValue()) {
                        kVar3.e(ea.c.b);
                    } else {
                        kVar3.e(ea.c.f13258c);
                    }
                }
            });
            return kVar2.a();
        }
        return tb.m.f(ea.c.f13258c);
    }

    @Override // gb.n
    public final Task a(m mVar) {
        s sVar = (s) this.f17598a.get();
        t0.c("GamesApiManager", "Executing API call with authentication state: ".concat(String.valueOf(sVar)));
        if (sVar == s.AUTHENTICATED) {
            return mVar.a((l9.g) this.f17601e.get());
        }
        if (sVar == s.AUTHENTICATION_FAILED) {
            return tb.m.e(k());
        }
        if (sVar == s.UNINITIALIZED) {
            return tb.m.e(new l9.b(new Status(10)));
        }
        tb.k kVar = new tb.k();
        final u uVar = new u(mVar, kVar);
        Runnable runnable = new Runnable() { // from class: gb.b0
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f17593a.b(uVar);
            }
        };
        if (i()) {
            runnable.run();
        } else {
            tb.l.f32297a.execute(runnable);
        }
        return kVar.a();
    }

    public final /* synthetic */ void b(u uVar) {
        o9.s.e("Must be called on the main thread.");
        s sVar = (s) this.f17598a.get();
        if (sVar == s.AUTHENTICATED) {
            uVar.a((l9.g) this.f17601e.get());
        } else if (sVar == s.AUTHENTICATION_FAILED) {
            uVar.b(k());
        } else {
            this.f17599c.add(uVar);
        }
    }

    public final /* synthetic */ Task c() {
        f(1);
        return l(this.f17598a, (tb.k) this.f17600d.get());
    }

    public final /* synthetic */ void d(tb.k kVar, d2 d2Var, Task task) {
        if (!task.isSuccessful()) {
            Exception exception = task.getException();
            c1.a(exception);
            t0.b("GamesApiManager", "Authentication task failed", exception);
            h(kVar, d2Var.zzc(), null, false, !d2Var.zzd());
            return;
        }
        h0 h0Var = (h0) task.getResult();
        if (!h0Var.c()) {
            t0.a("GamesApiManager", "Failed to authenticate: ".concat(String.valueOf(h0Var)));
            h(kVar, d2Var.zzc(), h0Var.e(), true, !d2Var.zzd());
            return;
        }
        String strD = h0Var.d();
        if (strD == null) {
            t0.d("GamesApiManager", "Unexpected state: game run token absent");
            h(kVar, d2Var.zzc(), null, false, !d2Var.zzd());
            return;
        }
        t0.a("GamesApiManager", "Successfully authenticated");
        o9.s.e("Must be called on the main thread.");
        ea.w wVarA = ea.x.a();
        wVarA.a(2101523);
        wVarA.b(strD);
        ha.q qVarD = ha.r.d();
        qVarD.a(true);
        qVarD.b(true);
        qVarD.c(true);
        wVarA.c(qVarD.d());
        s0 s0Var = new s0(this.f17602f, wVarA.d());
        this.f17601e.set(s0Var);
        this.f17598a.set(s.AUTHENTICATED);
        kVar.e(Boolean.TRUE);
        Iterator it = this.f17599c.iterator();
        while (it.hasNext()) {
            ((u) it.next()).a(s0Var);
            it.remove();
        }
    }

    public final /* synthetic */ void e(tb.k kVar, int i10, Task task) {
        if (!task.isSuccessful()) {
            Exception exception = task.getException();
            c1.a(exception);
            t0.e("GamesApiManager", "Resolution failed", exception);
            h(kVar, i10, null, false, true);
            return;
        }
        ma.c cVar = (ma.c) task.getResult();
        if (cVar.c()) {
            t0.a("GamesApiManager", "Resolution successful");
            g(kVar, d2.B3(i10, k2.a(cVar.d())));
        } else {
            t0.a("GamesApiManager", "Resolution attempt was canceled");
            h(kVar, i10, null, false, true);
        }
    }

    public final void f(int i10) {
        q qVar;
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 45);
        sb2.append("startAuthenticationIfNecessary() signInType: ");
        sb2.append(i10);
        t0.a("GamesApiManager", sb2.toString());
        o9.s.e("Must be called on the main thread.");
        AtomicReference atomicReference = this.f17598a;
        s sVar = s.UNINITIALIZED;
        s sVar2 = s.AUTHENTICATING;
        int i11 = 0;
        if (!p1.t.a(atomicReference, sVar, sVar2)) {
            if (i10 != 1) {
                if (p1.t.a(atomicReference, s.AUTHENTICATION_FAILED, sVar2)) {
                    i10 = 0;
                } else {
                    boolean zA = p1.t.a(this.b, q.AUTOMATIC, q.AUTOMATIC_PENDING_EXPLICIT);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(zA).length() + 83);
                    sb3.append("Explicit sign-in during existing authentication. Marking pending explicit sign-in: ");
                    sb3.append(zA);
                    t0.a("GamesApiManager", sb3.toString());
                }
            }
            t0.a("GamesApiManager", "Authentication attempt skipped. Already authenticated or authenticating. State: ".concat(String.valueOf(atomicReference.get())));
            return;
        }
        AtomicReference atomicReference2 = this.f17600d;
        tb.k kVar = (tb.k) atomicReference2.get();
        if (kVar != null) {
            kVar.d(new IllegalStateException("New authentication attempt in progress"));
        }
        tb.k kVar2 = new tb.k();
        atomicReference2.set(kVar2);
        AtomicReference atomicReference3 = this.b;
        if (i10 == 0) {
            qVar = q.EXPLICIT;
        } else {
            qVar = q.AUTOMATIC;
            i11 = 1;
        }
        atomicReference3.set(qVar);
        g(kVar2, d2.A3(i11));
    }

    public final void g(final tb.k kVar, final d2 d2Var) {
        t0.a("GamesApiManager", "Attempting authentication: ".concat(d2Var.toString()));
        this.f17604h.a(d2Var).c(tb.l.f32297a, new OnCompleteListener() { // from class: gb.w
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final /* synthetic */ void onComplete(Task task) {
                this.f17675a.d(kVar, d2Var, task);
            }
        });
    }

    public final void h(final tb.k kVar, final int i10, PendingIntent pendingIntent, boolean z10, boolean z11) {
        Activity activityD;
        o9.s.e("Must be called on the main thread.");
        Application application = this.f17602f;
        int iA = v9.d.a(application, "com.google.android.gms");
        Locale locale = Locale.US;
        t0.a("GamesApiManager", String.format(locale, "GmsCore version is %d", Integer.valueOf(iA)));
        if (iA < 220812000) {
            PackageInfo packageInfoB = v9.d.b(application, "com.android.vending");
            if (packageInfoB == null) {
                t0.a("GamesApiManager", "PlayStore is not installed");
            } else {
                int i11 = packageInfoB.versionCode;
                if (i11 < 82470600) {
                    t0.a("GamesApiManager", String.format(locale, "PlayStore version is below resolution threshold: %s", Integer.valueOf(i11)));
                } else {
                    t0.a("GamesApiManager", "Installed PlayStore version can be used for resolution.");
                }
            }
            t0.d("GamesApiManager", "PlayStore is too old or not available and the version of GmsCore would attempt PGA installation on automatic sign-in. Skipping it.");
            kVar.e(Boolean.FALSE);
            this.f17598a.set(s.AUTHENTICATION_FAILED);
            return;
        }
        if (z10 && pendingIntent != null && (activityD = this.f17603g.d()) != null) {
            ma.b.b(activityD, pendingIntent).c(tb.l.f32297a, new OnCompleteListener() { // from class: gb.x
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final /* synthetic */ void onComplete(Task task) {
                    this.f17678a.e(kVar, i10, task);
                }
            });
            t0.a("GamesApiManager", "Resolution triggered");
            return;
        }
        boolean zA = p1.t.a(this.b, q.AUTOMATIC_PENDING_EXPLICIT, q.EXPLICIT);
        if (!z11 && zA) {
            t0.a("GamesApiManager", "Consumed pending explicit sign-in. Attempting explicit sign-in");
            g(kVar, d2.A3(0));
            return;
        }
        kVar.e(Boolean.FALSE);
        this.f17598a.set(s.AUTHENTICATION_FAILED);
        Iterator it = this.f17599c.iterator();
        while (it.hasNext()) {
            ((u) it.next()).b(k());
            it.remove();
        }
    }

    @Override // gb.n
    public final Task zzc() {
        return l(this.f17598a, (tb.k) this.f17600d.get());
    }

    @Override // gb.n
    public final Task zzd() {
        return j(new v1() { // from class: gb.v
            @Override // gb.v1
            public final /* synthetic */ Object zza() {
                return this.f17674a.c();
            }
        });
    }
}
