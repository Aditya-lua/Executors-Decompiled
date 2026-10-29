package p373q7;

import android.graphics.Color;
import p404r7.AbstractC10794c;

/* JADX INFO: renamed from: q7.g */
/* JADX INFO: loaded from: classes3.dex */
public class C10452g implements InterfaceC10467n0<Integer> {

    /* JADX INFO: renamed from: a */
    public static final C10452g f37631a = new C10452g();

    /* JADX DEBUG: Method merged with bridge method: a(Lr7/c;F)Ljava/lang/Object; */
    @Override // p373q7.InterfaceC10467n0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Integer mo40192a(AbstractC10794c abstractC10794c, float f10) {
        boolean z10 = abstractC10794c.mo41137o() == AbstractC10794c.b.BEGIN_ARRAY;
        if (z10) {
            abstractC10794c.mo41127b();
        }
        double dMo41133h = abstractC10794c.mo41133h();
        double dMo41133h2 = abstractC10794c.mo41133h();
        double dMo41133h3 = abstractC10794c.mo41133h();
        double dMo41133h4 = abstractC10794c.mo41137o() == AbstractC10794c.b.NUMBER ? abstractC10794c.mo41133h() : 1.0d;
        if (z10) {
            abstractC10794c.mo41129d();
        }
        if (dMo41133h <= 1.0d && dMo41133h2 <= 1.0d && dMo41133h3 <= 1.0d) {
            dMo41133h *= 255.0d;
            dMo41133h2 *= 255.0d;
            dMo41133h3 *= 255.0d;
            if (dMo41133h4 <= 1.0d) {
                dMo41133h4 *= 255.0d;
            }
        }
        return Integer.valueOf(Color.argb((int) dMo41133h4, (int) dMo41133h, (int) dMo41133h2, (int) dMo41133h3));
    }
}
