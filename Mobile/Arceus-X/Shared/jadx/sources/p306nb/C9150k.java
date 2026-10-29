package p306nb;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import p305n9.C8953m;
import p462u9.C11823n;
import p511w9.C12327c;

/* JADX INFO: renamed from: nb.k */
/* JADX INFO: loaded from: classes.dex */
public final class C9150k extends C9143j8 {

    /* JADX INFO: renamed from: b */
    public Boolean f33091b;

    /* JADX INFO: renamed from: c */
    public String f33092c;

    /* JADX INFO: renamed from: d */
    public InterfaceC9134j f33093d;

    /* JADX INFO: renamed from: e */
    public Boolean f33094e;

    public C9150k(C9094g7 c9094g7) {
        super(c9094g7);
        this.f33093d = new InterfaceC9134j() { // from class: nb.i
            @Override // p306nb.InterfaceC9134j
            /* JADX INFO: renamed from: f */
            public final /* synthetic */ String mo36348f(String str, String str2) {
                return null;
            }
        };
    }

    /* JADX INFO: renamed from: n */
    public static final long m36394n() {
        return ((Long) C9395z4.f33769e.m37079b(null)).longValue();
    }

    /* JADX INFO: renamed from: o */
    public static final int m36395o() {
        return Math.max(0, ((Integer) C9395z4.f33784j.m37079b(null)).intValue());
    }

    /* JADX INFO: renamed from: p */
    public static final long m36396p() {
        return ((Integer) C9395z4.f33790l.m37079b(null)).intValue();
    }

    /* JADX INFO: renamed from: q */
    public static final long m36397q() {
        return ((Long) C9395z4.f33741S.m37079b(null)).longValue();
    }

    /* JADX INFO: renamed from: r */
    public static final long m36398r() {
        return ((Long) C9395z4.f33731N.m37079b(null)).longValue();
    }

    /* JADX INFO: renamed from: A */
    public final long m36399A() {
        this.f33067a.mo36323c();
        return 133005L;
    }

    /* JADX INFO: renamed from: B */
    public final boolean m36400B() {
        if (this.f33094e == null) {
            synchronized (this) {
                try {
                    if (this.f33094e == null) {
                        C9094g7 c9094g7 = this.f33067a;
                        ApplicationInfo applicationInfo = c9094g7.mo36324d().getApplicationInfo();
                        String strM44205a = C11823n.m44205a();
                        if (applicationInfo != null) {
                            String str = applicationInfo.processName;
                            boolean z10 = false;
                            if (str != null && str.equals(strM44205a)) {
                                z10 = true;
                            }
                            this.f33094e = Boolean.valueOf(z10);
                        }
                        if (this.f33094e == null) {
                            this.f33094e = Boolean.TRUE;
                            c9094g7.mo36321a().m37003o().m36911a("My process not in the list of running processes");
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f33094e.booleanValue();
    }

    /* JADX INFO: renamed from: C */
    public final String m36401C(String str, C9379y4 c9379y4) {
        return TextUtils.isEmpty(str) ? (String) c9379y4.m37079b(null) : (String) c9379y4.m37079b(this.f33093d.mo36348f(str, c9379y4.m37078a()));
    }

    /* JADX INFO: renamed from: D */
    public final long m36402D(String str, C9379y4 c9379y4) {
        if (TextUtils.isEmpty(str)) {
            return ((Long) c9379y4.m37079b(null)).longValue();
        }
        String strMo36348f = this.f33093d.mo36348f(str, c9379y4.m37078a());
        if (TextUtils.isEmpty(strMo36348f)) {
            return ((Long) c9379y4.m37079b(null)).longValue();
        }
        try {
            return ((Long) c9379y4.m37079b(Long.valueOf(Long.parseLong(strMo36348f)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) c9379y4.m37079b(null)).longValue();
        }
    }

    /* JADX INFO: renamed from: E */
    public final int m36403E(String str, C9379y4 c9379y4) {
        if (TextUtils.isEmpty(str)) {
            return ((Integer) c9379y4.m37079b(null)).intValue();
        }
        String strMo36348f = this.f33093d.mo36348f(str, c9379y4.m37078a());
        if (TextUtils.isEmpty(strMo36348f)) {
            return ((Integer) c9379y4.m37079b(null)).intValue();
        }
        try {
            return ((Integer) c9379y4.m37079b(Integer.valueOf(Integer.parseInt(strMo36348f)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) c9379y4.m37079b(null)).intValue();
        }
    }

    /* JADX INFO: renamed from: F */
    public final int m36404F(String str, C9379y4 c9379y4, int i10, int i11) {
        return Math.max(Math.min(m36403E(str, c9379y4), i11), i10);
    }

    /* JADX INFO: renamed from: G */
    public final double m36405G(String str, C9379y4 c9379y4) {
        if (TextUtils.isEmpty(str)) {
            return ((Double) c9379y4.m37079b(null)).doubleValue();
        }
        String strMo36348f = this.f33093d.mo36348f(str, c9379y4.m37078a());
        if (TextUtils.isEmpty(strMo36348f)) {
            return ((Double) c9379y4.m37079b(null)).doubleValue();
        }
        try {
            return ((Double) c9379y4.m37079b(Double.valueOf(Double.parseDouble(strMo36348f)))).doubleValue();
        } catch (NumberFormatException unused) {
            return ((Double) c9379y4.m37079b(null)).doubleValue();
        }
    }

    /* JADX INFO: renamed from: H */
    public final boolean m36406H(String str, C9379y4 c9379y4) {
        if (TextUtils.isEmpty(str)) {
            return ((Boolean) c9379y4.m37079b(null)).booleanValue();
        }
        String strMo36348f = this.f33093d.mo36348f(str, c9379y4.m37078a());
        return TextUtils.isEmpty(strMo36348f) ? ((Boolean) c9379y4.m37079b(null)).booleanValue() : ((Boolean) c9379y4.m37079b(Boolean.valueOf("1".equals(strMo36348f)))).booleanValue();
    }

    /* JADX INFO: renamed from: I */
    public final Bundle m36407I() {
        try {
            C9094g7 c9094g7 = this.f33067a;
            if (c9094g7.mo36324d().getPackageManager() == null) {
                c9094g7.mo36321a().m37003o().m36911a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo applicationInfoM46176c = C12327c.m46181a(c9094g7.mo36324d()).m46176c(c9094g7.mo36324d().getPackageName(), 128);
            if (applicationInfoM46176c != null) {
                return applicationInfoM46176c.metaData;
            }
            c9094g7.mo36321a().m37003o().m36911a("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e10) {
            this.f33067a.mo36321a().m37003o().m36912b("Failed to load metadata: Package name not found", e10);
            return null;
        }
    }

    /* JADX INFO: renamed from: J */
    public final Boolean m36408J(String str) {
        C8953m.m36041f(str);
        Bundle bundleM36407I = m36407I();
        if (bundleM36407I == null) {
            this.f33067a.mo36321a().m37003o().m36911a("Failed to load metadata: Metadata bundle is null");
            return null;
        }
        if (bundleM36407I.containsKey(str)) {
            return Boolean.valueOf(bundleM36407I.getBoolean(str));
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0042 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:0x0043 A[Catch: NotFoundException -> 0x0048, TRY_LEAVE, TryCatch #0 {NotFoundException -> 0x0048, blocks: (B:11:0x002e, B:14:0x0043), top: B:19:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:19:0x002e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: K */
    public final List m36409K(String str) {
        Integer numValueOf;
        String[] stringArray;
        C8953m.m36041f("analytics.safelisted_events");
        Bundle bundleM36407I = m36407I();
        if (bundleM36407I != null) {
            if (bundleM36407I.containsKey("analytics.safelisted_events")) {
                numValueOf = Integer.valueOf(bundleM36407I.getInt("analytics.safelisted_events"));
            }
            if (numValueOf != null) {
                try {
                    stringArray = this.f33067a.mo36324d().getResources().getStringArray(numValueOf.intValue());
                    if (stringArray == null) {
                        return null;
                    }
                    return Arrays.asList(stringArray);
                } catch (Resources.NotFoundException e10) {
                    this.f33067a.mo36321a().m37003o().m36912b("Failed to load string array from metadata: resource not found", e10);
                }
            }
            return null;
        }
        this.f33067a.mo36321a().m37003o().m36911a("Failed to load metadata: Metadata bundle is null");
        numValueOf = null;
        if (numValueOf != null) {
            stringArray = this.f33067a.mo36324d().getResources().getStringArray(numValueOf.intValue());
            if (stringArray == null) {
                return null;
            }
            return Arrays.asList(stringArray);
        }
        return null;
    }

    /* JADX INFO: renamed from: L */
    public final boolean m36410L() {
        this.f33067a.mo36323c();
        Boolean boolM36408J = m36408J("firebase_analytics_collection_deactivated");
        return boolM36408J != null && boolM36408J.booleanValue();
    }

    /* JADX INFO: renamed from: M */
    public final boolean m36411M() {
        Boolean boolM36408J = m36408J("google_analytics_adid_collection_enabled");
        return boolM36408J == null || boolM36408J.booleanValue();
    }

    /* JADX INFO: renamed from: N */
    public final boolean m36412N() {
        Boolean boolM36408J = m36408J("google_analytics_automatic_screen_reporting_enabled");
        return boolM36408J == null || boolM36408J.booleanValue();
    }

    /* JADX INFO: renamed from: O */
    public final EnumC9207n8 m36413O(String str, boolean z10) {
        Object obj;
        C8953m.m36041f(str);
        C9094g7 c9094g7 = this.f33067a;
        Bundle bundleM36407I = m36407I();
        if (bundleM36407I == null) {
            c9094g7.mo36321a().m37003o().m36911a("Failed to load metadata: Metadata bundle is null");
            obj = null;
        } else {
            obj = bundleM36407I.get(str);
        }
        if (obj == null) {
            return EnumC9207n8.UNINITIALIZED;
        }
        if (Boolean.TRUE.equals(obj)) {
            return EnumC9207n8.GRANTED;
        }
        if (Boolean.FALSE.equals(obj)) {
            return EnumC9207n8.DENIED;
        }
        if (z10 && "eu_consent_policy".equals(obj)) {
            return EnumC9207n8.POLICY;
        }
        c9094g7.mo36321a().m37006r().m36912b("Invalid manifest metadata for", str);
        return EnumC9207n8.UNINITIALIZED;
    }

    /* JADX INFO: renamed from: P */
    public final boolean m36414P() {
        Boolean boolM36408J = m36408J("google_analytics_sgtm_upload_enabled");
        if (boolM36408J == null) {
            return false;
        }
        return boolM36408J.booleanValue();
    }

    /* JADX INFO: renamed from: Q */
    public final void m36415Q(String str) {
        this.f33092c = str;
    }

    /* JADX INFO: renamed from: R */
    public final String m36416R() {
        return this.f33092c;
    }

    /* JADX INFO: renamed from: i */
    public final String m36417i() {
        return m36422s("debug.firebase.analytics.app", "");
    }

    /* JADX INFO: renamed from: j */
    public final String m36418j() {
        return m36422s("debug.deferred.deeplink", "");
    }

    /* JADX INFO: renamed from: k */
    public final boolean m36419k(String str) {
        return "1".equals(this.f33093d.mo36348f(str, "gaia_collection_enabled"));
    }

    /* JADX INFO: renamed from: l */
    public final boolean m36420l(String str) {
        return "1".equals(this.f33093d.mo36348f(str, "measurement.event_sampling_enabled"));
    }

    /* JADX INFO: renamed from: m */
    public final boolean m36421m() {
        if (this.f33091b == null) {
            Boolean boolM36408J = m36408J("app_measurement_lite");
            this.f33091b = boolM36408J;
            if (boolM36408J == null) {
                this.f33091b = Boolean.FALSE;
            }
        }
        return this.f33091b.booleanValue() || !this.f33067a.m36312G();
    }

    /* JADX INFO: renamed from: s */
    public final String m36422s(String str, String str2) {
        try {
            String str3 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, "");
            C8953m.m36047l(str3);
            return str3;
        } catch (ClassNotFoundException e10) {
            this.f33067a.mo36321a().m37003o().m36912b("Could not find SystemProperties class", e10);
            return "";
        } catch (IllegalAccessException e11) {
            this.f33067a.mo36321a().m37003o().m36912b("Could not access SystemProperties.get()", e11);
            return "";
        } catch (NoSuchMethodException e12) {
            this.f33067a.mo36321a().m37003o().m36912b("Could not find SystemProperties.get() method", e12);
            return "";
        } catch (InvocationTargetException e13) {
            this.f33067a.mo36321a().m37003o().m36912b("SystemProperties.get() threw an exception", e13);
            return "";
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m36423t(InterfaceC9134j interfaceC9134j) {
        this.f33093d = interfaceC9134j;
    }

    /* JADX INFO: renamed from: u */
    public final String m36424u() {
        this.f33067a.mo36323c();
        return "FA";
    }

    /* JADX INFO: renamed from: v */
    public final int m36425v() {
        return this.f33067a.m36308C().m36952V(201500000, true) ? 100 : 25;
    }

    /* JADX INFO: renamed from: w */
    public final int m36426w(String str) {
        return m36404F(str, C9395z4.f33753Y, 25, 100);
    }

    /* JADX INFO: renamed from: x */
    public final int m36427x(String str, boolean z10) {
        if (z10) {
            return m36404F(str, C9395z4.f33782i0, 100, 500);
        }
        return 500;
    }

    /* JADX INFO: renamed from: y */
    public final int m36428y(String str, boolean z10) {
        return Math.max(m36427x(str, z10), 256);
    }

    /* JADX INFO: renamed from: z */
    public final int m36429z(String str) {
        return m36404F(str, C9395z4.f33751X, 500, 2000);
    }
}
