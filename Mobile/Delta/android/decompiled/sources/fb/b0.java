package fb;

import android.app.Activity;
import android.app.Application;
import android.app.PendingIntent;
import android.content.pm.PackageInfo;
import android.os.Looper;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.games_v2.zzq;
import com.google.android.gms.internal.games_v2.zzx;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.roblox.client.personasdk.BuildConfig;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Locale;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class b0 implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f16508a = new AtomicReference(r.UNINITIALIZED);
    public final AtomicReference b = new AtomicReference(p.AUTOMATIC);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Queue f16509c = new ArrayDeque();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReference f16510d = new AtomicReference();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicReference f16511e = new AtomicReference();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Application f16512f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ga.o f16513g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c0 f16514h;

    public b0(Application application, ga.o oVar, com.google.android.gms.games.internal.v2.resolution.a aVar, c0 c0Var) {
        this.f16512f = application;
        this.f16513g = oVar;
        this.f16514h = c0Var;
    }

    public static boolean i() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static Task j(final u1 u1Var) {
        if (i()) {
            return (Task) u1Var.zza();
        }
        final sb.k kVar = new sb.k();
        sb.l.f30589a.execute(new Runnable() { // from class: fb.x
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                Task task = (Task) u1Var.zza();
                final sb.k kVar2 = kVar;
                task.addOnCompleteListener(new OnCompleteListener() { // from class: fb.z
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final /* synthetic */ void onComplete(Task task2) {
                        sb.k kVar3 = kVar2;
                        if (task2.isSuccessful()) {
                            kVar3.e(task2.getResult());
                            return;
                        }
                        Exception exception = task2.getException();
                        b1.a(exception);
                        kVar3.d(exception);
                    }
                });
            }
        });
        return kVar.a();
    }

    public static k9.b k() {
        return new k9.b(new Status(4));
    }

    public static Task l(AtomicReference atomicReference, sb.k kVar) {
        int iOrdinal = ((r) atomicReference.get()).ordinal();
        if (iOrdinal == 0) {
            return sb.m.e(new k9.b(new Status(10)));
        }
        if (iOrdinal == 2) {
            return sb.m.f(da.c.b);
        }
        if (iOrdinal != 3 && kVar != null) {
            Task taskA = kVar.a();
            if (taskA.isSuccessful()) {
                return ((Boolean) taskA.getResult()).booleanValue() ? sb.m.f(da.c.b) : sb.m.f(da.c.f14506c);
            }
            final sb.k kVar2 = new sb.k();
            taskA.c(t1.a(), new OnCompleteListener() { // from class: fb.y
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final /* synthetic */ void onComplete(Task task) {
                    sb.k kVar3 = kVar2;
                    if (task.isSuccessful() && ((Boolean) task.getResult()).booleanValue()) {
                        kVar3.e(da.c.b);
                    } else {
                        kVar3.e(da.c.f14506c);
                    }
                }
            });
            return kVar2.a();
        }
        return sb.m.f(da.c.f14506c);
    }

    @Override // fb.m
    public final Task a(l lVar) {
        r rVar = (r) this.f16508a.get();
        s0.c("GamesApiManager", "Executing API call with authentication state: ".concat(String.valueOf(rVar)));
        if (rVar == r.AUTHENTICATED) {
            return lVar.a((k9.e) this.f16511e.get());
        }
        if (rVar == r.AUTHENTICATION_FAILED) {
            return sb.m.e(k());
        }
        if (rVar == r.UNINITIALIZED) {
            return sb.m.e(new k9.b(new Status(10)));
        }
        sb.k kVar = new sb.k();
        final t tVar = new t(lVar, kVar);
        Runnable runnable = new Runnable() { // from class: fb.a0
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f16503a.b(tVar);
            }
        };
        if (i()) {
            runnable.run();
        } else {
            sb.l.f30589a.execute(runnable);
        }
        return kVar.a();
    }

    public final /* synthetic */ void b(t tVar) {
        n9.m.e("Must be called on the main thread.");
        r rVar = (r) this.f16508a.get();
        if (rVar == r.AUTHENTICATED) {
            tVar.a((k9.e) this.f16511e.get());
        } else if (rVar == r.AUTHENTICATION_FAILED) {
            tVar.b(k());
        } else {
            this.f16509c.add(tVar);
        }
    }

    public final /* synthetic */ Task c() {
        f(1);
        return l(this.f16508a, (sb.k) this.f16510d.get());
    }

    public final /* synthetic */ void d(sb.k kVar, zzq zzqVar, Task task) {
        if (!task.isSuccessful()) {
            Exception exception = task.getException();
            b1.a(exception);
            s0.b("GamesApiManager", "Authentication task failed", exception);
            h(kVar, zzqVar.zzc(), null, false, !zzqVar.zzd());
            return;
        }
        g0 g0Var = (g0) task.getResult();
        if (!g0Var.c()) {
            s0.a("GamesApiManager", "Failed to authenticate: ".concat(String.valueOf(g0Var)));
            h(kVar, zzqVar.zzc(), g0Var.e(), true, !zzqVar.zzd());
            return;
        }
        String strD = g0Var.d();
        if (strD == null) {
            s0.d("GamesApiManager", "Unexpected state: game run token absent");
            h(kVar, zzqVar.zzc(), null, false, !zzqVar.zzd());
            return;
        }
        s0.a("GamesApiManager", "Successfully authenticated");
        n9.m.e("Must be called on the main thread.");
        da.n nVarA = da.o.a();
        nVarA.a(2101523);
        nVarA.b(strD);
        ga.p pVarD = ga.q.d();
        pVarD.a(true);
        pVarD.b(true);
        pVarD.c(true);
        nVarA.c(pVarD.d());
        r0 r0Var = new r0(this.f16512f, nVarA.d());
        this.f16511e.set(r0Var);
        this.f16508a.set(r.AUTHENTICATED);
        kVar.e(Boolean.TRUE);
        Iterator it = this.f16509c.iterator();
        while (it.hasNext()) {
            ((t) it.next()).a(r0Var);
            it.remove();
        }
    }

    public final /* synthetic */ void e(sb.k kVar, int i10, Task task) {
        if (!task.isSuccessful()) {
            Exception exception = task.getException();
            b1.a(exception);
            s0.e("GamesApiManager", "Resolution failed", exception);
            h(kVar, i10, null, false, true);
            return;
        }
        la.a aVar = (la.a) task.getResult();
        if (aVar.c()) {
            s0.a("GamesApiManager", "Resolution successful");
            g(kVar, zzq.w3(i10, zzx.a(aVar.d())));
        } else {
            s0.a("GamesApiManager", "Resolution attempt was canceled");
            h(kVar, i10, null, false, true);
        }
    }

    public final void f(int i10) {
        p pVar;
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 45);
        sb2.append("startAuthenticationIfNecessary() signInType: ");
        sb2.append(i10);
        s0.a("GamesApiManager", sb2.toString());
        n9.m.e("Must be called on the main thread.");
        AtomicReference atomicReference = this.f16508a;
        r rVar = r.UNINITIALIZED;
        r rVar2 = r.AUTHENTICATING;
        int i11 = 0;
        if (!p1.t.a(atomicReference, rVar, rVar2)) {
            if (i10 != 1) {
                if (p1.t.a(atomicReference, r.AUTHENTICATION_FAILED, rVar2)) {
                    i10 = 0;
                } else {
                    boolean zA = p1.t.a(this.b, p.AUTOMATIC, p.AUTOMATIC_PENDING_EXPLICIT);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(zA).length() + 83);
                    sb3.append("Explicit sign-in during existing authentication. Marking pending explicit sign-in: ");
                    sb3.append(zA);
                    s0.a("GamesApiManager", sb3.toString());
                }
            }
            s0.a("GamesApiManager", "Authentication attempt skipped. Already authenticated or authenticating. State: ".concat(String.valueOf(atomicReference.get())));
            return;
        }
        AtomicReference atomicReference2 = this.f16510d;
        sb.k kVar = (sb.k) atomicReference2.get();
        if (kVar != null) {
            kVar.d(new IllegalStateException("New authentication attempt in progress"));
        }
        sb.k kVar2 = new sb.k();
        atomicReference2.set(kVar2);
        AtomicReference atomicReference3 = this.b;
        if (i10 == 0) {
            pVar = p.EXPLICIT;
        } else {
            pVar = p.AUTOMATIC;
            i11 = 1;
        }
        atomicReference3.set(pVar);
        g(kVar2, zzq.v3(i11));
    }

    public final void g(final sb.k kVar, final zzq zzqVar) {
        s0.a("GamesApiManager", "Attempting authentication: ".concat(zzqVar.toString()));
        this.f16514h.a(zzqVar).c(sb.l.f30589a, new OnCompleteListener() { // from class: fb.v
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final /* synthetic */ void onComplete(Task task) {
                this.f16580a.d(kVar, zzqVar, task);
            }
        });
    }

    public final void h(final sb.k kVar, final int i10, PendingIntent pendingIntent, boolean z10, boolean z11) {
        Activity activityD;
        n9.m.e("Must be called on the main thread.");
        Application application = this.f16512f;
        int iA = u9.d.a(application, "com.google.android.gms");
        Locale locale = Locale.US;
        s0.a("GamesApiManager", String.format(locale, "GmsCore version is %d", Integer.valueOf(iA)));
        if (iA < 220812000) {
            PackageInfo packageInfoB = u9.d.b(application, BuildConfig.STORE_PACKAGE);
            if (packageInfoB == null) {
                s0.a("GamesApiManager", "PlayStore is not installed");
            } else {
                int i11 = packageInfoB.versionCode;
                if (i11 < 82470600) {
                    s0.a("GamesApiManager", String.format(locale, "PlayStore version is below resolution threshold: %s", Integer.valueOf(i11)));
                } else {
                    s0.a("GamesApiManager", "Installed PlayStore version can be used for resolution.");
                }
            }
            s0.d("GamesApiManager", "PlayStore is too old or not available and the version of GmsCore would attempt PGA installation on automatic sign-in. Skipping it.");
            kVar.e(Boolean.FALSE);
            this.f16508a.set(r.AUTHENTICATION_FAILED);
            return;
        }
        if (z10 && pendingIntent != null && (activityD = this.f16513g.d()) != null) {
            com.google.android.gms.games.internal.v2.resolution.a.b(activityD, pendingIntent).c(sb.l.f30589a, new OnCompleteListener() { // from class: fb.w
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final /* synthetic */ void onComplete(Task task) {
                    this.f16583a.e(kVar, i10, task);
                }
            });
            s0.a("GamesApiManager", "Resolution triggered");
            return;
        }
        boolean zA = p1.t.a(this.b, p.AUTOMATIC_PENDING_EXPLICIT, p.EXPLICIT);
        if (!z11 && zA) {
            s0.a("GamesApiManager", "Consumed pending explicit sign-in. Attempting explicit sign-in");
            g(kVar, zzq.v3(0));
            return;
        }
        kVar.e(Boolean.FALSE);
        this.f16508a.set(r.AUTHENTICATION_FAILED);
        Iterator it = this.f16509c.iterator();
        while (it.hasNext()) {
            ((t) it.next()).b(k());
            it.remove();
        }
    }

    @Override // fb.m
    public final Task zzc() {
        return l(this.f16508a, (sb.k) this.f16510d.get());
    }

    @Override // fb.m
    public final Task zzd() {
        return j(new u1() { // from class: fb.u
            @Override // fb.u1
            public final /* synthetic */ Object zza() {
                return this.f16579a.c();
            }
        });
    }
}
