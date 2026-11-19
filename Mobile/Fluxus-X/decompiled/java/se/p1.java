package se;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class p1 extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t1 f31396a;
    public final gf.c b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gf.a f31397c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f31398d;

    public p1(t1 t1Var, gf.c cVar, gf.a aVar, Integer num) {
        this.f31396a = t1Var;
        this.b = cVar;
        this.f31397c = aVar;
        this.f31398d = num;
    }

    public static p1 b(t1.a aVar, gf.c cVar, Integer num) throws GeneralSecurityException {
        t1.a aVar2 = t1.a.f31420d;
        if (aVar != aVar2 && num == null) {
            throw new GeneralSecurityException("For given Variant " + aVar + " the value of idRequirement must be non-null");
        }
        if (aVar == aVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (cVar.c() == 32) {
            t1 t1VarB = t1.b(aVar);
            return new p1(t1VarB, cVar, e(t1VarB, num), num);
        }
        throw new GeneralSecurityException("XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + cVar.c());
    }

    public static gf.a e(t1 t1Var, Integer num) {
        if (t1Var.c() == t1.a.f31420d) {
            return ye.e0.f37741a;
        }
        if (t1Var.c() == t1.a.f31419c) {
            return ye.e0.a(num.intValue());
        }
        if (t1Var.c() == t1.a.b) {
            return ye.e0.b(num.intValue());
        }
        throw new IllegalStateException("Unknown Variant: " + t1Var.c());
    }

    @Override // re.l
    public Integer a() {
        return this.f31398d;
    }

    public gf.c c() {
        return this.b;
    }

    public gf.a d() {
        return this.f31397c;
    }

    public t1 f() {
        return this.f31396a;
    }
}
