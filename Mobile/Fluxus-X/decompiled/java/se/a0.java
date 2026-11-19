package se;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class a0 extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e0 f31308a;
    public final gf.c b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gf.a f31309c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f31310d;

    public a0(e0 e0Var, gf.c cVar, gf.a aVar, Integer num) {
        this.f31308a = e0Var;
        this.b = cVar;
        this.f31309c = aVar;
        this.f31310d = num;
    }

    public static a0 b(e0.a aVar, gf.c cVar, Integer num) throws GeneralSecurityException {
        e0.a aVar2 = e0.a.f31318d;
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

    public static gf.a e(e0 e0Var, Integer num) {
        if (e0Var.c() == e0.a.f31318d) {
            return ye.e0.f37741a;
        }
        if (e0Var.c() == e0.a.f31317c) {
            return ye.e0.a(num.intValue());
        }
        if (e0Var.c() == e0.a.b) {
            return ye.e0.b(num.intValue());
        }
        throw new IllegalStateException("Unknown Variant: " + e0Var.c());
    }

    @Override // re.l
    public Integer a() {
        return this.f31310d;
    }

    public gf.c c() {
        return this.b;
    }

    public gf.a d() {
        return this.f31309c;
    }

    public e0 f() {
        return this.f31308a;
    }
}
