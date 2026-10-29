package pe;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class a0 extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e0 f28429a;
    public final df.c b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final df.a f28430c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f28431d;

    public a0(e0 e0Var, df.c cVar, df.a aVar, Integer num) {
        this.f28429a = e0Var;
        this.b = cVar;
        this.f28430c = aVar;
        this.f28431d = num;
    }

    public static a0 b(e0.a aVar, df.c cVar, Integer num) throws GeneralSecurityException {
        e0.a aVar2 = e0.a.f28439d;
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

    public static df.a e(e0 e0Var, Integer num) {
        if (e0Var.c() == e0.a.f28439d) {
            return ve.e0.f32930a;
        }
        if (e0Var.c() == e0.a.f28438c) {
            return ve.e0.a(num.intValue());
        }
        if (e0Var.c() == e0.a.b) {
            return ve.e0.b(num.intValue());
        }
        throw new IllegalStateException("Unknown Variant: " + e0Var.c());
    }

    @Override // oe.l
    public Integer a() {
        return this.f28431d;
    }

    public df.c c() {
        return this.b;
    }

    public df.a d() {
        return this.f28430c;
    }

    public e0 f() {
        return this.f28429a;
    }
}
