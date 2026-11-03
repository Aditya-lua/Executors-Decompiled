package qe;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class k1 extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o1 f29735a;
    public final ef.c b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ef.a f29736c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f29737d;

    public k1(o1 o1Var, ef.c cVar, ef.a aVar, Integer num) {
        this.f29735a = o1Var;
        this.b = cVar;
        this.f29736c = aVar;
        this.f29737d = num;
    }

    public static k1 b(o1 o1Var, ef.c cVar, Integer num) throws GeneralSecurityException {
        o1.a aVarD = o1Var.d();
        o1.a aVar = o1.a.f29754c;
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

    public static ef.a e(o1 o1Var, Integer num) {
        if (o1Var.d() == o1.a.f29754c) {
            return we.e0.f34384a;
        }
        if (o1Var.d() == o1.a.b) {
            return we.e0.b(num.intValue());
        }
        throw new IllegalStateException("Unknown Variant: " + o1Var.d());
    }

    @Override // pe.l
    public Integer a() {
        return this.f29737d;
    }

    public ef.c c() {
        return this.b;
    }

    public ef.a d() {
        return this.f29736c;
    }

    public o1 f() {
        return this.f29735a;
    }
}
