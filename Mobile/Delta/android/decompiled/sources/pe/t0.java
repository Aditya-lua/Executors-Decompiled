package pe;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public class t0 extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u0 f28537a;
    public final df.a b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f28538c;

    public t0(u0 u0Var, df.a aVar, Integer num) {
        this.f28537a = u0Var;
        this.b = aVar;
        this.f28538c = num;
    }

    public static t0 b(u0 u0Var, Integer num) throws GeneralSecurityException {
        df.a aVarB;
        if (u0Var.e() == u0.d.f28564c) {
            if (num != null) {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            aVarB = ve.e0.f32930a;
        } else {
            if (u0Var.e() != u0.d.b) {
                throw new GeneralSecurityException("Unknown Variant: " + u0Var.e());
            }
            if (num == null) {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
            aVarB = ve.e0.b(num.intValue());
        }
        return new t0(u0Var, aVarB, num);
    }

    @Override // oe.l
    public Integer a() {
        return this.f28538c;
    }

    public df.a c() {
        return this.b;
    }

    public u0 d() {
        return this.f28537a;
    }
}
