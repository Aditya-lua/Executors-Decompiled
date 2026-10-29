package p125fb;

import android.app.Activity;
import android.app.Application;
import android.app.PendingIntent;
import android.content.pm.PackageInfo;
import android.os.Looper;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.internal.p049v2.resolution.C1938a;
import com.google.android.gms.internal.games_v2.zzq;
import com.google.android.gms.internal.games_v2.zzx;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.roblox.client.personasdk.BuildConfig;
import ga.C6072o;
import ga.C6073p;
import ga.C6074q;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Locale;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicReference;
import la.C8096a;
import p073da.C4499c;
import p073da.C4510n;
import p073da.C4511o;
import p242k9.AbstractC7495e;
import p242k9.C7492b;
import p305n9.C8953m;
import p348p1.C10146t;
import p462u9.C11813d;
import sb.C11264k;
import sb.C11266l;
import sb.C11268m;

/* JADX INFO: renamed from: fb.b0 */
/* JADX INFO: loaded from: classes.dex */
public final class C5501b0 implements InterfaceC5541m {

    /* JADX INFO: renamed from: a */
    public final AtomicReference f21267a = new AtomicReference(EnumC5556r.UNINITIALIZED);

    /* JADX INFO: renamed from: b */
    public final AtomicReference f21268b = new AtomicReference(EnumC5550p.AUTOMATIC);

    /* JADX INFO: renamed from: c */
    public final Queue f21269c = new ArrayDeque();

    /* JADX INFO: renamed from: d */
    public final AtomicReference f21270d = new AtomicReference();

    /* JADX INFO: renamed from: e */
    public final AtomicReference f21271e = new AtomicReference();

    /* JADX INFO: renamed from: f */
    public final Application f21272f;

    /* JADX INFO: renamed from: g */
    public final C6072o f21273g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC5505c0 f21274h;

    public C5501b0(Application application, C6072o c6072o, C1938a c1938a, InterfaceC5505c0 interfaceC5505c0) {
        this.f21272f = application;
        this.f21273g = c6072o;
        this.f21274h = interfaceC5505c0;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m25155i() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    /* JADX INFO: renamed from: j */
    public static Task m25156j(final InterfaceC5567u1 interfaceC5567u1) {
        if (m25155i()) {
            return (Task) interfaceC5567u1.zza();
        }
        final C11264k c11264k = new C11264k();
        C11266l.f39580a.execute(new Runnable() { // from class: fb.x
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                Task task = (Task) interfaceC5567u1.zza();
                final C11264k c11264k2 = c11264k;
                task.addOnCompleteListener(new OnCompleteListener() { // from class: fb.z
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final /* synthetic */ void onComplete(Task task2) {
                        C11264k c11264k3 = c11264k2;
                        if (task2.isSuccessful()) {
                            c11264k3.m42330e(task2.getResult());
                            return;
                        }
                        Exception exception = task2.getException();
                        C5502b1.m25167a(exception);
                        c11264k3.m42329d(exception);
                    }
                });
            }
        });
        return c11264k.m42326a();
    }

    /* JADX INFO: renamed from: k */
    public static C7492b m25157k() {
        return new C7492b(new Status(4));
    }

    /* JADX INFO: renamed from: l */
    public static Task m25158l(AtomicReference atomicReference, C11264k c11264k) {
        int iOrdinal = ((EnumC5556r) atomicReference.get()).ordinal();
        if (iOrdinal == 0) {
            return C11268m.m42335e(new C7492b(new Status(10)));
        }
        if (iOrdinal == 2) {
            return C11268m.m42336f(C4499c.f18533b);
        }
        if (iOrdinal != 3 && c11264k != null) {
            Task taskM42326a = c11264k.m42326a();
            if (taskM42326a.isSuccessful()) {
                return ((Boolean) taskM42326a.getResult()).booleanValue() ? C11268m.m42336f(C4499c.f18533b) : C11268m.m42336f(C4499c.f18534c);
            }
            final C11264k c11264k2 = new C11264k();
            taskM42326a.mo11889c(C5564t1.m25231a(), new OnCompleteListener() { // from class: fb.y
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final /* synthetic */ void onComplete(Task task) {
                    C11264k c11264k3 = c11264k2;
                    if (task.isSuccessful() && ((Boolean) task.getResult()).booleanValue()) {
                        c11264k3.m42330e(C4499c.f18533b);
                    } else {
                        c11264k3.m42330e(C4499c.f18534c);
                    }
                }
            });
            return c11264k2.m42326a();
        }
        return C11268m.m42336f(C4499c.f18534c);
    }

    @Override // p125fb.InterfaceC5541m
    /* JADX INFO: renamed from: a */
    public final Task mo25159a(InterfaceC5538l interfaceC5538l) {
        EnumC5556r enumC5556r = (EnumC5556r) this.f21267a.get();
        C5560s0.m25222c("GamesApiManager", "Executing API call with authentication state: ".concat(String.valueOf(enumC5556r)));
        if (enumC5556r == EnumC5556r.AUTHENTICATED) {
            return interfaceC5538l.mo25173a((AbstractC7495e) this.f21271e.get());
        }
        if (enumC5556r == EnumC5556r.AUTHENTICATION_FAILED) {
            return C11268m.m42335e(m25157k());
        }
        if (enumC5556r == EnumC5556r.UNINITIALIZED) {
            return C11268m.m42335e(new C7492b(new Status(10)));
        }
        C11264k c11264k = new C11264k();
        final C5562t c5562t = new C5562t(interfaceC5538l, c11264k);
        Runnable runnable = new Runnable() { // from class: fb.a0
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f21260a.m25160b(c5562t);
            }
        };
        if (m25155i()) {
            runnable.run();
        } else {
            C11266l.f39580a.execute(runnable);
        }
        return c11264k.m42326a();
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void m25160b(C5562t c5562t) {
        C8953m.m36040e("Must be called on the main thread.");
        EnumC5556r enumC5556r = (EnumC5556r) this.f21267a.get();
        if (enumC5556r == EnumC5556r.AUTHENTICATED) {
            c5562t.m25228a((AbstractC7495e) this.f21271e.get());
        } else if (enumC5556r == EnumC5556r.AUTHENTICATION_FAILED) {
            c5562t.m25229b(m25157k());
        } else {
            this.f21269c.add(c5562t);
        }
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Task m25161c() {
        m25164f(1);
        return m25158l(this.f21267a, (C11264k) this.f21270d.get());
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m25162d(C11264k c11264k, zzq zzqVar, Task task) {
        if (!task.isSuccessful()) {
            Exception exception = task.getException();
            C5502b1.m25167a(exception);
            C5560s0.m25221b("GamesApiManager", "Authentication task failed", exception);
            m25166h(c11264k, zzqVar.zzc(), null, false, !zzqVar.zzd());
            return;
        }
        C5521g0 c5521g0 = (C5521g0) task.getResult();
        if (!c5521g0.m25181c()) {
            C5560s0.m25220a("GamesApiManager", "Failed to authenticate: ".concat(String.valueOf(c5521g0)));
            m25166h(c11264k, zzqVar.zzc(), c5521g0.m25183e(), true, !zzqVar.zzd());
            return;
        }
        String strM25182d = c5521g0.m25182d();
        if (strM25182d == null) {
            C5560s0.m25223d("GamesApiManager", "Unexpected state: game run token absent");
            m25166h(c11264k, zzqVar.zzc(), null, false, !zzqVar.zzd());
            return;
        }
        C5560s0.m25220a("GamesApiManager", "Successfully authenticated");
        C8953m.m36040e("Must be called on the main thread.");
        C4510n c4510nM22476a = C4511o.m22476a();
        c4510nM22476a.m22472a(2101523);
        c4510nM22476a.m22473b(strM25182d);
        C6073p c6073pM26940d = C6074q.m26940d();
        c6073pM26940d.m26933a(true);
        c6073pM26940d.m26934b(true);
        c6073pM26940d.m26935c(true);
        c4510nM22476a.m22474c(c6073pM26940d.m26936d());
        C5557r0 c5557r0 = new C5557r0(this.f21272f, c4510nM22476a.m22475d());
        this.f21271e.set(c5557r0);
        this.f21267a.set(EnumC5556r.AUTHENTICATED);
        c11264k.m42330e(Boolean.TRUE);
        Iterator it = this.f21269c.iterator();
        while (it.hasNext()) {
            ((C5562t) it.next()).m25228a(c5557r0);
            it.remove();
        }
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m25163e(C11264k c11264k, int i10, Task task) {
        if (!task.isSuccessful()) {
            Exception exception = task.getException();
            C5502b1.m25167a(exception);
            C5560s0.m25224e("GamesApiManager", "Resolution failed", exception);
            m25166h(c11264k, i10, null, false, true);
            return;
        }
        C8096a c8096a = (C8096a) task.getResult();
        if (c8096a.m33318c()) {
            C5560s0.m25220a("GamesApiManager", "Resolution successful");
            m25165g(c11264k, zzq.m9569w3(i10, zzx.m9570a(c8096a.m33319d())));
        } else {
            C5560s0.m25220a("GamesApiManager", "Resolution attempt was canceled");
            m25166h(c11264k, i10, null, false, true);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m25164f(int i10) {
        EnumC5550p enumC5550p;
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 45);
        sb2.append("startAuthenticationIfNecessary() signInType: ");
        sb2.append(i10);
        C5560s0.m25220a("GamesApiManager", sb2.toString());
        C8953m.m36040e("Must be called on the main thread.");
        AtomicReference atomicReference = this.f21267a;
        EnumC5556r enumC5556r = EnumC5556r.UNINITIALIZED;
        EnumC5556r enumC5556r2 = EnumC5556r.AUTHENTICATING;
        int i11 = 0;
        if (!C10146t.m39085a(atomicReference, enumC5556r, enumC5556r2)) {
            if (i10 != 1) {
                if (C10146t.m39085a(atomicReference, EnumC5556r.AUTHENTICATION_FAILED, enumC5556r2)) {
                    i10 = 0;
                } else {
                    boolean zM39085a = C10146t.m39085a(this.f21268b, EnumC5550p.AUTOMATIC, EnumC5550p.AUTOMATIC_PENDING_EXPLICIT);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(zM39085a).length() + 83);
                    sb3.append("Explicit sign-in during existing authentication. Marking pending explicit sign-in: ");
                    sb3.append(zM39085a);
                    C5560s0.m25220a("GamesApiManager", sb3.toString());
                }
            }
            C5560s0.m25220a("GamesApiManager", "Authentication attempt skipped. Already authenticated or authenticating. State: ".concat(String.valueOf(atomicReference.get())));
            return;
        }
        AtomicReference atomicReference2 = this.f21270d;
        C11264k c11264k = (C11264k) atomicReference2.get();
        if (c11264k != null) {
            c11264k.m42329d(new IllegalStateException("New authentication attempt in progress"));
        }
        C11264k c11264k2 = new C11264k();
        atomicReference2.set(c11264k2);
        AtomicReference atomicReference3 = this.f21268b;
        if (i10 == 0) {
            enumC5550p = EnumC5550p.EXPLICIT;
        } else {
            enumC5550p = EnumC5550p.AUTOMATIC;
            i11 = 1;
        }
        atomicReference3.set(enumC5550p);
        m25165g(c11264k2, zzq.m9568v3(i11));
    }

    /* JADX INFO: renamed from: g */
    public final void m25165g(final C11264k c11264k, final zzq zzqVar) {
        C5560s0.m25220a("GamesApiManager", "Attempting authentication: ".concat(zzqVar.toString()));
        this.f21274h.mo25169a(zzqVar).mo11889c(C11266l.f39580a, new OnCompleteListener() { // from class: fb.v
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final /* synthetic */ void onComplete(Task task) {
                this.f21359a.m25162d(c11264k, zzqVar, task);
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public final void m25166h(final C11264k c11264k, final int i10, PendingIntent pendingIntent, boolean z10, boolean z11) {
        Activity activityM26928d;
        C8953m.m36040e("Must be called on the main thread.");
        Application application = this.f21272f;
        int iM44173a = C11813d.m44173a(application, "com.google.android.gms");
        Locale locale = Locale.US;
        C5560s0.m25220a("GamesApiManager", String.format(locale, "GmsCore version is %d", Integer.valueOf(iM44173a)));
        if (iM44173a < 220812000) {
            PackageInfo packageInfoM44174b = C11813d.m44174b(application, BuildConfig.STORE_PACKAGE);
            if (packageInfoM44174b == null) {
                C5560s0.m25220a("GamesApiManager", "PlayStore is not installed");
            } else {
                int i11 = packageInfoM44174b.versionCode;
                if (i11 < 82470600) {
                    C5560s0.m25220a("GamesApiManager", String.format(locale, "PlayStore version is below resolution threshold: %s", Integer.valueOf(i11)));
                } else {
                    C5560s0.m25220a("GamesApiManager", "Installed PlayStore version can be used for resolution.");
                }
            }
            C5560s0.m25223d("GamesApiManager", "PlayStore is too old or not available and the version of GmsCore would attempt PGA installation on automatic sign-in. Skipping it.");
            c11264k.m42330e(Boolean.FALSE);
            this.f21267a.set(EnumC5556r.AUTHENTICATION_FAILED);
            return;
        }
        if (z10 && pendingIntent != null && (activityM26928d = this.f21273g.m26928d()) != null) {
            C1938a.m9454b(activityM26928d, pendingIntent).mo11889c(C11266l.f39580a, new OnCompleteListener() { // from class: fb.w
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final /* synthetic */ void onComplete(Task task) {
                    this.f21364a.m25163e(c11264k, i10, task);
                }
            });
            C5560s0.m25220a("GamesApiManager", "Resolution triggered");
            return;
        }
        boolean zM39085a = C10146t.m39085a(this.f21268b, EnumC5550p.AUTOMATIC_PENDING_EXPLICIT, EnumC5550p.EXPLICIT);
        if (!z11 && zM39085a) {
            C5560s0.m25220a("GamesApiManager", "Consumed pending explicit sign-in. Attempting explicit sign-in");
            m25165g(c11264k, zzq.m9568v3(0));
            return;
        }
        c11264k.m42330e(Boolean.FALSE);
        this.f21267a.set(EnumC5556r.AUTHENTICATION_FAILED);
        Iterator it = this.f21269c.iterator();
        while (it.hasNext()) {
            ((C5562t) it.next()).m25229b(m25157k());
            it.remove();
        }
    }

    @Override // p125fb.InterfaceC5541m
    public final Task zzc() {
        return m25158l(this.f21267a, (C11264k) this.f21270d.get());
    }

    @Override // p125fb.InterfaceC5541m
    public final Task zzd() {
        return m25156j(new InterfaceC5567u1() { // from class: fb.u
            @Override // p125fb.InterfaceC5567u1
            public final /* synthetic */ Object zza() {
                return this.f21358a.m25161c();
            }
        });
    }
}
