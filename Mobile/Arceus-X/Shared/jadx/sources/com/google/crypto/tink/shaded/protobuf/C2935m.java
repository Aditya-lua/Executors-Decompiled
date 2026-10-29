package com.google.crypto.tink.shaded.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.m */
/* JADX INFO: loaded from: classes2.dex */
public final class C2935m extends AbstractC2905c<Double> implements C2900a0.b, RandomAccess {

    /* JADX INFO: renamed from: d */
    public static final C2935m f10943d = new C2935m(new double[0], 0, false);

    /* JADX INFO: renamed from: b */
    public double[] f10944b;

    /* JADX INFO: renamed from: c */
    public int f10945c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2935m() {
        this(new double[10], 0, true);
    }

    /* JADX INFO: renamed from: f */
    private void m13960f(int i10) {
        if (i10 < 0 || i10 >= this.f10945c) {
            throw new IndexOutOfBoundsException(m13961i(i10));
        }
    }

    /* JADX INFO: renamed from: i */
    private String m13961i(int i10) {
        return "Index:" + i10 + ", Size:" + this.f10945c;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2905c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Double> collection) {
        m13410a();
        C2900a0.m13379a(collection);
        if (!(collection instanceof C2935m)) {
            return super.addAll(collection);
        }
        C2935m c2935m = (C2935m) collection;
        int i10 = c2935m.f10945c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f10945c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        double[] dArr = this.f10944b;
        if (i12 > dArr.length) {
            this.f10944b = Arrays.copyOf(dArr, i12);
        }
        System.arraycopy(c2935m.f10944b, 0, this.f10944b, this.f10945c, c2935m.f10945c);
        this.f10945c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* JADX DEBUG: Method merged with bridge method: add(ILjava/lang/Object;)V */
    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void add(int i10, Double d10) {
        m13965e(i10, d10.doubleValue());
    }

    /* JADX DEBUG: Method merged with bridge method: add(Ljava/lang/Object;)Z */
    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean add(Double d10) {
        m13964d(d10.doubleValue());
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* JADX INFO: renamed from: d */
    public void m13964d(double d10) {
        m13410a();
        int i10 = this.f10945c;
        double[] dArr = this.f10944b;
        if (i10 == dArr.length) {
            double[] dArr2 = new double[((i10 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            this.f10944b = dArr2;
        }
        double[] dArr3 = this.f10944b;
        int i11 = this.f10945c;
        this.f10945c = i11 + 1;
        dArr3[i11] = d10;
    }

    /* JADX INFO: renamed from: e */
    public final void m13965e(int i10, double d10) {
        int i11;
        m13410a();
        if (i10 < 0 || i10 > (i11 = this.f10945c)) {
            throw new IndexOutOfBoundsException(m13961i(i10));
        }
        double[] dArr = this.f10944b;
        if (i11 < dArr.length) {
            System.arraycopy(dArr, i10, dArr, i10 + 1, i11 - i10);
        } else {
            double[] dArr2 = new double[((i11 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            System.arraycopy(this.f10944b, i10, dArr2, i10 + 1, this.f10945c - i10);
            this.f10944b = dArr2;
        }
        this.f10944b[i10] = d10;
        this.f10945c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2905c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2935m)) {
            return super.equals(obj);
        }
        C2935m c2935m = (C2935m) obj;
        if (this.f10945c != c2935m.f10945c) {
            return false;
        }
        double[] dArr = c2935m.f10944b;
        for (int i10 = 0; i10 < this.f10945c; i10++) {
            if (Double.doubleToLongBits(this.f10944b[i10]) != Double.doubleToLongBits(dArr[i10])) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Method merged with bridge method: get(I)Ljava/lang/Object; */
    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public Double get(int i10) {
        return Double.valueOf(m13967h(i10));
    }

    /* JADX INFO: renamed from: h */
    public double m13967h(int i10) {
        m13960f(i10);
        return this.f10944b[i10];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2905c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iM13384f = 1;
        for (int i10 = 0; i10 < this.f10945c; i10++) {
            iM13384f = (iM13384f * 31) + C2900a0.m13384f(Double.doubleToLongBits(this.f10944b[i10]));
        }
        return iM13384f;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f10944b[i10] == dDoubleValue) {
                return i10;
            }
        }
        return -1;
    }

    /* JADX DEBUG: Method merged with bridge method: o(I)Lcom/google/crypto/tink/shaded/protobuf/a0$i; */
    @Override // com.google.crypto.tink.shaded.protobuf.C2900a0.i
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public C2900a0.b mo13390o(int i10) {
        if (i10 >= this.f10945c) {
            return new C2935m(Arrays.copyOf(this.f10944b, i10), this.f10945c, true);
        }
        throw new IllegalArgumentException();
    }

    /* JADX DEBUG: Method merged with bridge method: remove(I)Ljava/lang/Object; */
    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2905c, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public Double remove(int i10) {
        m13410a();
        m13960f(i10);
        double[] dArr = this.f10944b;
        double d10 = dArr[i10];
        int i11 = this.f10945c;
        if (i10 < i11 - 1) {
            System.arraycopy(dArr, i10 + 1, dArr, i10, (i11 - i10) - 1);
        }
        this.f10945c--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d10);
    }

    /* JADX DEBUG: Method merged with bridge method: set(ILjava/lang/Object;)Ljava/lang/Object; */
    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public Double set(int i10, Double d10) {
        return Double.valueOf(m13971p(i10, d10.doubleValue()));
    }

    /* JADX INFO: renamed from: p */
    public double m13971p(int i10, double d10) {
        m13410a();
        m13960f(i10);
        double[] dArr = this.f10944b;
        double d11 = dArr[i10];
        dArr[i10] = d10;
        return d11;
    }

    @Override // java.util.AbstractList
    public void removeRange(int i10, int i11) {
        m13410a();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.f10944b;
        System.arraycopy(dArr, i11, dArr, i10, this.f10945c - i11);
        this.f10945c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f10945c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C2935m(double[] dArr, int i10, boolean z10) {
        super(z10);
        this.f10944b = dArr;
        this.f10945c = i10;
    }
}
