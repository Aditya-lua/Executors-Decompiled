package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class cb extends x9 implements RandomAccess, qb, zc {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float[] f6464d;
    public float[] b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6465c;

    static {
        float[] fArr = new float[0];
        f6464d = fArr;
        new cb(fArr, 0, false);
    }

    public cb() {
        this(f6464d, 0, true);
    }

    private static int e(int i10) {
        return Math.max(((i10 * 3) / 2) + 1, 10);
    }

    private final void f(int i10) {
        if (i10 < 0 || i10 >= this.f6465c) {
            throw new IndexOutOfBoundsException(g(i10));
        }
    }

    private final String g(int i10) {
        return z9.a(this.f6465c, i10, (byte) 13, "Index:", ", Size:");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        float fFloatValue = ((Float) obj).floatValue();
        a();
        if (i10 < 0 || i10 > (i11 = this.f6465c)) {
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
            System.arraycopy(this.b, i10, fArr2, i12, this.f6465c - i10);
            this.b = fArr2;
        }
        this.b[i10] = fFloatValue;
        this.f6465c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.x9, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        Charset charset = ub.f6869a;
        collection.getClass();
        if (!(collection instanceof cb)) {
            return super.addAll(collection);
        }
        cb cbVar = (cb) collection;
        int i10 = cbVar.f6465c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f6465c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        float[] fArr = this.b;
        if (i12 > fArr.length) {
            this.b = Arrays.copyOf(fArr, i12);
        }
        System.arraycopy(cbVar.b, 0, this.b, this.f6465c, cbVar.f6465c);
        this.f6465c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.tb
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final qb y(int i10) {
        if (i10 >= this.f6465c) {
            return new cb(i10 == 0 ? f6464d : Arrays.copyOf(this.b, i10), this.f6465c, true);
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
        int i10 = this.f6465c;
        int length = this.b.length;
        if (i10 == length) {
            float[] fArr = new float[e(length)];
            System.arraycopy(this.b, 0, fArr, 0, this.f6465c);
            this.b = fArr;
        }
        float[] fArr2 = this.b;
        int i11 = this.f6465c;
        this.f6465c = i11 + 1;
        fArr2[i11] = f10;
    }

    @Override // com.google.android.gms.internal.measurement.x9, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cb)) {
            return super.equals(obj);
        }
        cb cbVar = (cb) obj;
        if (this.f6465c != cbVar.f6465c) {
            return false;
        }
        float[] fArr = cbVar.b;
        for (int i10 = 0; i10 < this.f6465c; i10++) {
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

    @Override // com.google.android.gms.internal.measurement.x9, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i10 = 0; i10 < this.f6465c; i10++) {
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
        int i10 = this.f6465c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.b[i11] == fFloatValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.x9, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        a();
        f(i10);
        float[] fArr = this.b;
        float f10 = fArr[i10];
        int i11 = this.f6465c;
        if (i10 < i11 - 1) {
            System.arraycopy(fArr, i10 + 1, fArr, i10, (i11 - i10) - 1);
        }
        this.f6465c--;
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
        System.arraycopy(fArr, i11, fArr, i10, this.f6465c - i11);
        this.f6465c -= i11 - i10;
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
        return this.f6465c;
    }

    public final void z(int i10) {
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

    public cb(float[] fArr, int i10, boolean z10) {
        super(z10);
        this.b = fArr;
        this.f6465c = i10;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        d(((Float) obj).floatValue());
        return true;
    }
}
