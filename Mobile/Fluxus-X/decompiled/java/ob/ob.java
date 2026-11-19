package ob;

import android.os.Bundle;
import androidx.annotation.NonNull;
import com.appsflyer.sdk_base.referrer.Payload;
import com.github.luben.zstd.BuildConfig;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class ob extends g5 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile gb f27647c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile gb f27648d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public gb f27649e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map f27650f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public com.google.android.gms.internal.measurement.j2 f27651g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile boolean f27652h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile gb f27653i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public gb f27654j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f27655k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f27656l;

    public ob(l7 l7Var) {
        super(l7Var);
        this.f27656l = new Object();
        this.f27650f = new ConcurrentHashMap();
    }

    public final /* synthetic */ void A(Bundle bundle, gb gbVar, gb gbVar2, long j10) {
        bundle.remove("screen_name");
        bundle.remove("screen_class");
        G(gbVar, gbVar2, j10, true, this.f27641a.C().t(null, "screen_view", bundle, null, false));
    }

    public final /* synthetic */ void B(gb gbVar, gb gbVar2, long j10, boolean z10, Bundle bundle) {
        G(gbVar, gbVar2, j10, z10, null);
    }

    public final /* synthetic */ void C(gb gbVar, boolean z10, long j10) {
        o(gbVar, false, j10);
    }

    public final /* synthetic */ gb D() {
        return this.f27654j;
    }

    public final /* synthetic */ void E(gb gbVar) {
        this.f27654j = null;
    }

    public final void F(String str, gb gbVar, boolean z10) {
        gb gbVar2;
        gb gbVar3 = this.f27647c == null ? this.f27648d : this.f27647c;
        if (gbVar.b == null) {
            gbVar2 = new gb(gbVar.f27354a, str != null ? r(str, "Activity") : null, gbVar.f27355c, gbVar.f27357e, gbVar.f27358f);
        } else {
            gbVar2 = gbVar;
        }
        this.f27648d = this.f27647c;
        this.f27647c = gbVar2;
        l7 l7Var = this.f27641a;
        l7Var.b().t(new ib(this, gbVar2, gbVar3, l7Var.e().b(), z10));
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b3  */
    public final void G(gb gbVar, gb gbVar2, long j10, boolean z10, Bundle bundle) {
        boolean z11;
        long j11;
        h();
        boolean z12 = false;
        if (gbVar2 != null) {
            if (gbVar2.f27355c == gbVar.f27355c && Objects.equals(gbVar2.b, gbVar.b) && Objects.equals(gbVar2.f27354a, gbVar.f27354a)) {
                z11 = false;
            } else {
                z11 = true;
            }
        } else {
            z11 = true;
        }
        if (z10 && this.f27649e != null) {
            z12 = true;
        }
        if (z11) {
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            ff.k0(gbVar, bundle2, true);
            if (gbVar2 != null) {
                String str = gbVar2.f27354a;
                if (str != null) {
                    bundle2.putString("_pn", str);
                }
                String str2 = gbVar2.b;
                if (str2 != null) {
                    bundle2.putString("_pc", str2);
                }
                bundle2.putLong("_pi", gbVar2.f27355c);
            }
            if (z12) {
                od odVar = this.f27641a.z().f27747f;
                long j12 = j10 - odVar.b;
                odVar.b = j10;
                if (j12 > 0) {
                    this.f27641a.C().Z(bundle2, j12);
                }
            }
            l7 l7Var = this.f27641a;
            if (!l7Var.w().N()) {
                bundle2.putLong("_mst", 1L);
            }
            boolean z13 = gbVar.f27357e;
            String str3 = true != z13 ? "auto" : Payload.TYPE_APP;
            long jA = l7Var.e().a();
            if (z13) {
                long j13 = gbVar.f27358f;
                if (j13 == 0) {
                    j11 = jA;
                } else {
                    j11 = j13;
                }
            } else {
                j11 = jA;
            }
            this.f27641a.B().u(str3, "_vs", j11, bundle2);
        }
        if (z12) {
            o(this.f27649e, true, j10);
        }
        this.f27649e = gbVar;
        if (gbVar.f27357e) {
            this.f27654j = gbVar;
        }
        this.f27641a.J().u(gbVar);
    }

    @Override // ob.g5
    public final boolean m() {
        return false;
    }

    public final void o(gb gbVar, boolean z10, long j10) {
        l7 l7Var = this.f27641a;
        l7Var.M().k(l7Var.e().b());
        if (!l7Var.z().f27747f.d(gbVar != null && gbVar.f27356d, z10, j10) || gbVar == null) {
            return;
        }
        gbVar.f27356d = false;
    }

    public final gb p(@NonNull com.google.android.gms.internal.measurement.j2 j2Var) {
        o9.s.l(j2Var);
        Integer numValueOf = Integer.valueOf(j2Var.f6556f);
        Map map = this.f27650f;
        gb gbVar = (gb) map.get(numValueOf);
        if (gbVar == null) {
            gb gbVar2 = new gb(null, r(j2Var.f6557g, "Activity"), this.f27641a.C().p0());
            map.put(numValueOf, gbVar2);
            gbVar = gbVar2;
        }
        return this.f27653i != null ? this.f27653i : gbVar;
    }

    public final gb q(boolean z10) {
        j();
        h();
        if (!z10) {
            return this.f27649e;
        }
        gb gbVar = this.f27649e;
        return gbVar != null ? gbVar : this.f27654j;
    }

    public final String r(String str, String str2) {
        if (str == null) {
            return "Activity";
        }
        String[] strArrSplit = str.split("\\.");
        int length = strArrSplit.length;
        String str3 = length > 0 ? strArrSplit[length - 1] : BuildConfig.FLAVOR;
        l7 l7Var = this.f27641a;
        return str3.length() > l7Var.w().x(null, false) ? str3.substring(0, l7Var.w().x(null, false)) : str3;
    }

    public final void s(Bundle bundle, long j10) {
        synchronized (this.f27656l) {
            try {
                if (!this.f27655k) {
                    this.f27641a.a().t().a("Cannot log screen view event when the app is in the background.");
                    return;
                }
                String string = bundle.getString("screen_name");
                if (string != null && (string.length() <= 0 || string.length() > this.f27641a.w().x(null, false))) {
                    this.f27641a.a().t().b("Invalid screen name length for screen view. Length", Integer.valueOf(string.length()));
                    return;
                }
                String string2 = bundle.getString("screen_class");
                if (string2 != null && (string2.length() <= 0 || string2.length() > this.f27641a.w().x(null, false))) {
                    this.f27641a.a().t().b("Invalid screen class length for screen view. Length", Integer.valueOf(string2.length()));
                    return;
                }
                if (string2 == null) {
                    com.google.android.gms.internal.measurement.j2 j2Var = this.f27651g;
                    string2 = j2Var != null ? r(j2Var.f6557g, "Activity") : "Activity";
                }
                gb gbVar = this.f27647c;
                if (this.f27652h && gbVar != null) {
                    this.f27652h = false;
                    boolean zEquals = Objects.equals(gbVar.b, string2);
                    boolean zEquals2 = Objects.equals(gbVar.f27354a, string);
                    if (zEquals && zEquals2) {
                        this.f27641a.a().t().a("Ignoring call to log screen view event with duplicate parameters.");
                        return;
                    }
                }
                l7 l7Var = this.f27641a;
                l7Var.a().w().c("Logging screen view with name, class", string == null ? "null" : string, string2 == null ? "null" : string2);
                gb gbVar2 = this.f27647c == null ? this.f27648d : this.f27647c;
                gb gbVar3 = new gb(string, string2, l7Var.C().p0(), true, j10);
                this.f27647c = gbVar3;
                this.f27648d = gbVar2;
                this.f27653i = gbVar3;
                l7Var.b().t(new hb(this, bundle, gbVar3, gbVar2, l7Var.e().b()));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Deprecated
    public final void t(@NonNull com.google.android.gms.internal.measurement.j2 j2Var, String str, String str2) {
        l7 l7Var = this.f27641a;
        if (!l7Var.w().N()) {
            l7Var.a().t().a("setCurrentScreen cannot be called while screen reporting is disabled.");
            return;
        }
        gb gbVar = this.f27647c;
        if (gbVar == null) {
            l7Var.a().t().a("setCurrentScreen cannot be called while no activity active");
            return;
        }
        Map map = this.f27650f;
        Integer numValueOf = Integer.valueOf(j2Var.f6556f);
        if (map.get(numValueOf) == null) {
            l7Var.a().t().a("setCurrentScreen must be called with an activity in the activity lifecycle");
            return;
        }
        if (str2 == null) {
            str2 = r(j2Var.f6557g, "Activity");
        }
        String str3 = gbVar.b;
        String str4 = gbVar.f27354a;
        boolean zEquals = Objects.equals(str3, str2);
        boolean zEquals2 = Objects.equals(str4, str);
        if (zEquals && zEquals2) {
            l7Var.a().t().a("setCurrentScreen cannot be called with the same class and name");
            return;
        }
        if (str != null && (str.length() <= 0 || str.length() > l7Var.w().x(null, false))) {
            l7Var.a().t().b("Invalid screen name length in setCurrentScreen. Length", Integer.valueOf(str.length()));
            return;
        }
        if (str2 != null && (str2.length() <= 0 || str2.length() > l7Var.w().x(null, false))) {
            l7Var.a().t().b("Invalid class name length in setCurrentScreen. Length", Integer.valueOf(str2.length()));
            return;
        }
        l7Var.a().w().c("Setting current screen to name, class", str == null ? "null" : str, str2);
        gb gbVar2 = new gb(str, str2, l7Var.C().p0());
        map.put(numValueOf, gbVar2);
        F(j2Var.f6557g, gbVar2, true);
    }

    public final gb u() {
        return this.f27647c;
    }

    public final void v(com.google.android.gms.internal.measurement.j2 j2Var, Bundle bundle) {
        Bundle bundle2;
        if (!this.f27641a.w().N() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.f27650f.put(Integer.valueOf(j2Var.f6556f), new gb(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
    }

    public final void w(com.google.android.gms.internal.measurement.j2 j2Var) {
        Object obj = this.f27656l;
        synchronized (obj) {
            this.f27655k = true;
            if (!Objects.equals(j2Var, this.f27651g)) {
                synchronized (obj) {
                    this.f27651g = j2Var;
                    this.f27652h = false;
                    l7 l7Var = this.f27641a;
                    if (l7Var.w().N()) {
                        this.f27653i = null;
                        l7Var.b().t(new nb(this));
                    }
                }
            }
        }
        l7 l7Var2 = this.f27641a;
        if (!l7Var2.w().N()) {
            this.f27647c = this.f27653i;
            l7Var2.b().t(new jb(this));
            return;
        }
        F(j2Var.f6557g, p(j2Var), false);
        d2 d2VarM = this.f27641a.M();
        l7 l7Var3 = d2VarM.f27641a;
        l7Var3.b().t(new c1(d2VarM, l7Var3.e().b()));
    }

    public final void x(com.google.android.gms.internal.measurement.j2 j2Var) {
        synchronized (this.f27656l) {
            this.f27655k = false;
            this.f27652h = true;
        }
        l7 l7Var = this.f27641a;
        long jB = l7Var.e().b();
        if (!l7Var.w().N()) {
            this.f27647c = null;
            l7Var.b().t(new kb(this, jB));
        } else {
            gb gbVarP = p(j2Var);
            this.f27648d = this.f27647c;
            this.f27647c = null;
            l7Var.b().t(new lb(this, gbVarP, jB));
        }
    }

    public final void y(com.google.android.gms.internal.measurement.j2 j2Var, Bundle bundle) {
        gb gbVar;
        if (!this.f27641a.w().N() || bundle == null || (gbVar = (gb) this.f27650f.get(Integer.valueOf(j2Var.f6556f))) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", gbVar.f27355c);
        bundle2.putString("name", gbVar.f27354a);
        bundle2.putString("referrer_name", gbVar.b);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    public final void z(com.google.android.gms.internal.measurement.j2 j2Var) {
        synchronized (this.f27656l) {
            try {
                if (Objects.equals(this.f27651g, j2Var)) {
                    this.f27651g = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (this.f27641a.w().N()) {
            this.f27650f.remove(Integer.valueOf(j2Var.f6556f));
        }
    }
}
