package we;

import com.google.crypto.tink.shaded.protobuf.a1;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public class o<P> implements pe.m<P> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34448a;
    public final Class<P> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final af.f0.c f34449c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a1<? extends com.google.crypto.tink.shaded.protobuf.s0> f34450d;

    public static class a<P> extends o<P> implements pe.y<P> {
        public a(String str, Class<P> cls, a1<? extends com.google.crypto.tink.shaded.protobuf.s0> a1Var) {
            super(str, cls, af.f0.c.ASYMMETRIC_PRIVATE, a1Var);
        }
    }

    public o(String str, Class<P> cls, af.f0.c cVar, a1<? extends com.google.crypto.tink.shaded.protobuf.s0> a1Var) {
        this.f34450d = a1Var;
        this.f34448a = str;
        this.b = cls;
        this.f34449c = cVar;
    }

    public static <P> pe.m<P> e(String str, Class<P> cls, af.f0.c cVar, a1<? extends com.google.crypto.tink.shaded.protobuf.s0> a1Var) {
        return new o(str, cls, cVar, a1Var);
    }

    public static <P> pe.y<P> f(String str, Class<P> cls, a1<? extends com.google.crypto.tink.shaded.protobuf.s0> a1Var) {
        return new a(str, cls, a1Var);
    }

    @Override // pe.m
    public final Class<P> a() {
        return this.b;
    }

    @Override // pe.m
    public final af.f0 b(com.google.crypto.tink.shaded.protobuf.h hVar) {
        l0 l0Var = (l0) d0.c().n(w.f().c(d0.c().h(m0.b(af.h0.h0().D(this.f34448a).E(hVar).C(af.p0.RAW).build())), null), l0.class, pe.j.a());
        return af.f0.h0().D(l0Var.f()).E(l0Var.g()).C(l0Var.d()).build();
    }

    @Override // pe.m
    public final String c() {
        return this.f34448a;
    }

    @Override // pe.m
    public P d(com.google.crypto.tink.shaded.protobuf.h hVar) throws GeneralSecurityException {
        return (P) a0.c().b(d0.c().f(l0.b(this.f34448a, hVar, this.f34449c, af.p0.RAW, null), pe.j.a()), this.b);
    }
}
