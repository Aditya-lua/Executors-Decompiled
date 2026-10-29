package com.google.android.gms.internal.play_billing;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class u4 extends d3 implements RandomAccess, x4 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f7326d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final u4 f7327e;
    public int[] b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f7328c;

    static {
        int[] iArr = new int[0];
        f7326d = iArr;
        f7327e = new u4(iArr, 0, false);
    }

    public u4() {
        this(f7326d, 0, true);
    }

    public static u4 d() {
        return f7327e;
    }

    public static int f(int i10) {
        return Math.max(((i10 * 3) / 2) + 1, 10);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        int iIntValue = ((Integer) obj).intValue();
        a();
        if (i10 < 0 || i10 > (i11 = this.f7328c)) {
            throw new IndexOutOfBoundsException(g(i10));
        }
        int i12 = i10 + 1;
        int[] iArr = this.b;
        int length = iArr.length;
        if (i11 < length) {
            System.arraycopy(iArr, i10, iArr, i12, i11 - i10);
        } else {
            int[] iArr2 = new int[f(length)];
            System.arraycopy(this.b, 0, iArr2, 0, i10);
            System.arraycopy(this.b, i10, iArr2, i12, this.f7328c - i10);
            this.b = iArr2;
        }
        this.b[i10] = iIntValue;
        this.f7328c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.d3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        collection.getClass();
        if (!(collection instanceof u4)) {
            return super.addAll(collection);
        }
        u4 u4Var = (u4) collection;
        int i10 = u4Var.f7328c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f7328c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        int[] iArr = this.b;
        if (i12 > iArr.length) {
            this.b = Arrays.copyOf(iArr, i12);
        }
        System.arraycopy(u4Var.b, 0, this.b, this.f7328c, u4Var.f7328c);
        this.f7328c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final int c(int i10) {
        h(i10);
        return this.b[i10];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void e(int i10) {
        int length = this.b.length;
        if (i10 <= length) {
            return;
        }
        if (length == 0) {
            this.b = new int[Math.max(i10, 10)];
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
        if (!(obj instanceof u4)) {
            return super.equals(obj);
        }
        u4 u4Var = (u4) obj;
        if (this.f7328c != u4Var.f7328c) {
            return false;
        }
        int[] iArr = u4Var.b;
        for (int i10 = 0; i10 < this.f7328c; i10++) {
            if (this.b[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public final String g(int i10) {
        return "Index:" + i10 + ", Size:" + this.f7328c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        h(i10);
        return Integer.valueOf(this.b[i10]);
    }

    public final void h(int i10) {
        if (i10 < 0 || i10 >= this.f7328c) {
            throw new IndexOutOfBoundsException(g(i10));
        }
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f7328c; i11++) {
            i10 = (i10 * 31) + this.b[i11];
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i10 = this.f7328c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.b[i11] == iIntValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.play_billing.d3, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        a();
        h(i10);
        int[] iArr = this.b;
        int i11 = iArr[i10];
        int i12 = this.f7328c;
        if (i10 < i12 - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (i12 - i10) - 1);
        }
        this.f7328c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        a();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.b;
        System.arraycopy(iArr, i11, iArr, i10, this.f7328c - i11);
        this.f7328c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        a();
        h(i10);
        int[] iArr = this.b;
        int i11 = iArr[i10];
        iArr[i10] = iIntValue;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f7328c;
    }

    @Override // com.google.android.gms.internal.play_billing.y4
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public final x4 r(int i10) {
        if (i10 >= this.f7328c) {
            return new u4(i10 == 0 ? f7326d : Arrays.copyOf(this.b, i10), this.f7328c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.play_billing.x4
    public final void w(int i10) {
        a();
        int i11 = this.f7328c;
        int length = this.b.length;
        if (i11 == length) {
            int[] iArr = new int[f(length)];
            System.arraycopy(this.b, 0, iArr, 0, this.f7328c);
            this.b = iArr;
        }
        int[] iArr2 = this.b;
        int i12 = this.f7328c;
        this.f7328c = i12 + 1;
        iArr2[i12] = i10;
    }

    public u4(int[] iArr, int i10, boolean z10) {
        super(z10);
        this.b = iArr;
        this.f7328c = i10;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        w(((Integer) obj).intValue());
        return true;
    }
}
