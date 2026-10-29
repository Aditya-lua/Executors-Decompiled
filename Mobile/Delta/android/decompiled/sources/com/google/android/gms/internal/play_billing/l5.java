package com.google.android.gms.internal.play_billing;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class l5 extends d3 implements RandomAccess, y4 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long[] f7174d;
    public long[] b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f7175c;

    static {
        long[] jArr = new long[0];
        f7174d = jArr;
        new l5(jArr, 0, false);
    }

    public l5() {
        this(f7174d, 0, true);
    }

    private static int f(int i10) {
        return Math.max(((i10 * 3) / 2) + 1, 10);
    }

    private final String g(int i10) {
        return "Index:" + i10 + ", Size:" + this.f7175c;
    }

    private final void h(int i10) {
        if (i10 < 0 || i10 >= this.f7175c) {
            throw new IndexOutOfBoundsException(g(i10));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        long jLongValue = ((Long) obj).longValue();
        a();
        if (i10 < 0 || i10 > (i11 = this.f7175c)) {
            throw new IndexOutOfBoundsException(g(i10));
        }
        int i12 = i10 + 1;
        long[] jArr = this.b;
        int length = jArr.length;
        if (i11 < length) {
            System.arraycopy(jArr, i10, jArr, i12, i11 - i10);
        } else {
            long[] jArr2 = new long[f(length)];
            System.arraycopy(this.b, 0, jArr2, 0, i10);
            System.arraycopy(this.b, i10, jArr2, i12, this.f7175c - i10);
            this.b = jArr2;
        }
        this.b[i10] = jLongValue;
        this.f7175c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.d3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        collection.getClass();
        if (!(collection instanceof l5)) {
            return super.addAll(collection);
        }
        l5 l5Var = (l5) collection;
        int i10 = l5Var.f7175c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f7175c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        long[] jArr = this.b;
        if (i12 > jArr.length) {
            this.b = Arrays.copyOf(jArr, i12);
        }
        System.arraycopy(l5Var.b, 0, this.b, this.f7175c, l5Var.f7175c);
        this.f7175c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final long c(int i10) {
        h(i10);
        return this.b[i10];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(long j10) {
        a();
        int i10 = this.f7175c;
        int length = this.b.length;
        if (i10 == length) {
            long[] jArr = new long[f(length)];
            System.arraycopy(this.b, 0, jArr, 0, this.f7175c);
            this.b = jArr;
        }
        long[] jArr2 = this.b;
        int i11 = this.f7175c;
        this.f7175c = i11 + 1;
        jArr2[i11] = j10;
    }

    public final void e(int i10) {
        int length = this.b.length;
        if (i10 <= length) {
            return;
        }
        if (length == 0) {
            this.b = new long[Math.max(i10, 10)];
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
        if (!(obj instanceof l5)) {
            return super.equals(obj);
        }
        l5 l5Var = (l5) obj;
        if (this.f7175c != l5Var.f7175c) {
            return false;
        }
        long[] jArr = l5Var.b;
        for (int i10 = 0; i10 < this.f7175c; i10++) {
            if (this.b[i10] != jArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        h(i10);
        return Long.valueOf(this.b[i10]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f7175c; i11++) {
            long j10 = this.b[i11];
            byte[] bArr = z4.f7356a;
            i10 = (i10 * 31) + ((int) (j10 ^ (j10 >>> 32)));
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i10 = this.f7175c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.b[i11] == jLongValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.play_billing.y4
    public final /* bridge */ /* synthetic */ y4 r(int i10) {
        if (i10 >= this.f7175c) {
            return new l5(i10 == 0 ? f7174d : Arrays.copyOf(this.b, i10), this.f7175c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.play_billing.d3, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        a();
        h(i10);
        long[] jArr = this.b;
        long j10 = jArr[i10];
        int i11 = this.f7175c;
        if (i10 < i11 - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (i11 - i10) - 1);
        }
        this.f7175c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        a();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.b;
        System.arraycopy(jArr, i11, jArr, i10, this.f7175c - i11);
        this.f7175c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        a();
        h(i10);
        long[] jArr = this.b;
        long j10 = jArr[i10];
        jArr[i10] = jLongValue;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f7175c;
    }

    public l5(long[] jArr, int i10, boolean z10) {
        super(z10);
        this.b = jArr;
        this.f7175c = i10;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        d(((Long) obj).longValue());
        return true;
    }
}
