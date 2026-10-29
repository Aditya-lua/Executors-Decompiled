package com.google.crypto.tink.shaded.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class z extends c<Integer> implements a0.g, RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final z f8666d = new z(new int[0], 0, false);
    public int[] b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f8667c;

    public z() {
        this(new int[10], 0, true);
    }

    private void f(int i10) {
        if (i10 < 0 || i10 >= this.f8667c) {
            throw new IndexOutOfBoundsException(i(i10));
        }
    }

    private String i(int i10) {
        return "Index:" + i10 + ", Size:" + this.f8667c;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Integer> collection) {
        a();
        a0.a(collection);
        if (!(collection instanceof z)) {
            return super.addAll(collection);
        }
        z zVar = (z) collection;
        int i10 = zVar.f8667c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f8667c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        int[] iArr = this.b;
        if (i12 > iArr.length) {
            this.b = Arrays.copyOf(iArr, i12);
        }
        System.arraycopy(zVar.b, 0, this.b, this.f8667c, zVar.f8667c);
        this.f8667c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void add(int i10, Integer num) {
        e(i10, num.intValue());
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean add(Integer num) {
        d(num.intValue());
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public void d(int i10) {
        a();
        int i11 = this.f8667c;
        int[] iArr = this.b;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[((i11 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            this.b = iArr2;
        }
        int[] iArr3 = this.b;
        int i12 = this.f8667c;
        this.f8667c = i12 + 1;
        iArr3[i12] = i10;
    }

    public final void e(int i10, int i11) {
        int i12;
        a();
        if (i10 < 0 || i10 > (i12 = this.f8667c)) {
            throw new IndexOutOfBoundsException(i(i10));
        }
        int[] iArr = this.b;
        if (i12 < iArr.length) {
            System.arraycopy(iArr, i10, iArr, i10 + 1, i12 - i10);
        } else {
            int[] iArr2 = new int[((i12 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            System.arraycopy(this.b, i10, iArr2, i10 + 1, this.f8667c - i10);
            this.b = iArr2;
        }
        this.b[i10] = i11;
        this.f8667c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return super.equals(obj);
        }
        z zVar = (z) obj;
        if (this.f8667c != zVar.f8667c) {
            return false;
        }
        int[] iArr = zVar.b;
        for (int i10 = 0; i10 < this.f8667c; i10++) {
            if (this.b[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public Integer get(int i10) {
        return Integer.valueOf(h(i10));
    }

    public int h(int i10) {
        f(i10);
        return this.b[i10];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f8667c; i11++) {
            i10 = (i10 * 31) + this.b[i11];
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.b[i10] == iIntValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a0.i
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public a0.g o(int i10) {
        if (i10 >= this.f8667c) {
            return new z(Arrays.copyOf(this.b, i10), this.f8667c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public Integer remove(int i10) {
        a();
        f(i10);
        int[] iArr = this.b;
        int i11 = iArr[i10];
        int i12 = this.f8667c;
        if (i10 < i12 - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (i12 - i10) - 1);
        }
        this.f8667c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public Integer set(int i10, Integer num) {
        return Integer.valueOf(p(i10, num.intValue()));
    }

    public int p(int i10, int i11) {
        a();
        f(i10);
        int[] iArr = this.b;
        int i12 = iArr[i10];
        iArr[i10] = i11;
        return i12;
    }

    @Override // java.util.AbstractList
    public void removeRange(int i10, int i11) {
        a();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.b;
        System.arraycopy(iArr, i11, iArr, i10, this.f8667c - i11);
        this.f8667c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f8667c;
    }

    public z(int[] iArr, int i10, boolean z10) {
        super(z10);
        this.b = iArr;
        this.f8667c = i10;
    }
}
