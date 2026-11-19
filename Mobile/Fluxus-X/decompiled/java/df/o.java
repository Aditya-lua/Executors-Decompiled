package df;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class o extends c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f12333a;
    public final gf.a b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gf.a f12334c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f12335d;

    public o(i iVar, gf.a aVar, gf.a aVar2, Integer num) {
        this.f12333a = iVar;
        this.b = aVar;
        this.f12334c = aVar2;
        this.f12335d = num;
    }

    public static o c(i.a aVar, gf.a aVar2, Integer num) throws GeneralSecurityException {
        i iVarB = i.b(aVar);
        i.a aVar3 = i.a.f12290e;
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

    public static gf.a d(i iVar, Integer num) {
        if (iVar.c() == i.a.f12290e) {
            return ye.e0.f37741a;
        }
        if (iVar.c() == i.a.f12288c || iVar.c() == i.a.f12289d) {
            return ye.e0.a(num.intValue());
        }
        if (iVar.c() == i.a.b) {
            return ye.e0.b(num.intValue());
        }
        throw new IllegalStateException("Unknown Variant: " + iVar.c());
    }

    @Override // re.l
    public Integer a() {
        return this.f12335d;
    }

    @Override // df.c1
    public gf.a b() {
        return this.f12334c;
    }

    public i e() {
        return this.f12333a;
    }

    public gf.a f() {
        return this.b;
    }
}
