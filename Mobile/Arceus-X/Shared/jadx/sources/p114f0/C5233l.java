package p114f0;

import android.hardware.camera2.CaptureRequest;
import p140g0.InterfaceC5906l0;
import p296n0.C8734c3;
import p296n0.C8846x2;
import p296n0.InterfaceC8787l3;
import p296n0.InterfaceC8795n1;
import p296n0.InterfaceC8841w2;
import p561y.C12964a;

/* JADX INFO: renamed from: f0.l */
/* JADX INFO: loaded from: classes.dex */
public class C5233l implements InterfaceC8787l3 {

    /* JADX INFO: renamed from: P */
    public final InterfaceC8795n1 f20285P;

    /* JADX INFO: renamed from: f0.l$a */
    public static final class a implements InterfaceC5906l0<C5233l> {

        /* JADX INFO: renamed from: a */
        public final C8846x2 f20286a = C8846x2.m35505k0();

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ boolean m24214b(a aVar, InterfaceC8795n1 interfaceC8795n1, InterfaceC8795n1.a aVar2) {
            aVar.mo6684a().mo35472D(aVar2, interfaceC8795n1.mo35029g(aVar2), interfaceC8795n1.mo35027e(aVar2));
            return true;
        }

        /* JADX INFO: renamed from: d */
        public static a m24215d(final InterfaceC8795n1 interfaceC8795n1) {
            final a aVar = new a();
            interfaceC8795n1.mo35026d("camera2.captureRequest.option.", new InterfaceC8795n1.b() { // from class: f0.k
                @Override // p296n0.InterfaceC8795n1.b
                /* JADX INFO: renamed from: a */
                public final boolean mo24213a(InterfaceC8795n1.a aVar2) {
                    return C5233l.a.m24214b(this.f20283a, interfaceC8795n1, aVar2);
                }
            });
            return aVar;
        }

        @Override // p140g0.InterfaceC5906l0
        /* JADX INFO: renamed from: a */
        public InterfaceC8841w2 mo6684a() {
            return this.f20286a;
        }

        /* JADX INFO: renamed from: c */
        public C5233l m24216c() {
            return new C5233l(C8734c3.m35022j0(this.f20286a));
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: n0.x2 */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: f */
        public <ValueT> a m24217f(CaptureRequest.Key<ValueT> key, ValueT valuet) {
            this.f20286a.mo35473G(C12964a.m48210h0(key), valuet);
            return this;
        }
    }

    public C5233l(InterfaceC8795n1 interfaceC8795n1) {
        this.f20285P = interfaceC8795n1;
    }

    @Override // p296n0.InterfaceC8787l3
    /* JADX INFO: renamed from: n */
    public InterfaceC8795n1 mo6691n() {
        return this.f20285P;
    }
}
