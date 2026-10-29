package com.google.android.gms.internal.play_billing;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.n4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2586n4 extends AbstractC2475d3 implements RandomAccess, InterfaceC2707y4 {

    /* JADX INFO: renamed from: d */
    public static final float[] f9166d;

    /* JADX INFO: renamed from: b */
    public float[] f9167b;

    /* JADX INFO: renamed from: c */
    public int f9168c;

    static {
        float[] fArr = new float[0];
        f9166d = fArr;
        new C2586n4(fArr, 0, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2586n4() {
        this(f9166d, 0, true);
    }

    /* JADX INFO: renamed from: f */
    private static int m11614f(int i10) {
        return Math.max(((i10 * 3) / 2) + 1, 10);
    }

    /* JADX INFO: renamed from: g */
    private final String m11615g(int i10) {
        return "Index:" + i10 + ", Size:" + this.f9168c;
    }

    /* JADX INFO: renamed from: h */
    private final void m11616h(int i10) {
        if (i10 < 0 || i10 >= this.f9168c) {
            throw new IndexOutOfBoundsException(m11615g(i10));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        float fFloatValue = ((Float) obj).floatValue();
        m11358a();
        if (i10 < 0 || i10 > (i11 = this.f9168c)) {
            throw new IndexOutOfBoundsException(m11615g(i10));
        }
        int i12 = i10 + 1;
        float[] fArr = this.f9167b;
        int length = fArr.length;
        if (i11 < length) {
            System.arraycopy(fArr, i10, fArr, i12, i11 - i10);
        } else {
            float[] fArr2 = new float[m11614f(length)];
            System.arraycopy(this.f9167b, 0, fArr2, 0, i10);
            System.arraycopy(this.f9167b, i10, fArr2, i12, this.f9168c - i10);
            this.f9167b = fArr2;
        }
        this.f9167b[i10] = fFloatValue;
        this.f9168c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2475d3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m11358a();
        collection.getClass();
        if (!(collection instanceof C2586n4)) {
            return super.addAll(collection);
        }
        C2586n4 c2586n4 = (C2586n4) collection;
        int i10 = c2586n4.f9168c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f9168c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        float[] fArr = this.f9167b;
        if (i12 > fArr.length) {
            this.f9167b = Arrays.copyOf(fArr, i12);
        }
        System.arraycopy(c2586n4.f9167b, 0, this.f9167b, this.f9168c, c2586n4.f9168c);
        this.f9168c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final float m11617c(int i10) {
        m11616h(i10);
        return this.f9167b[i10];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* JADX INFO: renamed from: d */
    public final void m11618d(float f10) {
        m11358a();
        int i10 = this.f9168c;
        int length = this.f9167b.length;
        if (i10 == length) {
            float[] fArr = new float[m11614f(length)];
            System.arraycopy(this.f9167b, 0, fArr, 0, this.f9168c);
            this.f9167b = fArr;
        }
        float[] fArr2 = this.f9167b;
        int i11 = this.f9168c;
        this.f9168c = i11 + 1;
        fArr2[i11] = f10;
    }

    /* JADX INFO: renamed from: e */
    public final void m11619e(int i10) {
        int length = this.f9167b.length;
        if (i10 <= length) {
            return;
        }
        if (length == 0) {
            this.f9167b = new float[Math.max(i10, 10)];
            return;
        }
        while (length < i10) {
            length = m11614f(length);
        }
        this.f9167b = Arrays.copyOf(this.f9167b, length);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2475d3, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2586n4)) {
            return super.equals(obj);
        }
        C2586n4 c2586n4 = (C2586n4) obj;
        if (this.f9168c != c2586n4.f9168c) {
            return false;
        }
        float[] fArr = c2586n4.f9167b;
        for (int i10 = 0; i10 < this.f9168c; i10++) {
            if (Float.floatToIntBits(this.f9167b[i10]) != Float.floatToIntBits(fArr[i10])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        m11616h(i10);
        return Float.valueOf(this.f9167b[i10]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i10 = 0; i10 < this.f9168c; i10++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f9167b[i10]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int i10 = this.f9168c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f9167b[i11] == fFloatValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2707y4
    /* JADX INFO: renamed from: r */
    public final /* bridge */ /* synthetic */ InterfaceC2707y4 mo11340r(int i10) {
        if (i10 >= this.f9168c) {
            return new C2586n4(i10 == 0 ? f9166d : Arrays.copyOf(this.f9167b, i10), this.f9168c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2475d3, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        m11358a();
        m11616h(i10);
        float[] fArr = this.f9167b;
        float f10 = fArr[i10];
        int i11 = this.f9168c;
        if (i10 < i11 - 1) {
            System.arraycopy(fArr, i10 + 1, fArr, i10, (i11 - i10) - 1);
        }
        this.f9168c--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        m11358a();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f9167b;
        System.arraycopy(fArr, i11, fArr, i10, this.f9168c - i11);
        this.f9168c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        m11358a();
        m11616h(i10);
        float[] fArr = this.f9167b;
        float f10 = fArr[i10];
        fArr[i10] = fFloatValue;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f9168c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C2586n4(float[] fArr, int i10, boolean z10) {
        super(z10);
        this.f9167b = fArr;
        this.f9168c = i10;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m11618d(((Float) obj).floatValue());
        return true;
    }
}
