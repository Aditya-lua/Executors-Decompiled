package ob;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import com.github.luben.zstd.BuildConfig;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class m extends o8 {
    public Boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f27571c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public l f27572d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Boolean f27573e;

    public m(l7 l7Var) {
        super(l7Var);
        this.f27572d = new l() { // from class: ob.k
            @Override // ob.l
            public final /* synthetic */ String f(String str, String str2) {
                return null;
            }
        };
    }

    public static final long n() {
        return ((Long) e5.f27235e.b(null)).longValue();
    }

    public static final int o() {
        return Math.max(0, ((Integer) e5.f27250j.b(null)).intValue());
    }

    public static final long p() {
        return ((Integer) e5.f27256l.b(null)).intValue();
    }

    public static final long q() {
        return ((Long) e5.S.b(null)).longValue();
    }

    public static final long r() {
        return ((Long) e5.N.b(null)).longValue();
    }

    public final long A() {
        this.f27641a.c();
        return 133005L;
    }

    public final boolean B() {
        if (this.f27573e == null) {
            synchronized (this) {
                try {
                    if (this.f27573e == null) {
                        l7 l7Var = this.f27641a;
                        ApplicationInfo applicationInfo = l7Var.d().getApplicationInfo();
                        String strA = v9.n.a();
                        if (applicationInfo != null) {
                            String str = applicationInfo.processName;
                            boolean z10 = false;
                            if (str != null && str.equals(strA)) {
                                z10 = true;
                            }
                            this.f27573e = Boolean.valueOf(z10);
                        }
                        if (this.f27573e == null) {
                            this.f27573e = Boolean.TRUE;
                            l7Var.a().o().a("My process not in the list of running processes");
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f27573e.booleanValue();
    }

    public final String C(String str, d5 d5Var) {
        return TextUtils.isEmpty(str) ? (String) d5Var.b(null) : (String) d5Var.b(this.f27572d.f(str, d5Var.a()));
    }

    public final long D(String str, d5 d5Var) {
        if (TextUtils.isEmpty(str)) {
            return ((Long) d5Var.b(null)).longValue();
        }
        String strF = this.f27572d.f(str, d5Var.a());
        if (TextUtils.isEmpty(strF)) {
            return ((Long) d5Var.b(null)).longValue();
        }
        try {
            return ((Long) d5Var.b(Long.valueOf(Long.parseLong(strF)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) d5Var.b(null)).longValue();
        }
    }

    public final int E(String str, d5 d5Var) {
        if (TextUtils.isEmpty(str)) {
            return ((Integer) d5Var.b(null)).intValue();
        }
        String strF = this.f27572d.f(str, d5Var.a());
        if (TextUtils.isEmpty(strF)) {
            return ((Integer) d5Var.b(null)).intValue();
        }
        try {
            return ((Integer) d5Var.b(Integer.valueOf(Integer.parseInt(strF)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) d5Var.b(null)).intValue();
        }
    }

    public final int F(String str, d5 d5Var, int i10, int i11) {
        return Math.max(Math.min(E(str, d5Var), i11), i10);
    }

    public final double G(String str, d5 d5Var) {
        if (TextUtils.isEmpty(str)) {
            return ((Double) d5Var.b(null)).doubleValue();
        }
        String strF = this.f27572d.f(str, d5Var.a());
        if (TextUtils.isEmpty(strF)) {
            return ((Double) d5Var.b(null)).doubleValue();
        }
        try {
            return ((Double) d5Var.b(Double.valueOf(Double.parseDouble(strF)))).doubleValue();
        } catch (NumberFormatException unused) {
            return ((Double) d5Var.b(null)).doubleValue();
        }
    }

    public final boolean H(String str, d5 d5Var) {
        if (TextUtils.isEmpty(str)) {
            return ((Boolean) d5Var.b(null)).booleanValue();
        }
        String strF = this.f27572d.f(str, d5Var.a());
        return TextUtils.isEmpty(strF) ? ((Boolean) d5Var.b(null)).booleanValue() : ((Boolean) d5Var.b(Boolean.valueOf("1".equals(strF)))).booleanValue();
    }

    public final Bundle I() {
        try {
            l7 l7Var = this.f27641a;
            if (l7Var.d().getPackageManager() == null) {
                l7Var.a().o().a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo applicationInfoC = x9.c.a(l7Var.d()).c(l7Var.d().getPackageName(), Barcode.FORMAT_ITF);
            if (applicationInfoC != null) {
                return applicationInfoC.metaData;
            }
            l7Var.a().o().a("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e10) {
            this.f27641a.a().o().b("Failed to load metadata: Package name not found", e10);
            return null;
        }
    }

    public final Boolean J(String str) {
        o9.s.f(str);
        Bundle bundleI = I();
        if (bundleI == null) {
            this.f27641a.a().o().a("Failed to load metadata: Metadata bundle is null");
            return null;
        }
        if (bundleI.containsKey(str)) {
            return Boolean.valueOf(bundleI.getBoolean(str));
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0042 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:0x0043 A[Catch: NotFoundException -> 0x0048, TRY_LEAVE, TryCatch #0 {NotFoundException -> 0x0048, blocks: (B:11:0x002e, B:14:0x0043), top: B:19:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:19:0x002e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final List K(String str) {
        Integer numValueOf;
        String[] stringArray;
        o9.s.f("analytics.safelisted_events");
        Bundle bundleI = I();
        if (bundleI != null) {
            if (bundleI.containsKey("analytics.safelisted_events")) {
                numValueOf = Integer.valueOf(bundleI.getInt("analytics.safelisted_events"));
            }
            if (numValueOf != null) {
                try {
                    stringArray = this.f27641a.d().getResources().getStringArray(numValueOf.intValue());
                    if (stringArray == null) {
                        return null;
                    }
                    return Arrays.asList(stringArray);
                } catch (Resources.NotFoundException e10) {
                    this.f27641a.a().o().b("Failed to load string array from metadata: resource not found", e10);
                }
            }
            return null;
        }
        this.f27641a.a().o().a("Failed to load metadata: Metadata bundle is null");
        numValueOf = null;
        if (numValueOf != null) {
            stringArray = this.f27641a.d().getResources().getStringArray(numValueOf.intValue());
            if (stringArray == null) {
                return null;
            }
            return Arrays.asList(stringArray);
        }
        return null;
    }

    public final boolean L() {
        this.f27641a.c();
        Boolean boolJ = J("firebase_analytics_collection_deactivated");
        return boolJ != null && boolJ.booleanValue();
    }

    public final boolean M() {
        Boolean boolJ = J("google_analytics_adid_collection_enabled");
        return boolJ == null || boolJ.booleanValue();
    }

    public final boolean N() {
        Boolean boolJ = J("google_analytics_automatic_screen_reporting_enabled");
        return boolJ == null || boolJ.booleanValue();
    }

    public final s8 O(String str, boolean z10) {
        Object obj;
        o9.s.f(str);
        l7 l7Var = this.f27641a;
        Bundle bundleI = I();
        if (bundleI == null) {
            l7Var.a().o().a("Failed to load metadata: Metadata bundle is null");
            obj = null;
        } else {
            obj = bundleI.get(str);
        }
        if (obj == null) {
            return s8.UNINITIALIZED;
        }
        if (Boolean.TRUE.equals(obj)) {
            return s8.GRANTED;
        }
        if (Boolean.FALSE.equals(obj)) {
            return s8.DENIED;
        }
        if (z10 && "eu_consent_policy".equals(obj)) {
            return s8.POLICY;
        }
        l7Var.a().r().b("Invalid manifest metadata for", str);
        return s8.UNINITIALIZED;
    }

    public final boolean P() {
        Boolean boolJ = J("google_analytics_sgtm_upload_enabled");
        if (boolJ == null) {
            return false;
        }
        return boolJ.booleanValue();
    }

    public final void Q(String str) {
        this.f27571c = str;
    }

    public final String R() {
        return this.f27571c;
    }

    public final String i() {
        return s("debug.firebase.analytics.app", BuildConfig.FLAVOR);
    }

    public final String j() {
        return s("debug.deferred.deeplink", BuildConfig.FLAVOR);
    }

    public final boolean k(String str) {
        return "1".equals(this.f27572d.f(str, "gaia_collection_enabled"));
    }

    public final boolean l(String str) {
        return "1".equals(this.f27572d.f(str, "measurement.event_sampling_enabled"));
    }

    public final boolean m() {
        if (this.b == null) {
            Boolean boolJ = J("app_measurement_lite");
            this.b = boolJ;
            if (boolJ == null) {
                this.b = Boolean.FALSE;
            }
        }
        return this.b.booleanValue() || !this.f27641a.G();
    }

    public final String s(String str, String str2) {
        try {
            String str3 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, BuildConfig.FLAVOR);
            o9.s.l(str3);
            return str3;
        } catch (ClassNotFoundException e10) {
            this.f27641a.a().o().b("Could not find SystemProperties class", e10);
            return BuildConfig.FLAVOR;
        } catch (IllegalAccessException e11) {
            this.f27641a.a().o().b("Could not access SystemProperties.get()", e11);
            return BuildConfig.FLAVOR;
        } catch (NoSuchMethodException e12) {
            this.f27641a.a().o().b("Could not find SystemProperties.get() method", e12);
            return BuildConfig.FLAVOR;
        } catch (InvocationTargetException e13) {
            this.f27641a.a().o().b("SystemProperties.get() threw an exception", e13);
            return BuildConfig.FLAVOR;
        }
    }

    public final void t(l lVar) {
        this.f27572d = lVar;
    }

    public final String u() {
        this.f27641a.c();
        return "FA";
    }

    public final int v() {
        return this.f27641a.C().V(201500000, true) ? 100 : 25;
    }

    public final int w(String str) {
        return F(str, e5.Y, 25, 100);
    }

    public final int x(String str, boolean z10) {
        if (z10) {
            return F(str, e5.f27248i0, 100, 500);
        }
        return 500;
    }

    public final int y(String str, boolean z10) {
        return Math.max(x(str, z10), Barcode.FORMAT_QR_CODE);
    }

    public final int z(String str) {
        return F(str, e5.X, 500, 2000);
    }
}
