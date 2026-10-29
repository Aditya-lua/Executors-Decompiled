package p373q7;

import p404r7.AbstractC10794c;
import p444t7.C11553d;

/* JADX INFO: renamed from: q7.g0 */
/* JADX INFO: loaded from: classes3.dex */
public class C10453g0 implements InterfaceC10467n0<C11553d> {

    /* JADX INFO: renamed from: a */
    public static final C10453g0 f37632a = new C10453g0();

    /* JADX DEBUG: Method merged with bridge method: a(Lr7/c;F)Ljava/lang/Object; */
    @Override // p373q7.InterfaceC10467n0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C11553d mo40192a(AbstractC10794c abstractC10794c, float f10) {
        boolean z10 = abstractC10794c.mo41137o() == AbstractC10794c.b.BEGIN_ARRAY;
        if (z10) {
            abstractC10794c.mo41127b();
        }
        float fMo41133h = (float) abstractC10794c.mo41133h();
        float fMo41133h2 = (float) abstractC10794c.mo41133h();
        while (abstractC10794c.mo41131f()) {
            abstractC10794c.mo41141u();
        }
        if (z10) {
            abstractC10794c.mo41129d();
        }
        return new C11553d((fMo41133h / 100.0f) * f10, (fMo41133h2 / 100.0f) * f10);
    }
}
