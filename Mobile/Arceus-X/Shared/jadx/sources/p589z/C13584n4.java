package p589z;

import p063d0.C4379j;
import p296n0.C8757g2;
import p296n0.C8785l1;
import p296n0.InterfaceC8771i4;
import p561y.C12964a;

/* JADX INFO: renamed from: z.n4 */
/* JADX INFO: loaded from: classes.dex */
public final class C13584n4 extends C13485b1 {

    /* JADX INFO: renamed from: c */
    public static final C13584n4 f47556c = new C13584n4(new C4379j());

    /* JADX INFO: renamed from: b */
    public final C4379j f47557b;

    public C13584n4(C4379j c4379j) {
        this.f47557b = c4379j;
    }

    @Override // p589z.C13485b1, p296n0.C8785l1.b
    /* JADX INFO: renamed from: a */
    public void mo35276a(InterfaceC8771i4<?> interfaceC8771i4, C8785l1.a aVar) {
        super.mo35276a(interfaceC8771i4, aVar);
        if (!(interfaceC8771i4 instanceof C8757g2)) {
            throw new IllegalArgumentException("config is not ImageCaptureConfig");
        }
        C8757g2 c8757g2 = (C8757g2) interfaceC8771i4;
        C12964a.a aVar2 = new C12964a.a();
        if (c8757g2.m35131p0()) {
            this.f47557b.m22040a(c8757g2.m35124i0(), aVar2);
        }
        aVar.m35258e(aVar2.m48218b());
    }
}
