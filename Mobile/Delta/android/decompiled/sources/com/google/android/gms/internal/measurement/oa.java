package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class oa extends t9 implements RandomAccess, jb, vc {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final double[] f6786d;
    public double[] b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6787c;

    static {
        double[] dArr = new double[0];
        f6786d = dArr;
        new oa(dArr, 0, false);
    }

    public oa() {
        this(f6786d, 0, true);
    }

    public static int e(int i10) {
        return Math.max(((i10 * 3) / 2) + 1, 10);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        double dDoubleValue = ((Double) obj).doubleValue();
        a();
        if (i10 < 0 || i10 > (i11 = this.f6787c)) {
            throw new IndexOutOfBoundsException(g(i10));
        }
        int i12 = i10 + 1;
        double[] dArr = this.b;
        int length = dArr.length;
        if (i11 < length) {
            System.arraycopy(dArr, i10, dArr, i12, i11 - i10);
        } else {
            double[] dArr2 = new double[e(length)];
            System.arraycopy(this.b, 0, dArr2, 0, i10);
            System.arraycopy(this.b, i10, dArr2, i12, this.f6787c - i10);
            this.b = dArr2;
        }
        this.b[i10] = dDoubleValue;
        this.f6787c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.t9, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        Charset charset = qb.f6824a;
        collection.getClass();
        if (!(collection instanceof oa)) {
            return super.addAll(collection);
        }
        oa oaVar = (oa) collection;
        int i10 = oaVar.f6787c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f6787c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        double[] dArr = this.b;
        if (i12 > dArr.length) {
            this.b = Arrays.copyOf(dArr, i12);
        }
        System.arraycopy(oaVar.b, 0, this.b, this.f6787c, oaVar.f6787c);
        this.f6787c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.pb
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final jb v(int i10) {
        if (i10 >= this.f6787c) {
            return new oa(i10 == 0 ? f6786d : Arrays.copyOf(this.b, i10), this.f6787c, true);
        }
        throw new IllegalArgumentException();
    }

    public final double c(int i10) {
        f(i10);
        return this.b[i10];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(double d10) {
        a();
        int i10 = this.f6787c;
        int length = this.b.length;
        if (i10 == length) {
            double[] dArr = new double[e(length)];
            System.arraycopy(this.b, 0, dArr, 0, this.f6787c);
            this.b = dArr;
        }
        double[] dArr2 = this.b;
        int i11 = this.f6787c;
        this.f6787c = i11 + 1;
        dArr2[i11] = d10;
    }

    @Override // com.google.android.gms.internal.measurement.t9, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oa)) {
            return super.equals(obj);
        }
        oa oaVar = (oa) obj;
        if (this.f6787c != oaVar.f6787c) {
            return false;
        }
        double[] dArr = oaVar.b;
        for (int i10 = 0; i10 < this.f6787c; i10++) {
            if (Double.doubleToLongBits(this.b[i10]) != Double.doubleToLongBits(dArr[i10])) {
                return false;
            }
        }
        return true;
    }

    public final void f(int i10) {
        if (i10 < 0 || i10 >= this.f6787c) {
            throw new IndexOutOfBoundsException(g(i10));
        }
    }

    public final String g(int i10) {
        return v9.a(this.f6787c, i10, (byte) 13, "Index:", ", Size:");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        f(i10);
        return Double.valueOf(this.b[i10]);
    }

    @Override // com.google.android.gms.internal.measurement.t9, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f6787c; i11++) {
            long jDoubleToLongBits = Double.doubleToLongBits(this.b[i11]);
            Charset charset = qb.f6824a;
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
        int i10 = this.f6787c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.b[i11] == dDoubleValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.t9, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        a();
        f(i10);
        double[] dArr = this.b;
        double d10 = dArr[i10];
        int i11 = this.f6787c;
        if (i10 < i11 - 1) {
            System.arraycopy(dArr, i10 + 1, dArr, i10, (i11 - i10) - 1);
        }
        this.f6787c--;
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
        System.arraycopy(dArr, i11, dArr, i10, this.f6787c - i11);
        this.f6787c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        a();
        f(i10);
        double[] dArr = this.b;
        double d10 = dArr[i10];
        dArr[i10] = dDoubleValue;
        return Double.valueOf(d10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f6787c;
    }

    public final void w(int i10) {
        int length = this.b.length;
        if (i10 <= length) {
            return;
        }
        if (length == 0) {
            this.b = new double[Math.max(i10, 10)];
            return;
        }
        while (length < i10) {
            length = e(length);
        }
        this.b = Arrays.copyOf(this.b, length);
    }

    public oa(double[] dArr, int i10, boolean z10) {
        super(z10);
        this.b = dArr;
        this.f6787c = i10;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        d(((Double) obj).doubleValue());
        return true;
    }
}
