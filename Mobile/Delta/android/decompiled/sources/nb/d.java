package nb;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class d extends c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final com.google.android.gms.internal.measurement.h4 f25442g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e f25443h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, String str, int i10, com.google.android.gms.internal.measurement.h4 h4Var) {
        super(str, i10);
        Objects.requireNonNull(eVar);
        this.f25443h = eVar;
        this.f25442g = h4Var;
    }

    @Override // nb.c
    public final int a() {
        return this.f25442g.G();
    }

    @Override // nb.c
    public final boolean b() {
        return true;
    }

    @Override // nb.c
    public final boolean c() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean k(Long l10, Long l11, com.google.android.gms.internal.measurement.r7 r7Var, boolean z10) {
        com.google.android.gms.internal.measurement.ye.a();
        g7 g7Var = this.f25443h.f25625a;
        boolean zH = g7Var.w().H(this.f25377a, z4.E0);
        com.google.android.gms.internal.measurement.h4 h4Var = this.f25442g;
        boolean zK = h4Var.K();
        boolean zL = h4Var.L();
        boolean zO = h4Var.O();
        Object[] objArr = zK || zL || zO;
        Boolean boolE = null;
        boolE = null;
        boolE = null;
        boolE = null;
        boolE = null;
        if (z10 && objArr != true) {
            g7Var.a().w().c("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(this.b), h4Var.F() ? Integer.valueOf(h4Var.G()) : null);
            return true;
        }
        com.google.android.gms.internal.measurement.b4 b4VarJ = h4Var.J();
        boolean zL2 = b4VarJ.L();
        if (r7Var.L()) {
            if (b4VarJ.H()) {
                boolE = c.e(c.g(r7Var.N(), b4VarJ.J()), zL2);
            } else {
                g7Var.a().r().b("No number filter for long property. property", g7Var.D().c(r7Var.H()));
            }
        } else if (r7Var.Q()) {
            if (b4VarJ.H()) {
                boolE = c.e(c.h(r7Var.R(), b4VarJ.J()), zL2);
            } else {
                g7Var.a().r().b("No number filter for double property. property", g7Var.D().c(r7Var.H()));
            }
        } else if (!r7Var.J()) {
            g7Var.a().r().b("User property has no value, property", g7Var.D().c(r7Var.H()));
        } else if (b4VarJ.F()) {
            boolE = c.e(c.f(r7Var.K(), b4VarJ.G(), g7Var.a()), zL2);
        } else if (!b4VarJ.H()) {
            g7Var.a().r().b("No string or number filter defined. property", g7Var.D().c(r7Var.H()));
        } else if (re.O(r7Var.K())) {
            boolE = c.e(c.i(r7Var.K(), b4VarJ.J()), zL2);
        } else {
            g7Var.a().r().c("Invalid user property value for Numeric number filter. property, value", g7Var.D().c(r7Var.H()), r7Var.K());
        }
        g7Var.a().w().b("Property filter result", boolE == null ? "null" : boolE);
        if (boolE == null) {
            return false;
        }
        this.f25378c = Boolean.TRUE;
        if (zO && !boolE.booleanValue()) {
            return true;
        }
        if (!z10 || h4Var.K()) {
            this.f25379d = boolE;
        }
        if (boolE.booleanValue() && objArr != false && r7Var.F()) {
            long jG = r7Var.G();
            if (l10 != null) {
                jG = l10.longValue();
            }
            if (zH && h4Var.K() && !h4Var.L() && l11 != null) {
                jG = l11.longValue();
            }
            if (h4Var.L()) {
                this.f25381f = Long.valueOf(jG);
            } else {
                this.f25380e = Long.valueOf(jG);
            }
        }
        return true;
    }
}
