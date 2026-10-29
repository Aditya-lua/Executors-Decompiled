package p373q7;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p303n7.C8898d;
import p404r7.AbstractC10794c;
import p431s7.C11187c;
import p431s7.C11194j;

/* JADX INFO: renamed from: q7.o */
/* JADX INFO: loaded from: classes3.dex */
public class C10468o implements InterfaceC10467n0<C8898d> {

    /* JADX INFO: renamed from: a */
    public int f37660a;

    public C10468o(int i10) {
        this.f37660a = i10;
    }

    /* JADX INFO: renamed from: e */
    public static float[] m40243e(float[] fArr, float[] fArr2) {
        if (fArr.length == 0) {
            return fArr2;
        }
        if (fArr2.length == 0) {
            return fArr;
        }
        int length = fArr.length + fArr2.length;
        float[] fArr3 = new float[length];
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13++) {
            float f10 = i11 < fArr.length ? fArr[i11] : Float.NaN;
            float f11 = i12 < fArr2.length ? fArr2[i12] : Float.NaN;
            if (Float.isNaN(f11) || f10 < f11) {
                fArr3[i13] = f10;
                i11++;
            } else if (Float.isNaN(f10) || f11 < f10) {
                fArr3[i13] = f11;
                i12++;
            } else {
                fArr3[i13] = f10;
                i11++;
                i12++;
                i10++;
            }
        }
        return i10 == 0 ? fArr3 : Arrays.copyOf(fArr3, length - i10);
    }

    /* JADX INFO: renamed from: b */
    public final C8898d m40244b(C8898d c8898d, List<Float> list) {
        int i10 = this.f37660a * 4;
        if (list.size() <= i10) {
            return c8898d;
        }
        float[] fArrM35847e = c8898d.m35847e();
        int[] iArrM35846d = c8898d.m35846d();
        int size = (list.size() - i10) / 2;
        float[] fArr = new float[size];
        float[] fArr2 = new float[size];
        int i11 = 0;
        while (i10 < list.size()) {
            if (i10 % 2 == 0) {
                fArr[i11] = list.get(i10).floatValue();
            } else {
                fArr2[i11] = list.get(i10).floatValue();
                i11++;
            }
            i10++;
        }
        float[] fArrM40243e = m40243e(c8898d.m35847e(), fArr);
        int length = fArrM40243e.length;
        int[] iArr = new int[length];
        for (int i12 = 0; i12 < length; i12++) {
            float f10 = fArrM40243e[i12];
            int iBinarySearch = Arrays.binarySearch(fArrM35847e, f10);
            int iBinarySearch2 = Arrays.binarySearch(fArr, f10);
            if (iBinarySearch < 0 || iBinarySearch2 > 0) {
                if (iBinarySearch2 < 0) {
                    iBinarySearch2 = -(iBinarySearch2 + 1);
                }
                iArr[i12] = m40245c(f10, fArr2[iBinarySearch2], fArrM35847e, iArrM35846d);
            } else {
                iArr[i12] = m40246d(f10, iArrM35846d[iBinarySearch], fArr, fArr2);
            }
        }
        return new C8898d(fArrM40243e, iArr);
    }

    /* JADX INFO: renamed from: c */
    public int m40245c(float f10, float f11, float[] fArr, int[] iArr) {
        if (iArr.length < 2 || f10 == fArr[0]) {
            return iArr[0];
        }
        for (int i10 = 1; i10 < fArr.length; i10++) {
            float f12 = fArr[i10];
            if (f12 >= f10 || i10 == fArr.length - 1) {
                if (i10 == fArr.length - 1 && f10 >= f12) {
                    return Color.argb((int) (f11 * 255.0f), Color.red(iArr[i10]), Color.green(iArr[i10]), Color.blue(iArr[i10]));
                }
                int i11 = i10 - 1;
                float f13 = fArr[i11];
                int iM42149c = C11187c.m42149c((f10 - f13) / (f12 - f13), iArr[i11], iArr[i10]);
                return Color.argb((int) (f11 * 255.0f), Color.red(iM42149c), Color.green(iM42149c), Color.blue(iM42149c));
            }
        }
        throw new IllegalArgumentException("Unreachable code.");
    }

    /* JADX INFO: renamed from: d */
    public final int m40246d(float f10, int i10, float[] fArr, float[] fArr2) {
        float fM42191i;
        if (fArr2.length < 2 || f10 <= fArr[0]) {
            return Color.argb((int) (fArr2[0] * 255.0f), Color.red(i10), Color.green(i10), Color.blue(i10));
        }
        for (int i11 = 1; i11 < fArr.length; i11++) {
            float f11 = fArr[i11];
            if (f11 >= f10 || i11 == fArr.length - 1) {
                if (f11 <= f10) {
                    fM42191i = fArr2[i11];
                } else {
                    int i12 = i11 - 1;
                    float f12 = fArr[i12];
                    fM42191i = C11194j.m42191i(fArr2[i12], fArr2[i11], (f10 - f12) / (f11 - f12));
                }
                return Color.argb((int) (fM42191i * 255.0f), Color.red(i10), Color.green(i10), Color.blue(i10));
            }
        }
        throw new IllegalArgumentException("Unreachable code.");
    }

    /* JADX DEBUG: Method merged with bridge method: a(Lr7/c;F)Ljava/lang/Object; */
    /* JADX WARN: Code duplicated, block: B:38:0x00cf  */
    @Override // p373q7.InterfaceC10467n0
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public C8898d mo40192a(AbstractC10794c abstractC10794c, float f10) {
        ArrayList arrayList = new ArrayList();
        boolean z10 = abstractC10794c.mo41137o() == AbstractC10794c.b.BEGIN_ARRAY;
        if (z10) {
            abstractC10794c.mo41127b();
        }
        while (abstractC10794c.mo41131f()) {
            arrayList.add(Float.valueOf((float) abstractC10794c.mo41133h()));
        }
        if (arrayList.size() == 4 && arrayList.get(0).floatValue() == 1.0f) {
            arrayList.set(0, Float.valueOf(0.0f));
            arrayList.add(Float.valueOf(1.0f));
            arrayList.add(arrayList.get(1));
            arrayList.add(arrayList.get(2));
            arrayList.add(arrayList.get(3));
            this.f37660a = 2;
        }
        if (z10) {
            abstractC10794c.mo41129d();
        }
        if (this.f37660a == -1) {
            this.f37660a = arrayList.size() / 4;
        }
        int i10 = this.f37660a;
        float[] fArr = new float[i10];
        int[] iArr = new int[i10];
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < this.f37660a * 4; i13++) {
            int i14 = i13 / 4;
            double dFloatValue = arrayList.get(i13).floatValue();
            int i15 = i13 % 4;
            if (i15 != 0) {
                if (i15 == 1) {
                    i11 = (int) (dFloatValue * 255.0d);
                } else if (i15 == 2) {
                    i12 = (int) (dFloatValue * 255.0d);
                } else if (i15 == 3) {
                    iArr[i14] = Color.argb(255, i11, i12, (int) (dFloatValue * 255.0d));
                }
            } else if (i14 > 0) {
                float f11 = (float) dFloatValue;
                if (fArr[i14 - 1] >= f11) {
                    fArr[i14] = f11 + 0.01f;
                } else {
                    fArr[i14] = (float) dFloatValue;
                }
            } else {
                fArr[i14] = (float) dFloatValue;
            }
        }
        return m40244b(new C8898d(fArr, iArr), arrayList);
    }
}
