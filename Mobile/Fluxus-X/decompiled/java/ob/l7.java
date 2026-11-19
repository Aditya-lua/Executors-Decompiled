package ob;

import android.app.Application;
import android.app.BroadcastOptions;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import backtraceio.library.anr.BacktraceANRSettings;
import com.github.luben.zstd.BuildConfig;
import com.google.android.gms.internal.measurement.zf;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class l7 implements q8 {
    public static volatile l7 E;
    public int A;
    public int B;
    public final long D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f27534a;
    public final boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f27535c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m f27536d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p6 f27537e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b6 f27538f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h7 f27539g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final qd f27540h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ff f27541i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final u5 f27542j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final v9.e f27543k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ob f27544l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final va f27545m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final d2 f27546n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ab f27547o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f27548p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public s5 f27549q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public yc f27550r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public c0 f27551s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public p5 f27552t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public cb f27553u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Boolean f27555w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f27556x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public volatile Boolean f27557y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public volatile boolean f27558z;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f27554v = false;
    public final AtomicInteger C = new AtomicInteger(0);

    public l7(c9 c9Var) {
        o9.s.l(c9Var);
        Context context = c9Var.f27161a;
        f fVar = new f(context);
        this.f27535c = fVar;
        x4.f27961a = fVar;
        this.f27534a = context;
        this.b = c9Var.f27164e;
        this.f27557y = c9Var.b;
        this.f27548p = c9Var.f27166g;
        this.f27558z = true;
        com.google.android.gms.internal.measurement.p9.b(context);
        v9.e eVarD = v9.h.d();
        this.f27543k = eVarD;
        Long l10 = c9Var.f27165f;
        this.D = l10 != null ? l10.longValue() : eVarD.a();
        this.f27536d = new m(this);
        p6 p6Var = new p6(this);
        p6Var.m();
        this.f27537e = p6Var;
        b6 b6Var = new b6(this);
        b6Var.m();
        this.f27538f = b6Var;
        ff ffVar = new ff(this);
        ffVar.m();
        this.f27541i = ffVar;
        this.f27542j = new u5(new b9(c9Var, this));
        this.f27546n = new d2(this);
        ob obVar = new ob(this);
        obVar.k();
        this.f27544l = obVar;
        va vaVar = new va(this);
        vaVar.k();
        this.f27545m = vaVar;
        qd qdVar = new qd(this);
        qdVar.k();
        this.f27540h = qdVar;
        ab abVar = new ab(this);
        abVar.m();
        this.f27547o = abVar;
        h7 h7Var = new h7(this);
        h7Var.m();
        this.f27539g = h7Var;
        com.google.android.gms.internal.measurement.h2 h2Var = c9Var.f27163d;
        boolean z10 = h2Var == null || h2Var.f6529g == 0;
        if (context.getApplicationContext() instanceof Application) {
            t(vaVar);
            if (vaVar.f27641a.f27534a.getApplicationContext() instanceof Application) {
                Application application = (Application) vaVar.f27641a.f27534a.getApplicationContext();
                if (vaVar.f27874c == null) {
                    vaVar.f27874c = new ia(vaVar);
                }
                if (z10) {
                    application.unregisterActivityLifecycleCallbacks(vaVar.f27874c);
                    application.registerActivityLifecycleCallbacks(vaVar.f27874c);
                    b6 b6Var2 = vaVar.f27641a.f27538f;
                    u(b6Var2);
                    b6Var2.w().a("Registered activity lifecycle callback");
                }
            }
        } else {
            u(b6Var);
            b6Var.r().a("Application context is not an Application");
        }
        h7Var.t(new j7(this, c9Var));
    }

    public static l7 O(Context context, com.google.android.gms.internal.measurement.h2 h2Var, Long l10) {
        Bundle bundle;
        if (h2Var != null) {
            Bundle bundle2 = h2Var.f6531i;
            h2Var = new com.google.android.gms.internal.measurement.h2(h2Var.f6528f, h2Var.f6529g, h2Var.f6530h, bundle2, null);
        }
        o9.s.l(context);
        o9.s.l(context.getApplicationContext());
        if (E == null) {
            synchronized (l7.class) {
                try {
                    if (E == null) {
                        E = new l7(new c9(context, h2Var, l10));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } else if (h2Var != null && (bundle = h2Var.f6531i) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            o9.s.l(E);
            E.f27557y = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled"));
        }
        o9.s.l(E);
        return E;
    }

    public static final void q() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    public static final void r(f4 f4Var) {
        if (f4Var == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    public static final void s(o8 o8Var) {
        if (o8Var == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    public static final void t(g5 g5Var) {
        if (g5Var == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!g5Var.i()) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(g5Var.getClass())));
        }
    }

    public static final void u(p8 p8Var) {
        if (p8Var == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!p8Var.k()) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(p8Var.getClass())));
        }
    }

    public final h7 A() {
        return this.f27539g;
    }

    public final va B() {
        va vaVar = this.f27545m;
        t(vaVar);
        return vaVar;
    }

    public final ff C() {
        ff ffVar = this.f27541i;
        s(ffVar);
        return ffVar;
    }

    public final u5 D() {
        return this.f27542j;
    }

    public final s5 E() {
        t(this.f27549q);
        return this.f27549q;
    }

    public final ab F() {
        ab abVar = this.f27547o;
        u(abVar);
        return abVar;
    }

    public final boolean G() {
        return this.b;
    }

    public final String H() {
        return this.f27548p;
    }

    public final ob I() {
        ob obVar = this.f27544l;
        t(obVar);
        return obVar;
    }

    public final yc J() {
        t(this.f27550r);
        return this.f27550r;
    }

    public final c0 K() {
        u(this.f27551s);
        return this.f27551s;
    }

    public final p5 L() {
        t(this.f27552t);
        return this.f27552t;
    }

    public final d2 M() {
        d2 d2Var = this.f27546n;
        r(d2Var);
        return d2Var;
    }

    public final cb N() {
        r(this.f27553u);
        return this.f27553u;
    }

    public final void P(boolean z10) {
        this.f27557y = Boolean.valueOf(z10);
    }

    @Override // ob.q8
    public final b6 a() {
        b6 b6Var = this.f27538f;
        u(b6Var);
        return b6Var;
    }

    @Override // ob.q8
    public final h7 b() {
        h7 h7Var = this.f27539g;
        u(h7Var);
        return h7Var;
    }

    @Override // ob.q8
    public final f c() {
        return this.f27535c;
    }

    @Override // ob.q8
    public final Context d() {
        return this.f27534a;
    }

    @Override // ob.q8
    public final v9.e e() {
        return this.f27543k;
    }

    public final boolean f() {
        return this.f27557y != null && this.f27557y.booleanValue();
    }

    public final boolean g() {
        return h() == 0;
    }

    public final int h() {
        h7 h7Var = this.f27539g;
        u(h7Var);
        h7Var.h();
        m mVar = this.f27536d;
        if (mVar.L()) {
            return 1;
        }
        u(h7Var);
        h7Var.h();
        if (!this.f27558z) {
            return 8;
        }
        p6 p6Var = this.f27537e;
        s(p6Var);
        Boolean boolT = p6Var.t();
        if (boolT != null) {
            return boolT.booleanValue() ? 0 : 3;
        }
        f fVar = mVar.f27641a.f27535c;
        Boolean boolJ = mVar.J("firebase_analytics_collection_enabled");
        if (boolJ != null) {
            return boolJ.booleanValue() ? 0 : 4;
        }
        return (this.f27557y == null || this.f27557y.booleanValue()) ? 0 : 7;
    }

    public final void i(boolean z10) {
        h7 h7Var = this.f27539g;
        u(h7Var);
        h7Var.h();
        this.f27558z = z10;
    }

    public final boolean j() {
        h7 h7Var = this.f27539g;
        u(h7Var);
        h7Var.h();
        return this.f27558z;
    }

    public final void k() {
        this.A++;
    }

    public final void l() {
        this.C.incrementAndGet();
    }

    public final boolean m() {
        if (!this.f27554v) {
            throw new IllegalStateException("AppMeasurement is not initialized");
        }
        h7 h7Var = this.f27539g;
        u(h7Var);
        h7Var.h();
        Boolean bool = this.f27555w;
        if (bool == null || this.f27556x == 0 || (!bool.booleanValue() && Math.abs(this.f27543k.b() - this.f27556x) > 1000)) {
            this.f27556x = this.f27543k.b();
            ff ffVar = this.f27541i;
            s(ffVar);
            boolean z10 = false;
            if (ffVar.M("android.permission.INTERNET")) {
                s(ffVar);
                if (ffVar.M("android.permission.ACCESS_NETWORK_STATE")) {
                    Context context = this.f27534a;
                    if (x9.c.a(context).f() || this.f27536d.m() || (ff.j0(context) && ff.E(context, false))) {
                        z10 = true;
                    }
                }
            }
            Boolean boolValueOf = Boolean.valueOf(z10);
            this.f27555w = boolValueOf;
            if (boolValueOf.booleanValue()) {
                s(ffVar);
                this.f27555w = Boolean.valueOf(ffVar.o(L().r()));
            }
        }
        return this.f27555w.booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0089  */
    /* JADX WARN: Code duplicated, block: B:24:0x009d  */
    /* JADX WARN: Code duplicated, block: B:27:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:29:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:36:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:38:0x0116  */
    public final boolean n() {
        NetworkInfo activeNetworkInfo;
        Bundle bundle;
        a0 a0VarH;
        int i10;
        String str;
        h7 h7Var = this.f27539g;
        u(h7Var);
        h7Var.h();
        ab abVar = this.f27547o;
        u(abVar);
        u(abVar);
        String strQ = L().q();
        if (!this.f27536d.M()) {
            b6 b6Var = this.f27538f;
            u(b6Var);
            b6Var.w().a("ADID collection is disabled from Manifest. Skipping");
            return false;
        }
        p6 p6Var = this.f27537e;
        s(p6Var);
        Pair pairO = p6Var.o(strQ);
        if (((Boolean) pairO.second).booleanValue() || TextUtils.isEmpty((CharSequence) pairO.first)) {
            b6 b6Var2 = this.f27538f;
            u(b6Var2);
            b6Var2.w().a("ADID unavailable to retrieve Deferred Deep Link. Skipping");
            return false;
        }
        u(abVar);
        abVar.l();
        ConnectivityManager connectivityManager = (ConnectivityManager) abVar.f27641a.f27534a.getSystemService("connectivity");
        if (connectivityManager != null) {
            try {
                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
                activeNetworkInfo = null;
            }
        } else {
            activeNetworkInfo = null;
        }
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            b6 b6Var3 = this.f27538f;
            u(b6Var3);
            b6Var3.r().a("Network is not available for Deferred Deep Link request. Skipping");
            return false;
        }
        StringBuilder sb2 = new StringBuilder();
        yc ycVarJ = J();
        ycVarJ.h();
        ycVarJ.j();
        if (ycVarJ.y()) {
            ff ffVar = ycVarJ.f27641a.f27541i;
            s(ffVar);
            if (ffVar.W() >= 234200) {
                va vaVar = this.f27545m;
                t(vaVar);
                l7 l7Var = vaVar.f27641a;
                vaVar.h();
                p pVarL0 = l7Var.J().l0();
                if (pVarL0 != null) {
                }
                if (bundle == null) {
                    i10 = this.B;
                    this.B = i10 + 1;
                    if (i10 < 10) {
                    }
                    b6 b6Var4 = this.f27538f;
                    u(b6Var4);
                    if (i10 < 10) {
                        str = "Retrying.";
                    } else {
                        str = "Skipping.";
                    }
                    z5 z5VarV = b6Var4.v();
                    StringBuilder sb3 = new StringBuilder(str.length() + 60);
                    sb3.append("Failed to retrieve DMA consent from the service, ");
                    sb3.append(str);
                    sb3.append(" retryCount");
                    z5VarV.b(sb3.toString(), Integer.valueOf(this.B));
                    return z;
                }
                v8 v8VarE = v8.e(bundle, 100);
                sb2.append("&gcs=");
                sb2.append(v8VarE.k());
                a0VarH = a0.h(bundle, 100);
                sb2.append("&dma=");
                sb2.append(!Objects.equals(a0VarH.j(), Boolean.FALSE) ? 1 : 0);
                if (!TextUtils.isEmpty(a0VarH.k())) {
                    sb2.append("&dma_cps=");
                    sb2.append(a0VarH.k());
                }
                int i11 = !Objects.equals(a0.i(bundle), Boolean.TRUE) ? 1 : 0;
                sb2.append("&npa=");
                sb2.append(i11);
                b6 b6Var5 = this.f27538f;
                u(b6Var5);
                b6Var5.w().b("Consent query parameters to Bow", sb2);
            }
        } else {
            va vaVar2 = this.f27545m;
            t(vaVar2);
            l7 l7Var2 = vaVar2.f27641a;
            vaVar2.h();
            p pVarL1 = l7Var2.J().l0();
            bundle = pVarL1 != null ? pVarL1.f27663f : null;
            if (bundle == null) {
                i10 = this.B;
                this.B = i10 + 1;
                boolean z10 = i10 < 10;
                b6 b6Var6 = this.f27538f;
                u(b6Var6);
                if (i10 < 10) {
                    str = "Retrying.";
                } else {
                    str = "Skipping.";
                }
                z5 z5VarV2 = b6Var6.v();
                StringBuilder sb4 = new StringBuilder(str.length() + 60);
                sb4.append("Failed to retrieve DMA consent from the service, ");
                sb4.append(str);
                sb4.append(" retryCount");
                z5VarV2.b(sb4.toString(), Integer.valueOf(this.B));
                return z10;
            }
            v8 v8VarE2 = v8.e(bundle, 100);
            sb2.append("&gcs=");
            sb2.append(v8VarE2.k());
            a0VarH = a0.h(bundle, 100);
            sb2.append("&dma=");
            sb2.append(!Objects.equals(a0VarH.j(), Boolean.FALSE) ? 1 : 0);
            if (!TextUtils.isEmpty(a0VarH.k())) {
                sb2.append("&dma_cps=");
                sb2.append(a0VarH.k());
            }
            int i12 = !Objects.equals(a0.i(bundle), Boolean.TRUE) ? 1 : 0;
            sb2.append("&npa=");
            sb2.append(i12);
            b6 b6Var7 = this.f27538f;
            u(b6Var7);
            b6Var7.w().b("Consent query parameters to Bow", sb2);
        }
        ff ffVar2 = this.f27541i;
        s(ffVar2);
        L().f27641a.f27536d.A();
        String str2 = (String) pairO.first;
        p6 p6Var2 = this.f27537e;
        s(p6Var2);
        URL urlI0 = ffVar2.i0(133005L, strQ, str2, p6Var2.f27702v.a() - 1, sb2.toString());
        if (urlI0 != null) {
            ab abVar2 = this.f27547o;
            u(abVar2);
            xa xaVar = new xa() { // from class: ob.k7
                @Override // ob.xa
                public final /* synthetic */ void a(String str3, int i13, Throwable th2, byte[] bArr, Map map) {
                    this.f27511a.o(str3, i13, th2, bArr, map);
                }
            };
            abVar2.l();
            o9.s.l(urlI0);
            o9.s.l(xaVar);
            h7 h7Var2 = abVar2.f27641a.f27539g;
            u(h7Var2);
            h7Var2.w(new za(abVar2, strQ, urlI0, null, null, xaVar));
        }
        return false;
    }

    public final /* synthetic */ void o(String str, int i10, Throwable th2, byte[] bArr, Map map) {
        int i11;
        if (i10 != 200 && i10 != 204) {
            i11 = 304;
            if (i10 != 304) {
                i11 = i10;
            }
            b6 b6Var = this.f27538f;
            u(b6Var);
            b6Var.r().c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i11), th2);
        }
        i11 = i10;
        if (th2 == null) {
            p6 p6Var = this.f27537e;
            s(p6Var);
            p6Var.f27701u.b(true);
            if (bArr == null || bArr.length == 0) {
                b6 b6Var2 = this.f27538f;
                u(b6Var2);
                b6Var2.v().a("Deferred Deep Link response empty.");
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(new String(bArr));
                String strOptString = jSONObject.optString("deeplink", BuildConfig.FLAVOR);
                if (TextUtils.isEmpty(strOptString)) {
                    b6 b6Var3 = this.f27538f;
                    u(b6Var3);
                    b6Var3.v().a("Deferred Deep Link is empty.");
                    return;
                }
                String strOptString2 = jSONObject.optString("gclid", BuildConfig.FLAVOR);
                String strOptString3 = jSONObject.optString("gbraid", BuildConfig.FLAVOR);
                String strOptString4 = jSONObject.optString("gad_source", BuildConfig.FLAVOR);
                double dOptDouble = jSONObject.optDouble("timestamp", 0.0d);
                Bundle bundle = new Bundle();
                ff ffVar = this.f27541i;
                s(ffVar);
                l7 l7Var = ffVar.f27641a;
                if (!TextUtils.isEmpty(strOptString)) {
                    Context context = l7Var.f27534a;
                    List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(strOptString)), 0);
                    if (listQueryIntentActivities != null && !listQueryIntentActivities.isEmpty()) {
                        if (!TextUtils.isEmpty(strOptString3)) {
                            bundle.putString("gbraid", strOptString3);
                        }
                        if (!TextUtils.isEmpty(strOptString4)) {
                            bundle.putString("gad_source", strOptString4);
                        }
                        bundle.putString("gclid", strOptString2);
                        bundle.putString("_cis", "ddp");
                        this.f27545m.t("auto", "_cmp", bundle);
                        s(ffVar);
                        if (TextUtils.isEmpty(strOptString)) {
                            return;
                        }
                        try {
                            SharedPreferences.Editor editorEdit = context.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                            editorEdit.putString("deeplink", strOptString);
                            editorEdit.putLong("timestamp", Double.doubleToRawLongBits(dOptDouble));
                            if (editorEdit.commit()) {
                                Intent intent = new Intent("android.google.analytics.action.DEEPLINK_ACTION");
                                Context context2 = ffVar.f27641a.f27534a;
                                if (Build.VERSION.SDK_INT < 34) {
                                    context2.sendBroadcast(intent);
                                    return;
                                } else {
                                    context2.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
                                    return;
                                }
                            }
                            return;
                        } catch (RuntimeException e10) {
                            b6 b6Var4 = ffVar.f27641a.f27538f;
                            u(b6Var4);
                            b6Var4.o().b("Failed to persist Deferred Deep Link. exception", e10);
                            return;
                        }
                    }
                }
                b6 b6Var5 = this.f27538f;
                u(b6Var5);
                b6Var5.r().d("Deferred Deep Link validation failed. gclid, gbraid, deep link", strOptString2, strOptString3, strOptString);
                return;
            } catch (JSONException e11) {
                b6 b6Var6 = this.f27538f;
                u(b6Var6);
                b6Var6.o().b("Failed to parse the Deferred Deep Link response. exception", e11);
                return;
            }
        }
        b6 b6Var7 = this.f27538f;
        u(b6Var7);
        b6Var7.r().c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i11), th2);
    }

    public final /* synthetic */ void p(c9 c9Var) {
        h7 h7Var = this.f27539g;
        u(h7Var);
        h7Var.h();
        m mVar = this.f27536d;
        mVar.u();
        c0 c0Var = new c0(this);
        c0Var.m();
        this.f27551s = c0Var;
        com.google.android.gms.internal.measurement.h2 h2Var = c9Var.f27163d;
        p5 p5Var = new p5(this, c9Var.f27162c, h2Var == null ? 0L : h2Var.f6528f);
        p5Var.k();
        this.f27552t = p5Var;
        s5 s5Var = new s5(this);
        s5Var.k();
        this.f27549q = s5Var;
        yc ycVar = new yc(this);
        ycVar.k();
        this.f27550r = ycVar;
        ff ffVar = this.f27541i;
        ffVar.n();
        this.f27537e.n();
        this.f27552t.l();
        cb cbVar = new cb(this);
        cbVar.k();
        this.f27553u = cbVar;
        cbVar.l();
        b6 b6Var = this.f27538f;
        u(b6Var);
        z5 z5VarU = b6Var.u();
        mVar.A();
        z5VarU.b("App measurement initialized, version", 133005L);
        u(b6Var);
        b6Var.u().a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String strQ = p5Var.q();
        s(ffVar);
        if (ffVar.P(strQ, mVar.R())) {
            u(b6Var);
            b6Var.u().a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
        } else {
            u(b6Var);
            b6Var.u().a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strQ)));
        }
        u(b6Var);
        b6Var.v().a("Debug-level message logging enabled");
        int i10 = this.A;
        AtomicInteger atomicInteger = this.C;
        if (i10 != atomicInteger.get()) {
            u(b6Var);
            b6Var.o().c("Not all components initialized", Integer.valueOf(this.A), Integer.valueOf(atomicInteger.get()));
        }
        this.f27554v = true;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0034  */
    /* JADX WARN: Code duplicated, block: B:13:0x006b  */
    /* JADX WARN: Code duplicated, block: B:20:0x00af  */
    /* JADX WARN: Code duplicated, block: B:9:0x0032 A[DONT_INVERT] */
    public final void v(com.google.android.gms.internal.measurement.h2 h2Var) {
        v8 v8VarA;
        Bundle bundle;
        h7 h7Var = this.f27539g;
        u(h7Var);
        h7Var.h();
        com.google.android.gms.internal.measurement.o7 o7VarQ = N().q();
        com.google.android.gms.internal.measurement.o7 o7Var = com.google.android.gms.internal.measurement.o7.CLIENT_UPLOAD_ELIGIBLE;
        zf.a();
        d5 d5Var = e5.R0;
        m mVar = this.f27536d;
        boolean zH = mVar.H(null, d5Var);
        boolean z10 = o7VarQ == o7Var;
        if (zH) {
            ff ffVar = this.f27541i;
            s(ffVar);
            if (ffVar.G()) {
                ff ffVar2 = this.f27541i;
                s(ffVar2);
                ffVar2.h();
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                nf nfVar = new nf(ffVar2.f27641a);
                l7 l7Var = ffVar2.f27641a;
                l2.b.m(l7Var.f27534a, nfVar, intentFilter, 2);
                b6 b6Var = l7Var.f27538f;
                u(b6Var);
                b6Var.v().a("Registered app receiver");
                if (z10) {
                    N().o(((Long) e5.C.b(null)).longValue());
                }
            } else if (z10) {
                z10 = true;
                ff ffVar3 = this.f27541i;
                s(ffVar3);
                ffVar3.h();
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                intentFilter2.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                nf nfVar2 = new nf(ffVar3.f27641a);
                l7 l7Var2 = ffVar3.f27641a;
                l2.b.m(l7Var2.f27534a, nfVar2, intentFilter2, 2);
                b6 b6Var2 = l7Var2.f27538f;
                u(b6Var2);
                b6Var2.v().a("Registered app receiver");
                if (z10) {
                    N().o(((Long) e5.C.b(null)).longValue());
                }
            }
        } else if (z10) {
            z10 = true;
            ff ffVar4 = this.f27541i;
            s(ffVar4);
            ffVar4.h();
            IntentFilter intentFilter3 = new IntentFilter();
            intentFilter3.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
            intentFilter3.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
            nf nfVar3 = new nf(ffVar4.f27641a);
            l7 l7Var3 = ffVar4.f27641a;
            l2.b.m(l7Var3.f27534a, nfVar3, intentFilter3, 2);
            b6 b6Var3 = l7Var3.f27538f;
            u(b6Var3);
            b6Var3.v().a("Registered app receiver");
            if (z10) {
                N().o(((Long) e5.C.b(null)).longValue());
            }
        }
        p6 p6Var = this.f27537e;
        s(p6Var);
        v8 v8VarW = p6Var.w();
        int iB = v8VarW.b();
        s8 s8VarO = mVar.O("google_analytics_default_allow_ad_storage", false);
        s8 s8VarO2 = mVar.O("google_analytics_default_allow_analytics_storage", false);
        s8 s8Var = s8.UNINITIALIZED;
        if (s8VarO == s8Var && s8VarO2 == s8Var) {
            if (!TextUtils.isEmpty(L().r())) {
                va vaVar = this.f27545m;
                t(vaVar);
                vaVar.q0(new v8(null, null, -10), false);
            }
            v8VarA = null;
        } else {
            s(p6Var);
            if (p6Var.v(-10)) {
                v8VarA = v8.a(s8VarO, s8VarO2, -10);
            } else {
                if (!TextUtils.isEmpty(L().r()) && (iB == 0 || iB == 30 || iB == 10 || iB == 40)) {
                    va vaVar2 = this.f27545m;
                    t(vaVar2);
                    vaVar2.q0(new v8(null, null, -10), false);
                }
                v8VarA = null;
            }
        }
        if (v8VarA != null) {
            va vaVar3 = this.f27545m;
            t(vaVar3);
            vaVar3.q0(v8VarA, true);
            v8VarW = v8VarA;
        }
        va vaVar4 = this.f27545m;
        t(vaVar4);
        vaVar4.o(v8VarW);
        s(p6Var);
        int iB2 = p6Var.u().b();
        s8 s8VarO3 = mVar.O("google_analytics_default_allow_ad_personalization_signals", true);
        if (s8VarO3 != s8Var) {
            b6 b6Var4 = this.f27538f;
            u(b6Var4);
            b6Var4.w().b("Default ad personalization consent from Manifest", s8VarO3);
        }
        s8 s8VarO4 = mVar.O("google_analytics_default_allow_ad_user_data", true);
        if (s8VarO4 != s8Var && v8.u(-10, iB2)) {
            t(vaVar4);
            vaVar4.p0(a0.a(s8VarO4, -10), true);
        } else if (!TextUtils.isEmpty(L().r()) && (iB2 == 0 || iB2 == 30)) {
            t(vaVar4);
            vaVar4.p0(new a0((Boolean) null, -10, (Boolean) null, (String) null), true);
        } else if (TextUtils.isEmpty(L().r()) && h2Var != null && (bundle = h2Var.f6531i) != null && v8.u(30, iB2)) {
            a0 a0VarH = a0.h(bundle, 30);
            if (a0VarH.d()) {
                t(vaVar4);
                vaVar4.p0(a0VarH, true);
            }
        }
        Boolean boolJ = mVar.J("google_analytics_tcf_data_enabled");
        if (boolJ == null || boolJ.booleanValue()) {
            b6 b6Var5 = this.f27538f;
            u(b6Var5);
            b6Var5.v().a("TCF client enabled.");
            t(vaVar4);
            vaVar4.s();
            t(vaVar4);
            vaVar4.r();
        }
        s(p6Var);
        m6 m6Var = p6Var.f27686f;
        if (m6Var.a() == 0) {
            b6 b6Var6 = this.f27538f;
            u(b6Var6);
            long j10 = this.D;
            b6Var6.w().b("Persisting first open", Long.valueOf(j10));
            s(p6Var);
            m6Var.b(j10);
        }
        t(vaVar4);
        vaVar4.f27889r.c();
        if (m()) {
            if (!TextUtils.isEmpty(L().r())) {
                ff ffVar5 = this.f27541i;
                s(ffVar5);
                String strR = L().r();
                s(p6Var);
                p6Var.h();
                if (ffVar5.p(strR, p6Var.p().getString("gmp_app_id", null))) {
                    b6 b6Var7 = this.f27538f;
                    u(b6Var7);
                    b6Var7.u().a("Rechecking which service to use due to a GMP App Id change");
                    s(p6Var);
                    p6Var.h();
                    Boolean boolT = p6Var.t();
                    SharedPreferences.Editor editorEdit = p6Var.p().edit();
                    editorEdit.clear();
                    editorEdit.apply();
                    if (boolT != null) {
                        p6Var.s(boolT);
                    }
                    E().o();
                    this.f27550r.A();
                    this.f27550r.w();
                    s(p6Var);
                    m6Var.b(this.D);
                    s(p6Var);
                    p6Var.f27688h.b(null);
                }
                s(p6Var);
                String strR2 = L().r();
                p6Var.h();
                SharedPreferences.Editor editorEdit2 = p6Var.p().edit();
                editorEdit2.putString("gmp_app_id", strR2);
                editorEdit2.apply();
            }
            s(p6Var);
            if (!p6Var.w().o(u8.ANALYTICS_STORAGE)) {
                s(p6Var);
                p6Var.f27688h.b(null);
            }
            t(vaVar4);
            s(p6Var);
            vaVar4.E(p6Var.f27688h.a());
            ff ffVar6 = this.f27541i;
            s(ffVar6);
            try {
                ffVar6.f27641a.f27534a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
            } catch (ClassNotFoundException unused) {
                p6 p6Var2 = this.f27537e;
                s(p6Var2);
                o6 o6Var = p6Var2.f27703w;
                if (!TextUtils.isEmpty(o6Var.a())) {
                    b6 b6Var8 = this.f27538f;
                    u(b6Var8);
                    b6Var8.r().a("Remote config removed with active feature rollouts");
                    s(p6Var2);
                    o6Var.b(null);
                }
            }
            if (!TextUtils.isEmpty(L().r())) {
                boolean zG = g();
                p6 p6Var3 = this.f27537e;
                s(p6Var3);
                if (!p6Var3.z() && !this.f27536d.L()) {
                    s(p6Var3);
                    p6Var3.y(!zG);
                }
                if (zG) {
                    va vaVar5 = this.f27545m;
                    t(vaVar5);
                    vaVar5.H();
                }
                qd qdVar = this.f27540h;
                t(qdVar);
                qdVar.f27746e.a();
                J().q(new AtomicReference());
                yc ycVarJ = J();
                s(p6Var3);
                ycVarJ.v(p6Var3.f27706z.a());
            }
        } else if (g()) {
            ff ffVar7 = this.f27541i;
            s(ffVar7);
            if (!ffVar7.M("android.permission.INTERNET")) {
                b6 b6Var9 = this.f27538f;
                u(b6Var9);
                b6Var9.o().a("App is missing INTERNET permission");
            }
            s(ffVar7);
            if (!ffVar7.M("android.permission.ACCESS_NETWORK_STATE")) {
                b6 b6Var10 = this.f27538f;
                u(b6Var10);
                b6Var10.o().a("App is missing ACCESS_NETWORK_STATE permission");
            }
            Context context = this.f27534a;
            if (!x9.c.a(context).f() && !this.f27536d.m()) {
                if (!ff.j0(context)) {
                    b6 b6Var11 = this.f27538f;
                    u(b6Var11);
                    b6Var11.o().a("AppMeasurementReceiver not registered/enabled");
                }
                if (!ff.E(context, false)) {
                    b6 b6Var12 = this.f27538f;
                    u(b6Var12);
                    b6Var12.o().a("AppMeasurementService not registered/enabled");
                }
            }
            b6 b6Var13 = this.f27538f;
            u(b6Var13);
            b6Var13.o().a("Uploading is not possible. App measurement disabled");
        }
        zf.a();
        if (this.f27536d.H(null, e5.R0)) {
            ff ffVar8 = this.f27541i;
            s(ffVar8);
            if (ffVar8.G()) {
                long jMax = Math.max(500L, ((((long) ((Integer) e5.f27284y0.b(null)).intValue()) * 1000) + ((long) new Random().nextInt(BacktraceANRSettings.DEFAULT_ANR_TIMEOUT))) - this.f27543k.b());
                if (jMax > 500) {
                    b6 b6Var14 = this.f27538f;
                    u(b6Var14);
                    b6Var14.w().b("Waiting to fetch trigger URIs until some time after boot. Delay in millis", Long.valueOf(jMax));
                }
                va vaVar6 = this.f27545m;
                t(vaVar6);
                vaVar6.s0(jMax);
            }
        }
        p6 p6Var4 = this.f27537e;
        s(p6Var4);
        p6Var4.f27696p.b(true);
    }

    public final m w() {
        return this.f27536d;
    }

    public final p6 x() {
        p6 p6Var = this.f27537e;
        s(p6Var);
        return p6Var;
    }

    public final b6 y() {
        b6 b6Var = this.f27538f;
        if (b6Var == null || !b6Var.k()) {
            return null;
        }
        return b6Var;
    }

    public final qd z() {
        qd qdVar = this.f27540h;
        t(qdVar);
        return qdVar;
    }
}
