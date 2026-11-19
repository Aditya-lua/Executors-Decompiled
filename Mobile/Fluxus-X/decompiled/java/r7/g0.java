package r7;

/* JADX INFO: loaded from: classes3.dex */
public class g0 implements n0<u7.d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g0 f30571a = new g0();

    @Override // r7.n0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public u7.d a(s7.c cVar, float f10) {
        boolean z10 = cVar.p() == s7.c.b.BEGIN_ARRAY;
        if (z10) {
            cVar.b();
        }
        float fH = (float) cVar.h();
        float fH2 = (float) cVar.h();
        while (cVar.f()) {
            cVar.w();
        }
        if (z10) {
            cVar.d();
        }
        return new u7.d((fH / 100.0f) * f10, (fH2 / 100.0f) * f10);
    }
}
