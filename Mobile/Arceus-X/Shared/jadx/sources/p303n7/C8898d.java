package p303n7;

import java.util.Arrays;
import p431s7.C11187c;
import p431s7.C11194j;

/* JADX INFO: renamed from: n7.d */
/* JADX INFO: loaded from: classes3.dex */
public class C8898d {

    /* JADX INFO: renamed from: a */
    public final float[] f32417a;

    /* JADX INFO: renamed from: b */
    public final int[] f32418b;

    public C8898d(float[] fArr, int[] iArr) {
        this.f32417a = fArr;
        this.f32418b = iArr;
    }

    /* JADX INFO: renamed from: a */
    public final void m35843a(C8898d c8898d) {
        int i10 = 0;
        while (true) {
            int[] iArr = c8898d.f32418b;
            if (i10 >= iArr.length) {
                return;
            }
            this.f32417a[i10] = c8898d.f32417a[i10];
            this.f32418b[i10] = iArr[i10];
            i10++;
        }
    }

    /* JADX INFO: renamed from: b */
    public C8898d m35844b(float[] fArr) {
        int[] iArr = new int[fArr.length];
        for (int i10 = 0; i10 < fArr.length; i10++) {
            iArr[i10] = m35845c(fArr[i10]);
        }
        return new C8898d(fArr, iArr);
    }

    /* JADX INFO: renamed from: c */
    public final int m35845c(float f10) {
        int iBinarySearch = Arrays.binarySearch(this.f32417a, f10);
        if (iBinarySearch >= 0) {
            return this.f32418b[iBinarySearch];
        }
        int i10 = -(iBinarySearch + 1);
        if (i10 == 0) {
            return this.f32418b[0];
        }
        int[] iArr = this.f32418b;
        if (i10 == iArr.length - 1) {
            return iArr[iArr.length - 1];
        }
        float[] fArr = this.f32417a;
        int i11 = i10 - 1;
        float f11 = fArr[i11];
        return C11187c.m42149c((f10 - f11) / (fArr[i10] - f11), iArr[i11], iArr[i10]);
    }

    /* JADX INFO: renamed from: d */
    public int[] m35846d() {
        return this.f32418b;
    }

    /* JADX INFO: renamed from: e */
    public float[] m35847e() {
        return this.f32417a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C8898d c8898d = (C8898d) obj;
            if (Arrays.equals(this.f32417a, c8898d.f32417a) && Arrays.equals(this.f32418b, c8898d.f32418b)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public int m35848f() {
        return this.f32418b.length;
    }

    /* JADX INFO: renamed from: g */
    public void m35849g(C8898d c8898d, C8898d c8898d2, float f10) {
        int[] iArr;
        if (c8898d.equals(c8898d2)) {
            m35843a(c8898d);
            return;
        }
        if (f10 <= 0.0f) {
            m35843a(c8898d);
            return;
        }
        if (f10 >= 1.0f) {
            m35843a(c8898d2);
            return;
        }
        if (c8898d.f32418b.length != c8898d2.f32418b.length) {
            throw new IllegalArgumentException("Cannot interpolate between gradients. Lengths vary (" + c8898d.f32418b.length + " vs " + c8898d2.f32418b.length + ")");
        }
        int i10 = 0;
        while (true) {
            iArr = c8898d.f32418b;
            if (i10 >= iArr.length) {
                break;
            }
            this.f32417a[i10] = C11194j.m42191i(c8898d.f32417a[i10], c8898d2.f32417a[i10], f10);
            this.f32418b[i10] = C11187c.m42149c(f10, c8898d.f32418b[i10], c8898d2.f32418b[i10]);
            i10++;
        }
        int length = iArr.length;
        while (true) {
            float[] fArr = this.f32417a;
            if (length >= fArr.length) {
                return;
            }
            int[] iArr2 = c8898d.f32418b;
            fArr[length] = fArr[iArr2.length - 1];
            int[] iArr3 = this.f32418b;
            iArr3[length] = iArr3[iArr2.length - 1];
            length++;
        }
    }

    public int hashCode() {
        return (Arrays.hashCode(this.f32417a) * 31) + Arrays.hashCode(this.f32418b);
    }
}
