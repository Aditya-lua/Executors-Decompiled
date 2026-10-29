package p306nb;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.text.TextUtils;
import androidx.core.os.EnvironmentCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.google.android.gms.internal.measurement.C2344ug;
import com.google.android.gms.internal.measurement.C2361vf;
import com.google.android.gms.measurement.internal.zzr;
import com.roblox.client.personasdk.BuildConfig;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p305n9.C8953m;
import p511w9.C12325a;
import p511w9.C12326b;
import p511w9.C12327c;

/* JADX INFO: renamed from: nb.k5 */
/* JADX INFO: loaded from: classes.dex */
public final class C9156k5 extends AbstractC9008b5 {

    /* JADX INFO: renamed from: c */
    public String f33099c;

    /* JADX INFO: renamed from: d */
    public String f33100d;

    /* JADX INFO: renamed from: e */
    public int f33101e;

    /* JADX INFO: renamed from: f */
    public String f33102f;

    /* JADX INFO: renamed from: g */
    public String f33103g;

    /* JADX INFO: renamed from: h */
    public long f33104h;

    /* JADX INFO: renamed from: i */
    public final long f33105i;

    /* JADX INFO: renamed from: j */
    public final long f33106j;

    /* JADX INFO: renamed from: k */
    public List f33107k;

    /* JADX INFO: renamed from: l */
    public String f33108l;

    /* JADX INFO: renamed from: m */
    public int f33109m;

    /* JADX INFO: renamed from: n */
    public String f33110n;

    /* JADX INFO: renamed from: o */
    public String f33111o;

    /* JADX INFO: renamed from: p */
    public long f33112p;

    /* JADX INFO: renamed from: q */
    public String f33113q;

    public C9156k5(C9094g7 c9094g7, long j10, long j11) {
        super(c9094g7);
        this.f33112p = 0L;
        this.f33113q = null;
        this.f33105i = j10;
        this.f33106j = j11;
    }

    @Override // p306nb.AbstractC9008b5
    /* JADX INFO: renamed from: m */
    public final boolean mo36124m() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:32:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:40:0x00da  */
    /* JADX WARN: Code duplicated, block: B:41:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:42:0x0107  */
    /* JADX WARN: Code duplicated, block: B:43:0x0117  */
    /* JADX WARN: Code duplicated, block: B:44:0x0127  */
    /* JADX WARN: Code duplicated, block: B:45:0x0137  */
    /* JADX WARN: Code duplicated, block: B:46:0x0147  */
    /* JADX WARN: Code duplicated, block: B:47:0x0157  */
    /* JADX WARN: Code duplicated, block: B:51:0x0181  */
    /* JADX WARN: Code duplicated, block: B:52:0x0182  */
    /* JADX WARN: Code duplicated, block: B:55:0x0187 A[Catch: IllegalStateException -> 0x0199, TRY_LEAVE, TryCatch #2 {IllegalStateException -> 0x0199, blocks: (B:49:0x016d, B:53:0x0183, B:55:0x0187), top: B:81:0x016d }] */
    /* JADX WARN: Code duplicated, block: B:62:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:64:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:65:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:68:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:71:0x01f3 A[EDGE_INSN: B:71:0x01f3->B:72:0x01f5 BREAK  A[LOOP:0: B:66:0x01da->B:87:?]] */
    /* JADX WARN: Code duplicated, block: B:73:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:75:0x0202  */
    /* JADX WARN: Code duplicated, block: B:85:0x01f3 A[SYNTHETIC] */
    @Override // p306nb.AbstractC9008b5
    /* JADX INFO: renamed from: n */
    public final void mo36125n() {
        String str;
        String string;
        int iM36328h;
        C9094g7 c9094g7;
        C9094g7 c9094g8;
        List listM36409K;
        Iterator it;
        String strM36111a;
        C9094g7 c9094g9 = this.f33067a;
        c9094g9.mo36321a().m37011w().m36913c("sdkVersion bundled with app, dynamiteVersion", Long.valueOf(this.f33106j), Long.valueOf(this.f33105i));
        String packageName = c9094g9.mo36324d().getPackageName();
        PackageManager packageManager = c9094g9.mo36324d().getPackageManager();
        String str2 = "";
        int i10 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        String str3 = "Unknown";
        String installerPackageName = EnvironmentCompat.MEDIA_UNKNOWN;
        try {
            if (packageManager != null) {
                try {
                    installerPackageName = packageManager.getInstallerPackageName(packageName);
                } catch (IllegalArgumentException unused) {
                    this.f33067a.mo36321a().m37003o().m36912b("Error retrieving app installer package name. appId", C9348w5.m36998x(packageName));
                }
                if (installerPackageName == null) {
                    installerPackageName = "manual_install";
                } else if (BuildConfig.STORE_PACKAGE.equals(installerPackageName)) {
                    installerPackageName = "";
                }
                try {
                    PackageInfo packageInfo = packageManager.getPackageInfo(this.f33067a.mo36324d().getPackageName(), 0);
                    if (packageInfo != null) {
                        CharSequence applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                        string = !TextUtils.isEmpty(applicationLabel) ? applicationLabel.toString() : "Unknown";
                        try {
                            str3 = packageInfo.versionName;
                            i10 = packageInfo.versionCode;
                        } catch (PackageManager.NameNotFoundException unused2) {
                            str = str3;
                            str3 = string;
                            this.f33067a.mo36321a().m37003o().m36913c("Error retrieving package info. appId, appName", C9348w5.m36998x(packageName), str3);
                            string = str3;
                            str3 = str;
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused3) {
                    str = "Unknown";
                }
                this.f33099c = packageName;
                this.f33102f = installerPackageName;
                this.f33100d = str3;
                this.f33101e = i10;
                this.f33103g = string;
                this.f33104h = 0L;
                C9094g7 c9094g10 = this.f33067a;
                iM36328h = c9094g10.m36328h();
                if (iM36328h != 0) {
                    this.f33067a.mo36321a().m37011w().m36911a("App measurement collection enabled");
                } else if (iM36328h != 1) {
                    this.f33067a.mo36321a().m37009u().m36911a("App measurement deactivated via the manifest");
                } else if (iM36328h != 3) {
                    this.f33067a.mo36321a().m37009u().m36911a("App measurement disabled by setAnalyticsCollectionEnabled(false)");
                } else if (iM36328h != 4) {
                    this.f33067a.mo36321a().m37009u().m36911a("App measurement disabled via the manifest");
                } else if (iM36328h != 6) {
                    this.f33067a.mo36321a().m37008t().m36911a("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
                } else if (iM36328h != 7) {
                    this.f33067a.mo36321a().m37009u().m36911a("App measurement disabled via the global data collection setting");
                } else if (iM36328h != 8) {
                    C9094g7 c9094g11 = this.f33067a;
                    c9094g11.mo36321a().m37009u().m36911a("App measurement disabled");
                    c9094g11.mo36321a().m37004p().m36911a("Invalid scion state in identity");
                } else {
                    this.f33067a.mo36321a().m37009u().m36911a("App measurement disabled due to denied storage consent");
                }
                this.f33110n = "";
                c9094g7 = this.f33067a;
                c9094g7.mo36323c();
                strM36111a = C8997ab.m36111a(c9094g7.mo36324d(), "google_app_id", c9094g10.m36313H());
                if (TextUtils.isEmpty(strM36111a)) {
                    str2 = strM36111a;
                }
                this.f33110n = str2;
                if (iM36328h == 0) {
                    c9094g7.mo36321a().m37011w().m36913c("App measurement enabled for app package, google app id", this.f33099c, this.f33110n);
                }
                this.f33107k = null;
                c9094g8 = this.f33067a;
                c9094g8.mo36323c();
                listM36409K = c9094g8.m36338w().m36409K("analytics.safelisted_events");
                if (listM36409K != null) {
                    this.f33107k = listM36409K;
                    break;
                } else if (listM36409K.isEmpty()) {
                    it = listM36409K.iterator();
                    do {
                        if (it.hasNext()) {
                            this.f33107k = listM36409K;
                            break;
                        }
                    } while (c9094g8.m36308C().m36979u0("safelisted event", (String) it.next()));
                } else {
                    c9094g8.mo36321a().m37008t().m36911a("Safelisted event list is empty. Ignoring");
                }
                if (packageManager != null) {
                    this.f33109m = C12325a.m46173a(c9094g8.mo36324d()) ? 1 : 0;
                } else {
                    this.f33109m = 0;
                }
            }
            c9094g9.mo36321a().m37003o().m36912b("PackageManager is null, app identity information might be inaccurate. appId", C9348w5.m36998x(packageName));
            strM36111a = C8997ab.m36111a(c9094g7.mo36324d(), "google_app_id", c9094g10.m36313H());
            if (TextUtils.isEmpty(strM36111a)) {
                str2 = strM36111a;
            }
            this.f33110n = str2;
            if (iM36328h == 0) {
                c9094g7.mo36321a().m37011w().m36913c("App measurement enabled for app package, google app id", this.f33099c, this.f33110n);
            }
        } catch (IllegalStateException e10) {
            this.f33067a.mo36321a().m37003o().m36913c("Fetching Google App Id failed with exception. appId", C9348w5.m36998x(packageName), e10);
        }
        string = "Unknown";
        this.f33099c = packageName;
        this.f33102f = installerPackageName;
        this.f33100d = str3;
        this.f33101e = i10;
        this.f33103g = string;
        this.f33104h = 0L;
        C9094g7 c9094g12 = this.f33067a;
        iM36328h = c9094g12.m36328h();
        if (iM36328h != 0) {
            this.f33067a.mo36321a().m37011w().m36911a("App measurement collection enabled");
        } else if (iM36328h != 1) {
            this.f33067a.mo36321a().m37009u().m36911a("App measurement deactivated via the manifest");
        } else if (iM36328h != 3) {
            this.f33067a.mo36321a().m37009u().m36911a("App measurement disabled by setAnalyticsCollectionEnabled(false)");
        } else if (iM36328h != 4) {
            this.f33067a.mo36321a().m37009u().m36911a("App measurement disabled via the manifest");
        } else if (iM36328h != 6) {
            this.f33067a.mo36321a().m37008t().m36911a("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
        } else if (iM36328h != 7) {
            this.f33067a.mo36321a().m37009u().m36911a("App measurement disabled via the global data collection setting");
        } else if (iM36328h != 8) {
            C9094g7 c9094g13 = this.f33067a;
            c9094g13.mo36321a().m37009u().m36911a("App measurement disabled");
            c9094g13.mo36321a().m37004p().m36911a("Invalid scion state in identity");
        } else {
            this.f33067a.mo36321a().m37009u().m36911a("App measurement disabled due to denied storage consent");
        }
        this.f33110n = "";
        c9094g7 = this.f33067a;
        c9094g7.mo36323c();
        this.f33107k = null;
        c9094g8 = this.f33067a;
        c9094g8.mo36323c();
        listM36409K = c9094g8.m36338w().m36409K("analytics.safelisted_events");
        if (listM36409K != null) {
            this.f33107k = listM36409K;
            break;
        } else if (listM36409K.isEmpty()) {
            it = listM36409K.iterator();
            do {
                if (it.hasNext()) {
                    this.f33107k = listM36409K;
                    break;
                }
            } while (c9094g8.m36308C().m36979u0("safelisted event", (String) it.next()));
        } else {
            c9094g8.mo36321a().m37008t().m36911a("Safelisted event list is empty. Ignoring");
        }
        if (packageManager != null) {
            this.f33109m = C12325a.m46173a(c9094g8.mo36324d()) ? 1 : 0;
        } else {
            this.f33109m = 0;
        }
    }

    /* JADX INFO: renamed from: o */
    public final zzr m36430o(String str) {
        long jM36943J;
        String str2;
        String str3;
        boolean z10;
        int i10;
        int i11;
        long j10;
        mo36088h();
        String strM36432q = m36432q();
        String strM36433r = m36433r();
        m36121j();
        String str4 = this.f33100d;
        m36121j();
        long j11 = this.f33101e;
        m36121j();
        C8953m.m36047l(this.f33102f);
        String str5 = this.f33102f;
        C9094g7 c9094g7 = this.f33067a;
        c9094g7.m36338w().m36399A();
        m36121j();
        mo36088h();
        long j12 = this.f33104h;
        if (j12 == 0) {
            C9341ve c9341veM36308C = this.f33067a.m36308C();
            Context contextMo36324d = c9094g7.mo36324d();
            String packageName = c9094g7.mo36324d().getPackageName();
            c9341veM36308C.mo36088h();
            C8953m.m36047l(contextMo36324d);
            C8953m.m36041f(packageName);
            PackageManager packageManager = contextMo36324d.getPackageManager();
            MessageDigest messageDigestM36922C = C9341ve.m36922C();
            long jM36923D = -1;
            if (messageDigestM36922C == null) {
                c9341veM36308C.f33067a.mo36321a().m37003o().m36911a("Could not get MD5 instance");
                jM36943J = 0;
            } else {
                if (packageManager != null) {
                    try {
                        if (c9341veM36308C.m36950S(contextMo36324d, packageName)) {
                            jM36943J = 0;
                            jM36923D = 0;
                        } else {
                            C12326b c12326bM46181a = C12327c.m46181a(contextMo36324d);
                            C9094g7 c9094g8 = c9341veM36308C.f33067a;
                            jM36943J = 0;
                            try {
                                Signature[] signatureArr = c12326bM46181a.m46178e(c9094g8.mo36324d().getPackageName(), 64).signatures;
                                if (signatureArr == null || signatureArr.length <= 0) {
                                    c9094g8.mo36321a().m37006r().m36911a("Could not get signatures");
                                } else {
                                    jM36923D = C9341ve.m36923D(messageDigestM36922C.digest(signatureArr[0].toByteArray()));
                                }
                            } catch (PackageManager.NameNotFoundException e10) {
                                e = e10;
                                c9341veM36308C.f33067a.mo36321a().m37003o().m36912b("Package name not found", e);
                                j12 = jM36943J;
                            }
                        }
                    } catch (PackageManager.NameNotFoundException e11) {
                        e = e11;
                        jM36943J = 0;
                    }
                } else {
                    jM36943J = 0;
                }
                j12 = jM36943J;
                this.f33104h = j12;
            }
            j12 = jM36923D;
            this.f33104h = j12;
        } else {
            jM36943J = 0;
        }
        long j13 = j12;
        C9094g7 c9094g9 = this.f33067a;
        boolean zM36327g = c9094g9.m36327g();
        boolean z11 = !c9094g9.m36339x().f33131s;
        mo36088h();
        if (c9094g9.m36327g()) {
            C2344ug.m10788a();
            if (c9094g9.m36338w().m36406H(null, C9395z4.f33722I0)) {
                this.f33067a.mo36321a().m37011w().m36911a("Disabled IID for tests.");
            } else {
                try {
                    Class<?> clsLoadClass = c9094g9.mo36324d().getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                    if (clsLoadClass != null) {
                        try {
                            Object objInvoke = clsLoadClass.getDeclaredMethod("getInstance", Context.class).invoke(null, this.f33067a.mo36324d());
                            if (objInvoke != null) {
                                try {
                                    str2 = (String) clsLoadClass.getDeclaredMethod("getFirebaseInstanceId", null).invoke(objInvoke, null);
                                } catch (Exception unused) {
                                    this.f33067a.mo36321a().m37008t().m36911a("Failed to retrieve Firebase Instance Id");
                                    str2 = null;
                                }
                            }
                        } catch (Exception unused2) {
                            this.f33067a.mo36321a().m37007s().m36911a("Failed to obtain Firebase Analytics instance");
                        }
                    }
                } catch (ClassNotFoundException unused3) {
                }
            }
            str2 = null;
        } else {
            str2 = null;
        }
        C9094g7 c9094g10 = this.f33067a;
        long jM36345a = c9094g10.m36339x().f33118f.m36345a();
        long jMin = jM36345a == jM36943J ? c9094g10.f32949D : Math.min(c9094g10.f32949D, jM36345a);
        m36121j();
        int i12 = this.f33109m;
        C9094g7 c9094g11 = this.f33067a;
        boolean zM36411M = c9094g11.m36338w().m36411M();
        C9157k6 c9157k6M36339x = c9094g11.m36339x();
        c9157k6M36339x.mo36088h();
        String str6 = str2;
        boolean z12 = c9157k6M36339x.m36443p().getBoolean("deferred_analytics_collection", false);
        boolean z13 = c9094g11.m36338w().m36413O("google_analytics_default_allow_ad_personalization_signals", true) != EnumC9207n8.GRANTED;
        long j14 = this.f33105i;
        Boolean boolValueOf = Boolean.valueOf(z13);
        List list = this.f33107k;
        String strM36654l = c9094g11.m36339x().m36450w().m36654l();
        if (this.f33108l == null) {
            this.f33108l = c9094g11.m36308C().m36965l0();
        }
        String str7 = this.f33108l;
        if (c9094g11.m36339x().m36450w().m36656o(EnumC9239p8.ANALYTICS_STORAGE)) {
            mo36088h();
            if (this.f33112p != jM36943J) {
                long jMo44175a = c9094g11.mo36325e().mo44175a() - this.f33112p;
                if (this.f33111o != null && jMo44175a > 86400000 && this.f33113q == null) {
                    m36431p();
                }
            }
            if (this.f33111o == null) {
                m36431p();
            }
            str3 = this.f33111o;
        } else {
            str3 = null;
        }
        boolean zM36414P = c9094g11.m36338w().m36414P();
        C9341ve c9341veM36308C2 = c9094g11.m36308C();
        String strM36432q2 = m36432q();
        String str8 = str3;
        C9094g7 c9094g12 = c9341veM36308C2.f33067a;
        if (c9094g12.mo36324d().getPackageManager() == null) {
            z10 = zM36414P;
            j10 = jM36943J;
        } else {
            try {
                z10 = zM36414P;
                i10 = 0;
                try {
                    ApplicationInfo applicationInfoM46176c = C12327c.m46181a(c9094g12.mo36324d()).m46176c(strM36432q2, 0);
                    i11 = applicationInfoM46176c != null ? applicationInfoM46176c.targetSdkVersion : i10;
                } catch (PackageManager.NameNotFoundException unused4) {
                    C9094g7 c9094g13 = c9341veM36308C2.f33067a;
                    c9094g13.mo36323c();
                    c9094g13.mo36321a().m37009u().m36912b("PackageManager failed to find running app: app_id", strM36432q2);
                }
            } catch (PackageManager.NameNotFoundException unused5) {
                z10 = zM36414P;
                i10 = 0;
            }
            j10 = i11;
        }
        C9094g7 c9094g14 = this.f33067a;
        int iM36651b = c9094g14.m36339x().m36450w().m36651b();
        String strM37022e = c9094g14.m36339x().m36448u().m37022e();
        C2361vf.m10862a();
        C9150k c9150kM36338w = c9094g14.m36338w();
        C9379y4 c9379y4 = C9395z4.f33740R0;
        long j15 = j10;
        int iM36942I = c9150kM36338w.m36406H(null, c9379y4) ? c9094g14.m36308C().m36942I() : 0;
        C2361vf.m10862a();
        if (c9094g14.m36338w().m36406H(null, c9379y4)) {
            jM36943J = c9094g14.m36308C().m36943J();
        }
        String strM36416R = c9094g14.m36338w().m36416R();
        String strM37091b = new C9393z2(c9094g14.m36338w().m36413O("google_analytics_default_allow_ad_personalization_signals", true)).m37091b();
        C9094g7 c9094g15 = this.f33067a;
        return new zzr(strM36432q, strM36433r, str4, j11, str5, 133005L, j13, str, zM36327g, z11, str6, jMin, i12, zM36411M, z12, boolValueOf, j14, list, strM36654l, str7, str8, z10, j15, iM36651b, strM37022e, iM36942I, jM36943J, strM36416R, strM37091b, c9094g15.f32949D, c9094g15.m36319N().m37065q().zza());
    }

    /* JADX INFO: renamed from: p */
    public final void m36431p() {
        String str;
        mo36088h();
        C9094g7 c9094g7 = this.f33067a;
        if (c9094g7.m36339x().m36450w().m36656o(EnumC9239p8.ANALYTICS_STORAGE)) {
            byte[] bArr = new byte[16];
            c9094g7.m36308C().m36972q0().nextBytes(bArr);
            str = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        } else {
            c9094g7.mo36321a().m37010v().m36911a("Analytics Storage consent is not granted");
            str = null;
        }
        c9094g7.mo36321a().m37010v().m36911a(String.format("Resetting session stitching token to %s", str == null ? "null" : "not null"));
        this.f33111o = str;
        this.f33112p = c9094g7.mo36325e().mo44175a();
    }

    /* JADX INFO: renamed from: q */
    public final String m36432q() {
        m36121j();
        C8953m.m36047l(this.f33099c);
        return this.f33099c;
    }

    /* JADX INFO: renamed from: r */
    public final String m36433r() {
        mo36088h();
        m36121j();
        C8953m.m36047l(this.f33110n);
        return this.f33110n;
    }

    /* JADX INFO: renamed from: s */
    public final String m36434s() {
        m36121j();
        C8953m.m36047l(this.f33103g);
        return this.f33103g;
    }

    /* JADX INFO: renamed from: t */
    public final int m36435t() {
        m36121j();
        return this.f33101e;
    }

    /* JADX INFO: renamed from: u */
    public final long m36436u() {
        return this.f33106j;
    }

    /* JADX INFO: renamed from: v */
    public final int m36437v() {
        m36121j();
        return this.f33109m;
    }

    /* JADX INFO: renamed from: w */
    public final List m36438w() {
        return this.f33107k;
    }

    /* JADX INFO: renamed from: x */
    public final boolean m36439x(String str) {
        String str2 = this.f33113q;
        boolean z10 = false;
        if (str2 != null && !str2.equals(str)) {
            z10 = true;
        }
        this.f33113q = str;
        return z10;
    }
}
