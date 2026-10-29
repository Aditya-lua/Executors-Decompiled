package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.i0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0847i0 extends AbstractC0828c<Long> implements C0892z.e, RandomAccess, InterfaceC0824a1 {

    /* JADX INFO: renamed from: d */
    public static final C0847i0 f2896d = new C0847i0(new long[0], 0, false);

    /* JADX INFO: renamed from: b */
    public long[] f2897b;

    /* JADX INFO: renamed from: c */
    public int f2898c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0847i0() {
        this(new long[10], 0, true);
    }

    /* JADX INFO: renamed from: f */
    private void m3558f(int i10) {
        if (i10 < 0 || i10 >= this.f2898c) {
            throw new IndexOutOfBoundsException(m3559i(i10));
        }
    }

    /* JADX INFO: renamed from: i */
    private String m3559i(int i10) {
        return "Index:" + i10 + ", Size:" + this.f2898c;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0828c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Long> collection) {
        m3358a();
        C0892z.m4236a(collection);
        if (!(collection instanceof C0847i0)) {
            return super.addAll(collection);
        }
        C0847i0 c0847i0 = (C0847i0) collection;
        int i10 = c0847i0.f2898c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f2898c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        long[] jArr = this.f2897b;
        if (i12 > jArr.length) {
            this.f2897b = Arrays.copyOf(jArr, i12);
        }
        System.arraycopy(c0847i0.f2897b, 0, this.f2897b, this.f2898c, c0847i0.f2898c);
        this.f2898c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* JADX DEBUG: Method merged with bridge method: add(ILjava/lang/Object;)V */
    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void add(int i10, Long l10) {
        m3562d(i10, l10.longValue());
    }

    /* JADX DEBUG: Method merged with bridge method: add(Ljava/lang/Object;)Z */
    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean add(Long l10) {
        m3563e(l10.longValue());
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* JADX INFO: renamed from: d */
    public final void m3562d(int i10, long j10) {
        int i11;
        m3358a();
        if (i10 < 0 || i10 > (i11 = this.f2898c)) {
            throw new IndexOutOfBoundsException(m3559i(i10));
        }
        long[] jArr = this.f2897b;
        if (i11 < jArr.length) {
            System.arraycopy(jArr, i10, jArr, i10 + 1, i11 - i10);
        } else {
            long[] jArr2 = new long[((i11 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            System.arraycopy(this.f2897b, i10, jArr2, i10 + 1, this.f2898c - i10);
            this.f2897b = jArr2;
        }
        this.f2897b[i10] = j10;
        this.f2898c++;
        ((AbstractList) this).modCount++;
    }

    /* JADX INFO: renamed from: e */
    public void m3563e(long j10) {
        m3358a();
        int i10 = this.f2898c;
        long[] jArr = this.f2897b;
        if (i10 == jArr.length) {
            long[] jArr2 = new long[((i10 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            this.f2897b = jArr2;
        }
        long[] jArr3 = this.f2897b;
        int i11 = this.f2898c;
        this.f2898c = i11 + 1;
        jArr3[i11] = j10;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0828c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0847i0)) {
            return super.equals(obj);
        }
        C0847i0 c0847i0 = (C0847i0) obj;
        if (this.f2898c != c0847i0.f2898c) {
            return false;
        }
        long[] jArr = c0847i0.f2897b;
        for (int i10 = 0; i10 < this.f2898c; i10++) {
            if (this.f2897b[i10] != jArr[i10]) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Method merged with bridge method: get(I)Ljava/lang/Object; */
    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public Long get(int i10) {
        return Long.valueOf(m3565h(i10));
    }

    /* JADX INFO: renamed from: h */
    public long m3565h(int i10) {
        m3558f(i10);
        return this.f2897b[i10];
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0828c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iM4241f = 1;
        for (int i10 = 0; i10 < this.f2898c; i10++) {
            iM4241f = (iM4241f * 31) + C0892z.m4241f(this.f2897b[i10]);
        }
        return iM4241f;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f2897b[i10] == jLongValue) {
                return i10;
            }
        }
        return -1;
    }

    /* JADX DEBUG: Method merged with bridge method: o(I)Landroidx/datastore/preferences/protobuf/z$f; */
    @Override // androidx.datastore.preferences.protobuf.C0892z.f
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public C0892z.e mo3381o(int i10) {
        if (i10 >= this.f2898c) {
            return new C0847i0(Arrays.copyOf(this.f2897b, i10), this.f2898c, true);
        }
        throw new IllegalArgumentException();
    }

    /* JADX DEBUG: Method merged with bridge method: remove(I)Ljava/lang/Object; */
    @Override // androidx.datastore.preferences.protobuf.AbstractC0828c, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public Long remove(int i10) {
        m3358a();
        m3558f(i10);
        long[] jArr = this.f2897b;
        long j10 = jArr[i10];
        int i11 = this.f2898c;
        if (i10 < i11 - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (i11 - i10) - 1);
        }
        this.f2898c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j10);
    }

    /* JADX DEBUG: Method merged with bridge method: set(ILjava/lang/Object;)Ljava/lang/Object; */
    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public Long set(int i10, Long l10) {
        return Long.valueOf(m3569p(i10, l10.longValue()));
    }

    /* JADX INFO: renamed from: p */
    public long m3569p(int i10, long j10) {
        m3358a();
        m3558f(i10);
        long[] jArr = this.f2897b;
        long j11 = jArr[i10];
        jArr[i10] = j10;
        return j11;
    }

    @Override // java.util.AbstractList
    public void removeRange(int i10, int i11) {
        m3358a();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f2897b;
        System.arraycopy(jArr, i11, jArr, i10, this.f2898c - i11);
        this.f2898c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f2898c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C0847i0(long[] jArr, int i10, boolean z10) {
        super(z10);
        this.f2897b = jArr;
        this.f2898c = i10;
    }
}
