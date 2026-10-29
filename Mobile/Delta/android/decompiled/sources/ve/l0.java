package ve;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class l0 implements p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32983a;
    public final df.a b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.google.crypto.tink.shaded.protobuf.h f32984c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ze.f0.c f32985d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ze.p0 f32986e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Integer f32987f;

    public l0(String str, df.a aVar, com.google.crypto.tink.shaded.protobuf.h hVar, ze.f0.c cVar, ze.p0 p0Var, Integer num) {
        this.f32983a = str;
        this.b = aVar;
        this.f32984c = hVar;
        this.f32985d = cVar;
        this.f32986e = p0Var;
        this.f32987f = num;
    }

    public static l0 b(String str, com.google.crypto.tink.shaded.protobuf.h hVar, ze.f0.c cVar, ze.p0 p0Var, Integer num) throws GeneralSecurityException {
        if (p0Var == ze.p0.RAW) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new l0(str, s0.b(str), hVar, cVar, p0Var, num);
    }

    @Override // ve.p0
    public df.a a() {
        return this.b;
    }

    public Integer c() {
        return this.f32987f;
    }

    public ze.f0.c d() {
        return this.f32985d;
    }

    public ze.p0 e() {
        return this.f32986e;
    }

    public String f() {
        return this.f32983a;
    }

    public com.google.crypto.tink.shaded.protobuf.h g() {
        return this.f32984c;
    }
}
