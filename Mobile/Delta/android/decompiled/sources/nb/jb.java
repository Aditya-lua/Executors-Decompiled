package nb;

import android.os.Bundle;
import androidx.annotation.NonNull;
import com.appsflyer.sdk_base.referrer.Payload;
import com.google.android.gms.internal.measurement.zzdf;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class jb extends b5 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile bb f26452c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile bb f26453d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public bb f26454e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map f26455f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public zzdf f26456g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile boolean f26457h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile bb f26458i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public bb f26459j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f26460k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f26461l;

    public jb(g7 g7Var) {
        super(g7Var);
        this.f26461l = new Object();
        this.f26455f = new ConcurrentHashMap();
    }

    public final /* synthetic */ void A(Bundle bundle, bb bbVar, bb bbVar2, long j10) {
        bundle.remove("screen_name");
        bundle.remove("screen_class");
        G(bbVar, bbVar2, j10, true, this.f26446a.C().t(null, "screen_view", bundle, null, false));
    }

    public final /* synthetic */ void B(bb bbVar, bb bbVar2, long j10, boolean z10, Bundle bundle) {
        G(bbVar, bbVar2, j10, z10, null);
    }

    public final /* synthetic */ void C(bb bbVar, boolean z10, long j10) {
        o(bbVar, false, j10);
    }

    public final /* synthetic */ bb D() {
        return this.f26459j;
    }

    public final /* synthetic */ void E(bb bbVar) {
        this.f26459j = null;
    }

    public final void F(String str, bb bbVar, boolean z10) {
        bb bbVar2;
        bb bbVar3 = this.f26452c == null ? this.f26453d : this.f26452c;
        if (bbVar.b == null) {
            bbVar2 = new bb(bbVar.f26186a, str != null ? r(str, "Activity") : null, bbVar.f26187c, bbVar.f26189e, bbVar.f26190f);
        } else {
            bbVar2 = bbVar;
        }
        this.f26453d = this.f26452c;
        this.f26452c = bbVar2;
        g7 g7Var = this.f26446a;
        g7Var.b().t(new db(this, bbVar2, bbVar3, g7Var.e().b(), z10));
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b3  */
    public final void G(bb bbVar, bb bbVar2, long j10, boolean z10, Bundle bundle) {
        boolean z11;
        long j11;
        h();
        boolean z12 = false;
        if (bbVar2 != null) {
            if (bbVar2.f26187c == bbVar.f26187c && Objects.equals(bbVar2.b, bbVar.b) && Objects.equals(bbVar2.f26186a, bbVar.f26186a)) {
                z11 = false;
            } else {
                z11 = true;
            }
        } else {
            z11 = true;
        }
        if (z10 && this.f26454e != null) {
            z12 = true;
        }
        if (z11) {
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            ve.k0(bbVar, bundle2, true);
            if (bbVar2 != null) {
                String str = bbVar2.f26186a;
                if (str != null) {
                    bundle2.putString("_pn", str);
                }
                String str2 = bbVar2.b;
                if (str2 != null) {
                    bundle2.putString("_pc", str2);
                }
                bundle2.putLong("_pi", bbVar2.f26187c);
            }
            if (z12) {
                jd jdVar = this.f26446a.z().f26556f;
                long j12 = j10 - jdVar.b;
                jdVar.b = j10;
                if (j12 > 0) {
                    this.f26446a.C().Z(bundle2, j12);
                }
            }
            g7 g7Var = this.f26446a;
            if (!g7Var.w().N()) {
                bundle2.putLong("_mst", 1L);
            }
            boolean z13 = bbVar.f26189e;
            String str3 = true != z13 ? "auto" : Payload.TYPE_APP;
            long jA = g7Var.e().a();
            if (z13) {
                long j13 = bbVar.f26190f;
                if (j13 == 0) {
                    j11 = jA;
                } else {
                    j11 = j13;
                }
            } else {
                j11 = jA;
            }
            this.f26446a.B().u(str3, "_vs", j11, bundle2);
        }
        if (z12) {
            o(this.f26454e, true, j10);
        }
        this.f26454e = bbVar;
        if (bbVar.f26189e) {
            this.f26459j = bbVar;
        }
        this.f26446a.J().u(bbVar);
    }

    @Override // nb.b5
    public final boolean m() {
        return false;
    }

    public final void o(bb bbVar, boolean z10, long j10) {
        g7 g7Var = this.f26446a;
        g7Var.M().k(g7Var.e().b());
        if (!g7Var.z().f26556f.d(bbVar != null && bbVar.f26188d, z10, j10) || bbVar == null) {
            return;
        }
        bbVar.f26188d = false;
    }

    public final bb p(@NonNull zzdf zzdfVar) {
        n9.m.l(zzdfVar);
        Integer numValueOf = Integer.valueOf(zzdfVar.f7050f);
        Map map = this.f26455f;
        bb bbVar = (bb) map.get(numValueOf);
        if (bbVar == null) {
            bb bbVar2 = new bb(null, r(zzdfVar.f7051g, "Activity"), this.f26446a.C().p0());
            map.put(numValueOf, bbVar2);
            bbVar = bbVar2;
        }
        return this.f26458i != null ? this.f26458i : bbVar;
    }

    public final bb q(boolean z10) {
        j();
        h();
        if (!z10) {
            return this.f26454e;
        }
        bb bbVar = this.f26454e;
        return bbVar != null ? bbVar : this.f26459j;
    }

    public final String r(String str, String str2) {
        if (str == null) {
            return "Activity";
        }
        String[] strArrSplit = str.split("\\.");
        int length = strArrSplit.length;
        String str3 = length > 0 ? strArrSplit[length - 1] : "";
        g7 g7Var = this.f26446a;
        return str3.length() > g7Var.w().x(null, false) ? str3.substring(0, g7Var.w().x(null, false)) : str3;
    }

    public final void s(Bundle bundle, long j10) {
        synchronized (this.f26461l) {
            try {
                if (!this.f26460k) {
                    this.f26446a.a().t().a("Cannot log screen view event when the app is in the background.");
                    return;
                }
                String string = bundle.getString("screen_name");
                if (string != null && (string.length() <= 0 || string.length() > this.f26446a.w().x(null, false))) {
                    this.f26446a.a().t().b("Invalid screen name length for screen view. Length", Integer.valueOf(string.length()));
                    return;
                }
                String string2 = bundle.getString("screen_class");
                if (string2 != null && (string2.length() <= 0 || string2.length() > this.f26446a.w().x(null, false))) {
                    this.f26446a.a().t().b("Invalid screen class length for screen view. Length", Integer.valueOf(string2.length()));
                    return;
                }
                if (string2 == null) {
                    zzdf zzdfVar = this.f26456g;
                    string2 = zzdfVar != null ? r(zzdfVar.f7051g, "Activity") : "Activity";
                }
                bb bbVar = this.f26452c;
                if (this.f26457h && bbVar != null) {
                    this.f26457h = false;
                    boolean zEquals = Objects.equals(bbVar.b, string2);
                    boolean zEquals2 = Objects.equals(bbVar.f26186a, string);
                    if (zEquals && zEquals2) {
                        this.f26446a.a().t().a("Ignoring call to log screen view event with duplicate parameters.");
                        return;
                    }
                }
                g7 g7Var = this.f26446a;
                g7Var.a().w().c("Logging screen view with name, class", string == null ? "null" : string, string2 == null ? "null" : string2);
                bb bbVar2 = this.f26452c == null ? this.f26453d : this.f26452c;
                bb bbVar3 = new bb(string, string2, g7Var.C().p0(), true, j10);
                this.f26452c = bbVar3;
                this.f26453d = bbVar2;
                this.f26458i = bbVar3;
                g7Var.b().t(new cb(this, bundle, bbVar3, bbVar2, g7Var.e().b()));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Deprecated
    public final void t(@NonNull zzdf zzdfVar, String str, String str2) {
        g7 g7Var = this.f26446a;
        if (!g7Var.w().N()) {
            g7Var.a().t().a("setCurrentScreen cannot be called while screen reporting is disabled.");
            return;
        }
        bb bbVar = this.f26452c;
        if (bbVar == null) {
            g7Var.a().t().a("setCurrentScreen cannot be called while no activity active");
            return;
        }
        Map map = this.f26455f;
        Integer numValueOf = Integer.valueOf(zzdfVar.f7050f);
        if (map.get(numValueOf) == null) {
            g7Var.a().t().a("setCurrentScreen must be called with an activity in the activity lifecycle");
            return;
        }
        if (str2 == null) {
            str2 = r(zzdfVar.f7051g, "Activity");
        }
        String str3 = bbVar.b;
        String str4 = bbVar.f26186a;
        boolean zEquals = Objects.equals(str3, str2);
        boolean zEquals2 = Objects.equals(str4, str);
        if (zEquals && zEquals2) {
            g7Var.a().t().a("setCurrentScreen cannot be called with the same class and name");
            return;
        }
        if (str != null && (str.length() <= 0 || str.length() > g7Var.w().x(null, false))) {
            g7Var.a().t().b("Invalid screen name length in setCurrentScreen. Length", Integer.valueOf(str.length()));
            return;
        }
        if (str2 != null && (str2.length() <= 0 || str2.length() > g7Var.w().x(null, false))) {
            g7Var.a().t().b("Invalid class name length in setCurrentScreen. Length", Integer.valueOf(str2.length()));
            return;
        }
        g7Var.a().w().c("Setting current screen to name, class", str == null ? "null" : str, str2);
        bb bbVar2 = new bb(str, str2, g7Var.C().p0());
        map.put(numValueOf, bbVar2);
        F(zzdfVar.f7051g, bbVar2, true);
    }

    public final bb u() {
        return this.f26452c;
    }

    public final void v(zzdf zzdfVar, Bundle bundle) {
        Bundle bundle2;
        if (!this.f26446a.w().N() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.f26455f.put(Integer.valueOf(zzdfVar.f7050f), new bb(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
    }

    public final void w(zzdf zzdfVar) {
        Object obj = this.f26461l;
        synchronized (obj) {
            this.f26460k = true;
            if (!Objects.equals(zzdfVar, this.f26456g)) {
                synchronized (obj) {
                    this.f26456g = zzdfVar;
                    this.f26457h = false;
                    g7 g7Var = this.f26446a;
                    if (g7Var.w().N()) {
                        this.f26458i = null;
                        g7Var.b().t(new ib(this));
                    }
                }
            }
        }
        g7 g7Var2 = this.f26446a;
        if (!g7Var2.w().N()) {
            this.f26452c = this.f26458i;
            g7Var2.b().t(new eb(this));
            return;
        }
        F(zzdfVar.f7051g, p(zzdfVar), false);
        y1 y1VarM = this.f26446a.M();
        g7 g7Var3 = y1VarM.f26446a;
        g7Var3.b().t(new x0(y1VarM, g7Var3.e().b()));
    }

    public final void x(zzdf zzdfVar) {
        synchronized (this.f26461l) {
            this.f26460k = false;
            this.f26457h = true;
        }
        g7 g7Var = this.f26446a;
        long jB = g7Var.e().b();
        if (!g7Var.w().N()) {
            this.f26452c = null;
            g7Var.b().t(new fb(this, jB));
        } else {
            bb bbVarP = p(zzdfVar);
            this.f26453d = this.f26452c;
            this.f26452c = null;
            g7Var.b().t(new gb(this, bbVarP, jB));
        }
    }

    public final void y(zzdf zzdfVar, Bundle bundle) {
        bb bbVar;
        if (!this.f26446a.w().N() || bundle == null || (bbVar = (bb) this.f26455f.get(Integer.valueOf(zzdfVar.f7050f))) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", bbVar.f26187c);
        bundle2.putString("name", bbVar.f26186a);
        bundle2.putString("referrer_name", bbVar.b);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    public final void z(zzdf zzdfVar) {
        synchronized (this.f26461l) {
            try {
                if (Objects.equals(this.f26456g, zzdfVar)) {
                    this.f26456g = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (this.f26446a.w().N()) {
            this.f26455f.remove(Integer.valueOf(zzdfVar.f7050f));
        }
    }
}
