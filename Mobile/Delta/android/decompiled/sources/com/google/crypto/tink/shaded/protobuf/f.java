package com.google.crypto.tink.shaded.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class f extends c<Boolean> implements a0.a, RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f f8434d = new f(new boolean[0], 0, false);
    public boolean[] b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f8435c;

    public f() {
        this(new boolean[10], 0, true);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Boolean> collection) {
        a();
        a0.a(collection);
        if (!(collection instanceof f)) {
            return super.addAll(collection);
        }
        f fVar = (f) collection;
        int i10 = fVar.f8435c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f8435c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        boolean[] zArr = this.b;
        if (i12 > zArr.length) {
            this.b = Arrays.copyOf(zArr, i12);
        }
        System.arraycopy(fVar.b, 0, this.b, this.f8435c, fVar.f8435c);
        this.f8435c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void add(int i10, Boolean bool) {
        d(i10, bool.booleanValue());
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean add(Boolean bool) {
        e(bool.booleanValue());
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i10, boolean z10) {
        int i11;
        a();
        if (i10 < 0 || i10 > (i11 = this.f8435c)) {
            throw new IndexOutOfBoundsException(i(i10));
        }
        boolean[] zArr = this.b;
        if (i11 < zArr.length) {
            System.arraycopy(zArr, i10, zArr, i10 + 1, i11 - i10);
        } else {
            boolean[] zArr2 = new boolean[((i11 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            System.arraycopy(this.b, i10, zArr2, i10 + 1, this.f8435c - i10);
            this.b = zArr2;
        }
        this.b[i10] = z10;
        this.f8435c++;
        ((AbstractList) this).modCount++;
    }

    public void e(boolean z10) {
        a();
        int i10 = this.f8435c;
        boolean[] zArr = this.b;
        if (i10 == zArr.length) {
            boolean[] zArr2 = new boolean[((i10 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            this.b = zArr2;
        }
        boolean[] zArr3 = this.b;
        int i11 = this.f8435c;
        this.f8435c = i11 + 1;
        zArr3[i11] = z10;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return super.equals(obj);
        }
        f fVar = (f) obj;
        if (this.f8435c != fVar.f8435c) {
            return false;
        }
        boolean[] zArr = fVar.b;
        for (int i10 = 0; i10 < this.f8435c; i10++) {
            if (this.b[i10] != zArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public final void f(int i10) {
        if (i10 < 0 || i10 >= this.f8435c) {
            throw new IndexOutOfBoundsException(i(i10));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public Boolean get(int i10) {
        return Boolean.valueOf(h(i10));
    }

    public boolean h(int i10) {
        f(i10);
        return this.b[i10];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iC = 1;
        for (int i10 = 0; i10 < this.f8435c; i10++) {
            iC = (iC * 31) + a0.c(this.b[i10]);
        }
        return iC;
    }

    public final String i(int i10) {
        return "Index:" + i10 + ", Size:" + this.f8435c;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.b[i10] == zBooleanValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a0.i
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public a0.a o(int i10) {
        if (i10 >= this.f8435c) {
            return new f(Arrays.copyOf(this.b, i10), this.f8435c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public Boolean remove(int i10) {
        a();
        f(i10);
        boolean[] zArr = this.b;
        boolean z10 = zArr[i10];
        int i11 = this.f8435c;
        if (i10 < i11 - 1) {
            System.arraycopy(zArr, i10 + 1, zArr, i10, (i11 - i10) - 1);
        }
        this.f8435c--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public Boolean set(int i10, Boolean bool) {
        return Boolean.valueOf(p(i10, bool.booleanValue()));
    }

    public boolean p(int i10, boolean z10) {
        a();
        f(i10);
        boolean[] zArr = this.b;
        boolean z11 = zArr[i10];
        zArr[i10] = z10;
        return z11;
    }

    @Override // java.util.AbstractList
    public void removeRange(int i10, int i11) {
        a();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.b;
        System.arraycopy(zArr, i11, zArr, i10, this.f8435c - i11);
        this.f8435c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f8435c;
    }

    public f(boolean[] zArr, int i10, boolean z10) {
        super(z10);
        this.b = zArr;
        this.f8435c = i10;
    }
}
