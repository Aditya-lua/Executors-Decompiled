package com.google.android.gms.internal.play_billing;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.l5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2565l5 extends AbstractC2475d3 implements RandomAccess, InterfaceC2707y4 {

    /* JADX INFO: renamed from: d */
    public static final long[] f9149d;

    /* JADX INFO: renamed from: b */
    public long[] f9150b;

    /* JADX INFO: renamed from: c */
    public int f9151c;

    static {
        long[] jArr = new long[0];
        f9149d = jArr;
        new C2565l5(jArr, 0, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2565l5() {
        this(f9149d, 0, true);
    }

    /* JADX INFO: renamed from: f */
    private static int m11535f(int i10) {
        return Math.max(((i10 * 3) / 2) + 1, 10);
    }

    /* JADX INFO: renamed from: g */
    private final String m11536g(int i10) {
        return "Index:" + i10 + ", Size:" + this.f9151c;
    }

    /* JADX INFO: renamed from: h */
    private final void m11537h(int i10) {
        if (i10 < 0 || i10 >= this.f9151c) {
            throw new IndexOutOfBoundsException(m11536g(i10));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        long jLongValue = ((Long) obj).longValue();
        m11358a();
        if (i10 < 0 || i10 > (i11 = this.f9151c)) {
            throw new IndexOutOfBoundsException(m11536g(i10));
        }
        int i12 = i10 + 1;
        long[] jArr = this.f9150b;
        int length = jArr.length;
        if (i11 < length) {
            System.arraycopy(jArr, i10, jArr, i12, i11 - i10);
        } else {
            long[] jArr2 = new long[m11535f(length)];
            System.arraycopy(this.f9150b, 0, jArr2, 0, i10);
            System.arraycopy(this.f9150b, i10, jArr2, i12, this.f9151c - i10);
            this.f9150b = jArr2;
        }
        this.f9150b[i10] = jLongValue;
        this.f9151c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2475d3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m11358a();
        collection.getClass();
        if (!(collection instanceof C2565l5)) {
            return super.addAll(collection);
        }
        C2565l5 c2565l5 = (C2565l5) collection;
        int i10 = c2565l5.f9151c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f9151c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        long[] jArr = this.f9150b;
        if (i12 > jArr.length) {
            this.f9150b = Arrays.copyOf(jArr, i12);
        }
        System.arraycopy(c2565l5.f9150b, 0, this.f9150b, this.f9151c, c2565l5.f9151c);
        this.f9151c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final long m11538c(int i10) {
        m11537h(i10);
        return this.f9150b[i10];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* JADX INFO: renamed from: d */
    public final void m11539d(long j10) {
        m11358a();
        int i10 = this.f9151c;
        int length = this.f9150b.length;
        if (i10 == length) {
            long[] jArr = new long[m11535f(length)];
            System.arraycopy(this.f9150b, 0, jArr, 0, this.f9151c);
            this.f9150b = jArr;
        }
        long[] jArr2 = this.f9150b;
        int i11 = this.f9151c;
        this.f9151c = i11 + 1;
        jArr2[i11] = j10;
    }

    /* JADX INFO: renamed from: e */
    public final void m11540e(int i10) {
        int length = this.f9150b.length;
        if (i10 <= length) {
            return;
        }
        if (length == 0) {
            this.f9150b = new long[Math.max(i10, 10)];
            return;
        }
        while (length < i10) {
            length = m11535f(length);
        }
        this.f9150b = Arrays.copyOf(this.f9150b, length);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2475d3, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2565l5)) {
            return super.equals(obj);
        }
        C2565l5 c2565l5 = (C2565l5) obj;
        if (this.f9151c != c2565l5.f9151c) {
            return false;
        }
        long[] jArr = c2565l5.f9150b;
        for (int i10 = 0; i10 < this.f9151c; i10++) {
            if (this.f9150b[i10] != jArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        m11537h(i10);
        return Long.valueOf(this.f9150b[i10]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f9151c; i11++) {
            long j10 = this.f9150b[i11];
            byte[] bArr = C2718z4.f9432a;
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
        int i10 = this.f9151c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f9150b[i11] == jLongValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2707y4
    /* JADX INFO: renamed from: r */
    public final /* bridge */ /* synthetic */ InterfaceC2707y4 mo11340r(int i10) {
        if (i10 >= this.f9151c) {
            return new C2565l5(i10 == 0 ? f9149d : Arrays.copyOf(this.f9150b, i10), this.f9151c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2475d3, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        m11358a();
        m11537h(i10);
        long[] jArr = this.f9150b;
        long j10 = jArr[i10];
        int i11 = this.f9151c;
        if (i10 < i11 - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (i11 - i10) - 1);
        }
        this.f9151c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        m11358a();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f9150b;
        System.arraycopy(jArr, i11, jArr, i10, this.f9151c - i11);
        this.f9151c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        m11358a();
        m11537h(i10);
        long[] jArr = this.f9150b;
        long j10 = jArr[i10];
        jArr[i10] = jLongValue;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f9151c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C2565l5(long[] jArr, int i10, boolean z10) {
        super(z10);
        this.f9150b = jArr;
        this.f9151c = i10;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m11539d(((Long) obj).longValue());
        return true;
    }
}
