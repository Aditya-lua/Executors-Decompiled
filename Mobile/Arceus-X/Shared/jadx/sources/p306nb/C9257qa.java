package p306nb;

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
import androidx.core.app.NotificationCompat;
import com.appsflyer.sdk_base.referrer.Payload;
import com.google.android.gms.internal.measurement.C2361vf;
import com.google.android.gms.internal.measurement.EnumC2229o9;
import com.google.android.gms.internal.measurement.EnumC2247p9;
import com.google.android.gms.measurement.internal.zzaf;
import com.google.android.gms.measurement.internal.zzbe;
import com.google.android.gms.measurement.internal.zzbg;
import com.google.android.gms.measurement.internal.zzoh;
import com.google.android.gms.measurement.internal.zzom;
import com.google.android.gms.measurement.internal.zzoo;
import com.google.android.gms.measurement.internal.zzoq;
import com.google.android.gms.measurement.internal.zzpl;
import ie.AbstractC6796t;
import ie.AbstractC6798u;
import ie.AbstractC6802w;
import ie.AbstractC6807y0;
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
import ne.C9435s;
import ne.InterfaceFutureC9440x;
import okhttp3.internal.p336ws.RealWebSocket;
import p305n9.C8953m;
import p401r4.AbstractC10783a;
import p462u9.C11815f;
import p462u9.C11824o;
import p504w1.C12277a;

/* JADX INFO: renamed from: nb.qa */
/* JADX INFO: loaded from: classes.dex */
public final class C9257qa extends AbstractC9008b5 {

    /* JADX INFO: renamed from: c */
    public C9047da f33392c;

    /* JADX INFO: renamed from: d */
    public InterfaceC9319u8 f33393d;

    /* JADX INFO: renamed from: e */
    public final Set f33394e;

    /* JADX INFO: renamed from: f */
    public boolean f33395f;

    /* JADX INFO: renamed from: g */
    public final AtomicReference f33396g;

    /* JADX INFO: renamed from: h */
    public final Object f33397h;

    /* JADX INFO: renamed from: i */
    public boolean f33398i;

    /* JADX INFO: renamed from: j */
    public int f33399j;

    /* JADX INFO: renamed from: k */
    public AbstractC9342w f33400k;

    /* JADX INFO: renamed from: l */
    public AbstractC9342w f33401l;

    /* JADX INFO: renamed from: m */
    public PriorityQueue f33402m;

    /* JADX INFO: renamed from: n */
    public boolean f33403n;

    /* JADX INFO: renamed from: o */
    public C9255q8 f33404o;

    /* JADX INFO: renamed from: p */
    public final AtomicLong f33405p;

    /* JADX INFO: renamed from: q */
    public long f33406q;

    /* JADX INFO: renamed from: r */
    public final C9035cf f33407r;

    /* JADX INFO: renamed from: s */
    public boolean f33408s;

    /* JADX INFO: renamed from: t */
    public AbstractC9342w f33409t;

    /* JADX INFO: renamed from: u */
    public SharedPreferences.OnSharedPreferenceChangeListener f33410u;

    /* JADX INFO: renamed from: v */
    public AbstractC9342w f33411v;

    /* JADX INFO: renamed from: w */
    public final InterfaceC9325ue f33412w;

    public C9257qa(C9094g7 c9094g7) {
        super(c9094g7);
        this.f33394e = new CopyOnWriteArraySet();
        this.f33397h = new Object();
        this.f33398i = false;
        this.f33399j = 1;
        this.f33408s = true;
        this.f33412w = new C9288s9(this);
        this.f33396g = new AtomicReference();
        this.f33404o = C9255q8.f33384c;
        this.f33406q = -1L;
        this.f33405p = new AtomicLong(0L);
        this.f33407r = new C9035cf(c9094g7);
    }

    /* JADX INFO: renamed from: A */
    public final void m36662A(String str, String str2, long j10, Object obj) {
        this.f33067a.mo36322b().m36263t(new RunnableC9144j9(this, str, str2, obj, j10));
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:17:0x0053 */
    /* JADX WARN: Code duplicated, block: B:17:0x0053 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0055  */
    /* JADX INFO: renamed from: B */
    public final void m36663B(String str, String str2, Object obj, long j10) {
        C8953m.m36041f(str);
        C8953m.m36041f(str2);
        mo36088h();
        m36121j();
        Object obj2 = obj;
        if ("allow_personalized_ads".equals(str2)) {
            if (obj instanceof String) {
                String str3 = (String) obj;
                if (!TextUtils.isEmpty(str3)) {
                    long j11 = true != "false".equals(str3.toLowerCase(Locale.ENGLISH)) ? 0L : 1L;
                    C9094g7 c9094g7 = this.f33067a;
                    Long lValueOf = Long.valueOf(j11);
                    c9094g7.m36339x().f33126n.m36370b(lValueOf.longValue() == 1 ? "true" : "false");
                    obj = lValueOf;
                } else if (obj == null) {
                    this.f33067a.m36339x().f33126n.m36370b("unset");
                    obj = obj;
                }
                str2 = "_npa";
            } else if (obj == null) {
                this.f33067a.m36339x().f33126n.m36370b("unset");
                obj = obj;
                str2 = "_npa";
            }
            this.f33067a.mo36321a().m37011w().m36913c("Setting user property(FE)", "non_personalized_ads(_npa)", obj);
            obj2 = obj;
        }
        String str4 = str2;
        Object obj3 = obj2;
        C9094g7 c9094g8 = this.f33067a;
        if (!c9094g8.m36327g()) {
            this.f33067a.mo36321a().m37011w().m36911a("User property not set since app measurement is disabled");
        } else if (c9094g8.m36333m()) {
            this.f33067a.m36315J().m36897o(new zzpl(str4, j10, obj3, str));
        }
    }

    /* JADX INFO: renamed from: C */
    public final Map m36664C(String str, String str2, boolean z10) {
        C9094g7 c9094g7 = this.f33067a;
        if (c9094g7.mo36322b().m36259p()) {
            c9094g7.mo36321a().m37003o().m36911a("Cannot get user properties from analytics worker thread");
            return Collections.EMPTY_MAP;
        }
        c9094g7.mo36323c();
        if (C9070f.m36294a()) {
            c9094g7.mo36321a().m37003o().m36911a("Cannot get user properties from main thread");
            return Collections.EMPTY_MAP;
        }
        AtomicReference atomicReference = new AtomicReference();
        this.f33067a.mo36322b().m36264u(atomicReference, 5000L, "get user properties", new RunnableC9256q9(this, atomicReference, null, str, str2, z10));
        List<zzpl> list = (List) atomicReference.get();
        if (list == null) {
            c9094g7.mo36321a().m37003o().m36912b("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z10));
            return Collections.EMPTY_MAP;
        }
        C12277a c12277a = new C12277a(list.size());
        for (zzpl zzplVar : list) {
            Object objZza = zzplVar.zza();
            if (objZza != null) {
                c12277a.put(zzplVar.f9519g, objZza);
            }
        }
        return c12277a;
    }

    /* JADX INFO: renamed from: D */
    public final String m36665D() {
        return (String) this.f33396g.get();
    }

    /* JADX INFO: renamed from: E */
    public final void m36666E(String str) {
        this.f33396g.set(str);
    }

    /* JADX INFO: renamed from: F */
    public final void m36667F() {
        mo36088h();
        C9094g7 c9094g7 = this.f33067a;
        if (c9094g7.m36339x().f33133u.m36295a()) {
            c9094g7.mo36321a().m37010v().m36911a("Deferred Deep Link already retrieved. Not fetching again.");
            return;
        }
        long jM36345a = c9094g7.m36339x().f33134v.m36345a();
        c9094g7.m36339x().f33134v.m36346b(1 + jM36345a);
        c9094g7.m36338w();
        if (jM36345a >= 5) {
            c9094g7.mo36321a().m37006r().m36911a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
            c9094g7.m36339x().f33133u.m36296b(true);
        } else {
            if (this.f33409t == null) {
                this.f33409t = new C9176l9(this, this.f33067a);
            }
            this.f33409t.m36990b(0L);
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m36668G(long j10) {
        this.f33396g.set(null);
        this.f33067a.mo36322b().m36263t(new RunnableC9192m9(this, j10));
    }

    /* JADX INFO: renamed from: H */
    public final void m36669H() {
        mo36088h();
        m36121j();
        if (this.f33067a.m36333m()) {
            C9094g7 c9094g7 = this.f33067a;
            C9150k c9150kM36338w = c9094g7.m36338w();
            c9150kM36338w.f33067a.mo36323c();
            Boolean boolM36408J = c9150kM36338w.m36408J("google_analytics_deferred_deep_link_enabled");
            if (boolM36408J != null && boolM36408J.booleanValue()) {
                c9094g7.mo36321a().m37010v().m36911a("Deferred Deep Link feature enabled.");
                c9094g7.mo36322b().m36263t(new Runnable() { // from class: nb.na
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.f33274a.m36667F();
                    }
                });
            }
            this.f33067a.m36315J().m36901s();
            this.f33408s = false;
            C9157k6 c9157k6M36339x = c9094g7.m36339x();
            c9157k6M36339x.mo36088h();
            String string = c9157k6M36339x.m36443p().getString("previous_os_version", null);
            c9157k6M36339x.f33067a.m36316K().m36455l();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor editorEdit = c9157k6M36339x.m36443p().edit();
                editorEdit.putString("previous_os_version", str);
                editorEdit.apply();
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            c9094g7.m36316K().m36455l();
            if (string.equals(str)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", string);
            m36712t("auto", "_ou", bundle);
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m36670I(InterfaceC9319u8 interfaceC9319u8) {
        InterfaceC9319u8 interfaceC9319u9;
        mo36088h();
        m36121j();
        if (interfaceC9319u8 != null && interfaceC9319u8 != (interfaceC9319u9 = this.f33393d)) {
            C8953m.m36052q(interfaceC9319u9 == null, "EventInterceptor already set.");
        }
        this.f33393d = interfaceC9319u8;
    }

    /* JADX INFO: renamed from: J */
    public final void m36671J(InterfaceC9335v8 interfaceC9335v8) {
        m36121j();
        C8953m.m36047l(interfaceC9335v8);
        if (this.f33394e.add(interfaceC9335v8)) {
            return;
        }
        this.f33067a.mo36321a().m37006r().m36911a("OnEventListener already registered");
    }

    /* JADX INFO: renamed from: K */
    public final void m36672K(InterfaceC9335v8 interfaceC9335v8) {
        m36121j();
        C8953m.m36047l(interfaceC9335v8);
        if (this.f33394e.remove(interfaceC9335v8)) {
            return;
        }
        this.f33067a.mo36321a().m37006r().m36911a("OnEventListener had not been registered");
    }

    /* JADX INFO: renamed from: L */
    public final int m36673L(String str) {
        C8953m.m36041f(str);
        this.f33067a.m36338w();
        return 25;
    }

    /* JADX INFO: renamed from: M */
    public final void m36674M(Bundle bundle) {
        m36675N(bundle, this.f33067a.mo36325e().mo44175a());
    }

    /* JADX INFO: renamed from: N */
    public final void m36675N(Bundle bundle, long j10) {
        C8953m.m36047l(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            this.f33067a.mo36321a().m37006r().m36911a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        C8953m.m36047l(bundle2);
        C9191m8.m36480b(bundle2, "app_id", String.class, null);
        C9191m8.m36480b(bundle2, "origin", String.class, null);
        C9191m8.m36480b(bundle2, "name", String.class, null);
        C9191m8.m36480b(bundle2, "value", Object.class, null);
        C9191m8.m36480b(bundle2, "trigger_event_name", String.class, null);
        C9191m8.m36480b(bundle2, "trigger_timeout", Long.class, 0L);
        C9191m8.m36480b(bundle2, "timed_out_event_name", String.class, null);
        C9191m8.m36480b(bundle2, "timed_out_event_params", Bundle.class, null);
        C9191m8.m36480b(bundle2, "triggered_event_name", String.class, null);
        C9191m8.m36480b(bundle2, "triggered_event_params", Bundle.class, null);
        C9191m8.m36480b(bundle2, "time_to_live", Long.class, 0L);
        C9191m8.m36480b(bundle2, "expired_event_name", String.class, null);
        C9191m8.m36480b(bundle2, "expired_event_params", Bundle.class, null);
        C8953m.m36041f(bundle2.getString("name"));
        C8953m.m36041f(bundle2.getString("origin"));
        C8953m.m36047l(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j10);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        C9094g7 c9094g7 = this.f33067a;
        if (c9094g7.m36308C().m36987y0(string) != 0) {
            c9094g7.mo36321a().m37003o().m36912b("Invalid conditional user property name", c9094g7.m36309D().m36622c(string));
            return;
        }
        if (c9094g7.m36308C().m36986y(string, obj) != 0) {
            c9094g7.mo36321a().m37003o().m36913c("Invalid conditional user property value", c9094g7.m36309D().m36622c(string), obj);
            return;
        }
        Object objM36988z = c9094g7.m36308C().m36988z(string, obj);
        if (objM36988z == null) {
            c9094g7.mo36321a().m37003o().m36913c("Unable to normalize conditional user property value", c9094g7.m36309D().m36622c(string), obj);
            return;
        }
        C9191m8.m36479a(bundle2, objM36988z);
        long j11 = bundle2.getLong("trigger_timeout");
        if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name"))) {
            c9094g7.m36338w();
            if (j11 > 15552000000L || j11 < 1) {
                c9094g7.mo36321a().m37003o().m36913c("Invalid conditional user property timeout", c9094g7.m36309D().m36622c(string), Long.valueOf(j11));
                return;
            }
        }
        long j12 = bundle2.getLong("time_to_live");
        c9094g7.m36338w();
        if (j12 > 15552000000L || j12 < 1) {
            c9094g7.mo36321a().m37003o().m36913c("Invalid conditional user property time to live", c9094g7.m36309D().m36622c(string), Long.valueOf(j12));
        } else {
            c9094g7.mo36322b().m36263t(new RunnableC9208n9(this, bundle2));
        }
    }

    /* JADX INFO: renamed from: O */
    public final void m36676O(String str, String str2, Bundle bundle) {
        C9094g7 c9094g7 = this.f33067a;
        long jMo44175a = c9094g7.mo36325e().mo44175a();
        C8953m.m36041f(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", jMo44175a);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        c9094g7.mo36322b().m36263t(new RunnableC9224o9(this, bundle2));
    }

    /* JADX INFO: renamed from: P */
    public final ArrayList m36677P(String str, String str2) {
        C9094g7 c9094g7 = this.f33067a;
        if (c9094g7.mo36322b().m36259p()) {
            c9094g7.mo36321a().m37003o().m36911a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        c9094g7.mo36323c();
        if (C9070f.m36294a()) {
            c9094g7.mo36321a().m37003o().m36911a("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        this.f33067a.mo36322b().m36264u(atomicReference, 5000L, "get conditional user properties", new RunnableC9240p9(this, atomicReference, null, str, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return C9341ve.m36929h0(list);
        }
        c9094g7.mo36321a().m37003o().m36912b("Timed out waiting for get conditional user properties", null);
        return new ArrayList();
    }

    /* JADX INFO: renamed from: Q */
    public final String m36678Q() {
        C9014bb c9014bbM36384u = this.f33067a.m36314I().m36384u();
        if (c9014bbM36384u != null) {
            return c9014bbM36384u.f32724a;
        }
        return null;
    }

    /* JADX INFO: renamed from: R */
    public final String m36679R() {
        C9014bb c9014bbM36384u = this.f33067a.m36314I().m36384u();
        if (c9014bbM36384u != null) {
            return c9014bbM36384u.f32725b;
        }
        return null;
    }

    /* JADX INFO: renamed from: S */
    public final String m36680S() {
        try {
            return C8997ab.m36111a(this.f33067a.mo36324d(), "google_app_id", this.f33067a.m36313H());
        } catch (IllegalStateException e10) {
            this.f33067a.mo36321a().m37003o().m36912b("getGoogleAppId failed with exception", e10);
            return null;
        }
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m36681T(SharedPreferences sharedPreferences, String str) {
        C9094g7 c9094g7 = this.f33067a;
        if (!c9094g7.m36338w().m36406H(null, C9395z4.f33759a1)) {
            if (Objects.equals(str, "IABTCF_TCString")) {
                c9094g7.mo36321a().m37011w().m36911a("IABTCF_TCString change picked up in listener.");
                ((AbstractC9342w) C8953m.m36047l(this.f33411v)).m36990b(500L);
                return;
            }
            return;
        }
        if (Objects.equals(str, "IABTCF_TCString") || Objects.equals(str, "IABTCF_gdprApplies") || Objects.equals(str, "IABTCF_EnableAdvertiserConsentMode")) {
            c9094g7.mo36321a().m37011w().m36911a("IABTCF_TCString change picked up in listener.");
            ((AbstractC9342w) C8953m.m36047l(this.f33411v)).m36990b(500L);
        }
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m36682U(Bundle bundle) {
        Bundle bundle2;
        int i10;
        if (bundle.isEmpty()) {
            bundle2 = bundle;
        } else {
            C9094g7 c9094g7 = this.f33067a;
            bundle2 = new Bundle(c9094g7.m36339x().f33138z.m36298a());
            Iterator<String> it = bundle.keySet().iterator();
            while (true) {
                i10 = 0;
                if (!it.hasNext()) {
                    break;
                }
                String next = it.next();
                Object obj = bundle.get(next);
                if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                    if (c9094g7.m36308C().m36937B0(obj)) {
                        c9094g7.m36308C().m36936B(this.f33412w, null, 27, null, null, 0);
                    }
                    c9094g7.mo36321a().m37008t().m36913c("Invalid default event parameter type. Name, value", next, obj);
                } else if (C9341ve.m36926N(next)) {
                    c9094g7.mo36321a().m37008t().m36912b("Invalid default event parameter name. Name", next);
                } else if (obj == null) {
                    bundle2.remove(next);
                } else if (c9094g7.m36308C().m36938C0("param", next, c9094g7.m36338w().m36427x(null, false), obj)) {
                    c9094g7.m36308C().m36934A(bundle2, next, obj);
                }
            }
            c9094g7.m36308C();
            int iM36425v = c9094g7.m36338w().m36425v();
            if (bundle2.size() > iM36425v) {
                for (String str : new TreeSet(bundle2.keySet())) {
                    i10++;
                    if (i10 > iM36425v) {
                        bundle2.remove(str);
                    }
                }
                c9094g7.m36308C().m36936B(this.f33412w, null, 26, null, null, 0);
                c9094g7.mo36321a().m37008t().m36911a("Too many default event parameters set. Discarding beyond event parameter limit");
            }
        }
        C9094g7 c9094g8 = this.f33067a;
        c9094g8.m36339x().f33138z.m36299b(bundle2);
        if (!bundle.isEmpty() || c9094g8.m36338w().m36406H(null, C9395z4.f33752X0)) {
            this.f33067a.m36315J().m36904v(bundle2);
        }
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m36683V(int i10) {
        if (this.f33400k == null) {
            this.f33400k = new C9029c9(this, this.f33067a);
        }
        this.f33400k.m36990b(((long) i10) * 1000);
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m36684W(Boolean bool, boolean z10) {
        m36693f0(bool, true);
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m36685X(C9255q8 c9255q8, long j10, boolean z10, boolean z11) {
        mo36088h();
        m36121j();
        C9094g7 c9094g7 = this.f33067a;
        C9255q8 c9255q8M36450w = c9094g7.m36339x().m36450w();
        if (j10 <= this.f33406q && C9255q8.m36650u(c9255q8M36450w.m36651b(), c9255q8.m36651b())) {
            c9094g7.mo36321a().m37009u().m36912b("Dropped out-of-date consent setting, proposed settings", c9255q8);
            return;
        }
        C9157k6 c9157k6M36339x = c9094g7.m36339x();
        C9094g7 c9094g8 = c9157k6M36339x.f33067a;
        c9157k6M36339x.mo36088h();
        int iM36651b = c9255q8.m36651b();
        if (!c9157k6M36339x.m36449v(iM36651b)) {
            c9094g7.mo36321a().m37009u().m36912b("Lower precedence consent source ignored, proposed source", Integer.valueOf(c9255q8.m36651b()));
            return;
        }
        C9094g7 c9094g9 = this.f33067a;
        SharedPreferences.Editor editorEdit = c9157k6M36339x.m36443p().edit();
        editorEdit.putString("consent_settings", c9255q8.m36654l());
        editorEdit.putInt("consent_source", iM36651b);
        editorEdit.apply();
        c9094g7.mo36321a().m37011w().m36912b("Setting storage consent(FE)", c9255q8);
        this.f33406q = j10;
        if (c9094g9.m36315J().m36863D()) {
            c9094g9.m36315J().m36884Z(z10);
        } else {
            c9094g9.m36315J().m36883Y(z10);
        }
        if (z11) {
            c9094g9.m36315J().m36899q(new AtomicReference());
        }
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m36687Z(boolean z10) {
        this.f33398i = false;
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ int m36688a0() {
        return this.f33399j;
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m36689b0(int i10) {
        this.f33399j = i10;
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ AbstractC9342w m36690c0() {
        return this.f33409t;
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ int m36691d0(Throwable th2) {
        String message = th2.getMessage();
        this.f33403n = false;
        if (message == null) {
            return 2;
        }
        if (!(th2 instanceof IllegalStateException) && !message.contains("garbage collected") && !th2.getClass().getSimpleName().equals("ServiceUnavailableException")) {
            return (!(th2 instanceof SecurityException) || message.endsWith("READ_DEVICE_CONFIG")) ? 2 : 3;
        }
        if (!message.contains("Background")) {
            return 1;
        }
        this.f33403n = true;
        return 1;
    }

    /* JADX INFO: renamed from: e0 */
    public final EnumC9385ya m36692e0(final zzom zzomVar) {
        try {
            URL url = new URI(zzomVar.f9511h).toURL();
            final AtomicReference atomicReference = new AtomicReference();
            String strM36434s = this.f33067a.m36317L().m36434s();
            C9094g7 c9094g7 = this.f33067a;
            C9316u5 c9316u5M37011w = c9094g7.mo36321a().m37011w();
            Long lValueOf = Long.valueOf(zzomVar.f9509f);
            c9316u5M37011w.m36914d("[sgtm] Uploading data from app. row_id, url, uncompressed size", lValueOf, zzomVar.f9511h, Integer.valueOf(zzomVar.f9510g.length));
            if (!TextUtils.isEmpty(zzomVar.f9515l)) {
                c9094g7.mo36321a().m37011w().m36913c("[sgtm] Uploading data from app. row_id", lValueOf, zzomVar.f9515l);
            }
            HashMap map = new HashMap();
            Bundle bundle = zzomVar.f9512i;
            for (String str : bundle.keySet()) {
                String string = bundle.getString(str);
                if (!TextUtils.isEmpty(string)) {
                    map.put(str, string);
                }
            }
            C9337va c9337vaM36311F = c9094g7.m36311F();
            byte[] bArr = zzomVar.f9510g;
            InterfaceC9289sa interfaceC9289sa = new InterfaceC9289sa() { // from class: nb.ea
                /* JADX WARN: Code duplicated, block: B:10:0x0016  */
                /* JADX WARN: Code duplicated, block: B:11:0x002e A[PHI: r8
                  0x002e: PHI (r8v7 int) = (r8v1 int), (r8v0 int) binds: [B:9:0x0014, B:7:0x0011] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Code duplicated, block: B:13:0x0064  */
                /* JADX WARN: Code duplicated, block: B:14:0x0067  */
                @Override // p306nb.InterfaceC9289sa
                /* JADX INFO: renamed from: a */
                public final /* synthetic */ void mo36292a(String str2, int i10, Throwable th2, byte[] bArr2, Map map2) {
                    EnumC9385ya enumC9385ya;
                    C9257qa c9257qa = this.f32889a;
                    c9257qa.mo36088h();
                    zzom zzomVar2 = zzomVar;
                    if (i10 == 200 || i10 == 204) {
                        if (th2 == null) {
                            c9257qa.f33067a.mo36321a().m37011w().m36912b("[sgtm] Upload succeeded for row_id", Long.valueOf(zzomVar2.f9509f));
                            enumC9385ya = EnumC9385ya.SUCCESS;
                        } else {
                            c9257qa.f33067a.mo36321a().m37006r().m36914d("[sgtm] Upload failed for row_id. response, exception", Long.valueOf(zzomVar2.f9509f), Integer.valueOf(i10), th2);
                            if (Arrays.asList(((String) C9395z4.f33809u.m37079b(null)).split(",")).contains(String.valueOf(i10))) {
                                enumC9385ya = EnumC9385ya.BACKOFF;
                            } else {
                                enumC9385ya = EnumC9385ya.FAILURE;
                            }
                        }
                    } else if (i10 == 304) {
                        i10 = 304;
                        if (th2 == null) {
                            c9257qa.f33067a.mo36321a().m37011w().m36912b("[sgtm] Upload succeeded for row_id", Long.valueOf(zzomVar2.f9509f));
                            enumC9385ya = EnumC9385ya.SUCCESS;
                        } else {
                            c9257qa.f33067a.mo36321a().m37006r().m36914d("[sgtm] Upload failed for row_id. response, exception", Long.valueOf(zzomVar2.f9509f), Integer.valueOf(i10), th2);
                            if (Arrays.asList(((String) C9395z4.f33809u.m37079b(null)).split(",")).contains(String.valueOf(i10))) {
                                enumC9385ya = EnumC9385ya.BACKOFF;
                            } else {
                                enumC9385ya = EnumC9385ya.FAILURE;
                            }
                        }
                    } else {
                        c9257qa.f33067a.mo36321a().m37006r().m36914d("[sgtm] Upload failed for row_id. response, exception", Long.valueOf(zzomVar2.f9509f), Integer.valueOf(i10), th2);
                        if (Arrays.asList(((String) C9395z4.f33809u.m37079b(null)).split(",")).contains(String.valueOf(i10))) {
                            enumC9385ya = EnumC9385ya.BACKOFF;
                        } else {
                            enumC9385ya = EnumC9385ya.FAILURE;
                        }
                    }
                    AtomicReference atomicReference2 = atomicReference;
                    C9307tc c9307tcM36315J = c9257qa.f33067a.m36315J();
                    long j10 = zzomVar2.f9509f;
                    c9307tcM36315J.m36895k0(new zzaf(j10, enumC9385ya.zza(), zzomVar2.f9514k));
                    c9257qa.f33067a.mo36321a().m37011w().m36913c("[sgtm] Updated status for row_id", Long.valueOf(j10), enumC9385ya);
                    synchronized (atomicReference2) {
                        atomicReference2.set(enumC9385ya);
                        atomicReference2.notifyAll();
                    }
                }
            };
            c9337vaM36311F.m36455l();
            C8953m.m36047l(url);
            C8953m.m36047l(bArr);
            C8953m.m36047l(interfaceC9289sa);
            c9337vaM36311F.f33067a.mo36322b().m36266w(new RunnableC9321ua(c9337vaM36311F, strM36434s, url, bArr, map, interfaceC9289sa));
            try {
                C9094g7 c9094g8 = c9094g7.m36308C().f33067a;
                long jMo44175a = c9094g8.mo36325e().mo44175a();
                long j10 = jMo44175a + RealWebSocket.CANCEL_AFTER_CLOSE_MILLIS;
                synchronized (atomicReference) {
                    for (long jMo44175a2 = RealWebSocket.CANCEL_AFTER_CLOSE_MILLIS; atomicReference.get() == null && jMo44175a2 > 0; jMo44175a2 = j10 - c9094g8.mo36325e().mo44175a()) {
                        try {
                            atomicReference.wait(jMo44175a2);
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            } catch (InterruptedException unused) {
                this.f33067a.mo36321a().m37006r().m36911a("[sgtm] Interrupted waiting for uploading batch");
            }
            return atomicReference.get() == null ? EnumC9385ya.UNKNOWN : (EnumC9385ya) atomicReference.get();
        } catch (MalformedURLException | URISyntaxException e10) {
            this.f33067a.mo36321a().m37003o().m36914d("[sgtm] Bad upload url for row_id", zzomVar.f9511h, Long.valueOf(zzomVar.f9509f), e10);
            return EnumC9385ya.FAILURE;
        }
    }

    /* JADX INFO: renamed from: f0 */
    public final void m36693f0(Boolean bool, boolean z10) {
        mo36088h();
        m36121j();
        C9094g7 c9094g7 = this.f33067a;
        c9094g7.mo36321a().m37010v().m36912b("Setting app measurement enabled (FE)", bool);
        c9094g7.m36339x().m36446s(bool);
        if (z10) {
            C9157k6 c9157k6M36339x = c9094g7.m36339x();
            C9094g7 c9094g8 = c9157k6M36339x.f33067a;
            c9157k6M36339x.mo36088h();
            SharedPreferences.Editor editorEdit = c9157k6M36339x.m36443p().edit();
            if (bool != null) {
                editorEdit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                editorEdit.remove("measurement_enabled_from_api");
            }
            editorEdit.apply();
        }
        if (this.f33067a.m36330j() || !(bool == null || bool.booleanValue())) {
            m36686Y();
        }
    }

    /* JADX DEBUG: Method merged with bridge method: Y()V */
    /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
    public final void m36686Y() {
        C9257qa c9257qa;
        mo36088h();
        C9094g7 c9094g7 = this.f33067a;
        String strM36369a = c9094g7.m36339x().f33126n.m36369a();
        if (strM36369a == null) {
            c9257qa = this;
        } else if ("unset".equals(strM36369a)) {
            c9257qa = this;
            c9257qa.m36663B(Payload.TYPE_APP, "_npa", null, c9094g7.mo36325e().mo44175a());
        } else {
            m36663B(Payload.TYPE_APP, "_npa", Long.valueOf(true != "true".equals(strM36369a) ? 0L : 1L), c9094g7.mo36325e().mo44175a());
            c9257qa = this;
        }
        if (!c9257qa.f33067a.m36327g() || !c9257qa.f33408s) {
            c9094g7.mo36321a().m37010v().m36911a("Updating Scion state (FE)");
            c9257qa.f33067a.m36315J().m36882X();
        } else {
            c9094g7.mo36321a().m37010v().m36911a("Recording app launch after enabling measurement for the first time (FE)");
            m36669H();
            c9257qa.f33067a.m36341z().f33190e.m36458a();
            c9094g7.mo36322b().m36263t(new RunnableC9063e9(this));
        }
    }

    /* JADX INFO: renamed from: h0 */
    public final void m36695h0() {
        C9094g7 c9094g7 = this.f33067a;
        if (!(c9094g7.mo36324d().getApplicationContext() instanceof Application) || this.f33392c == null) {
            return;
        }
        ((Application) c9094g7.mo36324d().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f33392c);
    }

    /* JADX INFO: renamed from: i0 */
    public final Boolean m36696i0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) this.f33067a.mo36322b().m36264u(atomicReference, 15000L, "boolean test flag value", new RunnableC9160k9(this, atomicReference));
    }

    /* JADX INFO: renamed from: j0 */
    public final String m36697j0() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) this.f33067a.mo36322b().m36264u(atomicReference, 15000L, "String test flag value", new RunnableC9304t9(this, atomicReference));
    }

    /* JADX INFO: renamed from: k0 */
    public final Long m36698k0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) this.f33067a.mo36322b().m36264u(atomicReference, 15000L, "long test flag value", new RunnableC9320u9(this, atomicReference));
    }

    /* JADX INFO: renamed from: l0 */
    public final Integer m36699l0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) this.f33067a.mo36322b().m36264u(atomicReference, 15000L, "int test flag value", new RunnableC9336v9(this, atomicReference));
    }

    @Override // p306nb.AbstractC9008b5
    /* JADX INFO: renamed from: m */
    public final boolean mo36124m() {
        return false;
    }

    /* JADX INFO: renamed from: m0 */
    public final Double m36700m0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) this.f33067a.mo36322b().m36264u(atomicReference, 15000L, "double test flag value", new RunnableC9352w9(this, atomicReference));
    }

    /* JADX INFO: renamed from: n0 */
    public final void m36701n0(Boolean bool) {
        m36121j();
        this.f33067a.mo36322b().m36263t(new RunnableC9368x9(this, bool));
    }

    /* JADX INFO: renamed from: o */
    public final void m36702o(C9255q8 c9255q8) {
        mo36088h();
        boolean z10 = (c9255q8.m36656o(EnumC9239p8.ANALYTICS_STORAGE) && c9255q8.m36656o(EnumC9239p8.AD_STORAGE)) || this.f33067a.m36315J().m36862C();
        C9094g7 c9094g7 = this.f33067a;
        if (z10 != c9094g7.m36330j()) {
            c9094g7.m36329i(z10);
            C9157k6 c9157k6M36339x = this.f33067a.m36339x();
            C9094g7 c9094g8 = c9157k6M36339x.f33067a;
            c9157k6M36339x.mo36088h();
            Boolean boolValueOf = c9157k6M36339x.m36443p().contains("measurement_enabled_from_api") ? Boolean.valueOf(c9157k6M36339x.m36443p().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z10 || boolValueOf == null || boolValueOf.booleanValue()) {
                m36693f0(Boolean.valueOf(z10), false);
            }
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final void m36703o0(Bundle bundle, int i10, long j10) {
        Object obj;
        String string;
        m36121j();
        C9255q8 c9255q8 = C9255q8.f33384c;
        EnumC9239p8[] enumC9239p8ArrM36599b = EnumC9223o8.STORAGE.m36599b();
        int length = enumC9239p8ArrM36599b.length;
        int i11 = 0;
        while (true) {
            obj = null;
            if (i11 >= length) {
                break;
            }
            String str = enumC9239p8ArrM36599b[i11].f33347a;
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
            C9094g7 c9094g7 = this.f33067a;
            c9094g7.mo36321a().m37008t().m36912b("Ignoring invalid consent setting", obj);
            c9094g7.mo36321a().m37008t().m36911a("Valid consent values are 'granted', 'denied'");
        }
        boolean zM36259p = this.f33067a.mo36322b().m36259p();
        C9255q8 c9255q8M36643e = C9255q8.m36643e(bundle, i10);
        if (c9255q8M36643e.m36652c()) {
            m36707q0(c9255q8M36643e, zM36259p);
        }
        C9358x c9358xM37017h = C9358x.m37017h(bundle, i10);
        if (c9358xM37017h.m37021d()) {
            m36705p0(c9358xM37017h, zM36259p);
        }
        Boolean boolM37018i = C9358x.m37018i(bundle);
        if (boolM37018i != null) {
            String str2 = i10 == -30 ? "tcf" : Payload.TYPE_APP;
            if (zM36259p) {
                m36663B(str2, "allow_personalized_ads", boolM37018i.toString(), j10);
            } else {
                m36723z(str2, "allow_personalized_ads", boolM37018i.toString(), false, j10);
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m36704p(String str, String str2, Bundle bundle) {
        m36706q(str, str2, bundle, true, true, this.f33067a.mo36325e().mo44175a());
    }

    /* JADX INFO: renamed from: p0 */
    public final void m36705p0(C9358x c9358x, boolean z10) {
        RunnableC9384y9 runnableC9384y9 = new RunnableC9384y9(this, c9358x);
        if (!z10) {
            this.f33067a.mo36322b().m36263t(runnableC9384y9);
        } else {
            mo36088h();
            runnableC9384y9.run();
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m36706q(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        Bundle bundle2 = bundle;
        if (Objects.equals(str2, "screen_view")) {
            this.f33067a.m36314I().m36382s(bundle2, j10);
            return;
        }
        boolean z12 = true;
        if (z11 && this.f33393d != null && !C9341ve.m36926N(str2)) {
            z12 = false;
        }
        boolean z13 = z12;
        if (str == null) {
            str = Payload.TYPE_APP;
        }
        m36720x(str, str2, j10, bundle2, z11, z13, z10, null);
    }

    /* JADX DEBUG: Duplicate block (B:56:0x00d0) to fix multi-entry loop: BACK_EDGE: B:56:0x00d0 -> B:53:0x00cd */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:56:0x00d0
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1478)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* JADX INFO: renamed from: q0 */
    public final void m36707q0(p306nb.C9255q8 r10, boolean r11) {
        /*
            r9 = this;
            r9.m36121j()
            int r0 = r10.m36651b()
            r1 = -10
            if (r0 == r1) goto L2a
            nb.n8 r2 = r10.m36657p()
            nb.n8 r3 = p306nb.EnumC9207n8.UNINITIALIZED
            if (r2 != r3) goto L2a
            nb.n8 r2 = r10.m36658q()
            if (r2 == r3) goto L1a
            goto L2a
        L1a:
            nb.g7 r10 = r9.f33067a
            nb.w5 r10 = r10.mo36321a()
            nb.u5 r10 = r10.m37008t()
            java.lang.String r11 = "Ignoring empty consent settings"
            r10.m36911a(r11)
            return
        L2a:
            java.lang.Object r2 = r9.f33397h
            monitor-enter(r2)
            nb.q8 r3 = r9.f33404o     // Catch: java.lang.Throwable -> Lcb
            int r3 = r3.m36651b()     // Catch: java.lang.Throwable -> Lcb
            boolean r3 = p306nb.C9255q8.m36650u(r0, r3)     // Catch: java.lang.Throwable -> Lcb
            r4 = 0
            if (r3 == 0) goto L64
            nb.q8 r3 = r9.f33404o     // Catch: java.lang.Throwable -> L53
            boolean r3 = r10.m36659r(r3)     // Catch: java.lang.Throwable -> L53
            nb.p8 r5 = p306nb.EnumC9239p8.ANALYTICS_STORAGE     // Catch: java.lang.Throwable -> L53
            boolean r6 = r10.m36656o(r5)     // Catch: java.lang.Throwable -> L53
            r7 = 1
            if (r6 == 0) goto L58
            nb.q8 r6 = r9.f33404o     // Catch: java.lang.Throwable -> L53
            boolean r5 = r6.m36656o(r5)     // Catch: java.lang.Throwable -> L53
            if (r5 != 0) goto L58
            r4 = r7
            goto L58
        L53:
            r0 = move-exception
            r10 = r0
            r4 = r9
            goto Lce
        L58:
            nb.q8 r5 = r9.f33404o     // Catch: java.lang.Throwable -> L53
            nb.q8 r10 = r10.m36661t(r5)     // Catch: java.lang.Throwable -> L53
            r9.f33404o = r10     // Catch: java.lang.Throwable -> L53
            r8 = r4
            r4 = r7
        L62:
            r5 = r10
            goto L67
        L64:
            r3 = r4
            r8 = r3
            goto L62
        L67:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lcb
            if (r4 != 0) goto L7a
            nb.g7 r10 = r9.f33067a
            nb.w5 r10 = r10.mo36321a()
            nb.u5 r10 = r10.m37009u()
            java.lang.String r11 = "Ignoring lower-priority consent settings, proposed settings"
            r10.m36912b(r11, r5)
            return
        L7a:
            java.util.concurrent.atomic.AtomicLong r10 = r9.f33405p
            long r6 = r10.getAndIncrement()
            if (r3 == 0) goto La1
            java.util.concurrent.atomic.AtomicReference r10 = r9.f33396g
            r0 = 0
            r10.set(r0)
            nb.z9 r3 = new nb.z9
            r4 = r9
            r3.<init>(r4, r5, r6, r8)
            if (r11 == 0) goto L97
            r9.mo36088h()
            r3.run()
            return
        L97:
            nb.g7 r10 = r4.f33067a
            nb.c7 r10 = r10.mo36322b()
            r10.m36265v(r3)
            return
        La1:
            r4 = r9
            nb.aa r3 = new nb.aa
            r3.<init>(r4, r5, r6, r8)
            if (r11 == 0) goto Lb0
            r9.mo36088h()
            r3.run()
            return
        Lb0:
            r10 = 30
            if (r0 == r10) goto Lc1
            if (r0 != r1) goto Lb7
            goto Lc1
        Lb7:
            nb.g7 r10 = r4.f33067a
            nb.c7 r10 = r10.mo36322b()
            r10.m36263t(r3)
            return
        Lc1:
            nb.g7 r10 = r4.f33067a
            nb.c7 r10 = r10.mo36322b()
            r10.m36265v(r3)
            return
        Lcb:
            r0 = move-exception
            r4 = r9
        Lcd:
            r10 = r0
        Lce:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld0
            throw r10
        Ld0:
            r0 = move-exception
            goto Lcd
        */
        throw new UnsupportedOperationException("Method not decompiled: p306nb.C9257qa.m36707q0(nb.q8, boolean):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v15, resolved type: E */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r */
    public final void m36708r() {
        C9196md c9196md;
        C9196md c9196md2;
        EnumC2247p9 enumC2247p9;
        mo36088h();
        C9094g7 c9094g7 = this.f33067a;
        c9094g7.mo36321a().m37010v().m36911a("Handle tcf update.");
        SharedPreferences sharedPreferencesM36444q = c9094g7.m36339x().m36444q();
        HashMap map = new HashMap();
        C9379y4 c9379y4 = C9395z4.f33759a1;
        if (((Boolean) c9379y4.m37079b(null)).booleanValue()) {
            AbstractC6796t abstractC6796t = C9228od.f33311a;
            EnumC2229o9 enumC2229o9 = EnumC2229o9.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE;
            EnumC9212nd enumC9212nd = EnumC9212nd.CONSENT;
            Map.Entry entryM36627a = C9241pa.m36627a(enumC2229o9, enumC9212nd);
            int i10 = 2;
            EnumC2229o9 enumC2229o10 = EnumC2229o9.IAB_TCF_PURPOSE_SELECT_BASIC_ADS;
            int i11 = 1;
            EnumC9212nd enumC9212nd2 = EnumC9212nd.FLEXIBLE_LEGITIMATE_INTEREST;
            AbstractC6798u abstractC6798uM29122o = AbstractC6798u.m29122o(entryM36627a, C9241pa.m36627a(enumC2229o10, enumC9212nd2), C9241pa.m36627a(EnumC2229o9.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE, enumC9212nd), C9241pa.m36627a(EnumC2229o9.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS, enumC9212nd), C9241pa.m36627a(EnumC2229o9.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE, enumC9212nd2), C9241pa.m36627a(EnumC2229o9.IAB_TCF_PURPOSE_APPLY_MARKET_RESEARCH_TO_GENERATE_AUDIENCE_INSIGHTS, enumC9212nd2), C9241pa.m36627a(EnumC2229o9.IAB_TCF_PURPOSE_DEVELOP_AND_IMPROVE_PRODUCTS, enumC9212nd2));
            AbstractC6802w abstractC6802wM29141u = AbstractC6802w.m29141u("CH");
            char[] cArr = new char[5];
            boolean zContains = sharedPreferencesM36444q.contains("IABTCF_TCString");
            int iM36601b = C9228od.m36601b(sharedPreferencesM36444q, "IABTCF_CmpSdkID");
            int iM36601b2 = C9228od.m36601b(sharedPreferencesM36444q, "IABTCF_PolicyVersion");
            int iM36601b3 = C9228od.m36601b(sharedPreferencesM36444q, "IABTCF_gdprApplies");
            int iM36601b4 = C9228od.m36601b(sharedPreferencesM36444q, "IABTCF_PurposeOneTreatment");
            int iM36601b5 = C9228od.m36601b(sharedPreferencesM36444q, "IABTCF_EnableAdvertiserConsentMode");
            String strM36600a = C9228od.m36600a(sharedPreferencesM36444q, "IABTCF_PublisherCC");
            AbstractC6798u.a aVarM29114a = AbstractC6798u.m29114a();
            AbstractC6807y0 it = abstractC6798uM29122o.keySet().iterator();
            while (it.hasNext()) {
                EnumC2229o9 enumC2229o11 = (EnumC2229o9) it.next();
                int iZza = enumC2229o11.zza();
                StringBuilder sb2 = new StringBuilder(String.valueOf(iZza).length() + 28);
                sb2.append("IABTCF_PublisherRestrictions");
                sb2.append(iZza);
                String strM36600a2 = C9228od.m36600a(sharedPreferencesM36444q, sb2.toString());
                if (TextUtils.isEmpty(strM36600a2) || strM36600a2.length() < 755) {
                    enumC2247p9 = EnumC2247p9.PURPOSE_RESTRICTION_UNDEFINED;
                } else {
                    int iDigit = Character.digit(strM36600a2.charAt(754), 10);
                    if (iDigit < 0 || iDigit > EnumC2247p9.values().length || iDigit == 0) {
                        enumC2247p9 = EnumC2247p9.PURPOSE_RESTRICTION_NOT_ALLOWED;
                    } else if (iDigit != i11) {
                        enumC2247p9 = iDigit != i10 ? EnumC2247p9.PURPOSE_RESTRICTION_UNDEFINED : EnumC2247p9.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST;
                    } else {
                        enumC2247p9 = EnumC2247p9.PURPOSE_RESTRICTION_REQUIRE_CONSENT;
                    }
                }
                aVarM29114a.mo29043f(enumC2229o11, enumC2247p9);
                i10 = 2;
                i11 = 1;
            }
            AbstractC6798u abstractC6798uMo29042c = aVarM29114a.mo29042c();
            String strM36600a3 = C9228od.m36600a(sharedPreferencesM36444q, "IABTCF_PurposeConsents");
            String strM36600a4 = C9228od.m36600a(sharedPreferencesM36444q, "IABTCF_VendorConsents");
            boolean z10 = !TextUtils.isEmpty(strM36600a4) && strM36600a4.length() >= 755 && strM36600a4.charAt(754) == '1';
            String strM36600a5 = C9228od.m36600a(sharedPreferencesM36444q, "IABTCF_PurposeLegitimateInterests");
            String strM36600a6 = C9228od.m36600a(sharedPreferencesM36444q, "IABTCF_VendorLegitimateInterests");
            boolean z11 = !TextUtils.isEmpty(strM36600a6) && strM36600a6.length() >= 755 && strM36600a6.charAt(754) == '1';
            cArr[0] = '2';
            c9196md = new C9196md(C9228od.m36603d(abstractC6798uM29122o, abstractC6798uMo29042c, abstractC6802wM29141u, cArr, iM36601b, iM36601b5, iM36601b3, iM36601b2, iM36601b4, strM36600a, strM36600a3, strM36600a5, z10, z11, zContains));
        } else {
            String strM36600a7 = C9228od.m36600a(sharedPreferencesM36444q, "IABTCF_VendorConsents");
            if (!"".equals(strM36600a7) && strM36600a7.length() > 754) {
                map.put("GoogleConsent", String.valueOf(strM36600a7.charAt(754)));
            }
            int iM36601b6 = C9228od.m36601b(sharedPreferencesM36444q, "IABTCF_gdprApplies");
            if (iM36601b6 != -1) {
                map.put("gdprApplies", String.valueOf(iM36601b6));
            }
            int iM36601b7 = C9228od.m36601b(sharedPreferencesM36444q, "IABTCF_EnableAdvertiserConsentMode");
            if (iM36601b7 != -1) {
                map.put("EnableAdvertiserConsentMode", String.valueOf(iM36601b7));
            }
            int iM36601b8 = C9228od.m36601b(sharedPreferencesM36444q, "IABTCF_PolicyVersion");
            if (iM36601b8 != -1) {
                map.put("PolicyVersion", String.valueOf(iM36601b8));
            }
            String strM36600a8 = C9228od.m36600a(sharedPreferencesM36444q, "IABTCF_PurposeConsents");
            if (!"".equals(strM36600a8)) {
                map.put("PurposeConsents", strM36600a8);
            }
            int iM36601b9 = C9228od.m36601b(sharedPreferencesM36444q, "IABTCF_CmpSdkID");
            if (iM36601b9 != -1) {
                map.put("CmpSdkID", String.valueOf(iM36601b9));
            }
            c9196md = new C9196md(map);
        }
        c9094g7.mo36321a().m37011w().m36912b("Tcf preferences read", c9196md);
        if (!c9094g7.m36338w().m36406H(null, c9379y4)) {
            if (c9094g7.m36339x().m36451x(c9196md)) {
                Bundle bundleM36482b = c9196md.m36482b();
                c9094g7.mo36321a().m37011w().m36912b("Consent generated from Tcf", bundleM36482b);
                if (bundleM36482b != Bundle.EMPTY) {
                    m36703o0(bundleM36482b, -30, c9094g7.mo36325e().mo44175a());
                }
                Bundle bundle = new Bundle();
                bundle.putString("_tcfd", c9196md.m36485e());
                m36712t("auto", "_tcf", bundle);
                return;
            }
            return;
        }
        C9157k6 c9157k6M36339x = c9094g7.m36339x();
        c9157k6M36339x.mo36088h();
        String string = c9157k6M36339x.m36443p().getString("stored_tcf_param", "");
        HashMap map2 = new HashMap();
        if (TextUtils.isEmpty(string)) {
            c9196md2 = new C9196md(map2);
        } else {
            for (String str : string.split(";")) {
                String[] strArrSplit = str.split("=");
                if (strArrSplit.length >= 2 && C9228od.f33311a.contains(strArrSplit[0])) {
                    map2.put(strArrSplit[0], strArrSplit[1]);
                }
            }
            c9196md2 = new C9196md(map2);
        }
        if (c9094g7.m36339x().m36451x(c9196md)) {
            Bundle bundleM36482b2 = c9196md.m36482b();
            c9094g7.mo36321a().m37011w().m36912b("Consent generated from Tcf", bundleM36482b2);
            if (bundleM36482b2 != Bundle.EMPTY) {
                m36703o0(bundleM36482b2, -30, c9094g7.mo36325e().mo44175a());
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("_tcfm", c9196md.m36484d(c9196md2));
            bundle2.putString("_tcfd2", c9196md.m36483c());
            bundle2.putString("_tcfd", c9196md.m36485e());
            m36712t("auto", "_tcf", bundle2);
        }
    }

    /* JADX INFO: renamed from: r0 */
    public final void m36709r0(Runnable runnable) {
        m36121j();
        C9094g7 c9094g7 = this.f33067a;
        if (c9094g7.mo36322b().m36259p()) {
            c9094g7.mo36321a().m37003o().m36911a("Cannot retrieve and upload batches from analytics worker thread");
            return;
        }
        if (c9094g7.mo36322b().m36260q()) {
            c9094g7.mo36321a().m37003o().m36911a("Cannot retrieve and upload batches from analytics network thread");
            return;
        }
        c9094g7.mo36323c();
        if (C9070f.m36294a()) {
            c9094g7.mo36321a().m37003o().m36911a("Cannot retrieve and upload batches from main thread");
            return;
        }
        c9094g7.mo36321a().m37011w().m36911a("[sgtm] Started client-side batch upload work.");
        boolean z10 = false;
        int size = 0;
        int i10 = 0;
        while (!z10) {
            c9094g7.mo36321a().m37011w().m36911a("[sgtm] Getting upload batches from service (FE)");
            final AtomicReference atomicReference = new AtomicReference();
            c9094g7.mo36322b().m36264u(atomicReference, 10000L, "[sgtm] Getting upload batches", new Runnable() { // from class: nb.oa
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f33306a.f33067a.m36315J().m36894j0(atomicReference, zzoo.m11884a(EnumC9401za.SGTM_CLIENT));
                }
            });
            zzoq zzoqVar = (zzoq) atomicReference.get();
            if (zzoqVar == null) {
                break;
            }
            List list = zzoqVar.f9517f;
            if (!list.isEmpty()) {
                c9094g7.mo36321a().m37011w().m36912b("[sgtm] Retrieved upload batches. count", Integer.valueOf(list.size()));
                size += list.size();
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z10 = false;
                        break;
                    }
                    EnumC9385ya enumC9385yaM36692e0 = m36692e0((zzom) it.next());
                    if (enumC9385yaM36692e0 == EnumC9385ya.SUCCESS) {
                        i10++;
                    } else if (enumC9385yaM36692e0 == EnumC9385ya.BACKOFF) {
                        z10 = true;
                        break;
                    }
                }
            } else {
                break;
            }
        }
        c9094g7.mo36321a().m37011w().m36913c("[sgtm] Completed client-side batch upload work. total, success", Integer.valueOf(size), Integer.valueOf(i10));
        runnable.run();
    }

    /* JADX INFO: renamed from: s */
    public final void m36710s() {
        mo36088h();
        C9094g7 c9094g7 = this.f33067a;
        c9094g7.mo36321a().m37010v().m36911a("Register tcfPrefChangeListener.");
        if (this.f33410u == null) {
            this.f33411v = new C9112h9(this, this.f33067a);
            this.f33410u = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: nb.ka
                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                public final /* synthetic */ void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                    this.f33147a.m36681T(sharedPreferences, str);
                }
            };
        }
        c9094g7.m36339x().m36444q().registerOnSharedPreferenceChangeListener(this.f33410u);
    }

    /* JADX INFO: renamed from: s0 */
    public final void m36711s0(long j10) {
        mo36088h();
        if (this.f33401l == null) {
            this.f33401l = new C9399z8(this, this.f33067a);
        }
        this.f33401l.m36990b(j10);
    }

    /* JADX INFO: renamed from: t */
    public final void m36712t(String str, String str2, Bundle bundle) {
        mo36088h();
        m36714u(str, str2, this.f33067a.mo36325e().mo44175a(), bundle);
    }

    /* JADX INFO: renamed from: t0 */
    public final void m36713t0() {
        mo36088h();
        AbstractC9342w abstractC9342w = this.f33401l;
        if (abstractC9342w != null) {
            abstractC9342w.m36992d();
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m36714u(String str, String str2, long j10, Bundle bundle) {
        mo36088h();
        boolean z10 = true;
        if (this.f33393d != null && !C9341ve.m36926N(str2)) {
            z10 = false;
        }
        m36716v(str, str2, j10, bundle, true, z10, true, null);
    }

    /* JADX INFO: renamed from: u0 */
    public final void m36715u0() {
        C2361vf.m10862a();
        C9094g7 c9094g7 = this.f33067a;
        if (c9094g7.m36338w().m36406H(null, C9395z4.f33740R0)) {
            if (c9094g7.mo36322b().m36259p()) {
                c9094g7.mo36321a().m37003o().m36911a("Cannot get trigger URIs from analytics worker thread");
                return;
            }
            c9094g7.mo36323c();
            if (C9070f.m36294a()) {
                c9094g7.mo36321a().m37003o().m36911a("Cannot get trigger URIs from main thread");
                return;
            }
            m36121j();
            c9094g7.mo36321a().m37011w().m36911a("Getting trigger URIs (FE)");
            final AtomicReference atomicReference = new AtomicReference();
            c9094g7.mo36322b().m36264u(atomicReference, 10000L, "get trigger URIs", new Runnable() { // from class: nb.ga
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    C9257qa c9257qa = this.f32982a;
                    c9257qa.f33067a.m36315J().m36893i0(atomicReference, c9257qa.f33067a.m36339x().f33127o.m36298a());
                }
            });
            final List list = (List) atomicReference.get();
            if (list == null) {
                c9094g7.mo36321a().m37005q().m36911a("Timed out waiting for get trigger URIs");
            } else {
                c9094g7.mo36322b().m36263t(new Runnable() { // from class: nb.ha
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        C9257qa c9257qa = this.f33010a;
                        c9257qa.mo36088h();
                        if (Build.VERSION.SDK_INT < 30) {
                            return;
                        }
                        List<zzoh> list2 = list;
                        SparseArray sparseArrayM36445r = c9257qa.f33067a.m36339x().m36445r();
                        for (zzoh zzohVar : list2) {
                            int i10 = zzohVar.f9508h;
                            if (!sparseArrayM36445r.contains(i10) || ((Long) sparseArrayM36445r.get(i10)).longValue() < zzohVar.f9507g) {
                                c9257qa.m36719w0().add(zzohVar);
                            }
                        }
                        c9257qa.m36721x0();
                    }
                });
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v16, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: v */
    public final void m36716v(String str, String str2, long j10, Bundle bundle, boolean z10, boolean z11, boolean z12, String str3) {
        boolean z13;
        int i10;
        C9094g7 c9094g7;
        long j11;
        long j12;
        String str4;
        long j13;
        Bundle[] bundleArr;
        String str5 = str;
        C8953m.m36041f(str5);
        C8953m.m36047l(bundle);
        mo36088h();
        m36121j();
        C9094g7 c9094g8 = this.f33067a;
        if (!c9094g8.m36327g()) {
            this.f33067a.mo36321a().m37010v().m36911a("Event not sent since app measurement is disabled");
            return;
        }
        List listM36438w = this.f33067a.m36317L().m36438w();
        if (listM36438w != null && !listM36438w.contains(str2)) {
            this.f33067a.mo36321a().m37010v().m36913c("Dropping non-safelisted event. event name, origin", str2, str5);
            return;
        }
        if (!this.f33395f) {
            this.f33395f = true;
            try {
                try {
                    (!c9094g8.m36312G() ? Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, this.f33067a.mo36324d().getClassLoader()) : Class.forName("com.google.android.gms.tagmanager.TagManagerService")).getDeclaredMethod("initialize", Context.class).invoke(null, this.f33067a.mo36324d());
                } catch (Exception e10) {
                    this.f33067a.mo36321a().m37006r().m36912b("Failed to invoke Tag Manager's initialize() method", e10);
                }
            } catch (ClassNotFoundException unused) {
                this.f33067a.mo36321a().m37009u().m36911a("Tag Manager is not found and thus will not be used");
            }
        }
        C9094g7 c9094g9 = this.f33067a;
        if (!c9094g9.m36338w().m36406H(null, C9395z4.f33777g1) && "_cmp".equals(str2) && bundle.containsKey("gclid")) {
            c9094g9.mo36323c();
            m36663B("auto", "_lgclid", bundle.getString("gclid"), c9094g9.mo36325e().mo44175a());
        }
        C9257qa c9257qa = this;
        c9094g9.mo36323c();
        if (z10 && C9341ve.m36928U(str2)) {
            c9094g9.m36308C().m36982w(bundle, c9094g9.m36339x().f33138z.m36298a());
        }
        if (!z12) {
            c9094g9.mo36323c();
            if (!"_iap".equals(str2)) {
                C9094g7 c9094g10 = c9257qa.f33067a;
                C9341ve c9341veM36308C = c9094g10.m36308C();
                int i11 = 2;
                if (c9341veM36308C.m36977t0(NotificationCompat.CATEGORY_EVENT, str2)) {
                    if (c9341veM36308C.m36981v0(NotificationCompat.CATEGORY_EVENT, C9271r8.f33433a, C9271r8.f33434b, str2)) {
                        c9341veM36308C.f33067a.m36338w();
                        if (c9341veM36308C.m36983w0(NotificationCompat.CATEGORY_EVENT, 40, str2)) {
                            i11 = 0;
                        }
                    } else {
                        i11 = 13;
                    }
                }
                if (i11 != 0) {
                    c9094g9.mo36321a().m37005q().m36912b("Invalid public event name. Event will not be logged (FE)", c9094g9.m36309D().m36620a(str2));
                    C9341ve c9341veM36308C2 = c9094g10.m36308C();
                    c9094g10.m36338w();
                    c9094g10.m36308C().m36936B(c9257qa.f33412w, null, i11, "_ev", c9341veM36308C2.m36971q(str2, 40, true), str2 != null ? str2.length() : 0);
                    return;
                }
            }
        }
        c9094g9.mo36323c();
        C9094g7 c9094g11 = c9257qa.f33067a;
        C9014bb c9014bbM36380q = c9094g11.m36314I().m36380q(false);
        if (c9014bbM36380q != null && !bundle.containsKey("_sc")) {
            c9014bbM36380q.f32727d = true;
        }
        C9341ve.m36931k0(c9014bbM36380q, bundle, z10 && !z12);
        boolean zEquals = "am".equals(str5);
        boolean zM36926N = C9341ve.m36926N(str2);
        if (!z10 || c9257qa.f33393d == null || zM36926N) {
            z13 = zEquals;
        } else {
            if (!zEquals) {
                c9094g9.mo36321a().m37010v().m36913c("Passing event to registered event handler (FE)", c9094g9.m36309D().m36620a(str2), c9094g9.m36309D().m36624e(bundle));
                C8953m.m36047l(c9257qa.f33393d);
                c9257qa.f33393d.mo36297a(str5, str2, bundle, j10);
                return;
            }
            z13 = true;
        }
        C9094g7 c9094g12 = c9257qa.f33067a;
        if (c9094g12.m36333m()) {
            int iM36985x0 = c9094g9.m36308C().m36985x0(str2);
            if (iM36985x0 != 0) {
                c9094g9.mo36321a().m37005q().m36912b("Invalid event name. Event will not be logged (FE)", c9094g9.m36309D().m36620a(str2));
                C9341ve c9341veM36308C3 = c9094g9.m36308C();
                c9094g9.m36338w();
                c9094g12.m36308C().m36936B(c9257qa.f33412w, str3, iM36985x0, "_ev", c9341veM36308C3.m36971q(str2, 40, true), str2 != null ? str2.length() : 0);
                return;
            }
            Bundle bundleM36976t = c9094g9.m36308C().m36976t(str3, str2, bundle, C11815f.m44178b("_o", "_sn", "_sc", "_si"), z12);
            C8953m.m36047l(bundleM36976t);
            c9094g9.mo36323c();
            if (c9094g11.m36314I().m36380q(false) == null || !"_ae".equals(str2)) {
                i10 = 0;
                c9094g7 = c9094g11;
                j11 = 0;
            } else {
                C9148jd c9148jd = c9094g11.m36341z().f33191f;
                j11 = 0;
                long jMo44176b = c9148jd.f33088d.f33067a.mo36325e().mo44176b();
                i10 = 0;
                c9094g7 = c9094g11;
                long j14 = jMo44176b - c9148jd.f33086b;
                c9148jd.f33086b = jMo44176b;
                if (j14 > 0) {
                    c9094g9.m36308C().m36956Z(bundleM36976t, j14);
                }
            }
            if (!"auto".equals(str5) && "_ssr".equals(str2)) {
                C9341ve c9341veM36308C4 = c9094g9.m36308C();
                String string = bundleM36976t.getString("_ffr");
                if (C11824o.m44207a(string)) {
                    string = null;
                } else if (string != null) {
                    string = string.trim();
                }
                C9094g7 c9094g13 = c9341veM36308C4.f33067a;
                if (Objects.equals(string, c9094g13.m36339x().f33135w.m36369a())) {
                    c9094g13.mo36321a().m37010v().m36911a("Not logging duplicate session_start_with_rollout event");
                    return;
                }
                c9094g13.m36339x().f33135w.m36370b(string);
            } else if ("_ae".equals(str2)) {
                String strM36369a = c9094g9.m36308C().f33067a.m36339x().f33135w.m36369a();
                if (!TextUtils.isEmpty(strM36369a)) {
                    bundleM36976t.putString("_ffr", strM36369a);
                }
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(bundleM36976t);
            boolean zM36468p = c9094g9.m36338w().m36406H(null, C9395z4.f33748V0) ? c9094g7.m36341z().m36468p() : c9094g9.m36339x().f33132t.m36295a();
            if (c9094g9.m36339x().f33129q.m36345a() > j11 && c9094g9.m36339x().m36440A(j10) && zM36468p) {
                c9094g9.mo36321a().m37011w().m36911a("Current session is expired, remove the session number, ID, and engagement time");
                str4 = "_ae";
                j12 = j11;
                m36663B("auto", "_sid", null, c9094g9.mo36325e().mo44175a());
                m36663B("auto", "_sno", null, c9094g9.mo36325e().mo44175a());
                m36663B("auto", "_se", null, c9094g9.mo36325e().mo44175a());
                c9257qa = this;
                c9094g9.m36339x().f33130r.m36346b(j12);
            } else {
                j12 = j11;
                str4 = "_ae";
            }
            if (bundleM36976t.getLong("extend_session", j12) == 1) {
                c9094g9.mo36321a().m37011w().m36911a("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                j13 = j10;
                c9094g12.m36341z().f33190e.m36459b(j13, true);
            } else {
                j13 = j10;
            }
            ArrayList arrayList2 = new ArrayList(bundleM36976t.keySet());
            Collections.sort(arrayList2);
            int size = arrayList2.size();
            for (int i12 = i10; i12 < size; i12++) {
                String str6 = (String) arrayList2.get(i12);
                if (str6 != null) {
                    c9094g9.m36308C();
                    Object obj = bundleM36976t.get(str6);
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
                        bundleM36976t.putParcelableArray(str6, bundleArr);
                    }
                }
            }
            int i13 = i10;
            while (i13 < arrayList.size()) {
                Bundle bundleM36948Q = (Bundle) arrayList.get(i13);
                String str7 = i13 != 0 ? "_ep" : str2;
                bundleM36948Q.putString("_o", str5);
                if (z11) {
                    bundleM36948Q = c9094g9.m36308C().m36948Q(bundleM36948Q, null);
                }
                Bundle bundle2 = bundleM36948Q;
                c9094g7.m36315J().m36887c0(new zzbg(str7, new zzbe(bundle2), str5, j13), str3);
                if (!z13) {
                    Iterator it = c9257qa.f33394e.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC9335v8) it.next()).mo36918a(str, str2, new Bundle(bundle2), j10);
                    }
                }
                i13++;
                str5 = str;
                j13 = j10;
            }
            c9094g9.mo36323c();
            if (c9094g7.m36314I().m36380q(i10) == null || !str4.equals(str2)) {
                return;
            }
            c9094g7.m36341z().f33191f.m36393d(true, true, c9094g9.mo36325e().mo44176b());
        }
    }

    /* JADX INFO: renamed from: v0 */
    public final boolean m36717v0() {
        return this.f33403n;
    }

    /* JADX INFO: renamed from: w */
    public final void m36718w(String str, String str2, Bundle bundle, String str3) {
        C9094g7.m36301q();
        m36720x("auto", str2, this.f33067a.mo36325e().mo44175a(), bundle, false, true, true, str3);
    }

    @TargetApi(30)
    /* JADX INFO: renamed from: w0 */
    public final PriorityQueue m36719w0() {
        if (this.f33402m == null) {
            this.f33402m = new PriorityQueue(Comparator.comparing(new Function() { // from class: nb.ia
                @Override // java.util.function.Function
                public final /* synthetic */ Object apply(Object obj) {
                    return Long.valueOf(((zzoh) obj).f9507g);
                }
            }, new Comparator() { // from class: nb.ja
                @Override // java.util.Comparator
                public final /* synthetic */ int compare(Object obj, Object obj2) {
                    return Long.compare(((Long) obj).longValue(), ((Long) obj2).longValue());
                }
            }));
        }
        return this.f33402m;
    }

    /* JADX INFO: renamed from: x */
    public final void m36720x(String str, String str2, long j10, Bundle bundle, boolean z10, boolean z11, boolean z12, String str3) {
        String[] strArr = C9341ve.f33574i;
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
        this.f33067a.mo36322b().m36263t(new RunnableC9128i9(this, str, str2, j10, bundle2, z10, z11, z12, str3));
    }

    @TargetApi(30)
    /* JADX INFO: renamed from: x0 */
    public final void m36721x0() {
        zzoh zzohVar;
        mo36088h();
        this.f33403n = false;
        if (m36719w0().isEmpty() || this.f33398i || (zzohVar = (zzoh) m36719w0().poll()) == null) {
            return;
        }
        C9094g7 c9094g7 = this.f33067a;
        AbstractC10783a abstractC10783aM36941H = c9094g7.m36308C().m36941H();
        if (abstractC10783aM36941H != null) {
            this.f33398i = true;
            C9316u5 c9316u5M37011w = c9094g7.mo36321a().m37011w();
            String str = zzohVar.f9506f;
            c9316u5M37011w.m36912b("Registering trigger URI", str);
            InterfaceFutureC9440x<Unit> interfaceFutureC9440xMo41108c = abstractC10783aM36941H.mo41108c(Uri.parse(str));
            if (interfaceFutureC9440xMo41108c != null) {
                C9435s.m37256a(interfaceFutureC9440xMo41108c, new C9012b9(this, zzohVar), new ExecutorC8995a9(this));
            } else {
                this.f33398i = false;
                m36719w0().add(zzohVar);
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m36722y(String str, String str2, Object obj, boolean z10) {
        m36723z("auto", "_ldl", obj, true, this.f33067a.mo36325e().mo44175a());
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
    /* JADX INFO: renamed from: z */
    public final void m36723z(String str, String str2, Object obj, boolean z10, long j10) {
        int i10;
        int iM36987y0;
        String str3;
        C9094g7 c9094g7;
        int iM36986y;
        Object objM36988z;
        if (!z10) {
            C9341ve c9341veM36308C = this.f33067a.m36308C();
            if (!c9341veM36308C.m36977t0("user property", str2)) {
                i10 = 6;
            } else if (c9341veM36308C.m36981v0("user property", C9303t8.f33498a, null, str2)) {
                c9341veM36308C.f33067a.m36338w();
                if (c9341veM36308C.m36983w0("user property", 24, str2)) {
                    i10 = 0;
                } else {
                    i10 = 6;
                }
            } else {
                iM36987y0 = 15;
            }
            if (i10 != 0) {
                C9094g7 c9094g8 = this.f33067a;
                C9341ve c9341veM36308C2 = c9094g8.m36308C();
                c9094g8.m36338w();
                this.f33067a.m36308C().m36936B(this.f33412w, null, i10, "_ev", c9341veM36308C2.m36971q(str2, 24, true), str2 != null ? str2.length() : 0);
                return;
            }
            if (str == null) {
                str3 = Payload.TYPE_APP;
            } else {
                str3 = str;
            }
            if (obj != null) {
                m36662A(str3, str2, j10, null);
                return;
            }
            c9094g7 = this.f33067a;
            iM36986y = c9094g7.m36308C().m36986y(str2, obj);
            if (iM36986y != 0) {
                objM36988z = c9094g7.m36308C().m36988z(str2, obj);
                if (objM36988z != null) {
                    m36662A(str3, str2, j10, objM36988z);
                    return;
                }
                return;
            }
            C9341ve c9341veM36308C3 = c9094g7.m36308C();
            c9094g7.m36338w();
            this.f33067a.m36308C().m36936B(this.f33412w, null, iM36986y, "_ev", c9341veM36308C3.m36971q(str2, 24, true), (!(obj instanceof String) || (obj instanceof CharSequence)) ? obj.toString().length() : 0);
        }
        iM36987y0 = this.f33067a.m36308C().m36987y0(str2);
        i10 = iM36987y0;
        if (i10 != 0) {
            C9094g7 c9094g9 = this.f33067a;
            C9341ve c9341veM36308C4 = c9094g9.m36308C();
            c9094g9.m36338w();
            if (str2 != null) {
            }
            this.f33067a.m36308C().m36936B(this.f33412w, null, i10, "_ev", c9341veM36308C4.m36971q(str2, 24, true), str2 != null ? str2.length() : 0);
            return;
        }
        if (str == null) {
            str3 = Payload.TYPE_APP;
        } else {
            str3 = str;
        }
        if (obj != null) {
            m36662A(str3, str2, j10, null);
            return;
        }
        c9094g7 = this.f33067a;
        iM36986y = c9094g7.m36308C().m36986y(str2, obj);
        if (iM36986y != 0) {
            objM36988z = c9094g7.m36308C().m36988z(str2, obj);
            if (objM36988z != null) {
                m36662A(str3, str2, j10, objM36988z);
                return;
            }
            return;
        }
        C9341ve c9341veM36308C5 = c9094g7.m36308C();
        c9094g7.m36338w();
        this.f33067a.m36308C().m36936B(this.f33412w, null, iM36986y, "_ev", c9341veM36308C5.m36971q(str2, 24, true), (!(obj instanceof String) || (obj instanceof CharSequence)) ? obj.toString().length() : 0);
    }
}
