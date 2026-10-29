package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.tasks.Task;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p128ff.C5587b;
import p128ff.C5590e;
import p170hf.InterfaceC6392a;
import p171hg.InterfaceC6404i;
import p305n9.C8953m;
import p488v9.ThreadFactoryC12109b;
import p490vf.C12164a;
import p490vf.InterfaceC12165b;
import p490vf.InterfaceC12167d;
import p545xf.InterfaceC12829a;
import p569y7.InterfaceC13122i;
import p575yf.InterfaceC13188b;
import p603zf.InterfaceC13801h;
import sb.C11264k;
import sb.C11268m;
import sb.InterfaceC11256g;
import sb.InterfaceC11262j;
import wf.InterfaceC12411j;

/* JADX INFO: loaded from: classes2.dex */
public class FirebaseMessaging {

    /* JADX INFO: renamed from: n */
    public static C3025u0 f11187n;

    /* JADX INFO: renamed from: p */
    public static ScheduledExecutorService f11189p;

    /* JADX INFO: renamed from: a */
    public final C5590e f11190a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC12829a f11191b;

    /* JADX INFO: renamed from: c */
    public final Context f11192c;

    /* JADX INFO: renamed from: d */
    public final C2980b0 f11193d;

    /* JADX INFO: renamed from: e */
    public final C3015p0 f11194e;

    /* JADX INFO: renamed from: f */
    public final C2975a f11195f;

    /* JADX INFO: renamed from: g */
    public final Executor f11196g;

    /* JADX INFO: renamed from: h */
    public final Executor f11197h;

    /* JADX INFO: renamed from: i */
    public final Task<C3035z0> f11198i;

    /* JADX INFO: renamed from: j */
    public final C2995g0 f11199j;

    /* JADX INFO: renamed from: k */
    public boolean f11200k;

    /* JADX INFO: renamed from: l */
    public final Application.ActivityLifecycleCallbacks f11201l;

    /* JADX INFO: renamed from: m */
    public static final long f11186m = TimeUnit.HOURS.toSeconds(8);

    /* JADX INFO: renamed from: o */
    public static InterfaceC13188b<InterfaceC13122i> f11188o = new InterfaceC13188b() { // from class: com.google.firebase.messaging.p
        @Override // p575yf.InterfaceC13188b
        public final Object get() {
            return FirebaseMessaging.m14414d();
        }
    };

    /* JADX INFO: renamed from: com.google.firebase.messaging.FirebaseMessaging$a */
    public class C2975a {

        /* JADX INFO: renamed from: a */
        public final InterfaceC12167d f11202a;

        /* JADX INFO: renamed from: b */
        public boolean f11203b;

        /* JADX INFO: renamed from: c */
        public InterfaceC12165b<C5587b> f11204c;

        /* JADX INFO: renamed from: d */
        public Boolean f11205d;

        public C2975a(InterfaceC12167d interfaceC12167d) {
            this.f11202a = interfaceC12167d;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m14442a(C2975a c2975a, C12164a c12164a) {
            if (c2975a.m14444c()) {
                FirebaseMessaging.this.m14426C();
            }
        }

        /* JADX INFO: renamed from: b */
        public synchronized void m14443b() {
            try {
                if (this.f11203b) {
                    return;
                }
                Boolean boolM14445d = m14445d();
                this.f11205d = boolM14445d;
                if (boolM14445d == null) {
                    InterfaceC12165b<C5587b> interfaceC12165b = new InterfaceC12165b() { // from class: com.google.firebase.messaging.y
                        @Override // p490vf.InterfaceC12165b
                        /* JADX INFO: renamed from: a */
                        public final void mo14677a(C12164a c12164a) {
                            FirebaseMessaging.C2975a.m14442a(this.f11355a, c12164a);
                        }
                    };
                    this.f11204c = interfaceC12165b;
                    this.f11202a.mo34371c(C5587b.class, interfaceC12165b);
                }
                this.f11203b = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }

        /* JADX INFO: renamed from: c */
        public synchronized boolean m14444c() {
            Boolean bool;
            try {
                m14443b();
                bool = this.f11205d;
            } catch (Throwable th2) {
                throw th2;
            }
            return bool != null ? bool.booleanValue() : FirebaseMessaging.this.f11190a.m25273t();
        }

        /* JADX INFO: renamed from: d */
        public final Boolean m14445d() {
            ApplicationInfo applicationInfo;
            Bundle bundle;
            Context contextM25268j = FirebaseMessaging.this.f11190a.m25268j();
            SharedPreferences sharedPreferences = contextM25268j.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = contextM25268j.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(contextM25268j.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                    return null;
                }
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        /* JADX INFO: renamed from: e */
        public synchronized void m14446e(boolean z10) {
            try {
                m14443b();
                InterfaceC12165b<C5587b> interfaceC12165b = this.f11204c;
                if (interfaceC12165b != null) {
                    this.f11202a.mo34370b(C5587b.class, interfaceC12165b);
                    this.f11204c = null;
                }
                SharedPreferences.Editor editorEdit = FirebaseMessaging.this.f11190a.m25268j().getSharedPreferences("com.google.firebase.messaging", 0).edit();
                editorEdit.putBoolean("auto_init", z10);
                editorEdit.apply();
                if (z10) {
                    FirebaseMessaging.this.m14426C();
                }
                this.f11205d = Boolean.valueOf(z10);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public FirebaseMessaging(C5590e c5590e, InterfaceC12829a interfaceC12829a, InterfaceC13188b<InterfaceC6404i> interfaceC13188b, InterfaceC13188b<InterfaceC12411j> interfaceC13188b2, InterfaceC13801h interfaceC13801h, InterfaceC13188b<InterfaceC13122i> interfaceC13188b3, InterfaceC12167d interfaceC12167d) {
        this(c5590e, interfaceC12829a, interfaceC13188b, interfaceC13188b2, interfaceC13801h, interfaceC13188b3, interfaceC12167d, new C2995g0(c5590e.m25268j()));
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Task m14411a(FirebaseMessaging firebaseMessaging, String str, C3025u0.a aVar, String str2) {
        m14422o(firebaseMessaging.f11192c).m14658f(firebaseMessaging.m14432p(), str, str2, firebaseMessaging.f11199j.m14555a());
        if (aVar == null || !str2.equals(aVar.f11331a)) {
            firebaseMessaging.m14437v(str2);
        }
        return C11268m.m42336f(str2);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m14412b(FirebaseMessaging firebaseMessaging) {
        if (firebaseMessaging.m14438w()) {
            firebaseMessaging.m14426C();
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m14413c(FirebaseMessaging firebaseMessaging, C11264k c11264k) {
        firebaseMessaging.getClass();
        try {
            c11264k.m42328c(firebaseMessaging.m14429k());
        } catch (Exception e10) {
            c11264k.m42327b(e10);
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ InterfaceC13122i m14414d() {
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m14416f(FirebaseMessaging firebaseMessaging, CloudMessage cloudMessage) {
        firebaseMessaging.getClass();
        if (cloudMessage != null) {
            C2992f0.m14552y(cloudMessage.m9132v3());
            firebaseMessaging.m14435t();
        }
    }

    @NonNull
    @Keep
    public static synchronized FirebaseMessaging getInstance(@NonNull C5590e c5590e) {
        FirebaseMessaging firebaseMessaging;
        firebaseMessaging = (FirebaseMessaging) c5590e.m25267i(FirebaseMessaging.class);
        C8953m.m36048m(firebaseMessaging, "Firebase Messaging component is not present");
        return firebaseMessaging;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m14418h(FirebaseMessaging firebaseMessaging, C3035z0 c3035z0) {
        if (firebaseMessaging.m14438w()) {
            c3035z0.m14691n();
        }
    }

    @NonNull
    /* JADX INFO: renamed from: n */
    public static synchronized FirebaseMessaging m14421n() {
        return getInstance(C5590e.m25260l());
    }

    @NonNull
    /* JADX INFO: renamed from: o */
    public static synchronized C3025u0 m14422o(Context context) {
        try {
            if (f11187n == null) {
                f11187n = new C3025u0(context);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f11187n;
    }

    /* JADX INFO: renamed from: s */
    public static InterfaceC13122i m14423s() {
        return f11188o.get();
    }

    /* JADX INFO: renamed from: A */
    public final boolean m14424A() {
        C3005k0.m14604c(this.f11192c);
        if (!C3005k0.m14605d(this.f11192c)) {
            return false;
        }
        if (this.f11190a.m25267i(InterfaceC6392a.class) != null) {
            return true;
        }
        return C2992f0.m14528a() && f11188o != null;
    }

    /* JADX INFO: renamed from: B */
    public final synchronized void m14425B() {
        if (!this.f11200k) {
            m14427D(0L);
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m14426C() {
        InterfaceC12829a interfaceC12829a = this.f11191b;
        if (interfaceC12829a != null) {
            interfaceC12829a.m47747b();
        } else if (m14428E(m14434r())) {
            m14425B();
        }
    }

    /* JADX INFO: renamed from: D */
    public synchronized void m14427D(long j10) {
        m14430l(new RunnableC3027v0(this, Math.min(Math.max(30L, 2 * j10), f11186m)), j10);
        this.f11200k = true;
    }

    /* JADX INFO: renamed from: E */
    public boolean m14428E(C3025u0.a aVar) {
        return aVar == null || aVar.m14661b(this.f11199j.m14555a());
    }

    /* JADX INFO: renamed from: k */
    public String m14429k() throws IOException {
        InterfaceC12829a interfaceC12829a = this.f11191b;
        if (interfaceC12829a != null) {
            try {
                return (String) C11268m.m42331a(interfaceC12829a.m47748c());
            } catch (InterruptedException | ExecutionException e10) {
                throw new IOException(e10);
            }
        }
        final C3025u0.a aVarM14434r = m14434r();
        if (!m14428E(aVarM14434r)) {
            return aVarM14434r.f11331a;
        }
        final String strM14554c = C2995g0.m14554c(this.f11190a);
        try {
            return (String) C11268m.m42331a(this.f11194e.m14635b(strM14554c, new C3015p0.a() { // from class: com.google.firebase.messaging.w
                @Override // com.google.firebase.messaging.C3015p0.a
                public final Task start() {
                    FirebaseMessaging firebaseMessaging = this.f11341a;
                    return firebaseMessaging.f11193d.m14477f().mo11900n(firebaseMessaging.f11197h, new InterfaceC11262j() { // from class: com.google.firebase.messaging.x
                        @Override // sb.InterfaceC11262j
                        public final Task then(Object obj) {
                            return FirebaseMessaging.m14411a(firebaseMessaging, str, aVar, (String) obj);
                        }
                    });
                }
            }));
        } catch (InterruptedException | ExecutionException e11) {
            throw new IOException(e11);
        }
    }

    @SuppressLint({"ThreadPoolCreation"})
    /* JADX INFO: renamed from: l */
    public void m14430l(Runnable runnable, long j10) {
        synchronized (FirebaseMessaging.class) {
            try {
                if (f11189p == null) {
                    f11189p = new ScheduledThreadPoolExecutor(1, new ThreadFactoryC12109b("TAG"));
                }
                f11189p.schedule(runnable, j10, TimeUnit.SECONDS);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public Context m14431m() {
        return this.f11192c;
    }

    /* JADX INFO: renamed from: p */
    public final String m14432p() {
        return "[DEFAULT]".equals(this.f11190a.m25269m()) ? "" : this.f11190a.m25271o();
    }

    @NonNull
    /* JADX INFO: renamed from: q */
    public Task<String> m14433q() {
        InterfaceC12829a interfaceC12829a = this.f11191b;
        if (interfaceC12829a != null) {
            return interfaceC12829a.m47748c();
        }
        final C11264k c11264k = new C11264k();
        this.f11196g.execute(new Runnable() { // from class: com.google.firebase.messaging.u
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.m14413c(this.f11327a, c11264k);
            }
        });
        return c11264k.m42326a();
    }

    /* JADX INFO: renamed from: r */
    public C3025u0.a m14434r() {
        return m14422o(this.f11192c).m14656d(m14432p(), C2995g0.m14554c(this.f11190a));
    }

    /* JADX INFO: renamed from: t */
    public final void m14435t() {
        this.f11193d.m14476e().mo11892f(this.f11196g, new InterfaceC11256g() { // from class: com.google.firebase.messaging.v
            @Override // sb.InterfaceC11256g
            public final void onSuccess(Object obj) {
                FirebaseMessaging.m14416f(this.f11334a, (CloudMessage) obj);
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public final void m14436u() {
        C3005k0.m14604c(this.f11192c);
        C3009m0.m14621f(this.f11192c, this.f11193d, m14424A());
        if (m14424A()) {
            m14435t();
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m14437v(String str) {
        if ("[DEFAULT]".equals(this.f11190a.m25269m())) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Invoking onNewToken for app: " + this.f11190a.m25269m());
            }
            Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
            intent.putExtra("token", str);
            new C3008m(this.f11192c).m14614g(intent);
        }
    }

    /* JADX INFO: renamed from: w */
    public boolean m14438w() {
        return this.f11195f.m14444c();
    }

    /* JADX INFO: renamed from: x */
    public boolean m14439x() {
        return this.f11199j.m14560g();
    }

    /* JADX INFO: renamed from: y */
    public void m14440y(boolean z10) {
        this.f11195f.m14446e(z10);
    }

    /* JADX INFO: renamed from: z */
    public synchronized void m14441z(boolean z10) {
        this.f11200k = z10;
    }

    public FirebaseMessaging(C5590e c5590e, InterfaceC12829a interfaceC12829a, InterfaceC13188b<InterfaceC6404i> interfaceC13188b, InterfaceC13188b<InterfaceC12411j> interfaceC13188b2, InterfaceC13801h interfaceC13801h, InterfaceC13188b<InterfaceC13122i> interfaceC13188b3, InterfaceC12167d interfaceC12167d, C2995g0 c2995g0) {
        this(c5590e, interfaceC12829a, interfaceC13188b3, interfaceC12167d, c2995g0, new C2980b0(c5590e, c2995g0, interfaceC13188b, interfaceC13188b2, interfaceC13801h), C3010n.m14628f(), C3010n.m14625c(), C3010n.m14624b());
    }

    public FirebaseMessaging(C5590e c5590e, InterfaceC12829a interfaceC12829a, InterfaceC13188b<InterfaceC13122i> interfaceC13188b, InterfaceC12167d interfaceC12167d, C2995g0 c2995g0, C2980b0 c2980b0, Executor executor, Executor executor2, Executor executor3) {
        this.f11200k = false;
        f11188o = interfaceC13188b;
        this.f11190a = c5590e;
        this.f11191b = interfaceC12829a;
        this.f11195f = new C2975a(interfaceC12167d);
        Context contextM25268j = c5590e.m25268j();
        this.f11192c = contextM25268j;
        C3012o c3012o = new C3012o();
        this.f11201l = c3012o;
        this.f11199j = c2995g0;
        this.f11193d = c2980b0;
        this.f11194e = new C3015p0(executor);
        this.f11196g = executor2;
        this.f11197h = executor3;
        Context contextM25268j2 = c5590e.m25268j();
        if (contextM25268j2 instanceof Application) {
            ((Application) contextM25268j2).registerActivityLifecycleCallbacks(c3012o);
        } else {
            Log.w("FirebaseMessaging", "Context " + contextM25268j2 + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        if (interfaceC12829a != null) {
            interfaceC12829a.m47746a(new InterfaceC12829a.a() { // from class: com.google.firebase.messaging.q
            });
        }
        executor2.execute(new Runnable() { // from class: com.google.firebase.messaging.r
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.m14412b(this.f11312a);
            }
        });
        Task<C3035z0> taskM14680e = C3035z0.m14680e(this, c2995g0, c2980b0, contextM25268j, C3010n.m14629g());
        this.f11198i = taskM14680e;
        taskM14680e.mo11892f(executor2, new InterfaceC11256g() { // from class: com.google.firebase.messaging.s
            @Override // sb.InterfaceC11256g
            public final void onSuccess(Object obj) {
                FirebaseMessaging.m14418h(this.f11318a, (C3035z0) obj);
            }
        });
        executor2.execute(new Runnable() { // from class: com.google.firebase.messaging.t
            @Override // java.lang.Runnable
            public final void run() {
                this.f11320a.m14436u();
            }
        });
    }
}
