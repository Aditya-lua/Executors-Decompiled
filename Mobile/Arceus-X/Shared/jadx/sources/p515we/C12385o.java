package p515we;

import af.C0218f0;
import af.C0222h0;
import af.EnumC0238p0;
import com.google.crypto.tink.shaded.protobuf.AbstractC2920h;
import com.google.crypto.tink.shaded.protobuf.InterfaceC2901a1;
import com.google.crypto.tink.shaded.protobuf.InterfaceC2954s0;
import java.security.GeneralSecurityException;
import pe.C10229j;
import pe.InterfaceC10232m;
import pe.InterfaceC10244y;

/* JADX INFO: renamed from: we.o */
/* JADX INFO: loaded from: classes2.dex */
public class C12385o<P> implements InterfaceC10232m<P> {

    /* JADX INFO: renamed from: a */
    public final String f44320a;

    /* JADX INFO: renamed from: b */
    public final Class<P> f44321b;

    /* JADX INFO: renamed from: c */
    public final C0218f0.c f44322c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC2901a1<? extends InterfaceC2954s0> f44323d;

    /* JADX INFO: renamed from: we.o$a */
    public static class a<P> extends C12385o<P> implements InterfaceC10244y<P> {
        public a(String str, Class<P> cls, InterfaceC2901a1<? extends InterfaceC2954s0> interfaceC2901a1) {
            super(str, cls, C0218f0.c.ASYMMETRIC_PRIVATE, interfaceC2901a1);
        }
    }

    public C12385o(String str, Class<P> cls, C0218f0.c cVar, InterfaceC2901a1<? extends InterfaceC2954s0> interfaceC2901a1) {
        this.f44323d = interfaceC2901a1;
        this.f44320a = str;
        this.f44321b = cls;
        this.f44322c = cVar;
    }

    /* JADX INFO: renamed from: e */
    public static <P> InterfaceC10232m<P> m46414e(String str, Class<P> cls, C0218f0.c cVar, InterfaceC2901a1<? extends InterfaceC2954s0> interfaceC2901a1) {
        return new C12385o(str, cls, cVar, interfaceC2901a1);
    }

    /* JADX INFO: renamed from: f */
    public static <P> InterfaceC10244y<P> m46415f(String str, Class<P> cls, InterfaceC2901a1<? extends InterfaceC2954s0> interfaceC2901a1) {
        return new a(str, cls, interfaceC2901a1);
    }

    @Override // pe.InterfaceC10232m
    /* JADX INFO: renamed from: a */
    public final Class<P> mo39335a() {
        return this.f44321b;
    }

    @Override // pe.InterfaceC10232m
    /* JADX INFO: renamed from: b */
    public final C0218f0 mo39336b(AbstractC2920h abstractC2920h) {
        C12380l0 c12380l0 = (C12380l0) C12364d0.m46238c().m46249n(C12398w.m46468f().m46471c(C12364d0.m46238c().m46243h(C12382m0.m46402b(C0222h0.m757h0().m767D(this.f44320a).m768E(abstractC2920h).m766C(EnumC0238p0.RAW).build())), null), C12380l0.class, C10229j.m39322a());
        return C0218f0.m720h0().m728D(c12380l0.m46396f()).m729E(c12380l0.m46397g()).m727C(c12380l0.m46394d()).build();
    }

    @Override // pe.InterfaceC10232m
    /* JADX INFO: renamed from: c */
    public final String mo39337c() {
        return this.f44320a;
    }

    @Override // pe.InterfaceC10232m
    /* JADX INFO: renamed from: d */
    public P mo39338d(AbstractC2920h abstractC2920h) throws GeneralSecurityException {
        return (P) C12358a0.m46226c().m46228b(C12364d0.m46238c().m46241f(C12380l0.m46391b(this.f44320a, abstractC2920h, this.f44322c, EnumC0238p0.RAW, null), C10229j.m39322a()), this.f44321b);
    }
}
