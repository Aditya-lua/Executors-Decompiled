package p306nb;

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
import com.google.android.gms.internal.measurement.AbstractC2175l9;
import com.google.android.gms.internal.measurement.C2361vf;
import com.google.android.gms.internal.measurement.EnumC2155k7;
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
import p261l2.C7975b;
import p305n9.C8953m;
import p462u9.C11817h;
import p462u9.InterfaceC11814e;
import p511w9.C12327c;

/* JADX INFO: renamed from: nb.g7 */
/* JADX INFO: loaded from: classes.dex */
public final class C9094g7 implements InterfaceC9175l8 {

    /* JADX INFO: renamed from: E */
    public static volatile C9094g7 f32945E;

    /* JADX INFO: renamed from: A */
    public int f32946A;

    /* JADX INFO: renamed from: B */
    public int f32947B;

    /* JADX INFO: renamed from: D */
    public final long f32949D;

    /* JADX INFO: renamed from: a */
    public final Context f32950a;

    /* JADX INFO: renamed from: b */
    public final boolean f32951b;

    /* JADX INFO: renamed from: c */
    public final C9070f f32952c;

    /* JADX INFO: renamed from: d */
    public final C9150k f32953d;

    /* JADX INFO: renamed from: e */
    public final C9157k6 f32954e;

    /* JADX INFO: renamed from: f */
    public final C9348w5 f32955f;

    /* JADX INFO: renamed from: g */
    public final C9027c7 f32956g;

    /* JADX INFO: renamed from: h */
    public final C9180ld f32957h;

    /* JADX INFO: renamed from: i */
    public final C9341ve f32958i;

    /* JADX INFO: renamed from: j */
    public final C9236p5 f32959j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC11814e f32960k;

    /* JADX INFO: renamed from: l */
    public final C9146jb f32961l;

    /* JADX INFO: renamed from: m */
    public final C9257qa f32962m;

    /* JADX INFO: renamed from: n */
    public final C9376y1 f32963n;

    /* JADX INFO: renamed from: o */
    public final C9337va f32964o;

    /* JADX INFO: renamed from: p */
    public final String f32965p;

    /* JADX INFO: renamed from: q */
    public C9204n5 f32966q;

    /* JADX INFO: renamed from: r */
    public C9307tc f32967r;

    /* JADX INFO: renamed from: s */
    public C9390z f32968s;

    /* JADX INFO: renamed from: t */
    public C9156k5 f32969t;

    /* JADX INFO: renamed from: u */
    public C9369xa f32970u;

    /* JADX INFO: renamed from: w */
    public Boolean f32972w;

    /* JADX INFO: renamed from: x */
    public long f32973x;

    /* JADX INFO: renamed from: y */
    public volatile Boolean f32974y;

    /* JADX INFO: renamed from: z */
    public volatile boolean f32975z;

    /* JADX INFO: renamed from: v */
    public boolean f32971v = false;

    /* JADX INFO: renamed from: C */
    public final AtomicInteger f32948C = new AtomicInteger(0);

    public C9094g7(C9367x8 c9367x8) {
        C8953m.m36047l(c9367x8);
        Context context = c9367x8.f33649a;
        C9070f c9070f = new C9070f(context);
        this.f32952c = c9070f;
        C9283s4.f33450a = c9070f;
        this.f32950a = context;
        this.f32951b = c9367x8.f33653e;
        this.f32974y = c9367x8.f33650b;
        this.f32965p = c9367x8.f33655g;
        this.f32975z = true;
        AbstractC2175l9.m10361b(context);
        InterfaceC11814e interfaceC11814eM44180c = C11817h.m44180c();
        this.f32960k = interfaceC11814eM44180c;
        Long l10 = c9367x8.f33654f;
        this.f32949D = l10 != null ? l10.longValue() : interfaceC11814eM44180c.mo44175a();
        this.f32953d = new C9150k(this);
        C9157k6 c9157k6 = new C9157k6(this);
        c9157k6.m36456m();
        this.f32954e = c9157k6;
        C9348w5 c9348w5 = new C9348w5(this);
        c9348w5.m36456m();
        this.f32955f = c9348w5;
        C9341ve c9341ve = new C9341ve(this);
        c9341ve.m36456m();
        this.f32958i = c9341ve;
        this.f32959j = new C9236p5(new C9351w8(c9367x8, this));
        this.f32963n = new C9376y1(this);
        C9146jb c9146jb = new C9146jb(this);
        c9146jb.m36122k();
        this.f32961l = c9146jb;
        C9257qa c9257qa = new C9257qa(this);
        c9257qa.m36122k();
        this.f32962m = c9257qa;
        C9180ld c9180ld = new C9180ld(this);
        c9180ld.m36122k();
        this.f32957h = c9180ld;
        C9337va c9337va = new C9337va(this);
        c9337va.m36456m();
        this.f32964o = c9337va;
        C9027c7 c9027c7 = new C9027c7(this);
        c9027c7.m36456m();
        this.f32956g = c9027c7;
        zzdd zzddVar = c9367x8.f33652d;
        boolean z10 = zzddVar == null || zzddVar.f8888g == 0;
        if (context.getApplicationContext() instanceof Application) {
            m36304t(c9257qa);
            if (c9257qa.f33067a.f32950a.getApplicationContext() instanceof Application) {
                Application application = (Application) c9257qa.f33067a.f32950a.getApplicationContext();
                if (c9257qa.f33392c == null) {
                    c9257qa.f33392c = new C9047da(c9257qa);
                }
                if (z10) {
                    application.unregisterActivityLifecycleCallbacks(c9257qa.f33392c);
                    application.registerActivityLifecycleCallbacks(c9257qa.f33392c);
                    C9348w5 c9348w6 = c9257qa.f33067a.f32955f;
                    m36305u(c9348w6);
                    c9348w6.m37011w().m36911a("Registered activity lifecycle callback");
                }
            }
        } else {
            m36305u(c9348w5);
            c9348w5.m37006r().m36911a("Application context is not an Application");
        }
        c9027c7.m36263t(new RunnableC9061e7(this, c9367x8));
    }

    /* JADX INFO: renamed from: O */
    public static C9094g7 m36300O(Context context, zzdd zzddVar, Long l10) {
        Bundle bundle;
        if (zzddVar != null) {
            Bundle bundle2 = zzddVar.f8890i;
            zzddVar = new zzdd(zzddVar.f8887f, zzddVar.f8888g, zzddVar.f8889h, bundle2, null);
        }
        C8953m.m36047l(context);
        C8953m.m36047l(context.getApplicationContext());
        if (f32945E == null) {
            synchronized (C9094g7.class) {
                try {
                    if (f32945E == null) {
                        f32945E = new C9094g7(new C9367x8(context, zzddVar, l10));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } else if (zzddVar != null && (bundle = zzddVar.f8890i) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            C8953m.m36047l(f32945E);
            f32945E.f32974y = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled"));
        }
        C8953m.m36047l(f32945E);
        return f32945E;
    }

    /* JADX INFO: renamed from: q */
    public static final void m36301q() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    /* JADX INFO: renamed from: r */
    public static final void m36302r(C8990a4 c8990a4) {
        if (c8990a4 == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    /* JADX INFO: renamed from: s */
    public static final void m36303s(C9143j8 c9143j8) {
        if (c9143j8 == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    /* JADX INFO: renamed from: t */
    public static final void m36304t(AbstractC9008b5 abstractC9008b5) {
        if (abstractC9008b5 == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!abstractC9008b5.m36120i()) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(abstractC9008b5.getClass())));
        }
    }

    /* JADX INFO: renamed from: u */
    public static final void m36305u(AbstractC9159k8 abstractC9159k8) {
        if (abstractC9159k8 == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!abstractC9159k8.m36454k()) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(abstractC9159k8.getClass())));
        }
    }

    /* JADX INFO: renamed from: A */
    public final C9027c7 m36306A() {
        return this.f32956g;
    }

    /* JADX INFO: renamed from: B */
    public final C9257qa m36307B() {
        C9257qa c9257qa = this.f32962m;
        m36304t(c9257qa);
        return c9257qa;
    }

    /* JADX INFO: renamed from: C */
    public final C9341ve m36308C() {
        C9341ve c9341ve = this.f32958i;
        m36303s(c9341ve);
        return c9341ve;
    }

    /* JADX INFO: renamed from: D */
    public final C9236p5 m36309D() {
        return this.f32959j;
    }

    /* JADX INFO: renamed from: E */
    public final C9204n5 m36310E() {
        m36304t(this.f32966q);
        return this.f32966q;
    }

    /* JADX INFO: renamed from: F */
    public final C9337va m36311F() {
        C9337va c9337va = this.f32964o;
        m36305u(c9337va);
        return c9337va;
    }

    /* JADX INFO: renamed from: G */
    public final boolean m36312G() {
        return this.f32951b;
    }

    /* JADX INFO: renamed from: H */
    public final String m36313H() {
        return this.f32965p;
    }

    /* JADX INFO: renamed from: I */
    public final C9146jb m36314I() {
        C9146jb c9146jb = this.f32961l;
        m36304t(c9146jb);
        return c9146jb;
    }

    /* JADX INFO: renamed from: J */
    public final C9307tc m36315J() {
        m36304t(this.f32967r);
        return this.f32967r;
    }

    /* JADX INFO: renamed from: K */
    public final C9390z m36316K() {
        m36305u(this.f32968s);
        return this.f32968s;
    }

    /* JADX INFO: renamed from: L */
    public final C9156k5 m36317L() {
        m36304t(this.f32969t);
        return this.f32969t;
    }

    /* JADX INFO: renamed from: M */
    public final C9376y1 m36318M() {
        C9376y1 c9376y1 = this.f32963n;
        m36302r(c9376y1);
        return c9376y1;
    }

    /* JADX INFO: renamed from: N */
    public final C9369xa m36319N() {
        m36302r(this.f32970u);
        return this.f32970u;
    }

    /* JADX INFO: renamed from: P */
    public final void m36320P(boolean z10) {
        this.f32974y = Boolean.valueOf(z10);
    }

    @Override // p306nb.InterfaceC9175l8
    /* JADX INFO: renamed from: a */
    public final C9348w5 mo36321a() {
        C9348w5 c9348w5 = this.f32955f;
        m36305u(c9348w5);
        return c9348w5;
    }

    @Override // p306nb.InterfaceC9175l8
    /* JADX INFO: renamed from: b */
    public final C9027c7 mo36322b() {
        C9027c7 c9027c7 = this.f32956g;
        m36305u(c9027c7);
        return c9027c7;
    }

    @Override // p306nb.InterfaceC9175l8
    /* JADX INFO: renamed from: c */
    public final C9070f mo36323c() {
        return this.f32952c;
    }

    @Override // p306nb.InterfaceC9175l8
    /* JADX INFO: renamed from: d */
    public final Context mo36324d() {
        return this.f32950a;
    }

    @Override // p306nb.InterfaceC9175l8
    /* JADX INFO: renamed from: e */
    public final InterfaceC11814e mo36325e() {
        return this.f32960k;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m36326f() {
        return this.f32974y != null && this.f32974y.booleanValue();
    }

    /* JADX INFO: renamed from: g */
    public final boolean m36327g() {
        return m36328h() == 0;
    }

    /* JADX INFO: renamed from: h */
    public final int m36328h() {
        C9027c7 c9027c7 = this.f32956g;
        m36305u(c9027c7);
        c9027c7.mo36088h();
        C9150k c9150k = this.f32953d;
        if (c9150k.m36410L()) {
            return 1;
        }
        m36305u(c9027c7);
        c9027c7.mo36088h();
        if (!this.f32975z) {
            return 8;
        }
        C9157k6 c9157k6 = this.f32954e;
        m36303s(c9157k6);
        Boolean boolM36447t = c9157k6.m36447t();
        if (boolM36447t != null) {
            return boolM36447t.booleanValue() ? 0 : 3;
        }
        C9070f c9070f = c9150k.f33067a.f32952c;
        Boolean boolM36408J = c9150k.m36408J("firebase_analytics_collection_enabled");
        if (boolM36408J != null) {
            return boolM36408J.booleanValue() ? 0 : 4;
        }
        return (this.f32974y == null || this.f32974y.booleanValue()) ? 0 : 7;
    }

    /* JADX INFO: renamed from: i */
    public final void m36329i(boolean z10) {
        C9027c7 c9027c7 = this.f32956g;
        m36305u(c9027c7);
        c9027c7.mo36088h();
        this.f32975z = z10;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m36330j() {
        C9027c7 c9027c7 = this.f32956g;
        m36305u(c9027c7);
        c9027c7.mo36088h();
        return this.f32975z;
    }

    /* JADX INFO: renamed from: k */
    public final void m36331k() {
        this.f32946A++;
    }

    /* JADX INFO: renamed from: l */
    public final void m36332l() {
        this.f32948C.incrementAndGet();
    }

    /* JADX INFO: renamed from: m */
    public final boolean m36333m() {
        if (!this.f32971v) {
            throw new IllegalStateException("AppMeasurement is not initialized");
        }
        C9027c7 c9027c7 = this.f32956g;
        m36305u(c9027c7);
        c9027c7.mo36088h();
        Boolean bool = this.f32972w;
        if (bool == null || this.f32973x == 0 || (!bool.booleanValue() && Math.abs(this.f32960k.mo44176b() - this.f32973x) > 1000)) {
            this.f32973x = this.f32960k.mo44176b();
            C9341ve c9341ve = this.f32958i;
            m36303s(c9341ve);
            boolean z10 = false;
            if (c9341ve.m36946M("android.permission.INTERNET")) {
                m36303s(c9341ve);
                if (c9341ve.m36946M("android.permission.ACCESS_NETWORK_STATE")) {
                    Context context = this.f32950a;
                    if (C12327c.m46181a(context).m46179f() || this.f32953d.m36421m() || (C9341ve.m36930j0(context) && C9341ve.m36924E(context, false))) {
                        z10 = true;
                    }
                }
            }
            Boolean boolValueOf = Boolean.valueOf(z10);
            this.f32972w = boolValueOf;
            if (boolValueOf.booleanValue()) {
                m36303s(c9341ve);
                this.f32972w = Boolean.valueOf(c9341ve.m36967o(m36317L().m36433r()));
            }
        }
        return this.f32972w.booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0089  */
    /* JADX WARN: Code duplicated, block: B:24:0x009d  */
    /* JADX WARN: Code duplicated, block: B:27:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:29:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:36:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:38:0x0116  */
    /* JADX INFO: renamed from: n */
    public final boolean m36334n() {
        NetworkInfo activeNetworkInfo;
        Bundle bundle;
        C9358x c9358xM37017h;
        int i10;
        String str;
        C9027c7 c9027c7 = this.f32956g;
        m36305u(c9027c7);
        c9027c7.mo36088h();
        C9337va c9337va = this.f32964o;
        m36305u(c9337va);
        m36305u(c9337va);
        String strM36432q = m36317L().m36432q();
        if (!this.f32953d.m36411M()) {
            C9348w5 c9348w5 = this.f32955f;
            m36305u(c9348w5);
            c9348w5.m37011w().m36911a("ADID collection is disabled from Manifest. Skipping");
            return false;
        }
        C9157k6 c9157k6 = this.f32954e;
        m36303s(c9157k6);
        Pair pairM36442o = c9157k6.m36442o(strM36432q);
        if (((Boolean) pairM36442o.second).booleanValue() || TextUtils.isEmpty((CharSequence) pairM36442o.first)) {
            C9348w5 c9348w6 = this.f32955f;
            m36305u(c9348w6);
            c9348w6.m37011w().m36911a("ADID unavailable to retrieve Deferred Deep Link. Skipping");
            return false;
        }
        m36305u(c9337va);
        c9337va.m36455l();
        ConnectivityManager connectivityManager = (ConnectivityManager) c9337va.f33067a.f32950a.getSystemService("connectivity");
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
            C9348w5 c9348w7 = this.f32955f;
            m36305u(c9348w7);
            c9348w7.m37006r().m36911a("Network is not available for Deferred Deep Link request. Skipping");
            return false;
        }
        StringBuilder sb2 = new StringBuilder();
        C9307tc c9307tcM36315J = m36315J();
        c9307tcM36315J.mo36088h();
        c9307tcM36315J.m36121j();
        if (c9307tcM36315J.m36907y()) {
            C9341ve c9341ve = c9307tcM36315J.f33067a.f32958i;
            m36303s(c9341ve);
            if (c9341ve.m36953W() >= 234200) {
                C9257qa c9257qa = this.f32962m;
                m36304t(c9257qa);
                C9094g7 c9094g7 = c9257qa.f33067a;
                c9257qa.mo36088h();
                zzao zzaoVarM36896l0 = c9094g7.m36315J().m36896l0();
                if (zzaoVarM36896l0 != null) {
                }
                if (bundle == null) {
                    i10 = this.f32947B;
                    this.f32947B = i10 + 1;
                    if (i10 < 10) {
                    }
                    C9348w5 c9348w8 = this.f32955f;
                    m36305u(c9348w8);
                    if (i10 < 10) {
                        str = "Retrying.";
                    } else {
                        str = "Skipping.";
                    }
                    C9316u5 c9316u5M37010v = c9348w8.m37010v();
                    StringBuilder sb3 = new StringBuilder(str.length() + 60);
                    sb3.append("Failed to retrieve DMA consent from the service, ");
                    sb3.append(str);
                    sb3.append(" retryCount");
                    c9316u5M37010v.m36912b(sb3.toString(), Integer.valueOf(this.f32947B));
                    return z;
                }
                C9255q8 c9255q8M36643e = C9255q8.m36643e(bundle, 100);
                sb2.append("&gcs=");
                sb2.append(c9255q8M36643e.m36653k());
                c9358xM37017h = C9358x.m37017h(bundle, 100);
                sb2.append("&dma=");
                sb2.append(!Objects.equals(c9358xM37017h.m37024j(), Boolean.FALSE) ? 1 : 0);
                if (!TextUtils.isEmpty(c9358xM37017h.m37025k())) {
                    sb2.append("&dma_cps=");
                    sb2.append(c9358xM37017h.m37025k());
                }
                int i11 = !Objects.equals(C9358x.m37018i(bundle), Boolean.TRUE) ? 1 : 0;
                sb2.append("&npa=");
                sb2.append(i11);
                C9348w5 c9348w9 = this.f32955f;
                m36305u(c9348w9);
                c9348w9.m37011w().m36912b("Consent query parameters to Bow", sb2);
            }
        } else {
            C9257qa c9257qa2 = this.f32962m;
            m36304t(c9257qa2);
            C9094g7 c9094g8 = c9257qa2.f33067a;
            c9257qa2.mo36088h();
            zzao zzaoVarM36896l1 = c9094g8.m36315J().m36896l0();
            bundle = zzaoVarM36896l1 != null ? zzaoVarM36896l1.f9500f : null;
            if (bundle == null) {
                i10 = this.f32947B;
                this.f32947B = i10 + 1;
                boolean z10 = i10 < 10;
                C9348w5 c9348w10 = this.f32955f;
                m36305u(c9348w10);
                if (i10 < 10) {
                    str = "Retrying.";
                } else {
                    str = "Skipping.";
                }
                C9316u5 c9316u5M37010v2 = c9348w10.m37010v();
                StringBuilder sb4 = new StringBuilder(str.length() + 60);
                sb4.append("Failed to retrieve DMA consent from the service, ");
                sb4.append(str);
                sb4.append(" retryCount");
                c9316u5M37010v2.m36912b(sb4.toString(), Integer.valueOf(this.f32947B));
                return z10;
            }
            C9255q8 c9255q8M36643e2 = C9255q8.m36643e(bundle, 100);
            sb2.append("&gcs=");
            sb2.append(c9255q8M36643e2.m36653k());
            c9358xM37017h = C9358x.m37017h(bundle, 100);
            sb2.append("&dma=");
            sb2.append(!Objects.equals(c9358xM37017h.m37024j(), Boolean.FALSE) ? 1 : 0);
            if (!TextUtils.isEmpty(c9358xM37017h.m37025k())) {
                sb2.append("&dma_cps=");
                sb2.append(c9358xM37017h.m37025k());
            }
            int i12 = !Objects.equals(C9358x.m37018i(bundle), Boolean.TRUE) ? 1 : 0;
            sb2.append("&npa=");
            sb2.append(i12);
            C9348w5 c9348w11 = this.f32955f;
            m36305u(c9348w11);
            c9348w11.m37011w().m36912b("Consent query parameters to Bow", sb2);
        }
        C9341ve c9341ve2 = this.f32958i;
        m36303s(c9341ve2);
        m36317L().f33067a.f32953d.m36399A();
        String str2 = (String) pairM36442o.first;
        C9157k6 c9157k7 = this.f32954e;
        m36303s(c9157k7);
        URL urlM36964i0 = c9341ve2.m36964i0(133005L, strM36432q, str2, c9157k7.f33134v.m36345a() - 1, sb2.toString());
        if (urlM36964i0 != null) {
            C9337va c9337va2 = this.f32964o;
            m36305u(c9337va2);
            InterfaceC9289sa interfaceC9289sa = new InterfaceC9289sa() { // from class: nb.f7
                @Override // p306nb.InterfaceC9289sa
                /* JADX INFO: renamed from: a */
                public final /* synthetic */ void mo36292a(String str3, int i13, Throwable th2, byte[] bArr, Map map) {
                    this.f32916a.m36335o(str3, i13, th2, bArr, map);
                }
            };
            c9337va2.m36455l();
            C8953m.m36047l(urlM36964i0);
            C8953m.m36047l(interfaceC9289sa);
            C9027c7 c9027c8 = c9337va2.f33067a.f32956g;
            m36305u(c9027c8);
            c9027c8.m36266w(new RunnableC9321ua(c9337va2, strM36432q, urlM36964i0, null, null, interfaceC9289sa));
        }
        return false;
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m36335o(String str, int i10, Throwable th2, byte[] bArr, Map map) {
        int i11;
        if (i10 != 200 && i10 != 204) {
            i11 = 304;
            if (i10 != 304) {
                i11 = i10;
            }
            C9348w5 c9348w5 = this.f32955f;
            m36305u(c9348w5);
            c9348w5.m37006r().m36913c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i11), th2);
        }
        i11 = i10;
        if (th2 == null) {
            C9157k6 c9157k6 = this.f32954e;
            m36303s(c9157k6);
            c9157k6.f33133u.m36296b(true);
            if (bArr == null || bArr.length == 0) {
                C9348w5 c9348w6 = this.f32955f;
                m36305u(c9348w6);
                c9348w6.m37010v().m36911a("Deferred Deep Link response empty.");
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(new String(bArr));
                String strOptString = jSONObject.optString("deeplink", "");
                if (TextUtils.isEmpty(strOptString)) {
                    C9348w5 c9348w7 = this.f32955f;
                    m36305u(c9348w7);
                    c9348w7.m37010v().m36911a("Deferred Deep Link is empty.");
                    return;
                }
                String strOptString2 = jSONObject.optString("gclid", "");
                String strOptString3 = jSONObject.optString("gbraid", "");
                String strOptString4 = jSONObject.optString("gad_source", "");
                double dOptDouble = jSONObject.optDouble("timestamp", 0.0d);
                Bundle bundle = new Bundle();
                C9341ve c9341ve = this.f32958i;
                m36303s(c9341ve);
                C9094g7 c9094g7 = c9341ve.f33067a;
                if (!TextUtils.isEmpty(strOptString)) {
                    Context context = c9094g7.f32950a;
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
                        this.f32962m.m36712t("auto", "_cmp", bundle);
                        m36303s(c9341ve);
                        if (TextUtils.isEmpty(strOptString)) {
                            return;
                        }
                        try {
                            SharedPreferences.Editor editorEdit = context.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                            editorEdit.putString("deeplink", strOptString);
                            editorEdit.putLong("timestamp", Double.doubleToRawLongBits(dOptDouble));
                            if (editorEdit.commit()) {
                                Intent intent = new Intent("android.google.analytics.action.DEEPLINK_ACTION");
                                Context context2 = c9341ve.f33067a.f32950a;
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
                            C9348w5 c9348w8 = c9341ve.f33067a.f32955f;
                            m36305u(c9348w8);
                            c9348w8.m37003o().m36912b("Failed to persist Deferred Deep Link. exception", e10);
                            return;
                        }
                    }
                }
                C9348w5 c9348w9 = this.f32955f;
                m36305u(c9348w9);
                c9348w9.m37006r().m36914d("Deferred Deep Link validation failed. gclid, gbraid, deep link", strOptString2, strOptString3, strOptString);
                return;
            } catch (JSONException e11) {
                C9348w5 c9348w10 = this.f32955f;
                m36305u(c9348w10);
                c9348w10.m37003o().m36912b("Failed to parse the Deferred Deep Link response. exception", e11);
                return;
            }
        }
        C9348w5 c9348w11 = this.f32955f;
        m36305u(c9348w11);
        c9348w11.m37006r().m36913c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i11), th2);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m36336p(C9367x8 c9367x8) {
        C9027c7 c9027c7 = this.f32956g;
        m36305u(c9027c7);
        c9027c7.mo36088h();
        C9150k c9150k = this.f32953d;
        c9150k.m36424u();
        C9390z c9390z = new C9390z(this);
        c9390z.m36456m();
        this.f32968s = c9390z;
        zzdd zzddVar = c9367x8.f33652d;
        C9156k5 c9156k5 = new C9156k5(this, c9367x8.f33651c, zzddVar == null ? 0L : zzddVar.f8887f);
        c9156k5.m36122k();
        this.f32969t = c9156k5;
        C9204n5 c9204n5 = new C9204n5(this);
        c9204n5.m36122k();
        this.f32966q = c9204n5;
        C9307tc c9307tc = new C9307tc(this);
        c9307tc.m36122k();
        this.f32967r = c9307tc;
        C9341ve c9341ve = this.f32958i;
        c9341ve.m36457n();
        this.f32954e.m36457n();
        this.f32969t.m36123l();
        C9369xa c9369xa = new C9369xa(this);
        c9369xa.m36122k();
        this.f32970u = c9369xa;
        c9369xa.m36123l();
        C9348w5 c9348w5 = this.f32955f;
        m36305u(c9348w5);
        C9316u5 c9316u5M37009u = c9348w5.m37009u();
        c9150k.m36399A();
        c9316u5M37009u.m36912b("App measurement initialized, version", 133005L);
        m36305u(c9348w5);
        c9348w5.m37009u().m36911a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String strM36432q = c9156k5.m36432q();
        m36303s(c9341ve);
        if (c9341ve.m36947P(strM36432q, c9150k.m36416R())) {
            m36305u(c9348w5);
            c9348w5.m37009u().m36911a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
        } else {
            m36305u(c9348w5);
            c9348w5.m37009u().m36911a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strM36432q)));
        }
        m36305u(c9348w5);
        c9348w5.m37010v().m36911a("Debug-level message logging enabled");
        int i10 = this.f32946A;
        AtomicInteger atomicInteger = this.f32948C;
        if (i10 != atomicInteger.get()) {
            m36305u(c9348w5);
            c9348w5.m37003o().m36913c("Not all components initialized", Integer.valueOf(this.f32946A), Integer.valueOf(atomicInteger.get()));
        }
        this.f32971v = true;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0034  */
    /* JADX WARN: Code duplicated, block: B:13:0x006b  */
    /* JADX WARN: Code duplicated, block: B:20:0x00af  */
    /* JADX WARN: Code duplicated, block: B:9:0x0032 A[DONT_INVERT] */
    /* JADX INFO: renamed from: v */
    public final void m36337v(zzdd zzddVar) {
        C9255q8 c9255q8M36641a;
        Bundle bundle;
        C9027c7 c9027c7 = this.f32956g;
        m36305u(c9027c7);
        c9027c7.mo36088h();
        EnumC2155k7 enumC2155k7M37065q = m36319N().m37065q();
        EnumC2155k7 enumC2155k7 = EnumC2155k7.CLIENT_UPLOAD_ELIGIBLE;
        C2361vf.m10862a();
        C9379y4 c9379y4 = C9395z4.f33740R0;
        C9150k c9150k = this.f32953d;
        boolean zM36406H = c9150k.m36406H(null, c9379y4);
        boolean z10 = enumC2155k7M37065q == enumC2155k7;
        if (zM36406H) {
            C9341ve c9341ve = this.f32958i;
            m36303s(c9341ve);
            if (c9341ve.m36940G()) {
                C9341ve c9341ve2 = this.f32958i;
                m36303s(c9341ve2);
                c9341ve2.mo36088h();
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                C9018bf c9018bf = new C9018bf(c9341ve2.f33067a);
                C9094g7 c9094g7 = c9341ve2.f33067a;
                C7975b.m33015m(c9094g7.f32950a, c9018bf, intentFilter, 2);
                C9348w5 c9348w5 = c9094g7.f32955f;
                m36305u(c9348w5);
                c9348w5.m37010v().m36911a("Registered app receiver");
                if (z10) {
                    m36319N().m37063o(((Long) C9395z4.f33709C.m37079b(null)).longValue());
                }
            } else if (z10) {
                z10 = true;
                C9341ve c9341ve3 = this.f32958i;
                m36303s(c9341ve3);
                c9341ve3.mo36088h();
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                intentFilter2.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                C9018bf c9018bf2 = new C9018bf(c9341ve3.f33067a);
                C9094g7 c9094g8 = c9341ve3.f33067a;
                C7975b.m33015m(c9094g8.f32950a, c9018bf2, intentFilter2, 2);
                C9348w5 c9348w6 = c9094g8.f32955f;
                m36305u(c9348w6);
                c9348w6.m37010v().m36911a("Registered app receiver");
                if (z10) {
                    m36319N().m37063o(((Long) C9395z4.f33709C.m37079b(null)).longValue());
                }
            }
        } else if (z10) {
            z10 = true;
            C9341ve c9341ve4 = this.f32958i;
            m36303s(c9341ve4);
            c9341ve4.mo36088h();
            IntentFilter intentFilter3 = new IntentFilter();
            intentFilter3.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
            intentFilter3.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
            C9018bf c9018bf3 = new C9018bf(c9341ve4.f33067a);
            C9094g7 c9094g9 = c9341ve4.f33067a;
            C7975b.m33015m(c9094g9.f32950a, c9018bf3, intentFilter3, 2);
            C9348w5 c9348w7 = c9094g9.f32955f;
            m36305u(c9348w7);
            c9348w7.m37010v().m36911a("Registered app receiver");
            if (z10) {
                m36319N().m37063o(((Long) C9395z4.f33709C.m37079b(null)).longValue());
            }
        }
        C9157k6 c9157k6 = this.f32954e;
        m36303s(c9157k6);
        C9255q8 c9255q8M36450w = c9157k6.m36450w();
        int iM36651b = c9255q8M36450w.m36651b();
        EnumC9207n8 enumC9207n8M36413O = c9150k.m36413O("google_analytics_default_allow_ad_storage", false);
        EnumC9207n8 enumC9207n8M36413O2 = c9150k.m36413O("google_analytics_default_allow_analytics_storage", false);
        EnumC9207n8 enumC9207n8 = EnumC9207n8.UNINITIALIZED;
        if (enumC9207n8M36413O == enumC9207n8 && enumC9207n8M36413O2 == enumC9207n8) {
            if (!TextUtils.isEmpty(m36317L().m36433r())) {
                C9257qa c9257qa = this.f32962m;
                m36304t(c9257qa);
                c9257qa.m36707q0(new C9255q8(null, null, -10), false);
            }
            c9255q8M36641a = null;
        } else {
            m36303s(c9157k6);
            if (c9157k6.m36449v(-10)) {
                c9255q8M36641a = C9255q8.m36641a(enumC9207n8M36413O, enumC9207n8M36413O2, -10);
            } else {
                if (!TextUtils.isEmpty(m36317L().m36433r()) && (iM36651b == 0 || iM36651b == 30 || iM36651b == 10 || iM36651b == 40)) {
                    C9257qa c9257qa2 = this.f32962m;
                    m36304t(c9257qa2);
                    c9257qa2.m36707q0(new C9255q8(null, null, -10), false);
                }
                c9255q8M36641a = null;
            }
        }
        if (c9255q8M36641a != null) {
            C9257qa c9257qa3 = this.f32962m;
            m36304t(c9257qa3);
            c9257qa3.m36707q0(c9255q8M36641a, true);
            c9255q8M36450w = c9255q8M36641a;
        }
        C9257qa c9257qa4 = this.f32962m;
        m36304t(c9257qa4);
        c9257qa4.m36702o(c9255q8M36450w);
        m36303s(c9157k6);
        int iM37019b = c9157k6.m36448u().m37019b();
        EnumC9207n8 enumC9207n8M36413O3 = c9150k.m36413O("google_analytics_default_allow_ad_personalization_signals", true);
        if (enumC9207n8M36413O3 != enumC9207n8) {
            C9348w5 c9348w8 = this.f32955f;
            m36305u(c9348w8);
            c9348w8.m37011w().m36912b("Default ad personalization consent from Manifest", enumC9207n8M36413O3);
        }
        EnumC9207n8 enumC9207n8M36413O4 = c9150k.m36413O("google_analytics_default_allow_ad_user_data", true);
        if (enumC9207n8M36413O4 != enumC9207n8 && C9255q8.m36650u(-10, iM37019b)) {
            m36304t(c9257qa4);
            c9257qa4.m36705p0(C9358x.m37015a(enumC9207n8M36413O4, -10), true);
        } else if (!TextUtils.isEmpty(m36317L().m36433r()) && (iM37019b == 0 || iM37019b == 30)) {
            m36304t(c9257qa4);
            c9257qa4.m36705p0(new C9358x((Boolean) null, -10, (Boolean) null, (String) null), true);
        } else if (TextUtils.isEmpty(m36317L().m36433r()) && zzddVar != null && (bundle = zzddVar.f8890i) != null && C9255q8.m36650u(30, iM37019b)) {
            C9358x c9358xM37017h = C9358x.m37017h(bundle, 30);
            if (c9358xM37017h.m37021d()) {
                m36304t(c9257qa4);
                c9257qa4.m36705p0(c9358xM37017h, true);
            }
        }
        Boolean boolM36408J = c9150k.m36408J("google_analytics_tcf_data_enabled");
        if (boolM36408J == null || boolM36408J.booleanValue()) {
            C9348w5 c9348w9 = this.f32955f;
            m36305u(c9348w9);
            c9348w9.m37010v().m36911a("TCF client enabled.");
            m36304t(c9257qa4);
            c9257qa4.m36710s();
            m36304t(c9257qa4);
            c9257qa4.m36708r();
        }
        m36303s(c9157k6);
        C9109h6 c9109h6 = c9157k6.f33118f;
        if (c9109h6.m36345a() == 0) {
            C9348w5 c9348w10 = this.f32955f;
            m36305u(c9348w10);
            long j10 = this.f32949D;
            c9348w10.m37011w().m36912b("Persisting first open", Long.valueOf(j10));
            m36303s(c9157k6);
            c9109h6.m36346b(j10);
        }
        m36304t(c9257qa4);
        c9257qa4.f33407r.m36273c();
        if (m36333m()) {
            if (!TextUtils.isEmpty(m36317L().m36433r())) {
                C9341ve c9341ve5 = this.f32958i;
                m36303s(c9341ve5);
                String strM36433r = m36317L().m36433r();
                m36303s(c9157k6);
                c9157k6.mo36088h();
                if (c9341ve5.m36969p(strM36433r, c9157k6.m36443p().getString("gmp_app_id", null))) {
                    C9348w5 c9348w11 = this.f32955f;
                    m36305u(c9348w11);
                    c9348w11.m37009u().m36911a("Rechecking which service to use due to a GMP App Id change");
                    m36303s(c9157k6);
                    c9157k6.mo36088h();
                    Boolean boolM36447t = c9157k6.m36447t();
                    SharedPreferences.Editor editorEdit = c9157k6.m36443p().edit();
                    editorEdit.clear();
                    editorEdit.apply();
                    if (boolM36447t != null) {
                        c9157k6.m36446s(boolM36447t);
                    }
                    m36310E().m36582o();
                    this.f32967r.m36860A();
                    this.f32967r.m36905w();
                    m36303s(c9157k6);
                    c9109h6.m36346b(this.f32949D);
                    m36303s(c9157k6);
                    c9157k6.f33120h.m36370b(null);
                }
                m36303s(c9157k6);
                String strM36433r2 = m36317L().m36433r();
                c9157k6.mo36088h();
                SharedPreferences.Editor editorEdit2 = c9157k6.m36443p().edit();
                editorEdit2.putString("gmp_app_id", strM36433r2);
                editorEdit2.apply();
            }
            m36303s(c9157k6);
            if (!c9157k6.m36450w().m36656o(EnumC9239p8.ANALYTICS_STORAGE)) {
                m36303s(c9157k6);
                c9157k6.f33120h.m36370b(null);
            }
            m36304t(c9257qa4);
            m36303s(c9157k6);
            c9257qa4.m36666E(c9157k6.f33120h.m36369a());
            C9341ve c9341ve6 = this.f32958i;
            m36303s(c9341ve6);
            try {
                c9341ve6.f33067a.f32950a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
            } catch (ClassNotFoundException unused) {
                C9157k6 c9157k7 = this.f32954e;
                m36303s(c9157k7);
                C9141j6 c9141j6 = c9157k7.f33135w;
                if (!TextUtils.isEmpty(c9141j6.m36369a())) {
                    C9348w5 c9348w12 = this.f32955f;
                    m36305u(c9348w12);
                    c9348w12.m37006r().m36911a("Remote config removed with active feature rollouts");
                    m36303s(c9157k7);
                    c9141j6.m36370b(null);
                }
            }
            if (!TextUtils.isEmpty(m36317L().m36433r())) {
                boolean zM36327g = m36327g();
                C9157k6 c9157k8 = this.f32954e;
                m36303s(c9157k8);
                if (!c9157k8.m36453z() && !this.f32953d.m36410L()) {
                    m36303s(c9157k8);
                    c9157k8.m36452y(!zM36327g);
                }
                if (zM36327g) {
                    C9257qa c9257qa5 = this.f32962m;
                    m36304t(c9257qa5);
                    c9257qa5.m36669H();
                }
                C9180ld c9180ld = this.f32957h;
                m36304t(c9180ld);
                c9180ld.f33190e.m36458a();
                m36315J().m36899q(new AtomicReference());
                C9307tc c9307tcM36315J = m36315J();
                m36303s(c9157k8);
                c9307tcM36315J.m36904v(c9157k8.f33138z.m36298a());
            }
        } else if (m36327g()) {
            C9341ve c9341ve7 = this.f32958i;
            m36303s(c9341ve7);
            if (!c9341ve7.m36946M("android.permission.INTERNET")) {
                C9348w5 c9348w13 = this.f32955f;
                m36305u(c9348w13);
                c9348w13.m37003o().m36911a("App is missing INTERNET permission");
            }
            m36303s(c9341ve7);
            if (!c9341ve7.m36946M("android.permission.ACCESS_NETWORK_STATE")) {
                C9348w5 c9348w14 = this.f32955f;
                m36305u(c9348w14);
                c9348w14.m37003o().m36911a("App is missing ACCESS_NETWORK_STATE permission");
            }
            Context context = this.f32950a;
            if (!C12327c.m46181a(context).m46179f() && !this.f32953d.m36421m()) {
                if (!C9341ve.m36930j0(context)) {
                    C9348w5 c9348w15 = this.f32955f;
                    m36305u(c9348w15);
                    c9348w15.m37003o().m36911a("AppMeasurementReceiver not registered/enabled");
                }
                if (!C9341ve.m36924E(context, false)) {
                    C9348w5 c9348w16 = this.f32955f;
                    m36305u(c9348w16);
                    c9348w16.m37003o().m36911a("AppMeasurementService not registered/enabled");
                }
            }
            C9348w5 c9348w17 = this.f32955f;
            m36305u(c9348w17);
            c9348w17.m37003o().m36911a("Uploading is not possible. App measurement disabled");
        }
        C2361vf.m10862a();
        if (this.f32953d.m36406H(null, C9395z4.f33740R0)) {
            C9341ve c9341ve8 = this.f32958i;
            m36303s(c9341ve8);
            if (c9341ve8.m36940G()) {
                long jMax = Math.max(500L, ((((long) ((Integer) C9395z4.f33818y0.m37079b(null)).intValue()) * 1000) + ((long) new Random().nextInt(BacktraceANRSettings.DEFAULT_ANR_TIMEOUT))) - this.f32960k.mo44176b());
                if (jMax > 500) {
                    C9348w5 c9348w18 = this.f32955f;
                    m36305u(c9348w18);
                    c9348w18.m37011w().m36912b("Waiting to fetch trigger URIs until some time after boot. Delay in millis", Long.valueOf(jMax));
                }
                C9257qa c9257qa6 = this.f32962m;
                m36304t(c9257qa6);
                c9257qa6.m36711s0(jMax);
            }
        }
        C9157k6 c9157k9 = this.f32954e;
        m36303s(c9157k9);
        c9157k9.f33128p.m36296b(true);
    }

    /* JADX INFO: renamed from: w */
    public final C9150k m36338w() {
        return this.f32953d;
    }

    /* JADX INFO: renamed from: x */
    public final C9157k6 m36339x() {
        C9157k6 c9157k6 = this.f32954e;
        m36303s(c9157k6);
        return c9157k6;
    }

    /* JADX INFO: renamed from: y */
    public final C9348w5 m36340y() {
        C9348w5 c9348w5 = this.f32955f;
        if (c9348w5 == null || !c9348w5.m36454k()) {
            return null;
        }
        return c9348w5;
    }

    /* JADX INFO: renamed from: z */
    public final C9180ld m36341z() {
        C9180ld c9180ld = this.f32957h;
        m36304t(c9180ld);
        return c9180ld;
    }
}
