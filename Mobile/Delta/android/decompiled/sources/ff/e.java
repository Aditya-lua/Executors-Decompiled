package ff;

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
import com.google.firebase.provider.FirebaseInitProvider;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import mf.o;
import mf.x;
import nf.a0;
import p1.t;
import u2.p;
import u9.m;
import u9.n;

/* JADX INFO: loaded from: classes2.dex */
public class e {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Object f17205k = new Object();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Map<String, e> f17206l = new w1.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f17207a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f17208c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o f17209d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x<eg.a> f17212g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final yf.b<wf.f> f17213h;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f17210e = new AtomicBoolean(false);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f17211f = new AtomicBoolean();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List<a> f17214i = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List<Object> f17215j = new CopyOnWriteArrayList();

    public interface a {
        void a(boolean z10);
    }

    @TargetApi(14)
    public static class b implements l9.c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static AtomicReference<b> f17216a = new AtomicReference<>();

        public static void c(Context context) {
            if (m.a() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (f17216a.get() == null) {
                    b bVar = new b();
                    if (t.a(f17216a, null, bVar)) {
                        l9.c.c(application);
                        l9.c.b().a(bVar);
                    }
                }
            }
        }

        @Override // l9.c.a
        public void a(boolean z10) {
            synchronized (e.f17205k) {
                try {
                    ArrayList arrayList = new ArrayList(e.f17206l.values());
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        e eVar = (e) obj;
                        if (eVar.f17210e.get()) {
                            eVar.v(z10);
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
        public final Context f17217a;

        public c(Context context) {
            this.f17217a = context;
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
            this.f17217a.unregisterReceiver(this);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            synchronized (e.f17205k) {
                try {
                    Iterator<e> it = e.f17206l.values().iterator();
                    while (it.hasNext()) {
                        it.next().o();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            c();
        }
    }

    public e(final Context context, String str, k kVar) {
        this.f17207a = (Context) n9.m.l(context);
        this.b = n9.m.f(str);
        this.f17208c = (k) n9.m.l(kVar);
        l lVarB = FirebaseInitProvider.b();
        ig.c.b("Firebase");
        ig.c.b("ComponentDiscovery");
        List<yf.b<ComponentRegistrar>> listB = mf.f.c(context, ComponentDiscoveryService.class).b();
        ig.c.a();
        ig.c.b("Runtime");
        o.b bVarF = o.l(a0.INSTANCE).d(listB).c(new FirebaseCommonRegistrar()).c(new ExecutorsRegistrar()).b(mf.c.q(context, Context.class, new Class[0])).b(mf.c.q(this, e.class, new Class[0])).b(mf.c.q(kVar, k.class, new Class[0])).f(new ig.b());
        if (p.a(context) && FirebaseInitProvider.c()) {
            bVarF.b(mf.c.q(lVarB, l.class, new Class[0]));
        }
        o oVarE = bVarF.e();
        this.f17209d = oVarE;
        ig.c.a();
        this.f17212g = new x<>(new yf.b() { // from class: ff.c
            @Override // yf.b
            public final Object get() {
                return e.b(this.f17203a, context);
            }
        });
        this.f17213h = oVarE.g(wf.f.class);
        g(new a() { // from class: ff.d
            @Override // ff.e.a
            public final void a(boolean z10) {
                e.a(this.f17204a, z10);
            }
        });
        ig.c.a();
    }

    public static /* synthetic */ void a(e eVar, boolean z10) {
        if (z10) {
            eVar.getClass();
        } else {
            eVar.f17213h.get().h();
        }
    }

    public static /* synthetic */ eg.a b(e eVar, Context context) {
        return new eg.a(context, eVar.n(), (vf.c) eVar.f17209d.a(vf.c.class));
    }

    @NonNull
    public static e k() {
        e eVar;
        synchronized (f17205k) {
            try {
                eVar = f17206l.get("[DEFAULT]");
                if (eVar == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + n.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                eVar.f17213h.get().h();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return eVar;
    }

    public static e p(@NonNull Context context) {
        synchronized (f17205k) {
            try {
                if (f17206l.containsKey("[DEFAULT]")) {
                    return k();
                }
                k kVarA = k.a(context);
                if (kVarA == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return q(context, kVarA);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NonNull
    public static e q(@NonNull Context context, @NonNull k kVar) {
        return r(context, kVar, "[DEFAULT]");
    }

    @NonNull
    public static e r(@NonNull Context context, @NonNull k kVar, @NonNull String str) {
        e eVar;
        b.c(context);
        String strU = u(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f17205k) {
            Map<String, e> map = f17206l;
            n9.m.q(!map.containsKey(strU), "FirebaseApp name " + strU + " already exists!");
            n9.m.m(context, "Application context cannot be null.");
            eVar = new e(context, strU, kVar);
            map.put(strU, eVar);
        }
        eVar.o();
        return eVar;
    }

    public static String u(@NonNull String str) {
        return str.trim();
    }

    public boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.b.equals(((e) obj).l());
        }
        return false;
    }

    public void g(a aVar) {
        h();
        if (this.f17210e.get() && l9.c.b().d()) {
            aVar.a(true);
        }
        this.f17214i.add(aVar);
    }

    public final void h() {
        n9.m.q(!this.f17211f.get(), "FirebaseApp was deleted");
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public <T> T i(Class<T> cls) {
        h();
        return (T) this.f17209d.a(cls);
    }

    @NonNull
    public Context j() {
        h();
        return this.f17207a;
    }

    @NonNull
    public String l() {
        h();
        return this.b;
    }

    @NonNull
    public k m() {
        h();
        return this.f17208c;
    }

    public String n() {
        return u9.c.b(l().getBytes(Charset.defaultCharset())) + "+" + u9.c.b(m().c().getBytes(Charset.defaultCharset()));
    }

    public final void o() {
        if (!p.a(this.f17207a)) {
            Log.i("FirebaseApp", "Device in Direct Boot Mode: postponing initialization of Firebase APIs for app " + l());
            c.b(this.f17207a);
            return;
        }
        Log.i("FirebaseApp", "Device unlocked: initializing all Firebase APIs for app " + l());
        this.f17209d.o(t());
        this.f17213h.get().h();
    }

    public boolean s() {
        h();
        return this.f17212g.get().b();
    }

    public boolean t() {
        return "[DEFAULT]".equals(l());
    }

    public String toString() {
        return n9.k.d(this).a("name", this.b).a("options", this.f17208c).toString();
    }

    public final void v(boolean z10) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        Iterator<a> it = this.f17214i.iterator();
        while (it.hasNext()) {
            it.next().a(z10);
        }
    }
}
