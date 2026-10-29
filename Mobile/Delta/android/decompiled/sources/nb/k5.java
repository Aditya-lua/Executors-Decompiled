package nb;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.ug;
import com.google.android.gms.internal.measurement.vf;
import com.google.android.gms.measurement.internal.zzr;
import com.roblox.client.personasdk.BuildConfig;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class k5 extends b5 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f25653c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f25654d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f25655e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f25656f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f25657g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f25658h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f25659i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f25660j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List f25661k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f25662l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f25663m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f25664n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f25665o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f25666p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f25667q;

    public k5(g7 g7Var, long j10, long j11) {
        super(g7Var);
        this.f25666p = 0L;
        this.f25667q = null;
        this.f25659i = j10;
        this.f25660j = j11;
    }

    @Override // nb.b5
    public final boolean m() {
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
    @Override // nb.b5
    public final void n() {
        String str;
        String string;
        int iH;
        g7 g7Var;
        g7 g7Var2;
        List listK;
        Iterator it;
        String strA;
        g7 g7Var3 = this.f25625a;
        g7Var3.a().w().c("sdkVersion bundled with app, dynamiteVersion", Long.valueOf(this.f25660j), Long.valueOf(this.f25659i));
        String packageName = g7Var3.d().getPackageName();
        PackageManager packageManager = g7Var3.d().getPackageManager();
        String str2 = "";
        int i10 = Integer.MIN_VALUE;
        String str3 = "Unknown";
        String installerPackageName = "unknown";
        try {
            if (packageManager != null) {
                try {
                    installerPackageName = packageManager.getInstallerPackageName(packageName);
                } catch (IllegalArgumentException unused) {
                    this.f25625a.a().o().b("Error retrieving app installer package name. appId", w5.x(packageName));
                }
                if (installerPackageName == null) {
                    installerPackageName = "manual_install";
                } else if (BuildConfig.STORE_PACKAGE.equals(installerPackageName)) {
                    installerPackageName = "";
                }
                try {
                    PackageInfo packageInfo = packageManager.getPackageInfo(this.f25625a.d().getPackageName(), 0);
                    if (packageInfo != null) {
                        CharSequence applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                        string = !TextUtils.isEmpty(applicationLabel) ? applicationLabel.toString() : "Unknown";
                        try {
                            str3 = packageInfo.versionName;
                            i10 = packageInfo.versionCode;
                        } catch (PackageManager.NameNotFoundException unused2) {
                            str = str3;
                            str3 = string;
                            this.f25625a.a().o().c("Error retrieving package info. appId, appName", w5.x(packageName), str3);
                            string = str3;
                            str3 = str;
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused3) {
                    str = "Unknown";
                }
                this.f25653c = packageName;
                this.f25656f = installerPackageName;
                this.f25654d = str3;
                this.f25655e = i10;
                this.f25657g = string;
                this.f25658h = 0L;
                g7 g7Var4 = this.f25625a;
                iH = g7Var4.h();
                if (iH != 0) {
                    this.f25625a.a().w().a("App measurement collection enabled");
                } else if (iH != 1) {
                    this.f25625a.a().u().a("App measurement deactivated via the manifest");
                } else if (iH != 3) {
                    this.f25625a.a().u().a("App measurement disabled by setAnalyticsCollectionEnabled(false)");
                } else if (iH != 4) {
                    this.f25625a.a().u().a("App measurement disabled via the manifest");
                } else if (iH != 6) {
                    this.f25625a.a().t().a("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
                } else if (iH != 7) {
                    this.f25625a.a().u().a("App measurement disabled via the global data collection setting");
                } else if (iH != 8) {
                    g7 g7Var5 = this.f25625a;
                    g7Var5.a().u().a("App measurement disabled");
                    g7Var5.a().p().a("Invalid scion state in identity");
                } else {
                    this.f25625a.a().u().a("App measurement disabled due to denied storage consent");
                }
                this.f25664n = "";
                g7Var = this.f25625a;
                g7Var.c();
                strA = ab.a(g7Var.d(), "google_app_id", g7Var4.H());
                if (TextUtils.isEmpty(strA)) {
                    str2 = strA;
                }
                this.f25664n = str2;
                if (iH == 0) {
                    g7Var.a().w().c("App measurement enabled for app package, google app id", this.f25653c, this.f25664n);
                }
                this.f25661k = null;
                g7Var2 = this.f25625a;
                g7Var2.c();
                listK = g7Var2.w().K("analytics.safelisted_events");
                if (listK != null) {
                    this.f25661k = listK;
                    break;
                } else if (listK.isEmpty()) {
                    it = listK.iterator();
                    do {
                        if (it.hasNext()) {
                            this.f25661k = listK;
                            break;
                        }
                    } while (g7Var2.C().u0("safelisted event", (String) it.next()));
                } else {
                    g7Var2.a().t().a("Safelisted event list is empty. Ignoring");
                }
                if (packageManager != null) {
                    this.f25663m = w9.a.a(g7Var2.d()) ? 1 : 0;
                } else {
                    this.f25663m = 0;
                }
            }
            g7Var3.a().o().b("PackageManager is null, app identity information might be inaccurate. appId", w5.x(packageName));
            strA = ab.a(g7Var.d(), "google_app_id", g7Var4.H());
            if (TextUtils.isEmpty(strA)) {
                str2 = strA;
            }
            this.f25664n = str2;
            if (iH == 0) {
                g7Var.a().w().c("App measurement enabled for app package, google app id", this.f25653c, this.f25664n);
            }
        } catch (IllegalStateException e10) {
            this.f25625a.a().o().c("Fetching Google App Id failed with exception. appId", w5.x(packageName), e10);
        }
        string = "Unknown";
        this.f25653c = packageName;
        this.f25656f = installerPackageName;
        this.f25654d = str3;
        this.f25655e = i10;
        this.f25657g = string;
        this.f25658h = 0L;
        g7 g7Var6 = this.f25625a;
        iH = g7Var6.h();
        if (iH != 0) {
            this.f25625a.a().w().a("App measurement collection enabled");
        } else if (iH != 1) {
            this.f25625a.a().u().a("App measurement deactivated via the manifest");
        } else if (iH != 3) {
            this.f25625a.a().u().a("App measurement disabled by setAnalyticsCollectionEnabled(false)");
        } else if (iH != 4) {
            this.f25625a.a().u().a("App measurement disabled via the manifest");
        } else if (iH != 6) {
            this.f25625a.a().t().a("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
        } else if (iH != 7) {
            this.f25625a.a().u().a("App measurement disabled via the global data collection setting");
        } else if (iH != 8) {
            g7 g7Var7 = this.f25625a;
            g7Var7.a().u().a("App measurement disabled");
            g7Var7.a().p().a("Invalid scion state in identity");
        } else {
            this.f25625a.a().u().a("App measurement disabled due to denied storage consent");
        }
        this.f25664n = "";
        g7Var = this.f25625a;
        g7Var.c();
        this.f25661k = null;
        g7Var2 = this.f25625a;
        g7Var2.c();
        listK = g7Var2.w().K("analytics.safelisted_events");
        if (listK != null) {
            this.f25661k = listK;
            break;
        } else if (listK.isEmpty()) {
            it = listK.iterator();
            do {
                if (it.hasNext()) {
                    this.f25661k = listK;
                    break;
                }
            } while (g7Var2.C().u0("safelisted event", (String) it.next()));
        } else {
            g7Var2.a().t().a("Safelisted event list is empty. Ignoring");
        }
        if (packageManager != null) {
            this.f25663m = w9.a.a(g7Var2.d()) ? 1 : 0;
        } else {
            this.f25663m = 0;
        }
    }

    public final zzr o(String str) {
        long J;
        String str2;
        String str3;
        boolean z10;
        int i10;
        int i11;
        long j10;
        h();
        String strQ = q();
        String strR = r();
        j();
        String str4 = this.f25654d;
        j();
        long j11 = this.f25655e;
        j();
        n9.m.l(this.f25656f);
        String str5 = this.f25656f;
        g7 g7Var = this.f25625a;
        g7Var.w().A();
        j();
        h();
        long j12 = this.f25658h;
        if (j12 == 0) {
            ve veVarC = this.f25625a.C();
            Context contextD = g7Var.d();
            String packageName = g7Var.d().getPackageName();
            veVarC.h();
            n9.m.l(contextD);
            n9.m.f(packageName);
            PackageManager packageManager = contextD.getPackageManager();
            MessageDigest messageDigestC = ve.C();
            long jD = -1;
            if (messageDigestC == null) {
                veVarC.f25625a.a().o().a("Could not get MD5 instance");
                J = 0;
            } else {
                if (packageManager != null) {
                    try {
                        if (veVarC.S(contextD, packageName)) {
                            J = 0;
                            jD = 0;
                        } else {
                            w9.b bVarA = w9.c.a(contextD);
                            g7 g7Var2 = veVarC.f25625a;
                            J = 0;
                            try {
                                Signature[] signatureArr = bVarA.e(g7Var2.d().getPackageName(), 64).signatures;
                                if (signatureArr == null || signatureArr.length <= 0) {
                                    g7Var2.a().r().a("Could not get signatures");
                                } else {
                                    jD = ve.D(messageDigestC.digest(signatureArr[0].toByteArray()));
                                }
                            } catch (PackageManager.NameNotFoundException e10) {
                                e = e10;
                                veVarC.f25625a.a().o().b("Package name not found", e);
                                j12 = J;
                            }
                        }
                    } catch (PackageManager.NameNotFoundException e11) {
                        e = e11;
                        J = 0;
                    }
                } else {
                    J = 0;
                }
                j12 = J;
                this.f25658h = j12;
            }
            j12 = jD;
            this.f25658h = j12;
        } else {
            J = 0;
        }
        long j13 = j12;
        g7 g7Var3 = this.f25625a;
        boolean zG = g7Var3.g();
        boolean z11 = !g7Var3.x().f25684s;
        h();
        if (g7Var3.g()) {
            ug.a();
            if (g7Var3.w().H(null, z4.I0)) {
                this.f25625a.a().w().a("Disabled IID for tests.");
            } else {
                try {
                    Class<?> clsLoadClass = g7Var3.d().getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                    if (clsLoadClass != null) {
                        try {
                            Object objInvoke = clsLoadClass.getDeclaredMethod("getInstance", Context.class).invoke(null, this.f25625a.d());
                            if (objInvoke != null) {
                                try {
                                    str2 = (String) clsLoadClass.getDeclaredMethod("getFirebaseInstanceId", null).invoke(objInvoke, null);
                                } catch (Exception unused) {
                                    this.f25625a.a().t().a("Failed to retrieve Firebase Instance Id");
                                    str2 = null;
                                }
                            }
                        } catch (Exception unused2) {
                            this.f25625a.a().s().a("Failed to obtain Firebase Analytics instance");
                        }
                    }
                } catch (ClassNotFoundException unused3) {
                }
            }
            str2 = null;
        } else {
            str2 = null;
        }
        g7 g7Var4 = this.f25625a;
        long jA = g7Var4.x().f25671f.a();
        long jMin = jA == J ? g7Var4.D : Math.min(g7Var4.D, jA);
        j();
        int i12 = this.f25663m;
        g7 g7Var5 = this.f25625a;
        boolean zM = g7Var5.w().M();
        k6 k6VarX = g7Var5.x();
        k6VarX.h();
        String str6 = str2;
        boolean z12 = k6VarX.p().getBoolean("deferred_analytics_collection", false);
        boolean z13 = g7Var5.w().O("google_analytics_default_allow_ad_personalization_signals", true) != n8.GRANTED;
        long j14 = this.f25659i;
        Boolean boolValueOf = Boolean.valueOf(z13);
        List list = this.f25661k;
        String strL = g7Var5.x().w().l();
        if (this.f25662l == null) {
            this.f25662l = g7Var5.C().l0();
        }
        String str7 = this.f25662l;
        if (g7Var5.x().w().o(p8.ANALYTICS_STORAGE)) {
            h();
            if (this.f25666p != J) {
                long jA2 = g7Var5.e().a() - this.f25666p;
                if (this.f25665o != null && jA2 > 86400000 && this.f25667q == null) {
                    p();
                }
            }
            if (this.f25665o == null) {
                p();
            }
            str3 = this.f25665o;
        } else {
            str3 = null;
        }
        boolean zP = g7Var5.w().P();
        ve veVarC2 = g7Var5.C();
        String strQ2 = q();
        String str8 = str3;
        g7 g7Var6 = veVarC2.f25625a;
        if (g7Var6.d().getPackageManager() == null) {
            z10 = zP;
            j10 = J;
        } else {
            try {
                z10 = zP;
                i10 = 0;
                try {
                    ApplicationInfo applicationInfoC = w9.c.a(g7Var6.d()).c(strQ2, 0);
                    i11 = applicationInfoC != null ? applicationInfoC.targetSdkVersion : i10;
                } catch (PackageManager.NameNotFoundException unused4) {
                    g7 g7Var7 = veVarC2.f25625a;
                    g7Var7.c();
                    g7Var7.a().u().b("PackageManager failed to find running app: app_id", strQ2);
                }
            } catch (PackageManager.NameNotFoundException unused5) {
                z10 = zP;
                i10 = 0;
            }
            j10 = i11;
        }
        g7 g7Var8 = this.f25625a;
        int iB = g7Var8.x().w().b();
        String strE = g7Var8.x().u().e();
        vf.a();
        k kVarW = g7Var8.w();
        y4 y4Var = z4.R0;
        long j15 = j10;
        int I = kVarW.H(null, y4Var) ? g7Var8.C().I() : 0;
        vf.a();
        if (g7Var8.w().H(null, y4Var)) {
            J = g7Var8.C().J();
        }
        String strR2 = g7Var8.w().R();
        String strB = new z2(g7Var8.w().O("google_analytics_default_allow_ad_personalization_signals", true)).b();
        g7 g7Var9 = this.f25625a;
        return new zzr(strQ, strR, str4, j11, str5, 133005L, j13, str, zG, z11, str6, jMin, i12, zM, z12, boolValueOf, j14, list, strL, str7, str8, z10, j15, iB, strE, I, J, strR2, strB, g7Var9.D, g7Var9.N().q().zza());
    }

    public final void p() {
        String str;
        h();
        g7 g7Var = this.f25625a;
        if (g7Var.x().w().o(p8.ANALYTICS_STORAGE)) {
            byte[] bArr = new byte[16];
            g7Var.C().q0().nextBytes(bArr);
            str = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        } else {
            g7Var.a().v().a("Analytics Storage consent is not granted");
            str = null;
        }
        g7Var.a().v().a(String.format("Resetting session stitching token to %s", str == null ? "null" : "not null"));
        this.f25665o = str;
        this.f25666p = g7Var.e().a();
    }

    public final String q() {
        j();
        n9.m.l(this.f25653c);
        return this.f25653c;
    }

    public final String r() {
        h();
        j();
        n9.m.l(this.f25664n);
        return this.f25664n;
    }

    public final String s() {
        j();
        n9.m.l(this.f25657g);
        return this.f25657g;
    }

    public final int t() {
        j();
        return this.f25655e;
    }

    public final long u() {
        return this.f25660j;
    }

    public final int v() {
        j();
        return this.f25663m;
    }

    public final List w() {
        return this.f25661k;
    }

    public final boolean x(String str) {
        String str2 = this.f25667q;
        boolean z10 = false;
        if (str2 != null && !str2.equals(str)) {
            z10 = true;
        }
        this.f25667q = str;
        return z10;
    }
}
