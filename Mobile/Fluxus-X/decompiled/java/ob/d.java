package ob;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class d extends c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final com.google.android.gms.internal.measurement.l4 f27171g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e f27172h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, String str, int i10, com.google.android.gms.internal.measurement.l4 l4Var) {
        super(str, i10);
        Objects.requireNonNull(eVar);
        this.f27172h = eVar;
        this.f27171g = l4Var;
    }

    @Override // ob.c
    public final int a() {
        return this.f27171g.G();
    }

    @Override // ob.c
    public final boolean b() {
        return true;
    }

    @Override // ob.c
    public final boolean c() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean k(Long l10, Long l11, com.google.android.gms.internal.measurement.v7 v7Var, boolean z10) {
        com.google.android.gms.internal.measurement.cf.a();
        l7 l7Var = this.f27172h.f27641a;
        boolean zH = l7Var.w().H(this.f27133a, e5.E0);
        com.google.android.gms.internal.measurement.l4 l4Var = this.f27171g;
        boolean zJ = l4Var.J();
        boolean zK = l4Var.K();
        boolean zM = l4Var.M();
        Object[] objArr = zJ || zK || zM;
        Boolean boolE = null;
        boolE = null;
        boolE = null;
        boolE = null;
        boolE = null;
        if (z10 && objArr != true) {
            l7Var.a().w().c("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(this.b), l4Var.F() ? Integer.valueOf(l4Var.G()) : null);
            return true;
        }
        com.google.android.gms.internal.measurement.f4 f4VarI = l4Var.I();
        boolean zK2 = f4VarI.K();
        if (v7Var.K()) {
            if (f4VarI.H()) {
                boolE = c.e(c.g(v7Var.L(), f4VarI.I()), zK2);
            } else {
                l7Var.a().r().b("No number filter for long property. property", l7Var.D().c(v7Var.H()));
            }
        } else if (v7Var.O()) {
            if (f4VarI.H()) {
                boolE = c.e(c.h(v7Var.P(), f4VarI.I()), zK2);
            } else {
                l7Var.a().r().b("No number filter for double property. property", l7Var.D().c(v7Var.H()));
            }
        } else if (!v7Var.I()) {
            l7Var.a().r().b("User property has no value, property", l7Var.D().c(v7Var.H()));
        } else if (f4VarI.F()) {
            boolE = c.e(c.f(v7Var.J(), f4VarI.G(), l7Var.a()), zK2);
        } else if (!f4VarI.H()) {
            l7Var.a().r().b("No string or number filter defined. property", l7Var.D().c(v7Var.H()));
        } else if (af.O(v7Var.J())) {
            boolE = c.e(c.i(v7Var.J(), f4VarI.I()), zK2);
        } else {
            l7Var.a().r().c("Invalid user property value for Numeric number filter. property, value", l7Var.D().c(v7Var.H()), v7Var.J());
        }
        l7Var.a().w().b("Property filter result", boolE == null ? "null" : boolE);
        if (boolE == null) {
            return false;
        }
        this.f27134c = Boolean.TRUE;
        if (zM && !boolE.booleanValue()) {
            return true;
        }
        if (!z10 || l4Var.J()) {
            this.f27135d = boolE;
        }
        if (boolE.booleanValue() && objArr != false && v7Var.F()) {
            long jG = v7Var.G();
            if (l10 != null) {
                jG = l10.longValue();
            }
            if (zH && l4Var.J() && !l4Var.K() && l11 != null) {
                jG = l11.longValue();
            }
            if (l4Var.K()) {
                this.f27137f = Long.valueOf(jG);
            } else {
                this.f27136e = Long.valueOf(jG);
            }
        }
        return true;
    }
}
