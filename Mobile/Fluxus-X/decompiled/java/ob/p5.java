package ob;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.text.TextUtils;
import com.github.luben.zstd.BuildConfig;
import com.google.android.gms.internal.measurement.yg;
import com.google.android.gms.internal.measurement.zf;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class p5 extends g5 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f27668c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f27669d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f27670e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f27671f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f27672g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f27673h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f27674i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f27675j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List f27676k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f27677l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f27678m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f27679n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f27680o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f27681p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f27682q;

    public p5(l7 l7Var, long j10, long j11) {
        super(l7Var);
        this.f27681p = 0L;
        this.f27682q = null;
        this.f27674i = j10;
        this.f27675j = j11;
    }

    @Override // ob.g5
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
    @Override // ob.g5
    public final void n() {
        String str;
        String string;
        int iH;
        l7 l7Var;
        l7 l7Var2;
        List listK;
        Iterator it;
        String strA;
        l7 l7Var3 = this.f27641a;
        l7Var3.a().w().c("sdkVersion bundled with app, dynamiteVersion", Long.valueOf(this.f27675j), Long.valueOf(this.f27674i));
        String packageName = l7Var3.d().getPackageName();
        PackageManager packageManager = l7Var3.d().getPackageManager();
        String str2 = BuildConfig.FLAVOR;
        int i10 = Integer.MIN_VALUE;
        String str3 = "Unknown";
        String installerPackageName = "unknown";
        try {
            if (packageManager != null) {
                try {
                    installerPackageName = packageManager.getInstallerPackageName(packageName);
                } catch (IllegalArgumentException unused) {
                    this.f27641a.a().o().b("Error retrieving app installer package name. appId", b6.x(packageName));
                }
                if (installerPackageName == null) {
                    installerPackageName = "manual_install";
                } else if ("com.android.vending".equals(installerPackageName)) {
                    installerPackageName = BuildConfig.FLAVOR;
                }
                try {
                    PackageInfo packageInfo = packageManager.getPackageInfo(this.f27641a.d().getPackageName(), 0);
                    if (packageInfo != null) {
                        CharSequence applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                        string = !TextUtils.isEmpty(applicationLabel) ? applicationLabel.toString() : "Unknown";
                        try {
                            str3 = packageInfo.versionName;
                            i10 = packageInfo.versionCode;
                        } catch (PackageManager.NameNotFoundException unused2) {
                            str = str3;
                            str3 = string;
                            this.f27641a.a().o().c("Error retrieving package info. appId, appName", b6.x(packageName), str3);
                            string = str3;
                            str3 = str;
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused3) {
                    str = "Unknown";
                }
                this.f27668c = packageName;
                this.f27671f = installerPackageName;
                this.f27669d = str3;
                this.f27670e = i10;
                this.f27672g = string;
                this.f27673h = 0L;
                l7 l7Var4 = this.f27641a;
                iH = l7Var4.h();
                if (iH != 0) {
                    this.f27641a.a().w().a("App measurement collection enabled");
                } else if (iH != 1) {
                    this.f27641a.a().u().a("App measurement deactivated via the manifest");
                } else if (iH != 3) {
                    this.f27641a.a().u().a("App measurement disabled by setAnalyticsCollectionEnabled(false)");
                } else if (iH != 4) {
                    this.f27641a.a().u().a("App measurement disabled via the manifest");
                } else if (iH != 6) {
                    this.f27641a.a().t().a("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
                } else if (iH != 7) {
                    this.f27641a.a().u().a("App measurement disabled via the global data collection setting");
                } else if (iH != 8) {
                    l7 l7Var5 = this.f27641a;
                    l7Var5.a().u().a("App measurement disabled");
                    l7Var5.a().p().a("Invalid scion state in identity");
                } else {
                    this.f27641a.a().u().a("App measurement disabled due to denied storage consent");
                }
                this.f27679n = BuildConfig.FLAVOR;
                l7Var = this.f27641a;
                l7Var.c();
                strA = fb.a(l7Var.d(), "google_app_id", l7Var4.H());
                if (TextUtils.isEmpty(strA)) {
                    str2 = strA;
                }
                this.f27679n = str2;
                if (iH == 0) {
                    l7Var.a().w().c("App measurement enabled for app package, google app id", this.f27668c, this.f27679n);
                }
                this.f27676k = null;
                l7Var2 = this.f27641a;
                l7Var2.c();
                listK = l7Var2.w().K("analytics.safelisted_events");
                if (listK != null) {
                    this.f27676k = listK;
                    break;
                } else if (listK.isEmpty()) {
                    it = listK.iterator();
                    do {
                        if (it.hasNext()) {
                            this.f27676k = listK;
                            break;
                        }
                    } while (l7Var2.C().u0("safelisted event", (String) it.next()));
                } else {
                    l7Var2.a().t().a("Safelisted event list is empty. Ignoring");
                }
                if (packageManager != null) {
                    this.f27678m = x9.a.a(l7Var2.d()) ? 1 : 0;
                } else {
                    this.f27678m = 0;
                }
            }
            l7Var3.a().o().b("PackageManager is null, app identity information might be inaccurate. appId", b6.x(packageName));
            strA = fb.a(l7Var.d(), "google_app_id", l7Var4.H());
            if (TextUtils.isEmpty(strA)) {
                str2 = strA;
            }
            this.f27679n = str2;
            if (iH == 0) {
                l7Var.a().w().c("App measurement enabled for app package, google app id", this.f27668c, this.f27679n);
            }
        } catch (IllegalStateException e10) {
            this.f27641a.a().o().c("Fetching Google App Id failed with exception. appId", b6.x(packageName), e10);
        }
        string = "Unknown";
        this.f27668c = packageName;
        this.f27671f = installerPackageName;
        this.f27669d = str3;
        this.f27670e = i10;
        this.f27672g = string;
        this.f27673h = 0L;
        l7 l7Var6 = this.f27641a;
        iH = l7Var6.h();
        if (iH != 0) {
            this.f27641a.a().w().a("App measurement collection enabled");
        } else if (iH != 1) {
            this.f27641a.a().u().a("App measurement deactivated via the manifest");
        } else if (iH != 3) {
            this.f27641a.a().u().a("App measurement disabled by setAnalyticsCollectionEnabled(false)");
        } else if (iH != 4) {
            this.f27641a.a().u().a("App measurement disabled via the manifest");
        } else if (iH != 6) {
            this.f27641a.a().t().a("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
        } else if (iH != 7) {
            this.f27641a.a().u().a("App measurement disabled via the global data collection setting");
        } else if (iH != 8) {
            l7 l7Var7 = this.f27641a;
            l7Var7.a().u().a("App measurement disabled");
            l7Var7.a().p().a("Invalid scion state in identity");
        } else {
            this.f27641a.a().u().a("App measurement disabled due to denied storage consent");
        }
        this.f27679n = BuildConfig.FLAVOR;
        l7Var = this.f27641a;
        l7Var.c();
        this.f27676k = null;
        l7Var2 = this.f27641a;
        l7Var2.c();
        listK = l7Var2.w().K("analytics.safelisted_events");
        if (listK != null) {
            this.f27676k = listK;
            break;
        } else if (listK.isEmpty()) {
            it = listK.iterator();
            do {
                if (it.hasNext()) {
                    this.f27676k = listK;
                    break;
                }
            } while (l7Var2.C().u0("safelisted event", (String) it.next()));
        } else {
            l7Var2.a().t().a("Safelisted event list is empty. Ignoring");
        }
        if (packageManager != null) {
            this.f27678m = x9.a.a(l7Var2.d()) ? 1 : 0;
        } else {
            this.f27678m = 0;
        }
    }

    public final hf o(String str) {
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
        String str4 = this.f27669d;
        j();
        long j11 = this.f27670e;
        j();
        o9.s.l(this.f27671f);
        String str5 = this.f27671f;
        l7 l7Var = this.f27641a;
        l7Var.w().A();
        j();
        h();
        long j12 = this.f27673h;
        if (j12 == 0) {
            ff ffVarC = this.f27641a.C();
            Context contextD = l7Var.d();
            String packageName = l7Var.d().getPackageName();
            ffVarC.h();
            o9.s.l(contextD);
            o9.s.f(packageName);
            PackageManager packageManager = contextD.getPackageManager();
            MessageDigest messageDigestC = ff.C();
            long jD = -1;
            if (messageDigestC == null) {
                ffVarC.f27641a.a().o().a("Could not get MD5 instance");
                J = 0;
            } else {
                if (packageManager != null) {
                    try {
                        if (ffVarC.S(contextD, packageName)) {
                            J = 0;
                            jD = 0;
                        } else {
                            x9.b bVarA = x9.c.a(contextD);
                            l7 l7Var2 = ffVarC.f27641a;
                            J = 0;
                            try {
                                Signature[] signatureArr = bVarA.e(l7Var2.d().getPackageName(), 64).signatures;
                                if (signatureArr == null || signatureArr.length <= 0) {
                                    l7Var2.a().r().a("Could not get signatures");
                                } else {
                                    jD = ff.D(messageDigestC.digest(signatureArr[0].toByteArray()));
                                }
                            } catch (PackageManager.NameNotFoundException e10) {
                                e = e10;
                                ffVarC.f27641a.a().o().b("Package name not found", e);
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
                this.f27673h = j12;
            }
            j12 = jD;
            this.f27673h = j12;
        } else {
            J = 0;
        }
        long j13 = j12;
        l7 l7Var3 = this.f27641a;
        boolean zG = l7Var3.g();
        boolean z11 = !l7Var3.x().f27699s;
        h();
        if (l7Var3.g()) {
            yg.a();
            if (l7Var3.w().H(null, e5.I0)) {
                this.f27641a.a().w().a("Disabled IID for tests.");
            } else {
                try {
                    Class<?> clsLoadClass = l7Var3.d().getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                    if (clsLoadClass != null) {
                        try {
                            Object objInvoke = clsLoadClass.getDeclaredMethod("getInstance", Context.class).invoke(null, this.f27641a.d());
                            if (objInvoke != null) {
                                try {
                                    str2 = (String) clsLoadClass.getDeclaredMethod("getFirebaseInstanceId", null).invoke(objInvoke, null);
                                } catch (Exception unused) {
                                    this.f27641a.a().t().a("Failed to retrieve Firebase Instance Id");
                                    str2 = null;
                                }
                            }
                        } catch (Exception unused2) {
                            this.f27641a.a().s().a("Failed to obtain Firebase Analytics instance");
                        }
                    }
                } catch (ClassNotFoundException unused3) {
                }
            }
            str2 = null;
        } else {
            str2 = null;
        }
        l7 l7Var4 = this.f27641a;
        long jA = l7Var4.x().f27686f.a();
        long jMin = jA == J ? l7Var4.D : Math.min(l7Var4.D, jA);
        j();
        int i12 = this.f27678m;
        l7 l7Var5 = this.f27641a;
        boolean zM = l7Var5.w().M();
        p6 p6VarX = l7Var5.x();
        p6VarX.h();
        String str6 = str2;
        boolean z12 = p6VarX.p().getBoolean("deferred_analytics_collection", false);
        boolean z13 = l7Var5.w().O("google_analytics_default_allow_ad_personalization_signals", true) != s8.GRANTED;
        long j14 = this.f27674i;
        Boolean boolValueOf = Boolean.valueOf(z13);
        List list = this.f27676k;
        String strL = l7Var5.x().w().l();
        if (this.f27677l == null) {
            this.f27677l = l7Var5.C().l0();
        }
        String str7 = this.f27677l;
        if (l7Var5.x().w().o(u8.ANALYTICS_STORAGE)) {
            h();
            if (this.f27681p != J) {
                long jA2 = l7Var5.e().a() - this.f27681p;
                if (this.f27680o != null && jA2 > 86400000 && this.f27682q == null) {
                    p();
                }
            }
            if (this.f27680o == null) {
                p();
            }
            str3 = this.f27680o;
        } else {
            str3 = null;
        }
        boolean zP = l7Var5.w().P();
        ff ffVarC2 = l7Var5.C();
        String strQ2 = q();
        String str8 = str3;
        l7 l7Var6 = ffVarC2.f27641a;
        if (l7Var6.d().getPackageManager() == null) {
            z10 = zP;
            j10 = J;
        } else {
            try {
                z10 = zP;
                i10 = 0;
                try {
                    ApplicationInfo applicationInfoC = x9.c.a(l7Var6.d()).c(strQ2, 0);
                    i11 = applicationInfoC != null ? applicationInfoC.targetSdkVersion : i10;
                } catch (PackageManager.NameNotFoundException unused4) {
                    l7 l7Var7 = ffVarC2.f27641a;
                    l7Var7.c();
                    l7Var7.a().u().b("PackageManager failed to find running app: app_id", strQ2);
                }
            } catch (PackageManager.NameNotFoundException unused5) {
                z10 = zP;
                i10 = 0;
            }
            j10 = i11;
        }
        l7 l7Var8 = this.f27641a;
        int iB = l7Var8.x().w().b();
        String strE = l7Var8.x().u().e();
        zf.a();
        m mVarW = l7Var8.w();
        d5 d5Var = e5.R0;
        long j15 = j10;
        int I = mVarW.H(null, d5Var) ? l7Var8.C().I() : 0;
        zf.a();
        if (l7Var8.w().H(null, d5Var)) {
            J = l7Var8.C().J();
        }
        String strR2 = l7Var8.w().R();
        String strB = new e3(l7Var8.w().O("google_analytics_default_allow_ad_personalization_signals", true)).b();
        l7 l7Var9 = this.f27641a;
        return new hf(strQ, strR, str4, j11, str5, 133005L, j13, str, zG, z11, str6, jMin, i12, zM, z12, boolValueOf, j14, list, strL, str7, str8, z10, j15, iB, strE, I, J, strR2, strB, l7Var9.D, l7Var9.N().q().zza());
    }

    public final void p() {
        String str;
        h();
        l7 l7Var = this.f27641a;
        if (l7Var.x().w().o(u8.ANALYTICS_STORAGE)) {
            byte[] bArr = new byte[16];
            l7Var.C().q0().nextBytes(bArr);
            str = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        } else {
            l7Var.a().v().a("Analytics Storage consent is not granted");
            str = null;
        }
        l7Var.a().v().a(String.format("Resetting session stitching token to %s", str == null ? "null" : "not null"));
        this.f27680o = str;
        this.f27681p = l7Var.e().a();
    }

    public final String q() {
        j();
        o9.s.l(this.f27668c);
        return this.f27668c;
    }

    public final String r() {
        h();
        j();
        o9.s.l(this.f27679n);
        return this.f27679n;
    }

    public final String s() {
        j();
        o9.s.l(this.f27672g);
        return this.f27672g;
    }

    public final int t() {
        j();
        return this.f27670e;
    }

    public final long u() {
        return this.f27675j;
    }

    public final int v() {
        j();
        return this.f27678m;
    }

    public final List w() {
        return this.f27676k;
    }

    public final boolean x(String str) {
        String str2 = this.f27682q;
        boolean z10 = false;
        if (str2 != null && !str2.equals(str)) {
            z10 = true;
        }
        this.f27682q = str;
        return z10;
    }
}
