package ob;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.appsflyer.sdk_base.referrer.Payload;
import com.google.android.gms.internal.measurement.fh;
import com.google.android.gms.internal.measurement.gh;
import com.google.android.gms.internal.measurement.kg;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class c7 extends ge implements l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f27148d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f27149e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map f27150f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map f27151g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Map f27152h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Map f27153i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final w1.i f27154j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final kg f27155k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Map f27156l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Map f27157m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Map f27158n;

    public c7(ve veVar) {
        super(veVar);
        this.f27148d = new w1.a();
        this.f27149e = new w1.a();
        this.f27150f = new w1.a();
        this.f27151g = new w1.a();
        this.f27152h = new w1.a();
        this.f27156l = new w1.a();
        this.f27157m = new w1.a();
        this.f27158n = new w1.a();
        this.f27153i = new w1.a();
        this.f27154j = new v6(this, 20);
        this.f27155k = new w6(this);
    }

    public static final Map u(com.google.android.gms.internal.measurement.k5 k5Var) {
        w1.a aVar = new w1.a();
        if (k5Var != null) {
            for (com.google.android.gms.internal.measurement.s5 s5Var : k5Var.J()) {
                aVar.put(s5Var.F(), s5Var.G());
            }
        }
        return aVar;
    }

    public static final u8 v(int i10) {
        int i11 = i10 - 1;
        if (i11 == 1) {
            return u8.AD_STORAGE;
        }
        if (i11 == 2) {
            return u8.ANALYTICS_STORAGE;
        }
        if (i11 == 3) {
            return u8.AD_USER_DATA;
        }
        if (i11 != 4) {
            return null;
        }
        return u8.AD_PERSONALIZATION;
    }

    public final void A(String str) {
        h();
        this.f27157m.put(str, null);
    }

    public final void B(String str) {
        h();
        this.f27152h.remove(str);
    }

    public final boolean C(String str, byte[] bArr, String str2, String str3) throws Throwable {
        j();
        h();
        o9.s.f(str);
        com.google.android.gms.internal.measurement.j5 j5Var = (com.google.android.gms.internal.measurement.j5) t(str, bArr).q();
        r(str, j5Var);
        s(str, (com.google.android.gms.internal.measurement.k5) j5Var.v());
        this.f27152h.put(str, (com.google.android.gms.internal.measurement.k5) j5Var.v());
        this.f27156l.put(str, j5Var.J());
        this.f27157m.put(str, str2);
        this.f27158n.put(str, str3);
        this.f27148d.put(str, u((com.google.android.gms.internal.measurement.k5) j5Var.v()));
        this.b.F0().Y(str, new ArrayList(j5Var.D()));
        try {
            j5Var.F();
            bArr = ((com.google.android.gms.internal.measurement.k5) j5Var.v()).d();
        } catch (RuntimeException e10) {
            this.f27641a.a().r().c("Unable to serialize reduced-size config. Storing full config instead. appId", b6.x(str), e10);
        }
        w wVarF0 = this.b.F0();
        o9.s.f(str);
        wVarF0.h();
        wVarF0.j();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr);
        contentValues.put("config_last_modified_time", str2);
        contentValues.put("e_tag", str3);
        try {
            if (wVarF0.u0().update("apps", contentValues, "app_id = ?", new String[]{str}) == 0) {
                wVarF0.f27641a.a().o().b("Failed to update remote config (got 0). appId", b6.x(str));
            }
        } catch (SQLiteException e11) {
            wVarF0.f27641a.a().o().c("Error storing remote config. appId", b6.x(str), e11);
        }
        j5Var.G();
        this.f27152h.put(str, (com.google.android.gms.internal.measurement.k5) j5Var.v());
        return true;
    }

    public final boolean D(String str, String str2) throws Throwable {
        Boolean bool;
        h();
        q(str);
        if (H(str) && ff.N(str2)) {
            return true;
        }
        if (I(str) && ff.r0(str2)) {
            return true;
        }
        Map map = (Map) this.f27150f.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean E(String str, String str2) throws Throwable {
        Boolean bool;
        h();
        q(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = (Map) this.f27151g.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final Set F(String str) {
        h();
        q(str);
        return (Set) this.f27149e.get(str);
    }

    public final int G(String str, String str2) throws Throwable {
        Integer num;
        h();
        q(str);
        Map map = (Map) this.f27153i.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    public final boolean H(String str) {
        return "1".equals(f(str, "measurement.upload.blacklist_internal"));
    }

    public final boolean I(String str) {
        return "1".equals(f(str, "measurement.upload.blacklist_public"));
    }

    public final boolean J(String str) throws Throwable {
        h();
        q(str);
        Map map = this.f27149e;
        if (map.get(str) != null) {
            return ((Set) map.get(str)).contains(Payload.DEVICE_MODEL) || ((Set) map.get(str)).contains("device_info");
        }
        return false;
    }

    public final boolean K(String str) throws Throwable {
        h();
        q(str);
        Map map = this.f27149e;
        if (map.get(str) != null) {
            return ((Set) map.get(str)).contains("os_version") || ((Set) map.get(str)).contains("device_info");
        }
        return false;
    }

    public final boolean L(String str) throws Throwable {
        h();
        q(str);
        Map map = this.f27149e;
        return map.get(str) != null && ((Set) map.get(str)).contains("user_id");
    }

    public final boolean M(String str) throws Throwable {
        h();
        q(str);
        Map map = this.f27149e;
        return map.get(str) != null && ((Set) map.get(str)).contains("google_signals");
    }

    public final boolean N(String str) throws Throwable {
        h();
        q(str);
        Map map = this.f27149e;
        return map.get(str) != null && ((Set) map.get(str)).contains("app_instance_id");
    }

    public final boolean O(String str) throws Throwable {
        h();
        q(str);
        Map map = this.f27149e;
        return map.get(str) != null && ((Set) map.get(str)).contains("enhanced_user_id");
    }

    public final boolean P(String str, u8 u8Var) throws Throwable {
        h();
        q(str);
        com.google.android.gms.internal.measurement.e5 e5VarR = R(str);
        if (e5VarR == null) {
            return false;
        }
        for (com.google.android.gms.internal.measurement.s4 s4Var : e5VarR.F()) {
            if (u8Var == v(s4Var.G())) {
                if (s4Var.H() == 2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final u8 Q(String str, u8 u8Var) {
        h();
        q(str);
        com.google.android.gms.internal.measurement.e5 e5VarR = R(str);
        if (e5VarR == null) {
            return null;
        }
        for (com.google.android.gms.internal.measurement.u4 u4Var : e5VarR.G()) {
            if (u8Var == v(u4Var.G())) {
                return v(u4Var.H());
            }
        }
        return null;
    }

    public final com.google.android.gms.internal.measurement.e5 R(String str) {
        h();
        q(str);
        com.google.android.gms.internal.measurement.k5 k5VarW = w(str);
        if (k5VarW == null || !k5VarW.S()) {
            return null;
        }
        return k5VarW.U();
    }

    public final boolean S(String str) {
        h();
        q(str);
        com.google.android.gms.internal.measurement.e5 e5VarR = R(str);
        return e5VarR == null || !e5VarR.I() || e5VarR.J();
    }

    public final SortedSet T(String str) {
        h();
        q(str);
        TreeSet treeSet = new TreeSet();
        com.google.android.gms.internal.measurement.e5 e5VarR = R(str);
        if (e5VarR != null) {
            Iterator it = e5VarR.H().iterator();
            while (it.hasNext()) {
                treeSet.add(((com.google.android.gms.internal.measurement.b5) it.next()).F());
            }
        }
        return treeSet;
    }

    @Override // ob.l
    public final String f(String str, String str2) throws Throwable {
        h();
        q(str);
        Map map = (Map) this.f27148d.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    @Override // ob.ge
    public final boolean l() {
        return false;
    }

    public final s8 m(String str, u8 u8Var) {
        h();
        q(str);
        com.google.android.gms.internal.measurement.e5 e5VarR = R(str);
        if (e5VarR == null) {
            return s8.UNINITIALIZED;
        }
        for (com.google.android.gms.internal.measurement.s4 s4Var : e5VarR.K()) {
            if (v(s4Var.G()) == u8Var) {
                int iH = s4Var.H() - 1;
                if (iH != 1) {
                    return iH != 2 ? s8.UNINITIALIZED : s8.DENIED;
                }
                return s8.GRANTED;
            }
        }
        return s8.UNINITIALIZED;
    }

    public final boolean n(String str) throws Throwable {
        h();
        q(str);
        com.google.android.gms.internal.measurement.e5 e5VarR = R(str);
        if (e5VarR == null) {
            return false;
        }
        for (com.google.android.gms.internal.measurement.s4 s4Var : e5VarR.F()) {
            if (s4Var.G() == 3 && s4Var.I() == 3) {
                return true;
            }
        }
        return false;
    }

    public final /* synthetic */ com.google.android.gms.internal.measurement.d1 o(String str) throws Throwable {
        j();
        o9.s.f(str);
        r rVarN0 = this.b.F0().N0(str);
        if (rVarN0 == null) {
            return null;
        }
        this.f27641a.a().w().b("Populate EES config from database on cache miss. appId", str);
        s(str, t(str, rVarN0.f27753a));
        return (com.google.android.gms.internal.measurement.d1) this.f27154j.j().get(str);
    }

    public final /* synthetic */ Map p() {
        return this.f27148d;
    }

    public final void q(String str) throws Throwable {
        j();
        h();
        o9.s.f(str);
        Map map = this.f27152h;
        if (map.get(str) == null) {
            r rVarN0 = this.b.F0().N0(str);
            if (rVarN0 != null) {
                com.google.android.gms.internal.measurement.j5 j5Var = (com.google.android.gms.internal.measurement.j5) t(str, rVarN0.f27753a).q();
                r(str, j5Var);
                this.f27148d.put(str, u((com.google.android.gms.internal.measurement.k5) j5Var.v()));
                map.put(str, (com.google.android.gms.internal.measurement.k5) j5Var.v());
                s(str, (com.google.android.gms.internal.measurement.k5) j5Var.v());
                this.f27156l.put(str, j5Var.J());
                this.f27157m.put(str, rVarN0.b);
                this.f27158n.put(str, rVarN0.f27754c);
                return;
            }
            this.f27148d.put(str, null);
            this.f27150f.put(str, null);
            this.f27149e.put(str, null);
            this.f27151g.put(str, null);
            map.put(str, null);
            this.f27156l.put(str, null);
            this.f27157m.put(str, null);
            this.f27158n.put(str, null);
            this.f27153i.put(str, null);
        }
    }

    public final void r(String str, com.google.android.gms.internal.measurement.j5 j5Var) {
        HashSet hashSet = new HashSet();
        w1.a aVar = new w1.a();
        w1.a aVar2 = new w1.a();
        w1.a aVar3 = new w1.a();
        Iterator it = j5Var.H().iterator();
        while (it.hasNext()) {
            hashSet.add(((com.google.android.gms.internal.measurement.g5) it.next()).F());
        }
        for (int i10 = 0; i10 < j5Var.z(); i10++) {
            com.google.android.gms.internal.measurement.h5 h5Var = (com.google.android.gms.internal.measurement.h5) j5Var.B(i10).q();
            if (h5Var.z().isEmpty()) {
                this.f27641a.a().r().a("EventConfig contained null event name");
            } else {
                String strZ = h5Var.z();
                String strB = w8.b(h5Var.z());
                if (!TextUtils.isEmpty(strB)) {
                    h5Var.B(strB);
                    j5Var.C(i10, h5Var);
                }
                if (h5Var.C() && h5Var.D()) {
                    aVar.put(strZ, Boolean.TRUE);
                }
                if (h5Var.F() && h5Var.G()) {
                    aVar2.put(h5Var.z(), Boolean.TRUE);
                }
                if (h5Var.H()) {
                    if (h5Var.J() < 2 || h5Var.J() > 65535) {
                        this.f27641a.a().r().c("Invalid sampling rate. Event name, sample rate", h5Var.z(), Integer.valueOf(h5Var.J()));
                    } else {
                        aVar3.put(h5Var.z(), Integer.valueOf(h5Var.J()));
                    }
                }
            }
        }
        this.f27149e.put(str, hashSet);
        this.f27150f.put(str, aVar);
        this.f27151g.put(str, aVar2);
        this.f27153i.put(str, aVar3);
    }

    public final void s(final String str, com.google.android.gms.internal.measurement.k5 k5Var) {
        if (k5Var.O() == 0) {
            this.f27154j.f(str);
            return;
        }
        l7 l7Var = this.f27641a;
        l7Var.a().w().b("EES programs found", Integer.valueOf(k5Var.O()));
        com.google.android.gms.internal.measurement.c8 c8Var = (com.google.android.gms.internal.measurement.c8) k5Var.N().get(0);
        try {
            com.google.android.gms.internal.measurement.d1 d1Var = new com.google.android.gms.internal.measurement.d1();
            d1Var.a("internal.remoteConfig", new Callable() { // from class: ob.b7
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return new com.google.android.gms.internal.measurement.fc("internal.remoteConfig", new x6(this.f27117a, str));
                }
            });
            d1Var.a("internal.appMetadata", new Callable() { // from class: ob.y6
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    final c7 c7Var = this.f27993a;
                    final String str2 = str;
                    return new gh("internal.appMetadata", new Callable() { // from class: ob.a7
                        @Override // java.util.concurrent.Callable
                        public final /* synthetic */ Object call() {
                            c7 c7Var2 = c7Var;
                            w wVarF0 = c7Var2.b.F0();
                            String str3 = str2;
                            h6 h6VarJ0 = wVarF0.J0(str3);
                            HashMap map = new HashMap();
                            map.put("platform", "android");
                            map.put("package_name", str3);
                            c7Var2.f27641a.w().A();
                            map.put("gmp_version", 133005L);
                            if (h6VarJ0 != null) {
                                String strD0 = h6VarJ0.D0();
                                if (strD0 != null) {
                                    map.put("app_version", strD0);
                                }
                                map.put("app_version_int", Long.valueOf(h6VarJ0.F0()));
                                map.put("dynamite_version", Long.valueOf(h6VarJ0.b()));
                            }
                            return map;
                        }
                    });
                }
            });
            d1Var.a("internal.logger", new Callable() { // from class: ob.z6
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return new fh(this.f28032a.f27155k);
                }
            });
            d1Var.f(c8Var);
            this.f27154j.e(str, d1Var);
            l7Var.a().w().c("EES program loaded for appId, activities", str, Integer.valueOf(c8Var.G().G()));
            Iterator it = c8Var.G().F().iterator();
            while (it.hasNext()) {
                l7Var.a().w().b("EES program activity", ((com.google.android.gms.internal.measurement.z7) it.next()).F());
            }
        } catch (com.google.android.gms.internal.measurement.d2 unused) {
            this.f27641a.a().o().b("Failed to load EES program. appId", str);
        }
    }

    public final com.google.android.gms.internal.measurement.k5 t(String str, byte[] bArr) {
        if (bArr == null) {
            return com.google.android.gms.internal.measurement.k5.Y();
        }
        try {
            com.google.android.gms.internal.measurement.k5 k5Var = (com.google.android.gms.internal.measurement.k5) ((com.google.android.gms.internal.measurement.j5) af.W(com.google.android.gms.internal.measurement.k5.X(), bArr)).v();
            this.f27641a.a().w().c("Parsed config. version, gmp_app_id", k5Var.F() ? Long.valueOf(k5Var.G()) : null, k5Var.H() ? k5Var.I() : null);
            return k5Var;
        } catch (com.google.android.gms.internal.measurement.wb e10) {
            this.f27641a.a().r().c("Unable to merge remote config. appId", b6.x(str), e10);
            return com.google.android.gms.internal.measurement.k5.Y();
        } catch (RuntimeException e11) {
            this.f27641a.a().r().c("Unable to merge remote config. appId", b6.x(str), e11);
            return com.google.android.gms.internal.measurement.k5.Y();
        }
    }

    public final com.google.android.gms.internal.measurement.k5 w(String str) {
        j();
        h();
        o9.s.f(str);
        q(str);
        return (com.google.android.gms.internal.measurement.k5) this.f27152h.get(str);
    }

    public final String x(String str) {
        h();
        q(str);
        return (String) this.f27156l.get(str);
    }

    public final String y(String str) {
        h();
        return (String) this.f27157m.get(str);
    }

    public final String z(String str) {
        h();
        return (String) this.f27158n.get(str);
    }
}
