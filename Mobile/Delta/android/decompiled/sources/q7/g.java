package q7;

import android.graphics.Color;

/* JADX INFO: loaded from: classes3.dex */
public class g implements n0<Integer> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f29240a = new g();

    @Override // q7.n0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Integer a(r7.c cVar, float f10) {
        boolean z10 = cVar.o() == r7.c.b.BEGIN_ARRAY;
        if (z10) {
            cVar.b();
        }
        double dH = cVar.h();
        double dH2 = cVar.h();
        double dH3 = cVar.h();
        double dH4 = cVar.o() == r7.c.b.NUMBER ? cVar.h() : 1.0d;
        if (z10) {
            cVar.d();
        }
        if (dH <= 1.0d && dH2 <= 1.0d && dH3 <= 1.0d) {
            dH *= 255.0d;
            dH2 *= 255.0d;
            dH3 *= 255.0d;
            if (dH4 <= 1.0d) {
                dH4 *= 255.0d;
            }
        }
        return Integer.valueOf(Color.argb((int) dH4, (int) dH, (int) dH2, (int) dH3));
    }
}
