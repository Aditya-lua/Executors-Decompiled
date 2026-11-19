package se;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class k1 extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o1 f31366a;
    public final gf.c b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gf.a f31367c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f31368d;

    public k1(o1 o1Var, gf.c cVar, gf.a aVar, Integer num) {
        this.f31366a = o1Var;
        this.b = cVar;
        this.f31367c = aVar;
        this.f31368d = num;
    }

    public static k1 b(o1 o1Var, gf.c cVar, Integer num) throws GeneralSecurityException {
        o1.a aVarD = o1Var.d();
        o1.a aVar = o1.a.f31385c;
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

    public static gf.a e(o1 o1Var, Integer num) {
        if (o1Var.d() == o1.a.f31385c) {
            return ye.e0.f37741a;
        }
        if (o1Var.d() == o1.a.b) {
            return ye.e0.b(num.intValue());
        }
        throw new IllegalStateException("Unknown Variant: " + o1Var.d());
    }

    @Override // re.l
    public Integer a() {
        return this.f31368d;
    }

    public gf.c c() {
        return this.b;
    }

    public gf.a d() {
        return this.f31367c;
    }

    public o1 f() {
        return this.f31366a;
    }
}
