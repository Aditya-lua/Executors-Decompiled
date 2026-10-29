package com.google.crypto.tink.shaded.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class m extends c<Double> implements a0.b, RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final m f8510d = new m(new double[0], 0, false);
    public double[] b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f8511c;

    public m() {
        this(new double[10], 0, true);
    }

    private void f(int i10) {
        if (i10 < 0 || i10 >= this.f8511c) {
            throw new IndexOutOfBoundsException(i(i10));
        }
    }

    private String i(int i10) {
        return "Index:" + i10 + ", Size:" + this.f8511c;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Double> collection) {
        a();
        a0.a(collection);
        if (!(collection instanceof m)) {
            return super.addAll(collection);
        }
        m mVar = (m) collection;
        int i10 = mVar.f8511c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f8511c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        double[] dArr = this.b;
        if (i12 > dArr.length) {
            this.b = Arrays.copyOf(dArr, i12);
        }
        System.arraycopy(mVar.b, 0, this.b, this.f8511c, mVar.f8511c);
        this.f8511c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void add(int i10, Double d10) {
        e(i10, d10.doubleValue());
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean add(Double d10) {
        d(d10.doubleValue());
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public void d(double d10) {
        a();
        int i10 = this.f8511c;
        double[] dArr = this.b;
        if (i10 == dArr.length) {
            double[] dArr2 = new double[((i10 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            this.b = dArr2;
        }
        double[] dArr3 = this.b;
        int i11 = this.f8511c;
        this.f8511c = i11 + 1;
        dArr3[i11] = d10;
    }

    public final void e(int i10, double d10) {
        int i11;
        a();
        if (i10 < 0 || i10 > (i11 = this.f8511c)) {
            throw new IndexOutOfBoundsException(i(i10));
        }
        double[] dArr = this.b;
        if (i11 < dArr.length) {
            System.arraycopy(dArr, i10, dArr, i10 + 1, i11 - i10);
        } else {
            double[] dArr2 = new double[((i11 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            System.arraycopy(this.b, i10, dArr2, i10 + 1, this.f8511c - i10);
            this.b = dArr2;
        }
        this.b[i10] = d10;
        this.f8511c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return super.equals(obj);
        }
        m mVar = (m) obj;
        if (this.f8511c != mVar.f8511c) {
            return false;
        }
        double[] dArr = mVar.b;
        for (int i10 = 0; i10 < this.f8511c; i10++) {
            if (Double.doubleToLongBits(this.b[i10]) != Double.doubleToLongBits(dArr[i10])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public Double get(int i10) {
        return Double.valueOf(h(i10));
    }

    public double h(int i10) {
        f(i10);
        return this.b[i10];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iF = 1;
        for (int i10 = 0; i10 < this.f8511c; i10++) {
            iF = (iF * 31) + a0.f(Double.doubleToLongBits(this.b[i10]));
        }
        return iF;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.b[i10] == dDoubleValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a0.i
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public a0.b o(int i10) {
        if (i10 >= this.f8511c) {
            return new m(Arrays.copyOf(this.b, i10), this.f8511c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public Double remove(int i10) {
        a();
        f(i10);
        double[] dArr = this.b;
        double d10 = dArr[i10];
        int i11 = this.f8511c;
        if (i10 < i11 - 1) {
            System.arraycopy(dArr, i10 + 1, dArr, i10, (i11 - i10) - 1);
        }
        this.f8511c--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d10);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public Double set(int i10, Double d10) {
        return Double.valueOf(p(i10, d10.doubleValue()));
    }

    public double p(int i10, double d10) {
        a();
        f(i10);
        double[] dArr = this.b;
        double d11 = dArr[i10];
        dArr[i10] = d10;
        return d11;
    }

    @Override // java.util.AbstractList
    public void removeRange(int i10, int i11) {
        a();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.b;
        System.arraycopy(dArr, i11, dArr, i10, this.f8511c - i11);
        this.f8511c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f8511c;
    }

    public m(double[] dArr, int i10, boolean z10) {
        super(z10);
        this.b = dArr;
        this.f8511c = i10;
    }
}
