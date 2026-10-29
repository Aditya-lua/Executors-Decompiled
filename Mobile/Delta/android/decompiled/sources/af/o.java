package af;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class o extends c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f463a;
    public final df.a b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final df.a f464c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f465d;

    public o(i iVar, df.a aVar, df.a aVar2, Integer num) {
        this.f463a = iVar;
        this.b = aVar;
        this.f464c = aVar2;
        this.f465d = num;
    }

    public static o c(i.a aVar, df.a aVar2, Integer num) throws GeneralSecurityException {
        i iVarB = i.b(aVar);
        i.a aVar3 = i.a.f420e;
        if (!aVar.equals(aVar3) && num == null) {
            throw new GeneralSecurityException("For given Variant " + aVar + " the value of idRequirement must be non-null");
        }
        if (aVar.equals(aVar3) && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (aVar2.c() == 32) {
            return new o(iVarB, aVar2, d(iVarB, num), num);
        }
        throw new GeneralSecurityException("Ed25519 key must be constructed with key of length 32 bytes, not " + aVar2.c());
    }

    public static df.a d(i iVar, Integer num) {
        if (iVar.c() == i.a.f420e) {
            return ve.e0.f32930a;
        }
        if (iVar.c() == i.a.f418c || iVar.c() == i.a.f419d) {
            return ve.e0.a(num.intValue());
        }
        if (iVar.c() == i.a.b) {
            return ve.e0.b(num.intValue());
        }
        throw new IllegalStateException("Unknown Variant: " + iVar.c());
    }

    @Override // oe.l
    public Integer a() {
        return this.f465d;
    }

    @Override // af.c1
    public df.a b() {
        return this.f464c;
    }

    public i e() {
        return this.f463a;
    }

    public df.a f() {
        return this.b;
    }
}
