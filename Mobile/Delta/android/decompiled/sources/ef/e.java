package ef;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import lf.o;
import lf.x;
import mf.a0;
import p1.t;
import u2.p;
import u9.m;
import u9.n;

/* JADX INFO: loaded from: classes2.dex */
public class e {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Object f15451k = new Object();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Map<String, e> f15452l = new w1.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f15453a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f15454c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o f15455d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x<dg.a> f15458g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final xf.b<vf.f> f15459h;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f15456e = new AtomicBoolean(false);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f15457f = new AtomicBoolean();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List<a> f15460i = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List<Object> f15461j = new CopyOnWriteArrayList();

    public interface a {
        void a(boolean z10);
    }

    @TargetApi(14)
    public static class b implements l9.c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static AtomicReference<b> f15462a = new AtomicReference<>();

        public static void c(Context context) {
            if (m.a() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (f15462a.get() == null) {
                    b bVar = new b();
                    if (t.a(f15462a, null, bVar)) {
                        l9.c.c(application);
                        l9.c.b().a(bVar);
                    }
                }
            }
        }

        @Override // l9.c.a
        public void a(boolean z10) {
            synchronized (e.f15451k) {
                try {
                    ArrayList arrayList = new ArrayList(e.f15452l.values());
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        e eVar = (e) obj;
                        if (eVar.f15456e.get()) {
                            eVar.w(z10);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @TargetApi(24)
    public static class c extends BroadcastReceiver {
        public static AtomicReference<c> b = new AtomicReference<>();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f15463a;

        public c(Context context) {
            this.f15463a = context;
        }

        public static void b(Context context) {
            if (b.get() == null) {
                c cVar = new c(context);
                if (t.a(b, null, cVar)) {
                    context.registerReceiver(cVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        public void c() {
            this.f15463a.unregisterReceiver(this);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            synchronized (e.f15451k) {
                try {
                    Iterator<e> it = e.f15452l.values().iterator();
                    while (it.hasNext()) {
                        it.next().p();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            c();
        }
    }

    public e(final Context context, String str, k kVar) {
        this.f15453a = (Context) n9.m.l(context);
        this.b = n9.m.f(str);
        this.f15454c = (k) n9.m.l(kVar);
        l lVarA = hg.a.a();
        ig.c.b("Firebase");
        ig.c.b("ComponentDiscovery");
        List<xf.b<ComponentRegistrar>> listB = lf.f.c(context, ComponentDiscoveryService.class).b();
        ig.c.a();
        ig.c.b("Runtime");
        o.b bVarF = o.l(a0.INSTANCE).d(listB).c(new FirebaseCommonRegistrar()).c(new ExecutorsRegistrar()).b(lf.c.q(context, Context.class, new Class[0])).b(lf.c.q(this, e.class, new Class[0])).b(lf.c.q(kVar, k.class, new Class[0])).f(new ig.b());
        if (p.a(context) && hg.a.b()) {
            bVarF.b(lf.c.q(lVarA, l.class, new Class[0]));
        }
        o oVarE = bVarF.e();
        this.f15455d = oVarE;
        ig.c.a();
        this.f15458g = new x<>(new xf.b() { // from class: ef.c
            @Override // xf.b
            public final Object get() {
                return e.b(this.f15449a, context);
            }
        });
        this.f15459h = oVarE.d(vf.f.class);
        g(new a() { // from class: ef.d
            @Override // ef.e.a
            public final void a(boolean z10) {
                e.a(this.f15450a, z10);
            }
        });
        ig.c.a();
    }

    public static /* synthetic */ void a(e eVar, boolean z10) {
        if (z10) {
            eVar.getClass();
        } else {
            eVar.f15459h.get().h();
        }
    }

    public static /* synthetic */ dg.a b(e eVar, Context context) {
        return new dg.a(context, eVar.o(), (uf.c) eVar.f15455d.a(uf.c.class));
    }

    @NonNull
    public static List<e> k(@NonNull Context context) {
        ArrayList arrayList;
        synchronized (f15451k) {
            arrayList = new ArrayList(f15452l.values());
        }
        return arrayList;
    }

    @NonNull
    public static e l() {
        e eVar;
        synchronized (f15451k) {
            try {
                eVar = f15452l.get("[DEFAULT]");
                if (eVar == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + n.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                eVar.f15459h.get().h();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return eVar;
    }

    public static e q(@NonNull Context context) {
        synchronized (f15451k) {
            try {
                if (f15452l.containsKey("[DEFAULT]")) {
                    return l();
                }
                k kVarA = k.a(context);
                if (kVarA == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return r(context, kVarA);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NonNull
    public static e r(@NonNull Context context, @NonNull k kVar) {
        return s(context, kVar, "[DEFAULT]");
    }

    @NonNull
    public static e s(@NonNull Context context, @NonNull k kVar, @NonNull String str) {
        e eVar;
        b.c(context);
        String strV = v(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f15451k) {
            Map<String, e> map = f15452l;
            n9.m.q(!map.containsKey(strV), "FirebaseApp name " + strV + " already exists!");
            n9.m.m(context, "Application context cannot be null.");
            eVar = new e(context, strV, kVar);
            map.put(strV, eVar);
        }
        eVar.p();
        return eVar;
    }

    public static String v(@NonNull String str) {
        return str.trim();
    }

    public boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.b.equals(((e) obj).m());
        }
        return false;
    }

    public void g(a aVar) {
        h();
        if (this.f15456e.get() && l9.c.b().d()) {
            aVar.a(true);
        }
        this.f15460i.add(aVar);
    }

    public final void h() {
        n9.m.q(!this.f15457f.get(), "FirebaseApp was deleted");
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public <T> T i(Class<T> cls) {
        h();
        return (T) this.f15455d.a(cls);
    }

    @NonNull
    public Context j() {
        h();
        return this.f15453a;
    }

    @NonNull
    public String m() {
        h();
        return this.b;
    }

    @NonNull
    public k n() {
        h();
        return this.f15454c;
    }

    public String o() {
        return u9.c.b(m().getBytes(Charset.defaultCharset())) + "+" + u9.c.b(n().c().getBytes(Charset.defaultCharset()));
    }

    public final void p() {
        if (!p.a(this.f15453a)) {
            Log.i("FirebaseApp", "Device in Direct Boot Mode: postponing initialization of Firebase APIs for app " + m());
            c.b(this.f15453a);
            return;
        }
        Log.i("FirebaseApp", "Device unlocked: initializing all Firebase APIs for app " + m());
        this.f15455d.o(u());
        this.f15459h.get().h();
    }

    public boolean t() {
        h();
        return this.f15458g.get().b();
    }

    public String toString() {
        return n9.k.d(this).a("name", this.b).a("options", this.f15454c).toString();
    }

    public boolean u() {
        return "[DEFAULT]".equals(m());
    }

    public final void w(boolean z10) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        Iterator<a> it = this.f15460i.iterator();
        while (it.hasNext()) {
            it.next().a(z10);
        }
    }
}
