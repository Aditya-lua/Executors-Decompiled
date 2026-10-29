package n7;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f25119a;
    public final int[] b;

    public d(float[] fArr, int[] iArr) {
        this.f25119a = fArr;
        this.b = iArr;
    }

    public final void a(d dVar) {
        int i10 = 0;
        while (true) {
            int[] iArr = dVar.b;
            if (i10 >= iArr.length) {
                return;
            }
            this.f25119a[i10] = dVar.f25119a[i10];
            this.b[i10] = iArr[i10];
            i10++;
        }
    }

    public d b(float[] fArr) {
        int[] iArr = new int[fArr.length];
        for (int i10 = 0; i10 < fArr.length; i10++) {
            iArr[i10] = c(fArr[i10]);
        }
        return new d(fArr, iArr);
    }

    public final int c(float f10) {
        int iBinarySearch = Arrays.binarySearch(this.f25119a, f10);
        if (iBinarySearch >= 0) {
            return this.b[iBinarySearch];
        }
        int i10 = -(iBinarySearch + 1);
        if (i10 == 0) {
            return this.b[0];
        }
        int[] iArr = this.b;
        if (i10 == iArr.length - 1) {
            return iArr[iArr.length - 1];
        }
        float[] fArr = this.f25119a;
        int i11 = i10 - 1;
        float f11 = fArr[i11];
        return s7.c.c((f10 - f11) / (fArr[i10] - f11), iArr[i11], iArr[i10]);
    }

    public int[] d() {
        return this.b;
    }

    public float[] e() {
        return this.f25119a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            d dVar = (d) obj;
            if (Arrays.equals(this.f25119a, dVar.f25119a) && Arrays.equals(this.b, dVar.b)) {
                return true;
            }
        }
        return false;
    }

    public int f() {
        return this.b.length;
    }

    public void g(d dVar, d dVar2, float f10) {
        int[] iArr;
        if (dVar.equals(dVar2)) {
            a(dVar);
            return;
        }
        if (f10 <= 0.0f) {
            a(dVar);
            return;
        }
        if (f10 >= 1.0f) {
            a(dVar2);
            return;
        }
        if (dVar.b.length != dVar2.b.length) {
            throw new IllegalArgumentException("Cannot interpolate between gradients. Lengths vary (" + dVar.b.length + " vs " + dVar2.b.length + ")");
        }
        int i10 = 0;
        while (true) {
            iArr = dVar.b;
            if (i10 >= iArr.length) {
                break;
            }
            this.f25119a[i10] = s7.j.i(dVar.f25119a[i10], dVar2.f25119a[i10], f10);
            this.b[i10] = s7.c.c(f10, dVar.b[i10], dVar2.b[i10]);
            i10++;
        }
        int length = iArr.length;
        while (true) {
            float[] fArr = this.f25119a;
            if (length >= fArr.length) {
                return;
            }
            int[] iArr2 = dVar.b;
            fArr[length] = fArr[iArr2.length - 1];
            int[] iArr3 = this.b;
            iArr3[length] = iArr3[iArr2.length - 1];
            length++;
        }
    }

    public int hashCode() {
        return (Arrays.hashCode(this.f25119a) * 31) + Arrays.hashCode(this.b);
    }
}
