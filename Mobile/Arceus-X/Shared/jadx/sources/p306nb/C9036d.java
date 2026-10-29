package p306nb;

import com.google.android.gms.internal.measurement.C1984b4;
import com.google.android.gms.internal.measurement.C2098h4;
import com.google.android.gms.internal.measurement.C2281r7;
import com.google.android.gms.internal.measurement.C2414ye;
import java.util.Objects;

/* JADX INFO: renamed from: nb.d */
/* JADX INFO: loaded from: classes.dex */
public final class C9036d extends AbstractC9019c {

    /* JADX INFO: renamed from: g */
    public final C2098h4 f32832g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C9053e f32833h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9036d(C9053e c9053e, String str, int i10, C2098h4 c2098h4) {
        super(str, i10);
        Objects.requireNonNull(c9053e);
        this.f32833h = c9053e;
        this.f32832g = c2098h4;
    }

    @Override // p306nb.AbstractC9019c
    /* JADX INFO: renamed from: a */
    public final int mo36113a() {
        return this.f32832g.m10162G();
    }

    @Override // p306nb.AbstractC9019c
    /* JADX INFO: renamed from: b */
    public final boolean mo36114b() {
        return true;
    }

    @Override // p306nb.AbstractC9019c
    /* JADX INFO: renamed from: c */
    public final boolean mo36115c() {
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v2, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r3v3, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r3v9, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k */
    public final boolean m36276k(Long l10, Long l11, C2281r7 c2281r7, boolean z10) {
        C2414ye.m11027a();
        C9094g7 c9094g7 = this.f32833h.f33067a;
        boolean zM36406H = c9094g7.m36338w().m36406H(this.f32739a, C9395z4.f33714E0);
        C2098h4 c2098h4 = this.f32832g;
        boolean zM10165K = c2098h4.m10165K();
        boolean zM10166M = c2098h4.m10166M();
        boolean zM10168O = c2098h4.m10168O();
        Object[] objArr = zM10165K || zM10166M || zM10168O;
        Boolean boolM36153e = null;
        boolM36153e = null;
        boolM36153e = null;
        boolM36153e = null;
        boolM36153e = null;
        if (z10 && objArr != true) {
            c9094g7.mo36321a().m37011w().m36913c("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(this.f32740b), c2098h4.m10161F() ? Integer.valueOf(c2098h4.m10162G()) : null);
            return true;
        }
        C1984b4 c1984b4M10164J = c2098h4.m10164J();
        boolean zM9782M = c1984b4M10164J.m9782M();
        if (c2281r7.m10612M()) {
            if (c1984b4M10164J.m9779H()) {
                boolM36153e = AbstractC9019c.m36153e(AbstractC9019c.m36155g(c2281r7.m10613N(), c1984b4M10164J.m9780J()), zM9782M);
            } else {
                c9094g7.mo36321a().m37006r().m36912b("No number filter for long property. property", c9094g7.m36309D().m36622c(c2281r7.m10609H()));
            }
        } else if (c2281r7.m10616Q()) {
            if (c1984b4M10164J.m9779H()) {
                boolM36153e = AbstractC9019c.m36153e(AbstractC9019c.m36156h(c2281r7.m10617R(), c1984b4M10164J.m9780J()), zM9782M);
            } else {
                c9094g7.mo36321a().m37006r().m36912b("No number filter for double property. property", c9094g7.m36309D().m36622c(c2281r7.m10609H()));
            }
        } else if (!c2281r7.m10610J()) {
            c9094g7.mo36321a().m37006r().m36912b("User property has no value, property", c9094g7.m36309D().m36622c(c2281r7.m10609H()));
        } else if (c1984b4M10164J.m9777F()) {
            boolM36153e = AbstractC9019c.m36153e(AbstractC9019c.m36154f(c2281r7.m10611K(), c1984b4M10164J.m9778G(), c9094g7.mo36321a()), zM9782M);
        } else if (!c1984b4M10164J.m9779H()) {
            c9094g7.mo36321a().m37006r().m36912b("No string or number filter defined. property", c9094g7.m36309D().m36622c(c2281r7.m10609H()));
        } else if (C9277re.m36734O(c2281r7.m10611K())) {
            boolM36153e = AbstractC9019c.m36153e(AbstractC9019c.m36157i(c2281r7.m10611K(), c1984b4M10164J.m9780J()), zM9782M);
        } else {
            c9094g7.mo36321a().m37006r().m36913c("Invalid user property value for Numeric number filter. property, value", c9094g7.m36309D().m36622c(c2281r7.m10609H()), c2281r7.m10611K());
        }
        c9094g7.mo36321a().m37011w().m36912b("Property filter result", boolM36153e == null ? "null" : boolM36153e);
        if (boolM36153e == null) {
            return false;
        }
        this.f32741c = Boolean.TRUE;
        if (zM10168O && !boolM36153e.booleanValue()) {
            return true;
        }
        if (!z10 || c2098h4.m10165K()) {
            this.f32742d = boolM36153e;
        }
        if (boolM36153e.booleanValue() && objArr != false && c2281r7.m10607F()) {
            long jM10608G = c2281r7.m10608G();
            if (l10 != null) {
                jM10608G = l10.longValue();
            }
            if (zM36406H && c2098h4.m10165K() && !c2098h4.m10166M() && l11 != null) {
                jM10608G = l11.longValue();
            }
            if (c2098h4.m10166M()) {
                this.f32744f = Long.valueOf(jM10608G);
            } else {
                this.f32743e = Long.valueOf(jM10608G);
            }
        }
        return true;
    }
}
