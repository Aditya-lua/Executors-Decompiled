package com.google.crypto.tink.shaded.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class j0 extends c<Long> implements a0.h, RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final j0 f8473d = new j0(new long[0], 0, false);
    public long[] b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f8474c;

    public j0() {
        this(new long[10], 0, true);
    }

    private void f(int i10) {
        if (i10 < 0 || i10 >= this.f8474c) {
            throw new IndexOutOfBoundsException(i(i10));
        }
    }

    private String i(int i10) {
        return "Index:" + i10 + ", Size:" + this.f8474c;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Long> collection) {
        a();
        a0.a(collection);
        if (!(collection instanceof j0)) {
            return super.addAll(collection);
        }
        j0 j0Var = (j0) collection;
        int i10 = j0Var.f8474c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f8474c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        long[] jArr = this.b;
        if (i12 > jArr.length) {
            this.b = Arrays.copyOf(jArr, i12);
        }
        System.arraycopy(j0Var.b, 0, this.b, this.f8474c, j0Var.f8474c);
        this.f8474c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void add(int i10, Long l10) {
        d(i10, l10.longValue());
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean add(Long l10) {
        e(l10.longValue());
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i10, long j10) {
        int i11;
        a();
        if (i10 < 0 || i10 > (i11 = this.f8474c)) {
            throw new IndexOutOfBoundsException(i(i10));
        }
        long[] jArr = this.b;
        if (i11 < jArr.length) {
            System.arraycopy(jArr, i10, jArr, i10 + 1, i11 - i10);
        } else {
            long[] jArr2 = new long[((i11 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            System.arraycopy(this.b, i10, jArr2, i10 + 1, this.f8474c - i10);
            this.b = jArr2;
        }
        this.b[i10] = j10;
        this.f8474c++;
        ((AbstractList) this).modCount++;
    }

    public void e(long j10) {
        a();
        int i10 = this.f8474c;
        long[] jArr = this.b;
        if (i10 == jArr.length) {
            long[] jArr2 = new long[((i10 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            this.b = jArr2;
        }
        long[] jArr3 = this.b;
        int i11 = this.f8474c;
        this.f8474c = i11 + 1;
        jArr3[i11] = j10;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return super.equals(obj);
        }
        j0 j0Var = (j0) obj;
        if (this.f8474c != j0Var.f8474c) {
            return false;
        }
        long[] jArr = j0Var.b;
        for (int i10 = 0; i10 < this.f8474c; i10++) {
            if (this.b[i10] != jArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public Long get(int i10) {
        return Long.valueOf(h(i10));
    }

    public long h(int i10) {
        f(i10);
        return this.b[i10];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iF = 1;
        for (int i10 = 0; i10 < this.f8474c; i10++) {
            iF = (iF * 31) + a0.f(this.b[i10]);
        }
        return iF;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.b[i10] == jLongValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a0.i
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public a0.h o(int i10) {
        if (i10 >= this.f8474c) {
            return new j0(Arrays.copyOf(this.b, i10), this.f8474c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public Long remove(int i10) {
        a();
        f(i10);
        long[] jArr = this.b;
        long j10 = jArr[i10];
        int i11 = this.f8474c;
        if (i10 < i11 - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (i11 - i10) - 1);
        }
        this.f8474c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public Long set(int i10, Long l10) {
        return Long.valueOf(p(i10, l10.longValue()));
    }

    public long p(int i10, long j10) {
        a();
        f(i10);
        long[] jArr = this.b;
        long j11 = jArr[i10];
        jArr[i10] = j10;
        return j11;
    }

    @Override // java.util.AbstractList
    public void removeRange(int i10, int i11) {
        a();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.b;
        System.arraycopy(jArr, i11, jArr, i10, this.f8474c - i11);
        this.f8474c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f8474c;
    }

    public j0(long[] jArr, int i10, boolean z10) {
        super(z10);
        this.b = jArr;
        this.f8474c = i10;
    }
}
