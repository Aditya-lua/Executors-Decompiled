package com.google.android.gms.internal.play_billing;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.c4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2465c4 extends AbstractC2475d3 implements RandomAccess, InterfaceC2707y4 {

    /* JADX INFO: renamed from: d */
    public static final double[] f8943d;

    /* JADX INFO: renamed from: b */
    public double[] f8944b;

    /* JADX INFO: renamed from: c */
    public int f8945c;

    static {
        double[] dArr = new double[0];
        f8943d = dArr;
        new C2465c4(dArr, 0, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2465c4() {
        this(f8943d, 0, true);
    }

    /* JADX INFO: renamed from: f */
    public static int m11334f(int i10) {
        return Math.max(((i10 * 3) / 2) + 1, 10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        double dDoubleValue = ((Double) obj).doubleValue();
        m11358a();
        if (i10 < 0 || i10 > (i11 = this.f8945c)) {
            throw new IndexOutOfBoundsException(m11338g(i10));
        }
        int i12 = i10 + 1;
        double[] dArr = this.f8944b;
        int length = dArr.length;
        if (i11 < length) {
            System.arraycopy(dArr, i10, dArr, i12, i11 - i10);
        } else {
            double[] dArr2 = new double[m11334f(length)];
            System.arraycopy(this.f8944b, 0, dArr2, 0, i10);
            System.arraycopy(this.f8944b, i10, dArr2, i12, this.f8945c - i10);
            this.f8944b = dArr2;
        }
        this.f8944b[i10] = dDoubleValue;
        this.f8945c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2475d3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m11358a();
        collection.getClass();
        if (!(collection instanceof C2465c4)) {
            return super.addAll(collection);
        }
        C2465c4 c2465c4 = (C2465c4) collection;
        int i10 = c2465c4.f8945c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f8945c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        double[] dArr = this.f8944b;
        if (i12 > dArr.length) {
            this.f8944b = Arrays.copyOf(dArr, i12);
        }
        System.arraycopy(c2465c4.f8944b, 0, this.f8944b, this.f8945c, c2465c4.f8945c);
        this.f8945c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final double m11335c(int i10) {
        m11339h(i10);
        return this.f8944b[i10];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* JADX INFO: renamed from: d */
    public final void m11336d(double d10) {
        m11358a();
        int i10 = this.f8945c;
        int length = this.f8944b.length;
        if (i10 == length) {
            double[] dArr = new double[m11334f(length)];
            System.arraycopy(this.f8944b, 0, dArr, 0, this.f8945c);
            this.f8944b = dArr;
        }
        double[] dArr2 = this.f8944b;
        int i11 = this.f8945c;
        this.f8945c = i11 + 1;
        dArr2[i11] = d10;
    }

    /* JADX INFO: renamed from: e */
    public final void m11337e(int i10) {
        int length = this.f8944b.length;
        if (i10 <= length) {
            return;
        }
        if (length == 0) {
            this.f8944b = new double[Math.max(i10, 10)];
            return;
        }
        while (length < i10) {
            length = m11334f(length);
        }
        this.f8944b = Arrays.copyOf(this.f8944b, length);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2475d3, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2465c4)) {
            return super.equals(obj);
        }
        C2465c4 c2465c4 = (C2465c4) obj;
        if (this.f8945c != c2465c4.f8945c) {
            return false;
        }
        double[] dArr = c2465c4.f8944b;
        for (int i10 = 0; i10 < this.f8945c; i10++) {
            if (Double.doubleToLongBits(this.f8944b[i10]) != Double.doubleToLongBits(dArr[i10])) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    public final String m11338g(int i10) {
        return "Index:" + i10 + ", Size:" + this.f8945c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        m11339h(i10);
        return Double.valueOf(this.f8944b[i10]);
    }

    /* JADX INFO: renamed from: h */
    public final void m11339h(int i10) {
        if (i10 < 0 || i10 >= this.f8945c) {
            throw new IndexOutOfBoundsException(m11338g(i10));
        }
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f8945c; i11++) {
            long jDoubleToLongBits = Double.doubleToLongBits(this.f8944b[i11]);
            byte[] bArr = C2718z4.f9432a;
            i10 = (i10 * 31) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int i10 = this.f8945c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f8944b[i11] == dDoubleValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2707y4
    /* JADX INFO: renamed from: r */
    public final /* bridge */ /* synthetic */ InterfaceC2707y4 mo11340r(int i10) {
        if (i10 >= this.f8945c) {
            return new C2465c4(i10 == 0 ? f8943d : Arrays.copyOf(this.f8944b, i10), this.f8945c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2475d3, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        m11358a();
        m11339h(i10);
        double[] dArr = this.f8944b;
        double d10 = dArr[i10];
        int i11 = this.f8945c;
        if (i10 < i11 - 1) {
            System.arraycopy(dArr, i10 + 1, dArr, i10, (i11 - i10) - 1);
        }
        this.f8945c--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        m11358a();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.f8944b;
        System.arraycopy(dArr, i11, dArr, i10, this.f8945c - i11);
        this.f8945c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        m11358a();
        m11339h(i10);
        double[] dArr = this.f8944b;
        double d10 = dArr[i10];
        dArr[i10] = dDoubleValue;
        return Double.valueOf(d10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f8945c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C2465c4(double[] dArr, int i10, boolean z10) {
        super(z10);
        this.f8944b = dArr;
        this.f8945c = i10;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m11336d(((Double) obj).doubleValue());
        return true;
    }
}
