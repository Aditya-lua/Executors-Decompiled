package zf;

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
import mf.x;

/* JADX INFO: loaded from: classes2.dex */
public class g implements h {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Object f38100m = new Object();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final ThreadFactory f38101n = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ff.e f38102a;
    public final cg.c b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bg.c f38103c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p f38104d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x<bg.b> f38105e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n f38106f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f38107g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ExecutorService f38108h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Executor f38109i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f38110j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Set<ag.a> f38111k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List<o> f38112l;

    public class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicInteger f38113a = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        @SuppressLint({"ThreadPoolCreation"})
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", Integer.valueOf(this.f38113a.getAndIncrement())));
        }
    }

    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f38114a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[cg.f.b.values().length];
            b = iArr;
            try {
                iArr[cg.f.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[cg.f.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[cg.f.b.AUTH_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[cg.d.b.values().length];
            f38114a = iArr2;
            try {
                iArr2[cg.d.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f38114a[cg.d.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    @SuppressLint({"ThreadPoolCreation"})
    public g(final ff.e eVar, @NonNull yf.b<wf.i> bVar, @NonNull ExecutorService executorService, @NonNull Executor executor) {
        this(executorService, executor, eVar, new cg.c(eVar.j(), bVar), new bg.c(eVar), p.c(), new x(new yf.b() { // from class: zf.c
            @Override // yf.b
            public final Object get() {
                return g.e(eVar);
            }
        }), new n());
    }

    public static /* synthetic */ bg.b e(ff.e eVar) {
        return new bg.b(eVar);
    }

    @NonNull
    public static g p() {
        return q(ff.e.k());
    }

    @NonNull
    public static g q(@NonNull ff.e eVar) {
        n9.m.b(eVar != null, "Null is not a valid value of FirebaseApp.");
        return (g) eVar.i(h.class);
    }

    public final synchronized void A(String str) {
        this.f38110j = str;
    }

    public final synchronized void B(bg.d dVar, bg.d dVar2) {
        if (this.f38111k.size() != 0 && !TextUtils.equals(dVar.d(), dVar2.d())) {
            Iterator<ag.a> it = this.f38111k.iterator();
            while (it.hasNext()) {
                it.next().a(dVar2.d());
            }
        }
    }

    @Override // zf.h
    @NonNull
    public Task<m> a(final boolean z10) {
        v();
        Task<m> taskF = f();
        this.f38108h.execute(new Runnable() { // from class: zf.f
            @Override // java.lang.Runnable
            public final void run() {
                this.f38099a.j(z10);
            }
        });
        return taskF;
    }

    public final Task<m> f() {
        sb.k kVar = new sb.k();
        h(new k(this.f38104d, kVar));
        return kVar.a();
    }

    public final Task<String> g() {
        sb.k kVar = new sb.k();
        h(new l(kVar));
        return kVar.a();
    }

    @Override // zf.h
    @NonNull
    public Task<String> getId() {
        v();
        String strN = n();
        if (strN != null) {
            return sb.m.f(strN);
        }
        Task<String> taskG = g();
        this.f38108h.execute(new Runnable() { // from class: zf.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f38097a.j(false);
            }
        });
        return taskG;
    }

    public final void h(o oVar) {
        synchronized (this.f38107g) {
            this.f38112l.add(oVar);
        }
    }

    public final void i(boolean z10) {
        bg.d dVarX;
        bg.d dVarR = r();
        try {
            if (dVarR.i() || dVarR.l()) {
                dVarX = x(dVarR);
            } else {
                if (!z10 && !this.f38104d.f(dVarR)) {
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
        bg.d dVarS = s();
        if (z10) {
            dVarS = dVarS.p();
        }
        z(dVarS);
        this.f38109i.execute(new Runnable() { // from class: zf.e
            @Override // java.lang.Runnable
            public final void run() {
                this.f38098a.i(z10);
            }
        });
    }

    public final bg.d k(@NonNull bg.d dVar) throws i {
        cg.f fVarE = this.b.e(l(), dVar.d(), t(), dVar.f());
        int i10 = b.b[fVarE.b().ordinal()];
        if (i10 == 1) {
            return dVar.o(fVarE.c(), fVarE.d(), this.f38104d.b());
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
        return this.f38102a.m().b();
    }

    public String m() {
        return this.f38102a.m().c();
    }

    public final synchronized String n() {
        return this.f38110j;
    }

    public final bg.b o() {
        return this.f38105e.get();
    }

    public final bg.d r() {
        bg.d dVarD;
        synchronized (f38100m) {
            try {
                zf.b bVarA = zf.b.a(this.f38102a.j(), "generatefid.lock");
                try {
                    dVarD = this.f38103c.d();
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

    public final bg.d s() {
        bg.d dVarD;
        synchronized (f38100m) {
            try {
                zf.b bVarA = zf.b.a(this.f38102a.j(), "generatefid.lock");
                try {
                    dVarD = this.f38103c.d();
                    if (dVarD.j()) {
                        dVarD = this.f38103c.b(dVarD.t(w(dVarD)));
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
        return this.f38102a.m().e();
    }

    public final void u(bg.d dVar) {
        synchronized (f38100m) {
            try {
                zf.b bVarA = zf.b.a(this.f38102a.j(), "generatefid.lock");
                try {
                    this.f38103c.b(dVar);
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

    public final String w(bg.d dVar) {
        if ((!this.f38102a.l().equals("CHIME_ANDROID_SDK") && !this.f38102a.t()) || !dVar.m()) {
            return this.f38106f.a();
        }
        String strF = o().f();
        return TextUtils.isEmpty(strF) ? this.f38106f.a() : strF;
    }

    public final bg.d x(bg.d dVar) throws i {
        cg.d dVarD = this.b.d(l(), dVar.d(), t(), m(), (dVar.d() == null || dVar.d().length() != 11) ? null : o().i());
        int i10 = b.f38114a[dVarD.e().ordinal()];
        if (i10 == 1) {
            return dVar.s(dVarD.c(), dVarD.d(), this.f38104d.b(), dVarD.b().c(), dVarD.b().d());
        }
        if (i10 == 2) {
            return dVar.q("BAD CONFIG");
        }
        throw new i("Firebase Installations Service is unavailable. Please try again later.", i.a.UNAVAILABLE);
    }

    public final void y(Exception exc) {
        synchronized (this.f38107g) {
            try {
                Iterator<o> it = this.f38112l.iterator();
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

    public final void z(bg.d dVar) {
        synchronized (this.f38107g) {
            try {
                Iterator<o> it = this.f38112l.iterator();
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
    public g(ExecutorService executorService, Executor executor, ff.e eVar, cg.c cVar, bg.c cVar2, p pVar, x<bg.b> xVar, n nVar) {
        this.f38107g = new Object();
        this.f38111k = new HashSet();
        this.f38112l = new ArrayList();
        this.f38102a = eVar;
        this.b = cVar;
        this.f38103c = cVar2;
        this.f38104d = pVar;
        this.f38105e = xVar;
        this.f38106f = nVar;
        this.f38108h = executorService;
        this.f38109i = executor;
    }
}
