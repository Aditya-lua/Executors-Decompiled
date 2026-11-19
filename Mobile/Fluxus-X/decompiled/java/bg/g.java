package bg;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import o9.s;
import of.x;

/* JADX INFO: loaded from: classes2.dex */
public class g implements h {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Object f3992m = new Object();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final ThreadFactory f3993n = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hf.e f3994a;
    public final eg.c b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dg.c f3995c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p f3996d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x<dg.b> f3997e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n f3998f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f3999g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ExecutorService f4000h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Executor f4001i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f4002j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Set<cg.a> f4003k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List<o> f4004l;

    public class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicInteger f4005a = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        @SuppressLint({"ThreadPoolCreation"})
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", Integer.valueOf(this.f4005a.getAndIncrement())));
        }
    }

    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4006a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[eg.f.b.values().length];
            b = iArr;
            try {
                iArr[eg.f.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[eg.f.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[eg.f.b.AUTH_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[eg.d.b.values().length];
            f4006a = iArr2;
            try {
                iArr2[eg.d.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4006a[eg.d.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    @SuppressLint({"ThreadPoolCreation"})
    public g(final hf.e eVar, @NonNull ag.b<yf.i> bVar, @NonNull ExecutorService executorService, @NonNull Executor executor) {
        this(executorService, executor, eVar, new eg.c(eVar.j(), bVar), new dg.c(eVar), p.c(), new x(new ag.b() { // from class: bg.c
            @Override // ag.b
            public final Object get() {
                return g.e(eVar);
            }
        }), new n());
    }

    public static /* synthetic */ dg.b e(hf.e eVar) {
        return new dg.b(eVar);
    }

    @NonNull
    public static g p() {
        return q(hf.e.l());
    }

    @NonNull
    public static g q(@NonNull hf.e eVar) {
        s.b(eVar != null, "Null is not a valid value of FirebaseApp.");
        return (g) eVar.i(h.class);
    }

    public final synchronized void A(String str) {
        this.f4002j = str;
    }

    public final synchronized void B(dg.d dVar, dg.d dVar2) {
        if (this.f4003k.size() != 0 && !TextUtils.equals(dVar.d(), dVar2.d())) {
            Iterator<cg.a> it = this.f4003k.iterator();
            while (it.hasNext()) {
                it.next().a(dVar2.d());
            }
        }
    }

    @Override // bg.h
    @NonNull
    public Task<m> a(final boolean z10) {
        v();
        Task<m> taskF = f();
        this.f4000h.execute(new Runnable() { // from class: bg.f
            @Override // java.lang.Runnable
            public final void run() {
                this.f3991a.j(z10);
            }
        });
        return taskF;
    }

    public final Task<m> f() {
        tb.k kVar = new tb.k();
        h(new k(this.f3996d, kVar));
        return kVar.a();
    }

    public final Task<String> g() {
        tb.k kVar = new tb.k();
        h(new l(kVar));
        return kVar.a();
    }

    @Override // bg.h
    @NonNull
    public Task<String> getId() {
        v();
        String strN = n();
        if (strN != null) {
            return tb.m.f(strN);
        }
        Task<String> taskG = g();
        this.f4000h.execute(new Runnable() { // from class: bg.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f3989a.j(false);
            }
        });
        return taskG;
    }

    public final void h(o oVar) {
        synchronized (this.f3999g) {
            this.f4004l.add(oVar);
        }
    }

    public final void i(boolean z10) {
        dg.d dVarX;
        dg.d dVarR = r();
        try {
            if (dVarR.i() || dVarR.l()) {
                dVarX = x(dVarR);
            } else {
                if (!z10 && !this.f3996d.f(dVarR)) {
                    return;
                }
                dVarX = k(dVarR);
            }
            u(dVarX);
            B(dVarR, dVarX);
            if (dVarX.k()) {
                A(dVarX.d());
            }
            if (dVarX.i()) {
                y(new i(i.a.BAD_CONFIG));
            } else if (dVarX.j()) {
                y(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
            } else {
                z(dVarX);
            }
        } catch (i e10) {
            y(e10);
        }
    }

    public final void j(final boolean z10) {
        dg.d dVarS = s();
        if (z10) {
            dVarS = dVarS.p();
        }
        z(dVarS);
        this.f4001i.execute(new Runnable() { // from class: bg.e
            @Override // java.lang.Runnable
            public final void run() {
                this.f3990a.i(z10);
            }
        });
    }

    public final dg.d k(@NonNull dg.d dVar) throws i {
        eg.f fVarE = this.b.e(l(), dVar.d(), t(), dVar.f());
        int i10 = b.b[fVarE.b().ordinal()];
        if (i10 == 1) {
            return dVar.o(fVarE.c(), fVarE.d(), this.f3996d.b());
        }
        if (i10 == 2) {
            return dVar.q("BAD CONFIG");
        }
        if (i10 != 3) {
            throw new i("Firebase Installations Service is unavailable. Please try again later.", i.a.UNAVAILABLE);
        }
        A(null);
        return dVar.r();
    }

    public String l() {
        return this.f3994a.n().b();
    }

    public String m() {
        return this.f3994a.n().c();
    }

    public final synchronized String n() {
        return this.f4002j;
    }

    public final dg.b o() {
        return this.f3997e.get();
    }

    public final dg.d r() {
        dg.d dVarD;
        synchronized (f3992m) {
            try {
                bg.b bVarA = bg.b.a(this.f3994a.j(), "generatefid.lock");
                try {
                    dVarD = this.f3995c.d();
                    if (bVarA != null) {
                        bVarA.b();
                    }
                } catch (Throwable th2) {
                    if (bVarA != null) {
                        bVarA.b();
                    }
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return dVarD;
    }

    public final dg.d s() {
        dg.d dVarD;
        synchronized (f3992m) {
            try {
                bg.b bVarA = bg.b.a(this.f3994a.j(), "generatefid.lock");
                try {
                    dVarD = this.f3995c.d();
                    if (dVarD.j()) {
                        dVarD = this.f3995c.b(dVarD.t(w(dVarD)));
                    }
                    if (bVarA != null) {
                        bVarA.b();
                    }
                } catch (Throwable th2) {
                    if (bVarA != null) {
                        bVarA.b();
                    }
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return dVarD;
    }

    public String t() {
        return this.f3994a.n().e();
    }

    public final void u(dg.d dVar) {
        synchronized (f3992m) {
            try {
                bg.b bVarA = bg.b.a(this.f3994a.j(), "generatefid.lock");
                try {
                    this.f3995c.b(dVar);
                    if (bVarA != null) {
                        bVarA.b();
                    }
                } catch (Throwable th2) {
                    if (bVarA != null) {
                        bVarA.b();
                    }
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void v() {
        s.g(m(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        s.g(t(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        s.g(l(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        s.b(p.h(m()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        s.b(p.g(l()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    public final String w(dg.d dVar) {
        if ((!this.f3994a.m().equals("CHIME_ANDROID_SDK") && !this.f3994a.u()) || !dVar.m()) {
            return this.f3998f.a();
        }
        String strF = o().f();
        return TextUtils.isEmpty(strF) ? this.f3998f.a() : strF;
    }

    public final dg.d x(dg.d dVar) throws i {
        eg.d dVarD = this.b.d(l(), dVar.d(), t(), m(), (dVar.d() == null || dVar.d().length() != 11) ? null : o().i());
        int i10 = b.f4006a[dVarD.e().ordinal()];
        if (i10 == 1) {
            return dVar.s(dVarD.c(), dVarD.d(), this.f3996d.b(), dVarD.b().c(), dVarD.b().d());
        }
        if (i10 == 2) {
            return dVar.q("BAD CONFIG");
        }
        throw new i("Firebase Installations Service is unavailable. Please try again later.", i.a.UNAVAILABLE);
    }

    public final void y(Exception exc) {
        synchronized (this.f3999g) {
            try {
                Iterator<o> it = this.f4004l.iterator();
                while (it.hasNext()) {
                    if (it.next().a(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void z(dg.d dVar) {
        synchronized (this.f3999g) {
            try {
                Iterator<o> it = this.f4004l.iterator();
                while (it.hasNext()) {
                    if (it.next().b(dVar)) {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @SuppressLint({"ThreadPoolCreation"})
    public g(ExecutorService executorService, Executor executor, hf.e eVar, eg.c cVar, dg.c cVar2, p pVar, x<dg.b> xVar, n nVar) {
        this.f3999g = new Object();
        this.f4003k = new HashSet();
        this.f4004l = new ArrayList();
        this.f3994a = eVar;
        this.b = cVar;
        this.f3995c = cVar2;
        this.f3996d = pVar;
        this.f3997e = xVar;
        this.f3998f = nVar;
        this.f4000h = executorService;
        this.f4001i = executor;
    }
}
