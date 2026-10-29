package com.google.android.gms.internal.play_billing;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class c4 extends d3 implements RandomAccess, y4 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final double[] f7022d;
    public double[] b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f7023c;

    static {
        double[] dArr = new double[0];
        f7022d = dArr;
        new c4(dArr, 0, false);
    }

    public c4() {
        this(f7022d, 0, true);
    }

    public static int f(int i10) {
        return Math.max(((i10 * 3) / 2) + 1, 10);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        double dDoubleValue = ((Double) obj).doubleValue();
        a();
        if (i10 < 0 || i10 > (i11 = this.f7023c)) {
            throw new IndexOutOfBoundsException(g(i10));
        }
        int i12 = i10 + 1;
        double[] dArr = this.b;
        int length = dArr.length;
        if (i11 < length) {
            System.arraycopy(dArr, i10, dArr, i12, i11 - i10);
        } else {
            double[] dArr2 = new double[f(length)];
            System.arraycopy(this.b, 0, dArr2, 0, i10);
            System.arraycopy(this.b, i10, dArr2, i12, this.f7023c - i10);
            this.b = dArr2;
        }
        this.b[i10] = dDoubleValue;
        this.f7023c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.d3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        collection.getClass();
        if (!(collection instanceof c4)) {
            return super.addAll(collection);
        }
        c4 c4Var = (c4) collection;
        int i10 = c4Var.f7023c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f7023c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        double[] dArr = this.b;
        if (i12 > dArr.length) {
            this.b = Arrays.copyOf(dArr, i12);
        }
        System.arraycopy(c4Var.b, 0, this.b, this.f7023c, c4Var.f7023c);
        this.f7023c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final double c(int i10) {
        h(i10);
        return this.b[i10];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(double d10) {
        a();
        int i10 = this.f7023c;
        int length = this.b.length;
        if (i10 == length) {
            double[] dArr = new double[f(length)];
            System.arraycopy(this.b, 0, dArr, 0, this.f7023c);
            this.b = dArr;
        }
        double[] dArr2 = this.b;
        int i11 = this.f7023c;
        this.f7023c = i11 + 1;
        dArr2[i11] = d10;
    }

    public final void e(int i10) {
        int length = this.b.length;
        if (i10 <= length) {
            return;
        }
        if (length == 0) {
            this.b = new double[Math.max(i10, 10)];
            return;
        }
        while (length < i10) {
            length = f(length);
        }
        this.b = Arrays.copyOf(this.b, length);
    }

    @Override // com.google.android.gms.internal.play_billing.d3, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c4)) {
            return super.equals(obj);
        }
        c4 c4Var = (c4) obj;
        if (this.f7023c != c4Var.f7023c) {
            return false;
        }
        double[] dArr = c4Var.b;
        for (int i10 = 0; i10 < this.f7023c; i10++) {
            if (Double.doubleToLongBits(this.b[i10]) != Double.doubleToLongBits(dArr[i10])) {
                return false;
            }
        }
        return true;
    }

    public final String g(int i10) {
        return "Index:" + i10 + ", Size:" + this.f7023c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        h(i10);
        return Double.valueOf(this.b[i10]);
    }

    public final void h(int i10) {
        if (i10 < 0 || i10 >= this.f7023c) {
            throw new IndexOutOfBoundsException(g(i10));
        }
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f7023c; i11++) {
            long jDoubleToLongBits = Double.doubleToLongBits(this.b[i11]);
            byte[] bArr = z4.f7356a;
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
        int i10 = this.f7023c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.b[i11] == dDoubleValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.play_billing.y4
    public final /* bridge */ /* synthetic */ y4 r(int i10) {
        if (i10 >= this.f7023c) {
            return new c4(i10 == 0 ? f7022d : Arrays.copyOf(this.b, i10), this.f7023c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.play_billing.d3, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        a();
        h(i10);
        double[] dArr = this.b;
        double d10 = dArr[i10];
        int i11 = this.f7023c;
        if (i10 < i11 - 1) {
            System.arraycopy(dArr, i10 + 1, dArr, i10, (i11 - i10) - 1);
        }
        this.f7023c--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        a();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.b;
        System.arraycopy(dArr, i11, dArr, i10, this.f7023c - i11);
        this.f7023c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        a();
        h(i10);
        double[] dArr = this.b;
        double d10 = dArr[i10];
        dArr[i10] = dDoubleValue;
        return Double.valueOf(d10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f7023c;
    }

    public c4(double[] dArr, int i10, boolean z10) {
        super(z10);
        this.b = dArr;
        this.f7023c = i10;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        d(((Double) obj).doubleValue());
        return true;
    }
}
