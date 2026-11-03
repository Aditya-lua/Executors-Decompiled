package we;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class l0 implements p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34437a;
    public final ef.a b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.google.crypto.tink.shaded.protobuf.h f34438c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final af.f0.c f34439d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final af.p0 f34440e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Integer f34441f;

    public l0(String str, ef.a aVar, com.google.crypto.tink.shaded.protobuf.h hVar, af.f0.c cVar, af.p0 p0Var, Integer num) {
        this.f34437a = str;
        this.b = aVar;
        this.f34438c = hVar;
        this.f34439d = cVar;
        this.f34440e = p0Var;
        this.f34441f = num;
    }

    public static l0 b(String str, com.google.crypto.tink.shaded.protobuf.h hVar, af.f0.c cVar, af.p0 p0Var, Integer num) throws GeneralSecurityException {
        if (p0Var == af.p0.RAW) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new l0(str, s0.b(str), hVar, cVar, p0Var, num);
    }

    @Override // we.p0
    public ef.a a() {
        return this.b;
    }

    public Integer c() {
        return this.f34441f;
    }

    public af.f0.c d() {
        return this.f34439d;
    }

    public af.p0 e() {
        return this.f34440e;
    }

    public String f() {
        return this.f34437a;
    }

    public com.google.crypto.tink.shaded.protobuf.h g() {
        return this.f34438c;
    }
}
