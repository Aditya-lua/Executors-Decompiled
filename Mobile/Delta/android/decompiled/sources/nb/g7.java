package nb;

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
import com.google.android.gms.internal.measurement.vf;
import com.google.android.gms.internal.measurement.zzdd;
import com.google.android.gms.measurement.internal.zzao;
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
public final class g7 implements l8 {
    public static volatile g7 E;
    public int A;
    public int B;
    public final long D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f25531a;
    public final boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f25532c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k f25533d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k6 f25534e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final w5 f25535f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c7 f25536g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ld f25537h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ve f25538i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p5 f25539j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final u9.e f25540k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final jb f25541l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final qa f25542m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final y1 f25543n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final va f25544o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f25545p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public n5 f25546q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public tc f25547r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public z f25548s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public k5 f25549t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public xa f25550u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Boolean f25552w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f25553x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public volatile Boolean f25554y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public volatile boolean f25555z;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f25551v = false;
    public final AtomicInteger C = new AtomicInteger(0);

    public g7(x8 x8Var) {
        n9.m.l(x8Var);
        Context context = x8Var.f26104a;
        f fVar = new f(context);
        this.f25532c = fVar;
        s4.f25940a = fVar;
        this.f25531a = context;
        this.b = x8Var.f26107e;
        this.f25554y = x8Var.b;
        this.f25545p = x8Var.f26109g;
        this.f25555z = true;
        com.google.android.gms.internal.measurement.l9.b(context);
        u9.e eVarC = u9.h.c();
        this.f25540k = eVarC;
        Long l10 = x8Var.f26108f;
        this.D = l10 != null ? l10.longValue() : eVarC.a();
        this.f25533d = new k(this);
        k6 k6Var = new k6(this);
        k6Var.m();
        this.f25534e = k6Var;
        w5 w5Var = new w5(this);
        w5Var.m();
        this.f25535f = w5Var;
        ve veVar = new ve(this);
        veVar.m();
        this.f25538i = veVar;
        this.f25539j = new p5(new w8(x8Var, this));
        this.f25543n = new y1(this);
        jb jbVar = new jb(this);
        jbVar.k();
        this.f25541l = jbVar;
        qa qaVar = new qa(this);
        qaVar.k();
        this.f25542m = qaVar;
        ld ldVar = new ld(this);
        ldVar.k();
        this.f25537h = ldVar;
        va vaVar = new va(this);
        vaVar.m();
        this.f25544o = vaVar;
        c7 c7Var = new c7(this);
        c7Var.m();
        this.f25536g = c7Var;
        zzdd zzddVar = x8Var.f26106d;
        boolean z10 = zzddVar == null || zzddVar.f6972g == 0;
        if (context.getApplicationContext() instanceof Application) {
            t(qaVar);
            if (qaVar.f25625a.f25531a.getApplicationContext() instanceof Application) {
                Application application = (Application) qaVar.f25625a.f25531a.getApplicationContext();
                if (qaVar.f25891c == null) {
                    qaVar.f25891c = new da(qaVar);
                }
                if (z10) {
                    application.unregisterActivityLifecycleCallbacks(qaVar.f25891c);
                    application.registerActivityLifecycleCallbacks(qaVar.f25891c);
                    w5 w5Var2 = qaVar.f25625a.f25535f;
                    u(w5Var2);
                    w5Var2.w().a("Registered activity lifecycle callback");
                }
            }
        } else {
            u(w5Var);
            w5Var.r().a("Application context is not an Application");
        }
        c7Var.t(new e7(this, x8Var));
    }

    public static g7 O(Context context, zzdd zzddVar, Long l10) {
        Bundle bundle;
        if (zzddVar != null) {
            Bundle bundle2 = zzddVar.f6974i;
            zzddVar = new zzdd(zzddVar.f6971f, zzddVar.f6972g, zzddVar.f6973h, bundle2, null);
        }
        n9.m.l(context);
        n9.m.l(context.getApplicationContext());
        if (E == null) {
            synchronized (g7.class) {
                try {
                    if (E == null) {
                        E = new g7(new x8(context, zzddVar, l10));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } else if (zzddVar != null && (bundle = zzddVar.f6974i) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            n9.m.l(E);
            E.f25554y = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled"));
        }
        n9.m.l(E);
        return E;
    }

    public static final void q() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    public static final void r(a4 a4Var) {
        if (a4Var == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    public static final void s(j8 j8Var) {
        if (j8Var == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    public static final void t(b5 b5Var) {
        if (b5Var == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!b5Var.i()) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(b5Var.getClass())));
        }
    }

    public static final void u(k8 k8Var) {
        if (k8Var == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!k8Var.k()) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(k8Var.getClass())));
        }
    }

    public final c7 A() {
        return this.f25536g;
    }

    public final qa B() {
        qa qaVar = this.f25542m;
        t(qaVar);
        return qaVar;
    }

    public final ve C() {
        ve veVar = this.f25538i;
        s(veVar);
        return veVar;
    }

    public final p5 D() {
        return this.f25539j;
    }

    public final n5 E() {
        t(this.f25546q);
        return this.f25546q;
    }

    public final va F() {
        va vaVar = this.f25544o;
        u(vaVar);
        return vaVar;
    }

    public final boolean G() {
        return this.b;
    }

    public final String H() {
        return this.f25545p;
    }

    public final jb I() {
        jb jbVar = this.f25541l;
        t(jbVar);
        return jbVar;
    }

    public final tc J() {
        t(this.f25547r);
        return this.f25547r;
    }

    public final z K() {
        u(this.f25548s);
        return this.f25548s;
    }

    public final k5 L() {
        t(this.f25549t);
        return this.f25549t;
    }

    public final y1 M() {
        y1 y1Var = this.f25543n;
        r(y1Var);
        return y1Var;
    }

    public final xa N() {
        r(this.f25550u);
        return this.f25550u;
    }

    public final void P(boolean z10) {
        this.f25554y = Boolean.valueOf(z10);
    }

    @Override // nb.l8
    public final w5 a() {
        w5 w5Var = this.f25535f;
        u(w5Var);
        return w5Var;
    }

    @Override // nb.l8
    public final c7 b() {
        c7 c7Var = this.f25536g;
        u(c7Var);
        return c7Var;
    }

    @Override // nb.l8
    public final f c() {
        return this.f25532c;
    }

    @Override // nb.l8
    public final Context d() {
        return this.f25531a;
    }

    @Override // nb.l8
    public final u9.e e() {
        return this.f25540k;
    }

    public final boolean f() {
        return this.f25554y != null && this.f25554y.booleanValue();
    }

    public final boolean g() {
        return h() == 0;
    }

    public final int h() {
        c7 c7Var = this.f25536g;
        u(c7Var);
        c7Var.h();
        k kVar = this.f25533d;
        if (kVar.L()) {
            return 1;
        }
        u(c7Var);
        c7Var.h();
        if (!this.f25555z) {
            return 8;
        }
        k6 k6Var = this.f25534e;
        s(k6Var);
        Boolean boolT = k6Var.t();
        if (boolT != null) {
            return boolT.booleanValue() ? 0 : 3;
        }
        f fVar = kVar.f25625a.f25532c;
        Boolean boolJ = kVar.J("firebase_analytics_collection_enabled");
        if (boolJ != null) {
            return boolJ.booleanValue() ? 0 : 4;
        }
        return (this.f25554y == null || this.f25554y.booleanValue()) ? 0 : 7;
    }

    public final void i(boolean z10) {
        c7 c7Var = this.f25536g;
        u(c7Var);
        c7Var.h();
        this.f25555z = z10;
    }

    public final boolean j() {
        c7 c7Var = this.f25536g;
        u(c7Var);
        c7Var.h();
        return this.f25555z;
    }

    public final void k() {
        this.A++;
    }

    public final void l() {
        this.C.incrementAndGet();
    }

    public final boolean m() {
        if (!this.f25551v) {
            throw new IllegalStateException("AppMeasurement is not initialized");
        }
        c7 c7Var = this.f25536g;
        u(c7Var);
        c7Var.h();
        Boolean bool = this.f25552w;
        if (bool == null || this.f25553x == 0 || (!bool.booleanValue() && Math.abs(this.f25540k.b() - this.f25553x) > 1000)) {
            this.f25553x = this.f25540k.b();
            ve veVar = this.f25538i;
            s(veVar);
            boolean z10 = false;
            if (veVar.M("android.permission.INTERNET")) {
                s(veVar);
                if (veVar.M("android.permission.ACCESS_NETWORK_STATE")) {
                    Context context = this.f25531a;
                    if (w9.c.a(context).f() || this.f25533d.m() || (ve.j0(context) && ve.E(context, false))) {
                        z10 = true;
                    }
                }
            }
            Boolean boolValueOf = Boolean.valueOf(z10);
            this.f25552w = boolValueOf;
            if (boolValueOf.booleanValue()) {
                s(veVar);
                this.f25552w = Boolean.valueOf(veVar.o(L().r()));
            }
        }
        return this.f25552w.booleanValue();
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
        x xVarH;
        int i10;
        String str;
        c7 c7Var = this.f25536g;
        u(c7Var);
        c7Var.h();
        va vaVar = this.f25544o;
        u(vaVar);
        u(vaVar);
        String strQ = L().q();
        if (!this.f25533d.M()) {
            w5 w5Var = this.f25535f;
            u(w5Var);
            w5Var.w().a("ADID collection is disabled from Manifest. Skipping");
            return false;
        }
        k6 k6Var = this.f25534e;
        s(k6Var);
        Pair pairO = k6Var.o(strQ);
        if (((Boolean) pairO.second).booleanValue() || TextUtils.isEmpty((CharSequence) pairO.first)) {
            w5 w5Var2 = this.f25535f;
            u(w5Var2);
            w5Var2.w().a("ADID unavailable to retrieve Deferred Deep Link. Skipping");
            return false;
        }
        u(vaVar);
        vaVar.l();
        ConnectivityManager connectivityManager = (ConnectivityManager) vaVar.f25625a.f25531a.getSystemService("connectivity");
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
            w5 w5Var3 = this.f25535f;
            u(w5Var3);
            w5Var3.r().a("Network is not available for Deferred Deep Link request. Skipping");
            return false;
        }
        StringBuilder sb2 = new StringBuilder();
        tc tcVarJ = J();
        tcVarJ.h();
        tcVarJ.j();
        if (tcVarJ.y()) {
            ve veVar = tcVarJ.f25625a.f25538i;
            s(veVar);
            if (veVar.W() >= 234200) {
                qa qaVar = this.f25542m;
                t(qaVar);
                g7 g7Var = qaVar.f25625a;
                qaVar.h();
                zzao zzaoVarL0 = g7Var.J().l0();
                if (zzaoVarL0 != null) {
                }
                if (bundle == null) {
                    i10 = this.B;
                    this.B = i10 + 1;
                    if (i10 < 10) {
                    }
                    w5 w5Var4 = this.f25535f;
                    u(w5Var4);
                    if (i10 < 10) {
                        str = "Retrying.";
                    } else {
                        str = "Skipping.";
                    }
                    u5 u5VarV = w5Var4.v();
                    StringBuilder sb3 = new StringBuilder(str.length() + 60);
                    sb3.append("Failed to retrieve DMA consent from the service, ");
                    sb3.append(str);
                    sb3.append(" retryCount");
                    u5VarV.b(sb3.toString(), Integer.valueOf(this.B));
                    return z;
                }
                q8 q8VarE = q8.e(bundle, 100);
                sb2.append("&gcs=");
                sb2.append(q8VarE.k());
                xVarH = x.h(bundle, 100);
                sb2.append("&dma=");
                sb2.append(!Objects.equals(xVarH.j(), Boolean.FALSE) ? 1 : 0);
                if (!TextUtils.isEmpty(xVarH.k())) {
                    sb2.append("&dma_cps=");
                    sb2.append(xVarH.k());
                }
                int i11 = !Objects.equals(x.i(bundle), Boolean.TRUE) ? 1 : 0;
                sb2.append("&npa=");
                sb2.append(i11);
                w5 w5Var5 = this.f25535f;
                u(w5Var5);
                w5Var5.w().b("Consent query parameters to Bow", sb2);
            }
        } else {
            qa qaVar2 = this.f25542m;
            t(qaVar2);
            g7 g7Var2 = qaVar2.f25625a;
            qaVar2.h();
            zzao zzaoVarL1 = g7Var2.J().l0();
            bundle = zzaoVarL1 != null ? zzaoVarL1.f7420f : null;
            if (bundle == null) {
                i10 = this.B;
                this.B = i10 + 1;
                boolean z10 = i10 < 10;
                w5 w5Var6 = this.f25535f;
                u(w5Var6);
                if (i10 < 10) {
                    str = "Retrying.";
                } else {
                    str = "Skipping.";
                }
                u5 u5VarV2 = w5Var6.v();
                StringBuilder sb4 = new StringBuilder(str.length() + 60);
                sb4.append("Failed to retrieve DMA consent from the service, ");
                sb4.append(str);
                sb4.append(" retryCount");
                u5VarV2.b(sb4.toString(), Integer.valueOf(this.B));
                return z10;
            }
            q8 q8VarE2 = q8.e(bundle, 100);
            sb2.append("&gcs=");
            sb2.append(q8VarE2.k());
            xVarH = x.h(bundle, 100);
            sb2.append("&dma=");
            sb2.append(!Objects.equals(xVarH.j(), Boolean.FALSE) ? 1 : 0);
            if (!TextUtils.isEmpty(xVarH.k())) {
                sb2.append("&dma_cps=");
                sb2.append(xVarH.k());
            }
            int i12 = !Objects.equals(x.i(bundle), Boolean.TRUE) ? 1 : 0;
            sb2.append("&npa=");
            sb2.append(i12);
            w5 w5Var7 = this.f25535f;
            u(w5Var7);
            w5Var7.w().b("Consent query parameters to Bow", sb2);
        }
        ve veVar2 = this.f25538i;
        s(veVar2);
        L().f25625a.f25533d.A();
        String str2 = (String) pairO.first;
        k6 k6Var2 = this.f25534e;
        s(k6Var2);
        URL urlI0 = veVar2.i0(133005L, strQ, str2, k6Var2.f25687v.a() - 1, sb2.toString());
        if (urlI0 != null) {
            va vaVar2 = this.f25544o;
            u(vaVar2);
            sa saVar = new sa() { // from class: nb.f7
                @Override // nb.sa
                public final /* synthetic */ void a(String str3, int i13, Throwable th2, byte[] bArr, Map map) {
                    this.f25510a.o(str3, i13, th2, bArr, map);
                }
            };
            vaVar2.l();
            n9.m.l(urlI0);
            n9.m.l(saVar);
            c7 c7Var2 = vaVar2.f25625a.f25536g;
            u(c7Var2);
            c7Var2.w(new ua(vaVar2, strQ, urlI0, null, null, saVar));
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
            w5 w5Var = this.f25535f;
            u(w5Var);
            w5Var.r().c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i11), th2);
        }
        i11 = i10;
        if (th2 == null) {
            k6 k6Var = this.f25534e;
            s(k6Var);
            k6Var.f25686u.b(true);
            if (bArr == null || bArr.length == 0) {
                w5 w5Var2 = this.f25535f;
                u(w5Var2);
                w5Var2.v().a("Deferred Deep Link response empty.");
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(new String(bArr));
                String strOptString = jSONObject.optString("deeplink", "");
                if (TextUtils.isEmpty(strOptString)) {
                    w5 w5Var3 = this.f25535f;
                    u(w5Var3);
                    w5Var3.v().a("Deferred Deep Link is empty.");
                    return;
                }
                String strOptString2 = jSONObject.optString("gclid", "");
                String strOptString3 = jSONObject.optString("gbraid", "");
                String strOptString4 = jSONObject.optString("gad_source", "");
                double dOptDouble = jSONObject.optDouble("timestamp", 0.0d);
                Bundle bundle = new Bundle();
                ve veVar = this.f25538i;
                s(veVar);
                g7 g7Var = veVar.f25625a;
                if (!TextUtils.isEmpty(strOptString)) {
                    Context context = g7Var.f25531a;
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
                        this.f25542m.t("auto", "_cmp", bundle);
                        s(veVar);
                        if (TextUtils.isEmpty(strOptString)) {
                            return;
                        }
                        try {
                            SharedPreferences.Editor editorEdit = context.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                            editorEdit.putString("deeplink", strOptString);
                            editorEdit.putLong("timestamp", Double.doubleToRawLongBits(dOptDouble));
                            if (editorEdit.commit()) {
                                Intent intent = new Intent("android.google.analytics.action.DEEPLINK_ACTION");
                                Context context2 = veVar.f25625a.f25531a;
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
                            w5 w5Var4 = veVar.f25625a.f25535f;
                            u(w5Var4);
                            w5Var4.o().b("Failed to persist Deferred Deep Link. exception", e10);
                            return;
                        }
                    }
                }
                w5 w5Var5 = this.f25535f;
                u(w5Var5);
                w5Var5.r().d("Deferred Deep Link validation failed. gclid, gbraid, deep link", strOptString2, strOptString3, strOptString);
                return;
            } catch (JSONException e11) {
                w5 w5Var6 = this.f25535f;
                u(w5Var6);
                w5Var6.o().b("Failed to parse the Deferred Deep Link response. exception", e11);
                return;
            }
        }
        w5 w5Var7 = this.f25535f;
        u(w5Var7);
        w5Var7.r().c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i11), th2);
    }

    public final /* synthetic */ void p(x8 x8Var) {
        c7 c7Var = this.f25536g;
        u(c7Var);
        c7Var.h();
        k kVar = this.f25533d;
        kVar.u();
        z zVar = new z(this);
        zVar.m();
        this.f25548s = zVar;
        zzdd zzddVar = x8Var.f26106d;
        k5 k5Var = new k5(this, x8Var.f26105c, zzddVar == null ? 0L : zzddVar.f6971f);
        k5Var.k();
        this.f25549t = k5Var;
        n5 n5Var = new n5(this);
        n5Var.k();
        this.f25546q = n5Var;
        tc tcVar = new tc(this);
        tcVar.k();
        this.f25547r = tcVar;
        ve veVar = this.f25538i;
        veVar.n();
        this.f25534e.n();
        this.f25549t.l();
        xa xaVar = new xa(this);
        xaVar.k();
        this.f25550u = xaVar;
        xaVar.l();
        w5 w5Var = this.f25535f;
        u(w5Var);
        u5 u5VarU = w5Var.u();
        kVar.A();
        u5VarU.b("App measurement initialized, version", 133005L);
        u(w5Var);
        w5Var.u().a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String strQ = k5Var.q();
        s(veVar);
        if (veVar.P(strQ, kVar.R())) {
            u(w5Var);
            w5Var.u().a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
        } else {
            u(w5Var);
            w5Var.u().a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strQ)));
        }
        u(w5Var);
        w5Var.v().a("Debug-level message logging enabled");
        int i10 = this.A;
        AtomicInteger atomicInteger = this.C;
        if (i10 != atomicInteger.get()) {
            u(w5Var);
            w5Var.o().c("Not all components initialized", Integer.valueOf(this.A), Integer.valueOf(atomicInteger.get()));
        }
        this.f25551v = true;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0034  */
    /* JADX WARN: Code duplicated, block: B:13:0x006b  */
    /* JADX WARN: Code duplicated, block: B:20:0x00af  */
    /* JADX WARN: Code duplicated, block: B:9:0x0032 A[DONT_INVERT] */
    public final void v(zzdd zzddVar) {
        q8 q8VarA;
        Bundle bundle;
        c7 c7Var = this.f25536g;
        u(c7Var);
        c7Var.h();
        com.google.android.gms.internal.measurement.k7 k7VarQ = N().q();
        com.google.android.gms.internal.measurement.k7 k7Var = com.google.android.gms.internal.measurement.k7.CLIENT_UPLOAD_ELIGIBLE;
        vf.a();
        y4 y4Var = z4.R0;
        k kVar = this.f25533d;
        boolean zH = kVar.H(null, y4Var);
        boolean z10 = k7VarQ == k7Var;
        if (zH) {
            ve veVar = this.f25538i;
            s(veVar);
            if (veVar.G()) {
                ve veVar2 = this.f25538i;
                s(veVar2);
                veVar2.h();
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                bf bfVar = new bf(veVar2.f25625a);
                g7 g7Var = veVar2.f25625a;
                l2.b.m(g7Var.f25531a, bfVar, intentFilter, 2);
                w5 w5Var = g7Var.f25535f;
                u(w5Var);
                w5Var.v().a("Registered app receiver");
                if (z10) {
                    N().o(((Long) z4.C.b(null)).longValue());
                }
            } else if (z10) {
                z10 = true;
                ve veVar3 = this.f25538i;
                s(veVar3);
                veVar3.h();
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                intentFilter2.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                bf bfVar2 = new bf(veVar3.f25625a);
                g7 g7Var2 = veVar3.f25625a;
                l2.b.m(g7Var2.f25531a, bfVar2, intentFilter2, 2);
                w5 w5Var2 = g7Var2.f25535f;
                u(w5Var2);
                w5Var2.v().a("Registered app receiver");
                if (z10) {
                    N().o(((Long) z4.C.b(null)).longValue());
                }
            }
        } else if (z10) {
            z10 = true;
            ve veVar4 = this.f25538i;
            s(veVar4);
            veVar4.h();
            IntentFilter intentFilter3 = new IntentFilter();
            intentFilter3.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
            intentFilter3.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
            bf bfVar3 = new bf(veVar4.f25625a);
            g7 g7Var3 = veVar4.f25625a;
            l2.b.m(g7Var3.f25531a, bfVar3, intentFilter3, 2);
            w5 w5Var3 = g7Var3.f25535f;
            u(w5Var3);
            w5Var3.v().a("Registered app receiver");
            if (z10) {
                N().o(((Long) z4.C.b(null)).longValue());
            }
        }
        k6 k6Var = this.f25534e;
        s(k6Var);
        q8 q8VarW = k6Var.w();
        int iB = q8VarW.b();
        n8 n8VarO = kVar.O("google_analytics_default_allow_ad_storage", false);
        n8 n8VarO2 = kVar.O("google_analytics_default_allow_analytics_storage", false);
        n8 n8Var = n8.UNINITIALIZED;
        if (n8VarO == n8Var && n8VarO2 == n8Var) {
            if (!TextUtils.isEmpty(L().r())) {
                qa qaVar = this.f25542m;
                t(qaVar);
                qaVar.q0(new q8(null, null, -10), false);
            }
            q8VarA = null;
        } else {
            s(k6Var);
            if (k6Var.v(-10)) {
                q8VarA = q8.a(n8VarO, n8VarO2, -10);
            } else {
                if (!TextUtils.isEmpty(L().r()) && (iB == 0 || iB == 30 || iB == 10 || iB == 40)) {
                    qa qaVar2 = this.f25542m;
                    t(qaVar2);
                    qaVar2.q0(new q8(null, null, -10), false);
                }
                q8VarA = null;
            }
        }
        if (q8VarA != null) {
            qa qaVar3 = this.f25542m;
            t(qaVar3);
            qaVar3.q0(q8VarA, true);
            q8VarW = q8VarA;
        }
        qa qaVar4 = this.f25542m;
        t(qaVar4);
        qaVar4.o(q8VarW);
        s(k6Var);
        int iB2 = k6Var.u().b();
        n8 n8VarO3 = kVar.O("google_analytics_default_allow_ad_personalization_signals", true);
        if (n8VarO3 != n8Var) {
            w5 w5Var4 = this.f25535f;
            u(w5Var4);
            w5Var4.w().b("Default ad personalization consent from Manifest", n8VarO3);
        }
        n8 n8VarO4 = kVar.O("google_analytics_default_allow_ad_user_data", true);
        if (n8VarO4 != n8Var && q8.u(-10, iB2)) {
            t(qaVar4);
            qaVar4.p0(x.a(n8VarO4, -10), true);
        } else if (!TextUtils.isEmpty(L().r()) && (iB2 == 0 || iB2 == 30)) {
            t(qaVar4);
            qaVar4.p0(new x((Boolean) null, -10, (Boolean) null, (String) null), true);
        } else if (TextUtils.isEmpty(L().r()) && zzddVar != null && (bundle = zzddVar.f6974i) != null && q8.u(30, iB2)) {
            x xVarH = x.h(bundle, 30);
            if (xVarH.d()) {
                t(qaVar4);
                qaVar4.p0(xVarH, true);
            }
        }
        Boolean boolJ = kVar.J("google_analytics_tcf_data_enabled");
        if (boolJ == null || boolJ.booleanValue()) {
            w5 w5Var5 = this.f25535f;
            u(w5Var5);
            w5Var5.v().a("TCF client enabled.");
            t(qaVar4);
            qaVar4.s();
            t(qaVar4);
            qaVar4.r();
        }
        s(k6Var);
        h6 h6Var = k6Var.f25671f;
        if (h6Var.a() == 0) {
            w5 w5Var6 = this.f25535f;
            u(w5Var6);
            long j10 = this.D;
            w5Var6.w().b("Persisting first open", Long.valueOf(j10));
            s(k6Var);
            h6Var.b(j10);
        }
        t(qaVar4);
        qaVar4.f25906r.c();
        if (m()) {
            if (!TextUtils.isEmpty(L().r())) {
                ve veVar5 = this.f25538i;
                s(veVar5);
                String strR = L().r();
                s(k6Var);
                k6Var.h();
                if (veVar5.p(strR, k6Var.p().getString("gmp_app_id", null))) {
                    w5 w5Var7 = this.f25535f;
                    u(w5Var7);
                    w5Var7.u().a("Rechecking which service to use due to a GMP App Id change");
                    s(k6Var);
                    k6Var.h();
                    Boolean boolT = k6Var.t();
                    SharedPreferences.Editor editorEdit = k6Var.p().edit();
                    editorEdit.clear();
                    editorEdit.apply();
                    if (boolT != null) {
                        k6Var.s(boolT);
                    }
                    E().o();
                    this.f25547r.A();
                    this.f25547r.w();
                    s(k6Var);
                    h6Var.b(this.D);
                    s(k6Var);
                    k6Var.f25673h.b(null);
                }
                s(k6Var);
                String strR2 = L().r();
                k6Var.h();
                SharedPreferences.Editor editorEdit2 = k6Var.p().edit();
                editorEdit2.putString("gmp_app_id", strR2);
                editorEdit2.apply();
            }
            s(k6Var);
            if (!k6Var.w().o(p8.ANALYTICS_STORAGE)) {
                s(k6Var);
                k6Var.f25673h.b(null);
            }
            t(qaVar4);
            s(k6Var);
            qaVar4.E(k6Var.f25673h.a());
            ve veVar6 = this.f25538i;
            s(veVar6);
            try {
                veVar6.f25625a.f25531a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
            } catch (ClassNotFoundException unused) {
                k6 k6Var2 = this.f25534e;
                s(k6Var2);
                j6 j6Var = k6Var2.f25688w;
                if (!TextUtils.isEmpty(j6Var.a())) {
                    w5 w5Var8 = this.f25535f;
                    u(w5Var8);
                    w5Var8.r().a("Remote config removed with active feature rollouts");
                    s(k6Var2);
                    j6Var.b(null);
                }
            }
            if (!TextUtils.isEmpty(L().r())) {
                boolean zG = g();
                k6 k6Var3 = this.f25534e;
                s(k6Var3);
                if (!k6Var3.z() && !this.f25533d.L()) {
                    s(k6Var3);
                    k6Var3.y(!zG);
                }
                if (zG) {
                    qa qaVar5 = this.f25542m;
                    t(qaVar5);
                    qaVar5.H();
                }
                ld ldVar = this.f25537h;
                t(ldVar);
                ldVar.f25734e.a();
                J().q(new AtomicReference());
                tc tcVarJ = J();
                s(k6Var3);
                tcVarJ.v(k6Var3.f25691z.a());
            }
        } else if (g()) {
            ve veVar7 = this.f25538i;
            s(veVar7);
            if (!veVar7.M("android.permission.INTERNET")) {
                w5 w5Var9 = this.f25535f;
                u(w5Var9);
                w5Var9.o().a("App is missing INTERNET permission");
            }
            s(veVar7);
            if (!veVar7.M("android.permission.ACCESS_NETWORK_STATE")) {
                w5 w5Var10 = this.f25535f;
                u(w5Var10);
                w5Var10.o().a("App is missing ACCESS_NETWORK_STATE permission");
            }
            Context context = this.f25531a;
            if (!w9.c.a(context).f() && !this.f25533d.m()) {
                if (!ve.j0(context)) {
                    w5 w5Var11 = this.f25535f;
                    u(w5Var11);
                    w5Var11.o().a("AppMeasurementReceiver not registered/enabled");
                }
                if (!ve.E(context, false)) {
                    w5 w5Var12 = this.f25535f;
                    u(w5Var12);
                    w5Var12.o().a("AppMeasurementService not registered/enabled");
                }
            }
            w5 w5Var13 = this.f25535f;
            u(w5Var13);
            w5Var13.o().a("Uploading is not possible. App measurement disabled");
        }
        vf.a();
        if (this.f25533d.H(null, z4.R0)) {
            ve veVar8 = this.f25538i;
            s(veVar8);
            if (veVar8.G()) {
                long jMax = Math.max(500L, ((((long) ((Integer) z4.f26209y0.b(null)).intValue()) * 1000) + ((long) new Random().nextInt(BacktraceANRSettings.DEFAULT_ANR_TIMEOUT))) - this.f25540k.b());
                if (jMax > 500) {
                    w5 w5Var14 = this.f25535f;
                    u(w5Var14);
                    w5Var14.w().b("Waiting to fetch trigger URIs until some time after boot. Delay in millis", Long.valueOf(jMax));
                }
                qa qaVar6 = this.f25542m;
                t(qaVar6);
                qaVar6.s0(jMax);
            }
        }
        k6 k6Var4 = this.f25534e;
        s(k6Var4);
        k6Var4.f25681p.b(true);
    }

    public final k w() {
        return this.f25533d;
    }

    public final k6 x() {
        k6 k6Var = this.f25534e;
        s(k6Var);
        return k6Var;
    }

    public final w5 y() {
        w5 w5Var = this.f25535f;
        if (w5Var == null || !w5Var.k()) {
            return null;
        }
        return w5Var;
    }

    public final ld z() {
        ld ldVar = this.f25537h;
        t(ldVar);
        return ldVar;
    }
}
