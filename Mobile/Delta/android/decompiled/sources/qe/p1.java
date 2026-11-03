package qe;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class p1 extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t1 f29765a;
    public final ef.c b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ef.a f29766c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f29767d;

    public p1(t1 t1Var, ef.c cVar, ef.a aVar, Integer num) {
        this.f29765a = t1Var;
        this.b = cVar;
        this.f29766c = aVar;
        this.f29767d = num;
    }

    public static p1 b(t1.a aVar, ef.c cVar, Integer num) throws GeneralSecurityException {
        t1.a aVar2 = t1.a.f29789d;
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

    public static ef.a e(t1 t1Var, Integer num) {
        if (t1Var.c() == t1.a.f29789d) {
            return we.e0.f34384a;
        }
        if (t1Var.c() == t1.a.f29788c) {
            return we.e0.a(num.intValue());
        }
        if (t1Var.c() == t1.a.b) {
            return we.e0.b(num.intValue());
        }
        throw new IllegalStateException("Unknown Variant: " + t1Var.c());
    }

    @Override // pe.l
    public Integer a() {
        return this.f29767d;
    }

    public ef.c c() {
        return this.b;
    }

    public ef.a d() {
        return this.f29766c;
    }

    public t1 f() {
        return this.f29765a;
    }
}
