package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.oa */
/* JADX INFO: loaded from: classes.dex */
public final class C2230oa extends AbstractC2319t9 implements RandomAccess, InterfaceC2141jb, InterfaceC2358vc {

    /* JADX INFO: renamed from: d */
    public static final double[] f8542d;

    /* JADX INFO: renamed from: b */
    public double[] f8543b;

    /* JADX INFO: renamed from: c */
    public int f8544c;

    static {
        double[] dArr = new double[0];
        f8542d = dArr;
        new C2230oa(dArr, 0, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2230oa() {
        this(f8542d, 0, true);
    }

    /* JADX INFO: renamed from: e */
    public static int m10507e(int i10) {
        return Math.max(((i10 * 3) / 2) + 1, 10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        double dDoubleValue = ((Double) obj).doubleValue();
        m10768a();
        if (i10 < 0 || i10 > (i11 = this.f8544c)) {
            throw new IndexOutOfBoundsException(m10512g(i10));
        }
        int i12 = i10 + 1;
        double[] dArr = this.f8543b;
        int length = dArr.length;
        if (i11 < length) {
            System.arraycopy(dArr, i10, dArr, i12, i11 - i10);
        } else {
            double[] dArr2 = new double[m10507e(length)];
            System.arraycopy(this.f8543b, 0, dArr2, 0, i10);
            System.arraycopy(this.f8543b, i10, dArr2, i12, this.f8544c - i10);
            this.f8543b = dArr2;
        }
        this.f8543b[i10] = dDoubleValue;
        this.f8544c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2319t9, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m10768a();
        Charset charset = C2267qb.f8595a;
        collection.getClass();
        if (!(collection instanceof C2230oa)) {
            return super.addAll(collection);
        }
        C2230oa c2230oa = (C2230oa) collection;
        int i10 = c2230oa.f8544c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f8544c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        double[] dArr = this.f8543b;
        if (i12 > dArr.length) {
            this.f8543b = Arrays.copyOf(dArr, i12);
        }
        System.arraycopy(c2230oa.f8543b, 0, this.f8543b, this.f8544c, c2230oa.f8544c);
        this.f8544c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* JADX DEBUG: Method merged with bridge method: v(I)Lcom/google/android/gms/internal/measurement/pb; */
    @Override // com.google.android.gms.internal.measurement.InterfaceC2249pb
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final InterfaceC2141jb mo9891v(int i10) {
        if (i10 >= this.f8544c) {
            return new C2230oa(i10 == 0 ? f8542d : Arrays.copyOf(this.f8543b, i10), this.f8544c, true);
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: renamed from: c */
    public final double m10509c(int i10) {
        m10511f(i10);
        return this.f8543b[i10];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* JADX INFO: renamed from: d */
    public final void m10510d(double d10) {
        m10768a();
        int i10 = this.f8544c;
        int length = this.f8543b.length;
        if (i10 == length) {
            double[] dArr = new double[m10507e(length)];
            System.arraycopy(this.f8543b, 0, dArr, 0, this.f8544c);
            this.f8543b = dArr;
        }
        double[] dArr2 = this.f8543b;
        int i11 = this.f8544c;
        this.f8544c = i11 + 1;
        dArr2[i11] = d10;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2319t9, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2230oa)) {
            return super.equals(obj);
        }
        C2230oa c2230oa = (C2230oa) obj;
        if (this.f8544c != c2230oa.f8544c) {
            return false;
        }
        double[] dArr = c2230oa.f8543b;
        for (int i10 = 0; i10 < this.f8544c; i10++) {
            if (Double.doubleToLongBits(this.f8543b[i10]) != Double.doubleToLongBits(dArr[i10])) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final void m10511f(int i10) {
        if (i10 < 0 || i10 >= this.f8544c) {
            throw new IndexOutOfBoundsException(m10512g(i10));
        }
    }

    /* JADX INFO: renamed from: g */
    public final String m10512g(int i10) {
        return C2355v9.m10853a(this.f8544c, i10, (byte) 13, "Index:", ", Size:");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        m10511f(i10);
        return Double.valueOf(this.f8543b[i10]);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2319t9, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f8544c; i11++) {
            long jDoubleToLongBits = Double.doubleToLongBits(this.f8543b[i11]);
            Charset charset = C2267qb.f8595a;
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
        int i10 = this.f8544c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f8543b[i11] == dDoubleValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2319t9, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        m10768a();
        m10511f(i10);
        double[] dArr = this.f8543b;
        double d10 = dArr[i10];
        int i11 = this.f8544c;
        if (i10 < i11 - 1) {
            System.arraycopy(dArr, i10 + 1, dArr, i10, (i11 - i10) - 1);
        }
        this.f8544c--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        m10768a();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.f8543b;
        System.arraycopy(dArr, i11, dArr, i10, this.f8544c - i11);
        this.f8544c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        m10768a();
        m10511f(i10);
        double[] dArr = this.f8543b;
        double d10 = dArr[i10];
        dArr[i10] = dDoubleValue;
        return Double.valueOf(d10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f8544c;
    }

    /* JADX INFO: renamed from: w */
    public final void m10513w(int i10) {
        int length = this.f8543b.length;
        if (i10 <= length) {
            return;
        }
        if (length == 0) {
            this.f8543b = new double[Math.max(i10, 10)];
            return;
        }
        while (length < i10) {
            length = m10507e(length);
        }
        this.f8543b = Arrays.copyOf(this.f8543b, length);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C2230oa(double[] dArr, int i10, boolean z10) {
        super(z10);
        this.f8543b = dArr;
        this.f8544c = i10;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m10510d(((Double) obj).doubleValue());
        return true;
    }
}
