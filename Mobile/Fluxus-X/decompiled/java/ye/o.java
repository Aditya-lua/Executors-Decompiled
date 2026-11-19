package ye;

import com.google.crypto.tink.shaded.protobuf.a1;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public class o<P> implements re.m<P> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37805a;
    public final Class<P> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cf.f0.c f37806c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a1<? extends com.google.crypto.tink.shaded.protobuf.s0> f37807d;

    public static class a<P> extends o<P> implements re.y<P> {
        public a(String str, Class<P> cls, a1<? extends com.google.crypto.tink.shaded.protobuf.s0> a1Var) {
            super(str, cls, cf.f0.c.ASYMMETRIC_PRIVATE, a1Var);
        }
    }

    public o(String str, Class<P> cls, cf.f0.c cVar, a1<? extends com.google.crypto.tink.shaded.protobuf.s0> a1Var) {
        this.f37807d = a1Var;
        this.f37805a = str;
        this.b = cls;
        this.f37806c = cVar;
    }

    public static <P> re.m<P> e(String str, Class<P> cls, cf.f0.c cVar, a1<? extends com.google.crypto.tink.shaded.protobuf.s0> a1Var) {
        return new o(str, cls, cVar, a1Var);
    }

    public static <P> re.y<P> f(String str, Class<P> cls, a1<? extends com.google.crypto.tink.shaded.protobuf.s0> a1Var) {
        return new a(str, cls, a1Var);
    }

    @Override // re.m
    public final Class<P> a() {
        return this.b;
    }

    @Override // re.m
    public final cf.f0 b(com.google.crypto.tink.shaded.protobuf.h hVar) {
        l0 l0Var = (l0) d0.c().n(w.f().c(d0.c().h(m0.b(cf.h0.h0().F(this.f37805a).G(hVar).D(cf.p0.RAW).build())), null), l0.class, re.j.a());
        return cf.f0.h0().F(l0Var.f()).G(l0Var.g()).D(l0Var.d()).build();
    }

    @Override // re.m
    public final String c() {
        return this.f37805a;
    }

    @Override // re.m
    public P d(com.google.crypto.tink.shaded.protobuf.h hVar) throws GeneralSecurityException {
        return (P) a0.c().b(d0.c().f(l0.b(this.f37805a, hVar, this.f37806c, cf.p0.RAW, null), re.j.a()), this.b);
    }
}
