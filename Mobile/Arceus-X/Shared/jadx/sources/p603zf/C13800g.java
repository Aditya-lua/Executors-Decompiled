package p603zf;

import ag.InterfaceC0259a;
import android.annotation.SuppressLint;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import bg.AbstractC1437d;
import bg.C1435b;
import bg.C1436c;
import cg.AbstractC1665d;
import cg.AbstractC1667f;
import cg.C1664c;
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
import p128ff.C5590e;
import p292mf.C8517x;
import p305n9.C8953m;
import p575yf.InterfaceC13188b;
import sb.C11264k;
import sb.C11268m;
import wf.InterfaceC12410i;

/* JADX INFO: renamed from: zf.g */
/* JADX INFO: loaded from: classes2.dex */
public class C13800g implements InterfaceC13801h {

    /* JADX INFO: renamed from: m */
    public static final Object f48400m = new Object();

    /* JADX INFO: renamed from: n */
    public static final ThreadFactory f48401n = new a();

    /* JADX INFO: renamed from: a */
    public final C5590e f48402a;

    /* JADX INFO: renamed from: b */
    public final C1664c f48403b;

    /* JADX INFO: renamed from: c */
    public final C1436c f48404c;

    /* JADX INFO: renamed from: d */
    public final C13809p f48405d;

    /* JADX INFO: renamed from: e */
    public final C8517x<C1435b> f48406e;

    /* JADX INFO: renamed from: f */
    public final C13807n f48407f;

    /* JADX INFO: renamed from: g */
    public final Object f48408g;

    /* JADX INFO: renamed from: h */
    public final ExecutorService f48409h;

    /* JADX INFO: renamed from: i */
    public final Executor f48410i;

    /* JADX INFO: renamed from: j */
    public String f48411j;

    /* JADX INFO: renamed from: k */
    public Set<InterfaceC0259a> f48412k;

    /* JADX INFO: renamed from: l */
    public final List<InterfaceC13808o> f48413l;

    /* JADX INFO: renamed from: zf.g$a */
    public class a implements ThreadFactory {

        /* JADX INFO: renamed from: a */
        public final AtomicInteger f48414a = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        @SuppressLint({"ThreadPoolCreation"})
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", Integer.valueOf(this.f48414a.getAndIncrement())));
        }
    }

    /* JADX INFO: renamed from: zf.g$b */
    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f48415a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f48416b;

        static {
            int[] iArr = new int[AbstractC1667f.b.values().length];
            f48416b = iArr;
            try {
                iArr[AbstractC1667f.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f48416b[AbstractC1667f.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f48416b[AbstractC1667f.b.AUTH_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[AbstractC1665d.b.values().length];
            f48415a = iArr2;
            try {
                iArr2[AbstractC1665d.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f48415a[AbstractC1665d.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @SuppressLint({"ThreadPoolCreation"})
    public C13800g(final C5590e c5590e, @NonNull InterfaceC13188b<InterfaceC12410i> interfaceC13188b, @NonNull ExecutorService executorService, @NonNull Executor executor) {
        this(executorService, executor, c5590e, new C1664c(c5590e.m25268j(), interfaceC13188b), new C1436c(c5590e), C13809p.m50283c(), new C8517x(new InterfaceC13188b() { // from class: zf.c
            @Override // p575yf.InterfaceC13188b
            public final Object get() {
                return C13800g.m50251e(c5590e);
            }
        }), new C13807n());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR (r1v0 ff.e) A[MD:(ff.e):void (m)] call: bg.b.<init>(ff.e):void type: CONSTRUCTOR */
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ C1435b m50251e(C5590e c5590e) {
        return new C1435b(c5590e);
    }

    @NonNull
    /* JADX INFO: renamed from: p */
    public static C13800g m50252p() {
        return m50253q(C5590e.m25260l());
    }

    @NonNull
    /* JADX INFO: renamed from: q */
    public static C13800g m50253q(@NonNull C5590e c5590e) {
        C8953m.m36037b(c5590e != null, "Null is not a valid value of FirebaseApp.");
        return (C13800g) c5590e.m25267i(InterfaceC13801h.class);
    }

    /* JADX INFO: renamed from: A */
    public final synchronized void m50254A(String str) {
        this.f48411j = str;
    }

    /* JADX INFO: renamed from: B */
    public final synchronized void m50255B(AbstractC1437d abstractC1437d, AbstractC1437d abstractC1437d2) {
        if (this.f48412k.size() != 0 && !TextUtils.equals(abstractC1437d.mo7396d(), abstractC1437d2.mo7396d())) {
            Iterator<InterfaceC0259a> it = this.f48412k.iterator();
            while (it.hasNext()) {
                it.next().m1206a(abstractC1437d2.mo7396d());
            }
        }
    }

    @Override // p603zf.InterfaceC13801h
    @NonNull
    /* JADX INFO: renamed from: a */
    public Task<AbstractC13806m> mo50256a(final boolean z10) {
        m50271v();
        Task<AbstractC13806m> taskM50257f = m50257f();
        this.f48409h.execute(new Runnable() { // from class: zf.f
            @Override // java.lang.Runnable
            public final void run() {
                this.f48398a.m50261j(z10);
            }
        });
        return taskM50257f;
    }

    /* JADX INFO: renamed from: f */
    public final Task<AbstractC13806m> m50257f() {
        C11264k c11264k = new C11264k();
        m50259h(new C13804k(this.f48405d, c11264k));
        return c11264k.m42326a();
    }

    /* JADX INFO: renamed from: g */
    public final Task<String> m50258g() {
        C11264k c11264k = new C11264k();
        m50259h(new C13805l(c11264k));
        return c11264k.m42326a();
    }

    @Override // p603zf.InterfaceC13801h
    @NonNull
    public Task<String> getId() {
        m50271v();
        String strM50265n = m50265n();
        if (strM50265n != null) {
            return C11268m.m42336f(strM50265n);
        }
        Task<String> taskM50258g = m50258g();
        this.f48409h.execute(new Runnable() { // from class: zf.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f48395a.m50261j(false);
            }
        });
        return taskM50258g;
    }

    /* JADX INFO: renamed from: h */
    public final void m50259h(InterfaceC13808o interfaceC13808o) {
        synchronized (this.f48408g) {
            this.f48413l.add(interfaceC13808o);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m50260i(boolean z10) {
        AbstractC1437d abstractC1437dM50273x;
        AbstractC1437d abstractC1437dM50267r = m50267r();
        try {
            if (abstractC1437dM50267r.m7425i() || abstractC1437dM50267r.m7428l()) {
                abstractC1437dM50273x = m50273x(abstractC1437dM50267r);
            } else {
                if (!z10 && !this.f48405d.m50290f(abstractC1437dM50267r)) {
                    return;
                }
                abstractC1437dM50273x = m50262k(abstractC1437dM50267r);
            }
            m50270u(abstractC1437dM50273x);
            m50255B(abstractC1437dM50267r, abstractC1437dM50273x);
            if (abstractC1437dM50273x.m7427k()) {
                m50254A(abstractC1437dM50273x.mo7396d());
            }
            if (abstractC1437dM50273x.m7425i()) {
                m50274y(new C13802i(C13802i.a.BAD_CONFIG));
            } else if (abstractC1437dM50273x.m7426j()) {
                m50274y(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
            } else {
                m50275z(abstractC1437dM50273x);
            }
        } catch (C13802i e10) {
            m50274y(e10);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m50261j(final boolean z10) {
        AbstractC1437d abstractC1437dM50268s = m50268s();
        if (z10) {
            abstractC1437dM50268s = abstractC1437dM50268s.m7431p();
        }
        m50275z(abstractC1437dM50268s);
        this.f48410i.execute(new Runnable() { // from class: zf.e
            @Override // java.lang.Runnable
            public final void run() {
                this.f48396a.m50260i(z10);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public final AbstractC1437d m50262k(@NonNull AbstractC1437d abstractC1437d) throws C13802i {
        AbstractC1667f abstractC1667fM8354e = this.f48403b.m8354e(m50263l(), abstractC1437d.mo7396d(), m50269t(), abstractC1437d.mo7398f());
        int i10 = b.f48416b[abstractC1667fM8354e.mo8336b().ordinal()];
        if (i10 == 1) {
            return abstractC1437d.m7430o(abstractC1667fM8354e.mo8337c(), abstractC1667fM8354e.mo8338d(), this.f48405d.m50288b());
        }
        if (i10 == 2) {
            return abstractC1437d.m7432q("BAD CONFIG");
        }
        if (i10 != 3) {
            throw new C13802i("Firebase Installations Service is unavailable. Please try again later.", C13802i.a.UNAVAILABLE);
        }
        m50254A(null);
        return abstractC1437d.m7433r();
    }

    /* JADX INFO: renamed from: l */
    public String m50263l() {
        return this.f48402a.m25270n().m25284b();
    }

    /* JADX INFO: renamed from: m */
    public String m50264m() {
        return this.f48402a.m25270n().m25285c();
    }

    /* JADX INFO: renamed from: n */
    public final synchronized String m50265n() {
        return this.f48411j;
    }

    /* JADX INFO: renamed from: o */
    public final C1435b m50266o() {
        return this.f48406e.get();
    }

    /* JADX INFO: renamed from: r */
    public final AbstractC1437d m50267r() {
        AbstractC1437d abstractC1437dM7422d;
        synchronized (f48400m) {
            try {
                C13795b c13795bM50246a = C13795b.m50246a(this.f48402a.m25268j(), "generatefid.lock");
                try {
                    abstractC1437dM7422d = this.f48404c.m7422d();
                    if (c13795bM50246a != null) {
                        c13795bM50246a.m50247b();
                    }
                } catch (Throwable th2) {
                    if (c13795bM50246a != null) {
                        c13795bM50246a.m50247b();
                    }
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return abstractC1437dM7422d;
    }

    /* JADX INFO: renamed from: s */
    public final AbstractC1437d m50268s() {
        AbstractC1437d abstractC1437dM7422d;
        synchronized (f48400m) {
            try {
                C13795b c13795bM50246a = C13795b.m50246a(this.f48402a.m25268j(), "generatefid.lock");
                try {
                    abstractC1437dM7422d = this.f48404c.m7422d();
                    if (abstractC1437dM7422d.m7426j()) {
                        abstractC1437dM7422d = this.f48404c.m7420b(abstractC1437dM7422d.m7435t(m50272w(abstractC1437dM7422d)));
                    }
                    if (c13795bM50246a != null) {
                        c13795bM50246a.m50247b();
                    }
                } catch (Throwable th2) {
                    if (c13795bM50246a != null) {
                        c13795bM50246a.m50247b();
                    }
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return abstractC1437dM7422d;
    }

    /* JADX INFO: renamed from: t */
    public String m50269t() {
        return this.f48402a.m25270n().m25287e();
    }

    /* JADX INFO: renamed from: u */
    public final void m50270u(AbstractC1437d abstractC1437d) {
        synchronized (f48400m) {
            try {
                C13795b c13795bM50246a = C13795b.m50246a(this.f48402a.m25268j(), "generatefid.lock");
                try {
                    this.f48404c.m7420b(abstractC1437d);
                    if (c13795bM50246a != null) {
                        c13795bM50246a.m50247b();
                    }
                } catch (Throwable th2) {
                    if (c13795bM50246a != null) {
                        c13795bM50246a.m50247b();
                    }
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m50271v() {
        C8953m.m36042g(m50264m(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        C8953m.m36042g(m50269t(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        C8953m.m36042g(m50263l(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        C8953m.m36037b(C13809p.m50286h(m50264m()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        C8953m.m36037b(C13809p.m50285g(m50263l()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    /* JADX INFO: renamed from: w */
    public final String m50272w(AbstractC1437d abstractC1437d) {
        if ((!this.f48402a.m25269m().equals("CHIME_ANDROID_SDK") && !this.f48402a.m25274u()) || !abstractC1437d.m7429m()) {
            return this.f48407f.m50282a();
        }
        String strM7415f = m50266o().m7415f();
        return TextUtils.isEmpty(strM7415f) ? this.f48407f.m50282a() : strM7415f;
    }

    /* JADX INFO: renamed from: x */
    public final AbstractC1437d m50273x(AbstractC1437d abstractC1437d) throws C13802i {
        AbstractC1665d abstractC1665dM8353d = this.f48403b.m8353d(m50263l(), abstractC1437d.mo7396d(), m50269t(), m50264m(), (abstractC1437d.mo7396d() == null || abstractC1437d.mo7396d().length() != 11) ? null : m50266o().m7418i());
        int i10 = b.f48415a[abstractC1665dM8353d.mo8328e().ordinal()];
        if (i10 == 1) {
            return abstractC1437d.m7434s(abstractC1665dM8353d.mo8326c(), abstractC1665dM8353d.mo8327d(), this.f48405d.m50288b(), abstractC1665dM8353d.mo8325b().mo8337c(), abstractC1665dM8353d.mo8325b().mo8338d());
        }
        if (i10 == 2) {
            return abstractC1437d.m7432q("BAD CONFIG");
        }
        throw new C13802i("Firebase Installations Service is unavailable. Please try again later.", C13802i.a.UNAVAILABLE);
    }

    /* JADX INFO: renamed from: y */
    public final void m50274y(Exception exc) {
        synchronized (this.f48408g) {
            try {
                Iterator<InterfaceC13808o> it = this.f48413l.iterator();
                while (it.hasNext()) {
                    if (it.next().mo50277a(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m50275z(AbstractC1437d abstractC1437d) {
        synchronized (this.f48408g) {
            try {
                Iterator<InterfaceC13808o> it = this.f48413l.iterator();
                while (it.hasNext()) {
                    if (it.next().mo50278b(abstractC1437d)) {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @SuppressLint({"ThreadPoolCreation"})
    public C13800g(ExecutorService executorService, Executor executor, C5590e c5590e, C1664c c1664c, C1436c c1436c, C13809p c13809p, C8517x<C1435b> c8517x, C13807n c13807n) {
        this.f48408g = new Object();
        this.f48412k = new HashSet();
        this.f48413l = new ArrayList();
        this.f48402a = c5590e;
        this.f48403b = c1664c;
        this.f48404c = c1436c;
        this.f48405d = c13809p;
        this.f48406e = c8517x;
        this.f48407f = c13807n;
        this.f48409h = executorService;
        this.f48410i = executor;
    }
}
