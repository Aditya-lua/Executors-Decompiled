package ve;

import com.google.crypto.tink.shaded.protobuf.a1;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public class o<P> implements oe.m<P> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32994a;
    public final Class<P> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ze.f0.c f32995c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a1<? extends com.google.crypto.tink.shaded.protobuf.s0> f32996d;

    public static class a<P> extends o<P> implements oe.y<P> {
        public a(String str, Class<P> cls, a1<? extends com.google.crypto.tink.shaded.protobuf.s0> a1Var) {
            super(str, cls, ze.f0.c.ASYMMETRIC_PRIVATE, a1Var);
        }
    }

    public o(String str, Class<P> cls, ze.f0.c cVar, a1<? extends com.google.crypto.tink.shaded.protobuf.s0> a1Var) {
        this.f32996d = a1Var;
        this.f32994a = str;
        this.b = cls;
        this.f32995c = cVar;
    }

    public static <P> oe.m<P> e(String str, Class<P> cls, ze.f0.c cVar, a1<? extends com.google.crypto.tink.shaded.protobuf.s0> a1Var) {
        return new o(str, cls, cVar, a1Var);
    }

    public static <P> oe.y<P> f(String str, Class<P> cls, a1<? extends com.google.crypto.tink.shaded.protobuf.s0> a1Var) {
        return new a(str, cls, a1Var);
    }

    @Override // oe.m
    public final Class<P> a() {
        return this.b;
    }

    @Override // oe.m
    public final ze.f0 b(com.google.crypto.tink.shaded.protobuf.h hVar) {
        l0 l0Var = (l0) d0.c().n(w.f().c(d0.c().h(m0.b(ze.h0.h0().D(this.f32994a).E(hVar).C(ze.p0.RAW).build())), null), l0.class, oe.j.a());
        return ze.f0.h0().D(l0Var.f()).E(l0Var.g()).C(l0Var.d()).build();
    }

    @Override // oe.m
    public final String c() {
        return this.f32994a;
    }

    @Override // oe.m
    public P d(com.google.crypto.tink.shaded.protobuf.h hVar) throws GeneralSecurityException {
        return (P) a0.c().b(d0.c().f(l0.b(this.f32994a, hVar, this.f32995c, ze.p0.RAW, null), oe.j.a()), this.b);
    }
}
