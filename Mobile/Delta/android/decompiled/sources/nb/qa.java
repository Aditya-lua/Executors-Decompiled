package nb;

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
import com.appsflyer.sdk_base.referrer.Payload;
import com.google.android.gms.internal.measurement.vf;
import com.google.android.gms.measurement.internal.zzaf;
import com.google.android.gms.measurement.internal.zzbe;
import com.google.android.gms.measurement.internal.zzbg;
import com.google.android.gms.measurement.internal.zzoh;
import com.google.android.gms.measurement.internal.zzom;
import com.google.android.gms.measurement.internal.zzoo;
import com.google.android.gms.measurement.internal.zzoq;
import com.google.android.gms.measurement.internal.zzpl;
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
import kotlin.Unit;
import okhttp3.internal.ws.RealWebSocket;

/* JADX INFO: loaded from: classes.dex */
public final class qa extends b5 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public da f25891c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public u8 f25892d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Set f25893e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f25894f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicReference f25895g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f25896h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f25897i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f25898j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public w f25899k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public w f25900l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public PriorityQueue f25901m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f25902n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public q8 f25903o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final AtomicLong f25904p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f25905q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final cf f25906r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f25907s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public w f25908t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public SharedPreferences.OnSharedPreferenceChangeListener f25909u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public w f25910v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ue f25911w;

    public qa(g7 g7Var) {
        super(g7Var);
        this.f25893e = new CopyOnWriteArraySet();
        this.f25896h = new Object();
        this.f25897i = false;
        this.f25898j = 1;
        this.f25907s = true;
        this.f25911w = new s9(this);
        this.f25895g = new AtomicReference();
        this.f25903o = q8.f25885c;
        this.f25905q = -1L;
        this.f25904p = new AtomicLong(0L);
        this.f25906r = new cf(g7Var);
    }

    public final void A(String str, String str2, long j10, Object obj) {
        this.f25625a.b().t(new j9(this, str, str2, obj, j10));
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0053 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0055  */
    public final void B(String str, String str2, Object obj, long j10) {
        n9.m.f(str);
        n9.m.f(str2);
        h();
        j();
        Object obj2 = obj;
        if ("allow_personalized_ads".equals(str2)) {
            if (obj instanceof String) {
                String str3 = (String) obj;
                if (!TextUtils.isEmpty(str3)) {
                    long j11 = true != "false".equals(str3.toLowerCase(Locale.ENGLISH)) ? 0L : 1L;
                    g7 g7Var = this.f25625a;
                    Long lValueOf = Long.valueOf(j11);
                    g7Var.x().f25679n.b(lValueOf.longValue() == 1 ? "true" : "false");
                    obj = lValueOf;
                } else if (obj == null) {
                    this.f25625a.x().f25679n.b("unset");
                    obj = obj;
                }
                str2 = "_npa";
            } else if (obj == null) {
                this.f25625a.x().f25679n.b("unset");
                obj = obj;
                str2 = "_npa";
            }
            this.f25625a.a().w().c("Setting user property(FE)", "non_personalized_ads(_npa)", obj);
            obj2 = obj;
        }
        String str4 = str2;
        Object obj3 = obj2;
        g7 g7Var2 = this.f25625a;
        if (!g7Var2.g()) {
            this.f25625a.a().w().a("User property not set since app measurement is disabled");
        } else if (g7Var2.m()) {
            this.f25625a.J().o(new zzpl(str4, j10, obj3, str));
        }
    }

    public final Map C(String str, String str2, boolean z10) {
        g7 g7Var = this.f25625a;
        if (g7Var.b().p()) {
            g7Var.a().o().a("Cannot get user properties from analytics worker thread");
            return Collections.EMPTY_MAP;
        }
        g7Var.c();
        if (f.a()) {
            g7Var.a().o().a("Cannot get user properties from main thread");
            return Collections.EMPTY_MAP;
        }
        AtomicReference atomicReference = new AtomicReference();
        this.f25625a.b().u(atomicReference, 5000L, "get user properties", new q9(this, atomicReference, null, str, str2, z10));
        List<zzpl> list = (List) atomicReference.get();
        if (list == null) {
            g7Var.a().o().b("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z10));
            return Collections.EMPTY_MAP;
        }
        w1.a aVar = new w1.a(list.size());
        for (zzpl zzplVar : list) {
            Object objZza = zzplVar.zza();
            if (objZza != null) {
                aVar.put(zzplVar.f7439g, objZza);
            }
        }
        return aVar;
    }

    public final String D() {
        return (String) this.f25895g.get();
    }

    public final void E(String str) {
        this.f25895g.set(str);
    }

    public final void F() {
        h();
        g7 g7Var = this.f25625a;
        if (g7Var.x().f25686u.a()) {
            g7Var.a().v().a("Deferred Deep Link already retrieved. Not fetching again.");
            return;
        }
        long jA = g7Var.x().f25687v.a();
        g7Var.x().f25687v.b(1 + jA);
        g7Var.w();
        if (jA >= 5) {
            g7Var.a().r().a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
            g7Var.x().f25686u.b(true);
        } else {
            if (this.f25908t == null) {
                this.f25908t = new l9(this, this.f25625a);
            }
            this.f25908t.b(0L);
        }
    }

    public final void G(long j10) {
        this.f25895g.set(null);
        this.f25625a.b().t(new m9(this, j10));
    }

    public final void H() {
        h();
        j();
        if (this.f25625a.m()) {
            g7 g7Var = this.f25625a;
            k kVarW = g7Var.w();
            kVarW.f25625a.c();
            Boolean boolJ = kVarW.J("google_analytics_deferred_deep_link_enabled");
            if (boolJ != null && boolJ.booleanValue()) {
                g7Var.a().v().a("Deferred Deep Link feature enabled.");
                g7Var.b().t(new Runnable() { // from class: nb.na
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.f25796a.F();
                    }
                });
            }
            this.f25625a.J().s();
            this.f25907s = false;
            k6 k6VarX = g7Var.x();
            k6VarX.h();
            String string = k6VarX.p().getString("previous_os_version", null);
            k6VarX.f25625a.K().l();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor editorEdit = k6VarX.p().edit();
                editorEdit.putString("previous_os_version", str);
                editorEdit.apply();
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            g7Var.K().l();
            if (string.equals(str)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", string);
            t("auto", "_ou", bundle);
        }
    }

    public final void I(u8 u8Var) {
        u8 u8Var2;
        h();
        j();
        if (u8Var != null && u8Var != (u8Var2 = this.f25892d)) {
            n9.m.q(u8Var2 == null, "EventInterceptor already set.");
        }
        this.f25892d = u8Var;
    }

    public final void J(v8 v8Var) {
        j();
        n9.m.l(v8Var);
        if (this.f25893e.add(v8Var)) {
            return;
        }
        this.f25625a.a().r().a("OnEventListener already registered");
    }

    public final void K(v8 v8Var) {
        j();
        n9.m.l(v8Var);
        if (this.f25893e.remove(v8Var)) {
            return;
        }
        this.f25625a.a().r().a("OnEventListener had not been registered");
    }

    public final int L(String str) {
        n9.m.f(str);
        this.f25625a.w();
        return 25;
    }

    public final void M(Bundle bundle) {
        N(bundle, this.f25625a.e().a());
    }

    public final void N(Bundle bundle, long j10) {
        n9.m.l(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            this.f25625a.a().r().a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        n9.m.l(bundle2);
        m8.b(bundle2, "app_id", String.class, null);
        m8.b(bundle2, "origin", String.class, null);
        m8.b(bundle2, "name", String.class, null);
        m8.b(bundle2, "value", Object.class, null);
        m8.b(bundle2, "trigger_event_name", String.class, null);
        m8.b(bundle2, "trigger_timeout", Long.class, 0L);
        m8.b(bundle2, "timed_out_event_name", String.class, null);
        m8.b(bundle2, "timed_out_event_params", Bundle.class, null);
        m8.b(bundle2, "triggered_event_name", String.class, null);
        m8.b(bundle2, "triggered_event_params", Bundle.class, null);
        m8.b(bundle2, "time_to_live", Long.class, 0L);
        m8.b(bundle2, "expired_event_name", String.class, null);
        m8.b(bundle2, "expired_event_params", Bundle.class, null);
        n9.m.f(bundle2.getString("name"));
        n9.m.f(bundle2.getString("origin"));
        n9.m.l(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j10);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        g7 g7Var = this.f25625a;
        if (g7Var.C().y0(string) != 0) {
            g7Var.a().o().b("Invalid conditional user property name", g7Var.D().c(string));
            return;
        }
        if (g7Var.C().y(string, obj) != 0) {
            g7Var.a().o().c("Invalid conditional user property value", g7Var.D().c(string), obj);
            return;
        }
        Object objZ = g7Var.C().z(string, obj);
        if (objZ == null) {
            g7Var.a().o().c("Unable to normalize conditional user property value", g7Var.D().c(string), obj);
            return;
        }
        m8.a(bundle2, objZ);
        long j11 = bundle2.getLong("trigger_timeout");
        if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name"))) {
            g7Var.w();
            if (j11 > 15552000000L || j11 < 1) {
                g7Var.a().o().c("Invalid conditional user property timeout", g7Var.D().c(string), Long.valueOf(j11));
                return;
            }
        }
        long j12 = bundle2.getLong("time_to_live");
        g7Var.w();
        if (j12 > 15552000000L || j12 < 1) {
            g7Var.a().o().c("Invalid conditional user property time to live", g7Var.D().c(string), Long.valueOf(j12));
        } else {
            g7Var.b().t(new n9(this, bundle2));
        }
    }

    public final void O(String str, String str2, Bundle bundle) {
        g7 g7Var = this.f25625a;
        long jA = g7Var.e().a();
        n9.m.f(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", jA);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        g7Var.b().t(new o9(this, bundle2));
    }

    public final ArrayList P(String str, String str2) {
        g7 g7Var = this.f25625a;
        if (g7Var.b().p()) {
            g7Var.a().o().a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        g7Var.c();
        if (f.a()) {
            g7Var.a().o().a("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        this.f25625a.b().u(atomicReference, 5000L, "get conditional user properties", new p9(this, atomicReference, null, str, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return ve.h0(list);
        }
        g7Var.a().o().b("Timed out waiting for get conditional user properties", null);
        return new ArrayList();
    }

    public final String Q() {
        bb bbVarU = this.f25625a.I().u();
        if (bbVarU != null) {
            return bbVarU.f25365a;
        }
        return null;
    }

    public final String R() {
        bb bbVarU = this.f25625a.I().u();
        if (bbVarU != null) {
            return bbVarU.b;
        }
        return null;
    }

    public final String S() {
        try {
            return ab.a(this.f25625a.d(), "google_app_id", this.f25625a.H());
        } catch (IllegalStateException e10) {
            this.f25625a.a().o().b("getGoogleAppId failed with exception", e10);
            return null;
        }
    }

    public final /* synthetic */ void T(SharedPreferences sharedPreferences, String str) {
        g7 g7Var = this.f25625a;
        if (!g7Var.w().H(null, z4.f26151a1)) {
            if (Objects.equals(str, "IABTCF_TCString")) {
                g7Var.a().w().a("IABTCF_TCString change picked up in listener.");
                ((w) n9.m.l(this.f25910v)).b(500L);
                return;
            }
            return;
        }
        if (Objects.equals(str, "IABTCF_TCString") || Objects.equals(str, "IABTCF_gdprApplies") || Objects.equals(str, "IABTCF_EnableAdvertiserConsentMode")) {
            g7Var.a().w().a("IABTCF_TCString change picked up in listener.");
            ((w) n9.m.l(this.f25910v)).b(500L);
        }
    }

    public final /* synthetic */ void U(Bundle bundle) {
        Bundle bundle2;
        int i10;
        if (bundle.isEmpty()) {
            bundle2 = bundle;
        } else {
            g7 g7Var = this.f25625a;
            bundle2 = new Bundle(g7Var.x().f25691z.a());
            Iterator<String> it = bundle.keySet().iterator();
            while (true) {
                i10 = 0;
                if (!it.hasNext()) {
                    break;
                }
                String next = it.next();
                Object obj = bundle.get(next);
                if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                    if (g7Var.C().B0(obj)) {
                        g7Var.C().B(this.f25911w, null, 27, null, null, 0);
                    }
                    g7Var.a().t().c("Invalid default event parameter type. Name, value", next, obj);
                } else if (ve.N(next)) {
                    g7Var.a().t().b("Invalid default event parameter name. Name", next);
                } else if (obj == null) {
                    bundle2.remove(next);
                } else if (g7Var.C().C0("param", next, g7Var.w().x(null, false), obj)) {
                    g7Var.C().A(bundle2, next, obj);
                }
            }
            g7Var.C();
            int iV = g7Var.w().v();
            if (bundle2.size() > iV) {
                for (String str : new TreeSet(bundle2.keySet())) {
                    i10++;
                    if (i10 > iV) {
                        bundle2.remove(str);
                    }
                }
                g7Var.C().B(this.f25911w, null, 26, null, null, 0);
                g7Var.a().t().a("Too many default event parameters set. Discarding beyond event parameter limit");
            }
        }
        g7 g7Var2 = this.f25625a;
        g7Var2.x().f25691z.b(bundle2);
        if (!bundle.isEmpty() || g7Var2.w().H(null, z4.X0)) {
            this.f25625a.J().v(bundle2);
        }
    }

    public final /* synthetic */ void V(int i10) {
        if (this.f25899k == null) {
            this.f25899k = new c9(this, this.f25625a);
        }
        this.f25899k.b(((long) i10) * 1000);
    }

    public final /* synthetic */ void W(Boolean bool, boolean z10) {
        f0(bool, true);
    }

    public final /* synthetic */ void X(q8 q8Var, long j10, boolean z10, boolean z11) {
        h();
        j();
        g7 g7Var = this.f25625a;
        q8 q8VarW = g7Var.x().w();
        if (j10 <= this.f25905q && q8.u(q8VarW.b(), q8Var.b())) {
            g7Var.a().u().b("Dropped out-of-date consent setting, proposed settings", q8Var);
            return;
        }
        k6 k6VarX = g7Var.x();
        g7 g7Var2 = k6VarX.f25625a;
        k6VarX.h();
        int iB = q8Var.b();
        if (!k6VarX.v(iB)) {
            g7Var.a().u().b("Lower precedence consent source ignored, proposed source", Integer.valueOf(q8Var.b()));
            return;
        }
        g7 g7Var3 = this.f25625a;
        SharedPreferences.Editor editorEdit = k6VarX.p().edit();
        editorEdit.putString("consent_settings", q8Var.l());
        editorEdit.putInt("consent_source", iB);
        editorEdit.apply();
        g7Var.a().w().b("Setting storage consent(FE)", q8Var);
        this.f25905q = j10;
        if (g7Var3.J().D()) {
            g7Var3.J().Z(z10);
        } else {
            g7Var3.J().Y(z10);
        }
        if (z11) {
            g7Var3.J().q(new AtomicReference());
        }
    }

    public final /* synthetic */ void Z(boolean z10) {
        this.f25897i = false;
    }

    public final /* synthetic */ int a0() {
        return this.f25898j;
    }

    public final /* synthetic */ void b0(int i10) {
        this.f25898j = i10;
    }

    public final /* synthetic */ w c0() {
        return this.f25908t;
    }

    public final /* synthetic */ int d0(Throwable th2) {
        String message = th2.getMessage();
        this.f25902n = false;
        if (message == null) {
            return 2;
        }
        if (!(th2 instanceof IllegalStateException) && !message.contains("garbage collected") && !th2.getClass().getSimpleName().equals("ServiceUnavailableException")) {
            return (!(th2 instanceof SecurityException) || message.endsWith("READ_DEVICE_CONFIG")) ? 2 : 3;
        }
        if (!message.contains("Background")) {
            return 1;
        }
        this.f25902n = true;
        return 1;
    }

    public final ya e0(final zzom zzomVar) {
        try {
            URL url = new URI(zzomVar.f7431h).toURL();
            final AtomicReference atomicReference = new AtomicReference();
            String strS = this.f25625a.L().s();
            g7 g7Var = this.f25625a;
            u5 u5VarW = g7Var.a().w();
            Long lValueOf = Long.valueOf(zzomVar.f7429f);
            u5VarW.d("[sgtm] Uploading data from app. row_id, url, uncompressed size", lValueOf, zzomVar.f7431h, Integer.valueOf(zzomVar.f7430g.length));
            if (!TextUtils.isEmpty(zzomVar.f7435l)) {
                g7Var.a().w().c("[sgtm] Uploading data from app. row_id", lValueOf, zzomVar.f7435l);
            }
            HashMap map = new HashMap();
            Bundle bundle = zzomVar.f7432i;
            for (String str : bundle.keySet()) {
                String string = bundle.getString(str);
                if (!TextUtils.isEmpty(string)) {
                    map.put(str, string);
                }
            }
            va vaVarF = g7Var.F();
            byte[] bArr = zzomVar.f7430g;
            sa saVar = new sa() { // from class: nb.ea
                /* JADX WARN: Code duplicated, block: B:10:0x0016  */
                /* JADX WARN: Code duplicated, block: B:11:0x002e A[PHI: r8
                  0x002e: PHI (r8v7 int) = (r8v1 int), (r8v0 int) binds: [B:9:0x0014, B:7:0x0011] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Code duplicated, block: B:13:0x0064  */
                /* JADX WARN: Code duplicated, block: B:14:0x0067  */
                @Override // nb.sa
                public final /* synthetic */ void a(String str2, int i10, Throwable th2, byte[] bArr2, Map map2) {
                    ya yaVar;
                    qa qaVar = this.f25488a;
                    qaVar.h();
                    zzom zzomVar2 = zzomVar;
                    if (i10 == 200 || i10 == 204) {
                        if (th2 == null) {
                            qaVar.f25625a.a().w().b("[sgtm] Upload succeeded for row_id", Long.valueOf(zzomVar2.f7429f));
                            yaVar = ya.SUCCESS;
                        } else {
                            qaVar.f25625a.a().r().d("[sgtm] Upload failed for row_id. response, exception", Long.valueOf(zzomVar2.f7429f), Integer.valueOf(i10), th2);
                            if (Arrays.asList(((String) z4.f26200u.b(null)).split(",")).contains(String.valueOf(i10))) {
                                yaVar = ya.BACKOFF;
                            } else {
                                yaVar = ya.FAILURE;
                            }
                        }
                    } else if (i10 == 304) {
                        i10 = 304;
                        if (th2 == null) {
                            qaVar.f25625a.a().w().b("[sgtm] Upload succeeded for row_id", Long.valueOf(zzomVar2.f7429f));
                            yaVar = ya.SUCCESS;
                        } else {
                            qaVar.f25625a.a().r().d("[sgtm] Upload failed for row_id. response, exception", Long.valueOf(zzomVar2.f7429f), Integer.valueOf(i10), th2);
                            if (Arrays.asList(((String) z4.f26200u.b(null)).split(",")).contains(String.valueOf(i10))) {
                                yaVar = ya.BACKOFF;
                            } else {
                                yaVar = ya.FAILURE;
                            }
                        }
                    } else {
                        qaVar.f25625a.a().r().d("[sgtm] Upload failed for row_id. response, exception", Long.valueOf(zzomVar2.f7429f), Integer.valueOf(i10), th2);
                        if (Arrays.asList(((String) z4.f26200u.b(null)).split(",")).contains(String.valueOf(i10))) {
                            yaVar = ya.BACKOFF;
                        } else {
                            yaVar = ya.FAILURE;
                        }
                    }
                    AtomicReference atomicReference2 = atomicReference;
                    tc tcVarJ = qaVar.f25625a.J();
                    long j10 = zzomVar2.f7429f;
                    tcVarJ.k0(new zzaf(j10, yaVar.zza(), zzomVar2.f7434k));
                    qaVar.f25625a.a().w().c("[sgtm] Updated status for row_id", Long.valueOf(j10), yaVar);
                    synchronized (atomicReference2) {
                        atomicReference2.set(yaVar);
                        atomicReference2.notifyAll();
                    }
                }
            };
            vaVarF.l();
            n9.m.l(url);
            n9.m.l(bArr);
            n9.m.l(saVar);
            vaVarF.f25625a.b().w(new ua(vaVarF, strS, url, bArr, map, saVar));
            try {
                g7 g7Var2 = g7Var.C().f25625a;
                long jA = g7Var2.e().a();
                long j10 = jA + RealWebSocket.CANCEL_AFTER_CLOSE_MILLIS;
                synchronized (atomicReference) {
                    for (long jA2 = RealWebSocket.CANCEL_AFTER_CLOSE_MILLIS; atomicReference.get() == null && jA2 > 0; jA2 = j10 - g7Var2.e().a()) {
                        try {
                            atomicReference.wait(jA2);
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            } catch (InterruptedException unused) {
                this.f25625a.a().r().a("[sgtm] Interrupted waiting for uploading batch");
            }
            return atomicReference.get() == null ? ya.UNKNOWN : (ya) atomicReference.get();
        } catch (MalformedURLException | URISyntaxException e10) {
            this.f25625a.a().o().d("[sgtm] Bad upload url for row_id", zzomVar.f7431h, Long.valueOf(zzomVar.f7429f), e10);
            return ya.FAILURE;
        }
    }

    public final void f0(Boolean bool, boolean z10) {
        h();
        j();
        g7 g7Var = this.f25625a;
        g7Var.a().v().b("Setting app measurement enabled (FE)", bool);
        g7Var.x().s(bool);
        if (z10) {
            k6 k6VarX = g7Var.x();
            g7 g7Var2 = k6VarX.f25625a;
            k6VarX.h();
            SharedPreferences.Editor editorEdit = k6VarX.p().edit();
            if (bool != null) {
                editorEdit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                editorEdit.remove("measurement_enabled_from_api");
            }
            editorEdit.apply();
        }
        if (this.f25625a.j() || !(bool == null || bool.booleanValue())) {
            Y();
        }
    }

    /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
    public final void Y() {
        qa qaVar;
        h();
        g7 g7Var = this.f25625a;
        String strA = g7Var.x().f25679n.a();
        if (strA == null) {
            qaVar = this;
        } else if ("unset".equals(strA)) {
            qaVar = this;
            qaVar.B(Payload.TYPE_APP, "_npa", null, g7Var.e().a());
        } else {
            B(Payload.TYPE_APP, "_npa", Long.valueOf(true != "true".equals(strA) ? 0L : 1L), g7Var.e().a());
            qaVar = this;
        }
        if (!qaVar.f25625a.g() || !qaVar.f25907s) {
            g7Var.a().v().a("Updating Scion state (FE)");
            qaVar.f25625a.J().X();
        } else {
            g7Var.a().v().a("Recording app launch after enabling measurement for the first time (FE)");
            H();
            qaVar.f25625a.z().f25734e.a();
            g7Var.b().t(new e9(this));
        }
    }

    public final void h0() {
        g7 g7Var = this.f25625a;
        if (!(g7Var.d().getApplicationContext() instanceof Application) || this.f25891c == null) {
            return;
        }
        ((Application) g7Var.d().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f25891c);
    }

    public final Boolean i0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) this.f25625a.b().u(atomicReference, 15000L, "boolean test flag value", new k9(this, atomicReference));
    }

    public final String j0() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) this.f25625a.b().u(atomicReference, 15000L, "String test flag value", new t9(this, atomicReference));
    }

    public final Long k0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) this.f25625a.b().u(atomicReference, 15000L, "long test flag value", new u9(this, atomicReference));
    }

    public final Integer l0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) this.f25625a.b().u(atomicReference, 15000L, "int test flag value", new v9(this, atomicReference));
    }

    @Override // nb.b5
    public final boolean m() {
        return false;
    }

    public final Double m0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) this.f25625a.b().u(atomicReference, 15000L, "double test flag value", new w9(this, atomicReference));
    }

    public final void n0(Boolean bool) {
        j();
        this.f25625a.b().t(new x9(this, bool));
    }

    public final void o(q8 q8Var) {
        h();
        boolean z10 = (q8Var.o(p8.ANALYTICS_STORAGE) && q8Var.o(p8.AD_STORAGE)) || this.f25625a.J().C();
        g7 g7Var = this.f25625a;
        if (z10 != g7Var.j()) {
            g7Var.i(z10);
            k6 k6VarX = this.f25625a.x();
            g7 g7Var2 = k6VarX.f25625a;
            k6VarX.h();
            Boolean boolValueOf = k6VarX.p().contains("measurement_enabled_from_api") ? Boolean.valueOf(k6VarX.p().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z10 || boolValueOf == null || boolValueOf.booleanValue()) {
                f0(Boolean.valueOf(z10), false);
            }
        }
    }

    public final void o0(Bundle bundle, int i10, long j10) {
        Object obj;
        String string;
        j();
        q8 q8Var = q8.f25885c;
        p8[] p8VarArrB = o8.STORAGE.b();
        int length = p8VarArrB.length;
        int i11 = 0;
        while (true) {
            obj = null;
            if (i11 >= length) {
                break;
            }
            String str = p8VarArrB[i11].f25855a;
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
            g7 g7Var = this.f25625a;
            g7Var.a().t().b("Ignoring invalid consent setting", obj);
            g7Var.a().t().a("Valid consent values are 'granted', 'denied'");
        }
        boolean zP = this.f25625a.b().p();
        q8 q8VarE = q8.e(bundle, i10);
        if (q8VarE.c()) {
            q0(q8VarE, zP);
        }
        x xVarH = x.h(bundle, i10);
        if (xVarH.d()) {
            p0(xVarH, zP);
        }
        Boolean boolI = x.i(bundle);
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
        q(str, str2, bundle, true, true, this.f25625a.e().a());
    }

    public final void p0(x xVar, boolean z10) {
        y9 y9Var = new y9(this, xVar);
        if (!z10) {
            this.f25625a.b().t(y9Var);
        } else {
            h();
            y9Var.run();
        }
    }

    public final void q(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        Bundle bundle2 = bundle;
        if (Objects.equals(str2, "screen_view")) {
            this.f25625a.I().s(bundle2, j10);
            return;
        }
        boolean z12 = true;
        if (z11 && this.f25892d != null && !ve.N(str2)) {
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
    public final void q0(nb.q8 r10, boolean r11) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nb.qa.q0(nb.q8, boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void r() {
        md mdVar;
        md mdVar2;
        com.google.android.gms.internal.measurement.p9 p9Var;
        h();
        g7 g7Var = this.f25625a;
        g7Var.a().v().a("Handle tcf update.");
        SharedPreferences sharedPreferencesQ = g7Var.x().q();
        HashMap map = new HashMap();
        y4 y4Var = z4.f26151a1;
        if (((Boolean) y4Var.b(null)).booleanValue()) {
            he.t tVar = od.f25824a;
            com.google.android.gms.internal.measurement.o9 o9Var = com.google.android.gms.internal.measurement.o9.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE;
            nd ndVar = nd.CONSENT;
            Map.Entry entryA = pa.a(o9Var, ndVar);
            int i10 = 2;
            com.google.android.gms.internal.measurement.o9 o9Var2 = com.google.android.gms.internal.measurement.o9.IAB_TCF_PURPOSE_SELECT_BASIC_ADS;
            int i11 = 1;
            nd ndVar2 = nd.FLEXIBLE_LEGITIMATE_INTEREST;
            he.u uVarO = he.u.o(entryA, pa.a(o9Var2, ndVar2), pa.a(com.google.android.gms.internal.measurement.o9.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE, ndVar), pa.a(com.google.android.gms.internal.measurement.o9.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS, ndVar), pa.a(com.google.android.gms.internal.measurement.o9.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE, ndVar2), pa.a(com.google.android.gms.internal.measurement.o9.IAB_TCF_PURPOSE_APPLY_MARKET_RESEARCH_TO_GENERATE_AUDIENCE_INSIGHTS, ndVar2), pa.a(com.google.android.gms.internal.measurement.o9.IAB_TCF_PURPOSE_DEVELOP_AND_IMPROVE_PRODUCTS, ndVar2));
            he.w wVarU = he.w.u("CH");
            char[] cArr = new char[5];
            boolean zContains = sharedPreferencesQ.contains("IABTCF_TCString");
            int iB = od.b(sharedPreferencesQ, "IABTCF_CmpSdkID");
            int iB2 = od.b(sharedPreferencesQ, "IABTCF_PolicyVersion");
            int iB3 = od.b(sharedPreferencesQ, "IABTCF_gdprApplies");
            int iB4 = od.b(sharedPreferencesQ, "IABTCF_PurposeOneTreatment");
            int iB5 = od.b(sharedPreferencesQ, "IABTCF_EnableAdvertiserConsentMode");
            String strA = od.a(sharedPreferencesQ, "IABTCF_PublisherCC");
            he.u.a aVarA = he.u.a();
            he.y0 it = uVarO.keySet().iterator();
            while (it.hasNext()) {
                com.google.android.gms.internal.measurement.o9 o9Var3 = (com.google.android.gms.internal.measurement.o9) it.next();
                int iZza = o9Var3.zza();
                StringBuilder sb2 = new StringBuilder(String.valueOf(iZza).length() + 28);
                sb2.append("IABTCF_PublisherRestrictions");
                sb2.append(iZza);
                String strA2 = od.a(sharedPreferencesQ, sb2.toString());
                if (TextUtils.isEmpty(strA2) || strA2.length() < 755) {
                    p9Var = com.google.android.gms.internal.measurement.p9.PURPOSE_RESTRICTION_UNDEFINED;
                } else {
                    int iDigit = Character.digit(strA2.charAt(754), 10);
                    if (iDigit < 0 || iDigit > com.google.android.gms.internal.measurement.p9.values().length || iDigit == 0) {
                        p9Var = com.google.android.gms.internal.measurement.p9.PURPOSE_RESTRICTION_NOT_ALLOWED;
                    } else if (iDigit != i11) {
                        p9Var = iDigit != i10 ? com.google.android.gms.internal.measurement.p9.PURPOSE_RESTRICTION_UNDEFINED : com.google.android.gms.internal.measurement.p9.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST;
                    } else {
                        p9Var = com.google.android.gms.internal.measurement.p9.PURPOSE_RESTRICTION_REQUIRE_CONSENT;
                    }
                }
                aVarA.f(o9Var3, p9Var);
                i10 = 2;
                i11 = 1;
            }
            he.u uVarC = aVarA.c();
            String strA3 = od.a(sharedPreferencesQ, "IABTCF_PurposeConsents");
            String strA4 = od.a(sharedPreferencesQ, "IABTCF_VendorConsents");
            boolean z10 = !TextUtils.isEmpty(strA4) && strA4.length() >= 755 && strA4.charAt(754) == '1';
            String strA5 = od.a(sharedPreferencesQ, "IABTCF_PurposeLegitimateInterests");
            String strA6 = od.a(sharedPreferencesQ, "IABTCF_VendorLegitimateInterests");
            boolean z11 = !TextUtils.isEmpty(strA6) && strA6.length() >= 755 && strA6.charAt(754) == '1';
            cArr[0] = '2';
            mdVar = new md(od.d(uVarO, uVarC, wVarU, cArr, iB, iB5, iB3, iB2, iB4, strA, strA3, strA5, z10, z11, zContains));
        } else {
            String strA7 = od.a(sharedPreferencesQ, "IABTCF_VendorConsents");
            if (!"".equals(strA7) && strA7.length() > 754) {
                map.put("GoogleConsent", String.valueOf(strA7.charAt(754)));
            }
            int iB6 = od.b(sharedPreferencesQ, "IABTCF_gdprApplies");
            if (iB6 != -1) {
                map.put("gdprApplies", String.valueOf(iB6));
            }
            int iB7 = od.b(sharedPreferencesQ, "IABTCF_EnableAdvertiserConsentMode");
            if (iB7 != -1) {
                map.put("EnableAdvertiserConsentMode", String.valueOf(iB7));
            }
            int iB8 = od.b(sharedPreferencesQ, "IABTCF_PolicyVersion");
            if (iB8 != -1) {
                map.put("PolicyVersion", String.valueOf(iB8));
            }
            String strA8 = od.a(sharedPreferencesQ, "IABTCF_PurposeConsents");
            if (!"".equals(strA8)) {
                map.put("PurposeConsents", strA8);
            }
            int iB9 = od.b(sharedPreferencesQ, "IABTCF_CmpSdkID");
            if (iB9 != -1) {
                map.put("CmpSdkID", String.valueOf(iB9));
            }
            mdVar = new md(map);
        }
        g7Var.a().w().b("Tcf preferences read", mdVar);
        if (!g7Var.w().H(null, y4Var)) {
            if (g7Var.x().x(mdVar)) {
                Bundle bundleB = mdVar.b();
                g7Var.a().w().b("Consent generated from Tcf", bundleB);
                if (bundleB != Bundle.EMPTY) {
                    o0(bundleB, -30, g7Var.e().a());
                }
                Bundle bundle = new Bundle();
                bundle.putString("_tcfd", mdVar.e());
                t("auto", "_tcf", bundle);
                return;
            }
            return;
        }
        k6 k6VarX = g7Var.x();
        k6VarX.h();
        String string = k6VarX.p().getString("stored_tcf_param", "");
        HashMap map2 = new HashMap();
        if (TextUtils.isEmpty(string)) {
            mdVar2 = new md(map2);
        } else {
            for (String str : string.split(";")) {
                String[] strArrSplit = str.split("=");
                if (strArrSplit.length >= 2 && od.f25824a.contains(strArrSplit[0])) {
                    map2.put(strArrSplit[0], strArrSplit[1]);
                }
            }
            mdVar2 = new md(map2);
        }
        if (g7Var.x().x(mdVar)) {
            Bundle bundleB2 = mdVar.b();
            g7Var.a().w().b("Consent generated from Tcf", bundleB2);
            if (bundleB2 != Bundle.EMPTY) {
                o0(bundleB2, -30, g7Var.e().a());
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("_tcfm", mdVar.d(mdVar2));
            bundle2.putString("_tcfd2", mdVar.c());
            bundle2.putString("_tcfd", mdVar.e());
            t("auto", "_tcf", bundle2);
        }
    }

    public final void r0(Runnable runnable) {
        j();
        g7 g7Var = this.f25625a;
        if (g7Var.b().p()) {
            g7Var.a().o().a("Cannot retrieve and upload batches from analytics worker thread");
            return;
        }
        if (g7Var.b().q()) {
            g7Var.a().o().a("Cannot retrieve and upload batches from analytics network thread");
            return;
        }
        g7Var.c();
        if (f.a()) {
            g7Var.a().o().a("Cannot retrieve and upload batches from main thread");
            return;
        }
        g7Var.a().w().a("[sgtm] Started client-side batch upload work.");
        boolean z10 = false;
        int size = 0;
        int i10 = 0;
        while (!z10) {
            g7Var.a().w().a("[sgtm] Getting upload batches from service (FE)");
            final AtomicReference atomicReference = new AtomicReference();
            g7Var.b().u(atomicReference, 10000L, "[sgtm] Getting upload batches", new Runnable() { // from class: nb.oa
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f25821a.f25625a.J().j0(atomicReference, zzoo.a(za.SGTM_CLIENT));
                }
            });
            zzoq zzoqVar = (zzoq) atomicReference.get();
            if (zzoqVar == null) {
                break;
            }
            List list = zzoqVar.f7437f;
            if (!list.isEmpty()) {
                g7Var.a().w().b("[sgtm] Retrieved upload batches. count", Integer.valueOf(list.size()));
                size += list.size();
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z10 = false;
                        break;
                    }
                    ya yaVarE0 = e0((zzom) it.next());
                    if (yaVarE0 == ya.SUCCESS) {
                        i10++;
                    } else if (yaVarE0 == ya.BACKOFF) {
                        z10 = true;
                        break;
                    }
                }
            } else {
                break;
            }
        }
        g7Var.a().w().c("[sgtm] Completed client-side batch upload work. total, success", Integer.valueOf(size), Integer.valueOf(i10));
        runnable.run();
    }

    public final void s() {
        h();
        g7 g7Var = this.f25625a;
        g7Var.a().v().a("Register tcfPrefChangeListener.");
        if (this.f25909u == null) {
            this.f25910v = new h9(this, this.f25625a);
            this.f25909u = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: nb.ka
                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                public final /* synthetic */ void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                    this.f25697a.T(sharedPreferences, str);
                }
            };
        }
        g7Var.x().q().registerOnSharedPreferenceChangeListener(this.f25909u);
    }

    public final void s0(long j10) {
        h();
        if (this.f25900l == null) {
            this.f25900l = new z8(this, this.f25625a);
        }
        this.f25900l.b(j10);
    }

    public final void t(String str, String str2, Bundle bundle) {
        h();
        u(str, str2, this.f25625a.e().a(), bundle);
    }

    public final void t0() {
        h();
        w wVar = this.f25900l;
        if (wVar != null) {
            wVar.d();
        }
    }

    public final void u(String str, String str2, long j10, Bundle bundle) {
        h();
        boolean z10 = true;
        if (this.f25892d != null && !ve.N(str2)) {
            z10 = false;
        }
        v(str, str2, j10, bundle, true, z10, true, null);
    }

    public final void u0() {
        vf.a();
        g7 g7Var = this.f25625a;
        if (g7Var.w().H(null, z4.R0)) {
            if (g7Var.b().p()) {
                g7Var.a().o().a("Cannot get trigger URIs from analytics worker thread");
                return;
            }
            g7Var.c();
            if (f.a()) {
                g7Var.a().o().a("Cannot get trigger URIs from main thread");
                return;
            }
            j();
            g7Var.a().w().a("Getting trigger URIs (FE)");
            final AtomicReference atomicReference = new AtomicReference();
            g7Var.b().u(atomicReference, 10000L, "get trigger URIs", new Runnable() { // from class: nb.ga
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    qa qaVar = this.f25560a;
                    qaVar.f25625a.J().i0(atomicReference, qaVar.f25625a.x().f25680o.a());
                }
            });
            final List list = (List) atomicReference.get();
            if (list == null) {
                g7Var.a().q().a("Timed out waiting for get trigger URIs");
            } else {
                g7Var.b().t(new Runnable() { // from class: nb.ha
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        qa qaVar = this.f25580a;
                        qaVar.h();
                        if (Build.VERSION.SDK_INT < 30) {
                            return;
                        }
                        List<zzoh> list2 = list;
                        SparseArray sparseArrayR = qaVar.f25625a.x().r();
                        for (zzoh zzohVar : list2) {
                            int i10 = zzohVar.f7428h;
                            if (!sparseArrayR.contains(i10) || ((Long) sparseArrayR.get(i10)).longValue() < zzohVar.f7427g) {
                                qaVar.w0().add(zzohVar);
                            }
                        }
                        qaVar.x0();
                    }
                });
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void v(String str, String str2, long j10, Bundle bundle, boolean z10, boolean z11, boolean z12, String str3) {
        boolean z13;
        int i10;
        g7 g7Var;
        long j11;
        long j12;
        String str4;
        long j13;
        Bundle[] bundleArr;
        String str5 = str;
        n9.m.f(str5);
        n9.m.l(bundle);
        h();
        j();
        g7 g7Var2 = this.f25625a;
        if (!g7Var2.g()) {
            this.f25625a.a().v().a("Event not sent since app measurement is disabled");
            return;
        }
        List listW = this.f25625a.L().w();
        if (listW != null && !listW.contains(str2)) {
            this.f25625a.a().v().c("Dropping non-safelisted event. event name, origin", str2, str5);
            return;
        }
        if (!this.f25894f) {
            this.f25894f = true;
            try {
                try {
                    (!g7Var2.G() ? Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, this.f25625a.d().getClassLoader()) : Class.forName("com.google.android.gms.tagmanager.TagManagerService")).getDeclaredMethod("initialize", Context.class).invoke(null, this.f25625a.d());
                } catch (Exception e10) {
                    this.f25625a.a().r().b("Failed to invoke Tag Manager's initialize() method", e10);
                }
            } catch (ClassNotFoundException unused) {
                this.f25625a.a().u().a("Tag Manager is not found and thus will not be used");
            }
        }
        g7 g7Var3 = this.f25625a;
        if (!g7Var3.w().H(null, z4.f26168g1) && "_cmp".equals(str2) && bundle.containsKey("gclid")) {
            g7Var3.c();
            B("auto", "_lgclid", bundle.getString("gclid"), g7Var3.e().a());
        }
        qa qaVar = this;
        g7Var3.c();
        if (z10 && ve.U(str2)) {
            g7Var3.C().w(bundle, g7Var3.x().f25691z.a());
        }
        if (!z12) {
            g7Var3.c();
            if (!"_iap".equals(str2)) {
                g7 g7Var4 = qaVar.f25625a;
                ve veVarC = g7Var4.C();
                int i11 = 2;
                if (veVarC.t0("event", str2)) {
                    if (veVarC.v0("event", r8.f25927a, r8.b, str2)) {
                        veVarC.f25625a.w();
                        if (veVarC.w0("event", 40, str2)) {
                            i11 = 0;
                        }
                    } else {
                        i11 = 13;
                    }
                }
                if (i11 != 0) {
                    g7Var3.a().q().b("Invalid public event name. Event will not be logged (FE)", g7Var3.D().a(str2));
                    ve veVarC2 = g7Var4.C();
                    g7Var4.w();
                    g7Var4.C().B(qaVar.f25911w, null, i11, "_ev", veVarC2.q(str2, 40, true), str2 != null ? str2.length() : 0);
                    return;
                }
            }
        }
        g7Var3.c();
        g7 g7Var5 = qaVar.f25625a;
        bb bbVarQ = g7Var5.I().q(false);
        if (bbVarQ != null && !bundle.containsKey("_sc")) {
            bbVarQ.f25367d = true;
        }
        ve.k0(bbVarQ, bundle, z10 && !z12);
        boolean zEquals = "am".equals(str5);
        boolean zN = ve.N(str2);
        if (!z10 || qaVar.f25892d == null || zN) {
            z13 = zEquals;
        } else {
            if (!zEquals) {
                g7Var3.a().v().c("Passing event to registered event handler (FE)", g7Var3.D().a(str2), g7Var3.D().e(bundle));
                n9.m.l(qaVar.f25892d);
                qaVar.f25892d.a(str5, str2, bundle, j10);
                return;
            }
            z13 = true;
        }
        g7 g7Var6 = qaVar.f25625a;
        if (g7Var6.m()) {
            int iX0 = g7Var3.C().x0(str2);
            if (iX0 != 0) {
                g7Var3.a().q().b("Invalid event name. Event will not be logged (FE)", g7Var3.D().a(str2));
                ve veVarC3 = g7Var3.C();
                g7Var3.w();
                g7Var6.C().B(qaVar.f25911w, str3, iX0, "_ev", veVarC3.q(str2, 40, true), str2 != null ? str2.length() : 0);
                return;
            }
            Bundle bundleT = g7Var3.C().t(str3, str2, bundle, u9.f.b("_o", "_sn", "_sc", "_si"), z12);
            n9.m.l(bundleT);
            g7Var3.c();
            if (g7Var5.I().q(false) == null || !"_ae".equals(str2)) {
                i10 = 0;
                g7Var = g7Var5;
                j11 = 0;
            } else {
                jd jdVar = g7Var5.z().f25735f;
                j11 = 0;
                long jB = jdVar.f25644d.f25625a.e().b();
                i10 = 0;
                g7Var = g7Var5;
                long j14 = jB - jdVar.b;
                jdVar.b = jB;
                if (j14 > 0) {
                    g7Var3.C().Z(bundleT, j14);
                }
            }
            if (!"auto".equals(str5) && "_ssr".equals(str2)) {
                ve veVarC4 = g7Var3.C();
                String string = bundleT.getString("_ffr");
                if (u9.o.a(string)) {
                    string = null;
                } else if (string != null) {
                    string = string.trim();
                }
                g7 g7Var7 = veVarC4.f25625a;
                if (Objects.equals(string, g7Var7.x().f25688w.a())) {
                    g7Var7.a().v().a("Not logging duplicate session_start_with_rollout event");
                    return;
                }
                g7Var7.x().f25688w.b(string);
            } else if ("_ae".equals(str2)) {
                String strA = g7Var3.C().f25625a.x().f25688w.a();
                if (!TextUtils.isEmpty(strA)) {
                    bundleT.putString("_ffr", strA);
                }
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(bundleT);
            boolean zP = g7Var3.w().H(null, z4.V0) ? g7Var.z().p() : g7Var3.x().f25685t.a();
            if (g7Var3.x().f25682q.a() > j11 && g7Var3.x().A(j10) && zP) {
                g7Var3.a().w().a("Current session is expired, remove the session number, ID, and engagement time");
                str4 = "_ae";
                j12 = j11;
                B("auto", "_sid", null, g7Var3.e().a());
                B("auto", "_sno", null, g7Var3.e().a());
                B("auto", "_se", null, g7Var3.e().a());
                qaVar = this;
                g7Var3.x().f25683r.b(j12);
            } else {
                j12 = j11;
                str4 = "_ae";
            }
            if (bundleT.getLong("extend_session", j12) == 1) {
                g7Var3.a().w().a("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                j13 = j10;
                g7Var6.z().f25734e.b(j13, true);
            } else {
                j13 = j10;
            }
            ArrayList arrayList2 = new ArrayList(bundleT.keySet());
            Collections.sort(arrayList2);
            int size = arrayList2.size();
            for (int i12 = i10; i12 < size; i12++) {
                String str6 = (String) arrayList2.get(i12);
                if (str6 != null) {
                    g7Var3.C();
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
                    bundleQ = g7Var3.C().Q(bundleQ, null);
                }
                Bundle bundle2 = bundleQ;
                g7Var.J().c0(new zzbg(str7, new zzbe(bundle2), str5, j13), str3);
                if (!z13) {
                    Iterator it = qaVar.f25893e.iterator();
                    while (it.hasNext()) {
                        ((v8) it.next()).a(str, str2, new Bundle(bundle2), j10);
                    }
                }
                i13++;
                str5 = str;
                j13 = j10;
            }
            g7Var3.c();
            if (g7Var.I().q(i10) == null || !str4.equals(str2)) {
                return;
            }
            g7Var.z().f25735f.d(true, true, g7Var3.e().b());
        }
    }

    public final boolean v0() {
        return this.f25902n;
    }

    public final void w(String str, String str2, Bundle bundle, String str3) {
        g7.q();
        x("auto", str2, this.f25625a.e().a(), bundle, false, true, true, str3);
    }

    @TargetApi(30)
    public final PriorityQueue w0() {
        if (this.f25901m == null) {
            this.f25901m = new PriorityQueue(Comparator.comparing(new Function() { // from class: nb.ia
                @Override // java.util.function.Function
                public final /* synthetic */ Object apply(Object obj) {
                    return Long.valueOf(((zzoh) obj).f7427g);
                }
            }, new Comparator() { // from class: nb.ja
                @Override // java.util.Comparator
                public final /* synthetic */ int compare(Object obj, Object obj2) {
                    return Long.compare(((Long) obj).longValue(), ((Long) obj2).longValue());
                }
            }));
        }
        return this.f25901m;
    }

    public final void x(String str, String str2, long j10, Bundle bundle, boolean z10, boolean z11, boolean z12, String str3) {
        String[] strArr = ve.f26040i;
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
        this.f25625a.b().t(new i9(this, str, str2, j10, bundle2, z10, z11, z12, str3));
    }

    @TargetApi(30)
    public final void x0() {
        zzoh zzohVar;
        h();
        this.f25902n = false;
        if (w0().isEmpty() || this.f25897i || (zzohVar = (zzoh) w0().poll()) == null) {
            return;
        }
        g7 g7Var = this.f25625a;
        r4.a aVarH = g7Var.C().H();
        if (aVarH != null) {
            this.f25897i = true;
            u5 u5VarW = g7Var.a().w();
            String str = zzohVar.f7426f;
            u5VarW.b("Registering trigger URI", str);
            me.x<Unit> xVarC = aVarH.c(Uri.parse(str));
            if (xVarC != null) {
                me.s.a(xVarC, new b9(this, zzohVar), new a9(this));
            } else {
                this.f25897i = false;
                w0().add(zzohVar);
            }
        }
    }

    public final void y(String str, String str2, Object obj, boolean z10) {
        z("auto", "_ldl", obj, true, this.f25625a.e().a());
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
        g7 g7Var;
        int iY;
        Object objZ;
        if (!z10) {
            ve veVarC = this.f25625a.C();
            if (!veVarC.t0("user property", str2)) {
                i10 = 6;
            } else if (veVarC.v0("user property", t8.f25980a, null, str2)) {
                veVarC.f25625a.w();
                if (veVarC.w0("user property", 24, str2)) {
                    i10 = 0;
                } else {
                    i10 = 6;
                }
            } else {
                iY0 = 15;
            }
            if (i10 != 0) {
                g7 g7Var2 = this.f25625a;
                ve veVarC2 = g7Var2.C();
                g7Var2.w();
                this.f25625a.C().B(this.f25911w, null, i10, "_ev", veVarC2.q(str2, 24, true), str2 != null ? str2.length() : 0);
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
            g7Var = this.f25625a;
            iY = g7Var.C().y(str2, obj);
            if (iY != 0) {
                objZ = g7Var.C().z(str2, obj);
                if (objZ != null) {
                    A(str3, str2, j10, objZ);
                    return;
                }
                return;
            }
            ve veVarC3 = g7Var.C();
            g7Var.w();
            this.f25625a.C().B(this.f25911w, null, iY, "_ev", veVarC3.q(str2, 24, true), (!(obj instanceof String) || (obj instanceof CharSequence)) ? obj.toString().length() : 0);
        }
        iY0 = this.f25625a.C().y0(str2);
        i10 = iY0;
        if (i10 != 0) {
            g7 g7Var3 = this.f25625a;
            ve veVarC4 = g7Var3.C();
            g7Var3.w();
            if (str2 != null) {
            }
            this.f25625a.C().B(this.f25911w, null, i10, "_ev", veVarC4.q(str2, 24, true), str2 != null ? str2.length() : 0);
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
        g7Var = this.f25625a;
        iY = g7Var.C().y(str2, obj);
        if (iY != 0) {
            objZ = g7Var.C().z(str2, obj);
            if (objZ != null) {
                A(str3, str2, j10, objZ);
                return;
            }
            return;
        }
        ve veVarC5 = g7Var.C();
        g7Var.w();
        this.f25625a.C().B(this.f25911w, null, iY, "_ev", veVarC5.q(str2, 24, true), (!(obj instanceof String) || (obj instanceof CharSequence)) ? obj.toString().length() : 0);
    }
}
