package r7;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes3.dex */
public class b0 implements n0<PointF> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b0 f30562a = new b0();

    @Override // r7.n0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public PointF a(s7.c cVar, float f10) {
        s7.c.b bVarP = cVar.p();
        if (bVarP != s7.c.b.BEGIN_ARRAY && bVarP != s7.c.b.BEGIN_OBJECT) {
            if (bVarP == s7.c.b.NUMBER) {
                PointF pointF = new PointF(((float) cVar.h()) * f10, ((float) cVar.h()) * f10);
                while (cVar.f()) {
                    cVar.w();
                }
                return pointF;
            }
            throw new IllegalArgumentException("Cannot convert json to point. Next token is " + bVarP);
        }
        return s.e(cVar, f10);
    }
}
