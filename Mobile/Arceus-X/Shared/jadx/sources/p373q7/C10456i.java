package p373q7;

import android.graphics.PointF;
import p266l7.C8003b;
import p404r7.AbstractC10794c;

/* JADX INFO: renamed from: q7.i */
/* JADX INFO: loaded from: classes3.dex */
public class C10456i implements InterfaceC10467n0<C8003b> {

    /* JADX INFO: renamed from: a */
    public static final C10456i f37636a = new C10456i();

    /* JADX INFO: renamed from: b */
    public static final AbstractC10794c.a f37637b = AbstractC10794c.a.m41143a("t", "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of", "ps", "sz");

    /* JADX DEBUG: Method merged with bridge method: a(Lr7/c;F)Ljava/lang/Object; */
    @Override // p373q7.InterfaceC10467n0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C8003b mo40192a(AbstractC10794c abstractC10794c, float f10) {
        C8003b.a aVar = C8003b.a.CENTER;
        abstractC10794c.mo41128c();
        C8003b.a aVar2 = aVar;
        String strMo41136m = null;
        String strMo41136m2 = null;
        PointF pointF = null;
        PointF pointF2 = null;
        float fMo41133h = 0.0f;
        float fMo41133h2 = 0.0f;
        float fMo41133h3 = 0.0f;
        float fMo41133h4 = 0.0f;
        int iMo41134j = 0;
        int iM40254d = 0;
        int iM40254d2 = 0;
        boolean zMo41132g = true;
        while (abstractC10794c.mo41131f()) {
            switch (abstractC10794c.mo41139r(f37637b)) {
                case 0:
                    strMo41136m = abstractC10794c.mo41136m();
                    break;
                case 1:
                    strMo41136m2 = abstractC10794c.mo41136m();
                    break;
                case 2:
                    fMo41133h = (float) abstractC10794c.mo41133h();
                    break;
                case 3:
                    int iMo41134j2 = abstractC10794c.mo41134j();
                    aVar2 = C8003b.a.CENTER;
                    if (iMo41134j2 <= aVar2.ordinal() && iMo41134j2 >= 0) {
                        aVar2 = C8003b.a.values()[iMo41134j2];
                    }
                    break;
                case 4:
                    iMo41134j = abstractC10794c.mo41134j();
                    break;
                case 5:
                    fMo41133h2 = (float) abstractC10794c.mo41133h();
                    break;
                case 6:
                    fMo41133h3 = (float) abstractC10794c.mo41133h();
                    break;
                case 7:
                    iM40254d = C10472s.m40254d(abstractC10794c);
                    break;
                case 8:
                    iM40254d2 = C10472s.m40254d(abstractC10794c);
                    break;
                case 9:
                    fMo41133h4 = (float) abstractC10794c.mo41133h();
                    break;
                case 10:
                    zMo41132g = abstractC10794c.mo41132g();
                    break;
                case 11:
                    abstractC10794c.mo41127b();
                    PointF pointF3 = new PointF(((float) abstractC10794c.mo41133h()) * f10, ((float) abstractC10794c.mo41133h()) * f10);
                    abstractC10794c.mo41129d();
                    pointF = pointF3;
                    break;
                case 12:
                    abstractC10794c.mo41127b();
                    PointF pointF4 = new PointF(((float) abstractC10794c.mo41133h()) * f10, ((float) abstractC10794c.mo41133h()) * f10);
                    abstractC10794c.mo41129d();
                    pointF2 = pointF4;
                    break;
                default:
                    abstractC10794c.mo41140s();
                    abstractC10794c.mo41141u();
                    break;
            }
        }
        abstractC10794c.mo41130e();
        return new C8003b(strMo41136m, strMo41136m2, fMo41133h, aVar2, iMo41134j, fMo41133h2, fMo41133h3, iM40254d, iM40254d2, fMo41133h4, zMo41132g, pointF, pointF2);
    }
}
