package hf;

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
import o9.q;
import o9.s;
import of.o;
import of.x;
import p1.t;
import pf.a0;
import u2.p;
import v9.m;
import v9.n;

/* JADX INFO: loaded from: classes2.dex */
public class e {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Object f18191k = new Object();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Map<String, e> f18192l = new w1.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f18193a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f18194c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o f18195d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x<gg.a> f18198g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ag.b<yf.f> f18199h;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f18196e = new AtomicBoolean(false);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f18197f = new AtomicBoolean();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List<a> f18200i = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List<Object> f18201j = new CopyOnWriteArrayList();

    public interface a {
        void a(boolean z10);
    }

    @TargetApi(14)
    public static class b implements m9.c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static AtomicReference<b> f18202a = new AtomicReference<>();

        public static void c(Context context) {
            if (m.a() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (f18202a.get() == null) {
                    b bVar = new b();
                    if (t.a(f18202a, null, bVar)) {
                        m9.c.c(application);
                        m9.c.b().a(bVar);
                    }
                }
            }
        }

        @Override // m9.c.a
        public void a(boolean z10) {
            synchronized (e.f18191k) {
                try {
                    ArrayList arrayList = new ArrayList(e.f18192l.values());
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        e eVar = (e) obj;
                        if (eVar.f18196e.get()) {
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
        public final Context f18203a;

        public c(Context context) {
            this.f18203a = context;
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
            this.f18203a.unregisterReceiver(this);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            synchronized (e.f18191k) {
                try {
                    Iterator<e> it = e.f18192l.values().iterator();
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
        this.f18193a = (Context) s.l(context);
        this.b = s.f(str);
        this.f18194c = (k) s.l(kVar);
        l lVarB = FirebaseInitProvider.b();
        kg.c.b("Firebase");
        kg.c.b("ComponentDiscovery");
        List<ag.b<ComponentRegistrar>> listB = of.f.c(context, ComponentDiscoveryService.class).b();
        kg.c.a();
        kg.c.b("Runtime");
        o.b bVarF = o.l(a0.INSTANCE).d(listB).c(new FirebaseCommonRegistrar()).c(new ExecutorsRegistrar()).b(of.c.q(context, Context.class, new Class[0])).b(of.c.q(this, e.class, new Class[0])).b(of.c.q(kVar, k.class, new Class[0])).f(new kg.b());
        if (p.a(context) && FirebaseInitProvider.c()) {
            bVarF.b(of.c.q(lVarB, l.class, new Class[0]));
        }
        o oVarE = bVarF.e();
        this.f18195d = oVarE;
        kg.c.a();
        this.f18198g = new x<>(new ag.b() { // from class: hf.c
            @Override // ag.b
            public final Object get() {
                return e.b(this.f18189a, context);
            }
        });
        this.f18199h = oVarE.d(yf.f.class);
        g(new a() { // from class: hf.d
            @Override // hf.e.a
            public final void a(boolean z10) {
                e.a(this.f18190a, z10);
            }
        });
        kg.c.a();
    }

    public static /* synthetic */ void a(e eVar, boolean z10) {
        if (z10) {
            eVar.getClass();
        } else {
            eVar.f18199h.get().h();
        }
    }

    public static /* synthetic */ gg.a b(e eVar, Context context) {
        return new gg.a(context, eVar.o(), (xf.c) eVar.f18195d.a(xf.c.class));
    }

    @NonNull
    public static List<e> k(@NonNull Context context) {
        ArrayList arrayList;
        synchronized (f18191k) {
            arrayList = new ArrayList(f18192l.values());
        }
        return arrayList;
    }

    @NonNull
    public static e l() {
        e eVar;
        synchronized (f18191k) {
            try {
                eVar = f18192l.get("[DEFAULT]");
                if (eVar == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + n.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                eVar.f18199h.get().h();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return eVar;
    }

    public static e q(@NonNull Context context) {
        synchronized (f18191k) {
            try {
                if (f18192l.containsKey("[DEFAULT]")) {
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
        synchronized (f18191k) {
            Map<String, e> map = f18192l;
            s.q(!map.containsKey(strV), "FirebaseApp name " + strV + " already exists!");
            s.m(context, "Application context cannot be null.");
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
        if (this.f18196e.get() && m9.c.b().d()) {
            aVar.a(true);
        }
        this.f18200i.add(aVar);
    }

    public final void h() {
        s.q(!this.f18197f.get(), "FirebaseApp was deleted");
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public <T> T i(Class<T> cls) {
        h();
        return (T) this.f18195d.a(cls);
    }

    @NonNull
    public Context j() {
        h();
        return this.f18193a;
    }

    @NonNull
    public String m() {
        h();
        return this.b;
    }

    @NonNull
    public k n() {
        h();
        return this.f18194c;
    }

    public String o() {
        return v9.c.b(m().getBytes(Charset.defaultCharset())) + "+" + v9.c.b(n().c().getBytes(Charset.defaultCharset()));
    }

    public final void p() {
        if (!p.a(this.f18193a)) {
            Log.i("FirebaseApp", "Device in Direct Boot Mode: postponing initialization of Firebase APIs for app " + m());
            c.b(this.f18193a);
            return;
        }
        Log.i("FirebaseApp", "Device unlocked: initializing all Firebase APIs for app " + m());
        this.f18195d.o(u());
        this.f18199h.get().h();
    }

    public boolean t() {
        h();
        return this.f18198g.get().b();
    }

    public String toString() {
        return q.d(this).a("name", this.b).a("options", this.f18194c).toString();
    }

    public boolean u() {
        return "[DEFAULT]".equals(m());
    }

    public final void w(boolean z10) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        Iterator<a> it = this.f18200i.iterator();
        while (it.hasNext()) {
            it.next().a(z10);
        }
    }
}
