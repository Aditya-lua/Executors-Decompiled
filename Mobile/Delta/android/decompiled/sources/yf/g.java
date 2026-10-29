package yf;

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
import lf.x;

/* JADX INFO: loaded from: classes2.dex */
public class g implements h {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Object f35861m = new Object();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final ThreadFactory f35862n = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ef.e f35863a;
    public final bg.c b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ag.c f35864c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p f35865d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x<ag.b> f35866e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n f35867f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f35868g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ExecutorService f35869h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Executor f35870i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f35871j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Set<zf.a> f35872k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List<o> f35873l;

    public class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicInteger f35874a = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        @SuppressLint({"ThreadPoolCreation"})
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", Integer.valueOf(this.f35874a.getAndIncrement())));
        }
    }

    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f35875a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[bg.f.b.values().length];
            b = iArr;
            try {
                iArr[bg.f.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[bg.f.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[bg.f.b.AUTH_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[bg.d.b.values().length];
            f35875a = iArr2;
            try {
                iArr2[bg.d.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f35875a[bg.d.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    @SuppressLint({"ThreadPoolCreation"})
    public g(final ef.e eVar, @NonNull xf.b<vf.i> bVar, @NonNull ExecutorService executorService, @NonNull Executor executor) {
        this(executorService, executor, eVar, new bg.c(eVar.j(), bVar), new ag.c(eVar), p.c(), new x(new xf.b() { // from class: yf.c
            @Override // xf.b
            public final Object get() {
                return g.e(eVar);
            }
        }), new n());
    }

    public static /* synthetic */ ag.b e(ef.e eVar) {
        return new ag.b(eVar);
    }

    @NonNull
    public static g p() {
        return q(ef.e.l());
    }

    @NonNull
    public static g q(@NonNull ef.e eVar) {
        n9.m.b(eVar != null, "Null is not a valid value of FirebaseApp.");
        return (g) eVar.i(h.class);
    }

    public final synchronized void A(String str) {
        this.f35871j = str;
    }

    public final synchronized void B(ag.d dVar, ag.d dVar2) {
        if (this.f35872k.size() != 0 && !TextUtils.equals(dVar.d(), dVar2.d())) {
            Iterator<zf.a> it = this.f35872k.iterator();
            while (it.hasNext()) {
                it.next().a(dVar2.d());
            }
        }
    }

    @Override // yf.h
    @NonNull
    public Task<m> a(final boolean z10) {
        v();
        Task<m> taskF = f();
        this.f35869h.execute(new Runnable() { // from class: yf.f
            @Override // java.lang.Runnable
            public final void run() {
                this.f35860a.j(z10);
            }
        });
        return taskF;
    }

    public final Task<m> f() {
        sb.k kVar = new sb.k();
        h(new k(this.f35865d, kVar));
        return kVar.a();
    }

    public final Task<String> g() {
        sb.k kVar = new sb.k();
        h(new l(kVar));
        return kVar.a();
    }

    @Override // yf.h
    @NonNull
    public Task<String> getId() {
        v();
        String strN = n();
        if (strN != null) {
            return sb.m.f(strN);
        }
        Task<String> taskG = g();
        this.f35869h.execute(new Runnable() { // from class: yf.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f35858a.j(false);
            }
        });
        return taskG;
    }

    public final void h(o oVar) {
        synchronized (this.f35868g) {
            this.f35873l.add(oVar);
        }
    }

    public final void i(boolean z10) {
        ag.d dVarX;
        ag.d dVarR = r();
        try {
            if (dVarR.i() || dVarR.l()) {
                dVarX = x(dVarR);
            } else {
                if (!z10 && !this.f35865d.f(dVarR)) {
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
        ag.d dVarS = s();
        if (z10) {
            dVarS = dVarS.p();
        }
        z(dVarS);
        this.f35870i.execute(new Runnable() { // from class: yf.e
            @Override // java.lang.Runnable
            public final void run() {
                this.f35859a.i(z10);
            }
        });
    }

    public final ag.d k(@NonNull ag.d dVar) throws i {
        bg.f fVarE = this.b.e(l(), dVar.d(), t(), dVar.f());
        int i10 = b.b[fVarE.b().ordinal()];
        if (i10 == 1) {
            return dVar.o(fVarE.c(), fVarE.d(), this.f35865d.b());
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
        return this.f35863a.n().b();
    }

    public String m() {
        return this.f35863a.n().c();
    }

    public final synchronized String n() {
        return this.f35871j;
    }

    public final ag.b o() {
        return this.f35866e.get();
    }

    public final ag.d r() {
        ag.d dVarD;
        synchronized (f35861m) {
            try {
                yf.b bVarA = yf.b.a(this.f35863a.j(), "generatefid.lock");
                try {
                    dVarD = this.f35864c.d();
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

    public final ag.d s() {
        ag.d dVarD;
        synchronized (f35861m) {
            try {
                yf.b bVarA = yf.b.a(this.f35863a.j(), "generatefid.lock");
                try {
                    dVarD = this.f35864c.d();
                    if (dVarD.j()) {
                        dVarD = this.f35864c.b(dVarD.t(w(dVarD)));
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
        return this.f35863a.n().e();
    }

    public final void u(ag.d dVar) {
        synchronized (f35861m) {
            try {
                yf.b bVarA = yf.b.a(this.f35863a.j(), "generatefid.lock");
                try {
                    this.f35864c.b(dVar);
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
        n9.m.g(m(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        n9.m.g(t(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        n9.m.g(l(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        n9.m.b(p.h(m()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        n9.m.b(p.g(l()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    public final String w(ag.d dVar) {
        if ((!this.f35863a.m().equals("CHIME_ANDROID_SDK") && !this.f35863a.u()) || !dVar.m()) {
            return this.f35867f.a();
        }
        String strF = o().f();
        return TextUtils.isEmpty(strF) ? this.f35867f.a() : strF;
    }

    public final ag.d x(ag.d dVar) throws i {
        bg.d dVarD = this.b.d(l(), dVar.d(), t(), m(), (dVar.d() == null || dVar.d().length() != 11) ? null : o().i());
        int i10 = b.f35875a[dVarD.e().ordinal()];
        if (i10 == 1) {
            return dVar.s(dVarD.c(), dVarD.d(), this.f35865d.b(), dVarD.b().c(), dVarD.b().d());
        }
        if (i10 == 2) {
            return dVar.q("BAD CONFIG");
        }
        throw new i("Firebase Installations Service is unavailable. Please try again later.", i.a.UNAVAILABLE);
    }

    public final void y(Exception exc) {
        synchronized (this.f35868g) {
            try {
                Iterator<o> it = this.f35873l.iterator();
                while (it.hasNext()) {
                    if (it.next().b(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void z(ag.d dVar) {
        synchronized (this.f35868g) {
            try {
                Iterator<o> it = this.f35873l.iterator();
                while (it.hasNext()) {
                    if (it.next().a(dVar)) {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @SuppressLint({"ThreadPoolCreation"})
    public g(ExecutorService executorService, Executor executor, ef.e eVar, bg.c cVar, ag.c cVar2, p pVar, x<ag.b> xVar, n nVar) {
        this.f35868g = new Object();
        this.f35872k = new HashSet();
        this.f35873l = new ArrayList();
        this.f35863a = eVar;
        this.b = cVar;
        this.f35864c = cVar2;
        this.f35865d = pVar;
        this.f35866e = xVar;
        this.f35867f = nVar;
        this.f35869h = executorService;
        this.f35870i = executor;
    }
}
