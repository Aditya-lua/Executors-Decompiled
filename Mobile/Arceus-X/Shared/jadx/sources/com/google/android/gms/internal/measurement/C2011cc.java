package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.cc */
/* JADX INFO: loaded from: classes.dex */
public final class C2011cc extends AbstractC2319t9 implements RandomAccess, InterfaceC2231ob, InterfaceC2358vc {

    /* JADX INFO: renamed from: d */
    public static final long[] f8132d;

    /* JADX INFO: renamed from: e */
    public static final C2011cc f8133e;

    /* JADX INFO: renamed from: b */
    public long[] f8134b;

    /* JADX INFO: renamed from: c */
    public int f8135c;

    static {
        long[] jArr = new long[0];
        f8132d = jArr;
        f8133e = new C2011cc(jArr, 0, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2011cc() {
        this(f8132d, 0, true);
    }

    /* JADX INFO: renamed from: b */
    public static C2011cc m9885b() {
        return f8133e;
    }

    /* JADX INFO: renamed from: d */
    private static int m9886d(int i10) {
        return Math.max(((i10 * 3) / 2) + 1, 10);
    }

    /* JADX INFO: renamed from: e */
    private final void m9887e(int i10) {
        if (i10 < 0 || i10 >= this.f8135c) {
            throw new IndexOutOfBoundsException(m9888f(i10));
        }
    }

    /* JADX INFO: renamed from: f */
    private final String m9888f(int i10) {
        return C2355v9.m10853a(this.f8135c, i10, (byte) 13, "Index:", ", Size:");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        long jLongValue = ((Long) obj).longValue();
        m10768a();
        if (i10 < 0 || i10 > (i11 = this.f8135c)) {
            throw new IndexOutOfBoundsException(m9888f(i10));
        }
        int i12 = i10 + 1;
        long[] jArr = this.f8134b;
        int length = jArr.length;
        if (i11 < length) {
            System.arraycopy(jArr, i10, jArr, i12, i11 - i10);
        } else {
            long[] jArr2 = new long[m9886d(length)];
            System.arraycopy(this.f8134b, 0, jArr2, 0, i10);
            System.arraycopy(this.f8134b, i10, jArr2, i12, this.f8135c - i10);
            this.f8134b = jArr2;
        }
        this.f8134b[i10] = jLongValue;
        this.f8135c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2319t9, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m10768a();
        Charset charset = C2267qb.f8595a;
        collection.getClass();
        if (!(collection instanceof C2011cc)) {
            return super.addAll(collection);
        }
        C2011cc c2011cc = (C2011cc) collection;
        int i10 = c2011cc.f8135c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f8135c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        long[] jArr = this.f8134b;
        if (i12 > jArr.length) {
            this.f8134b = Arrays.copyOf(jArr, i12);
        }
        System.arraycopy(c2011cc.f8134b, 0, this.f8134b, this.f8135c, c2011cc.f8135c);
        this.f8135c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final void m9889c(long j10) {
        m10768a();
        int i10 = this.f8135c;
        int length = this.f8134b.length;
        if (i10 == length) {
            long[] jArr = new long[m9886d(length)];
            System.arraycopy(this.f8134b, 0, jArr, 0, this.f8135c);
            this.f8134b = jArr;
        }
        long[] jArr2 = this.f8134b;
        int i11 = this.f8135c;
        this.f8135c = i11 + 1;
        jArr2[i11] = j10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2319t9, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2011cc)) {
            return super.equals(obj);
        }
        C2011cc c2011cc = (C2011cc) obj;
        if (this.f8135c != c2011cc.f8135c) {
            return false;
        }
        long[] jArr = c2011cc.f8134b;
        for (int i10 = 0; i10 < this.f8135c; i10++) {
            if (this.f8134b[i10] != jArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        m9887e(i10);
        return Long.valueOf(this.f8134b[i10]);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2319t9, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f8135c; i11++) {
            long j10 = this.f8134b[i11];
            Charset charset = C2267qb.f8595a;
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
        int i10 = this.f8135c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f8134b[i11] == jLongValue) {
                return i11;
            }
        }
        return -1;
    }

    /* JADX DEBUG: Method merged with bridge method: v(I)Lcom/google/android/gms/internal/measurement/pb; */
    @Override // com.google.android.gms.internal.measurement.InterfaceC2249pb
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final InterfaceC2231ob mo9891v(int i10) {
        if (i10 >= this.f8135c) {
            return new C2011cc(i10 == 0 ? f8132d : Arrays.copyOf(this.f8134b, i10), this.f8135c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2319t9, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        m10768a();
        m9887e(i10);
        long[] jArr = this.f8134b;
        long j10 = jArr[i10];
        int i11 = this.f8135c;
        if (i10 < i11 - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (i11 - i10) - 1);
        }
        this.f8135c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        m10768a();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f8134b;
        System.arraycopy(jArr, i11, jArr, i10, this.f8135c - i11);
        this.f8135c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        m10768a();
        m9887e(i10);
        long[] jArr = this.f8134b;
        long j10 = jArr[i10];
        jArr[i10] = jLongValue;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f8135c;
    }

    /* JADX INFO: renamed from: w */
    public final void m9892w(int i10) {
        int length = this.f8134b.length;
        if (i10 <= length) {
            return;
        }
        if (length == 0) {
            this.f8134b = new long[Math.max(i10, 10)];
            return;
        }
        while (length < i10) {
            length = m9886d(length);
        }
        this.f8134b = Arrays.copyOf(this.f8134b, length);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2231ob
    /* JADX INFO: renamed from: x0 */
    public final long mo9893x0(int i10) {
        m9887e(i10);
        return this.f8134b[i10];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C2011cc(long[] jArr, int i10, boolean z10) {
        super(z10);
        this.f8134b = jArr;
        this.f8135c = i10;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m9889c(((Long) obj).longValue());
        return true;
    }
}
