package ob;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseArray;
import backtraceio.library.services.BacktraceMetrics;
import com.appsflyer.sdk_base.referrer.Payload;
import com.github.luben.zstd.BuildConfig;
import com.google.android.gms.internal.measurement.zf;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;
import p001kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class va extends g5 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ia f27874c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public z8 f27875d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Set f27876e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f27877f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicReference f27878g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f27879h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f27880i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f27881j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public z f27882k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public z f27883l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public PriorityQueue f27884m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f27885n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public v8 f27886o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final AtomicLong f27887p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f27888q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final of f27889r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f27890s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public z f27891t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public SharedPreferences.OnSharedPreferenceChangeListener f27892u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public z f27893v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ef f27894w;

    public va(l7 l7Var) {
        super(l7Var);
        this.f27876e = new CopyOnWriteArraySet();
        this.f27879h = new Object();
        this.f27880i = false;
        this.f27881j = 1;
        this.f27890s = true;
        this.f27894w = new x9(this);
        this.f27878g = new AtomicReference();
        this.f27886o = v8.f27868c;
        this.f27888q = -1L;
        this.f27887p = new AtomicLong(0L);
        this.f27889r = new of(l7Var);
    }

    public final void A(String str, String str2, long j10, Object obj) {
        this.f27641a.b().t(new o9(this, str, str2, obj, j10));
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0053 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0055  */
    public final void B(String str, String str2, Object obj, long j10) {
        o9.s.f(str);
        o9.s.f(str2);
        h();
        j();
        Object obj2 = obj;
        if ("allow_personalized_ads".equals(str2)) {
            if (obj instanceof String) {
                String str3 = (String) obj;
                if (!TextUtils.isEmpty(str3)) {
                    long j11 = true != "false".equals(str3.toLowerCase(Locale.ENGLISH)) ? 0L : 1L;
                    l7 l7Var = this.f27641a;
                    Long lValueOf = Long.valueOf(j11);
                    l7Var.x().f27694n.b(lValueOf.longValue() == 1 ? "true" : "false");
                    obj = lValueOf;
                } else if (obj == null) {
                    this.f27641a.x().f27694n.b("unset");
                    obj = obj;
                }
                str2 = "_npa";
            } else if (obj == null) {
                this.f27641a.x().f27694n.b("unset");
                obj = obj;
                str2 = "_npa";
            }
            this.f27641a.a().w().c("Setting user property(FE)", "non_personalized_ads(_npa)", obj);
            obj2 = obj;
        }
        String str4 = str2;
        Object obj3 = obj2;
        l7 l7Var2 = this.f27641a;
        if (!l7Var2.g()) {
            this.f27641a.a().w().a("User property not set since app measurement is disabled");
        } else if (l7Var2.m()) {
            this.f27641a.J().o(new bf(str4, j10, obj3, str));
        }
    }

    public final Map C(String str, String str2, boolean z10) {
        l7 l7Var = this.f27641a;
        if (l7Var.b().p()) {
            l7Var.a().o().a("Cannot get user properties from analytics worker thread");
            return Collections.EMPTY_MAP;
        }
        l7Var.c();
        if (f.a()) {
            l7Var.a().o().a("Cannot get user properties from main thread");
            return Collections.EMPTY_MAP;
        }
        AtomicReference atomicReference = new AtomicReference();
        this.f27641a.b().u(atomicReference, 5000L, "get user properties", new v9(this, atomicReference, null, str, str2, z10));
        List<bf> list = (List) atomicReference.get();
        if (list == null) {
            l7Var.a().o().b("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z10));
            return Collections.EMPTY_MAP;
        }
        w1.a aVar = new w1.a(list.size());
        for (bf bfVar : list) {
            Object objZza = bfVar.zza();
            if (objZza != null) {
                aVar.put(bfVar.f27127g, objZza);
            }
        }
        return aVar;
    }

    public final String D() {
        return (String) this.f27878g.get();
    }

    public final void E(String str) {
        this.f27878g.set(str);
    }

    public final void F() {
        h();
        l7 l7Var = this.f27641a;
        if (l7Var.x().f27701u.a()) {
            l7Var.a().v().a("Deferred Deep Link already retrieved. Not fetching again.");
            return;
        }
        long jA = l7Var.x().f27702v.a();
        l7Var.x().f27702v.b(1 + jA);
        l7Var.w();
        if (jA >= 5) {
            l7Var.a().r().a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
            l7Var.x().f27701u.b(true);
        } else {
            if (this.f27891t == null) {
                this.f27891t = new q9(this, this.f27641a);
            }
            this.f27891t.b(0L);
        }
    }

    public final void G(long j10) {
        this.f27878g.set(null);
        this.f27641a.b().t(new r9(this, j10));
    }

    public final void H() {
        h();
        j();
        if (this.f27641a.m()) {
            l7 l7Var = this.f27641a;
            m mVarW = l7Var.w();
            mVarW.f27641a.c();
            Boolean boolJ = mVarW.J("google_analytics_deferred_deep_link_enabled");
            if (boolJ != null && boolJ.booleanValue()) {
                l7Var.a().v().a("Deferred Deep Link feature enabled.");
                l7Var.b().t(new Runnable() { // from class: ob.sa
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.f27797a.F();
                    }
                });
            }
            this.f27641a.J().s();
            this.f27890s = false;
            p6 p6VarX = l7Var.x();
            p6VarX.h();
            String string = p6VarX.p().getString("previous_os_version", null);
            p6VarX.f27641a.K().l();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor editorEdit = p6VarX.p().edit();
                editorEdit.putString("previous_os_version", str);
                editorEdit.apply();
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            l7Var.K().l();
            if (string.equals(str)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", string);
            t("auto", "_ou", bundle);
        }
    }

    public final void I(z8 z8Var) {
        z8 z8Var2;
        h();
        j();
        if (z8Var != null && z8Var != (z8Var2 = this.f27875d)) {
            o9.s.q(z8Var2 == null, "EventInterceptor already set.");
        }
        this.f27875d = z8Var;
    }

    public final void J(a9 a9Var) {
        j();
        o9.s.l(a9Var);
        if (this.f27876e.add(a9Var)) {
            return;
        }
        this.f27641a.a().r().a("OnEventListener already registered");
    }

    public final void K(a9 a9Var) {
        j();
        o9.s.l(a9Var);
        if (this.f27876e.remove(a9Var)) {
            return;
        }
        this.f27641a.a().r().a("OnEventListener had not been registered");
    }

    public final int L(String str) {
        o9.s.f(str);
        this.f27641a.w();
        return 25;
    }

    public final void M(Bundle bundle) {
        N(bundle, this.f27641a.e().a());
    }

    public final void N(Bundle bundle, long j10) {
        o9.s.l(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            this.f27641a.a().r().a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        o9.s.l(bundle2);
        r8.b(bundle2, "app_id", String.class, null);
        r8.b(bundle2, "origin", String.class, null);
        r8.b(bundle2, "name", String.class, null);
        r8.b(bundle2, "value", Object.class, null);
        r8.b(bundle2, "trigger_event_name", String.class, null);
        r8.b(bundle2, "trigger_timeout", Long.class, 0L);
        r8.b(bundle2, "timed_out_event_name", String.class, null);
        r8.b(bundle2, "timed_out_event_params", Bundle.class, null);
        r8.b(bundle2, "triggered_event_name", String.class, null);
        r8.b(bundle2, "triggered_event_params", Bundle.class, null);
        r8.b(bundle2, "time_to_live", Long.class, 0L);
        r8.b(bundle2, "expired_event_name", String.class, null);
        r8.b(bundle2, "expired_event_params", Bundle.class, null);
        o9.s.f(bundle2.getString("name"));
        o9.s.f(bundle2.getString("origin"));
        o9.s.l(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j10);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        l7 l7Var = this.f27641a;
        if (l7Var.C().y0(string) != 0) {
            l7Var.a().o().b("Invalid conditional user property name", l7Var.D().c(string));
            return;
        }
        if (l7Var.C().y(string, obj) != 0) {
            l7Var.a().o().c("Invalid conditional user property value", l7Var.D().c(string), obj);
            return;
        }
        Object objZ = l7Var.C().z(string, obj);
        if (objZ == null) {
            l7Var.a().o().c("Unable to normalize conditional user property value", l7Var.D().c(string), obj);
            return;
        }
        r8.a(bundle2, objZ);
        long j11 = bundle2.getLong("trigger_timeout");
        if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name"))) {
            l7Var.w();
            if (j11 > 15552000000L || j11 < 1) {
                l7Var.a().o().c("Invalid conditional user property timeout", l7Var.D().c(string), Long.valueOf(j11));
                return;
            }
        }
        long j12 = bundle2.getLong("time_to_live");
        l7Var.w();
        if (j12 > 15552000000L || j12 < 1) {
            l7Var.a().o().c("Invalid conditional user property time to live", l7Var.D().c(string), Long.valueOf(j12));
        } else {
            l7Var.b().t(new s9(this, bundle2));
        }
    }

    public final void O(String str, String str2, Bundle bundle) {
        l7 l7Var = this.f27641a;
        long jA = l7Var.e().a();
        o9.s.f(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", jA);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        l7Var.b().t(new t9(this, bundle2));
    }

    public final ArrayList P(String str, String str2) {
        l7 l7Var = this.f27641a;
        if (l7Var.b().p()) {
            l7Var.a().o().a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        l7Var.c();
        if (f.a()) {
            l7Var.a().o().a("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        this.f27641a.b().u(atomicReference, 5000L, "get conditional user properties", new u9(this, atomicReference, null, str, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return ff.h0(list);
        }
        l7Var.a().o().b("Timed out waiting for get conditional user properties", null);
        return new ArrayList();
    }

    public final String Q() {
        gb gbVarU = this.f27641a.I().u();
        if (gbVarU != null) {
            return gbVarU.f27354a;
        }
        return null;
    }

    public final String R() {
        gb gbVarU = this.f27641a.I().u();
        if (gbVarU != null) {
            return gbVarU.b;
        }
        return null;
    }

    public final String S() {
        try {
            return fb.a(this.f27641a.d(), "google_app_id", this.f27641a.H());
        } catch (IllegalStateException e10) {
            this.f27641a.a().o().b("getGoogleAppId failed with exception", e10);
            return null;
        }
    }

    public final /* synthetic */ void T(SharedPreferences sharedPreferences, String str) {
        l7 l7Var = this.f27641a;
        if (!l7Var.w().H(null, e5.f27226a1)) {
            if (Objects.equals(str, "IABTCF_TCString")) {
                l7Var.a().w().a("IABTCF_TCString change picked up in listener.");
                ((z) o9.s.l(this.f27893v)).b(500L);
                return;
            }
            return;
        }
        if (Objects.equals(str, "IABTCF_TCString") || Objects.equals(str, "IABTCF_gdprApplies") || Objects.equals(str, "IABTCF_EnableAdvertiserConsentMode")) {
            l7Var.a().w().a("IABTCF_TCString change picked up in listener.");
            ((z) o9.s.l(this.f27893v)).b(500L);
        }
    }

    public final /* synthetic */ void U(Bundle bundle) {
        Bundle bundle2;
        int i10;
        if (bundle.isEmpty()) {
            bundle2 = bundle;
        } else {
            l7 l7Var = this.f27641a;
            bundle2 = new Bundle(l7Var.x().f27706z.a());
            Iterator<String> it = bundle.keySet().iterator();
            while (true) {
                i10 = 0;
                if (!it.hasNext()) {
                    break;
                }
                String next = it.next();
                Object obj = bundle.get(next);
                if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                    if (l7Var.C().B0(obj)) {
                        l7Var.C().B(this.f27894w, null, 27, null, null, 0);
                    }
                    l7Var.a().t().c("Invalid default event parameter type. Name, value", next, obj);
                } else if (ff.N(next)) {
                    l7Var.a().t().b("Invalid default event parameter name. Name", next);
                } else if (obj == null) {
                    bundle2.remove(next);
                } else if (l7Var.C().C0("param", next, l7Var.w().x(null, false), obj)) {
                    l7Var.C().A(bundle2, next, obj);
                }
            }
            l7Var.C();
            int iV = l7Var.w().v();
            if (bundle2.size() > iV) {
                for (String str : new TreeSet(bundle2.keySet())) {
                    i10++;
                    if (i10 > iV) {
                        bundle2.remove(str);
                    }
                }
                l7Var.C().B(this.f27894w, null, 26, null, null, 0);
                l7Var.a().t().a("Too many default event parameters set. Discarding beyond event parameter limit");
            }
        }
        l7 l7Var2 = this.f27641a;
        l7Var2.x().f27706z.b(bundle2);
        if (!bundle.isEmpty() || l7Var2.w().H(null, e5.X0)) {
            this.f27641a.J().v(bundle2);
        }
    }

    public final /* synthetic */ void V(int i10) {
        if (this.f27882k == null) {
            this.f27882k = new h9(this, this.f27641a);
        }
        this.f27882k.b(((long) i10) * 1000);
    }

    public final /* synthetic */ void W(Boolean bool, boolean z10) {
        f0(bool, true);
    }

    public final /* synthetic */ void X(v8 v8Var, long j10, boolean z10, boolean z11) {
        h();
        j();
        l7 l7Var = this.f27641a;
        v8 v8VarW = l7Var.x().w();
        if (j10 <= this.f27888q && v8.u(v8VarW.b(), v8Var.b())) {
            l7Var.a().u().b("Dropped out-of-date consent setting, proposed settings", v8Var);
            return;
        }
        p6 p6VarX = l7Var.x();
        l7 l7Var2 = p6VarX.f27641a;
        p6VarX.h();
        int iB = v8Var.b();
        if (!p6VarX.v(iB)) {
            l7Var.a().u().b("Lower precedence consent source ignored, proposed source", Integer.valueOf(v8Var.b()));
            return;
        }
        l7 l7Var3 = this.f27641a;
        SharedPreferences.Editor editorEdit = p6VarX.p().edit();
        editorEdit.putString("consent_settings", v8Var.l());
        editorEdit.putInt("consent_source", iB);
        editorEdit.apply();
        l7Var.a().w().b("Setting storage consent(FE)", v8Var);
        this.f27888q = j10;
        if (l7Var3.J().D()) {
            l7Var3.J().Z(z10);
        } else {
            l7Var3.J().Y(z10);
        }
        if (z11) {
            l7Var3.J().q(new AtomicReference());
        }
    }

    public final /* synthetic */ void Z(boolean z10) {
        this.f27880i = false;
    }

    public final /* synthetic */ int a0() {
        return this.f27881j;
    }

    public final /* synthetic */ void b0(int i10) {
        this.f27881j = i10;
    }

    public final /* synthetic */ z c0() {
        return this.f27891t;
    }

    public final /* synthetic */ int d0(Throwable th2) {
        String message = th2.getMessage();
        this.f27885n = false;
        if (message == null) {
            return 2;
        }
        if (!(th2 instanceof IllegalStateException) && !message.contains("garbage collected") && !th2.getClass().getSimpleName().equals("ServiceUnavailableException")) {
            return (!(th2 instanceof SecurityException) || message.endsWith("READ_DEVICE_CONFIG")) ? 2 : 3;
        }
        if (!message.contains("Background")) {
            return 1;
        }
        this.f27885n = true;
        return 1;
    }

    public final db e0(final ae aeVar) {
        try {
            URL url = new URI(aeVar.f27091h).toURL();
            final AtomicReference atomicReference = new AtomicReference();
            String strS = this.f27641a.L().s();
            l7 l7Var = this.f27641a;
            z5 z5VarW = l7Var.a().w();
            Long lValueOf = Long.valueOf(aeVar.f27089f);
            z5VarW.d("[sgtm] Uploading data from app. row_id, url, uncompressed size", lValueOf, aeVar.f27091h, Integer.valueOf(aeVar.f27090g.length));
            if (!TextUtils.isEmpty(aeVar.f27095l)) {
                l7Var.a().w().c("[sgtm] Uploading data from app. row_id", lValueOf, aeVar.f27095l);
            }
            HashMap map = new HashMap();
            Bundle bundle = aeVar.f27092i;
            for (String str : bundle.keySet()) {
                String string = bundle.getString(str);
                if (!TextUtils.isEmpty(string)) {
                    map.put(str, string);
                }
            }
            ab abVarF = l7Var.F();
            byte[] bArr = aeVar.f27090g;
            xa xaVar = new xa() { // from class: ob.ja
                /* JADX WARN: Code duplicated, block: B:10:0x0016  */
                /* JADX WARN: Code duplicated, block: B:11:0x002e A[PHI: r8
                  0x002e: PHI (r8v7 int) = (r8v1 int), (r8v0 int) binds: [B:9:0x0014, B:7:0x0011] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Code duplicated, block: B:13:0x0064  */
                /* JADX WARN: Code duplicated, block: B:14:0x0067  */
                @Override // ob.xa
                public final /* synthetic */ void a(String str2, int i10, Throwable th2, byte[] bArr2, Map map2) {
                    db dbVar;
                    va vaVar = this.f27491a;
                    vaVar.h();
                    ae aeVar2 = aeVar;
                    if (i10 == 200 || i10 == 204) {
                        if (th2 == null) {
                            vaVar.f27641a.a().w().b("[sgtm] Upload succeeded for row_id", Long.valueOf(aeVar2.f27089f));
                            dbVar = db.SUCCESS;
                        } else {
                            vaVar.f27641a.a().r().d("[sgtm] Upload failed for row_id. response, exception", Long.valueOf(aeVar2.f27089f), Integer.valueOf(i10), th2);
                            if (Arrays.asList(((String) e5.f27275u.b(null)).split(",")).contains(String.valueOf(i10))) {
                                dbVar = db.BACKOFF;
                            } else {
                                dbVar = db.FAILURE;
                            }
                        }
                    } else if (i10 == 304) {
                        i10 = 304;
                        if (th2 == null) {
                            vaVar.f27641a.a().w().b("[sgtm] Upload succeeded for row_id", Long.valueOf(aeVar2.f27089f));
                            dbVar = db.SUCCESS;
                        } else {
                            vaVar.f27641a.a().r().d("[sgtm] Upload failed for row_id. response, exception", Long.valueOf(aeVar2.f27089f), Integer.valueOf(i10), th2);
                            if (Arrays.asList(((String) e5.f27275u.b(null)).split(",")).contains(String.valueOf(i10))) {
                                dbVar = db.BACKOFF;
                            } else {
                                dbVar = db.FAILURE;
                            }
                        }
                    } else {
                        vaVar.f27641a.a().r().d("[sgtm] Upload failed for row_id. response, exception", Long.valueOf(aeVar2.f27089f), Integer.valueOf(i10), th2);
                        if (Arrays.asList(((String) e5.f27275u.b(null)).split(",")).contains(String.valueOf(i10))) {
                            dbVar = db.BACKOFF;
                        } else {
                            dbVar = db.FAILURE;
                        }
                    }
                    AtomicReference atomicReference2 = atomicReference;
                    yc ycVarJ = vaVar.f27641a.J();
                    long j10 = aeVar2.f27089f;
                    ycVarJ.k0(new g(j10, dbVar.zza(), aeVar2.f27094k));
                    vaVar.f27641a.a().w().c("[sgtm] Updated status for row_id", Long.valueOf(j10), dbVar);
                    synchronized (atomicReference2) {
                        atomicReference2.set(dbVar);
                        atomicReference2.notifyAll();
                    }
                }
            };
            abVarF.l();
            o9.s.l(url);
            o9.s.l(bArr);
            o9.s.l(xaVar);
            abVarF.f27641a.b().w(new za(abVarF, strS, url, bArr, map, xaVar));
            try {
                l7 l7Var2 = l7Var.C().f27641a;
                long jA = l7Var2.e().a() + 60000;
                synchronized (atomicReference) {
                    for (long jA2 = 60000; atomicReference.get() == null && jA2 > 0; jA2 = jA - l7Var2.e().a()) {
                        try {
                            atomicReference.wait(jA2);
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            } catch (InterruptedException unused) {
                this.f27641a.a().r().a("[sgtm] Interrupted waiting for uploading batch");
            }
            return atomicReference.get() == null ? db.UNKNOWN : (db) atomicReference.get();
        } catch (MalformedURLException | URISyntaxException e10) {
            this.f27641a.a().o().d("[sgtm] Bad upload url for row_id", aeVar.f27091h, Long.valueOf(aeVar.f27089f), e10);
            return db.FAILURE;
        }
    }

    public final void f0(Boolean bool, boolean z10) {
        h();
        j();
        l7 l7Var = this.f27641a;
        l7Var.a().v().b("Setting app measurement enabled (FE)", bool);
        l7Var.x().s(bool);
        if (z10) {
            p6 p6VarX = l7Var.x();
            l7 l7Var2 = p6VarX.f27641a;
            p6VarX.h();
            SharedPreferences.Editor editorEdit = p6VarX.p().edit();
            if (bool != null) {
                editorEdit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                editorEdit.remove("measurement_enabled_from_api");
            }
            editorEdit.apply();
        }
        if (this.f27641a.j() || !(bool == null || bool.booleanValue())) {
            Y();
        }
    }

    /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
    public final void Y() {
        va vaVar;
        h();
        l7 l7Var = this.f27641a;
        String strA = l7Var.x().f27694n.a();
        if (strA == null) {
            vaVar = this;
        } else if ("unset".equals(strA)) {
            vaVar = this;
            vaVar.B(Payload.TYPE_APP, "_npa", null, l7Var.e().a());
        } else {
            B(Payload.TYPE_APP, "_npa", Long.valueOf(true != "true".equals(strA) ? 0L : 1L), l7Var.e().a());
            vaVar = this;
        }
        if (!vaVar.f27641a.g() || !vaVar.f27890s) {
            l7Var.a().v().a("Updating Scion state (FE)");
            vaVar.f27641a.J().X();
        } else {
            l7Var.a().v().a("Recording app launch after enabling measurement for the first time (FE)");
            H();
            vaVar.f27641a.z().f27746e.a();
            l7Var.b().t(new j9(this));
        }
    }

    public final void h0() {
        l7 l7Var = this.f27641a;
        if (!(l7Var.d().getApplicationContext() instanceof Application) || this.f27874c == null) {
            return;
        }
        ((Application) l7Var.d().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f27874c);
    }

    public final Boolean i0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) this.f27641a.b().u(atomicReference, 15000L, "boolean test flag value", new p9(this, atomicReference));
    }

    public final String j0() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) this.f27641a.b().u(atomicReference, 15000L, "String test flag value", new y9(this, atomicReference));
    }

    public final Long k0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) this.f27641a.b().u(atomicReference, 15000L, "long test flag value", new z9(this, atomicReference));
    }

    public final Integer l0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) this.f27641a.b().u(atomicReference, 15000L, "int test flag value", new aa(this, atomicReference));
    }

    @Override // ob.g5
    public final boolean m() {
        return false;
    }

    public final Double m0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) this.f27641a.b().u(atomicReference, 15000L, "double test flag value", new ba(this, atomicReference));
    }

    public final void n0(Boolean bool) {
        j();
        this.f27641a.b().t(new ca(this, bool));
    }

    public final void o(v8 v8Var) {
        h();
        boolean z10 = (v8Var.o(u8.ANALYTICS_STORAGE) && v8Var.o(u8.AD_STORAGE)) || this.f27641a.J().C();
        l7 l7Var = this.f27641a;
        if (z10 != l7Var.j()) {
            l7Var.i(z10);
            p6 p6VarX = this.f27641a.x();
            l7 l7Var2 = p6VarX.f27641a;
            p6VarX.h();
            Boolean boolValueOf = p6VarX.p().contains("measurement_enabled_from_api") ? Boolean.valueOf(p6VarX.p().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z10 || boolValueOf == null || boolValueOf.booleanValue()) {
                f0(Boolean.valueOf(z10), false);
            }
        }
    }

    public final void o0(Bundle bundle, int i10, long j10) {
        Object obj;
        String string;
        j();
        v8 v8Var = v8.f27868c;
        u8[] u8VarArrB = t8.STORAGE.b();
        int length = u8VarArrB.length;
        int i11 = 0;
        while (true) {
            obj = null;
            if (i11 >= length) {
                break;
            }
            String str = u8VarArrB[i11].f27847a;
            if (bundle.containsKey(str) && (string = bundle.getString(str)) != null) {
                if (string.equals("granted")) {
                    obj = Boolean.TRUE;
                } else if (string.equals("denied")) {
                    obj = Boolean.FALSE;
                }
                if (obj == null) {
                    obj = string;
                    break;
                }
            }
            i11++;
        }
        if (obj != null) {
            l7 l7Var = this.f27641a;
            l7Var.a().t().b("Ignoring invalid consent setting", obj);
            l7Var.a().t().a("Valid consent values are 'granted', 'denied'");
        }
        boolean zP = this.f27641a.b().p();
        v8 v8VarE = v8.e(bundle, i10);
        if (v8VarE.c()) {
            q0(v8VarE, zP);
        }
        a0 a0VarH = a0.h(bundle, i10);
        if (a0VarH.d()) {
            p0(a0VarH, zP);
        }
        Boolean boolI = a0.i(bundle);
        if (boolI != null) {
            String str2 = i10 == -30 ? "tcf" : Payload.TYPE_APP;
            if (zP) {
                B(str2, "allow_personalized_ads", boolI.toString(), j10);
            } else {
                z(str2, "allow_personalized_ads", boolI.toString(), false, j10);
            }
        }
    }

    public final void p(String str, String str2, Bundle bundle) {
        q(str, str2, bundle, true, true, this.f27641a.e().a());
    }

    public final void p0(a0 a0Var, boolean z10) {
        da daVar = new da(this, a0Var);
        if (!z10) {
            this.f27641a.b().t(daVar);
        } else {
            h();
            daVar.run();
        }
    }

    public final void q(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        Bundle bundle2 = bundle;
        if (Objects.equals(str2, "screen_view")) {
            this.f27641a.I().s(bundle2, j10);
            return;
        }
        boolean z12 = true;
        if (z11 && this.f27875d != null && !ff.N(str2)) {
            z12 = false;
        }
        boolean z13 = z12;
        if (str == null) {
            str = Payload.TYPE_APP;
        }
        x(str, str2, j10, bundle2, z11, z13, z10, null);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:56:0x00d0
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1478)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public final void q0(ob.v8 r10, boolean r11) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ob.va.q0(ob.v8, boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void r() {
        rd rdVar;
        rd rdVar2;
        com.google.android.gms.internal.measurement.t9 t9Var;
        h();
        l7 l7Var = this.f27641a;
        l7Var.a().v().a("Handle tcf update.");
        SharedPreferences sharedPreferencesQ = l7Var.x().q();
        HashMap map = new HashMap();
        d5 d5Var = e5.f27226a1;
        if (((Boolean) d5Var.b(null)).booleanValue()) {
            ke.t tVar = td.f27826a;
            com.google.android.gms.internal.measurement.s9 s9Var = com.google.android.gms.internal.measurement.s9.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE;
            sd sdVar = sd.CONSENT;
            Map.Entry entryA = ua.a(s9Var, sdVar);
            int i10 = 2;
            com.google.android.gms.internal.measurement.s9 s9Var2 = com.google.android.gms.internal.measurement.s9.IAB_TCF_PURPOSE_SELECT_BASIC_ADS;
            int i11 = 1;
            sd sdVar2 = sd.FLEXIBLE_LEGITIMATE_INTEREST;
            ke.u uVarN = ke.u.n(entryA, ua.a(s9Var2, sdVar2), ua.a(com.google.android.gms.internal.measurement.s9.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE, sdVar), ua.a(com.google.android.gms.internal.measurement.s9.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS, sdVar), ua.a(com.google.android.gms.internal.measurement.s9.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE, sdVar2), ua.a(com.google.android.gms.internal.measurement.s9.IAB_TCF_PURPOSE_APPLY_MARKET_RESEARCH_TO_GENERATE_AUDIENCE_INSIGHTS, sdVar2), ua.a(com.google.android.gms.internal.measurement.s9.IAB_TCF_PURPOSE_DEVELOP_AND_IMPROVE_PRODUCTS, sdVar2));
            ke.w wVarT = ke.w.t("CH");
            char[] cArr = new char[5];
            boolean zContains = sharedPreferencesQ.contains("IABTCF_TCString");
            int iB = td.b(sharedPreferencesQ, "IABTCF_CmpSdkID");
            int iB2 = td.b(sharedPreferencesQ, "IABTCF_PolicyVersion");
            int iB3 = td.b(sharedPreferencesQ, "IABTCF_gdprApplies");
            int iB4 = td.b(sharedPreferencesQ, "IABTCF_PurposeOneTreatment");
            int iB5 = td.b(sharedPreferencesQ, "IABTCF_EnableAdvertiserConsentMode");
            String strA = td.a(sharedPreferencesQ, "IABTCF_PublisherCC");
            ke.u.a aVarA = ke.u.a();
            ke.y0 it = uVarN.keySet().iterator();
            while (it.hasNext()) {
                com.google.android.gms.internal.measurement.s9 s9Var3 = (com.google.android.gms.internal.measurement.s9) it.next();
                int iZza = s9Var3.zza();
                StringBuilder sb2 = new StringBuilder(String.valueOf(iZza).length() + 28);
                sb2.append("IABTCF_PublisherRestrictions");
                sb2.append(iZza);
                String strA2 = td.a(sharedPreferencesQ, sb2.toString());
                if (TextUtils.isEmpty(strA2) || strA2.length() < 755) {
                    t9Var = com.google.android.gms.internal.measurement.t9.PURPOSE_RESTRICTION_UNDEFINED;
                } else {
                    int iDigit = Character.digit(strA2.charAt(754), 10);
                    if (iDigit < 0 || iDigit > com.google.android.gms.internal.measurement.t9.values().length || iDigit == 0) {
                        t9Var = com.google.android.gms.internal.measurement.t9.PURPOSE_RESTRICTION_NOT_ALLOWED;
                    } else if (iDigit != i11) {
                        t9Var = iDigit != i10 ? com.google.android.gms.internal.measurement.t9.PURPOSE_RESTRICTION_UNDEFINED : com.google.android.gms.internal.measurement.t9.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST;
                    } else {
                        t9Var = com.google.android.gms.internal.measurement.t9.PURPOSE_RESTRICTION_REQUIRE_CONSENT;
                    }
                }
                aVarA.f(s9Var3, t9Var);
                i10 = 2;
                i11 = 1;
            }
            ke.u uVarC = aVarA.c();
            String strA3 = td.a(sharedPreferencesQ, "IABTCF_PurposeConsents");
            String strA4 = td.a(sharedPreferencesQ, "IABTCF_VendorConsents");
            boolean z10 = !TextUtils.isEmpty(strA4) && strA4.length() >= 755 && strA4.charAt(754) == '1';
            String strA5 = td.a(sharedPreferencesQ, "IABTCF_PurposeLegitimateInterests");
            String strA6 = td.a(sharedPreferencesQ, "IABTCF_VendorLegitimateInterests");
            boolean z11 = !TextUtils.isEmpty(strA6) && strA6.length() >= 755 && strA6.charAt(754) == '1';
            cArr[0] = '2';
            rdVar = new rd(td.d(uVarN, uVarC, wVarT, cArr, iB, iB5, iB3, iB2, iB4, strA, strA3, strA5, z10, z11, zContains));
        } else {
            String strA7 = td.a(sharedPreferencesQ, "IABTCF_VendorConsents");
            if (!BuildConfig.FLAVOR.equals(strA7) && strA7.length() > 754) {
                map.put("GoogleConsent", String.valueOf(strA7.charAt(754)));
            }
            int iB6 = td.b(sharedPreferencesQ, "IABTCF_gdprApplies");
            if (iB6 != -1) {
                map.put("gdprApplies", String.valueOf(iB6));
            }
            int iB7 = td.b(sharedPreferencesQ, "IABTCF_EnableAdvertiserConsentMode");
            if (iB7 != -1) {
                map.put("EnableAdvertiserConsentMode", String.valueOf(iB7));
            }
            int iB8 = td.b(sharedPreferencesQ, "IABTCF_PolicyVersion");
            if (iB8 != -1) {
                map.put("PolicyVersion", String.valueOf(iB8));
            }
            String strA8 = td.a(sharedPreferencesQ, "IABTCF_PurposeConsents");
            if (!BuildConfig.FLAVOR.equals(strA8)) {
                map.put("PurposeConsents", strA8);
            }
            int iB9 = td.b(sharedPreferencesQ, "IABTCF_CmpSdkID");
            if (iB9 != -1) {
                map.put("CmpSdkID", String.valueOf(iB9));
            }
            rdVar = new rd(map);
        }
        l7Var.a().w().b("Tcf preferences read", rdVar);
        if (!l7Var.w().H(null, d5Var)) {
            if (l7Var.x().x(rdVar)) {
                Bundle bundleB = rdVar.b();
                l7Var.a().w().b("Consent generated from Tcf", bundleB);
                if (bundleB != Bundle.EMPTY) {
                    o0(bundleB, -30, l7Var.e().a());
                }
                Bundle bundle = new Bundle();
                bundle.putString("_tcfd", rdVar.e());
                t("auto", "_tcf", bundle);
                return;
            }
            return;
        }
        p6 p6VarX = l7Var.x();
        p6VarX.h();
        String string = p6VarX.p().getString("stored_tcf_param", BuildConfig.FLAVOR);
        HashMap map2 = new HashMap();
        if (TextUtils.isEmpty(string)) {
            rdVar2 = new rd(map2);
        } else {
            for (String str : string.split(";")) {
                String[] strArrSplit = str.split("=");
                if (strArrSplit.length >= 2 && td.f27826a.contains(strArrSplit[0])) {
                    map2.put(strArrSplit[0], strArrSplit[1]);
                }
            }
            rdVar2 = new rd(map2);
        }
        if (l7Var.x().x(rdVar)) {
            Bundle bundleB2 = rdVar.b();
            l7Var.a().w().b("Consent generated from Tcf", bundleB2);
            if (bundleB2 != Bundle.EMPTY) {
                o0(bundleB2, -30, l7Var.e().a());
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("_tcfm", rdVar.d(rdVar2));
            bundle2.putString("_tcfd2", rdVar.c());
            bundle2.putString("_tcfd", rdVar.e());
            t("auto", "_tcf", bundle2);
        }
    }

    public final void r0(Runnable runnable) {
        j();
        l7 l7Var = this.f27641a;
        if (l7Var.b().p()) {
            l7Var.a().o().a("Cannot retrieve and upload batches from analytics worker thread");
            return;
        }
        if (l7Var.b().q()) {
            l7Var.a().o().a("Cannot retrieve and upload batches from analytics network thread");
            return;
        }
        l7Var.c();
        if (f.a()) {
            l7Var.a().o().a("Cannot retrieve and upload batches from main thread");
            return;
        }
        l7Var.a().w().a("[sgtm] Started client-side batch upload work.");
        boolean z10 = false;
        int size = 0;
        int i10 = 0;
        while (!z10) {
            l7Var.a().w().a("[sgtm] Getting upload batches from service (FE)");
            final AtomicReference atomicReference = new AtomicReference();
            l7Var.b().u(atomicReference, 10000L, "[sgtm] Getting upload batches", new Runnable() { // from class: ob.ta
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f27823a.f27641a.J().j0(atomicReference, ce.a(eb.SGTM_CLIENT));
                }
            });
            ee eeVar = (ee) atomicReference.get();
            if (eeVar == null) {
                break;
            }
            List list = eeVar.f27308f;
            if (!list.isEmpty()) {
                l7Var.a().w().b("[sgtm] Retrieved upload batches. count", Integer.valueOf(list.size()));
                size += list.size();
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z10 = false;
                        break;
                    }
                    db dbVarE0 = e0((ae) it.next());
                    if (dbVarE0 == db.SUCCESS) {
                        i10++;
                    } else if (dbVarE0 == db.BACKOFF) {
                        z10 = true;
                        break;
                    }
                }
            } else {
                break;
            }
        }
        l7Var.a().w().c("[sgtm] Completed client-side batch upload work. total, success", Integer.valueOf(size), Integer.valueOf(i10));
        runnable.run();
    }

    public final void s() {
        h();
        l7 l7Var = this.f27641a;
        l7Var.a().v().a("Register tcfPrefChangeListener.");
        if (this.f27892u == null) {
            this.f27893v = new m9(this, this.f27641a);
            this.f27892u = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: ob.pa
                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                public final /* synthetic */ void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                    this.f27712a.T(sharedPreferences, str);
                }
            };
        }
        l7Var.x().q().registerOnSharedPreferenceChangeListener(this.f27892u);
    }

    public final void s0(long j10) {
        h();
        if (this.f27883l == null) {
            this.f27883l = new e9(this, this.f27641a);
        }
        this.f27883l.b(j10);
    }

    public final void t(String str, String str2, Bundle bundle) {
        h();
        u(str, str2, this.f27641a.e().a(), bundle);
    }

    public final void t0() {
        h();
        z zVar = this.f27883l;
        if (zVar != null) {
            zVar.d();
        }
    }

    public final void u(String str, String str2, long j10, Bundle bundle) {
        h();
        boolean z10 = true;
        if (this.f27875d != null && !ff.N(str2)) {
            z10 = false;
        }
        v(str, str2, j10, bundle, true, z10, true, null);
    }

    public final void u0() {
        zf.a();
        l7 l7Var = this.f27641a;
        if (l7Var.w().H(null, e5.R0)) {
            if (l7Var.b().p()) {
                l7Var.a().o().a("Cannot get trigger URIs from analytics worker thread");
                return;
            }
            l7Var.c();
            if (f.a()) {
                l7Var.a().o().a("Cannot get trigger URIs from main thread");
                return;
            }
            j();
            l7Var.a().w().a("Getting trigger URIs (FE)");
            final AtomicReference atomicReference = new AtomicReference();
            l7Var.b().u(atomicReference, 10000L, "get trigger URIs", new Runnable() { // from class: ob.la
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    va vaVar = this.f27563a;
                    vaVar.f27641a.J().i0(atomicReference, vaVar.f27641a.x().f27695o.a());
                }
            });
            final List list = (List) atomicReference.get();
            if (list == null) {
                l7Var.a().q().a("Timed out waiting for get trigger URIs");
            } else {
                l7Var.b().t(new Runnable() { // from class: ob.ma
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        va vaVar = this.f27586a;
                        vaVar.h();
                        if (Build.VERSION.SDK_INT < 30) {
                            return;
                        }
                        List<vd> list2 = list;
                        SparseArray sparseArrayR = vaVar.f27641a.x().r();
                        for (vd vdVar : list2) {
                            int i10 = vdVar.f27902h;
                            if (!sparseArrayR.contains(i10) || ((Long) sparseArrayR.get(i10)).longValue() < vdVar.f27901g) {
                                vaVar.w0().add(vdVar);
                            }
                        }
                        vaVar.x0();
                    }
                });
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void v(String str, String str2, long j10, Bundle bundle, boolean z10, boolean z11, boolean z12, String str3) {
        boolean z13;
        int i10;
        l7 l7Var;
        long j11;
        long j12;
        String str4;
        long j13;
        Bundle[] bundleArr;
        String str5 = str;
        o9.s.f(str5);
        o9.s.l(bundle);
        h();
        j();
        l7 l7Var2 = this.f27641a;
        if (!l7Var2.g()) {
            this.f27641a.a().v().a("Event not sent since app measurement is disabled");
            return;
        }
        List listW = this.f27641a.L().w();
        if (listW != null && !listW.contains(str2)) {
            this.f27641a.a().v().c("Dropping non-safelisted event. event name, origin", str2, str5);
            return;
        }
        if (!this.f27877f) {
            this.f27877f = true;
            try {
                try {
                    (!l7Var2.G() ? Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, this.f27641a.d().getClassLoader()) : Class.forName("com.google.android.gms.tagmanager.TagManagerService")).getDeclaredMethod("initialize", Context.class).invoke(null, this.f27641a.d());
                } catch (Exception e10) {
                    this.f27641a.a().r().b("Failed to invoke Tag Manager's initialize() method", e10);
                }
            } catch (ClassNotFoundException unused) {
                this.f27641a.a().u().a("Tag Manager is not found and thus will not be used");
            }
        }
        l7 l7Var3 = this.f27641a;
        if (!l7Var3.w().H(null, e5.f27243g1) && "_cmp".equals(str2) && bundle.containsKey("gclid")) {
            l7Var3.c();
            B("auto", "_lgclid", bundle.getString("gclid"), l7Var3.e().a());
        }
        va vaVar = this;
        l7Var3.c();
        if (z10 && ff.U(str2)) {
            l7Var3.C().w(bundle, l7Var3.x().f27706z.a());
        }
        if (!z12) {
            l7Var3.c();
            if (!"_iap".equals(str2)) {
                l7 l7Var4 = vaVar.f27641a;
                ff ffVarC = l7Var4.C();
                int i11 = 2;
                if (ffVarC.t0("event", str2)) {
                    if (ffVarC.v0("event", w8.f27949a, w8.b, str2)) {
                        ffVarC.f27641a.w();
                        if (ffVarC.w0("event", 40, str2)) {
                            i11 = 0;
                        }
                    } else {
                        i11 = 13;
                    }
                }
                if (i11 != 0) {
                    l7Var3.a().q().b("Invalid public event name. Event will not be logged (FE)", l7Var3.D().a(str2));
                    ff ffVarC2 = l7Var4.C();
                    l7Var4.w();
                    l7Var4.C().B(vaVar.f27894w, null, i11, "_ev", ffVarC2.q(str2, 40, true), str2 != null ? str2.length() : 0);
                    return;
                }
            }
        }
        l7Var3.c();
        l7 l7Var5 = vaVar.f27641a;
        gb gbVarQ = l7Var5.I().q(false);
        if (gbVarQ != null && !bundle.containsKey("_sc")) {
            gbVarQ.f27356d = true;
        }
        ff.k0(gbVarQ, bundle, z10 && !z12);
        boolean zEquals = "am".equals(str5);
        boolean zN = ff.N(str2);
        if (!z10 || vaVar.f27875d == null || zN) {
            z13 = zEquals;
        } else {
            if (!zEquals) {
                l7Var3.a().v().c("Passing event to registered event handler (FE)", l7Var3.D().a(str2), l7Var3.D().e(bundle));
                o9.s.l(vaVar.f27875d);
                vaVar.f27875d.a(str5, str2, bundle, j10);
                return;
            }
            z13 = true;
        }
        l7 l7Var6 = vaVar.f27641a;
        if (l7Var6.m()) {
            int iX0 = l7Var3.C().x0(str2);
            if (iX0 != 0) {
                l7Var3.a().q().b("Invalid event name. Event will not be logged (FE)", l7Var3.D().a(str2));
                ff ffVarC3 = l7Var3.C();
                l7Var3.w();
                l7Var6.C().B(vaVar.f27894w, str3, iX0, "_ev", ffVarC3.q(str2, 40, true), str2 != null ? str2.length() : 0);
                return;
            }
            Bundle bundleT = l7Var3.C().t(str3, str2, bundle, v9.f.b("_o", "_sn", "_sc", "_si"), z12);
            o9.s.l(bundleT);
            l7Var3.c();
            if (l7Var5.I().q(false) == null || !"_ae".equals(str2)) {
                i10 = 0;
                l7Var = l7Var5;
                j11 = 0;
            } else {
                od odVar = l7Var5.z().f27747f;
                j11 = 0;
                long jB = odVar.f27660d.f27641a.e().b();
                i10 = 0;
                l7Var = l7Var5;
                long j14 = jB - odVar.b;
                odVar.b = jB;
                if (j14 > 0) {
                    l7Var3.C().Z(bundleT, j14);
                }
            }
            if (!"auto".equals(str5) && "_ssr".equals(str2)) {
                ff ffVarC4 = l7Var3.C();
                String string = bundleT.getString("_ffr");
                if (v9.o.a(string)) {
                    string = null;
                } else if (string != null) {
                    string = string.trim();
                }
                l7 l7Var7 = ffVarC4.f27641a;
                if (Objects.equals(string, l7Var7.x().f27703w.a())) {
                    l7Var7.a().v().a("Not logging duplicate session_start_with_rollout event");
                    return;
                }
                l7Var7.x().f27703w.b(string);
            } else if ("_ae".equals(str2)) {
                String strA = l7Var3.C().f27641a.x().f27703w.a();
                if (!TextUtils.isEmpty(strA)) {
                    bundleT.putString("_ffr", strA);
                }
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(bundleT);
            boolean zP = l7Var3.w().H(null, e5.V0) ? l7Var.z().p() : l7Var3.x().f27700t.a();
            if (l7Var3.x().f27697q.a() > j11 && l7Var3.x().A(j10) && zP) {
                l7Var3.a().w().a("Current session is expired, remove the session number, ID, and engagement time");
                str4 = "_ae";
                j12 = j11;
                B("auto", "_sid", null, l7Var3.e().a());
                B("auto", "_sno", null, l7Var3.e().a());
                B("auto", "_se", null, l7Var3.e().a());
                vaVar = this;
                l7Var3.x().f27698r.b(j12);
            } else {
                j12 = j11;
                str4 = "_ae";
            }
            if (bundleT.getLong("extend_session", j12) == 1) {
                l7Var3.a().w().a("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                j13 = j10;
                l7Var6.z().f27746e.b(j13, true);
            } else {
                j13 = j10;
            }
            ArrayList arrayList2 = new ArrayList(bundleT.keySet());
            Collections.sort(arrayList2);
            int size = arrayList2.size();
            for (int i12 = i10; i12 < size; i12++) {
                String str6 = (String) arrayList2.get(i12);
                if (str6 != null) {
                    l7Var3.C();
                    Object obj = bundleT.get(str6);
                    if (obj instanceof Bundle) {
                        bundleArr = new Bundle[1];
                        bundleArr[i10] = (Bundle) obj;
                    } else if (obj instanceof Parcelable[]) {
                        Parcelable[] parcelableArr = (Parcelable[]) obj;
                        bundleArr = (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList3 = (ArrayList) obj;
                        bundleArr = (Bundle[]) arrayList3.toArray(new Bundle[arrayList3.size()]);
                    } else {
                        bundleArr = null;
                    }
                    if (bundleArr != null) {
                        bundleT.putParcelableArray(str6, bundleArr);
                    }
                }
            }
            int i13 = i10;
            while (i13 < arrayList.size()) {
                Bundle bundleQ = (Bundle) arrayList.get(i13);
                String str7 = i13 != 0 ? "_ep" : str2;
                bundleQ.putString("_o", str5);
                if (z11) {
                    bundleQ = l7Var3.C().Q(bundleQ, null);
                }
                Bundle bundle2 = bundleQ;
                l7Var.J().c0(new i0(str7, new g0(bundle2), str5, j13), str3);
                if (!z13) {
                    Iterator it = vaVar.f27876e.iterator();
                    while (it.hasNext()) {
                        ((a9) it.next()).a(str, str2, new Bundle(bundle2), j10);
                    }
                }
                i13++;
                str5 = str;
                j13 = j10;
            }
            l7Var3.c();
            if (l7Var.I().q(i10) == null || !str4.equals(str2)) {
                return;
            }
            l7Var.z().f27747f.d(true, true, l7Var3.e().b());
        }
    }

    public final boolean v0() {
        return this.f27885n;
    }

    public final void w(String str, String str2, Bundle bundle, String str3) {
        l7.q();
        x("auto", str2, this.f27641a.e().a(), bundle, false, true, true, str3);
    }

    @TargetApi(BacktraceMetrics.defaultTimeIntervalInMin)
    public final PriorityQueue w0() {
        if (this.f27884m == null) {
            this.f27884m = new PriorityQueue(Comparator.comparing(new Function() { // from class: ob.na
                @Override // java.util.function.Function
                public final /* synthetic */ Object apply(Object obj) {
                    return Long.valueOf(((vd) obj).f27901g);
                }
            }, new Comparator() { // from class: ob.oa
                @Override // java.util.Comparator
                public final /* synthetic */ int compare(Object obj, Object obj2) {
                    return Long.compare(((Long) obj).longValue(), ((Long) obj2).longValue());
                }
            }));
        }
        return this.f27884m;
    }

    public final void x(String str, String str2, long j10, Bundle bundle, boolean z10, boolean z11, boolean z12, String str3) {
        String[] strArr = ff.f27333i;
        Bundle bundle2 = new Bundle(bundle);
        for (String str4 : bundle2.keySet()) {
            Object obj = bundle2.get(str4);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str4, new Bundle((Bundle) obj));
            } else {
                int i10 = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i10 < parcelableArr.length) {
                        Parcelable parcelable = parcelableArr[i10];
                        if (parcelable instanceof Bundle) {
                            parcelableArr[i10] = new Bundle((Bundle) parcelable);
                        }
                        i10++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i10 < list.size()) {
                        Object obj2 = list.get(i10);
                        if (obj2 instanceof Bundle) {
                            list.set(i10, new Bundle((Bundle) obj2));
                        }
                        i10++;
                    }
                }
            }
        }
        this.f27641a.b().t(new n9(this, str, str2, j10, bundle2, z10, z11, z12, str3));
    }

    @TargetApi(BacktraceMetrics.defaultTimeIntervalInMin)
    public final void x0() {
        vd vdVar;
        h();
        this.f27885n = false;
        if (w0().isEmpty() || this.f27880i || (vdVar = (vd) w0().poll()) == null) {
            return;
        }
        l7 l7Var = this.f27641a;
        s4.a aVarH = l7Var.C().H();
        if (aVarH != null) {
            this.f27880i = true;
            z5 z5VarW = l7Var.a().w();
            String str = vdVar.f27900f;
            z5VarW.b("Registering trigger URI", str);
            pe.x<Unit> xVarC = aVarH.c(Uri.parse(str));
            if (xVarC != null) {
                pe.s.a(xVarC, new g9(this, vdVar), new f9(this));
            } else {
                this.f27880i = false;
                w0().add(vdVar);
            }
        }
    }

    public final void y(String str, String str2, Object obj, boolean z10) {
        z("auto", "_ldl", obj, true, this.f27641a.e().a());
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0044  */
    /* JADX WARN: Code duplicated, block: B:20:0x0053  */
    /* JADX WARN: Code duplicated, block: B:23:0x0067 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x0069  */
    /* JADX WARN: Code duplicated, block: B:25:0x006c  */
    /* JADX WARN: Code duplicated, block: B:27:0x0070  */
    /* JADX WARN: Code duplicated, block: B:29:0x007c  */
    /* JADX WARN: Code duplicated, block: B:35:0x0092  */
    /* JADX WARN: Code duplicated, block: B:38:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:42:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0026  */
    public final void z(String str, String str2, Object obj, boolean z10, long j10) {
        int i10;
        int iY0;
        String str3;
        l7 l7Var;
        int iY;
        Object objZ;
        if (!z10) {
            ff ffVarC = this.f27641a.C();
            if (!ffVarC.t0("user property", str2)) {
                i10 = 6;
            } else if (ffVarC.v0("user property", y8.f27995a, null, str2)) {
                ffVarC.f27641a.w();
                if (ffVarC.w0("user property", 24, str2)) {
                    i10 = 0;
                } else {
                    i10 = 6;
                }
            } else {
                iY0 = 15;
            }
            if (i10 != 0) {
                l7 l7Var2 = this.f27641a;
                ff ffVarC2 = l7Var2.C();
                l7Var2.w();
                this.f27641a.C().B(this.f27894w, null, i10, "_ev", ffVarC2.q(str2, 24, true), str2 != null ? str2.length() : 0);
                return;
            }
            if (str == null) {
                str3 = Payload.TYPE_APP;
            } else {
                str3 = str;
            }
            if (obj != null) {
                A(str3, str2, j10, null);
                return;
            }
            l7Var = this.f27641a;
            iY = l7Var.C().y(str2, obj);
            if (iY != 0) {
                objZ = l7Var.C().z(str2, obj);
                if (objZ != null) {
                    A(str3, str2, j10, objZ);
                    return;
                }
                return;
            }
            ff ffVarC3 = l7Var.C();
            l7Var.w();
            this.f27641a.C().B(this.f27894w, null, iY, "_ev", ffVarC3.q(str2, 24, true), (!(obj instanceof String) || (obj instanceof CharSequence)) ? obj.toString().length() : 0);
        }
        iY0 = this.f27641a.C().y0(str2);
        i10 = iY0;
        if (i10 != 0) {
            l7 l7Var3 = this.f27641a;
            ff ffVarC4 = l7Var3.C();
            l7Var3.w();
            if (str2 != null) {
            }
            this.f27641a.C().B(this.f27894w, null, i10, "_ev", ffVarC4.q(str2, 24, true), str2 != null ? str2.length() : 0);
            return;
        }
        if (str == null) {
            str3 = Payload.TYPE_APP;
        } else {
            str3 = str;
        }
        if (obj != null) {
            A(str3, str2, j10, null);
            return;
        }
        l7Var = this.f27641a;
        iY = l7Var.C().y(str2, obj);
        if (iY != 0) {
            objZ = l7Var.C().z(str2, obj);
            if (objZ != null) {
                A(str3, str2, j10, objZ);
                return;
            }
            return;
        }
        ff ffVarC5 = l7Var.C();
        l7Var.w();
        this.f27641a.C().B(this.f27894w, null, iY, "_ev", ffVarC5.q(str2, 24, true), (!(obj instanceof String) || (obj instanceof CharSequence)) ? obj.toString().length() : 0);
    }
}
