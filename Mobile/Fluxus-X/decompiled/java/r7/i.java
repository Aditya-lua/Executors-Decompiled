package r7;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes3.dex */
public class i implements n0<m7.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f30574a = new i();
    public static final s7.c.a b = s7.c.a.a("t", "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of", "ps", "sz");

    @Override // r7.n0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public m7.b a(s7.c cVar, float f10) {
        m7.b.a aVar = m7.b.a.CENTER;
        cVar.c();
        m7.b.a aVar2 = aVar;
        String strN = null;
        String strN2 = null;
        PointF pointF = null;
        PointF pointF2 = null;
        float fH = 0.0f;
        float fH2 = 0.0f;
        float fH3 = 0.0f;
        float fH4 = 0.0f;
        int iK = 0;
        int iD = 0;
        int iD2 = 0;
        boolean zG = true;
        while (cVar.f()) {
            switch (cVar.s(b)) {
                case 0:
                    strN = cVar.n();
                    break;
                case 1:
                    strN2 = cVar.n();
                    break;
                case 2:
                    fH = (float) cVar.h();
                    break;
                case 3:
                    int iK2 = cVar.k();
                    aVar2 = m7.b.a.CENTER;
                    if (iK2 <= aVar2.ordinal() && iK2 >= 0) {
                        aVar2 = m7.b.a.values()[iK2];
                    }
                    break;
                case 4:
                    iK = cVar.k();
                    break;
                case 5:
                    fH2 = (float) cVar.h();
                    break;
                case 6:
                    fH3 = (float) cVar.h();
                    break;
                case 7:
                    iD = s.d(cVar);
                    break;
                case 8:
                    iD2 = s.d(cVar);
                    break;
                case 9:
                    fH4 = (float) cVar.h();
                    break;
                case 10:
                    zG = cVar.g();
                    break;
                case 11:
                    cVar.b();
                    PointF pointF3 = new PointF(((float) cVar.h()) * f10, ((float) cVar.h()) * f10);
                    cVar.d();
                    pointF = pointF3;
                    break;
                case 12:
                    cVar.b();
                    PointF pointF4 = new PointF(((float) cVar.h()) * f10, ((float) cVar.h()) * f10);
                    cVar.d();
                    pointF2 = pointF4;
                    break;
                default:
                    cVar.u();
                    cVar.w();
                    break;
            }
        }
        cVar.e();
        return new m7.b(strN, strN2, fH, aVar2, iK, fH2, fH3, iD, iD2, fH4, zG, pointF, pointF2);
    }
}
