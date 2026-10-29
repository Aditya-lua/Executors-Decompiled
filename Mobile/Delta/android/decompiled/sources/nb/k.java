package nb;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class k extends j8 {
    public Boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f25646c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public j f25647d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Boolean f25648e;

    public k(g7 g7Var) {
        super(g7Var);
        this.f25647d = new j() { // from class: nb.i
            @Override // nb.j
            public final /* synthetic */ String f(String str, String str2) {
                return null;
            }
        };
    }

    public static final long n() {
        return ((Long) z4.f26160e.b(null)).longValue();
    }

    public static final int o() {
        return Math.max(0, ((Integer) z4.f26175j.b(null)).intValue());
    }

    public static final long p() {
        return ((Integer) z4.f26181l.b(null)).intValue();
    }

    public static final long q() {
        return ((Long) z4.S.b(null)).longValue();
    }

    public static final long r() {
        return ((Long) z4.N.b(null)).longValue();
    }

    public final long A() {
        this.f25625a.c();
        return 133005L;
    }

    public final boolean B() {
        if (this.f25648e == null) {
            synchronized (this) {
                try {
                    if (this.f25648e == null) {
                        g7 g7Var = this.f25625a;
                        ApplicationInfo applicationInfo = g7Var.d().getApplicationInfo();
                        String strA = u9.n.a();
                        if (applicationInfo != null) {
                            String str = applicationInfo.processName;
                            boolean z10 = false;
                            if (str != null && str.equals(strA)) {
                                z10 = true;
                            }
                            this.f25648e = Boolean.valueOf(z10);
                        }
                        if (this.f25648e == null) {
                            this.f25648e = Boolean.TRUE;
                            g7Var.a().o().a("My process not in the list of running processes");
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f25648e.booleanValue();
    }

    public final String C(String str, y4 y4Var) {
        return TextUtils.isEmpty(str) ? (String) y4Var.b(null) : (String) y4Var.b(this.f25647d.f(str, y4Var.a()));
    }

    public final long D(String str, y4 y4Var) {
        if (TextUtils.isEmpty(str)) {
            return ((Long) y4Var.b(null)).longValue();
        }
        String strF = this.f25647d.f(str, y4Var.a());
        if (TextUtils.isEmpty(strF)) {
            return ((Long) y4Var.b(null)).longValue();
        }
        try {
            return ((Long) y4Var.b(Long.valueOf(Long.parseLong(strF)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) y4Var.b(null)).longValue();
        }
    }

    public final int E(String str, y4 y4Var) {
        if (TextUtils.isEmpty(str)) {
            return ((Integer) y4Var.b(null)).intValue();
        }
        String strF = this.f25647d.f(str, y4Var.a());
        if (TextUtils.isEmpty(strF)) {
            return ((Integer) y4Var.b(null)).intValue();
        }
        try {
            return ((Integer) y4Var.b(Integer.valueOf(Integer.parseInt(strF)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) y4Var.b(null)).intValue();
        }
    }

    public final int F(String str, y4 y4Var, int i10, int i11) {
        return Math.max(Math.min(E(str, y4Var), i11), i10);
    }

    public final double G(String str, y4 y4Var) {
        if (TextUtils.isEmpty(str)) {
            return ((Double) y4Var.b(null)).doubleValue();
        }
        String strF = this.f25647d.f(str, y4Var.a());
        if (TextUtils.isEmpty(strF)) {
            return ((Double) y4Var.b(null)).doubleValue();
        }
        try {
            return ((Double) y4Var.b(Double.valueOf(Double.parseDouble(strF)))).doubleValue();
        } catch (NumberFormatException unused) {
            return ((Double) y4Var.b(null)).doubleValue();
        }
    }

    public final boolean H(String str, y4 y4Var) {
        if (TextUtils.isEmpty(str)) {
            return ((Boolean) y4Var.b(null)).booleanValue();
        }
        String strF = this.f25647d.f(str, y4Var.a());
        return TextUtils.isEmpty(strF) ? ((Boolean) y4Var.b(null)).booleanValue() : ((Boolean) y4Var.b(Boolean.valueOf("1".equals(strF)))).booleanValue();
    }

    public final Bundle I() {
        try {
            g7 g7Var = this.f25625a;
            if (g7Var.d().getPackageManager() == null) {
                g7Var.a().o().a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo applicationInfoC = w9.c.a(g7Var.d()).c(g7Var.d().getPackageName(), 128);
            if (applicationInfoC != null) {
                return applicationInfoC.metaData;
            }
            g7Var.a().o().a("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e10) {
            this.f25625a.a().o().b("Failed to load metadata: Package name not found", e10);
            return null;
        }
    }

    public final Boolean J(String str) {
        n9.m.f(str);
        Bundle bundleI = I();
        if (bundleI == null) {
            this.f25625a.a().o().a("Failed to load metadata: Metadata bundle is null");
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
        n9.m.f("analytics.safelisted_events");
        Bundle bundleI = I();
        if (bundleI != null) {
            if (bundleI.containsKey("analytics.safelisted_events")) {
                numValueOf = Integer.valueOf(bundleI.getInt("analytics.safelisted_events"));
            }
            if (numValueOf != null) {
                try {
                    stringArray = this.f25625a.d().getResources().getStringArray(numValueOf.intValue());
                    if (stringArray == null) {
                        return null;
                    }
                    return Arrays.asList(stringArray);
                } catch (Resources.NotFoundException e10) {
                    this.f25625a.a().o().b("Failed to load string array from metadata: resource not found", e10);
                }
            }
            return null;
        }
        this.f25625a.a().o().a("Failed to load metadata: Metadata bundle is null");
        numValueOf = null;
        if (numValueOf != null) {
            stringArray = this.f25625a.d().getResources().getStringArray(numValueOf.intValue());
            if (stringArray == null) {
                return null;
            }
            return Arrays.asList(stringArray);
        }
        return null;
    }

    public final boolean L() {
        this.f25625a.c();
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

    public final n8 O(String str, boolean z10) {
        Object obj;
        n9.m.f(str);
        g7 g7Var = this.f25625a;
        Bundle bundleI = I();
        if (bundleI == null) {
            g7Var.a().o().a("Failed to load metadata: Metadata bundle is null");
            obj = null;
        } else {
            obj = bundleI.get(str);
        }
        if (obj == null) {
            return n8.UNINITIALIZED;
        }
        if (Boolean.TRUE.equals(obj)) {
            return n8.GRANTED;
        }
        if (Boolean.FALSE.equals(obj)) {
            return n8.DENIED;
        }
        if (z10 && "eu_consent_policy".equals(obj)) {
            return n8.POLICY;
        }
        g7Var.a().r().b("Invalid manifest metadata for", str);
        return n8.UNINITIALIZED;
    }

    public final boolean P() {
        Boolean boolJ = J("google_analytics_sgtm_upload_enabled");
        if (boolJ == null) {
            return false;
        }
        return boolJ.booleanValue();
    }

    public final void Q(String str) {
        this.f25646c = str;
    }

    public final String R() {
        return this.f25646c;
    }

    public final String i() {
        return s("debug.firebase.analytics.app", "");
    }

    public final String j() {
        return s("debug.deferred.deeplink", "");
    }

    public final boolean k(String str) {
        return "1".equals(this.f25647d.f(str, "gaia_collection_enabled"));
    }

    public final boolean l(String str) {
        return "1".equals(this.f25647d.f(str, "measurement.event_sampling_enabled"));
    }

    public final boolean m() {
        if (this.b == null) {
            Boolean boolJ = J("app_measurement_lite");
            this.b = boolJ;
            if (boolJ == null) {
                this.b = Boolean.FALSE;
            }
        }
        return this.b.booleanValue() || !this.f25625a.G();
    }

    public final String s(String str, String str2) {
        try {
            String str3 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, "");
            n9.m.l(str3);
            return str3;
        } catch (ClassNotFoundException e10) {
            this.f25625a.a().o().b("Could not find SystemProperties class", e10);
            return "";
        } catch (IllegalAccessException e11) {
            this.f25625a.a().o().b("Could not access SystemProperties.get()", e11);
            return "";
        } catch (NoSuchMethodException e12) {
            this.f25625a.a().o().b("Could not find SystemProperties.get() method", e12);
            return "";
        } catch (InvocationTargetException e13) {
            this.f25625a.a().o().b("SystemProperties.get() threw an exception", e13);
            return "";
        }
    }

    public final void t(j jVar) {
        this.f25647d = jVar;
    }

    public final String u() {
        this.f25625a.c();
        return "FA";
    }

    public final int v() {
        return this.f25625a.C().V(201500000, true) ? 100 : 25;
    }

    public final int w(String str) {
        return F(str, z4.Y, 25, 100);
    }

    public final int x(String str, boolean z10) {
        if (z10) {
            return F(str, z4.f26173i0, 100, 500);
        }
        return 500;
    }

    public final int y(String str, boolean z10) {
        return Math.max(x(str, z10), Barcode.FORMAT_QR_CODE);
    }

    public final int z(String str) {
        return F(str, z4.X, 500, 2000);
    }
}
