package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class ba extends x9 implements RandomAccess, mb, zc {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean[] f6406d;
    public boolean[] b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6407c;

    static {
        boolean[] zArr = new boolean[0];
        f6406d = zArr;
        new ba(zArr, 0, false);
    }

    public ba() {
        this(f6406d, 0, true);
    }

    public static int e(int i10) {
        return Math.max(((i10 * 3) / 2) + 1, 10);
    }

    private final void f(int i10) {
        if (i10 < 0 || i10 >= this.f6407c) {
            throw new IndexOutOfBoundsException(g(i10));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        a();
        if (i10 < 0 || i10 > (i11 = this.f6407c)) {
            throw new IndexOutOfBoundsException(g(i10));
        }
        int i12 = i10 + 1;
        boolean[] zArr = this.b;
        int length = zArr.length;
        if (i11 < length) {
            System.arraycopy(zArr, i10, zArr, i12, i11 - i10);
        } else {
            boolean[] zArr2 = new boolean[e(length)];
            System.arraycopy(this.b, 0, zArr2, 0, i10);
            System.arraycopy(this.b, i10, zArr2, i12, this.f6407c - i10);
            this.b = zArr2;
        }
        this.b[i10] = zBooleanValue;
        this.f6407c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.x9, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        Charset charset = ub.f6869a;
        collection.getClass();
        if (!(collection instanceof ba)) {
            return super.addAll(collection);
        }
        ba baVar = (ba) collection;
        int i10 = baVar.f6407c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f6407c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        boolean[] zArr = this.b;
        if (i12 > zArr.length) {
            this.b = Arrays.copyOf(zArr, i12);
        }
        System.arraycopy(baVar.b, 0, this.b, this.f6407c, baVar.f6407c);
        this.f6407c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.tb
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final mb y(int i10) {
        if (i10 >= this.f6407c) {
            return new ba(i10 == 0 ? f6406d : Arrays.copyOf(this.b, i10), this.f6407c, true);
        }
        throw new IllegalArgumentException();
    }

    public final boolean c(int i10) {
        f(i10);
        return this.b[i10];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(boolean z10) {
        a();
        int i10 = this.f6407c;
        int length = this.b.length;
        if (i10 == length) {
            boolean[] zArr = new boolean[e(length)];
            System.arraycopy(this.b, 0, zArr, 0, this.f6407c);
            this.b = zArr;
        }
        boolean[] zArr2 = this.b;
        int i11 = this.f6407c;
        this.f6407c = i11 + 1;
        zArr2[i11] = z10;
    }

    @Override // com.google.android.gms.internal.measurement.x9, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ba)) {
            return super.equals(obj);
        }
        ba baVar = (ba) obj;
        if (this.f6407c != baVar.f6407c) {
            return false;
        }
        boolean[] zArr = baVar.b;
        for (int i10 = 0; i10 < this.f6407c; i10++) {
            if (this.b[i10] != zArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public final String g(int i10) {
        return z9.a(this.f6407c, i10, (byte) 13, "Index:", ", Size:");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        f(i10);
        return Boolean.valueOf(this.b[i10]);
    }

    @Override // com.google.android.gms.internal.measurement.x9, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iB = 1;
        for (int i10 = 0; i10 < this.f6407c; i10++) {
            iB = (iB * 31) + ub.b(this.b[i10]);
        }
        return iB;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i10 = this.f6407c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.b[i11] == zBooleanValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.x9, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        a();
        f(i10);
        boolean[] zArr = this.b;
        boolean z10 = zArr[i10];
        int i11 = this.f6407c;
        if (i10 < i11 - 1) {
            System.arraycopy(zArr, i10 + 1, zArr, i10, (i11 - i10) - 1);
        }
        this.f6407c--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        a();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.b;
        System.arraycopy(zArr, i11, zArr, i10, this.f6407c - i11);
        this.f6407c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        a();
        f(i10);
        boolean[] zArr = this.b;
        boolean z10 = zArr[i10];
        zArr[i10] = zBooleanValue;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f6407c;
    }

    public ba(boolean[] zArr, int i10, boolean z10) {
        super(z10);
        this.b = zArr;
        this.f6407c = i10;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        d(((Boolean) obj).booleanValue());
        return true;
    }
}
