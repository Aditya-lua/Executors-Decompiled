package q7;

/* JADX INFO: loaded from: classes3.dex */
public class g0 implements n0<t7.d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g0 f29241a = new g0();

    @Override // q7.n0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public t7.d a(r7.c cVar, float f10) {
        boolean z10 = cVar.o() == r7.c.b.BEGIN_ARRAY;
        if (z10) {
            cVar.b();
        }
        float fH = (float) cVar.h();
        float fH2 = (float) cVar.h();
        while (cVar.f()) {
            cVar.u();
        }
        if (z10) {
            cVar.d();
        }
        return new t7.d((fH / 100.0f) * f10, (fH2 / 100.0f) * f10);
    }
}
