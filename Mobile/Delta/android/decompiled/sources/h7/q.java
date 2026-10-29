package h7;

import android.graphics.PointF;
import androidx.annotation.NonNull;
import f7.h0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class q implements s, i7.a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f18696a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i7.a<Float, Float> f18697c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public n7.o f18698d;

    public q(h0 h0Var, o7.b bVar, n7.n nVar) {
        this.f18696a = h0Var;
        this.b = nVar.c();
        i7.a<Float, Float> aVarA = nVar.b().a();
        this.f18697c = aVarA;
        bVar.j(aVarA);
        aVarA.a(this);
    }

    public static int c(int i10, int i11) {
        int i12 = i10 / i11;
        return ((i10 ^ i11) >= 0 || i11 * i12 == i10) ? i12 : i12 - 1;
    }

    public static int f(int i10, int i11) {
        return i10 - (c(i10, i11) * i11);
    }

    @Override // i7.a.b
    public void a() {
        this.f18696a.invalidateSelf();
    }

    @Override // h7.c
    public void b(List<c> list, List<c> list2) {
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00a1  */
    @Override // h7.s
    public n7.o d(n7.o oVar) {
        boolean z10;
        List<l7.a> listA = oVar.a();
        if (listA.size() > 2) {
            float fFloatValue = this.f18697c.h().floatValue();
            if (fFloatValue != 0.0f) {
                n7.o oVarJ = j(oVar);
                oVarJ.f(oVar.b().x, oVar.b().y);
                List<l7.a> listA2 = oVarJ.a();
                boolean zD = oVar.d();
                int i10 = 0;
                int i11 = 0;
                while (i10 < listA.size()) {
                    l7.a aVar = listA.get(i10);
                    l7.a aVar2 = listA.get(f(i10 - 1, listA.size()));
                    l7.a aVar3 = listA.get(f(i10 - 2, listA.size()));
                    PointF pointFC = (i10 != 0 || zD) ? aVar2.c() : oVar.b();
                    PointF pointFB = (i10 != 0 || zD) ? aVar2.b() : pointFC;
                    PointF pointFA = aVar.a();
                    PointF pointFC2 = aVar3.c();
                    PointF pointFC3 = aVar.c();
                    if (oVar.d()) {
                        z10 = false;
                    } else {
                        z10 = true;
                        if (i10 != 0 && i10 != listA.size() - 1) {
                            z10 = false;
                        }
                    }
                    if (pointFB.equals(pointFC) && pointFA.equals(pointFC) && !z10) {
                        float f10 = pointFC.x;
                        float f11 = f10 - pointFC2.x;
                        float f12 = pointFC.y;
                        float f13 = f12 - pointFC2.y;
                        float f14 = pointFC3.x - f10;
                        float f15 = pointFC3.y - f12;
                        float fHypot = (float) Math.hypot(f11, f13);
                        float fHypot2 = (float) Math.hypot(f14, f15);
                        float fMin = Math.min(fFloatValue / fHypot, 0.5f);
                        float fMin2 = Math.min(fFloatValue / fHypot2, 0.5f);
                        float f16 = pointFC.x;
                        float f17 = ((pointFC2.x - f16) * fMin) + f16;
                        float f18 = pointFC.y;
                        float f19 = ((pointFC2.y - f18) * fMin) + f18;
                        float f20 = ((pointFC3.x - f16) * fMin2) + f16;
                        float f21 = ((pointFC3.y - f18) * fMin2) + f18;
                        float f22 = f17 - ((f17 - f16) * 0.5519f);
                        float f23 = f19 - ((f19 - f18) * 0.5519f);
                        float f24 = f20 - ((f20 - f16) * 0.5519f);
                        float f25 = f21 - ((f21 - f18) * 0.5519f);
                        l7.a aVar4 = listA2.get(f(i11 - 1, listA2.size()));
                        l7.a aVar5 = listA2.get(i11);
                        aVar4.e(f17, f19);
                        aVar4.f(f17, f19);
                        if (i10 == 0) {
                            oVarJ.f(f17, f19);
                        }
                        aVar5.d(f22, f23);
                        l7.a aVar6 = listA2.get(i11 + 1);
                        aVar5.e(f24, f25);
                        aVar5.f(f20, f21);
                        aVar6.d(f20, f21);
                        i11 += 2;
                    } else {
                        l7.a aVar7 = listA2.get(f(i11 - 1, listA2.size()));
                        l7.a aVar8 = listA2.get(i11);
                        aVar7.e(aVar2.b().x, aVar2.b().y);
                        aVar7.f(aVar2.c().x, aVar2.c().y);
                        aVar8.d(aVar.a().x, aVar.a().y);
                        i11++;
                    }
                    i10++;
                    listA = listA;
                }
                return oVarJ;
            }
        }
        return oVar;
    }

    @Override // h7.s
    public void g(i7.a.b bVar) {
        this.f18697c.a(bVar);
    }

    public i7.a<Float, Float> h() {
        return this.f18697c;
    }

    @NonNull
    public final n7.o j(n7.o oVar) {
        List<l7.a> listA = oVar.a();
        boolean zD = oVar.d();
        int size = listA.size() - 1;
        int i10 = 0;
        while (size >= 0) {
            l7.a aVar = listA.get(size);
            l7.a aVar2 = listA.get(f(size - 1, listA.size()));
            PointF pointFC = (size != 0 || zD) ? aVar2.c() : oVar.b();
            i10 = (((size != 0 || zD) ? aVar2.b() : pointFC).equals(pointFC) && aVar.a().equals(pointFC) && !(!oVar.d() && (size == 0 || size == listA.size() - 1))) ? i10 + 2 : i10 + 1;
            size--;
        }
        n7.o oVar2 = this.f18698d;
        if (oVar2 == null || oVar2.a().size() != i10) {
            ArrayList arrayList = new ArrayList(i10);
            for (int i11 = 0; i11 < i10; i11++) {
                arrayList.add(new l7.a());
            }
            this.f18698d = new n7.o(new PointF(0.0f, 0.0f), false, arrayList);
        }
        this.f18698d.e(zD);
        return this.f18698d;
    }
}
