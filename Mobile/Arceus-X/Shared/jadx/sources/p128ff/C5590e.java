package p128ff;

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
import eg.C5112a;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import nf.EnumC9444a0;
import p195ig.C6810a;
import p219jg.C7153b;
import p219jg.C7154c;
import p268l9.ComponentCallbacks2C8024c;
import p292mf.C8492c;
import p292mf.C8498f;
import p292mf.C8508o;
import p292mf.C8517x;
import p305n9.C8947k;
import p305n9.C8953m;
import p348p1.C10146t;
import p456u2.C11787p;
import p462u9.C11812c;
import p462u9.C11822m;
import p462u9.C11823n;
import p490vf.InterfaceC12166c;
import p504w1.C12277a;
import p575yf.InterfaceC13188b;
import wf.C12407f;

/* JADX INFO: renamed from: ff.e */
/* JADX INFO: loaded from: classes2.dex */
public class C5590e {

    /* JADX INFO: renamed from: k */
    public static final Object f21397k = new Object();

    /* JADX INFO: renamed from: l */
    public static final Map<String, C5590e> f21398l = new C12277a();

    /* JADX INFO: renamed from: a */
    public final Context f21399a;

    /* JADX INFO: renamed from: b */
    public final String f21400b;

    /* JADX INFO: renamed from: c */
    public final C5596k f21401c;

    /* JADX INFO: renamed from: d */
    public final C8508o f21402d;

    /* JADX INFO: renamed from: g */
    public final C8517x<C5112a> f21405g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC13188b<C12407f> f21406h;

    /* JADX INFO: renamed from: e */
    public final AtomicBoolean f21403e = new AtomicBoolean(false);

    /* JADX INFO: renamed from: f */
    public final AtomicBoolean f21404f = new AtomicBoolean();

    /* JADX INFO: renamed from: i */
    public final List<a> f21407i = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: j */
    public final List<Object> f21408j = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: ff.e$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo25252a(boolean z10);
    }

    /* JADX INFO: renamed from: ff.e$b */
    @TargetApi(14)
    public static class b implements ComponentCallbacks2C8024c.a {

        /* JADX INFO: renamed from: a */
        public static AtomicReference<b> f21409a = new AtomicReference<>();

        /* JADX INFO: renamed from: c */
        public static void m25277c(Context context) {
            if (C11822m.m44194a() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (f21409a.get() == null) {
                    b bVar = new b();
                    if (C10146t.m39085a(f21409a, null, bVar)) {
                        ComponentCallbacks2C8024c.m33120c(application);
                        ComponentCallbacks2C8024c.m33119b().m33121a(bVar);
                    }
                }
            }
        }

        @Override // p268l9.ComponentCallbacks2C8024c.a
        /* JADX INFO: renamed from: a */
        public void mo25278a(boolean z10) {
            synchronized (C5590e.f21397k) {
                try {
                    ArrayList arrayList = new ArrayList(C5590e.f21398l.values());
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        C5590e c5590e = (C5590e) obj;
                        if (c5590e.f21403e.get()) {
                            c5590e.m25275w(z10);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ff.e$c */
    @TargetApi(24)
    public static class c extends BroadcastReceiver {

        /* JADX INFO: renamed from: b */
        public static AtomicReference<c> f21410b = new AtomicReference<>();

        /* JADX INFO: renamed from: a */
        public final Context f21411a;

        public c(Context context) {
            this.f21411a = context;
        }

        /* JADX INFO: renamed from: b */
        public static void m25280b(Context context) {
            if (f21410b.get() == null) {
                c cVar = new c(context);
                if (C10146t.m39085a(f21410b, null, cVar)) {
                    context.registerReceiver(cVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        /* JADX INFO: renamed from: c */
        public void m25281c() {
            this.f21411a.unregisterReceiver(this);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            synchronized (C5590e.f21397k) {
                try {
                    Iterator<C5590e> it = C5590e.f21398l.values().iterator();
                    while (it.hasNext()) {
                        it.next().m25272p();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            m25281c();
        }
    }

    public C5590e(final Context context, String str, C5596k c5596k) {
        this.f21399a = (Context) C8953m.m36047l(context);
        this.f21400b = C8953m.m36041f(str);
        this.f21401c = (C5596k) C8953m.m36047l(c5596k);
        AbstractC5597l abstractC5597lM29169a = C6810a.m29169a();
        C7154c.m29955b("Firebase");
        C7154c.m29955b("ComponentDiscovery");
        List<InterfaceC13188b<ComponentRegistrar>> listM34320b = C8498f.m34318c(context, ComponentDiscoveryService.class).m34320b();
        C7154c.m29954a();
        C7154c.m29955b("Runtime");
        C8508o.b bVarM34343f = C8508o.m34328l(EnumC9444a0.INSTANCE).m34341d(listM34320b).m34340c(new FirebaseCommonRegistrar()).m34340c(new ExecutorsRegistrar()).m34339b(C8492c.m34280q(context, Context.class, new Class[0])).m34339b(C8492c.m34280q(this, C5590e.class, new Class[0])).m34339b(C8492c.m34280q(c5596k, C5596k.class, new Class[0])).m34343f(new C7153b());
        if (C11787p.m44085a(context) && C6810a.m29170b()) {
            bVarM34343f.m34339b(C8492c.m34280q(abstractC5597lM29169a, AbstractC5597l.class, new Class[0]));
        }
        C8508o c8508oM34342e = bVarM34343f.m34342e();
        this.f21402d = c8508oM34342e;
        C7154c.m29954a();
        this.f21405g = new C8517x<>(new InterfaceC13188b() { // from class: ff.c
            @Override // p575yf.InterfaceC13188b
            public final Object get() {
                return C5590e.m25254b(this.f21394a, context);
            }
        });
        this.f21406h = c8508oM34342e.mo34310g(C12407f.class);
        m25265g(new a() { // from class: ff.d
            @Override // p128ff.C5590e.a
            /* JADX INFO: renamed from: a */
            public final void mo25252a(boolean z10) {
                C5590e.m25253a(this.f21396a, z10);
            }
        });
        C7154c.m29954a();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m25253a(C5590e c5590e, boolean z10) {
        if (z10) {
            c5590e.getClass();
        } else {
            c5590e.f21406h.get().m46489h();
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
      (r4v0 android.content.Context)
      (wrap java.lang.String:0x0002: INVOKE (r3v0 ff.e) VIRTUAL call: ff.e.o():java.lang.String A[MD:():java.lang.String (m), WRAPPED])
      (wrap vf.c:0x000e: CHECK_CAST (vf.c) (wrap java.lang.Object:0x000a: INVOKE 
      (wrap mf.o:0x0006: IGET (r3v0 ff.e) A[WRAPPED] ff.e.d mf.o)
      (wrap java.lang.Class:0x0008: CONST_CLASS  A[WRAPPED] vf.c.class)
     INTERFACE call: mf.d.a(java.lang.Class):java.lang.Object A[MD:<T>:(java.lang.Class<T>):T (m), WRAPPED]))
     A[MD:(android.content.Context, java.lang.String, vf.c):void (m)] call: eg.a.<init>(android.content.Context, java.lang.String, vf.c):void type: CONSTRUCTOR */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C5112a m25254b(C5590e c5590e, Context context) {
        return new C5112a(context, c5590e.m25271o(), (InterfaceC12166c) c5590e.f21402d.mo34304a(InterfaceC12166c.class));
    }

    @NonNull
    /* JADX INFO: renamed from: k */
    public static List<C5590e> m25259k(@NonNull Context context) {
        ArrayList arrayList;
        synchronized (f21397k) {
            arrayList = new ArrayList(f21398l.values());
        }
        return arrayList;
    }

    @NonNull
    /* JADX INFO: renamed from: l */
    public static C5590e m25260l() {
        C5590e c5590e;
        synchronized (f21397k) {
            try {
                c5590e = f21398l.get("[DEFAULT]");
                if (c5590e == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + C11823n.m44205a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                c5590e.f21406h.get().m46489h();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c5590e;
    }

    /* JADX INFO: renamed from: q */
    public static C5590e m25261q(@NonNull Context context) {
        synchronized (f21397k) {
            try {
                if (f21398l.containsKey("[DEFAULT]")) {
                    return m25260l();
                }
                C5596k c5596kM25283a = C5596k.m25283a(context);
                if (c5596kM25283a == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return m25262r(context, c5596kM25283a);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NonNull
    /* JADX INFO: renamed from: r */
    public static C5590e m25262r(@NonNull Context context, @NonNull C5596k c5596k) {
        return m25263s(context, c5596k, "[DEFAULT]");
    }

    @NonNull
    /* JADX INFO: renamed from: s */
    public static C5590e m25263s(@NonNull Context context, @NonNull C5596k c5596k, @NonNull String str) {
        C5590e c5590e;
        b.m25277c(context);
        String strM25264v = m25264v(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f21397k) {
            Map<String, C5590e> map = f21398l;
            C8953m.m36052q(!map.containsKey(strM25264v), "FirebaseApp name " + strM25264v + " already exists!");
            C8953m.m36048m(context, "Application context cannot be null.");
            c5590e = new C5590e(context, strM25264v, c5596k);
            map.put(strM25264v, c5590e);
        }
        c5590e.m25272p();
        return c5590e;
    }

    /* JADX INFO: renamed from: v */
    public static String m25264v(@NonNull String str) {
        return str.trim();
    }

    public boolean equals(Object obj) {
        if (obj instanceof C5590e) {
            return this.f21400b.equals(((C5590e) obj).m25269m());
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public void m25265g(a aVar) {
        m25266h();
        if (this.f21403e.get() && ComponentCallbacks2C8024c.m33119b().m33122d()) {
            aVar.mo25252a(true);
        }
        this.f21407i.add(aVar);
    }

    /* JADX INFO: renamed from: h */
    public final void m25266h() {
        C8953m.m36052q(!this.f21404f.get(), "FirebaseApp was deleted");
    }

    public int hashCode() {
        return this.f21400b.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public <T> T m25267i(Class<T> cls) {
        m25266h();
        return (T) this.f21402d.mo34304a(cls);
    }

    @NonNull
    /* JADX INFO: renamed from: j */
    public Context m25268j() {
        m25266h();
        return this.f21399a;
    }

    @NonNull
    /* JADX INFO: renamed from: m */
    public String m25269m() {
        m25266h();
        return this.f21400b;
    }

    @NonNull
    /* JADX INFO: renamed from: n */
    public C5596k m25270n() {
        m25266h();
        return this.f21401c;
    }

    /* JADX INFO: renamed from: o */
    public String m25271o() {
        return C11812c.m44172b(m25269m().getBytes(Charset.defaultCharset())) + "+" + C11812c.m44172b(m25270n().m25285c().getBytes(Charset.defaultCharset()));
    }

    /* JADX INFO: renamed from: p */
    public final void m25272p() {
        if (!C11787p.m44085a(this.f21399a)) {
            Log.i("FirebaseApp", "Device in Direct Boot Mode: postponing initialization of Firebase APIs for app " + m25269m());
            c.m25280b(this.f21399a);
            return;
        }
        Log.i("FirebaseApp", "Device unlocked: initializing all Firebase APIs for app " + m25269m());
        this.f21402d.m34333o(m25274u());
        this.f21406h.get().m46489h();
    }

    /* JADX INFO: renamed from: t */
    public boolean m25273t() {
        m25266h();
        return this.f21405g.get().m23858b();
    }

    public String toString() {
        return C8947k.m36028d(this).m36029a("name", this.f21400b).m36029a("options", this.f21401c).toString();
    }

    /* JADX INFO: renamed from: u */
    public boolean m25274u() {
        return "[DEFAULT]".equals(m25269m());
    }

    /* JADX INFO: renamed from: w */
    public final void m25275w(boolean z10) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        Iterator<a> it = this.f21407i.iterator();
        while (it.hasNext()) {
            it.next().mo25252a(z10);
        }
    }
}
