package qe;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public class t0 extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u0 f29785a;
    public final ef.a b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f29786c;

    public t0(u0 u0Var, ef.a aVar, Integer num) {
        this.f29785a = u0Var;
        this.b = aVar;
        this.f29786c = num;
    }

    public static t0 b(u0 u0Var, Integer num) throws GeneralSecurityException {
        ef.a aVarB;
        if (u0Var.e() == u0.d.f29812c) {
            if (num != null) {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            aVarB = we.e0.f34384a;
        } else {
            if (u0Var.e() != u0.d.b) {
                throw new GeneralSecurityException("Unknown Variant: " + u0Var.e());
            }
            if (num == null) {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
            aVarB = we.e0.b(num.intValue());
        }
        return new t0(u0Var, aVarB, num);
    }

    @Override // pe.l
    public Integer a() {
        return this.f29786c;
    }

    public ef.a c() {
        return this.b;
    }

    public u0 d() {
        return this.f29785a;
    }
}
