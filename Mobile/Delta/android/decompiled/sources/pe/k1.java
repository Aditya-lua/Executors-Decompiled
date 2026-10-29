package pe;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class k1 extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o1 f28487a;
    public final df.c b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final df.a f28488c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f28489d;

    public k1(o1 o1Var, df.c cVar, df.a aVar, Integer num) {
        this.f28487a = o1Var;
        this.b = cVar;
        this.f28488c = aVar;
        this.f28489d = num;
    }

    public static k1 b(o1 o1Var, df.c cVar, Integer num) throws GeneralSecurityException {
        o1.a aVarD = o1Var.d();
        o1.a aVar = o1.a.f28506c;
        if (aVarD != aVar && num == null) {
            throw new GeneralSecurityException("For given Variant " + o1Var.d() + " the value of idRequirement must be non-null");
        }
        if (o1Var.d() == aVar && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (cVar.c() == 32) {
            return new k1(o1Var, cVar, e(o1Var, num), num);
        }
        throw new GeneralSecurityException("XAesGcmKey key must be constructed with key of length 32 bytes, not " + cVar.c());
    }

    public static df.a e(o1 o1Var, Integer num) {
        if (o1Var.d() == o1.a.f28506c) {
            return ve.e0.f32930a;
        }
        if (o1Var.d() == o1.a.b) {
            return ve.e0.b(num.intValue());
        }
        throw new IllegalStateException("Unknown Variant: " + o1Var.d());
    }

    @Override // oe.l
    public Integer a() {
        return this.f28489d;
    }

    public df.c c() {
        return this.b;
    }

    public df.a d() {
        return this.f28488c;
    }

    public o1 f() {
        return this.f28487a;
    }
}
