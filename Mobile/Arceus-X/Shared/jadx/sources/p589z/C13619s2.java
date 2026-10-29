package p589z;

import android.util.Size;
import p063d0.C4384o;
import p296n0.C8734c3;
import p296n0.C8752f3;
import p296n0.C8802o3;
import p296n0.C8846x2;
import p296n0.InterfaceC8771i4;
import p296n0.InterfaceC8795n1;
import p561y.C12964a;

/* JADX INFO: renamed from: z.s2 */
/* JADX INFO: loaded from: classes.dex */
public final class C13619s2 implements C8802o3.e {

    /* JADX INFO: renamed from: a */
    public static final C13619s2 f47663a = new C13619s2();

    @Override // p296n0.C8802o3.e
    /* JADX INFO: renamed from: a */
    public void mo35342a(Size size, InterfaceC8771i4<?> interfaceC8771i4, C8802o3.b bVar) {
        C8802o3 c8802o3M35210j = interfaceC8771i4.m35210j(null);
        InterfaceC8795n1 interfaceC8795n1M35021i0 = C8734c3.m35021i0();
        int iM35311q = C8802o3.m35296b().m35311q();
        if (c8802o3M35210j != null) {
            iM35311q = c8802o3M35210j.m35311q();
            bVar.m35317b(c8802o3M35210j.m35298c());
            bVar.m35319d(c8802o3M35210j.m35307m());
            bVar.m35318c(c8802o3M35210j.m35305k());
            interfaceC8795n1M35021i0 = c8802o3M35210j.m35301g();
        }
        bVar.m35337w(interfaceC8795n1M35021i0);
        if (interfaceC8771i4 instanceof C8752f3) {
            C4384o.m22050b(size, bVar);
        }
        C12964a c12964a = new C12964a(interfaceC8771i4);
        bVar.m35314B(c12964a.m48212j0(iM35311q));
        bVar.m35321f(c12964a.m48213k0(C13647w2.m49734b()));
        bVar.m35326k(c12964a.m48216n0(C13640v2.m49732b()));
        bVar.m35320e(C13495c3.m49188e(c12964a.m48215m0(C13477a1.m49168c())));
        bVar.m35315C(interfaceC8771i4.m35214x());
        bVar.m35340z(interfaceC8771i4.m35200E());
        C8846x2 c8846x2M35505k0 = C8846x2.m35505k0();
        c8846x2M35505k0.mo35473G(C12964a.f45922W, c12964a.m48214l0(null));
        c8846x2M35505k0.mo35473G(C12964a.f45917R, Long.valueOf(c12964a.m48217o0(-1L)));
        bVar.m35322g(c8846x2M35505k0);
        bVar.m35322g(c12964a.m48211i0());
    }
}
