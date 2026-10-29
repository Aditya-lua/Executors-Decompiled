package q7;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes3.dex */
public class b0 implements n0<PointF> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b0 f29232a = new b0();

    @Override // q7.n0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public PointF a(r7.c cVar, float f10) {
        r7.c.b bVarO = cVar.o();
        if (bVarO != r7.c.b.BEGIN_ARRAY && bVarO != r7.c.b.BEGIN_OBJECT) {
            if (bVarO == r7.c.b.NUMBER) {
                PointF pointF = new PointF(((float) cVar.h()) * f10, ((float) cVar.h()) * f10);
                while (cVar.f()) {
                    cVar.u();
                }
                return pointF;
            }
            throw new IllegalArgumentException("Cannot convert json to point. Next token is " + bVarO);
        }
        return s.e(cVar, f10);
    }
}
