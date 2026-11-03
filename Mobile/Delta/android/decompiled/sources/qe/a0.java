package qe;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class a0 extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e0 f29677a;
    public final ef.c b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ef.a f29678c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f29679d;

    public a0(e0 e0Var, ef.c cVar, ef.a aVar, Integer num) {
        this.f29677a = e0Var;
        this.b = cVar;
        this.f29678c = aVar;
        this.f29679d = num;
    }

    public static a0 b(e0.a aVar, ef.c cVar, Integer num) throws GeneralSecurityException {
        e0.a aVar2 = e0.a.f29687d;
        if (aVar != aVar2 && num == null) {
            throw new GeneralSecurityException("For given Variant " + aVar + " the value of idRequirement must be non-null");
        }
        if (aVar == aVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (cVar.c() == 32) {
            e0 e0VarB = e0.b(aVar);
            return new a0(e0VarB, cVar, e(e0VarB, num), num);
        }
        throw new GeneralSecurityException("ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + cVar.c());
    }

    public static ef.a e(e0 e0Var, Integer num) {
        if (e0Var.c() == e0.a.f29687d) {
            return we.e0.f34384a;
        }
        if (e0Var.c() == e0.a.f29686c) {
            return we.e0.a(num.intValue());
        }
        if (e0Var.c() == e0.a.b) {
            return we.e0.b(num.intValue());
        }
        throw new IllegalStateException("Unknown Variant: " + e0Var.c());
    }

    @Override // pe.l
    public Integer a() {
        return this.f29679d;
    }

    public ef.c c() {
        return this.b;
    }

    public ef.a d() {
        return this.f29678c;
    }

    public e0 f() {
        return this.f29677a;
    }
}
