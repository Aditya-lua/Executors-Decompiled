package p288m7;

import java.util.Arrays;
import java.util.List;
import p189i7.AbstractC6643a;
import p189i7.C6647e;
import p303n7.C8898d;
import p444t7.C11550a;

/* JADX INFO: renamed from: m7.c */
/* JADX INFO: loaded from: classes3.dex */
public class C8455c extends AbstractC8468p<C8898d, C8898d> {
    public C8455c(List<C11550a<C8898d>> list) {
        super(m34238e(list));
    }

    /* JADX INFO: renamed from: d */
    public static C11550a<C8898d> m34237d(C11550a<C8898d> c11550a) {
        C8898d c8898d = c11550a.f40889b;
        C8898d c8898d2 = c11550a.f40890c;
        if (c8898d == null || c8898d2 == null || c8898d.m35847e().length == c8898d2.m35847e().length) {
            return c11550a;
        }
        float[] fArrM34239f = m34239f(c8898d.m35847e(), c8898d2.m35847e());
        return c11550a.m43179b(c8898d.m35844b(fArrM34239f), c8898d2.m35844b(fArrM34239f));
    }

    /* JADX INFO: renamed from: e */
    public static List<C11550a<C8898d>> m34238e(List<C11550a<C8898d>> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            list.set(i10, m34237d(list.get(i10)));
        }
        return list;
    }

    /* JADX INFO: renamed from: f */
    public static float[] m34239f(float[] fArr, float[] fArr2) {
        int length = fArr.length + fArr2.length;
        float[] fArr3 = new float[length];
        System.arraycopy(fArr, 0, fArr3, 0, fArr.length);
        System.arraycopy(fArr2, 0, fArr3, fArr.length, fArr2.length);
        Arrays.sort(fArr3);
        float f10 = Float.NaN;
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            float f11 = fArr3[i11];
            if (f11 != f10) {
                fArr3[i10] = f11;
                i10++;
                f10 = fArr3[i11];
            }
        }
        return Arrays.copyOfRange(fArr3, 0, i10);
    }

    @Override // p288m7.InterfaceC8467o
    /* JADX INFO: renamed from: a */
    public AbstractC6643a<C8898d, C8898d> mo34233a() {
        return new C6647e(this.f31179a);
    }

    @Override // p288m7.AbstractC8468p, p288m7.InterfaceC8467o
    /* JADX INFO: renamed from: b */
    public /* bridge */ /* synthetic */ List mo34234b() {
        return super.mo34234b();
    }

    @Override // p288m7.AbstractC8468p, p288m7.InterfaceC8467o
    /* JADX INFO: renamed from: c */
    public /* bridge */ /* synthetic */ boolean mo34235c() {
        return super.mo34235c();
    }

    @Override // p288m7.AbstractC8468p
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
