package pe;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class p1 extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t1 f28517a;
    public final df.c b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final df.a f28518c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f28519d;

    public p1(t1 t1Var, df.c cVar, df.a aVar, Integer num) {
        this.f28517a = t1Var;
        this.b = cVar;
        this.f28518c = aVar;
        this.f28519d = num;
    }

    public static p1 b(t1.a aVar, df.c cVar, Integer num) throws GeneralSecurityException {
        t1.a aVar2 = t1.a.f28541d;
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

    public static df.a e(t1 t1Var, Integer num) {
        if (t1Var.c() == t1.a.f28541d) {
            return ve.e0.f32930a;
        }
        if (t1Var.c() == t1.a.f28540c) {
            return ve.e0.a(num.intValue());
        }
        if (t1Var.c() == t1.a.b) {
            return ve.e0.b(num.intValue());
        }
        throw new IllegalStateException("Unknown Variant: " + t1Var.c());
    }

    @Override // oe.l
    public Integer a() {
        return this.f28519d;
    }

    public df.c c() {
        return this.b;
    }

    public df.a d() {
        return this.f28518c;
    }

    public t1 f() {
        return this.f28517a;
    }
}
