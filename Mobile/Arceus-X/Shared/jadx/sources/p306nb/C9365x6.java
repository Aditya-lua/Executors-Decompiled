package p306nb;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.appsflyer.sdk_base.referrer.Payload;
import com.google.android.gms.internal.measurement.C1966a5;
import com.google.android.gms.internal.measurement.C1992bc;
import com.google.android.gms.internal.measurement.C1997bh;
import com.google.android.gms.internal.measurement.C2004c5;
import com.google.android.gms.internal.measurement.C2016ch;
import com.google.android.gms.internal.measurement.C2019d1;
import com.google.android.gms.internal.measurement.C2020d2;
import com.google.android.gms.internal.measurement.C2023d5;
import com.google.android.gms.internal.measurement.C2061f5;
import com.google.android.gms.internal.measurement.C2080g5;
import com.google.android.gms.internal.measurement.C2224o4;
import com.google.android.gms.internal.measurement.C2225o5;
import com.google.android.gms.internal.measurement.C2260q4;
import com.google.android.gms.internal.measurement.C2303sb;
import com.google.android.gms.internal.measurement.C2353v7;
import com.google.android.gms.internal.measurement.C2386x4;
import com.google.android.gms.internal.measurement.C2407y7;
import com.google.android.gms.internal.measurement.InterfaceC2091gg;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.Callable;
import p305n9.C8953m;
import p504w1.C12277a;
import p504w1.C12285i;

/* JADX INFO: renamed from: nb.x6 */
/* JADX INFO: loaded from: classes.dex */
public final class C9365x6 extends AbstractC9372xd implements InterfaceC9134j {

    /* JADX INFO: renamed from: d */
    public final Map f33635d;

    /* JADX INFO: renamed from: e */
    public final Map f33636e;

    /* JADX INFO: renamed from: f */
    public final Map f33637f;

    /* JADX INFO: renamed from: g */
    public final Map f33638g;

    /* JADX INFO: renamed from: h */
    public final Map f33639h;

    /* JADX INFO: renamed from: i */
    public final Map f33640i;

    /* JADX INFO: renamed from: j */
    public final C12285i f33641j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC2091gg f33642k;

    /* JADX INFO: renamed from: l */
    public final Map f33643l;

    /* JADX INFO: renamed from: m */
    public final Map f33644m;

    /* JADX INFO: renamed from: n */
    public final Map f33645n;

    public C9365x6(C9197me c9197me) {
        super(c9197me);
        this.f33635d = new C12277a();
        this.f33636e = new C12277a();
        this.f33637f = new C12277a();
        this.f33638g = new C12277a();
        this.f33639h = new C12277a();
        this.f33643l = new C12277a();
        this.f33644m = new C12277a();
        this.f33645n = new C12277a();
        this.f33640i = new C12277a();
        this.f33641j = new C9253q6(this, 20);
        this.f33642k = new C9269r6(this);
    }

    /* JADX INFO: renamed from: u */
    public static final Map m37029u(C2080g5 c2080g5) {
        C12277a c12277a = new C12277a();
        if (c2080g5 != null) {
            for (C2225o5 c2225o5 : c2080g5.m10026K()) {
                c12277a.put(c2225o5.m10482F(), c2225o5.m10483G());
            }
        }
        return c12277a;
    }

    /* JADX INFO: renamed from: v */
    public static final EnumC9239p8 m37030v(int i10) {
        int i11 = i10 - 1;
        if (i11 == 1) {
            return EnumC9239p8.AD_STORAGE;
        }
        if (i11 == 2) {
            return EnumC9239p8.ANALYTICS_STORAGE;
        }
        if (i11 == 3) {
            return EnumC9239p8.AD_USER_DATA;
        }
        if (i11 != 4) {
            return null;
        }
        return EnumC9239p8.AD_PERSONALIZATION;
    }

    /* JADX INFO: renamed from: A */
    public final void m37031A(String str) {
        mo36088h();
        this.f33644m.put(str, null);
    }

    /* JADX INFO: renamed from: B */
    public final void m37032B(String str) {
        mo36088h();
        this.f33639h.remove(str);
    }

    /* JADX INFO: renamed from: C */
    public final boolean m37033C(String str, byte[] bArr, String str2, String str3) throws Throwable {
        m37067j();
        mo36088h();
        C8953m.m36041f(str);
        C2061f5 c2061f5 = (C2061f5) m37058t(str, bArr).m10075q();
        m37056r(str, c2061f5);
        m37057s(str, (C2080g5) c2061f5.m9882t());
        this.f33639h.put(str, (C2080g5) c2061f5.m9882t());
        this.f33643l.put(str, c2061f5.m9984J());
        this.f33644m.put(str, str2);
        this.f33645n.put(str, str3);
        this.f33635d.put(str, m37029u((C2080g5) c2061f5.m9882t()));
        this.f33516b.m36507F0().m36828Y(str, new ArrayList(c2061f5.m9980C()));
        try {
            c2061f5.m9981D();
            bArr = ((C2080g5) c2061f5.m9882t()).m10628d();
        } catch (RuntimeException e10) {
            this.f33067a.mo36321a().m37006r().m36913c("Unable to serialize reduced-size config. Storing full config instead. appId", C9348w5.m36998x(str), e10);
        }
        C9294t c9294tM36507F0 = this.f33516b.m36507F0();
        C8953m.m36041f(str);
        c9294tM36507F0.mo36088h();
        c9294tM36507F0.m37067j();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr);
        contentValues.put("config_last_modified_time", str2);
        contentValues.put("e_tag", str3);
        try {
            if (c9294tM36507F0.m36848u0().update("apps", contentValues, "app_id = ?", new String[]{str}) == 0) {
                c9294tM36507F0.f33067a.mo36321a().m37003o().m36912b("Failed to update remote config (got 0). appId", C9348w5.m36998x(str));
            }
        } catch (SQLiteException e11) {
            c9294tM36507F0.f33067a.mo36321a().m37003o().m36913c("Error storing remote config. appId", C9348w5.m36998x(str), e11);
        }
        c2061f5.m9982E();
        this.f33639h.put(str, (C2080g5) c2061f5.m9882t());
        return true;
    }

    /* JADX INFO: renamed from: D */
    public final boolean m37034D(String str, String str2) throws Throwable {
        Boolean bool;
        mo36088h();
        m37055q(str);
        if (m37038H(str) && C9341ve.m36926N(str2)) {
            return true;
        }
        if (m37039I(str) && C9341ve.m36933r0(str2)) {
            return true;
        }
        Map map = (Map) this.f33637f.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* JADX INFO: renamed from: E */
    public final boolean m37035E(String str, String str2) throws Throwable {
        Boolean bool;
        mo36088h();
        m37055q(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = (Map) this.f33638g.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* JADX INFO: renamed from: F */
    public final Set m37036F(String str) {
        mo36088h();
        m37055q(str);
        return (Set) this.f33636e.get(str);
    }

    /* JADX INFO: renamed from: G */
    public final int m37037G(String str, String str2) throws Throwable {
        Integer num;
        mo36088h();
        m37055q(str);
        Map map = (Map) this.f33640i.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    /* JADX INFO: renamed from: H */
    public final boolean m37038H(String str) {
        return "1".equals(mo36348f(str, "measurement.upload.blacklist_internal"));
    }

    /* JADX INFO: renamed from: I */
    public final boolean m37039I(String str) {
        return "1".equals(mo36348f(str, "measurement.upload.blacklist_public"));
    }

    /* JADX INFO: renamed from: J */
    public final boolean m37040J(String str) throws Throwable {
        mo36088h();
        m37055q(str);
        Map map = this.f33636e;
        if (map.get(str) != null) {
            return ((Set) map.get(str)).contains(Payload.DEVICE_MODEL) || ((Set) map.get(str)).contains("device_info");
        }
        return false;
    }

    /* JADX INFO: renamed from: K */
    public final boolean m37041K(String str) throws Throwable {
        mo36088h();
        m37055q(str);
        Map map = this.f33636e;
        if (map.get(str) != null) {
            return ((Set) map.get(str)).contains("os_version") || ((Set) map.get(str)).contains("device_info");
        }
        return false;
    }

    /* JADX INFO: renamed from: L */
    public final boolean m37042L(String str) throws Throwable {
        mo36088h();
        m37055q(str);
        Map map = this.f33636e;
        return map.get(str) != null && ((Set) map.get(str)).contains("user_id");
    }

    /* JADX INFO: renamed from: M */
    public final boolean m37043M(String str) throws Throwable {
        mo36088h();
        m37055q(str);
        Map map = this.f33636e;
        return map.get(str) != null && ((Set) map.get(str)).contains("google_signals");
    }

    /* JADX INFO: renamed from: N */
    public final boolean m37044N(String str) throws Throwable {
        mo36088h();
        m37055q(str);
        Map map = this.f33636e;
        return map.get(str) != null && ((Set) map.get(str)).contains("app_instance_id");
    }

    /* JADX INFO: renamed from: O */
    public final boolean m37045O(String str) throws Throwable {
        mo36088h();
        m37055q(str);
        Map map = this.f33636e;
        return map.get(str) != null && ((Set) map.get(str)).contains("enhanced_user_id");
    }

    /* JADX INFO: renamed from: P */
    public final boolean m37046P(String str, EnumC9239p8 enumC9239p8) throws Throwable {
        mo36088h();
        m37055q(str);
        C1966a5 c1966a5M37048R = m37048R(str);
        if (c1966a5M37048R == null) {
            return false;
        }
        for (C2224o4 c2224o4 : c1966a5M37048R.m9580F()) {
            if (enumC9239p8 == m37030v(c2224o4.m10478G())) {
                if (c2224o4.m10479H() == 2) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: Q */
    public final EnumC9239p8 m37047Q(String str, EnumC9239p8 enumC9239p8) {
        mo36088h();
        m37055q(str);
        C1966a5 c1966a5M37048R = m37048R(str);
        if (c1966a5M37048R == null) {
            return null;
        }
        for (C2260q4 c2260q4 : c1966a5M37048R.m9581G()) {
            if (enumC9239p8 == m37030v(c2260q4.m10554G())) {
                return m37030v(c2260q4.m10555H());
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: R */
    public final C1966a5 m37048R(String str) {
        mo36088h();
        m37055q(str);
        C2080g5 c2080g5M37059w = m37059w(str);
        if (c2080g5M37059w == null || !c2080g5M37059w.m10034T()) {
            return null;
        }
        return c2080g5M37059w.m10035U();
    }

    /* JADX INFO: renamed from: S */
    public final boolean m37049S(String str) {
        mo36088h();
        m37055q(str);
        C1966a5 c1966a5M37048R = m37048R(str);
        return c1966a5M37048R == null || !c1966a5M37048R.m9583J() || c1966a5M37048R.m9584K();
    }

    /* JADX INFO: renamed from: T */
    public final SortedSet m37050T(String str) {
        mo36088h();
        m37055q(str);
        TreeSet treeSet = new TreeSet();
        C1966a5 c1966a5M37048R = m37048R(str);
        if (c1966a5M37048R != null) {
            Iterator it = c1966a5M37048R.m9582H().iterator();
            while (it.hasNext()) {
                treeSet.add(((C2386x4) it.next()).m10970F());
            }
        }
        return treeSet;
    }

    @Override // p306nb.InterfaceC9134j
    /* JADX INFO: renamed from: f */
    public final String mo36348f(String str, String str2) throws Throwable {
        mo36088h();
        m37055q(str);
        Map map = (Map) this.f33635d.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    @Override // p306nb.AbstractC9372xd
    /* JADX INFO: renamed from: l */
    public final boolean mo36126l() {
        return false;
    }

    /* JADX INFO: renamed from: m */
    public final EnumC9207n8 m37051m(String str, EnumC9239p8 enumC9239p8) {
        mo36088h();
        m37055q(str);
        C1966a5 c1966a5M37048R = m37048R(str);
        if (c1966a5M37048R == null) {
            return EnumC9207n8.UNINITIALIZED;
        }
        for (C2224o4 c2224o4 : c1966a5M37048R.m9585M()) {
            if (m37030v(c2224o4.m10478G()) == enumC9239p8) {
                int iM10479H = c2224o4.m10479H() - 1;
                if (iM10479H != 1) {
                    return iM10479H != 2 ? EnumC9207n8.UNINITIALIZED : EnumC9207n8.DENIED;
                }
                return EnumC9207n8.GRANTED;
            }
        }
        return EnumC9207n8.UNINITIALIZED;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m37052n(String str) throws Throwable {
        mo36088h();
        m37055q(str);
        C1966a5 c1966a5M37048R = m37048R(str);
        if (c1966a5M37048R == null) {
            return false;
        }
        for (C2224o4 c2224o4 : c1966a5M37048R.m9580F()) {
            if (c2224o4.m10478G() == 3 && c2224o4.m10480J() == 3) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ C2019d1 m37053o(String str) throws Throwable {
        m37067j();
        C8953m.m36041f(str);
        C9214o c9214oM36817N0 = this.f33516b.m36507F0().m36817N0(str);
        if (c9214oM36817N0 == null) {
            return null;
        }
        this.f33067a.mo36321a().m37011w().m36912b("Populate EES config from database on cache miss. appId", str);
        m37057s(str, m37058t(str, c9214oM36817N0.f33288a));
        return (C2019d1) this.f33641j.m45618j().get(str);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ Map m37054p() {
        return this.f33635d;
    }

    /* JADX INFO: renamed from: q */
    public final void m37055q(String str) throws Throwable {
        m37067j();
        mo36088h();
        C8953m.m36041f(str);
        Map map = this.f33639h;
        if (map.get(str) == null) {
            C9214o c9214oM36817N0 = this.f33516b.m36507F0().m36817N0(str);
            if (c9214oM36817N0 != null) {
                C2061f5 c2061f5 = (C2061f5) m37058t(str, c9214oM36817N0.f33288a).m10075q();
                m37056r(str, c2061f5);
                this.f33635d.put(str, m37029u((C2080g5) c2061f5.m9882t()));
                map.put(str, (C2080g5) c2061f5.m9882t());
                m37057s(str, (C2080g5) c2061f5.m9882t());
                this.f33643l.put(str, c2061f5.m9984J());
                this.f33644m.put(str, c9214oM36817N0.f33289b);
                this.f33645n.put(str, c9214oM36817N0.f33290c);
                return;
            }
            this.f33635d.put(str, null);
            this.f33637f.put(str, null);
            this.f33636e.put(str, null);
            this.f33638g.put(str, null);
            map.put(str, null);
            this.f33643l.put(str, null);
            this.f33644m.put(str, null);
            this.f33645n.put(str, null);
            this.f33640i.put(str, null);
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m37056r(String str, C2061f5 c2061f5) {
        HashSet hashSet = new HashSet();
        C12277a c12277a = new C12277a();
        C12277a c12277a2 = new C12277a();
        C12277a c12277a3 = new C12277a();
        Iterator it = c2061f5.m9983G().iterator();
        while (it.hasNext()) {
            hashSet.add(((C2004c5) it.next()).m9845F());
        }
        for (int i10 = 0; i10 < c2061f5.m9985x(); i10++) {
            C2023d5 c2023d5 = (C2023d5) c2061f5.m9986z(i10).m10075q();
            if (c2023d5.m9913x().isEmpty()) {
                this.f33067a.mo36321a().m37006r().m36911a("EventConfig contained null event name");
            } else {
                String strM9913x = c2023d5.m9913x();
                String strM36727b = C9271r8.m36727b(c2023d5.m9913x());
                if (!TextUtils.isEmpty(strM36727b)) {
                    c2023d5.m9914z(strM36727b);
                    c2061f5.m9979A(i10, c2023d5);
                }
                if (c2023d5.m9907A() && c2023d5.m9908C()) {
                    c12277a.put(strM9913x, Boolean.TRUE);
                }
                if (c2023d5.m9909D() && c2023d5.m9910E()) {
                    c12277a2.put(c2023d5.m9913x(), Boolean.TRUE);
                }
                if (c2023d5.m9911G()) {
                    if (c2023d5.m9912J() < 2 || c2023d5.m9912J() > 65535) {
                        this.f33067a.mo36321a().m37006r().m36913c("Invalid sampling rate. Event name, sample rate", c2023d5.m9913x(), Integer.valueOf(c2023d5.m9912J()));
                    } else {
                        c12277a3.put(c2023d5.m9913x(), Integer.valueOf(c2023d5.m9912J()));
                    }
                }
            }
        }
        this.f33636e.put(str, hashSet);
        this.f33637f.put(str, c12277a);
        this.f33638g.put(str, c12277a2);
        this.f33640i.put(str, c12277a3);
    }

    /* JADX INFO: renamed from: s */
    public final void m37057s(final String str, C2080g5 c2080g5) {
        if (c2080g5.m10031Q() == 0) {
            this.f33641j.m45614f(str);
            return;
        }
        C9094g7 c9094g7 = this.f33067a;
        c9094g7.mo36321a().m37011w().m36912b("EES programs found", Integer.valueOf(c2080g5.m10031Q()));
        C2407y7 c2407y7 = (C2407y7) c2080g5.m10030P().get(0);
        try {
            C2019d1 c2019d1 = new C2019d1();
            c2019d1.m9900a("internal.remoteConfig", new Callable() { // from class: nb.w6
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return new C1992bc("internal.remoteConfig", new C9285s6(this.f33603a, str));
                }
            });
            c2019d1.m9900a("internal.appMetadata", new Callable() { // from class: nb.t6
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    final C9365x6 c9365x6 = this.f33494a;
                    final String str2 = str;
                    return new C2016ch("internal.appMetadata", new Callable() { // from class: nb.v6
                        @Override // java.util.concurrent.Callable
                        public final /* synthetic */ Object call() {
                            C9365x6 c9365x7 = c9365x6;
                            C9294t c9294tM36507F0 = c9365x7.f33516b.m36507F0();
                            String str3 = str2;
                            C9026c6 c9026c6M36809J0 = c9294tM36507F0.m36809J0(str3);
                            HashMap map = new HashMap();
                            map.put("platform", "android");
                            map.put("package_name", str3);
                            c9365x7.f33067a.m36338w().m36399A();
                            map.put("gmp_version", 133005L);
                            if (c9026c6M36809J0 != null) {
                                String strM36167D0 = c9026c6M36809J0.m36167D0();
                                if (strM36167D0 != null) {
                                    map.put("app_version", strM36167D0);
                                }
                                map.put("app_version_int", Long.valueOf(c9026c6M36809J0.m36171F0()));
                                map.put("dynamite_version", Long.valueOf(c9026c6M36809J0.m36200b()));
                            }
                            return map;
                        }
                    });
                }
            });
            c2019d1.m9900a("internal.logger", new Callable() { // from class: nb.u6
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return new C1997bh(this.f33531a.f33642k);
                }
            });
            c2019d1.m9905f(c2407y7);
            this.f33641j.m45613e(str, c2019d1);
            c9094g7.mo36321a().m37011w().m36913c("EES program loaded for appId, activities", str, Integer.valueOf(c2407y7.m11017G().m10766G()));
            Iterator it = c2407y7.m11017G().m10765F().iterator();
            while (it.hasNext()) {
                c9094g7.mo36321a().m37011w().m36912b("EES program activity", ((C2353v7) it.next()).m10851F());
            }
        } catch (C2020d2 unused) {
            this.f33067a.mo36321a().m37003o().m36912b("Failed to load EES program. appId", str);
        }
    }

    /* JADX INFO: renamed from: t */
    public final C2080g5 m37058t(String str, byte[] bArr) {
        if (bArr == null) {
            return C2080g5.m10020Y();
        }
        try {
            C2080g5 c2080g5 = (C2080g5) ((C2061f5) C9277re.m36737W(C2080g5.m10019X(), bArr)).m9882t();
            this.f33067a.mo36321a().m37011w().m36913c("Parsed config. version, gmp_app_id", c2080g5.m10022F() ? Long.valueOf(c2080g5.m10023G()) : null, c2080g5.m10024H() ? c2080g5.m10025J() : null);
            return c2080g5;
        } catch (C2303sb e10) {
            this.f33067a.mo36321a().m37006r().m36913c("Unable to merge remote config. appId", C9348w5.m36998x(str), e10);
            return C2080g5.m10020Y();
        } catch (RuntimeException e11) {
            this.f33067a.mo36321a().m37006r().m36913c("Unable to merge remote config. appId", C9348w5.m36998x(str), e11);
            return C2080g5.m10020Y();
        }
    }

    /* JADX INFO: renamed from: w */
    public final C2080g5 m37059w(String str) {
        m37067j();
        mo36088h();
        C8953m.m36041f(str);
        m37055q(str);
        return (C2080g5) this.f33639h.get(str);
    }

    /* JADX INFO: renamed from: x */
    public final String m37060x(String str) {
        mo36088h();
        m37055q(str);
        return (String) this.f33643l.get(str);
    }

    /* JADX INFO: renamed from: y */
    public final String m37061y(String str) {
        mo36088h();
        return (String) this.f33644m.get(str);
    }

    /* JADX INFO: renamed from: z */
    public final String m37062z(String str) {
        mo36088h();
        return (String) this.f33645n.get(str);
    }
}
