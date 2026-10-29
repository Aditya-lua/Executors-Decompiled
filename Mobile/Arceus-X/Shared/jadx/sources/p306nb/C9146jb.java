package p306nb;

import android.os.Bundle;
import androidx.annotation.NonNull;
import com.appsflyer.sdk_base.referrer.Payload;
import com.google.android.gms.internal.measurement.zzdf;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import p305n9.C8953m;

/* JADX INFO: renamed from: nb.jb */
/* JADX INFO: loaded from: classes.dex */
public final class C9146jb extends AbstractC9008b5 {

    /* JADX INFO: renamed from: c */
    public volatile C9014bb f33074c;

    /* JADX INFO: renamed from: d */
    public volatile C9014bb f33075d;

    /* JADX INFO: renamed from: e */
    public C9014bb f33076e;

    /* JADX INFO: renamed from: f */
    public final Map f33077f;

    /* JADX INFO: renamed from: g */
    public zzdf f33078g;

    /* JADX INFO: renamed from: h */
    public volatile boolean f33079h;

    /* JADX INFO: renamed from: i */
    public volatile C9014bb f33080i;

    /* JADX INFO: renamed from: j */
    public C9014bb f33081j;

    /* JADX INFO: renamed from: k */
    public boolean f33082k;

    /* JADX INFO: renamed from: l */
    public final Object f33083l;

    public C9146jb(C9094g7 c9094g7) {
        super(c9094g7);
        this.f33083l = new Object();
        this.f33077f = new ConcurrentHashMap();
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m36371A(Bundle bundle, C9014bb c9014bb, C9014bb c9014bb2, long j10) {
        bundle.remove("screen_name");
        bundle.remove("screen_class");
        m36377G(c9014bb, c9014bb2, j10, true, this.f33067a.m36308C().m36976t(null, "screen_view", bundle, null, false));
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m36372B(C9014bb c9014bb, C9014bb c9014bb2, long j10, boolean z10, Bundle bundle) {
        m36377G(c9014bb, c9014bb2, j10, z10, null);
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m36373C(C9014bb c9014bb, boolean z10, long j10) {
        m36378o(c9014bb, false, j10);
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ C9014bb m36374D() {
        return this.f33081j;
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m36375E(C9014bb c9014bb) {
        this.f33081j = null;
    }

    /* JADX INFO: renamed from: F */
    public final void m36376F(String str, C9014bb c9014bb, boolean z10) {
        C9014bb c9014bb2;
        C9014bb c9014bb3 = this.f33074c == null ? this.f33075d : this.f33074c;
        if (c9014bb.f32725b == null) {
            c9014bb2 = new C9014bb(c9014bb.f32724a, str != null ? m36381r(str, "Activity") : null, c9014bb.f32726c, c9014bb.f32728e, c9014bb.f32729f);
        } else {
            c9014bb2 = c9014bb;
        }
        this.f33075d = this.f33074c;
        this.f33074c = c9014bb2;
        C9094g7 c9094g7 = this.f33067a;
        c9094g7.mo36322b().m36263t(new RunnableC9048db(this, c9014bb2, c9014bb3, c9094g7.mo36325e().mo44176b(), z10));
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b3  */
    /* JADX INFO: renamed from: G */
    public final void m36377G(C9014bb c9014bb, C9014bb c9014bb2, long j10, boolean z10, Bundle bundle) {
        boolean z11;
        long j11;
        mo36088h();
        boolean z12 = false;
        if (c9014bb2 != null) {
            if (c9014bb2.f32726c == c9014bb.f32726c && Objects.equals(c9014bb2.f32725b, c9014bb.f32725b) && Objects.equals(c9014bb2.f32724a, c9014bb.f32724a)) {
                z11 = false;
            } else {
                z11 = true;
            }
        } else {
            z11 = true;
        }
        if (z10 && this.f33076e != null) {
            z12 = true;
        }
        if (z11) {
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            C9341ve.m36931k0(c9014bb, bundle2, true);
            if (c9014bb2 != null) {
                String str = c9014bb2.f32724a;
                if (str != null) {
                    bundle2.putString("_pn", str);
                }
                String str2 = c9014bb2.f32725b;
                if (str2 != null) {
                    bundle2.putString("_pc", str2);
                }
                bundle2.putLong("_pi", c9014bb2.f32726c);
            }
            if (z12) {
                C9148jd c9148jd = this.f33067a.m36341z().f33191f;
                long j12 = j10 - c9148jd.f33086b;
                c9148jd.f33086b = j10;
                if (j12 > 0) {
                    this.f33067a.m36308C().m36956Z(bundle2, j12);
                }
            }
            C9094g7 c9094g7 = this.f33067a;
            if (!c9094g7.m36338w().m36412N()) {
                bundle2.putLong("_mst", 1L);
            }
            boolean z13 = c9014bb.f32728e;
            String str3 = true != z13 ? "auto" : Payload.TYPE_APP;
            long jMo44175a = c9094g7.mo36325e().mo44175a();
            if (z13) {
                long j13 = c9014bb.f32729f;
                if (j13 == 0) {
                    j11 = jMo44175a;
                } else {
                    j11 = j13;
                }
            } else {
                j11 = jMo44175a;
            }
            this.f33067a.m36307B().m36714u(str3, "_vs", j11, bundle2);
        }
        if (z12) {
            m36378o(this.f33076e, true, j10);
        }
        this.f33076e = c9014bb;
        if (c9014bb.f32728e) {
            this.f33081j = c9014bb;
        }
        this.f33067a.m36315J().m36903u(c9014bb);
    }

    @Override // p306nb.AbstractC9008b5
    /* JADX INFO: renamed from: m */
    public final boolean mo36124m() {
        return false;
    }

    /* JADX INFO: renamed from: o */
    public final void m36378o(C9014bb c9014bb, boolean z10, long j10) {
        C9094g7 c9094g7 = this.f33067a;
        c9094g7.m36318M().m37071k(c9094g7.mo36325e().mo44176b());
        if (!c9094g7.m36341z().f33191f.m36393d(c9014bb != null && c9014bb.f32727d, z10, j10) || c9014bb == null) {
            return;
        }
        c9014bb.f32727d = false;
    }

    /* JADX INFO: renamed from: p */
    public final C9014bb m36379p(@NonNull zzdf zzdfVar) {
        C8953m.m36047l(zzdfVar);
        Integer numValueOf = Integer.valueOf(zzdfVar.f8892f);
        Map map = this.f33077f;
        C9014bb c9014bb = (C9014bb) map.get(numValueOf);
        if (c9014bb == null) {
            C9014bb c9014bb2 = new C9014bb(null, m36381r(zzdfVar.f8893g, "Activity"), this.f33067a.m36308C().m36970p0());
            map.put(numValueOf, c9014bb2);
            c9014bb = c9014bb2;
        }
        return this.f33080i != null ? this.f33080i : c9014bb;
    }

    /* JADX INFO: renamed from: q */
    public final C9014bb m36380q(boolean z10) {
        m36121j();
        mo36088h();
        if (!z10) {
            return this.f33076e;
        }
        C9014bb c9014bb = this.f33076e;
        return c9014bb != null ? c9014bb : this.f33081j;
    }

    /* JADX INFO: renamed from: r */
    public final String m36381r(String str, String str2) {
        if (str == null) {
            return "Activity";
        }
        String[] strArrSplit = str.split("\\.");
        int length = strArrSplit.length;
        String str3 = length > 0 ? strArrSplit[length - 1] : "";
        C9094g7 c9094g7 = this.f33067a;
        return str3.length() > c9094g7.m36338w().m36427x(null, false) ? str3.substring(0, c9094g7.m36338w().m36427x(null, false)) : str3;
    }

    /* JADX INFO: renamed from: s */
    public final void m36382s(Bundle bundle, long j10) {
        synchronized (this.f33083l) {
            try {
                if (!this.f33082k) {
                    this.f33067a.mo36321a().m37008t().m36911a("Cannot log screen view event when the app is in the background.");
                    return;
                }
                String string = bundle.getString("screen_name");
                if (string != null && (string.length() <= 0 || string.length() > this.f33067a.m36338w().m36427x(null, false))) {
                    this.f33067a.mo36321a().m37008t().m36912b("Invalid screen name length for screen view. Length", Integer.valueOf(string.length()));
                    return;
                }
                String string2 = bundle.getString("screen_class");
                if (string2 != null && (string2.length() <= 0 || string2.length() > this.f33067a.m36338w().m36427x(null, false))) {
                    this.f33067a.mo36321a().m37008t().m36912b("Invalid screen class length for screen view. Length", Integer.valueOf(string2.length()));
                    return;
                }
                if (string2 == null) {
                    zzdf zzdfVar = this.f33078g;
                    string2 = zzdfVar != null ? m36381r(zzdfVar.f8893g, "Activity") : "Activity";
                }
                C9014bb c9014bb = this.f33074c;
                if (this.f33079h && c9014bb != null) {
                    this.f33079h = false;
                    boolean zEquals = Objects.equals(c9014bb.f32725b, string2);
                    boolean zEquals2 = Objects.equals(c9014bb.f32724a, string);
                    if (zEquals && zEquals2) {
                        this.f33067a.mo36321a().m37008t().m36911a("Ignoring call to log screen view event with duplicate parameters.");
                        return;
                    }
                }
                C9094g7 c9094g7 = this.f33067a;
                c9094g7.mo36321a().m37011w().m36913c("Logging screen view with name, class", string == null ? "null" : string, string2 == null ? "null" : string2);
                C9014bb c9014bb2 = this.f33074c == null ? this.f33075d : this.f33074c;
                C9014bb c9014bb3 = new C9014bb(string, string2, c9094g7.m36308C().m36970p0(), true, j10);
                this.f33074c = c9014bb3;
                this.f33075d = c9014bb2;
                this.f33080i = c9014bb3;
                c9094g7.mo36322b().m36263t(new RunnableC9031cb(this, bundle, c9014bb3, c9014bb2, c9094g7.mo36325e().mo44176b()));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: t */
    public final void m36383t(@NonNull zzdf zzdfVar, String str, String str2) {
        C9094g7 c9094g7 = this.f33067a;
        if (!c9094g7.m36338w().m36412N()) {
            c9094g7.mo36321a().m37008t().m36911a("setCurrentScreen cannot be called while screen reporting is disabled.");
            return;
        }
        C9014bb c9014bb = this.f33074c;
        if (c9014bb == null) {
            c9094g7.mo36321a().m37008t().m36911a("setCurrentScreen cannot be called while no activity active");
            return;
        }
        Map map = this.f33077f;
        Integer numValueOf = Integer.valueOf(zzdfVar.f8892f);
        if (map.get(numValueOf) == null) {
            c9094g7.mo36321a().m37008t().m36911a("setCurrentScreen must be called with an activity in the activity lifecycle");
            return;
        }
        if (str2 == null) {
            str2 = m36381r(zzdfVar.f8893g, "Activity");
        }
        String str3 = c9014bb.f32725b;
        String str4 = c9014bb.f32724a;
        boolean zEquals = Objects.equals(str3, str2);
        boolean zEquals2 = Objects.equals(str4, str);
        if (zEquals && zEquals2) {
            c9094g7.mo36321a().m37008t().m36911a("setCurrentScreen cannot be called with the same class and name");
            return;
        }
        if (str != null && (str.length() <= 0 || str.length() > c9094g7.m36338w().m36427x(null, false))) {
            c9094g7.mo36321a().m37008t().m36912b("Invalid screen name length in setCurrentScreen. Length", Integer.valueOf(str.length()));
            return;
        }
        if (str2 != null && (str2.length() <= 0 || str2.length() > c9094g7.m36338w().m36427x(null, false))) {
            c9094g7.mo36321a().m37008t().m36912b("Invalid class name length in setCurrentScreen. Length", Integer.valueOf(str2.length()));
            return;
        }
        c9094g7.mo36321a().m37011w().m36913c("Setting current screen to name, class", str == null ? "null" : str, str2);
        C9014bb c9014bb2 = new C9014bb(str, str2, c9094g7.m36308C().m36970p0());
        map.put(numValueOf, c9014bb2);
        m36376F(zzdfVar.f8893g, c9014bb2, true);
    }

    /* JADX INFO: renamed from: u */
    public final C9014bb m36384u() {
        return this.f33074c;
    }

    /* JADX INFO: renamed from: v */
    public final void m36385v(zzdf zzdfVar, Bundle bundle) {
        Bundle bundle2;
        if (!this.f33067a.m36338w().m36412N() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.f33077f.put(Integer.valueOf(zzdfVar.f8892f), new C9014bb(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
    }

    /* JADX INFO: renamed from: w */
    public final void m36386w(zzdf zzdfVar) {
        Object obj = this.f33083l;
        synchronized (obj) {
            this.f33082k = true;
            if (!Objects.equals(zzdfVar, this.f33078g)) {
                synchronized (obj) {
                    this.f33078g = zzdfVar;
                    this.f33079h = false;
                    C9094g7 c9094g7 = this.f33067a;
                    if (c9094g7.m36338w().m36412N()) {
                        this.f33080i = null;
                        c9094g7.mo36322b().m36263t(new RunnableC9130ib(this));
                    }
                }
            }
        }
        C9094g7 c9094g8 = this.f33067a;
        if (!c9094g8.m36338w().m36412N()) {
            this.f33074c = this.f33080i;
            c9094g8.mo36322b().m36263t(new RunnableC9065eb(this));
            return;
        }
        m36376F(zzdfVar.f8893g, m36379p(zzdfVar), false);
        C9376y1 c9376y1M36318M = this.f33067a.m36318M();
        C9094g7 c9094g9 = c9376y1M36318M.f33067a;
        c9094g9.mo36322b().m36263t(new RunnableC9359x0(c9376y1M36318M, c9094g9.mo36325e().mo44176b()));
    }

    /* JADX INFO: renamed from: x */
    public final void m36387x(zzdf zzdfVar) {
        synchronized (this.f33083l) {
            this.f33082k = false;
            this.f33079h = true;
        }
        C9094g7 c9094g7 = this.f33067a;
        long jMo44176b = c9094g7.mo36325e().mo44176b();
        if (!c9094g7.m36338w().m36412N()) {
            this.f33074c = null;
            c9094g7.mo36322b().m36263t(new RunnableC9082fb(this, jMo44176b));
        } else {
            C9014bb c9014bbM36379p = m36379p(zzdfVar);
            this.f33075d = this.f33074c;
            this.f33074c = null;
            c9094g7.mo36322b().m36263t(new RunnableC9098gb(this, c9014bbM36379p, jMo44176b));
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m36388y(zzdf zzdfVar, Bundle bundle) {
        C9014bb c9014bb;
        if (!this.f33067a.m36338w().m36412N() || bundle == null || (c9014bb = (C9014bb) this.f33077f.get(Integer.valueOf(zzdfVar.f8892f))) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", c9014bb.f32726c);
        bundle2.putString("name", c9014bb.f32724a);
        bundle2.putString("referrer_name", c9014bb.f32725b);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    /* JADX INFO: renamed from: z */
    public final void m36389z(zzdf zzdfVar) {
        synchronized (this.f33083l) {
            try {
                if (Objects.equals(this.f33078g, zzdfVar)) {
                    this.f33078g = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (this.f33067a.m36338w().m36412N()) {
            this.f33077f.remove(Integer.valueOf(zzdfVar.f8892f));
        }
    }
}
