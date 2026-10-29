package m7;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class c extends p<n7.d, n7.d> {
    public c(List<t7.a<n7.d>> list) {
        super(e(list));
    }

    public static t7.a<n7.d> d(t7.a<n7.d> aVar) {
        n7.d dVar = aVar.b;
        n7.d dVar2 = aVar.f31671c;
        if (dVar == null || dVar2 == null || dVar.e().length == dVar2.e().length) {
            return aVar;
        }
        float[] fArrF = f(dVar.e(), dVar2.e());
        return aVar.b(dVar.b(fArrF), dVar2.b(fArrF));
    }

    public static List<t7.a<n7.d>> e(List<t7.a<n7.d>> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            list.set(i10, d(list.get(i10)));
        }
        return list;
    }

    public static float[] f(float[] fArr, float[] fArr2) {
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

    @Override // m7.o
    public i7.a<n7.d, n7.d> a() {
        return new i7.e(this.f24039a);
    }

    @Override // m7.p, m7.o
    public /* bridge */ /* synthetic */ List b() {
        return super.b();
    }

    @Override // m7.p, m7.o
    public /* bridge */ /* synthetic */ boolean c() {
        return super.c();
    }

    @Override // m7.p
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
