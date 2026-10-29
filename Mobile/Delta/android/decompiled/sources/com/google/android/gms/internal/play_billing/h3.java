package com.google.android.gms.internal.play_billing;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class h3 extends d3 implements RandomAccess, y4 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean[] f7093d;
    public boolean[] b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f7094c;

    static {
        boolean[] zArr = new boolean[0];
        f7093d = zArr;
        new h3(zArr, 0, false);
    }

    public h3() {
        this(f7093d, 0, true);
    }

    public static int e(int i10) {
        return Math.max(((i10 * 3) / 2) + 1, 10);
    }

    private final void g(int i10) {
        if (i10 < 0 || i10 >= this.f7094c) {
            throw new IndexOutOfBoundsException(f(i10));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        a();
        if (i10 < 0 || i10 > (i11 = this.f7094c)) {
            throw new IndexOutOfBoundsException(f(i10));
        }
        int i12 = i10 + 1;
        boolean[] zArr = this.b;
        int length = zArr.length;
        if (i11 < length) {
            System.arraycopy(zArr, i10, zArr, i12, i11 - i10);
        } else {
            boolean[] zArr2 = new boolean[e(length)];
            System.arraycopy(this.b, 0, zArr2, 0, i10);
            System.arraycopy(this.b, i10, zArr2, i12, this.f7094c - i10);
            this.b = zArr2;
        }
        this.b[i10] = zBooleanValue;
        this.f7094c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.d3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        collection.getClass();
        if (!(collection instanceof h3)) {
            return super.addAll(collection);
        }
        h3 h3Var = (h3) collection;
        int i10 = h3Var.f7094c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f7094c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        boolean[] zArr = this.b;
        if (i12 > zArr.length) {
            this.b = Arrays.copyOf(zArr, i12);
        }
        System.arraycopy(h3Var.b, 0, this.b, this.f7094c, h3Var.f7094c);
        this.f7094c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void c(boolean z10) {
        a();
        int i10 = this.f7094c;
        int length = this.b.length;
        if (i10 == length) {
            boolean[] zArr = new boolean[e(length)];
            System.arraycopy(this.b, 0, zArr, 0, this.f7094c);
            this.b = zArr;
        }
        boolean[] zArr2 = this.b;
        int i11 = this.f7094c;
        this.f7094c = i11 + 1;
        zArr2[i11] = z10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final boolean d(int i10) {
        g(i10);
        return this.b[i10];
    }

    @Override // com.google.android.gms.internal.play_billing.d3, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h3)) {
            return super.equals(obj);
        }
        h3 h3Var = (h3) obj;
        if (this.f7094c != h3Var.f7094c) {
            return false;
        }
        boolean[] zArr = h3Var.b;
        for (int i10 = 0; i10 < this.f7094c; i10++) {
            if (this.b[i10] != zArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public final String f(int i10) {
        return "Index:" + i10 + ", Size:" + this.f7094c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        g(i10);
        return Boolean.valueOf(this.b[i10]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iA = 1;
        for (int i10 = 0; i10 < this.f7094c; i10++) {
            iA = (iA * 31) + z4.a(this.b[i10]);
        }
        return iA;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i10 = this.f7094c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.b[i11] == zBooleanValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.play_billing.y4
    public final /* bridge */ /* synthetic */ y4 r(int i10) {
        if (i10 >= this.f7094c) {
            return new h3(i10 == 0 ? f7093d : Arrays.copyOf(this.b, i10), this.f7094c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.play_billing.d3, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        a();
        g(i10);
        boolean[] zArr = this.b;
        boolean z10 = zArr[i10];
        int i11 = this.f7094c;
        if (i10 < i11 - 1) {
            System.arraycopy(zArr, i10 + 1, zArr, i10, (i11 - i10) - 1);
        }
        this.f7094c--;
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
        System.arraycopy(zArr, i11, zArr, i10, this.f7094c - i11);
        this.f7094c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        a();
        g(i10);
        boolean[] zArr = this.b;
        boolean z10 = zArr[i10];
        zArr[i10] = zBooleanValue;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f7094c;
    }

    public h3(boolean[] zArr, int i10, boolean z10) {
        super(z10);
        this.b = zArr;
        this.f7094c = i10;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        c(((Boolean) obj).booleanValue());
        return true;
    }
}
