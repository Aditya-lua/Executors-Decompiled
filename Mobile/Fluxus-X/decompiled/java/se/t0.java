package se;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public class t0 extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u0 f31416a;
    public final gf.a b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f31417c;

    public t0(u0 u0Var, gf.a aVar, Integer num) {
        this.f31416a = u0Var;
        this.b = aVar;
        this.f31417c = num;
    }

    public static t0 b(u0 u0Var, Integer num) throws GeneralSecurityException {
        gf.a aVarB;
        if (u0Var.e() == u0.d.f31443c) {
            if (num != null) {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            aVarB = ye.e0.f37741a;
        } else {
            if (u0Var.e() != u0.d.b) {
                throw new GeneralSecurityException("Unknown Variant: " + u0Var.e());
            }
            if (num == null) {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
            aVarB = ye.e0.b(num.intValue());
        }
        return new t0(u0Var, aVarB, num);
    }

    @Override // re.l
    public Integer a() {
        return this.f31417c;
    }

    public gf.a c() {
        return this.b;
    }

    public u0 d() {
        return this.f31416a;
    }
}
