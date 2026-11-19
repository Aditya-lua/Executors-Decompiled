package ye;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class l0 implements p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37794a;
    public final gf.a b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.google.crypto.tink.shaded.protobuf.h f37795c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final cf.f0.c f37796d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final cf.p0 f37797e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Integer f37798f;

    public l0(String str, gf.a aVar, com.google.crypto.tink.shaded.protobuf.h hVar, cf.f0.c cVar, cf.p0 p0Var, Integer num) {
        this.f37794a = str;
        this.b = aVar;
        this.f37795c = hVar;
        this.f37796d = cVar;
        this.f37797e = p0Var;
        this.f37798f = num;
    }

    public static l0 b(String str, com.google.crypto.tink.shaded.protobuf.h hVar, cf.f0.c cVar, cf.p0 p0Var, Integer num) throws GeneralSecurityException {
        if (p0Var == cf.p0.RAW) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new l0(str, s0.b(str), hVar, cVar, p0Var, num);
    }

    @Override // ye.p0
    public gf.a a() {
        return this.b;
    }

    public Integer c() {
        return this.f37798f;
    }

    public cf.f0.c d() {
        return this.f37796d;
    }

    public cf.p0 e() {
        return this.f37797e;
    }

    public String f() {
        return this.f37794a;
    }

    public com.google.crypto.tink.shaded.protobuf.h g() {
        return this.f37795c;
    }
}
