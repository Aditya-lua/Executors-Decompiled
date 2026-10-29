package p589z;

import android.content.Context;
import p296n0.C8734c3;
import p296n0.C8785l1;
import p296n0.C8802o3;
import p296n0.C8846x2;
import p296n0.InterfaceC8769i2;
import p296n0.InterfaceC8771i4;
import p296n0.InterfaceC8777j4;
import p296n0.InterfaceC8795n1;

/* JADX INFO: renamed from: z.t2 */
/* JADX INFO: loaded from: classes.dex */
public final class C13626t2 implements InterfaceC8777j4 {

    /* JADX INFO: renamed from: b */
    public final C13606q3 f47680b;

    public C13626t2(Context context) {
        this.f47680b = C13606q3.m49574c(context);
    }

    @Override // p296n0.InterfaceC8777j4
    /* JADX INFO: renamed from: a */
    public InterfaceC8795n1 mo35228a(InterfaceC8777j4.b bVar, int i10) {
        C8846x2 c8846x2M35505k0 = C8846x2.m35505k0();
        C8802o3.b bVar2 = new C8802o3.b();
        bVar2.m35314B(C13629t5.m49623b(bVar, i10));
        c8846x2M35505k0.mo35473G(InterfaceC8771i4.f31907w, bVar2.m35331p());
        c8846x2M35505k0.mo35473G(InterfaceC8771i4.f31909y, C13619s2.f47663a);
        C8785l1.a aVar = new C8785l1.a();
        aVar.m35273v(C13629t5.m49622a(bVar, i10));
        c8846x2M35505k0.mo35473G(InterfaceC8771i4.f31908x, aVar.m35261h());
        c8846x2M35505k0.mo35473G(InterfaceC8771i4.f31910z, bVar == InterfaceC8777j4.b.IMAGE_CAPTURE ? C13584n4.f47556c : C13485b1.f47211a);
        if (bVar == InterfaceC8777j4.b.PREVIEW) {
            c8846x2M35505k0.mo35473G(InterfaceC8769i2.f31888s, this.f47680b.m49579f());
        }
        c8846x2M35505k0.mo35473G(InterfaceC8769i2.f31883n, Integer.valueOf(this.f47680b.m49577d(true).getRotation()));
        if (bVar == InterfaceC8777j4.b.VIDEO_CAPTURE || bVar == InterfaceC8777j4.b.STREAM_SHARING) {
            c8846x2M35505k0.mo35473G(InterfaceC8771i4.f31900E, Boolean.TRUE);
        }
        return C8734c3.m35022j0(c8846x2M35505k0);
    }
}
