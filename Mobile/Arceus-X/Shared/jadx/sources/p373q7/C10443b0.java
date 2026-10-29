package p373q7;

import android.graphics.PointF;
import p404r7.AbstractC10794c;

/* JADX INFO: renamed from: q7.b0 */
/* JADX INFO: loaded from: classes3.dex */
public class C10443b0 implements InterfaceC10467n0<PointF> {

    /* JADX INFO: renamed from: a */
    public static final C10443b0 f37621a = new C10443b0();

    /* JADX DEBUG: Method merged with bridge method: a(Lr7/c;F)Ljava/lang/Object; */
    @Override // p373q7.InterfaceC10467n0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public PointF mo40192a(AbstractC10794c abstractC10794c, float f10) {
        AbstractC10794c.b bVarMo41137o = abstractC10794c.mo41137o();
        if (bVarMo41137o != AbstractC10794c.b.BEGIN_ARRAY && bVarMo41137o != AbstractC10794c.b.BEGIN_OBJECT) {
            if (bVarMo41137o == AbstractC10794c.b.NUMBER) {
                PointF pointF = new PointF(((float) abstractC10794c.mo41133h()) * f10, ((float) abstractC10794c.mo41133h()) * f10);
                while (abstractC10794c.mo41131f()) {
                    abstractC10794c.mo41141u();
                }
                return pointF;
            }
            throw new IllegalArgumentException("Cannot convert json to point. Next token is " + bVarMo41137o);
        }
        return C10472s.m40255e(abstractC10794c, f10);
    }
}
