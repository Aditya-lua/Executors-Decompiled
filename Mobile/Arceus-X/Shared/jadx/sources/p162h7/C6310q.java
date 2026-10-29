package p162h7;

import android.graphics.PointF;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;
import p121f7.C5451h0;
import p189i7.AbstractC6643a;
import p266l7.C8002a;
import p303n7.C8908n;
import p303n7.C8909o;
import p324o7.AbstractC9709b;

/* JADX INFO: renamed from: h7.q */
/* JADX INFO: loaded from: classes3.dex */
public class C6310q implements InterfaceC6312s, AbstractC6643a.b {

    /* JADX INFO: renamed from: a */
    public final C5451h0 f24008a;

    /* JADX INFO: renamed from: b */
    public final String f24009b;

    /* JADX INFO: renamed from: c */
    public final AbstractC6643a<Float, Float> f24010c;

    /* JADX INFO: renamed from: d */
    public C8909o f24011d;

    public C6310q(C5451h0 c5451h0, AbstractC9709b abstractC9709b, C8908n c8908n) {
        this.f24008a = c5451h0;
        this.f24009b = c8908n.m35908c();
        AbstractC6643a<Float, Float> abstractC6643aMo34233a = c8908n.m35907b().mo34233a();
        this.f24010c = abstractC6643aMo34233a;
        abstractC9709b.m38353j(abstractC6643aMo34233a);
        abstractC6643aMo34233a.m28661a(this);
    }

    /* JADX INFO: renamed from: c */
    public static int m27609c(int i10, int i11) {
        int i12 = i10 / i11;
        return ((i10 ^ i11) >= 0 || i11 * i12 == i10) ? i12 : i12 - 1;
    }

    /* JADX INFO: renamed from: f */
    public static int m27610f(int i10, int i11) {
        return i10 - (m27609c(i10, i11) * i11);
    }

    @Override // p189i7.AbstractC6643a.b
    /* JADX INFO: renamed from: a */
    public void mo27575a() {
        this.f24008a.invalidateSelf();
    }

    @Override // p162h7.InterfaceC6296c
    /* JADX INFO: renamed from: b */
    public void mo27576b(List<InterfaceC6296c> list, List<InterfaceC6296c> list2) {
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00a1  */
    @Override // p162h7.InterfaceC6312s
    /* JADX INFO: renamed from: d */
    public C8909o mo27611d(C8909o c8909o) {
        boolean z10;
        List<C8002a> listM35909a = c8909o.m35909a();
        if (listM35909a.size() > 2) {
            float fFloatValue = this.f24010c.mo28668h().floatValue();
            if (fFloatValue != 0.0f) {
                C8909o c8909oM27614j = m27614j(c8909o);
                c8909oM27614j.m35914f(c8909o.m35910b().x, c8909o.m35910b().y);
                List<C8002a> listM35909a2 = c8909oM27614j.m35909a();
                boolean zM35912d = c8909o.m35912d();
                int i10 = 0;
                int i11 = 0;
                while (i10 < listM35909a.size()) {
                    C8002a c8002a = listM35909a.get(i10);
                    C8002a c8002a2 = listM35909a.get(m27610f(i10 - 1, listM35909a.size()));
                    C8002a c8002a3 = listM35909a.get(m27610f(i10 - 2, listM35909a.size()));
                    PointF pointFM33062c = (i10 != 0 || zM35912d) ? c8002a2.m33062c() : c8909o.m35910b();
                    PointF pointFM33061b = (i10 != 0 || zM35912d) ? c8002a2.m33061b() : pointFM33062c;
                    PointF pointFM33060a = c8002a.m33060a();
                    PointF pointFM33062c2 = c8002a3.m33062c();
                    PointF pointFM33062c3 = c8002a.m33062c();
                    if (c8909o.m35912d()) {
                        z10 = false;
                    } else {
                        z10 = true;
                        if (i10 != 0 && i10 != listM35909a.size() - 1) {
                            z10 = false;
                        }
                    }
                    if (pointFM33061b.equals(pointFM33062c) && pointFM33060a.equals(pointFM33062c) && !z10) {
                        float f10 = pointFM33062c.x;
                        float f11 = f10 - pointFM33062c2.x;
                        float f12 = pointFM33062c.y;
                        float f13 = f12 - pointFM33062c2.y;
                        float f14 = pointFM33062c3.x - f10;
                        float f15 = pointFM33062c3.y - f12;
                        float fHypot = (float) Math.hypot(f11, f13);
                        float fHypot2 = (float) Math.hypot(f14, f15);
                        float fMin = Math.min(fFloatValue / fHypot, 0.5f);
                        float fMin2 = Math.min(fFloatValue / fHypot2, 0.5f);
                        float f16 = pointFM33062c.x;
                        float f17 = ((pointFM33062c2.x - f16) * fMin) + f16;
                        float f18 = pointFM33062c.y;
                        float f19 = ((pointFM33062c2.y - f18) * fMin) + f18;
                        float f20 = ((pointFM33062c3.x - f16) * fMin2) + f16;
                        float f21 = ((pointFM33062c3.y - f18) * fMin2) + f18;
                        float f22 = f17 - ((f17 - f16) * 0.5519f);
                        float f23 = f19 - ((f19 - f18) * 0.5519f);
                        float f24 = f20 - ((f20 - f16) * 0.5519f);
                        float f25 = f21 - ((f21 - f18) * 0.5519f);
                        C8002a c8002a4 = listM35909a2.get(m27610f(i11 - 1, listM35909a2.size()));
                        C8002a c8002a5 = listM35909a2.get(i11);
                        c8002a4.m33064e(f17, f19);
                        c8002a4.m33065f(f17, f19);
                        if (i10 == 0) {
                            c8909oM27614j.m35914f(f17, f19);
                        }
                        c8002a5.m33063d(f22, f23);
                        C8002a c8002a6 = listM35909a2.get(i11 + 1);
                        c8002a5.m33064e(f24, f25);
                        c8002a5.m33065f(f20, f21);
                        c8002a6.m33063d(f20, f21);
                        i11 += 2;
                    } else {
                        C8002a c8002a7 = listM35909a2.get(m27610f(i11 - 1, listM35909a2.size()));
                        C8002a c8002a8 = listM35909a2.get(i11);
                        c8002a7.m33064e(c8002a2.m33061b().x, c8002a2.m33061b().y);
                        c8002a7.m33065f(c8002a2.m33062c().x, c8002a2.m33062c().y);
                        c8002a8.m33063d(c8002a.m33060a().x, c8002a.m33060a().y);
                        i11++;
                    }
                    i10++;
                    listM35909a = listM35909a;
                }
                return c8909oM27614j;
            }
        }
        return c8909o;
    }

    @Override // p162h7.InterfaceC6312s
    /* JADX INFO: renamed from: g */
    public void mo27612g(AbstractC6643a.b bVar) {
        this.f24010c.m28661a(bVar);
    }

    /* JADX INFO: renamed from: h */
    public AbstractC6643a<Float, Float> m27613h() {
        return this.f24010c;
    }

    @NonNull
    /* JADX INFO: renamed from: j */
    public final C8909o m27614j(C8909o c8909o) {
        List<C8002a> listM35909a = c8909o.m35909a();
        boolean zM35912d = c8909o.m35912d();
        int size = listM35909a.size() - 1;
        int i10 = 0;
        while (size >= 0) {
            C8002a c8002a = listM35909a.get(size);
            C8002a c8002a2 = listM35909a.get(m27610f(size - 1, listM35909a.size()));
            PointF pointFM33062c = (size != 0 || zM35912d) ? c8002a2.m33062c() : c8909o.m35910b();
            i10 = (((size != 0 || zM35912d) ? c8002a2.m33061b() : pointFM33062c).equals(pointFM33062c) && c8002a.m33060a().equals(pointFM33062c) && !(!c8909o.m35912d() && (size == 0 || size == listM35909a.size() - 1))) ? i10 + 2 : i10 + 1;
            size--;
        }
        C8909o c8909o2 = this.f24011d;
        if (c8909o2 == null || c8909o2.m35909a().size() != i10) {
            ArrayList arrayList = new ArrayList(i10);
            for (int i11 = 0; i11 < i10; i11++) {
                arrayList.add(new C8002a());
            }
            this.f24011d = new C8909o(new PointF(0.0f, 0.0f), false, arrayList);
        }
        this.f24011d.m35913e(zM35912d);
        return this.f24011d;
    }
}
