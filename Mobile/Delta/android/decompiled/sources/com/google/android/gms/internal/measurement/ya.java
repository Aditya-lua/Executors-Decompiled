package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class ya extends t9 implements RandomAccess, mb, vc {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float[] f6956d;
    public float[] b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6957c;

    static {
        float[] fArr = new float[0];
        f6956d = fArr;
        new ya(fArr, 0, false);
    }

    public ya() {
        this(f6956d, 0, true);
    }

    private static int e(int i10) {
        return Math.max(((i10 * 3) / 2) + 1, 10);
    }

    private final void f(int i10) {
        if (i10 < 0 || i10 >= this.f6957c) {
            throw new IndexOutOfBoundsException(g(i10));
        }
    }

    private final String g(int i10) {
        return v9.a(this.f6957c, i10, (byte) 13, "Index:", ", Size:");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        float fFloatValue = ((Float) obj).floatValue();
        a();
        if (i10 < 0 || i10 > (i11 = this.f6957c)) {
            throw new IndexOutOfBoundsException(g(i10));
        }
        int i12 = i10 + 1;
        float[] fArr = this.b;
        int length = fArr.length;
        if (i11 < length) {
            System.arraycopy(fArr, i10, fArr, i12, i11 - i10);
        } else {
            float[] fArr2 = new float[e(length)];
            System.arraycopy(this.b, 0, fArr2, 0, i10);
            System.arraycopy(this.b, i10, fArr2, i12, this.f6957c - i10);
            this.b = fArr2;
        }
        this.b[i10] = fFloatValue;
        this.f6957c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.t9, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        Charset charset = qb.f6750a;
        collection.getClass();
        if (!(collection instanceof ya)) {
            return super.addAll(collection);
        }
        ya yaVar = (ya) collection;
        int i10 = yaVar.f6957c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f6957c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        float[] fArr = this.b;
        if (i12 > fArr.length) {
            this.b = Arrays.copyOf(fArr, i12);
        }
        System.arraycopy(yaVar.b, 0, this.b, this.f6957c, yaVar.f6957c);
        this.f6957c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.pb
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final mb v(int i10) {
        if (i10 >= this.f6957c) {
            return new ya(i10 == 0 ? f6956d : Arrays.copyOf(this.b, i10), this.f6957c, true);
        }
        throw new IllegalArgumentException();
    }

    public final float c(int i10) {
        f(i10);
        return this.b[i10];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(float f10) {
        a();
        int i10 = this.f6957c;
        int length = this.b.length;
        if (i10 == length) {
            float[] fArr = new float[e(length)];
            System.arraycopy(this.b, 0, fArr, 0, this.f6957c);
            this.b = fArr;
        }
        float[] fArr2 = this.b;
        int i11 = this.f6957c;
        this.f6957c = i11 + 1;
        fArr2[i11] = f10;
    }

    @Override // com.google.android.gms.internal.measurement.t9, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ya)) {
            return super.equals(obj);
        }
        ya yaVar = (ya) obj;
        if (this.f6957c != yaVar.f6957c) {
            return false;
        }
        float[] fArr = yaVar.b;
        for (int i10 = 0; i10 < this.f6957c; i10++) {
            if (Float.floatToIntBits(this.b[i10]) != Float.floatToIntBits(fArr[i10])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        f(i10);
        return Float.valueOf(this.b[i10]);
    }

    @Override // com.google.android.gms.internal.measurement.t9, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i10 = 0; i10 < this.f6957c; i10++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.b[i10]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int i10 = this.f6957c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.b[i11] == fFloatValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.t9, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        a();
        f(i10);
        float[] fArr = this.b;
        float f10 = fArr[i10];
        int i11 = this.f6957c;
        if (i10 < i11 - 1) {
            System.arraycopy(fArr, i10 + 1, fArr, i10, (i11 - i10) - 1);
        }
        this.f6957c--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        a();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.b;
        System.arraycopy(fArr, i11, fArr, i10, this.f6957c - i11);
        this.f6957c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        a();
        f(i10);
        float[] fArr = this.b;
        float f10 = fArr[i10];
        fArr[i10] = fFloatValue;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f6957c;
    }

    public final void w(int i10) {
        int length = this.b.length;
        if (i10 <= length) {
            return;
        }
        if (length == 0) {
            this.b = new float[Math.max(i10, 10)];
            return;
        }
        while (length < i10) {
            length = e(length);
        }
        this.b = Arrays.copyOf(this.b, length);
    }

    public ya(float[] fArr, int i10, boolean z10) {
        super(z10);
        this.b = fArr;
        this.f6957c = i10;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        d(((Float) obj).floatValue());
        return true;
    }
}
