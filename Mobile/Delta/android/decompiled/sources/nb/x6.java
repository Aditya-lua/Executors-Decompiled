package nb;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.appsflyer.sdk_base.referrer.Payload;
import com.google.android.gms.internal.measurement.bh;
import com.google.android.gms.internal.measurement.ch;
import com.google.android.gms.internal.measurement.gg;
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
public final class x6 extends xd implements j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f26091d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f26092e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map f26093f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map f26094g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Map f26095h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Map f26096i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final w1.i f26097j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final gg f26098k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Map f26099l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Map f26100m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Map f26101n;

    public x6(me meVar) {
        super(meVar);
        this.f26091d = new w1.a();
        this.f26092e = new w1.a();
        this.f26093f = new w1.a();
        this.f26094g = new w1.a();
        this.f26095h = new w1.a();
        this.f26099l = new w1.a();
        this.f26100m = new w1.a();
        this.f26101n = new w1.a();
        this.f26096i = new w1.a();
        this.f26097j = new q6(this, 20);
        this.f26098k = new r6(this);
    }

    public static final Map u(com.google.android.gms.internal.measurement.g5 g5Var) {
        w1.a aVar = new w1.a();
        if (g5Var != null) {
            for (com.google.android.gms.internal.measurement.o5 o5Var : g5Var.K()) {
                aVar.put(o5Var.F(), o5Var.G());
            }
        }
        return aVar;
    }

    public static final p8 v(int i10) {
        int i11 = i10 - 1;
        if (i11 == 1) {
            return p8.AD_STORAGE;
        }
        if (i11 == 2) {
            return p8.ANALYTICS_STORAGE;
        }
        if (i11 == 3) {
            return p8.AD_USER_DATA;
        }
        if (i11 != 4) {
            return null;
        }
        return p8.AD_PERSONALIZATION;
    }

    public final void A(String str) {
        h();
        this.f26100m.put(str, null);
    }

    public final void B(String str) {
        h();
        this.f26095h.remove(str);
    }

    public final boolean C(String str, byte[] bArr, String str2, String str3) throws Throwable {
        j();
        h();
        n9.m.f(str);
        com.google.android.gms.internal.measurement.f5 f5Var = (com.google.android.gms.internal.measurement.f5) t(str, bArr).r();
        r(str, f5Var);
        s(str, (com.google.android.gms.internal.measurement.g5) f5Var.t());
        this.f26095h.put(str, (com.google.android.gms.internal.measurement.g5) f5Var.t());
        this.f26099l.put(str, f5Var.J());
        this.f26100m.put(str, str2);
        this.f26101n.put(str, str3);
        this.f26091d.put(str, u((com.google.android.gms.internal.measurement.g5) f5Var.t()));
        this.b.F0().Y(str, new ArrayList(f5Var.C()));
        try {
            f5Var.D();
            bArr = ((com.google.android.gms.internal.measurement.g5) f5Var.t()).d();
        } catch (RuntimeException e10) {
            this.f25625a.a().r().c("Unable to serialize reduced-size config. Storing full config instead. appId", w5.x(str), e10);
        }
        t tVarF0 = this.b.F0();
        n9.m.f(str);
        tVarF0.h();
        tVarF0.j();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr);
        contentValues.put("config_last_modified_time", str2);
        contentValues.put("e_tag", str3);
        try {
            if (tVarF0.u0().update("apps", contentValues, "app_id = ?", new String[]{str}) == 0) {
                tVarF0.f25625a.a().o().b("Failed to update remote config (got 0). appId", w5.x(str));
            }
        } catch (SQLiteException e11) {
            tVarF0.f25625a.a().o().c("Error storing remote config. appId", w5.x(str), e11);
        }
        f5Var.E();
        this.f26095h.put(str, (com.google.android.gms.internal.measurement.g5) f5Var.t());
        return true;
    }

    public final boolean D(String str, String str2) throws Throwable {
        Boolean bool;
        h();
        q(str);
        if (H(str) && ve.N(str2)) {
            return true;
        }
        if (I(str) && ve.r0(str2)) {
            return true;
        }
        Map map = (Map) this.f26093f.get(str);
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
        Map map = (Map) this.f26094g.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final Set F(String str) {
        h();
        q(str);
        return (Set) this.f26092e.get(str);
    }

    public final int G(String str, String str2) throws Throwable {
        Integer num;
        h();
        q(str);
        Map map = (Map) this.f26096i.get(str);
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
        Map map = this.f26092e;
        if (map.get(str) != null) {
            return ((Set) map.get(str)).contains(Payload.DEVICE_MODEL) || ((Set) map.get(str)).contains("device_info");
        }
        return false;
    }

    public final boolean K(String str) throws Throwable {
        h();
        q(str);
        Map map = this.f26092e;
        if (map.get(str) != null) {
            return ((Set) map.get(str)).contains("os_version") || ((Set) map.get(str)).contains("device_info");
        }
        return false;
    }

    public final boolean L(String str) throws Throwable {
        h();
        q(str);
        Map map = this.f26092e;
        return map.get(str) != null && ((Set) map.get(str)).contains("user_id");
    }

    public final boolean M(String str) throws Throwable {
        h();
        q(str);
        Map map = this.f26092e;
        return map.get(str) != null && ((Set) map.get(str)).contains("google_signals");
    }

    public final boolean N(String str) throws Throwable {
        h();
        q(str);
        Map map = this.f26092e;
        return map.get(str) != null && ((Set) map.get(str)).contains("app_instance_id");
    }

    public final boolean O(String str) throws Throwable {
        h();
        q(str);
        Map map = this.f26092e;
        return map.get(str) != null && ((Set) map.get(str)).contains("enhanced_user_id");
    }

    public final boolean P(String str, p8 p8Var) throws Throwable {
        h();
        q(str);
        com.google.android.gms.internal.measurement.a5 a5VarR = R(str);
        if (a5VarR == null) {
            return false;
        }
        for (com.google.android.gms.internal.measurement.o4 o4Var : a5VarR.F()) {
            if (p8Var == v(o4Var.G())) {
                if (o4Var.H() == 2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final p8 Q(String str, p8 p8Var) {
        h();
        q(str);
        com.google.android.gms.internal.measurement.a5 a5VarR = R(str);
        if (a5VarR == null) {
            return null;
        }
        for (com.google.android.gms.internal.measurement.q4 q4Var : a5VarR.G()) {
            if (p8Var == v(q4Var.G())) {
                return v(q4Var.H());
            }
        }
        return null;
    }

    public final com.google.android.gms.internal.measurement.a5 R(String str) {
        h();
        q(str);
        com.google.android.gms.internal.measurement.g5 g5VarW = w(str);
        if (g5VarW == null || !g5VarW.T()) {
            return null;
        }
        return g5VarW.U();
    }

    public final boolean S(String str) {
        h();
        q(str);
        com.google.android.gms.internal.measurement.a5 a5VarR = R(str);
        return a5VarR == null || !a5VarR.J() || a5VarR.K();
    }

    public final SortedSet T(String str) {
        h();
        q(str);
        TreeSet treeSet = new TreeSet();
        com.google.android.gms.internal.measurement.a5 a5VarR = R(str);
        if (a5VarR != null) {
            Iterator it = a5VarR.H().iterator();
            while (it.hasNext()) {
                treeSet.add(((com.google.android.gms.internal.measurement.x4) it.next()).F());
            }
        }
        return treeSet;
    }

    @Override // nb.j
    public final String f(String str, String str2) throws Throwable {
        h();
        q(str);
        Map map = (Map) this.f26091d.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    @Override // nb.xd
    public final boolean l() {
        return false;
    }

    public final n8 m(String str, p8 p8Var) {
        h();
        q(str);
        com.google.android.gms.internal.measurement.a5 a5VarR = R(str);
        if (a5VarR == null) {
            return n8.UNINITIALIZED;
        }
        for (com.google.android.gms.internal.measurement.o4 o4Var : a5VarR.L()) {
            if (v(o4Var.G()) == p8Var) {
                int iH = o4Var.H() - 1;
                if (iH != 1) {
                    return iH != 2 ? n8.UNINITIALIZED : n8.DENIED;
                }
                return n8.GRANTED;
            }
        }
        return n8.UNINITIALIZED;
    }

    public final boolean n(String str) throws Throwable {
        h();
        q(str);
        com.google.android.gms.internal.measurement.a5 a5VarR = R(str);
        if (a5VarR == null) {
            return false;
        }
        for (com.google.android.gms.internal.measurement.o4 o4Var : a5VarR.F()) {
            if (o4Var.G() == 3 && o4Var.J() == 3) {
                return true;
            }
        }
        return false;
    }

    public final /* synthetic */ com.google.android.gms.internal.measurement.d1 o(String str) throws Throwable {
        j();
        n9.m.f(str);
        o oVarN0 = this.b.F0().N0(str);
        if (oVarN0 == null) {
            return null;
        }
        this.f25625a.a().w().b("Populate EES config from database on cache miss. appId", str);
        s(str, t(str, oVarN0.f25807a));
        return (com.google.android.gms.internal.measurement.d1) this.f26097j.j().get(str);
    }

    public final /* synthetic */ Map p() {
        return this.f26091d;
    }

    public final void q(String str) throws Throwable {
        j();
        h();
        n9.m.f(str);
        Map map = this.f26095h;
        if (map.get(str) == null) {
            o oVarN0 = this.b.F0().N0(str);
            if (oVarN0 != null) {
                com.google.android.gms.internal.measurement.f5 f5Var = (com.google.android.gms.internal.measurement.f5) t(str, oVarN0.f25807a).r();
                r(str, f5Var);
                this.f26091d.put(str, u((com.google.android.gms.internal.measurement.g5) f5Var.t()));
                map.put(str, (com.google.android.gms.internal.measurement.g5) f5Var.t());
                s(str, (com.google.android.gms.internal.measurement.g5) f5Var.t());
                this.f26099l.put(str, f5Var.J());
                this.f26100m.put(str, oVarN0.b);
                this.f26101n.put(str, oVarN0.f25808c);
                return;
            }
            this.f26091d.put(str, null);
            this.f26093f.put(str, null);
            this.f26092e.put(str, null);
            this.f26094g.put(str, null);
            map.put(str, null);
            this.f26099l.put(str, null);
            this.f26100m.put(str, null);
            this.f26101n.put(str, null);
            this.f26096i.put(str, null);
        }
    }

    public final void r(String str, com.google.android.gms.internal.measurement.f5 f5Var) {
        HashSet hashSet = new HashSet();
        w1.a aVar = new w1.a();
        w1.a aVar2 = new w1.a();
        w1.a aVar3 = new w1.a();
        Iterator it = f5Var.G().iterator();
        while (it.hasNext()) {
            hashSet.add(((com.google.android.gms.internal.measurement.c5) it.next()).F());
        }
        for (int i10 = 0; i10 < f5Var.x(); i10++) {
            com.google.android.gms.internal.measurement.d5 d5Var = (com.google.android.gms.internal.measurement.d5) f5Var.z(i10).r();
            if (d5Var.x().isEmpty()) {
                this.f25625a.a().r().a("EventConfig contained null event name");
            } else {
                String strX = d5Var.x();
                String strB = r8.b(d5Var.x());
                if (!TextUtils.isEmpty(strB)) {
                    d5Var.z(strB);
                    f5Var.A(i10, d5Var);
                }
                if (d5Var.A() && d5Var.C()) {
                    aVar.put(strX, Boolean.TRUE);
                }
                if (d5Var.D() && d5Var.E()) {
                    aVar2.put(d5Var.x(), Boolean.TRUE);
                }
                if (d5Var.G()) {
                    if (d5Var.J() < 2 || d5Var.J() > 65535) {
                        this.f25625a.a().r().c("Invalid sampling rate. Event name, sample rate", d5Var.x(), Integer.valueOf(d5Var.J()));
                    } else {
                        aVar3.put(d5Var.x(), Integer.valueOf(d5Var.J()));
                    }
                }
            }
        }
        this.f26092e.put(str, hashSet);
        this.f26093f.put(str, aVar);
        this.f26094g.put(str, aVar2);
        this.f26096i.put(str, aVar3);
    }

    public final void s(final String str, com.google.android.gms.internal.measurement.g5 g5Var) {
        if (g5Var.Q() == 0) {
            this.f26097j.f(str);
            return;
        }
        g7 g7Var = this.f25625a;
        g7Var.a().w().b("EES programs found", Integer.valueOf(g5Var.Q()));
        com.google.android.gms.internal.measurement.y7 y7Var = (com.google.android.gms.internal.measurement.y7) g5Var.P().get(0);
        try {
            com.google.android.gms.internal.measurement.d1 d1Var = new com.google.android.gms.internal.measurement.d1();
            d1Var.a("internal.remoteConfig", new Callable() { // from class: nb.w6
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return new com.google.android.gms.internal.measurement.bc("internal.remoteConfig", new s6(this.f26068a, str));
                }
            });
            d1Var.a("internal.appMetadata", new Callable() { // from class: nb.t6
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    final x6 x6Var = this.f25978a;
                    final String str2 = str;
                    return new ch("internal.appMetadata", new Callable() { // from class: nb.v6
                        @Override // java.util.concurrent.Callable
                        public final /* synthetic */ Object call() {
                            x6 x6Var2 = x6Var;
                            t tVarF0 = x6Var2.b.F0();
                            String str3 = str2;
                            c6 c6VarJ0 = tVarF0.J0(str3);
                            HashMap map = new HashMap();
                            map.put("platform", "android");
                            map.put("package_name", str3);
                            x6Var2.f25625a.w().A();
                            map.put("gmp_version", 133005L);
                            if (c6VarJ0 != null) {
                                String strD0 = c6VarJ0.D0();
                                if (strD0 != null) {
                                    map.put("app_version", strD0);
                                }
                                map.put("app_version_int", Long.valueOf(c6VarJ0.F0()));
                                map.put("dynamite_version", Long.valueOf(c6VarJ0.b()));
                            }
                            return map;
                        }
                    });
                }
            });
            d1Var.a("internal.logger", new Callable() { // from class: nb.u6
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return new bh(this.f26007a.f26098k);
                }
            });
            d1Var.f(y7Var);
            this.f26097j.e(str, d1Var);
            g7Var.a().w().c("EES program loaded for appId, activities", str, Integer.valueOf(y7Var.G().G()));
            Iterator it = y7Var.G().F().iterator();
            while (it.hasNext()) {
                g7Var.a().w().b("EES program activity", ((com.google.android.gms.internal.measurement.v7) it.next()).F());
            }
        } catch (com.google.android.gms.internal.measurement.d2 unused) {
            this.f25625a.a().o().b("Failed to load EES program. appId", str);
        }
    }

    public final com.google.android.gms.internal.measurement.g5 t(String str, byte[] bArr) {
        if (bArr == null) {
            return com.google.android.gms.internal.measurement.g5.Y();
        }
        try {
            com.google.android.gms.internal.measurement.g5 g5Var = (com.google.android.gms.internal.measurement.g5) ((com.google.android.gms.internal.measurement.f5) re.W(com.google.android.gms.internal.measurement.g5.X(), bArr)).t();
            this.f25625a.a().w().c("Parsed config. version, gmp_app_id", g5Var.F() ? Long.valueOf(g5Var.G()) : null, g5Var.H() ? g5Var.J() : null);
            return g5Var;
        } catch (com.google.android.gms.internal.measurement.sb e10) {
            this.f25625a.a().r().c("Unable to merge remote config. appId", w5.x(str), e10);
            return com.google.android.gms.internal.measurement.g5.Y();
        } catch (RuntimeException e11) {
            this.f25625a.a().r().c("Unable to merge remote config. appId", w5.x(str), e11);
            return com.google.android.gms.internal.measurement.g5.Y();
        }
    }

    public final com.google.android.gms.internal.measurement.g5 w(String str) {
        j();
        h();
        n9.m.f(str);
        q(str);
        return (com.google.android.gms.internal.measurement.g5) this.f26095h.get(str);
    }

    public final String x(String str) {
        h();
        q(str);
        return (String) this.f26099l.get(str);
    }

    public final String y(String str) {
        h();
        return (String) this.f26100m.get(str);
    }

    public final String z(String str) {
        h();
        return (String) this.f26101n.get(str);
    }
}
