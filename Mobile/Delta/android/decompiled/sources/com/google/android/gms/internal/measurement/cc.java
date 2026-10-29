package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class cc extends t9 implements RandomAccess, ob, vc {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long[] f6404d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final cc f6405e;
    public long[] b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6406c;

    static {
        long[] jArr = new long[0];
        f6404d = jArr;
        f6405e = new cc(jArr, 0, false);
    }

    public cc() {
        this(f6404d, 0, true);
    }

    public static cc b() {
        return f6405e;
    }

    private static int d(int i10) {
        return Math.max(((i10 * 3) / 2) + 1, 10);
    }

    private final void e(int i10) {
        if (i10 < 0 || i10 >= this.f6406c) {
            throw new IndexOutOfBoundsException(f(i10));
        }
    }

    private final String f(int i10) {
        return v9.a(this.f6406c, i10, (byte) 13, "Index:", ", Size:");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        long jLongValue = ((Long) obj).longValue();
        a();
        if (i10 < 0 || i10 > (i11 = this.f6406c)) {
            throw new IndexOutOfBoundsException(f(i10));
        }
        int i12 = i10 + 1;
        long[] jArr = this.b;
        int length = jArr.length;
        if (i11 < length) {
            System.arraycopy(jArr, i10, jArr, i12, i11 - i10);
        } else {
            long[] jArr2 = new long[d(length)];
            System.arraycopy(this.b, 0, jArr2, 0, i10);
            System.arraycopy(this.b, i10, jArr2, i12, this.f6406c - i10);
            this.b = jArr2;
        }
        this.b[i10] = jLongValue;
        this.f6406c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.t9, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        Charset charset = qb.f6750a;
        collection.getClass();
        if (!(collection instanceof cc)) {
            return super.addAll(collection);
        }
        cc ccVar = (cc) collection;
        int i10 = ccVar.f6406c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f6406c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        long[] jArr = this.b;
        if (i12 > jArr.length) {
            this.b = Arrays.copyOf(jArr, i12);
        }
        System.arraycopy(ccVar.b, 0, this.b, this.f6406c, ccVar.f6406c);
        this.f6406c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void c(long j10) {
        a();
        int i10 = this.f6406c;
        int length = this.b.length;
        if (i10 == length) {
            long[] jArr = new long[d(length)];
            System.arraycopy(this.b, 0, jArr, 0, this.f6406c);
            this.b = jArr;
        }
        long[] jArr2 = this.b;
        int i11 = this.f6406c;
        this.f6406c = i11 + 1;
        jArr2[i11] = j10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.measurement.t9, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cc)) {
            return super.equals(obj);
        }
        cc ccVar = (cc) obj;
        if (this.f6406c != ccVar.f6406c) {
            return false;
        }
        long[] jArr = ccVar.b;
        for (int i10 = 0; i10 < this.f6406c; i10++) {
            if (this.b[i10] != jArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        e(i10);
        return Long.valueOf(this.b[i10]);
    }

    @Override // com.google.android.gms.internal.measurement.t9, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f6406c; i11++) {
            long j10 = this.b[i11];
            Charset charset = qb.f6750a;
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
        int i10 = this.f6406c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.b[i11] == jLongValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.pb
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final ob v(int i10) {
        if (i10 >= this.f6406c) {
            return new cc(i10 == 0 ? f6404d : Arrays.copyOf(this.b, i10), this.f6406c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.measurement.t9, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        a();
        e(i10);
        long[] jArr = this.b;
        long j10 = jArr[i10];
        int i11 = this.f6406c;
        if (i10 < i11 - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (i11 - i10) - 1);
        }
        this.f6406c--;
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
        System.arraycopy(jArr, i11, jArr, i10, this.f6406c - i11);
        this.f6406c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        a();
        e(i10);
        long[] jArr = this.b;
        long j10 = jArr[i10];
        jArr[i10] = jLongValue;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f6406c;
    }

    public final void w(int i10) {
        int length = this.b.length;
        if (i10 <= length) {
            return;
        }
        if (length == 0) {
            this.b = new long[Math.max(i10, 10)];
            return;
        }
        while (length < i10) {
            length = d(length);
        }
        this.b = Arrays.copyOf(this.b, length);
    }

    @Override // com.google.android.gms.internal.measurement.ob
    public final long x0(int i10) {
        e(i10);
        return this.b[i10];
    }

    public cc(long[] jArr, int i10, boolean z10) {
        super(z10);
        this.b = jArr;
        this.f6406c = i10;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        c(((Long) obj).longValue());
        return true;
    }
}
