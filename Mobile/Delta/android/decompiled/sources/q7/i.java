package q7;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes3.dex */
public class i implements n0<l7.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f29244a = new i();
    public static final r7.c.a b = r7.c.a.a("t", "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of", "ps", "sz");

    @Override // q7.n0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public l7.b a(r7.c cVar, float f10) {
        l7.b.a aVar = l7.b.a.CENTER;
        cVar.c();
        l7.b.a aVar2 = aVar;
        String strM = null;
        String strM2 = null;
        PointF pointF = null;
        PointF pointF2 = null;
        float fH = 0.0f;
        float fH2 = 0.0f;
        float fH3 = 0.0f;
        float fH4 = 0.0f;
        int iJ = 0;
        int iD = 0;
        int iD2 = 0;
        boolean zG = true;
        while (cVar.f()) {
            switch (cVar.r(b)) {
                case 0:
                    strM = cVar.m();
                    break;
                case 1:
                    strM2 = cVar.m();
                    break;
                case 2:
                    fH = (float) cVar.h();
                    break;
                case 3:
                    int iJ2 = cVar.j();
                    aVar2 = l7.b.a.CENTER;
                    if (iJ2 <= aVar2.ordinal() && iJ2 >= 0) {
                        aVar2 = l7.b.a.values()[iJ2];
                    }
                    break;
                case 4:
                    iJ = cVar.j();
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
                    cVar.s();
                    cVar.u();
                    break;
            }
        }
        cVar.e();
        return new l7.b(strM, strM2, fH, aVar2, iJ, fH2, fH3, iD, iD2, fH4, zG, pointF, pointF2);
    }
}
