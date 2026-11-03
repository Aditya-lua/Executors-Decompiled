package bf;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class o extends c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f4135a;
    public final ef.a b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ef.a f4136c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f4137d;

    public o(i iVar, ef.a aVar, ef.a aVar2, Integer num) {
        this.f4135a = iVar;
        this.b = aVar;
        this.f4136c = aVar2;
        this.f4137d = num;
    }

    public static o c(i.a aVar, ef.a aVar2, Integer num) throws GeneralSecurityException {
        i iVarB = i.b(aVar);
        i.a aVar3 = i.a.f4092e;
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

    public static ef.a d(i iVar, Integer num) {
        if (iVar.c() == i.a.f4092e) {
            return we.e0.f34384a;
        }
        if (iVar.c() == i.a.f4090c || iVar.c() == i.a.f4091d) {
            return we.e0.a(num.intValue());
        }
        if (iVar.c() == i.a.b) {
            return we.e0.b(num.intValue());
        }
        throw new IllegalStateException("Unknown Variant: " + iVar.c());
    }

    @Override // pe.l
    public Integer a() {
        return this.f4137d;
    }

    @Override // bf.c1
    public ef.a b() {
        return this.f4136c;
    }

    public i e() {
        return this.f4135a;
    }

    public ef.a f() {
        return this.b;
    }
}
